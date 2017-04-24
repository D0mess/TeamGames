package me.Fanatixteam.TG.scoreboard;

import me.Fanatixteam.TG.couldown.FireworkCouldown;
import me.Fanatixteam.TG.gamemanagement.ProfileStats;
import me.Fanatixteam.TG.playermanagement.Teams;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class OITCScoreboard {
	
	  public static int oitc_red = 0;
	  public static int oitc_blue = 0;

	  public static void createScoreboard(Player p)
	  {

	    
	    ScoreboardManager sm = p.getServer().getScoreboardManager();
	    Scoreboard sb = sm.getNewScoreboard();
	    
	    Objective score = sb.registerNewObjective("vote", "votedummy");
	    score.setDisplayName("§e§lTeam Games");
	    score.setDisplaySlot(DisplaySlot.SIDEBAR);
	    
	    Score line13 = score.getScore(Bukkit.getOfflinePlayer("§b"));
	    line13.setScore(13);

		Score line12 = score.getScore(Bukkit.getOfflinePlayer("§4Red:§a " + oitc_red));
		line12.setScore(12);  
		
		Score line11 = score.getScore(Bukkit.getOfflinePlayer("§9Blue:§a " + oitc_blue));
		line11.setScore(11);
		
		Score line10 = score.getScore(Bukkit.getOfflinePlayer("§9"));
		line10.setScore(10);
		
		Score line9 = score.getScore(Bukkit.getOfflinePlayer("§3End Game: §a" + FireworkCouldown.FireworkCounter));
		line9.setScore(9);
		
	    Score line8 = score.getScore(Bukkit.getOfflinePlayer("§d"));
	    line8.setScore(8);
	    
		Score line7 = score.getScore(Bukkit.getOfflinePlayer("Players in red team: §a" + Teams.red.size()));
		line7.setScore(7);
		
		Score line6 = score.getScore(Bukkit.getOfflinePlayer("Players in ble team: §a" + Teams.blue.size()));
		line6.setScore(6);
		
		Score line5 = score.getScore(Bukkit.getOfflinePlayer("§7"));
		line5.setScore(5);
	
		Score line4 = score.getScore(Bukkit.getOfflinePlayer("Your kills: §a" + ProfileStats.swordwars_kills));
		line4.setScore(4);

		Score line3 = score.getScore(Bukkit.getOfflinePlayer("Your deaths: §a" + ProfileStats.swordwars_deaths));
		line3.setScore(3);
		
		Score line2 = score.getScore(Bukkit.getOfflinePlayer("§5"));
		line2.setScore(2);
		
		Score line1 = score.getScore(Bukkit.getOfflinePlayer("Gamemode: §aOneInTheChamber"));
		line1.setScore(1);
		
	    p.setScoreboard(sb);
	  }       
}