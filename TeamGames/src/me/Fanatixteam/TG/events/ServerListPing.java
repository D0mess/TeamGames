package me.Fanatixteam.TG.events;

import me.Fanatixteam.TG.TeamGames;
import me.Fanatixteam.TG.gamemanagement.GameStage;
import me.Fanatixteam.TG.gamemanagement.Manager;
import net.md_5.bungee.api.ChatColor;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class ServerListPing implements Listener {
	
	@EventHandler
    public void onServerPing(ServerListPingEvent event) {
		  if (Manager.getStage() == GameStage.LOBBY){
		        event.setMotd(ChatColor.translateAlternateColorCodes('&', TeamGames.messageData.get("MotdServer_lobby")));
		  }
		  if (Manager.getStage() == GameStage.STARTING){
		        event.setMotd(ChatColor.translateAlternateColorCodes('&', TeamGames.messageData.get("MotdServer_starting")));
          }
		  if (Manager.getStage() == GameStage.END){
		        event.setMotd(ChatColor.translateAlternateColorCodes('&', TeamGames.messageData.get("MotdServer_end")));
          }
		  if (Manager.getStage() == GameStage.SWORDWARS){
		        event.setMotd(ChatColor.translateAlternateColorCodes('&', TeamGames.messageData.get("MotdServer_game_swordwars")));
          }
		  if (Manager.getStage() == GameStage.OITC){
		        event.setMotd(ChatColor.translateAlternateColorCodes('&', TeamGames.messageData.get("MotdServer_game_oitc")));
          }
		  if (Manager.getStage() == GameStage.HOECHANGER){
		        event.setMotd(ChatColor.translateAlternateColorCodes('&', TeamGames.messageData.get("MotdServer_game_hoechanger")));
          }
		  if (Manager.getStage() == GameStage.PAINTBALL){
		        event.setMotd(ChatColor.translateAlternateColorCodes('&', TeamGames.messageData.get("MotdServer_game_paintball")));
          }
		  if (Manager.getStage() == GameStage.MINING){
		        event.setMotd(ChatColor.translateAlternateColorCodes('&', TeamGames.messageData.get("MotdServer_game_mining")));
        }
}
}
