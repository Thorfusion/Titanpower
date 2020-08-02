import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StringUtils;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Client-side tick handler for Mekanism. Used mainly for the update check upon startup.
 * @author AidanBrady
 *
 */
@SideOnly(Side.CLIENT)
public class ClientTickHandler
{
	public boolean hasNotified = false;
	public boolean initHoliday = false;

	public boolean preloadedSounds = false;

	public boolean lastTickUpdate;

	public boolean shouldReset = false;

	public static Minecraft mc = FMLClientHandler.instance().getClient();

	public static final String DONATE_CAPE = "http://aidancbrady.com/data/capes/donate.png";
	public static final String AIDAN_CAPE = "http://aidancbrady.com/data/capes/aidan.png";

	private Map<String, CapeBufferDownload> donateDownload = new HashMap<String, CapeBufferDownload>();
	private Map<String, CapeBufferDownload> aidanDownload = new HashMap<String, CapeBufferDownload>();

	public static Set<IClientTicker> tickingSet = new HashSet<IClientTicker>();

	@SubscribeEvent
	public void onTick(ClientTickEvent event)
	{
		if(event.phase == Phase.START)
		{
			tickStart();
		}
	}

	public void tickStart()
	{
		MekanismClient.ticksPassed++;

		if(!Mekanism.proxy.isPaused())
		{
			for(Iterator<IClientTicker> iter = tickingSet.iterator(); iter.hasNext();)
			{
				IClientTicker ticker = iter.next();

				if(ticker.needsTicks())
				{
					ticker.clientTick();
				}
				else {
					iter.remove();
				}
			}
		}

		if(mc.theWorld != null)
		{
			shouldReset = true;
		}
		else if(shouldReset)
		{
			MekanismClient.reset();
			shouldReset = false;
		}

		if(mc.theWorld != null && !Mekanism.proxy.isPaused())
		{
			if((!initHoliday || MekanismClient.ticksPassed % 1200 == 0) && mc.thePlayer != null)
			{
				HolidayManager.check();
				initHoliday = true;
			}

			for(EntityPlayer entityPlayer : (List<EntityPlayer>)mc.theWorld.playerEntities)
			{
				if(entityPlayer instanceof AbstractClientPlayer)
				{
					AbstractClientPlayer player = (AbstractClientPlayer)entityPlayer;

					if(player != null)
					{
						if(StringUtils.stripControlCodes(player.getCommandSenderName()).equals("maggi373"))
						{
							CapeBufferDownload download = aidanDownload.get(player.getCommandSenderName());

							if(download == null)
							{
								download = new CapeBufferDownload(player.getCommandSenderName(), AIDAN_CAPE);
								aidanDownload.put(player.getCommandSenderName(), download);

								download.start();
							}
							else {
								if(!download.downloaded)
								{
									continue;
								}

								player.func_152121_a(MinecraftProfileTexture.Type.CAPE, download.getResourceLocation());
							}
						}
						else if(Mekanism.donators.contains(StringUtils.stripControlCodes(player.getCommandSenderName())))
						{
							CapeBufferDownload download = donateDownload.get(player.getCommandSenderName());

							if(download == null)
							{
								download = new CapeBufferDownload(player.getCommandSenderName(), DONATE_CAPE);
								donateDownload.put(player.getCommandSenderName(), download);

								download.start();
							}
							else {
								if(!download.downloaded)
								{
									continue;
								}

								player.func_152121_a(MinecraftProfileTexture.Type.CAPE, download.getResourceLocation());
							}
						}
					}
				}
			}	
		}
	}

	public static void killDeadNetworks()
	{
		for(Iterator<IClientTicker> iter = tickingSet.iterator(); iter.hasNext();)
		{
			if(!iter.next().needsTicks())
			{
				iter.remove();
			}
		}
	}

	

	
	
	
	
	
}