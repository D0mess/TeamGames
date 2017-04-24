package me.Fanatixteam.TG.events;

import me.Fanatixteam.TG.couldown.RespawnCouldown;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;



public class Respawn implements Listener{
	

	@EventHandler
	public void onPlayerRespawn(PlayerRespawnEvent event){
		Player p = event.getPlayer();
    //    p.setAllowFlight(true);
      //  p.setFlying(true);
  	 // if (Manager.getStage() == GameStage.SWORDWARS){
  		  p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100,1));
  		  RespawnCouldown.respawncouldown(p);
  	  

	}


}
