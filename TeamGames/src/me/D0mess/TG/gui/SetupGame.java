package me.D0mess.TG.gui;

import java.util.ArrayList;
import java.util.List;




import me.D0mess.TG.SetupPartGames;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SetupGame implements Listener{

	public static List<String> globallobby = new ArrayList();
	public static List<String> endlobby = new ArrayList();
	public static List<String> swordwars = new ArrayList();
	public static List<String> oitc = new ArrayList();
	public static List<String> hoechanger = new ArrayList();
	public static List<String> paintball = new ArrayList();
	public static List<String> mining = new ArrayList();

	public static void show(Player p)
	  {
	    Inventory inv = Bukkit.createInventory(null, 54, "Setup menu");
	    
	    ArrayList<String> globallobbylore = new ArrayList<String>();

	    ItemStack globallobby = new ItemStack(Material.STAINED_CLAY, 1, (short) 1);
	    ItemMeta globallobbymeta = globallobby.getItemMeta();
	    globallobbymeta.setDisplayName("§3Global Lobby setup");
	    globallobbylore.add("");
	    globallobbylore.add("Click to obtain items for settings §6Global locations");
	    globallobbymeta.setLore(globallobbylore);
	    globallobby.setItemMeta(globallobbymeta);
	     
	    ArrayList<String> endlobbylore = new ArrayList<String>();

	    ItemStack endlobby = new ItemStack(Material.STAINED_CLAY, 1, (short) 4);
	    ItemMeta endlobbymeta = endlobby.getItemMeta();
	    endlobbymeta.setDisplayName("§3End Lobby setup");
	    endlobbylore.add("");
	    endlobbylore.add("Click to obtain items for settings §6End locations + fireworks");
	    endlobbymeta.setLore(endlobbylore);
	    endlobby.setItemMeta(endlobbymeta);
	    
	    ArrayList<String> swordwarslore = new ArrayList<String>();

	    ItemStack swordwars = new ItemStack(Material.IRON_SWORD, 1);
	    ItemMeta swordwarsmeta = swordwars.getItemMeta();
	    swordwarsmeta.setDisplayName("§3SwordWars setup");
	    swordwarslore.add("");
	    swordwarslore.add("Right-click to obtain items for settings §6SwordWars");
	    swordwarsmeta.setLore(swordwarslore);
	    swordwars.setItemMeta(swordwarsmeta);
	    
	    ArrayList<String> oitclore = new ArrayList<String>();

	    ItemStack oitc = new ItemStack(Material.BOW, 1);
	    ItemMeta oitcmeta = oitc.getItemMeta();
	    oitcmeta.setDisplayName("§3OneInTheChamber setup");
	    oitclore.add("");
	    oitclore.add("Right-click to obtain items for settings §6OneInTheChamber");
	    oitcmeta.setLore(oitclore);
	    oitc.setItemMeta(oitcmeta);
	    oitc.setItemMeta(oitcmeta);
	    
	    ArrayList<String> hoechangerlore = new ArrayList<String>();

	    ItemStack hoechanger = new ItemStack(Material.DIAMOND_HOE, 1);
	    ItemMeta hoechangermeta = hoechanger.getItemMeta();
	    hoechangermeta.setDisplayName("§3HoeChanger setup");
	    hoechangerlore.add("");
	    hoechangerlore.add("Right-click to obtain items for settings §6HoeChanger");
	    hoechangermeta.setLore(hoechangerlore);
	    hoechanger.setItemMeta(hoechangermeta);
	    hoechanger.setItemMeta(hoechangermeta);
	    		
	    ArrayList<String> paintballlore = new ArrayList<String>();

	    ItemStack paintball = new ItemStack(Material.SNOW_BALL, 1);
	    ItemMeta paintballmeta = paintball.getItemMeta();
	    paintballmeta.setDisplayName("§3Paintball setup");
	    paintballlore.add("");
	    paintballlore.add("Right-click to obtain items for settings §6Paintball");
	    paintballmeta.setLore(paintballlore);
	    paintball.setItemMeta(paintballmeta);
	    paintball.setItemMeta(paintballmeta);
	    
	    ArrayList<String> mininglore = new ArrayList<String>();

	    ItemStack mining = new ItemStack(Material.GOLD_PICKAXE, 1);
	    ItemMeta miningmeta = mining.getItemMeta();
	    miningmeta.setDisplayName("§3Mining setup");
	    mininglore.add("");
	    mininglore.add("Right-click to obtain items for settings §6Mining");
	    miningmeta.setLore(mininglore);
	    mining.setItemMeta(miningmeta);
	    mining.setItemMeta(miningmeta);
	    
	    ArrayList<String> enablearenalore = new ArrayList<String>();

	    ItemStack enablearena = new ItemStack(Material.GOLD_PICKAXE, 1);
	    ItemMeta enablearenameta = enablearena.getItemMeta();
	    enablearenameta.setDisplayName("§a§lEnable Arena");
	    enablearenalore.add("");
	    enablearenalore.add("You must have all locations setup (/teamgames setuplist)");
	    enablearenalore.add("Right-click to enable global arena §l§6Team Games");
	    enablearenameta.setLore(enablearenalore);
	    enablearena.setItemMeta(enablearenameta);
	    enablearena.setItemMeta(enablearenameta);
	    
	    ArrayList<String> disablearenalore = new ArrayList<String>();

	    ItemStack disablearena = new ItemStack(Material.GOLD_PICKAXE, 1);
	    ItemMeta disablearenameta = disablearena.getItemMeta();
	    disablearenameta.setDisplayName("§4§lDisable Arena");
	    disablearenalore.add("");
	    disablearenalore.add("Right-click to disable global arena §l§6Team Games");
	    disablearenameta.setLore(disablearenalore);
	    disablearena.setItemMeta(disablearenameta);
	    disablearena.setItemMeta(disablearenameta);
	    
	    
	    inv.setItem(12, globallobby);
	    inv.setItem(14, endlobby);

	    
	    inv.setItem(20, swordwars);
	    inv.setItem(21, oitc);
	    inv.setItem(22, hoechanger);
	    inv.setItem(23, paintball);
	    inv.setItem(24, mining);
	    
	    inv.setItem(39, disablearena);
	    inv.setItem(41, enablearena);
	    p.openInventory(inv);
	  }
	  
@EventHandler
public void onInventoryClick(InventoryClickEvent e)
{
if (!e.getInventory().getName().equalsIgnoreCase("Setup menu")) {
  return;
}
Player p = (Player)e.getWhoClicked();
if (e.getCurrentItem() == null) {
e.setCancelled(true);
}
if (e.getSlot() == 12)
{
e.setCancelled(true);
this.globallobby.add(p.getName());
this.endlobby.remove(p.getName());
this.swordwars.remove(p.getName());
this.oitc.remove(p.getName());
this.hoechanger.remove(p.getName());
this.paintball.remove(p.getName());
this.mining.remove(p.getName());
me.D0mess.TG.playermanagement.Inventory.lobby_set_inventory(p);
p.closeInventory();
}
if (e.getSlot() == 14)
{
e.setCancelled(true);
this.endlobby.add(p.getName());
this.globallobby.remove(p.getName());
this.swordwars.remove(p.getName());
this.oitc.remove(p.getName());
this.hoechanger.remove(p.getName());
this.paintball.remove(p.getName());
this.mining.remove(p.getName());
me.D0mess.TG.playermanagement.Inventory.end_set_inventory(p);
p.closeInventory();
}
if (e.getSlot() == 20)
{
e.setCancelled(true);
this.swordwars.add(p.getName());
this.endlobby.remove(p.getName());
this.globallobby.remove(p.getName());
this.oitc.remove(p.getName());
this.hoechanger.remove(p.getName());
this.paintball.remove(p.getName());
this.mining.remove(p.getName());
me.D0mess.TG.playermanagement.Inventory.swordwars_set_inventory(p);
p.closeInventory();
}
if (e.getSlot() == 21)
{
e.setCancelled(true);
this.swordwars.remove(p.getName());
this.endlobby.remove(p.getName());
this.globallobby.remove(p.getName());
this.swordwars.remove(p.getName());
this.oitc.add(p.getName());
this.hoechanger.remove(p.getName());
this.paintball.remove(p.getName());
this.mining.remove(p.getName());
me.D0mess.TG.playermanagement.Inventory.oitc_set_inventory(p);
p.closeInventory();
}
if (e.getSlot() == 22)
{
e.setCancelled(true);
this.swordwars.remove(p.getName());
this.globallobby.remove(p.getName());
this.endlobby.remove(p.getName());
this.swordwars.remove(p.getName());
this.oitc.remove(p.getName());
this.hoechanger.add(p.getName());
this.paintball.remove(p.getName());
this.mining.remove(p.getName());
me.D0mess.TG.playermanagement.Inventory.hoechanger_set_inventory(p);
p.closeInventory();
}
if (e.getSlot() == 23)
{
e.setCancelled(true);
this.swordwars.remove(p.getName());
this.globallobby.remove(p.getName());
this.endlobby.remove(p.getName());
this.swordwars.remove(p.getName());
this.oitc.remove(p.getName());
this.hoechanger.remove(p.getName());
this.paintball.add(p.getName());
this.mining.remove(p.getName());me.D0mess.TG.playermanagement.Inventory.paintball_set_inventory(p);
p.closeInventory();
}
if (e.getSlot() == 24)
{
e.setCancelled(true);
this.swordwars.remove(p.getName());
this.globallobby.remove(p.getName());
this.swordwars.remove(p.getName());
this.oitc.remove(p.getName());
this.endlobby.remove(p.getName());
this.hoechanger.remove(p.getName());
this.paintball.remove(p.getName());
this.mining.add(p.getName());
me.D0mess.TG.playermanagement.Inventory.mining_set_inventory(p);
p.closeInventory();
}
if (e.getSlot() == 39)
{
e.setCancelled(true);
SetupPartGames.disablearena(p);
p.getInventory().clear();
}
if (e.getSlot() == 41)
{
e.setCancelled(true);
SetupPartGames.checksettings(p);
p.getInventory().clear();
}
}
}