package me.D0mess.TG.couldown.gamescouldown;

import me.D0mess.TG.GetterInt;
import me.D0mess.TG.TeamGames;
import me.D0mess.TG.gamemanagement.GameStage;
import me.D0mess.TG.gamemanagement.Manager;
import me.D0mess.TG.gamemanagement.WinningSystem;
import me.D0mess.TG.gamemanagement.WinningSystemScore;
import me.D0mess.TG.scoreboard.OITCScoreboard;
import me.D0mess.TG.scoreboard.PaintballScoreboard;
import me.D0mess.TG.scoreboard.SwordWarsScoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class PaintballCouldown {

	public static int Paintballcouldown = GetterInt.paintball_time_to_end();

	public static void startLobby(final Player p){

        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(TeamGames.getInstance(), new Runnable(){ 
       	 

       		@Override
   			public void run() {
   				
   				if(Manager.getStage() == GameStage.PAINTBALL){		
   				if(Paintballcouldown > 0){
   				 PaintballScoreboard.createScoreboard(p);
   				 WinningSystemScore.paintball_win();
   				}				
   				}
   					if(Paintballcouldown == 60 || Paintballcouldown == 30 || Paintballcouldown == 15 || Paintballcouldown == 10 || Paintballcouldown == 5 || Paintballcouldown == 4 || Paintballcouldown == 3 
   							|| Paintballcouldown == 2) {
   						Bukkit.broadcastMessage("�a" + Paintballcouldown + " �eseconds to finish the game!");
   				
   							}
   							
   						
   						
   						for(Player all : Bukkit.getOnlinePlayers()){
   							double b = Paintballcouldown;
   						}
   						if(Paintballcouldown == 1){
   							Bukkit.broadcastMessage("�a" + Paintballcouldown + " �esecond to finish the game!");
   						}
   						if(Paintballcouldown == 0){
   			                  WinningSystem.paintball_win();

   							  }						
   						if(Manager.getStage() == GameStage.PAINTBALL){		
   							Paintballcouldown--;
   						
   						}
   			}		
   				
   			}, 0L, 20L);

   	}
   }