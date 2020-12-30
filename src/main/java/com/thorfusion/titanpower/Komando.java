package com.thorfusion.titanpower;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.world.World;

public class Komando implements ICommand {

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender arg0, String[] arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender icommands) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List getCommandAliases() {
		List<String> commandA = new ArrayList();
		commandA.add("tzm");
		return commandA;
	}
	
	
	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "titan";
	}

	@Override
	public String getCommandUsage(ICommandSender icommands) {
		// TODO Auto-generated method stub
		return "Sorry, this command dosnt do much yet";
	}

	@Override
	public boolean isUsernameIndex(String[] arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void processCommand(ICommandSender icommands, String[] strings) {
		if (icommands instanceof EntityPlayer) {
			
			EntityPlayer spiller = (EntityPlayer) icommands;
			spiller.addChatMessage(new ChatComponentTranslation("msg.thorfusion.value"));
			//spiller.setPositionAndUpdate(64, 64, Random rand=new Random();
		    
		    spiller.setSprinting(true);
			
		}

	}

}
