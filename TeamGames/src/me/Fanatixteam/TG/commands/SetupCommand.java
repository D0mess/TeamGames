package me.Fanatixteam.TG.commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.Fanatixteam.TG.SetupList;
import me.Fanatixteam.TG.couldown.FireworkCouldown;
import me.Fanatixteam.TG.couldown.LobbyCouldown;
import me.Fanatixteam.TG.couldown.NextGameCouldown;
import me.Fanatixteam.TG.couldown.gamescouldown.HoeChangerCouldown;
import me.Fanatixteam.TG.couldown.gamescouldown.SwordWarsCouldown;
import me.Fanatixteam.TG.gamemanagement.ClickText;
import me.Fanatixteam.TG.gamemanagement.GameStage;
import me.Fanatixteam.TG.gamemanagement.Locations;
import me.Fanatixteam.TG.gamemanagement.Manager;
import me.Fanatixteam.TG.gamemanagement.ProfileStats;
import me.Fanatixteam.TG.gamemanagement.WinningSystem;
import me.Fanatixteam.TG.games.SwordWars;
import me.Fanatixteam.TG.gui.Spectator;
import me.Fanatixteam.TG.gui.shop.SwordWarsShop;
import me.Fanatixteam.TG.playermanagement.ColorArmor;
import me.Fanatixteam.TG.playermanagement.Inventory;
import me.Fanatixteam.TG.playermanagement.Teams;
import me.Fanatixteam.TG.scoreboard.HoeChangerScoreboard;
import me.Fanatixteam.TG.scoreboard.MiningScoreboard;
import me.Fanatixteam.TG.scoreboard.OITCScoreboard;
import me.Fanatixteam.TG.scoreboard.PaintballScoreboard;
import me.Fanatixteam.TG.scoreboard.StatsTeamScoreboard;
import me.Fanatixteam.TG.scoreboard.SwordWarsScoreboard;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;

public class SetupCommand implements CommandExecutor{
	
	public static List<String> setupmode = new ArrayList();
	  String noperm = "§4You don't have permission to use this command";
	  public Map<String, Integer> kills = new HashMap<String, Integer>();
	  public static HashMap<String, Integer> level;
	  
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		  Player p = (Player)sender;
	    if (cmd.getName().equalsIgnoreCase("teamgames")  && (!(sender instanceof Player)))
	  {
	    sender.sendMessage("This is a Player only command.");
	  }
	  else
	  {
	    if (args.length == 0)
	    {
	          p.sendMessage("§a§l----------------------------------------");
		      sender.sendMessage("§7/teamgames setuplist - List of setup and no setup locations!");
	          sender.sendMessage("§7/teamgames setupmode - Turn on setup mode §b" + " ✪");
	          p.sendMessage("§a§l----------------------------------------");
	            	  	    
	         // FireworkCouldown.startLobby();
	          if (this.level.containsKey(p.getName()))
	          {
	            this.level.put(p.getName(), Integer.valueOf(((Integer)this.level.get(p.getName())).intValue() + 1));		      SwordWarsScoreboard.swordwars_red += 10;
		      SwordWarsScoreboard.createScoreboard(p);
		      if (this.level.containsKey(p.getName())){
		    	  this.level.put(p.getName(), Integer.valueOf(((Integer)this.level.get(p.getName())).intValue() + 10));
		      p.sendMessage("Test" + ((Integer)this.level.get(p.getName())).intValue());
	    }
	    }
	    }
	    else if (args[0].equalsIgnoreCase("setupmode")) {
	          if (sender.hasPermission("teamgames.admin"))
	          {
		          this.level.put(p.getName(), Integer.valueOf(0));
				    Manager.setStage(GameStage.LOBBY);
		          this.setupmode.add(sender.getName());
		  	  	    ProfileStats.swordwars_gold.put(p.getName(), Integer.valueOf(0));	     
		          Inventory.setup_global_inventory(p);
		          p.sendMessage("§a§l----------------------------------------");
		          sender.sendMessage("§bNow you are in setup mode!");
		          sender.sendMessage("§bEverything setup witch §csetup menu!");
		          sender.sendMessage("§bIf you have setup all locations, §6save it!");
		          sender.sendMessage("§bIf you can look at settings §c(Done) §blocations use command §c/teamgames setuplist ");
		          sender.sendMessage("§bSetup mode you can off witch your setup menu");
		          p.sendMessage("§a§l----------------------------------------");
	          }
	          else
	          {
	            sender.sendMessage(noperm);
	          }
	        }
	    else  if (args[0].equalsIgnoreCase("setuplist")) {
	          if (sender.hasPermission("teamgames.admin"))
	          {
	        	  SetupList.setuplist(p);
		  		    Manager.setStage(GameStage.SWORDWARS);
		  		  for(Player p1 : Bukkit.getServer().getOnlinePlayers()){
		  		    SwordWars.swordwars_start(p1);
	    	  	   ProfileStats.swordwars_gold.put(p.getName(), Integer.valueOf(0));	     
			      }
	          }
	          else
	          {
	            sender.sendMessage(noperm);
	          }
	        }
		return false;
}
		return false;
	}
	}   

	  