package me.Fanatixteam.TG.events;


import me.Fanatixteam.TG.TeamGames;
import me.Fanatixteam.TG.gamemanagement.GameStage;
import me.Fanatixteam.TG.gamemanagement.Manager;
import me.Fanatixteam.TG.playermanagement.Inventory;
import me.Fanatixteam.TG.playermanagement.Teams;
import me.Fanatixteam.TG.scoreboard.LobbyScoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {

	TeamGames plugin;
	@EventHandler
	 public void onJoin(PlayerJoinEvent event)
	 {
	  Player p = event.getPlayer();
	  p.getInventory().clear();
	  p.getInventory().setHelmet(null);
	  p.getInventory().setChestplate(null);
	  p.getInventory().setLeggings(null);
	  p.getInventory().setBoots(null);
	  Inventory.lobby_inventory(p);
	  LobbyScoreboard.createScoreboard(p);
	  Teams.noneTeam(p);
	  if (Manager.getStage() == GameStage.LOBBY){
		  event.setJoinMessage(null);
		  p.sendMessage("§b" + p.getName() + " §ejoined the game " + "(§b" + Bukkit.getServer().getOnlinePlayers().size() + "§e/§b" + Bukkit.getServer().getMaxPlayers() + "§e)");
		  p.teleport(p.getWorld().getSpawnLocation());
	     // ActionBar.sendActionBarTime(p, "§e§lVote map §b/vote [ID]",1000);
	 }
	      if(Bukkit.getOnlinePlayers().size() >= 2){
	   		Manager.setStage(GameStage.STARTING);
		    Bukkit.broadcastMessage("§7We now enough players");
		     //Couldown.startLobby(p);
	  }
	//      if (TeamGames.getPlugin().getConfig().getBoolean("oitc_spectator", true)) {
	 //   	  Bukkit.broadcastMessage("§7We now enough players");
//	}else{
	//    Bukkit.broadcastMessage("§7We now enough ");

	
	 }
	}