package me.D0mess.TG.scoreboard;


import me.D0mess.TG.couldown.gamescouldown.SwordWarsCouldown;
import me.D0mess.TG.gamemanagement.ProfileStats;
import me.D0mess.TG.playermanagement.Teams;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class SwordWarsScoreboard {
	
	  public static int swordwars_red = 0;
	  public static int swordwars_blue = 0;

	  public static void createScoreboard(Player p)
	  {

	    
	    ScoreboardManager sm = p.getServer().getScoreboardManager();
	    Scoreboard sb = sm.getNewScoreboard();
	    
	    Objective score = sb.registerNewObjective("vote", "votedummy");
	    score.setDisplayName("§e§lTeam Games");
	    score.setDisplaySlot(DisplaySlot.SIDEBAR);
	    
	    Score line14 = score.getScore(Bukkit.getOfflinePlayer("§b"));
	    line14.setScore(14);

		Score line13 = score.getScore(Bukkit.getOfflinePlayer("§4Red:§a " + swordwars_red));
		line13.setScore(13);  
		
		Score line12 = score.getScore(Bukkit.getOfflinePlayer("§9Blue:§a " + swordwars_blue));
		line12.setScore(12);
		
		Score line11 = score.getScore(Bukkit.getOfflinePlayer("§9"));
		line11.setScore(11);
		
		Score line10 = score.getScore(Bukkit.getOfflinePlayer("§3End Game: §a" + SwordWarsCouldown.SwordWarscouldown));
		line10.setScore(10);
		
	    Score line9 = score.getScore(Bukkit.getOfflinePlayer("§d"));
	    line9.setScore(9);
	    
		Score line8 = score.getScore(Bukkit.getOfflinePlayer("Players in red team: §a" + Teams.red.size()));
		line8.setScore(8);
		
		Score line7 = score.getScore(Bukkit.getOfflinePlayer("Players in ble team: §a" + Teams.blue.size()));
		line7.setScore(7);
		
		Score line6 = score.getScore(Bukkit.getOfflinePlayer("§7"));
		line6.setScore(6);
	
		Score line5 = score.getScore(Bukkit.getOfflinePlayer("Your kills: §a" + ProfileStats.swordwars_kills));
		line5.setScore(5);

		Score line4 = score.getScore(Bukkit.getOfflinePlayer("Your deaths: §a" + ProfileStats.swordwars_deaths));
		line4.setScore(4);
		
		Score line3 = score.getScore(Bukkit.getOfflinePlayer("Your golds: §a" + ((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue()));
		line3.setScore(3);
		
		Score line2 = score.getScore(Bukkit.getOfflinePlayer("§5"));
		line2.setScore(2);
		
		Score line1 = score.getScore(Bukkit.getOfflinePlayer("Gamemode: §aSwordWars"));
		line1.setScore(1);

	    p.setScoreboard(sb);
	  }       
}
