package me.D0mess.TG.gui.shop;

import java.util.ArrayList;

import me.D0mess.TG.GetterInt;
import me.D0mess.TG.gamemanagement.ProfileStats;




import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class SwordWarsShop implements Listener{
	
	public static String canttrade = "§cNot enough gold!";
	public static String cantrade = "§eClick to trade!";

	public static void show(Player p)
	  {
	    Inventory inv = Bukkit.createInventory(null, 36, "SwordWars shop");
	    
	    ArrayList<String> ironhelmetlore = new ArrayList<String>();
	    ItemStack ironhelmet = new ItemStack(Material.IRON_HELMET);
	    ItemMeta ironhelmetmeta = ironhelmet.getItemMeta();
	    ironhelmetmeta.setDisplayName("§bIron Helmet");
	    ironhelmetlore.add("§7Cost:");

        
      if (((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() >= GetterInt.swordwars_shop_iron_helmet_cost()) {
    	  ironhelmetlore.add("§a" + GetterInt.swordwars_shop_iron_helmet_cost() + " Golds" + " (" + ((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() + ")");
    	  ironhelmetlore.add("");
    	  ironhelmetlore.add(cantrade);
          ironhelmetmeta.setLore(ironhelmetlore);
	      ironhelmet.setItemMeta(ironhelmetmeta);
	    
	  }else{
		  
    	  ironhelmetlore.add("§4" + GetterInt.swordwars_shop_iron_helmet_cost() + " Golds" + " (" + ((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() + ")");
    	  ironhelmetlore.add("");
    	  ironhelmetlore.add(canttrade);
          ironhelmetmeta.setLore(ironhelmetlore);
	      ironhelmet.setItemMeta(ironhelmetmeta);    		
	  }
      
	    ArrayList<String> ironchestplatelore = new ArrayList<String>();
	    ItemStack ironchestplate = new ItemStack(Material.IRON_CHESTPLATE);
	    ItemMeta ironchestplatemeta = ironchestplate.getItemMeta();
	    ironchestplatemeta.setDisplayName("§bIron Chestplate");
	    ironchestplatelore.add("§7Cost:");

      
    if (((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() >= GetterInt.swordwars_shop_iron_chestplate_cost()) {
    	ironchestplatelore.add("§a" + GetterInt.swordwars_shop_iron_chestplate_cost() + " Golds" + " (" + ((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() + ")");
    	ironchestplatelore.add("");
    	ironchestplatelore.add(cantrade);
    	ironchestplatemeta.setLore(ironchestplatelore);
        ironchestplate.setItemMeta(ironchestplatemeta);
	    
	  }else{
		  
		  ironchestplatelore.add("§4" + GetterInt.swordwars_shop_iron_chestplate_cost() + " Golds" + " (" + ((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() + ")");
		  ironchestplatelore.add("");
		  ironchestplatelore.add(canttrade);
		  ironchestplatemeta.setLore(ironchestplatelore);
        ironchestplate.setItemMeta(ironchestplatemeta);    		
	  }
    
    ArrayList<String> ironleggingslore = new ArrayList<String>();
    ItemStack ironleggings = new ItemStack(Material.IRON_LEGGINGS);
    ItemMeta ironleggingsmeta = ironleggings.getItemMeta();
    ironleggingsmeta.setDisplayName("§bIron Leggings");
    ironleggingslore.add("§7Cost:");

  
if (((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() >= GetterInt.swordwars_shop_iron_leggings_cost()) {
	ironleggingslore.add("§a" + GetterInt.swordwars_shop_iron_leggings_cost() + " Golds" + " (" + ((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() + ")");
	ironleggingslore.add("");
	ironleggingslore.add(cantrade);
	ironleggingsmeta.setLore(ironleggingslore);
	ironleggings.setItemMeta(ironleggingsmeta);
    
  }else{
	  
	  ironleggingslore.add("§4" + GetterInt.swordwars_shop_iron_leggings_cost() + " Golds" + " (" + ((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() + ")");
	  ironleggingslore.add("");
	  ironleggingslore.add(canttrade);
	  ironleggingsmeta.setLore(ironleggingslore);
	  ironleggings.setItemMeta(ironleggingsmeta);
  }    
       ArrayList<String> ironbootslore = new ArrayList<String>();
       ItemStack ironboots = new ItemStack(Material.IRON_BOOTS);
       ItemMeta ironbootsmeta = ironboots.getItemMeta();
       ironbootsmeta.setDisplayName("§bIron Boots");
       ironbootslore.add("§7Cost:");


       if (((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() >= GetterInt.swordwars_shop_iron_boots_cost()) {
    	   ironbootslore.add("§a" + GetterInt.swordwars_shop_iron_boots_cost() + " Golds" + " (" + ((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() + ")");
    	   ironbootslore.add("");
    	   ironbootslore.add(cantrade);
    	   ironbootsmeta.setLore(ironbootslore);
    	   ironboots.setItemMeta(ironbootsmeta);

     }else{
  
    	 ironbootslore.add("§4" + GetterInt.swordwars_shop_iron_boots_cost() + " Golds" + " (" + ((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() + ")");
        ironbootslore.add("");
        ironbootslore.add(canttrade);
        ironbootsmeta.setLore(ironbootslore);
        ironboots.setItemMeta(ironbootsmeta);
         }
       
       ArrayList<String> ironswordlore = new ArrayList<String>();
       ItemStack ironsword = new ItemStack(Material.IRON_SWORD);
       ItemMeta ironswordmeta = ironsword.getItemMeta();
       ironswordmeta.setDisplayName("§bIron Sword");
       ironswordlore.add("§7Cost:");


       if (((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() >= GetterInt.swordwars_shop_iron_sword_cost()) {
    	   ironswordlore.add("§a" + GetterInt.swordwars_shop_iron_sword_cost() + " Golds" + " (" + ((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() + ")");
    	   ironswordlore.add("");
    	   ironswordlore.add(cantrade);
    	   ironswordmeta.setLore(ironswordlore);
    	   ironsword.setItemMeta(ironswordmeta);

     }else{
  
    	 ironswordlore.add("§4" + GetterInt.swordwars_shop_iron_sword_cost() + " Golds" + " (" + ((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() + ")");
    	 ironswordlore.add("");
        ironswordlore.add(canttrade);
        ironswordmeta.setLore(ironswordlore);
        ironsword.setItemMeta(ironswordmeta);
         }

	    inv.setItem(11, ironhelmet);
	    inv.setItem(12, ironchestplate);
	    inv.setItem(13, ironleggings);
	    inv.setItem(14, ironboots);
	    inv.setItem(15, ironsword);

	    p.openInventory(inv);
	  }
	  
@EventHandler
public void onInventoryClick(InventoryClickEvent e)
{
if (!e.getInventory().getName().equalsIgnoreCase("SwordWars shop")) {
  return;
}
Player p = (Player)e.getWhoClicked();
if (e.getCurrentItem() == null) {
e.setCancelled(true);
}
if (e.getSlot() == 11)
{
e.setCancelled(true);
if (((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() >= GetterInt.swordwars_shop_iron_helmet_cost()) {

      ProfileStats.swordwars_gold.put(p.getName(), Integer.valueOf(((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() -GetterInt.swordwars_shop_iron_helmet_cost()));
	    ItemStack iron_helmet = new ItemStack(Material.IRON_HELMET);
      p.getInventory().setHelmet(iron_helmet);
      p.sendMessage("§eBought §bIron Helmet");
      SwordWarsShop.show(p);
}else {
	p.sendMessage(canttrade);
}
}
if (e.getSlot() == 12)
{
e.setCancelled(true);
if (((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() >= GetterInt.swordwars_shop_iron_chestplate_cost()) {

      ProfileStats.swordwars_gold.put(p.getName(), Integer.valueOf(((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() -GetterInt.swordwars_shop_iron_chestplate_cost()));
	    ItemStack iron_chestplate = new ItemStack(Material.IRON_CHESTPLATE);
	    p.getInventory().setChestplate(iron_chestplate);
	      p.sendMessage("§eBought §bIron Chesplate");

}else {
	p.sendMessage(canttrade);
}
}
if (e.getSlot() == 13)
{
e.setCancelled(true);
if (((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() >= GetterInt.swordwars_shop_iron_leggings_cost()) {

      ProfileStats.swordwars_gold.put(p.getName(), Integer.valueOf(((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() -GetterInt.swordwars_shop_iron_leggings_cost()));
	    ItemStack iron_leggings = new ItemStack(Material.IRON_LEGGINGS);
	    p.getInventory().setLeggings(iron_leggings);
	      p.sendMessage("§eBought §bIron Leggings");

}else {
	p.sendMessage(canttrade);
}
}
if (e.getSlot() == 14)
{
e.setCancelled(true);
if (((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() >= GetterInt.swordwars_shop_iron_boots_cost()) {

      ProfileStats.swordwars_gold.put(p.getName(), Integer.valueOf(((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() -GetterInt.swordwars_shop_iron_boots_cost()));
	    ItemStack iron_boots = new ItemStack(Material.IRON_BOOTS);
	    p.getInventory().setBoots(iron_boots);
	      p.sendMessage("§eBought §bIron Boots");

}else {
	p.sendMessage(canttrade);
}
}
if (e.getSlot() == 15)
{
e.setCancelled(true);
if (((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() >= GetterInt.swordwars_shop_iron_sword_cost()) {

      ProfileStats.swordwars_gold.put(p.getName(), Integer.valueOf(((Integer)ProfileStats.swordwars_gold.get(p.getName())).intValue() -GetterInt.swordwars_shop_iron_sword_cost()));
      PlayerInventory inventory = p.getInventory();
      inventory.addItem(new ItemStack(Material.IRON_SWORD));
      p.sendMessage("§eBought §bIron Sword");

}else {
	p.sendMessage(canttrade);
}
}    
}    
}




