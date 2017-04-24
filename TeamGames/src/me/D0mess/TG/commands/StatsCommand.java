package me.D0mess.TG.commands;

import java.util.HashMap;

import me.D0mess.TG.TeamGames;
import me.D0mess.TG.gamemanagement.WinningSystem;
import me.D0mess.TG.playermanagement.Teams;
import net.md_5.bungee.api.ChatColor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class StatsCommand implements CommandExecutor{
	
	HashMap<String, Integer> players = new HashMap<String, Integer>();

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		  Player p = (Player)sender;
		 if (cmd.getName().equalsIgnoreCase("stats")  && (!(sender instanceof Player)))
		  {
		    sender.sendMessage("This is a Player only command.");
		  }
		  else
		  {
		    if (args.length == 0)
		    {
		    	for(String playerName: TeamGames.tg.getConfig().getConfigurationSection("Top").getKeys(false)){
		    		players.put(playerName, TeamGames.tg.getConfig().getInt("Top." + playerName + ".Kills"));
		    	    TeamGames.getPlugin().getConfig().set("Top." + "D0mes" + ".Kills", 10);
		    	    TeamGames.getPlugin().saveConfig();		    		}

		    		sender.sendMessage("===========[Top]===========");

		    		String nextTop = "";
		    		Integer nextTopKills = 0;

		    		for(int i = 1; i < 11; i++){
		    		for(String playerName: players.keySet()){
		    		if(players.get(playerName) > nextTopKills){
		    		nextTop = playerName;
		    		nextTopKills = players.get(playerName);
		    		}
		    		}
		    		sender.sendMessage(i + " # " + nextTop + " : " + nextTopKills);   		
		    		players.remove(nextTop);
		    		nextTop = "";
		    		nextTopKills = 0;
		    		}
		    		sender.sendMessage("===========[Top]===========");
		    		


		    }
		    }
		return false;
	}
}