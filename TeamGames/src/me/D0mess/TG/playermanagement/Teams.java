package me.D0mess.TG.playermanagement;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

import me.D0mess.TG.gamemanagement.Team;

import org.bukkit.entity.Player;

public class Teams {
	
	public static ArrayList<UUID> red = new ArrayList<UUID> ();
	public static ArrayList<UUID> blue = new ArrayList<UUID> ();
	public static ArrayList<UUID> spectator = new ArrayList<UUID> ();



public static void redTeam(Player p){
		Players.setTeam(p, Team.RED);
		}
	

public static void blueTeam(Player p){
		Players.setTeam(p, Team.BLUE);
}

public static void spectatorTeam(Player p){
	Players.setTeam(p, Team.SPECTATOR);
}

public static void noneTeam(Player p){
	Players.setTeam(p, Team.NONE);
	}
		
public static void addToTeam(Player p){
	if (Teams.red.size() > Teams.blue.size()){
		Players.setTeam(p, Team.BLUE);

		//neco
	}
	else if (Teams.red.size() < Teams.blue.size()){
		Players.setTeam(p, Team.RED);
		//neco
	}
	else{
		Random r = new Random();
		if (r.nextInt(2) == 1){
			Players.setTeam(p, Team.RED);

			//neco

		}
		else {
			Players.setTeam(p, Team.BLUE);

			//neco

		}
	}
}
}
	

