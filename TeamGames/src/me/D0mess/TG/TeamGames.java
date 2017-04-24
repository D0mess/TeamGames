package me.D0mess.TG;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Logger;

import me.D0mess.TG.commands.EndStatsCommand;
import me.D0mess.TG.commands.SetupCommand;
import me.D0mess.TG.commands.StatsCommand;
import me.D0mess.TG.commands.ValueComperator;
import me.D0mess.TG.events.Death;
import me.D0mess.TG.events.Ignore;
import me.D0mess.TG.events.Interact;
import me.D0mess.TG.events.Join;
import me.D0mess.TG.events.Respawn;
import me.D0mess.TG.events.ServerListPing;
import me.D0mess.TG.gamemanagement.GameStage;
import me.D0mess.TG.gamemanagement.Manager;
import me.D0mess.TG.gamemanagement.ProfileStats;
import me.D0mess.TG.gui.SetupGame;
import me.D0mess.TG.gui.Spectator;
import me.D0mess.TG.gui.TeamSelector;
import me.D0mess.TG.gui.shop.SwordWarsShop;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class TeamGames extends JavaPlugin implements Listener {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Plugin plugin;
    public static TeamGames tg;
	      
    public static HashMap<String, String> messageData = new HashMap<String, String>();
    
	 public void onEnable()
	  {
		 tg = this;
		 
         File f = new File(getDataFolder()+File.separator+"messages.yml");
         if (!f.exists()) {
             try {
                 f.createNewFile();
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
         
         //fall

         FileConfiguration config = YamlConfiguration.loadConfiguration(f);
         for (String message : config.getConfigurationSection("").getKeys(false)) {
             messageData.put(message, config.getString(message));
         }
         saveDefaultConfig();

         Messages.load_msg();
         
         ProfileStats.stats_per_game_load();
         
	   	 Manager.setStage(GameStage.LOBBY);

		 getServer().getPluginManager().registerEvents(new Join(), this);
		 getServer().getPluginManager().registerEvents(new Interact(), this);
		 getServer().getPluginManager().registerEvents(new Death(), this);
		 getServer().getPluginManager().registerEvents(new Respawn(), this);
		 getServer().getPluginManager().registerEvents(new Ignore(), this);
         getServer().getPluginManager().registerEvents(new ServerListPing(), this);
		 
		 getServer().getPluginManager().registerEvents(new TeamSelector(), this);
		 getServer().getPluginManager().registerEvents(new SetupGame(), this);
		 getServer().getPluginManager().registerEvents(new Spectator(), this);
		 getServer().getPluginManager().registerEvents(new SwordWarsShop(), this);

		 getCommand("teamgames").setExecutor(new SetupCommand());
		 getCommand("stats").setExecutor(new StatsCommand());
		 getCommand("endstats").setExecutor(new EndStatsCommand());
		 
		 SetupCommand.level = new HashMap();
	  }
	 
	 public void onDisable()
	 {
	 }
	 
	  public void setMessage(String name, String message) {
	        File f = new File(getDataFolder()+File.separator+"messages.yml");
	        FileConfiguration config = YamlConfiguration.loadConfiguration(f);
	        if (!config.isSet(name)) {
	            config.set(name, message);
	            try {
	                config.save(f);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	   
	  
	  public static Plugin getPlugin()
	  {
	    return Bukkit.getServer().getPluginManager().getPlugin("TeamGames");
	  }
	

	  public static TeamGames getInstance()
	    {
	   return tg;

	  }
	  
	  @SuppressWarnings({ "unchecked", "rawtypes" })
	  public static Map sortByValue(Map unsortedMap) {
	   Map sortedMap = new TreeMap(new ValueComperator(unsortedMap));
	   sortedMap.putAll(unsortedMap);
	   return sortedMap;
	  }
	  
	  
	  }
	  

