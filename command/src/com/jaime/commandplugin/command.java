package com.jaime.commandplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class command extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("PLUGIN IS ENABLED!");
	}
	
	@Override
	public void onDisable() {
		System.out.println("PLUGIN IS DISABLED!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		
		if (cmd.getName().equals("Hello")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.DARK_RED + "Hello" + ChatColor.GREEN + player.getName() + ChatColor.AQUA + "Your heath has been restored");
				player.setHealth(20.0);
			}
		} else {
		System.out.println("You cannot use this command throught the console!");
		}
		return false;	 
	
	}
}
