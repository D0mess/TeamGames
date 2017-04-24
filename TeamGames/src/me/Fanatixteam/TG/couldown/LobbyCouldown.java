package me.Fanatixteam.TG.couldown;

import me.Fanatixteam.TG.TeamGames;
import me.Fanatixteam.TG.gamemanagement.FireworkGenerator;
import me.Fanatixteam.TG.gamemanagement.GameStage;
import me.Fanatixteam.TG.gamemanagement.Locations;
import me.Fanatixteam.TG.gamemanagement.Manager;
import me.Fanatixteam.TG.scoreboard.LobbyScoreboard;
import me.Fanatixteam.TG.scoreboard.SwordWarsScoreboard;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class LobbyCouldown {

	public static int LobbyCounter = 60;

	public static void startLobby(final Player player){
		
         Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(TeamGames.getInstance(), new Runnable(){ 
        	 

			@Override
			public void run() {
				
			if(Manager.getStage() == GameStage.LOBBY){	
				
					if(LobbyCounter == 60 || LobbyCounter == 30 || LobbyCounter == 15 || LobbyCounter == 10 
							|| LobbyCounter == 5 || LobbyCounter == 4 || LobbyCounter == 3 || LobbyCounter == 2 || LobbyCounter == 1){	
						Bukkit.broadcastMessage("§eThe game starts in" + "§c "+ LobbyCounter + " §eseconds!");
						for(Player all : Bukkit.getOnlinePlayers()){
							all.playSound(all.getLocation(), Sound.BLOCK_ANVIL_USE, 1, 1);

						   }
					
						
					}
					
					for(Player all : Bukkit.getOnlinePlayers()){
						all.setLevel(LobbyCounter);
						all.setExp(0);
						double b = LobbyCounter;
					}
					if(LobbyCounter == 0){
						for(Player all : Bukkit.getOnlinePlayers()){
							all.playSound(all.getLocation(), Sound.BLOCK_ANVIL_USE, 10, 10);
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
							
						
					
					
					LobbyCounter--;
					
				}else{
					for(Player all : Bukkit.getOnlinePlayers()){
						all.setLevel(LobbyCounter);
						SwordWarsScoreboard.createScoreboard(all);
						all.setExp(0);
					}
					LobbyCounter = 120;
			}
			
			} 
			} 		
		}, 0L, 20L);

} 
} 

