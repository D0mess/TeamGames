package me.D0mess.TG.commands;



import me.D0mess.TG.gamemanagement.ProfileStats;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EndStatsCommand implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		  Player p = (Player)sender;
	    if (cmd.getName().equalsIgnoreCase("endstats")  && (!(sender instanceof Player)))
	  {
	    sender.sendMessage("This is a Player only command.");
	  }
	  else
	  {
	    if (args.length == 0)
	    {
	          p.sendMessage("§a§l----------------------------------------");
		      sender.sendMessage("§7/endstats player - Check your game stats!");
	          sender.sendMessage("§7/endstats team - Check teams game stats");
	          p.sendMessage("§a§l----------------------------------------");
	          
	    }
	    else if (args[0].equalsIgnoreCase("player")) {
	          
		        ProfileStats.player_stats_per_game(p);
	          }
	          
	    else if (args[0].equalsIgnoreCase("team")) {
	          
	         
        }
	  }
		return false; 
	  }
} 