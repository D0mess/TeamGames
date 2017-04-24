package me.D0mess.TG.couldown;

import me.D0mess.TG.GetterInt;
import me.D0mess.TG.TeamGames;
import me.D0mess.TG.gamemanagement.GameStage;
import me.D0mess.TG.gamemanagement.Manager;
import me.D0mess.TG.gamemanagement.Team;
import me.D0mess.TG.gamemanagement.WinningSystem;
import me.D0mess.TG.gamemanagement.WinningSystemScore;
import me.D0mess.TG.games.HoeChanger;
import me.D0mess.TG.games.Mining;
import me.D0mess.TG.games.OITC;
import me.D0mess.TG.games.Paintball;
import me.D0mess.TG.games.SwordWars;
import me.D0mess.TG.playermanagement.Players;
import me.D0mess.TG.scoreboard.SwordWarsScoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class NextGameCouldown {

	public static int NextGamecouldown = GetterInt.lobby_time_to_start_nextgame();

	public static void startLobby(final Player p){

         Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(TeamGames.getInstance(), new Runnable(){ 
        	 

			@Override
			public void run() {
				
	
					if(NextGamecouldown == 60 || NextGamecouldown == 30 || NextGamecouldown == 15 || NextGamecouldown == 10 || NextGamecouldown == 5 || NextGamecouldown == 4 || NextGamecouldown == 3 
							|| NextGamecouldown == 2) {
						Bukkit.broadcastMessage("§a" + NextGamecouldown + " §eseconds to start new game!");
				
							}
							
						
						
						for(Player all : Bukkit.getOnlinePlayers()){
							double b = NextGamecouldown;
						}
						if(NextGamecouldown == 1){
							Bukkit.broadcastMessage("§a" + NextGamecouldown + " §esecond to start new game!");
						}
						if(NextGamecouldown == 0){
							if(Manager.getStage() == GameStage.SWORDWARS){
								SwordWars.swordwars_start(p);
							}
							if(Manager.getStage() == GameStage.OITC){
								OITC.oitc_start(p);
							}
							if(Manager.getStage() == GameStage.HOECHANGER){
								HoeChanger.hoechanger_start(p);
							}
							if(Manager.getStage() == GameStage.PAINTBALL){
								Paintball.paintball_start(p);
							}
							if(Manager.getStage() == GameStage.MINING){
								Mining.mining_start(p);
							}	
  
							  }						
							NextGamecouldown--;						
						}		
				
			}, 0L, 20L);

	}
}
