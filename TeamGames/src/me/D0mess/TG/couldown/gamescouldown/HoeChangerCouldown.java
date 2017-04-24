package me.D0mess.TG.couldown.gamescouldown;

import java.text.SimpleDateFormat;
import java.util.Date;

import me.D0mess.TG.GetterInt;
import me.D0mess.TG.TeamGames;
import me.D0mess.TG.gamemanagement.GameStage;
import me.D0mess.TG.gamemanagement.Manager;
import me.D0mess.TG.gamemanagement.WinningSystem;
import me.D0mess.TG.gamemanagement.WinningSystemScore;
import me.D0mess.TG.scoreboard.HoeChangerScoreboard;
import me.D0mess.TG.scoreboard.SwordWarsScoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class HoeChangerCouldown {

	public static int HoeChangercouldown = GetterInt.hoechanger_time_to_end();


	public static void startLobby(final Player p){

        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(TeamGames.getInstance(), new Runnable(){ 
       	 

       		@Override
   			public void run() {
   				
   				if(Manager.getStage() == GameStage.LOBBY){		
   				if(HoeChangercouldown > 0){
   				 HoeChangerScoreboard.createScoreboard(p);
   				 WinningSystemScore.hoechanger_win();;
   				}				
   				}
   					if(HoeChangercouldown == 60 || HoeChangercouldown == 30 || HoeChangercouldown == 15 || HoeChangercouldown == 10 || HoeChangercouldown == 5 || HoeChangercouldown == 4 || HoeChangercouldown == 3 
   							|| HoeChangercouldown == 2) {
   						Date date = new Date((long)(HoeChangercouldown*1000));
   						String formattedDate = new SimpleDateFormat("mm:ss").format(date);
   						Bukkit.broadcastMessage("§a" + formattedDate + " §eseconds to finish the game!");
   				
   							}
   							
   						
   						
   						for(Player all : Bukkit.getOnlinePlayers()){
   							double b = HoeChangercouldown;
   						}
   						if(HoeChangercouldown == 1){
   							Bukkit.broadcastMessage("§a" + HoeChangercouldown + " §esecond to finish the game!");
   						}
   						if(HoeChangercouldown == 0){
   			                  WinningSystem.hoechanger_win();

   							  }						
   						if(Manager.getStage() == GameStage.LOBBY){		
   							HoeChangercouldown--;
   						
   						}
   			}		
   				
   			}, 0L, 20L);

   	}
   }