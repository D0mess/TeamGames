package me.Fanatixteam.TG.couldown;

import java.text.SimpleDateFormat;
import java.util.Date;

import me.Fanatixteam.TG.TeamGames;
import me.Fanatixteam.TG.gamemanagement.FireworkGenerator;
import me.Fanatixteam.TG.gamemanagement.GameStage;
import me.Fanatixteam.TG.gamemanagement.Locations;
import me.Fanatixteam.TG.gamemanagement.Manager;
import me.Fanatixteam.TG.gamemanagement.WinningSystem;
import me.Fanatixteam.TG.scoreboard.SwordWarsScoreboard;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class FireworkCouldown {

	public static int FireworkCounter = 20;
	static Date date = new Date((long)(FireworkCounter*1000));
	static String formattedDate = new SimpleDateFormat("mm/ss").format(date);
	
  public static void startLobby(final Player p){

         Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(TeamGames.getInstance(), new Runnable(){ 
        	 

			@Override
			public void run() {
				
				
				if(FireworkCounter > 0){
					 SwordWarsScoreboard.createScoreboard(p);
					}
					
			if(Manager.getStage() == GameStage.LOBBY){	
				
					if(FireworkCounter == 20 || FireworkCounter == 9 || FireworkCounter == 8 || FireworkCounter == 7 || FireworkCounter == 6 || FireworkCounter == 5 || FireworkCounter == 4 
							|| FireworkCounter == 3 || FireworkCounter == 2 || FireworkCounter == 1	)
					 {	
						p.sendMessage("Test" + formattedDate);
							if (TeamGames.getPlugin().getConfig().getBoolean("firework_spawn_two") == true) {
								 FireworkGenerator.createFirework(Locations.getLocation("firework_spawn_one", true));
								 SwordWarsScoreboard.createScoreboard(p);
							}
						   if (TeamGames.getPlugin().getConfig().getBoolean("firework_spawn_two") == true){
					
						 FireworkGenerator.createFirework(Locations.getLocation("firework_spawn_two", true));
							}
							
						}
						
						for(Player all : Bukkit.getOnlinePlayers()){
							all.setLevel(FireworkCounter);
							all.setExp(0);
							double b = FireworkCounter;
						}
						if(FireworkCounter == 5){
						}
						if(FireworkCounter == 0){
							for(Player all : Bukkit.getOnlinePlayers()){
								all.playSound(all.getLocation(), Sound.ENTITY_WOLF_STEP, 10, 10);
				                  WinningSystem.swordwars_win();
							}
							for(Player all : Bukkit.getOnlinePlayers()){
								all.getInventory().clear();
								all.getInventory().setHelmet(null);
								all.getInventory().setChestplate(null);
								all.getInventory().setLeggings(null);
								all.getInventory().setBoots(null);
								all.setFoodLevel(20);
								all.setHealth(20D);
								all.setLevel(0);
								all.setExp(0);

							  }
								}
							
						
						
						FireworkCounter--;
						
					}else{
						for(Player all : Bukkit.getOnlinePlayers()){
							all.setLevel(FireworkCounter);
							all.setExp(0);
						}
						FireworkCounter = 40;
				}
				
				}	
			}, 0L, 20L);

	} 
	} 

