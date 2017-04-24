package me.D0mess.TG.couldown.gamescouldown;

import me.D0mess.TG.GetterInt;
import me.D0mess.TG.TeamGames;
import me.D0mess.TG.gamemanagement.GameStage;
import me.D0mess.TG.gamemanagement.Manager;
import me.D0mess.TG.gamemanagement.WinningSystem;
import me.D0mess.TG.gamemanagement.WinningSystemScore;
import me.D0mess.TG.scoreboard.HoeChangerScoreboard;
import me.D0mess.TG.scoreboard.MiningScoreboard;
import me.D0mess.TG.scoreboard.SwordWarsScoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class MiningCouldown {

	public static int Miningcouldown = GetterInt.mining_time_to_end();

	public static void startLobby(final Player p){

        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(TeamGames.getInstance(), new Runnable(){ 
       	 

       		@Override
   			public void run() {
   				
   				if(Manager.getStage() == GameStage.MINING){		
   				if(Miningcouldown > 0){
   				 MiningScoreboard.createScoreboard(p);
   				 WinningSystemScore.mining_win();;
   				}				
   				}
   					if(Miningcouldown == 60 || Miningcouldown == 30 || Miningcouldown == 15 || Miningcouldown == 10 || Miningcouldown == 5 || Miningcouldown == 4 || Miningcouldown == 3 
   							|| Miningcouldown == 2) {
   						Bukkit.broadcastMessage("§a" + Miningcouldown + " §eseconds to finish the game!");
   				
   							}
   							
   						
   						
   						for(Player all : Bukkit.getOnlinePlayers()){
   							double b = Miningcouldown;
   						}
   						if(Miningcouldown == 1){
   							Bukkit.broadcastMessage("§a" + Miningcouldown + " §esecond to finish the game!");
   						}
   						if(Miningcouldown == 0){
   			                  WinningSystem.mining_win();

   							  }						
   						if(Manager.getStage() == GameStage.MINING){		
   							Miningcouldown--;
   						
   						}
   			}		
   				
   			}, 0L, 20L);

   	}
   }