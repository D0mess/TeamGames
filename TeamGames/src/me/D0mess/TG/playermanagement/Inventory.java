package me.D0mess.TG.playermanagement;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class Inventory {
	
	public static void lobby_inventory(Player p)
	{
	    ArrayList<String> teamslore = new ArrayList<String>();
	    
        ItemStack teams = new ItemStack(Material.PUMPKIN, 1);
        ItemMeta teamsmeta = teams.getItemMeta();
        teamsmeta.setDisplayName("§bChoose Team §a- §cRight-Click");        
        teamslore.add("Here you can choose team");
        teamsmeta.setLore(teamslore);		
        teams.setItemMeta(teamsmeta);
        
	    ArrayList<String> gameslore = new ArrayList<String>();
	    
        ItemStack games = new ItemStack(Material.COMPASS, 1);
        ItemMeta gamesmeta = games.getItemMeta();
        gamesmeta.setDisplayName("§6Games information §a- §cRight-Click");        
        gameslore.add("Here is information about games");
        gamesmeta.setLore(gameslore);		
        games.setItemMeta(gamesmeta);
        
  	    p.getInventory().clear();
        p.getInventory().setItem(2, teams);
        p.getInventory().setItem(6, games);

	}
	
	public static void setup_global_inventory(Player p)
	{
	    ArrayList<String> setupgloballore = new ArrayList<String>();
	    
        ItemStack setupglobal = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta setupglobalmeta = setupglobal.getItemMeta();
        setupglobalmeta.setDisplayName("§l§bSetup menu §a- §cRight-Click");        
        setupgloballore.add("Here is all settings");
        setupglobalmeta.setLore(setupgloballore);		
        setupglobal.setItemMeta(setupglobalmeta);
        
  	    p.getInventory().clear();
        p.getInventory().setItem(4, setupglobal);

	}
	
	public static void lobby_set_inventory(Player p)
	{   
        ItemStack globallobby = new ItemStack(Material.STAINED_CLAY, 1, (short) 1);
        ItemMeta globallobbymeta = globallobby.getItemMeta();
        globallobbymeta.setDisplayName("§l§3[LOBBY] §bSet §8§lLOBBY §bspawn location §a- §cRight-Click");        
        globallobby.setItemMeta(globallobbymeta);
        
        
	    ArrayList<String> setupgloballore = new ArrayList<String>();

        ItemStack setupglobal = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta setupglobalmeta = setupglobal.getItemMeta();
        setupglobalmeta.setDisplayName("§l§bSetup menu §a- §cRight-Click");        
        setupgloballore.add("Here is all settings");
        setupglobalmeta.setLore(setupgloballore);		
        setupglobal.setItemMeta(setupglobalmeta);
        
  	    p.getInventory().clear();
        p.getInventory().setItem(4, globallobby);
        p.getInventory().setItem(8, setupglobal);

	}
	
	public static void end_set_inventory(Player p)
	{   
        
        ItemStack endlobby = new ItemStack(Material.STAINED_CLAY, 1, (short) 4);
        ItemMeta endlobbymeta = endlobby.getItemMeta();
        endlobbymeta.setDisplayName("§l§3[END-LOBBY] §5Set §8§lEND (Finish) §bspawn location §a- §cRight-Click");        
        endlobby.setItemMeta(endlobbymeta);
        
        ItemStack fireworkone = new ItemStack(Material.STAINED_CLAY, 1, (short) 8);
        ItemMeta fireworkonemeta = fireworkone.getItemMeta();
        fireworkonemeta.setDisplayName("§l§3[END-LOBBY] §5Set §3§lFireworks (1) §bspawn location §a- §cRight-Click");        
        fireworkone.setItemMeta(fireworkonemeta);
        
        ItemStack fireworktwo = new ItemStack(Material.STAINED_CLAY, 1, (short) 9);
        ItemMeta fireworktwometa = fireworktwo.getItemMeta();
        fireworktwometa.setDisplayName("§l§3[END-LOBBY] §5Set §3§lFireworks (2) §bspawn location §a- §cRight-Click");        
        fireworktwo.setItemMeta(fireworktwometa);
        
	    ArrayList<String> setupgloballore = new ArrayList<String>();

        ItemStack setupglobal = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta setupglobalmeta = setupglobal.getItemMeta();
        setupglobalmeta.setDisplayName("§l§bSetup menu §a- §cRight-Click");        
        setupgloballore.add("Here is all settings");
        setupglobalmeta.setLore(setupgloballore);		
        setupglobal.setItemMeta(setupglobalmeta);
        
  	    p.getInventory().clear();
        p.getInventory().setItem(2, fireworkone);
        p.getInventory().setItem(4, endlobby);
        p.getInventory().setItem(6, fireworktwo);
        p.getInventory().setItem(8, setupglobal);

	}
	
	public static void swordwars_set_inventory(Player p)
	{   
        ItemStack redspawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 14);
        ItemMeta redspawnmeta = redspawn.getItemMeta();
        redspawnmeta.setDisplayName("§l§3[SWORD-WARS] §bSet §4§lRED TEAM §bspawn location §a- §cRight-Click");        
        redspawn.setItemMeta(redspawnmeta);
        
        ItemStack bluespawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 11);
        ItemMeta bluespawnmeta = bluespawn.getItemMeta();
        bluespawnmeta.setDisplayName("§l§3[SWORD-WARS] §bSet §9§lBLUE TEAM §bspawn location §a- §cRight-Click");        
        bluespawn.setItemMeta(bluespawnmeta);
        
        ItemStack spectatorspawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 15);
        ItemMeta spectatorspawnmeta = spectatorspawn.getItemMeta();
        spectatorspawnmeta.setDisplayName("§l§3[SWORD-WARS] §bSet §a§lSPECTATOR §bspawn location §a- §cRight-Click");        
        spectatorspawn.setItemMeta(spectatorspawnmeta);
        
	    ArrayList<String> setupgloballore = new ArrayList<String>();

        ItemStack setupglobal = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta setupglobalmeta = setupglobal.getItemMeta();
        setupglobalmeta.setDisplayName("§l§bSetup menu §a- §cRight-Click");        
        setupgloballore.add("Here is all settings");
        setupglobalmeta.setLore(setupgloballore);		
        setupglobal.setItemMeta(setupglobalmeta);
        
  	    p.getInventory().clear();
        p.getInventory().setItem(2, redspawn);
        p.getInventory().setItem(4, spectatorspawn);
        p.getInventory().setItem(6, bluespawn);

        p.getInventory().setItem(8, setupglobal);

	}
	
	public static void oitc_set_inventory(Player p)
	{   
        ItemStack redspawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 14);
        ItemMeta redspawnmeta = redspawn.getItemMeta();
        redspawnmeta.setDisplayName("§l§3[OITC] §bSet §4§lRED TEAM §bspawn location §a- §cRight-Click");        
        redspawn.setItemMeta(redspawnmeta);
        
        ItemStack bluespawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 11);
        ItemMeta bluespawnmeta = bluespawn.getItemMeta();
        bluespawnmeta.setDisplayName("§l§3[OITC] §bSet §9§lBLUE TEAM §bspawn location §a- §cRight-Click");        
        bluespawn.setItemMeta(bluespawnmeta);
        
        ItemStack spectatorspawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 15);
        ItemMeta spectatorspawnmeta = spectatorspawn.getItemMeta();
        spectatorspawnmeta.setDisplayName("§l§3[OITC] §bSet §a§lSPECTATOR §bspawn location §a- §cRight-Click");        
        spectatorspawn.setItemMeta(spectatorspawnmeta);
        
	    ArrayList<String> setupgloballore = new ArrayList<String>();

        ItemStack setupglobal = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta setupglobalmeta = setupglobal.getItemMeta();
        setupglobalmeta.setDisplayName("§l§bSetup menu §a- §cRight-Click");        
        setupgloballore.add("Here is all settings");
        setupglobalmeta.setLore(setupgloballore);		
        setupglobal.setItemMeta(setupglobalmeta);
        
  	    p.getInventory().clear();
        p.getInventory().setItem(2, redspawn);
        p.getInventory().setItem(4, spectatorspawn);
        p.getInventory().setItem(6, bluespawn);

        p.getInventory().setItem(8, setupglobal);

	}
	
	public static void hoechanger_set_inventory(Player p)
	{   
        ItemStack redspawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 14);
        ItemMeta redspawnmeta = redspawn.getItemMeta();
        redspawnmeta.setDisplayName("§l§3[HOE-CHANGER] §bSet §4§lRED TEAM §bspawn location §a- §cRight-Click");        
        redspawn.setItemMeta(redspawnmeta);
        
        ItemStack bluespawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 11);
        ItemMeta bluespawnmeta = bluespawn.getItemMeta();
        bluespawnmeta.setDisplayName("§l§3[HOE-CHANGER] §bSet §9§lBLUE TEAM §bspawn location §a- §cRight-Click");        
        bluespawn.setItemMeta(bluespawnmeta);
        
        ItemStack spectatorspawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 15);
        ItemMeta spectatorspawnmeta = spectatorspawn.getItemMeta();
        spectatorspawnmeta.setDisplayName("§l§3[HOE-CHANGER] §bSet §a§lSPECTATOR §bspawn location §a- §cRight-Click");        
        spectatorspawn.setItemMeta(spectatorspawnmeta);
        
	    ArrayList<String> setupgloballore = new ArrayList<String>();

        ItemStack setupglobal = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta setupglobalmeta = setupglobal.getItemMeta();
        setupglobalmeta.setDisplayName("§l§bSetup menu §a- §cRight-Click");        
        setupgloballore.add("Here is all settings");
        setupglobalmeta.setLore(setupgloballore);		
        setupglobal.setItemMeta(setupglobalmeta);
        
  	    p.getInventory().clear();
        p.getInventory().setItem(2, redspawn);
        p.getInventory().setItem(4, spectatorspawn);
        p.getInventory().setItem(6, bluespawn);

        p.getInventory().setItem(8, setupglobal);

	}
	
	public static void paintball_set_inventory(Player p)
	{   
        ItemStack redspawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 14);
        ItemMeta redspawnmeta = redspawn.getItemMeta();
        redspawnmeta.setDisplayName("§l§3[PAINTBALL] §bSet §4§lRED TEAM §bspawn location §a- §cRight-Click");        
        redspawn.setItemMeta(redspawnmeta);
        
        ItemStack bluespawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 11);
        ItemMeta bluespawnmeta = bluespawn.getItemMeta();
        bluespawnmeta.setDisplayName("§l§3[PAINTBALL] §bSet §9§lBLUE TEAM §bspawn location §a- §cRight-Click");        
        bluespawn.setItemMeta(bluespawnmeta);
        
        ItemStack spectatorspawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 15);
        ItemMeta spectatorspawnmeta = spectatorspawn.getItemMeta();
        spectatorspawnmeta.setDisplayName("§l§3[PAINTBALL] §bSet §a§lSPECTATOR §bspawn location §a- §cRight-Click");        
        spectatorspawn.setItemMeta(spectatorspawnmeta);
        
	    ArrayList<String> setupgloballore = new ArrayList<String>();

        ItemStack setupglobal = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta setupglobalmeta = setupglobal.getItemMeta();
        setupglobalmeta.setDisplayName("§l§bSetup menu §a- §cRight-Click");        
        setupgloballore.add("Here is all settings");
        setupglobalmeta.setLore(setupgloballore);		
        setupglobal.setItemMeta(setupglobalmeta);
        
  	    p.getInventory().clear();
        p.getInventory().setItem(2, redspawn);
        p.getInventory().setItem(4, spectatorspawn);
        p.getInventory().setItem(6, bluespawn);

        p.getInventory().setItem(8, setupglobal);

	}
	
	public static void mining_set_inventory(Player p)
	{   
        ItemStack redspawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 14);
        ItemMeta redspawnmeta = redspawn.getItemMeta();
        redspawnmeta.setDisplayName("§l§3[MINING] §bSet §4§lRED TEAM §bspawn location §a- §cRight-Click");        
        redspawn.setItemMeta(redspawnmeta);
        
        ItemStack bluespawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 11);
        ItemMeta bluespawnmeta = bluespawn.getItemMeta();
        bluespawnmeta.setDisplayName("§l§3[MINING] §bSet §9§lBLUE TEAM §bspawn location §a- §cRight-Click");        
        bluespawn.setItemMeta(bluespawnmeta);
        
        ItemStack spectatorspawn = new ItemStack(Material.STAINED_CLAY, 1, (short) 15);
        ItemMeta spectatorspawnmeta = spectatorspawn.getItemMeta();
        spectatorspawnmeta.setDisplayName("§l§3[MINING] §bSet §a§lSPECTATOR §bspawn location §a- §cRight-Click");        
        spectatorspawn.setItemMeta(spectatorspawnmeta);
        
	    ArrayList<String> setupgloballore = new ArrayList<String>();

        ItemStack setupglobal = new ItemStack(Material.NETHER_STAR, 1);
        ItemMeta setupglobalmeta = setupglobal.getItemMeta();
        setupglobalmeta.setDisplayName("§l§bSetup menu §a- §cRight-Click");        
        setupgloballore.add("Here is all settings");
        setupglobalmeta.setLore(setupgloballore);		
        setupglobal.setItemMeta(setupglobalmeta);
        
  	    p.getInventory().clear();
        p.getInventory().setItem(2, redspawn);
        p.getInventory().setItem(4, spectatorspawn);
        p.getInventory().setItem(6, bluespawn);

        p.getInventory().setItem(8, setupglobal);

	}
	
	public static void swordwars_inv(Player p){
        ItemStack defaultsword = new ItemStack(Material.WOOD_SWORD);
        ItemMeta defaultswordmeta = defaultsword.getItemMeta();
        defaultswordmeta.setDisplayName("§8Default Sword");        
        defaultsword.setItemMeta(defaultswordmeta);
        
        ItemStack shop = new ItemStack(Material.GOLD_NUGGET);
        ItemMeta shopmeta = shop.getItemMeta();
        shopmeta.setDisplayName("§6Shop");        
        shop.setItemMeta(shopmeta);
        
  	    p.getInventory().clear();
        p.getInventory().setItem(0, defaultsword);
        p.getInventory().setItem(8, shop);
	}
	
	public static void oitc_inv(Player p){
		
        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bowmeta = bow.getItemMeta();
        bowmeta.setDisplayName("§8Archer bow");        
        bow.setItemMeta(bowmeta);
        
        PlayerInventory inventory = p.getInventory();
        
  	    p.getInventory().clear();
        p.getInventory().setItem(0, bow);
        inventory.addItem(new ItemStack(Material.ARROW));
	}
	
	public static void hoechanger_inv(Player p){
		
        ItemStack converter = new ItemStack(Material.STONE_HOE);
        ItemMeta convertermeta = converter.getItemMeta();
        convertermeta.setDisplayName("§8Converter");        
        converter.setItemMeta(convertermeta);
        
        
  	    p.getInventory().clear();
        p.getInventory().setItem(0, converter);
	}

	public static void paintball_inv(Player p){
		
        ItemStack snowball = new ItemStack(Material.SNOW_BALL, 16);
        ItemMeta snowballmeta = snowball.getItemMeta();
        snowballmeta.setDisplayName("§8Snowball");        
        snowball.setItemMeta(snowballmeta);
        
        ItemStack woodspade = new ItemStack(Material.WOOD_SPADE);
        ItemMeta woodspademeta = woodspade.getItemMeta();
        woodspademeta.setDisplayName("§8Spade");        
        woodspade.setItemMeta(woodspademeta);
        
  	    p.getInventory().clear();
        p.getInventory().setItem(0, snowball);
        p.getInventory().setItem(1, woodspade);

	}
	
	public static void mining_inv(Player p){
		
        ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta pickaxemeta = pickaxe.getItemMeta();
        pickaxemeta.setDisplayName("§8Pickaxe");        
        pickaxe.setItemMeta(pickaxemeta);
        
        
  	    p.getInventory().clear();
        p.getInventory().setItem(0, pickaxe);

	}
}
