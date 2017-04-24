package me.Fanatixteam.TG.games;

import me.Fanatixteam.TG.GetterInt;
import me.Fanatixteam.TG.actionbar.ActionBar;
import me.Fanatixteam.TG.couldown.gamescouldown.OITCCouldown;
import me.Fanatixteam.TG.couldown.gamescouldown.SwordWarsCouldown;
import me.Fanatixteam.TG.gamemanagement.GameStage;
import me.Fanatixteam.TG.gamemanagement.Locations;
import me.Fanatixteam.TG.gamemanagement.Manager;
import me.Fanatixteam.TG.gamemanagement.Team;
import me.Fanatixteam.TG.playermanagement.ColorArmor;
import me.Fanatixteam.TG.playermanagement.Inventory;
import me.Fanatixteam.TG.playermanagement.Players;

import org.bukkit.entity.Player;

public class OITC {
	
	public static void OITC_Info(Player p){
		p.sendMessage("§7▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
		p.sendMessage("");
		p.sendMessage("§fGame: §dOneInTheChamber");
		p.sendMessage("");
		p.sendMessage("§a" + "⌛ " + "Win team who reaches " + GetterInt.oitc_kills_to_win() + " kills");
		p.sendMessage("§a" + "⌛ " + "Win team who reaches the most kills the end of time");
		p.sendMessage("");
		p.sendMessage("§7▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");

			
	}
	public static void oitc_start(Player p){
	  if (Manager.getStage() == GameStage.OITC){
		   OITCCouldown.startLobby(p);
		    OITC.OITC_Info(p);
		     Inventory.oitc_inv(p);
			if (Players.getTeam(p.getPlayer()).equals(Team.RED)){
	           	p.teleport(Locations.getLocation("oitc_spawn_red", true));
	 	  	    ColorArmor.red_team_armor(p);
			      ActionBar.sendActionBarTime(p, "§4You are in RED team",40);
			}
			else if (Players.getTeam(p.getPlayer()).equals(Team.BLUE)){
			  	   ColorArmor.blue_team_armor(p);
	           	p.teleport(Locations.getLocation("oitc_spawn_blue", true));
			      ActionBar.sendActionBarTime(p, "§9You are in BLUE team",40);
	}
	 }
	}
}