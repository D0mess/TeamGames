package me.D0mess.TG.games;

import me.D0mess.TG.GetterInt;
import me.D0mess.TG.actionbar.ActionBar;
import me.D0mess.TG.couldown.gamescouldown.HoeChangerCouldown;
import me.D0mess.TG.couldown.gamescouldown.OITCCouldown;
import me.D0mess.TG.gamemanagement.GameStage;
import me.D0mess.TG.gamemanagement.Locations;
import me.D0mess.TG.gamemanagement.Manager;
import me.D0mess.TG.gamemanagement.Team;
import me.D0mess.TG.playermanagement.ColorArmor;
import me.D0mess.TG.playermanagement.Inventory;
import me.D0mess.TG.playermanagement.Players;

import org.bukkit.entity.Player;

public class HoeChanger {

	public static void HoeChanger_Info(Player p){
		p.sendMessage("§7▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
		p.sendMessage("");
		p.sendMessage("§fGame: §dHoeChanger");
		p.sendMessage("");
		p.sendMessage("§a" + "⌛ " + "Win team who reaches " + GetterInt.hoechanger_change_blocks_to_win() + " changed blocks");
		p.sendMessage("§a" + "⌛ " + "Win team who reaches the most changed blocks the end of time");
		p.sendMessage("");
		p.sendMessage("§7▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");

			
	}
	public static void hoechanger_start(Player p){
	  if (Manager.getStage() == GameStage.HOECHANGER){
		   HoeChangerCouldown.startLobby(p);
		    HoeChanger.HoeChanger_Info(p);
		     Inventory.hoechanger_inv(p);
			if (Players.getTeam(p.getPlayer()).equals(Team.RED)){
	           	p.teleport(Locations.getLocation("hoechanger_spawn_red", true));
	 	  	    ColorArmor.red_team_armor(p);
			      ActionBar.sendActionBarTime(p, "§4You are in RED team",40);
			}
			else if (Players.getTeam(p.getPlayer()).equals(Team.BLUE)){
			  	   ColorArmor.blue_team_armor(p);
	           	p.teleport(Locations.getLocation("hoechanger_spawn_blue", true));
			      ActionBar.sendActionBarTime(p, "§9You are in BLUE team",40);
	}
	 }
	}
}