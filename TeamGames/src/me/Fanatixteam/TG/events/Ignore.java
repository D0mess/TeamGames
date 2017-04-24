package me.Fanatixteam.TG.events;

import me.Fanatixteam.TG.TeamGames;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;

public class Ignore implements Listener{
	
	@EventHandler (ignoreCancelled = true)
	public void onArmorSlot(InventoryClickEvent event) {
		if (TeamGames.getPlugin().getConfig().getBoolean("game_enable") == true) {
	    if (event.getSlotType().equals(SlotType.ARMOR) && !event.getCurrentItem().getType().equals(Material.AIR))
	        event.setCancelled(true);
		}else{
	        event.setCancelled(false);

	}

}

}
