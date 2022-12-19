package me.daniel.BlockGame;


import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import me.daniel.PluginTools.EventsClass;

public class BlockGamePlugin extends JavaPlugin{
	
	public static Plugin plugin;
	
	@Override
	public void onEnable(){
		
		plugin = this;
		this.getCommand("startgame").setExecutor(new Commands());
		this.getCommand("skip").setExecutor(new Commands());
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
		
		}
	
	@Override
	public void onDisable() {
		Timer.removeAll();
		
	}
	
}
