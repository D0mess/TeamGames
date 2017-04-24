package me.Fanatixteam.TG.games;

import me.Fanatixteam.TG.GetterInt;
import me.Fanatixteam.TG.actionbar.ActionBar;
import me.Fanatixteam.TG.couldown.gamescouldown.OITCCouldown;
import me.Fanatixteam.TG.couldown.gamescouldown.PaintballCouldown;
import me.Fanatixteam.TG.gamemanagement.GameStage;
import me.Fanatixteam.TG.gamemanagement.Locations;
import me.Fanatixteam.TG.gamemanagement.Manager;
import me.Fanatixteam.TG.gamemanagement.Team;
import me.Fanatixteam.TG.playermanagement.ColorArmor;
import me.Fanatixteam.TG.playermanagement.Inventory;
import me.Fanatixteam.TG.playermanagement.Players;

import org.bukkit.entity.Player;

public class Paintball {

	public static void Paintball_Info(Player p){
		p.sendMessage("§7▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
		p.sendMessage("");
		p.sendMessage("§fGame: §dPaintball");
		p.sendMessage("");
		p.sendMessage("§a" + "⌛ " + "Win team who reaches " + GetterInt.paintball_kills_to_win() + " kills");
		p.sendMessage("§a" + "⌛ " + "Win team who reaches the most kills the end of time");
		p.sendMessage("");
		p.sendMessage("§7▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");

			
	}
	public static void paintball_start(Player p){
	  if (Manager.getStage() == GameStage.PAINTBALL){
		   PaintballCouldown.startLobby(p);
		    Paintball.Paintball_Info(p);
		     Inventory.paintball_inv(p);
			if (Players.getTeam(p.getPlayer()).equals(Team.RED)){
	           	p.teleport(Locations.getLocation("paintball_spawn_red", true));
	 	  	    ColorArmor.red_team_armor(p);
			      ActionBar.sendActionBarTime(p, "§4You are in RED team",40);
			}
			else if (Players.getTeam(p.getPlayer()).equals(Team.BLUE)){
			  	   ColorArmor.blue_team_armor(p);
	           	p.teleport(Locations.getLocation("paintball_spawn_blue", true));
			      ActionBar.sendActionBarTime(p, "§9You are in BLUE team",40);
	}
	 }
	}
}