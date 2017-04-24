package me.Fanatixteam.TG.scoreboard;


import me.Fanatixteam.TG.GetterInt;
import me.Fanatixteam.TG.TeamGames;





import org.apache.commons.codec.language.bm.Lang;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class LobbyScoreboard {

		  public static void createScoreboard(Player p)
		  {
		    
			    ScoreboardManager sm = p.getServer().getScoreboardManager();
			    Scoreboard sb = sm.getNewScoreboard();
			    
			    Objective score = sb.registerNewObjective("vote", "votedummy");
			    score.setDisplayName("");
			    
			    score.setDisplaySlot(DisplaySlot.SIDEBAR);
			    
			    Score score5 = score.getScore(Bukkit.getOfflinePlayer("§b"));
			    score5.setScore(5);
				Score score4 = score.getScore(Bukkit.getOfflinePlayer("Players:§a " + Bukkit.getServer().getOnlinePlayers().size() + "§a/§a" + Bukkit.getServer().getMaxPlayers()));
				score4.setScore(4);  
				Score score3 = score.getScore(Bukkit.getOfflinePlayer("Min. Players:§a " + GetterInt.minplayers()));
				score3.setScore(3);
				
				Score score2 = score.getScore(Bukkit.getOfflinePlayer("§a"));
				score2.setScore(2);
				
				Score score1 = score.getScore(Bukkit.getOfflinePlayer("Waiting..."));
				score1.setScore(1);
			
		

		    p.setScoreboard(sb);
		  }     
			}
			