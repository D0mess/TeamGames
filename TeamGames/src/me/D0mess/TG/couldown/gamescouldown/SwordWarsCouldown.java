package me.D0mess.TG.couldown.gamescouldown;

import me.D0mess.TG.GetterInt;
import me.D0mess.TG.TeamGames;
import me.D0mess.TG.actionbar.ActionBar;
import me.D0mess.TG.gamemanagement.FireworkGenerator;
import me.D0mess.TG.gamemanagement.GameStage;
import me.D0mess.TG.gamemanagement.Locations;
import me.D0mess.TG.gamemanagement.Manager;
import me.D0mess.TG.gamemanagement.WinningSystem;
import me.D0mess.TG.gamemanagement.WinningSystemScore;


import me.D0mess.TG.scoreboard.SwordWarsScoreboard;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class SwordWarsCouldown {

	public static int SwordWarscouldown = GetterInt.swordwars_time_to_end();

	public static void startLobby(final Player p){

         Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(TeamGames.getInstance(), new Runnable(){ 
        	 

			@Override
			public void run() {
				
				if(Manager.getStage() == GameStage.SWORDWARS){		
				if(SwordWarscouldown > 0){
				 SwordWarsScoreboard.createScoreboard(p);
				 WinningSystemScore.swordwars_win();
				}				
				}
					if(SwordWarscouldown == 60 || SwordWarscouldown == 30 || SwordWarscouldown == 15 || SwordWarscouldown == 10 || SwordWarscouldown == 5 || SwordWarscouldown == 4 || SwordWarscouldown == 3 
							|| SwordWarscouldown == 2) {
						Bukkit.broadcastMessage("�a" + SwordWarscouldown + " �eseconds to finish the game!");
				
							}
							
						
						
						for(Player all : Bukkit.getOnlinePlayers()){
							double b = SwordWarscouldown;
						}
						if(SwordWarscouldown == 1){
							Bukkit.broadcastMessage("�a" + SwordWarscouldown + " �esecond to finish the game!");
						}
						if(SwordWarscouldown == 0){
			                  WinningSystem.swordwars_win();

							  }						
						if(Manager.getStage() == GameStage.SWORDWARS){		
						SwordWarscouldown--;
						
						}
			}		
				
			}, 0L, 20L);

	}
}
