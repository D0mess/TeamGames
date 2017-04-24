package me.Fanatixteam.TG.gui;

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

public class Spectator implements Listener{
	
	public static void show(Player p)
	  {
	    Inventory inv = Bukkit.createInventory(null, 27, "Fly settings");
	    

	    ItemStack speedI = new ItemStack(Material.LEATHER_BOOTS);
	    ItemMeta speedImeta = speedI.getItemMeta();
	    speedImeta.setDisplayName("§aDisable Fly");
	    speedI.setItemMeta(speedImeta);
	    
	    ItemStack speedII = new ItemStack(Material.CHAINMAIL_BOOTS);
	    ItemMeta speedIImeta = speedII.getItemMeta();
	    speedIImeta.setDisplayName("§aSpeed I");
	    speedII.setItemMeta(speedIImeta);
	    
	    ItemStack speedIII = new ItemStack(Material.IRON_BOOTS);
	    ItemMeta speedIIImeta = speedIII.getItemMeta();
	    speedIIImeta.setDisplayName("§aSpeed II");
	    speedIII.setItemMeta(speedIIImeta);
	   
	    ItemStack speedIV = new ItemStack(Material.GOLD_BOOTS);
	    ItemMeta speedIVmeta = speedIV.getItemMeta();
	    speedIVmeta.setDisplayName("§aSpeed III");
	    speedIV.setItemMeta(speedIVmeta);
	    
	    ItemStack speedV = new ItemStack(Material.DIAMOND_BOOTS);
	    ItemMeta speedVmeta = speedV.getItemMeta();
	    speedVmeta.setDisplayName("§aSpeed IV");
	    speedV.setItemMeta(speedVmeta);
	    
	    inv.setItem(11, speedI);
	    inv.setItem(12, speedII);
	    inv.setItem(13, speedIII);
	    inv.setItem(14, speedIV);
	    inv.setItem(15, speedV);

	    p.openInventory(inv);
	  }
	  
@EventHandler
public void onInventoryClick(InventoryClickEvent e)
{
if (!e.getInventory().getName().equalsIgnoreCase("Fly settings")) {
  return;
}
Player p = (Player)e.getWhoClicked();
if (e.getCurrentItem() == null) {
e.setCancelled(true);
}
if (e.getSlot() == 11)
{
e.setCancelled(true);
            p.setAllowFlight(false);
            p.setFlying(false);
            p.playSound(p.getLocation(), Sound.BLOCK_SAND_FALL, 10.0F, 10.0F);

}
if (e.getSlot() == 12)
{
e.setCancelled(true);
         p.setAllowFlight(true);
         p.setFlying(true);
         p.setFlySpeed(0.1F);
		 p.playSound(p.getLocation(), Sound.BLOCK_SAND_FALL, 10.0F, 10.0F);

}
if (e.getSlot() == 13)
{
e.setCancelled(true);
         p.setAllowFlight(true);
         p.setFlying(true);
         p.setFlySpeed(0.2F);
		 p.playSound(p.getLocation(), Sound.BLOCK_SAND_FALL, 10.0F, 10.0F);

}
if (e.getSlot() == 14)
{
e.setCancelled(true);
         p.setAllowFlight(true);
         p.setFlying(true);
         p.setFlySpeed(0.3F);
		 p.playSound(p.getLocation(), Sound.BLOCK_SAND_FALL, 10.0F, 10.0F);

}
if (e.getSlot() == 15)
{
e.setCancelled(true);
         p.setAllowFlight(true);
         p.setFlying(true); 
         p.setFlySpeed(0.4F);
		 p.playSound(p.getLocation(), Sound.BLOCK_SAND_FALL, 10.0F, 10.0F);

}
}
}
