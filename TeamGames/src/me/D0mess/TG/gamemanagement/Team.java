package me.D0mess.TG.gamemanagement;

import org.bukkit.entity.Player;

public enum Team {
NONE, RED, BLUE, SPECTATOR;

public boolean hasPlayer(Player p) {
	return false;
}

public  Object getPlayers() {
	return null;
}

public  String getName() {
	return null;
}

public  void setPlayerListName(String string) {
	
}
}