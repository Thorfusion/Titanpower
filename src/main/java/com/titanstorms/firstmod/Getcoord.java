package com.titanstorms.firstmod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentTranslation;

public class Getcoord implements ICommand {

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
		commandA.add("superheal");
		return commandA;
	}

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "superheal";
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
	
			spiller.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(200);		
			spiller.setHealth(200);
			
		}

	}

}