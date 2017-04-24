package me.Fanatixteam.TG.games;

import me.Fanatixteam.TG.GetterInt;
import me.Fanatixteam.TG.actionbar.ActionBar;
import me.Fanatixteam.TG.couldown.gamescouldown.HoeChangerCouldown;
import me.Fanatixteam.TG.couldown.gamescouldown.MiningCouldown;
import me.Fanatixteam.TG.gamemanagement.GameStage;
import me.Fanatixteam.TG.gamemanagement.Locations;
import me.Fanatixteam.TG.gamemanagement.Manager;
import me.Fanatixteam.TG.gamemanagement.Team;
import me.Fanatixteam.TG.playermanagement.ColorArmor;
import me.Fanatixteam.TG.playermanagement.Inventory;
import me.Fanatixteam.TG.playermanagement.Players;

import org.bukkit.entity.Player;

public class Mining {

	public static void Mining_Info(Player p){
		p.sendMessage("§7▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
		p.sendMessage("");
		p.sendMessage("§fGame: §dMining");
		p.sendMessage("");
		p.sendMessage("§a" + "⌛ " + "Win team who reaches " + GetterInt.mining_submit_blocks_to_win() + " mined blocks");
		p.sendMessage("§a" + "⌛ " + "Win team who reaches the most mined blocks the end of time");
		p.sendMessage("");
		p.sendMessage("§7▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");

			
	}
	public static void mining_start(Player p){
	  if (Manager.getStage() == GameStage.MINING){
		   MiningCouldown.startLobby(p);
		    Mining.Mining_Info(p);
		     Inventory.mining_inv(p);
			if (Players.getTeam(p.getPlayer()).equals(Team.RED)){
	           	p.teleport(Locations.getLocation("mining_spawn_red", true));
	 	  	    ColorArmor.red_team_armor(p);
			      ActionBar.sendActionBarTime(p, "§4You are in RED team",40);
			}
			else if (Players.getTeam(p.getPlayer()).equals(Team.BLUE)){
			  	   ColorArmor.blue_team_armor(p);
	           	p.teleport(Locations.getLocation("mining_spawn_blue", true));
			      ActionBar.sendActionBarTime(p, "§9You are in BLUE team",40);
	}
	 }
	}
}