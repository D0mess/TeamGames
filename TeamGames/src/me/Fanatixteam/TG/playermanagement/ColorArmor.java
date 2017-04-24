package me.Fanatixteam.TG.playermanagement;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ColorArmor {
	
	public static void red_team_armor(Player p){
		
	    ItemStack red_helmet_team = new ItemStack(Material.LEATHER_HELMET);
	    LeatherArmorMeta red_helmet_teammeta = (LeatherArmorMeta) red_helmet_team.getItemMeta();
	    red_helmet_teammeta.setColor(Color.RED);
	    red_helmet_teammeta.setDisplayName("");
        red_helmet_team.setItemMeta(red_helmet_teammeta);
        
	    ItemStack red_chestplate_team = new ItemStack(Material.LEATHER_CHESTPLATE);
	    LeatherArmorMeta red_chestplate_teammeta = (LeatherArmorMeta) red_chestplate_team.getItemMeta();
	    red_chestplate_teammeta.setColor(Color.RED);
        red_chestplate_teammeta.setDisplayName("");
        red_chestplate_team.setItemMeta(red_chestplate_teammeta);
        
	    ItemStack red_leggings_team = new ItemStack(Material.LEATHER_LEGGINGS);
	    LeatherArmorMeta red_leggings_teammeta = (LeatherArmorMeta) red_leggings_team.getItemMeta();
	    red_leggings_teammeta.setColor(Color.RED);
	    red_leggings_teammeta.setDisplayName("");
        red_leggings_team.setItemMeta(red_leggings_teammeta);
        
	    ItemStack red_boots_team = new ItemStack(Material.LEATHER_BOOTS);
	    LeatherArmorMeta red_boots_teammeta = (LeatherArmorMeta) red_boots_team.getItemMeta();
	    red_boots_teammeta.setColor(Color.RED);
	    red_boots_teammeta.setDisplayName("");
	    red_boots_team.setItemMeta(red_boots_teammeta);
        
        p.getInventory().setHelmet(red_helmet_team);
        p.getInventory().setChestplate(red_chestplate_team);
        p.getInventory().setLeggings(red_leggings_team);
        p.getInventory().setBoots(red_boots_team);
	}

	public static void blue_team_armor(Player p){
		
	    ItemStack blue_helmet_team = new ItemStack(Material.LEATHER_HELMET);
	    LeatherArmorMeta blue_helmet_teammeta = (LeatherArmorMeta) blue_helmet_team.getItemMeta();
	    blue_helmet_teammeta.setColor(Color.BLUE);
	    blue_helmet_teammeta.setDisplayName("");
	    blue_helmet_team.setItemMeta(blue_helmet_teammeta);
        
	    ItemStack blue_chestplate_team = new ItemStack(Material.LEATHER_CHESTPLATE);
	    LeatherArmorMeta blue_chestplate_teammeta = (LeatherArmorMeta) blue_chestplate_team.getItemMeta();
	    blue_chestplate_teammeta.setColor(Color.BLUE);
	    blue_chestplate_teammeta.setDisplayName("");
	    blue_chestplate_team.setItemMeta(blue_chestplate_teammeta);
        
	    ItemStack blue_leggings_team = new ItemStack(Material.LEATHER_LEGGINGS);
	    LeatherArmorMeta blue_leggings_teammeta = (LeatherArmorMeta) blue_leggings_team.getItemMeta();
	    blue_leggings_teammeta.setColor(Color.BLUE);
	    blue_leggings_teammeta.setDisplayName("");
	    blue_leggings_team.setItemMeta(blue_leggings_teammeta);
        
	    ItemStack blue_boots_team = new ItemStack(Material.LEATHER_BOOTS);
	    LeatherArmorMeta blue_boots_teammeta = (LeatherArmorMeta) blue_boots_team.getItemMeta();
	    blue_boots_teammeta.setColor(Color.BLUE);
	    blue_boots_teammeta.setDisplayName("");
	    blue_boots_team.setItemMeta(blue_boots_teammeta);
        
        p.getInventory().setHelmet(blue_helmet_team);
        p.getInventory().setChestplate(blue_chestplate_team);
        p.getInventory().setLeggings(blue_leggings_team);
        p.getInventory().setBoots(blue_boots_team);
	}
	
}
