package me.D0mess.TG.events;

import me.D0mess.TG.SetupPartGames;
import me.D0mess.TG.commands.SetupCommand;
import me.D0mess.TG.gamemanagement.GameStage;
import me.D0mess.TG.gamemanagement.Manager;
import me.D0mess.TG.gui.SetupGame;
import me.D0mess.TG.gui.TeamSelector;
import me.D0mess.TG.gui.shop.SwordWarsShop;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Interact implements Listener {

	@EventHandler
    public void playerInteract(PlayerInteractEvent e) {
    Player p = e.getPlayer();
    if (SetupCommand.setupmode.contains(p.getName())) {
        if(p.getItemInHand().getType() == Material.NETHER_STAR){
       SetupGame.show(p);
	  } 
    }  
	  if (Manager.getStage() == GameStage.SWORDWARS){
	       if(p.getItemInHand().getType() == Material.GOLD_NUGGET){
                SwordWarsShop.show(p);
	 	  } 
	    }         
    if (SetupGame.globallobby.contains(p.getName())) {
        ItemStack item = p.getItemInHand();
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 1){
        SetupPartGames.lobby_spawn_set(p);
    }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 4){
            SetupPartGames.end_spawn_set(p);
    }
    }
    if (SetupGame.endlobby.contains(p.getName())) {
        ItemStack item = p.getItemInHand();
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 4){
            SetupPartGames.end_spawn_set(p);
    }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 8){
            SetupPartGames.firework_spawn_one_set(p);
            
    }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 9){
            SetupPartGames.firework_spawn_two_set(p);
    	}
    }
    if (SetupGame.swordwars.contains(p.getName())) {
        ItemStack item = p.getItemInHand();
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 14){
        SetupPartGames.swordwars_spawn_red_set(p);
    }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 11){
            SetupPartGames.swordwars_spawn_blue_set(p);
        }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 15){
            SetupPartGames.swordwars_spawn_spectator_set(p);
        }
    }
    if (SetupGame.oitc.contains(p.getName())) {
        ItemStack item = p.getItemInHand();
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 14){
        SetupPartGames.oitc_spawn_red_set(p);
    }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 11){
            SetupPartGames.oitc_spawn_blue_set(p);
        }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 15){
            SetupPartGames.oitc_spawn_spectator_set(p);
        }
    }
    if (SetupGame.hoechanger.contains(p.getName())) {
        ItemStack item = p.getItemInHand();
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 14){
        SetupPartGames.hoechanger_spawn_red_set(p);
    }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 11){
            SetupPartGames.hoechanger_spawn_blue_set(p);
        }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 15){
            SetupPartGames.hoechanger_spawn_spectator_set(p);
        }
    }
    if (SetupGame.paintball.contains(p.getName())) {
        ItemStack item = p.getItemInHand();
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 14){
        SetupPartGames.paintball_spawn_red_set(p);
    }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 11){
            SetupPartGames.paintball_spawn_blue_set(p);
        }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 15){
            SetupPartGames.paintball_spawn_spectator_set(p);
        }
    }
    if (SetupGame.mining.contains(p.getName())) {
        ItemStack item = p.getItemInHand();
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 14){
        SetupPartGames.mining_spawn_red_set(p);
    }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 11){
            SetupPartGames.mining_spawn_blue_set(p);
        }
    	if(item.getType() == Material.STAINED_CLAY && item.getDurability() == 15){
            SetupPartGames.mining_spawn_spectator_set(p);
        }
    }
	  if (Manager.getStage() == GameStage.LOBBY){
    if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
       if(p.getItemInHand().getType() == Material.PUMPKIN){
        	TeamSelector.show(p);
       }
            if(p.getItemInHand().getType() == Material.COMPASS){
            	p.performCommand("cosmetic");
        }
    }
	  }
    }
    }
   

  




