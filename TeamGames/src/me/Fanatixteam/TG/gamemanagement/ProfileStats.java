package me.Fanatixteam.TG.gamemanagement;

import java.util.HashMap;
















import org.bukkit.entity.Player;

public class ProfileStats {
	
	  public static HashMap<String, Integer> swordwars_kills;
	  public static HashMap<String, Integer> swordwars_deaths;
	  public static HashMap<String, Integer> swordwars_gold;

	  public static HashMap<String, Integer> oitc_kills;
	  public static HashMap<String, Integer> oitc_deaths;
	  
	  public static HashMap<String, Integer> hoechanger_changedblocks;

	  public static HashMap<String, Integer> paintball_kills;
	  public static HashMap<String, Integer> paintball_deaths;	

	  public static HashMap<String, Integer> mining_minedblocks;

	  
	  public static void stats_per_game_load(){
			 ProfileStats.swordwars_kills = new HashMap();
			 ProfileStats.swordwars_deaths = new HashMap();
			 ProfileStats.swordwars_gold = new HashMap();
			 ProfileStats.oitc_kills = new HashMap();
			 ProfileStats.oitc_deaths = new HashMap();
			 ProfileStats.hoechanger_changedblocks = new HashMap();
			 ProfileStats.paintball_kills = new HashMap();
			 ProfileStats.paintball_deaths = new HashMap();			
			 ProfileStats.mining_minedblocks = new HashMap();
	  }

	  public static void player_stats_per_game(Player p){
	  	    ProfileStats.swordwars_kills.put(p.getName(), Integer.valueOf(0));	     
  	  	    ProfileStats.swordwars_deaths.put(p.getName(), Integer.valueOf(0));	     
  	  	    ProfileStats.swordwars_gold.put(p.getName(), Integer.valueOf(0));	     
  	  	    ProfileStats.oitc_kills.put(p.getName(), Integer.valueOf(0));	     
  	  	    ProfileStats.oitc_deaths.put(p.getName(), Integer.valueOf(0));	     
  	  	    ProfileStats.hoechanger_changedblocks.put(p.getName(), Integer.valueOf(0));	     
  	  	    ProfileStats.paintball_kills.put(p.getName(), Integer.valueOf(0));	     
  	  	    ProfileStats.paintball_deaths.put(p.getName(), Integer.valueOf(0));	     
  	  	    ProfileStats.mining_minedblocks.put(p.getName(), Integer.valueOf(0));	     
			p.sendMessage("§7▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
			p.sendMessage("");
			p.sendMessage("                           §e§lYour stats");
			p.sendMessage("");
			p.sendMessage("                        §f§nGame: §d§nSwordWars");
			p.sendMessage("");
			p.sendMessage("                        §4Kills §e: " + ((Integer)ProfileStats.swordwars_kills.get(p.getName())).intValue());
			p.sendMessage("                        §9Deaths §e: " + ((Integer)ProfileStats.swordwars_deaths.get(p.getName())).intValue());
			p.sendMessage("");
			p.sendMessage("                        §f§nGame: §d§nOneInTheChamber");
			p.sendMessage("");
			p.sendMessage("                        §4Kills §e: " + ((Integer)ProfileStats.oitc_kills.get(p.getName())).intValue());
			p.sendMessage("                        §9Deaths §e: " + ((Integer)ProfileStats.oitc_deaths.get(p.getName())).intValue());
			p.sendMessage("");
			p.sendMessage("                        §f§nGame: §d§nHoeChanger");
			p.sendMessage("");
			p.sendMessage("                        §4Changed Blocks §e: " + ((Integer)ProfileStats.hoechanger_changedblocks.get(p.getName())).intValue());
			p.sendMessage("");
			p.sendMessage("                        §f§nGame: §d§nPaintball");
			p.sendMessage("");
			p.sendMessage("                        §4Kills §e: " + ((Integer)ProfileStats.paintball_kills.get(p.getName())).intValue());
			p.sendMessage("                        §9Deaths §e: " + ((Integer)ProfileStats.paintball_deaths.get(p.getName())).intValue());
			p.sendMessage("");
			p.sendMessage("                        §f§nGame: §d§nMining");
			p.sendMessage("");
			p.sendMessage("                        §4Mined Blocks §e: " + ((Integer)ProfileStats.mining_minedblocks.get(p.getName())).intValue());
			p.sendMessage("");
			p.sendMessage("§7▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");


	  }
}

 
