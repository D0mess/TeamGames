
package me.D0mess.TG;

import me.D0mess.TG.gamemanagement.Locations;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class SetupPartGames {
	
	public static void lobby_spawn_set(Player p){
    	Locations.setLocation("lobby", p.getLocation(), true);
    	p.sendMessage("§b§lGlobal lobby location §eset");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("lobby", true);	  
	    TeamGames.getPlugin().saveDefaultConfig();

	}
	
	public static void end_spawn_set(Player p){
    	Locations.setLocation("end_lobby", p.getLocation(), true);
    	p.sendMessage("§b§lEnd lobby location §eset");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("end_lobby", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void swordwars_spawn_red_set(Player p){
    	Locations.setLocation("swordwars_spawn_red", p.getLocation(), true);
    	p.sendMessage("§b§lSwordWars §4§lRED §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("swordwars_spawn_red", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void swordwars_spawn_blue_set(Player p){
    	Locations.setLocation("swordwars_spawn_blue", p.getLocation(), true);
    	p.sendMessage("§b§lSwordWars §9§lBLUE §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("swordwars_spawn_blue", true);	 
	    TeamGames.getPlugin().saveConfig();
	}

	public static void swordwars_spawn_spectator_set(Player p){
    	Locations.setLocation("swordwars_spawn_spectator", p.getLocation(), true);
    	p.sendMessage("§b§lSwordWars §a§lSPECTATOR §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("swordwars_spawn_spectator", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void oitc_spawn_red_set(Player p){
    	Locations.setLocation("oitc_spawn_red", p.getLocation(), true);
    	p.sendMessage("§b§lOitc §4§lRED §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("oitc_spawn_red", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void oitc_spawn_blue_set(Player p){
    	Locations.setLocation("oitc_spawn_blue", p.getLocation(), true);
    	p.sendMessage("§b§lOitc §9§lBLUE §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("oitc_spawn_blue", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void oitc_spawn_spectator_set(Player p){
    	Locations.setLocation("oitc_spawn_spectator", p.getLocation(), true);
    	p.sendMessage("§b§lOitc §a§lSPECTATOR §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("oitc_spawn_spectator", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void hoechanger_spawn_red_set(Player p){
    	Locations.setLocation("hoechanger_spawn_red", p.getLocation(), true);
    	p.sendMessage("§b§lHoeChanger §4§lRED §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("hoechanger_spawn_red", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void hoechanger_spawn_blue_set(Player p){
    	Locations.setLocation("hoechanger_spawn_blue", p.getLocation(), true);
    	p.sendMessage("§b§lHoeChanger §9§lBLUE §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("hoechanger_spawn_blue", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void hoechanger_spawn_spectator_set(Player p){
    	Locations.setLocation("hoechanger_spawn_spectator", p.getLocation(), true);
    	p.sendMessage("§b§lHoeChanger §a§lSPECTATOR §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("hoechanger_spawn_spectator", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void paintball_spawn_red_set(Player p){
    	Locations.setLocation("paintball_spawn_red", p.getLocation(), true);
    	p.sendMessage("§b§lPaintball §4§lRED §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("paintball_spawn_red", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void paintball_spawn_blue_set(Player p){
        Locations.setLocation("paintball_spawn_blue", p.getLocation(), true);
    	p.sendMessage("§b§lPaintball §9§lBLUE §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("paintball_spawn_blue", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void paintball_spawn_spectator_set(Player p){
        Locations.setLocation("paintball_spawn_spectator", p.getLocation(), true);
    	p.sendMessage("§b§lPaintball §a§lSPECTATOR §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("paintball_spawn_spectator", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void mining_spawn_red_set(Player p){
        Locations.setLocation("mining_spawn_red", p.getLocation(), true);
    	p.sendMessage("§b§lMining §4§lRED §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("mining_spawn_red", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void mining_spawn_blue_set(Player p){
        Locations.setLocation("mining_spawn_blue", p.getLocation(), true);
    	p.sendMessage("§b§lMining §9§lBLUE §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("mining_spawn_blue", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void mining_spawn_spectator_set(Player p){
        Locations.setLocation("mining_spawn_spectator", p.getLocation(), true);
    	p.sendMessage("§b§lMining §a§lSPECTATOR §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("mining_spawn_spectator", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void firework_spawn_one_set(Player p){
        Locations.setLocation("firework_spawn_one", p.getLocation(), true);
    	p.sendMessage("§b§lEnd lobby §6§lFirework (1) §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("firework_spawn_one", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void firework_spawn_two_set(Player p){
        Locations.setLocation("firework_spawn_two", p.getLocation(), true);
    	p.sendMessage("§b§lEnd lobby §6§lFirework (2) §espawn location set");
		p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("firework_spawn_two", true);
	    TeamGames.getPlugin().saveConfig();
	}
	
	public static void disablearena(Player p){
	    TeamGames.getPlugin().getConfig().set("game_enable", false);
	     p.sendMessage("§a§l----------------------------------------");
	     p.sendMessage("§a§lArena was set §4§lDISABLED!");
	     p.sendMessage("§a§l----------------------------------------");
	     p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	}
	
    public static void checksettings(Player p){
    if ((TeamGames.getPlugin().getConfig().getBoolean("lobby") == true)  &&
    		((TeamGames.getPlugin().getConfig().getBoolean("end_lobby")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("swordwars_spawn_red")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("swordwars_spawn_blue")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("swordwars_spawn_spectator")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("oitc_spawn_red")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("oitc_spawn_blue")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("oitc_spawn_spectator")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("hoechanger_spawn_red")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("hoechanger_spawn_blue")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("hoechanger_spawn_spectator")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("paintball_spawn_red")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("paintball_spawn_blue")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("paintball_spawn_spectator")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("mining_spawn_red")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("mining_spawn_blue")) == true) &&
    		((TeamGames.getPlugin().getConfig().getBoolean("mining_spawn_spectator")) == true)) {
     p.sendMessage("§a§l----------------------------------------");
     p.sendMessage("§a§lEverything was set successfully! [✔]");
     p.sendMessage("§a§lArena was set ENABLED!");
     p.sendMessage("§a§l----------------------------------------");
     p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
	    TeamGames.getPlugin().getConfig().set("game_enable", true);
    }else{
        p.sendMessage("§a§l----------------------------------------");
        p.sendMessage("§4§lMinigame not successfully set up, because some of the location has not saved! [✖]");
        p.sendMessage("§b§lYou can check progress by command §a/teamgames setuplist");
        p.sendMessage("§bEnable = §asetup");
        p.sendMessage("§bDisable = §anot setup");
        p.sendMessage("§a§l----------------------------------------");
        p.playSound(p.getLocation(), Sound.ENTITY_WOLF_STEP, 10.0F, 10.0F);
}
    }
    }
