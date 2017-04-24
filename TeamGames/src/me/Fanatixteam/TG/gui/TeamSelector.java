package me.Fanatixteam.TG.gui;

import java.util.ArrayList;

import me.Fanatixteam.TG.gamemanagement.Team;
import me.Fanatixteam.TG.playermanagement.Players;
import me.Fanatixteam.TG.playermanagement.Teams;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class TeamSelector implements Listener{

	public static void show(Player p)
	  {
	    Inventory inv = Bukkit.createInventory(null, 9, "Choose team");
	    
	    ArrayList<String> redlore = new ArrayList<String>();

	    ItemStack red = new ItemStack(Material.STAINED_CLAY, 1, (short) 14);
	    ItemMeta redmeta = red.getItemMeta();
	    redmeta.setDisplayName("§cRed");
        redlore.add("");
        redlore.add("§6Players: " + Teams.red.size());
        redmeta.setLore(redlore);
	    red.setItemMeta(redmeta);
	    
	    ArrayList<String> bluelore = new ArrayList<String>();

	    ItemStack blue = new ItemStack(Material.STAINED_CLAY, 1, (short) 11);
	    ItemMeta bluemeta = blue.getItemMeta();
	    bluemeta.setDisplayName("§9Blue");
        bluelore.add("");
        bluelore.add("§6Players: " + Teams.blue.size());
        bluemeta.setLore(bluelore);
	    blue.setItemMeta(bluemeta);
	    		
	    
	    inv.setItem(2, red);
	    inv.setItem(6, blue);

	    p.openInventory(inv);
	  }
	  
@EventHandler
public void onInventoryClick(InventoryClickEvent e)
{
  if (!e.getInventory().getName().equalsIgnoreCase("Choose team")) {
    return;
  }
Player p = (Player)e.getWhoClicked();
if (e.getCurrentItem() == null) {
  e.setCancelled(true);
}
if (e.getSlot() == 2)
{
  e.setCancelled(true);
	if (Players.getTeam(p.getPlayer()).equals(Team.RED)){
	     p.sendMessage("§eYou are already in §4RED §eteam!");
		 p.playSound(p.getLocation(), Sound.BLOCK_SAND_FALL, 10.0F, 10.0F);

	}else{
		Teams.redTeam(p);
  }
  }
if (e.getSlot() == 6)
{
  e.setCancelled(true);
  p.sendMessage("Team " + Players.getTeam(p.getPlayer()));
  if (Players.getTeam(p.getPlayer()).equals(Team.BLUE)){
	     p.sendMessage("§eYou are already in §9BLUE §eteam!");
		 p.playSound(p.getLocation(), Sound.BLOCK_SAND_FALL, 10.0F, 10.0F);
	}else{
	    Teams.blueTeam(p);
  }
	      }    
}
}
