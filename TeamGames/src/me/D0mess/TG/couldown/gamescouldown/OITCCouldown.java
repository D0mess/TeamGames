package me.D0mess.TG.couldown.gamescouldown;

import me.D0mess.TG.GetterInt;
import me.D0mess.TG.TeamGames;
import me.D0mess.TG.gamemanagement.GameStage;
import me.D0mess.TG.gamemanagement.Manager;
import me.D0mess.TG.gamemanagement.WinningSystem;
import me.D0mess.TG.gamemanagement.WinningSystemScore;
import me.D0mess.TG.scoreboard.OITCScoreboard;
import me.D0mess.TG.scoreboard.SwordWarsScoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class OITCCouldown {

	public static int OITCcouldown = GetterInt.oitc_time_to_end();

	public static void startLobby(final Player p){

         Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(TeamGames.getInstance(), new Runnable(){ 
        	 

        		@Override
    			public void run() {
    				
    				if(Manager.getStage() == GameStage.OITC){		
    				if(OITCcouldown > 0){
    				 OITCScoreboard.createScoreboard(p);
    				 WinningSystemScore.oitc_win();
    				}				
    				}
    					if(OITCcouldown == 60 || OITCcouldown == 30 || OITCcouldown == 15 || OITCcouldown == 10 || OITCcouldown == 5 || OITCcouldown == 4 || OITCcouldown == 3 
    							|| OITCcouldown == 2) {
    						Bukkit.broadcastMessage("�a" + OITCcouldown + " �eseconds to finish the game!");
    				
    							}
    							
    						
    						
    						for(Player all : Bukkit.getOnlinePlayers()){
    							double b = OITCcouldown;
    						}
    						if(OITCcouldown == 1){
    							Bukkit.broadcastMessage("�a" + OITCcouldown + " �esecond to finish the game!");
    						}
    						if(OITCcouldown == 0){
    			                  WinningSystem.oitc_win();

    							  }						
    						if(Manager.getStage() == GameStage.OITC){		
    							OITCcouldown--;
    						
    						}
    			}		
    				
    			}, 0L, 20L);

    	}
    }