package me.Fanatixteam.TG.couldown;

import me.Fanatixteam.TG.TeamGames;
import me.Fanatixteam.TG.actionbar.ActionBar;
import me.Fanatixteam.TG.gamemanagement.FireworkGenerator;
import me.Fanatixteam.TG.gamemanagement.GameStage;
import me.Fanatixteam.TG.gamemanagement.Locations;
import me.Fanatixteam.TG.gamemanagement.Manager;
import me.Fanatixteam.TG.gamemanagement.Team;
import me.Fanatixteam.TG.playermanagement.Players;
import me.Fanatixteam.TG.scoreboard.SwordWarsScoreboard;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class RespawnCouldown {

	public static int respawncouldown = 5;

	public static void respawncouldown(final Player p){
		
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(TeamGames.getInstance(), new Runnable(){ 
       	 

			@Override
			public void run() {
				
			if(Manager.getStage() == GameStage.SWORDWARS){	
				
					if( respawncouldown == 5 || respawncouldown == 4 
							|| respawncouldown == 3 || respawncouldown == 2 || respawncouldown == 1	){
					      ActionBar.sendActionBarTime(p, "§eWait " + respawncouldown ,20);
	
						}
						
						for(Player all : Bukkit.getOnlinePlayers()){
							double b = respawncouldown;
						}
						if(respawncouldown == 5){
						      ActionBar.sendActionBarTime(p, "§eRespawn for 5 seconds",20);
						}
						if(respawncouldown == 4){
						      ActionBar.sendActionBarTime(p, "§eRespawn for 4 seconds",20);
						}
						if(respawncouldown == 3){
						      ActionBar.sendActionBarTime(p, "§eRespawn for 3 seconds",20);
						}
						if(respawncouldown == 2){
						      ActionBar.sendActionBarTime(p, "§eRespawn for 2 seconds",20);
						}
						if(respawncouldown == 1){
						      ActionBar.sendActionBarTime(p, "§eRespawn for 1 second",20);
						      p.sendMessage("Test");
						}
						if(respawncouldown == 0){
							 if (Manager.getStage() == GameStage.SWORDWARS){
									if (Players.getTeam(p.getPlayer()).equals(Team.RED)){
							           	p.teleport(Locations.getLocation("swordwars_spawn_red", true));
									}
									if (Players.getTeam(p.getPlayer()).equals(Team.BLUE)){
							           	p.teleport(Locations.getLocation("swordwars_spawn_blue", true));
							}
							 }
									 if (Manager.getStage() == GameStage.OITC){
											if (Players.getTeam(p.getPlayer()).equals(Team.RED)){
									           	p.teleport(Locations.getLocation("oitc_spawn_red", true));
											}
											if (Players.getTeam(p.getPlayer()).equals(Team.BLUE)){
									           	p.teleport(Locations.getLocation("oitc_spawn_blue", true));
									}
									 }
											 if (Manager.getStage() == GameStage.PAINTBALL){
													if (Players.getTeam(p.getPlayer()).equals(Team.RED)){
											           	p.teleport(Locations.getLocation("paintball_spawn_red", true));
													}
													if (Players.getTeam(p.getPlayer()).equals(Team.BLUE)){
											           	p.teleport(Locations.getLocation("paintball_spawn_blue", true));
											}
											 }	
							  }
								
							
						
						
						respawncouldown--;
						
					}else{
						for(Player all : Bukkit.getOnlinePlayers()){
						}
						respawncouldown = 5;
					}
							 }
											 		 
							 				
			}, 0L, 20L);
			
						}
      
	}




	