package me.D0mess.TG.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class StatsTeamScoreboard {

	  public static int games = 0;
	  public static int totalgames = 0;


		  public static void createScoreboard(Player p)
		  {
		    
		    ScoreboardManager sm = p.getServer().getScoreboardManager();
		    Scoreboard sb = sm.getNewScoreboard();
		    
		    Objective score = sb.registerNewObjective("vote", "votedummy");
		    score.setDisplayName("§e§lTeam Games");
		    score.setDisplaySlot(DisplaySlot.SIDEBAR);
		    
		Score line4 = score.getScore(Bukkit.getOfflinePlayer("§b"));
		line4.setScore(4);
			
		Score line3 = score.getScore(Bukkit.getOfflinePlayer("§4Stars" + " ✪"));
		line3.setScore(3);  
		
		Score line2 = score.getScore(Bukkit.getOfflinePlayer("Game: " + games +"/ " + totalgames));
		line2.setScore(2);		
			
		Score line1 = score.getScore(Bukkit.getOfflinePlayer("§5"));
		line1.setScore(1);
		
	    p.setScoreboard(sb);
	  }       
}