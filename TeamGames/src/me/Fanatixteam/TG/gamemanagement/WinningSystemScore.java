package me.Fanatixteam.TG.gamemanagement;

import me.Fanatixteam.TG.GetterInt;
import me.Fanatixteam.TG.scoreboard.HoeChangerScoreboard;
import me.Fanatixteam.TG.scoreboard.MiningScoreboard;
import me.Fanatixteam.TG.scoreboard.OITCScoreboard;
import me.Fanatixteam.TG.scoreboard.PaintballScoreboard;
import me.Fanatixteam.TG.scoreboard.SwordWarsScoreboard;

import org.bukkit.Bukkit;

public class WinningSystemScore {
	
	public static void swordwars_win() {
		if (SwordWarsScoreboard.swordwars_blue == GetterInt.swordwars_kills_to_win()){
			Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
			Bukkit.broadcastMessage("                        §fGame: §dSwordWars");
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("                         §eWon §9BLUE §eteam");
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("                        §4RED §escore: §b" + SwordWarsScoreboard.swordwars_red);
			Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + SwordWarsScoreboard.swordwars_blue);
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
	   		Manager.setStage(GameStage.OITC);

	}else if (SwordWarsScoreboard.swordwars_red == GetterInt.swordwars_kills_to_win()){
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
		Bukkit.broadcastMessage("                        §fGame: §dSwordWars");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                         §eWon §4RED §eteam");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                        §4RED §escore: §b" + SwordWarsScoreboard.swordwars_red);
		Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + SwordWarsScoreboard.swordwars_blue);
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
   		Manager.setStage(GameStage.OITC);
	}
	}	
	
	public static void oitc_win() {	
	if (OITCScoreboard.oitc_blue == GetterInt.oitc_kills_to_win()){
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
		Bukkit.broadcastMessage("                        §fGame: §dOneInTheChamber");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                         §eWon §9BLUE §eteam");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                        §4RED §escore: §b" + OITCScoreboard.oitc_red);
		Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + OITCScoreboard.oitc_blue);
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
   		Manager.setStage(GameStage.HOECHANGER);

}else if (OITCScoreboard.oitc_red == GetterInt.oitc_kills_to_win()){
	Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
	Bukkit.broadcastMessage("                        §fGame: §dOneInTheChamber");
	Bukkit.broadcastMessage("");
	Bukkit.broadcastMessage("                         §eWon §4RED §eteam");
	Bukkit.broadcastMessage("");
	Bukkit.broadcastMessage("                        §4RED §escore: §b" + OITCScoreboard.oitc_red);
	Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + OITCScoreboard.oitc_blue);
	Bukkit.broadcastMessage("");
	Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
		Manager.setStage(GameStage.HOECHANGER);
}
}
	public static void hoechanger_win() {	
		if (HoeChangerScoreboard.hoechanger_blue == GetterInt.hoechanger_change_blocks_to_win()){
			Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
			Bukkit.broadcastMessage("                        §fGame: §dHoeChanger");
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("                         §eWon §9BLUE §eteam");
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("                        §4RED §escore: §b" + HoeChangerScoreboard.hoechanger_red);
			Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + HoeChangerScoreboard.hoechanger_blue);
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
	   		Manager.setStage(GameStage.PAINTBALL);

	}else if (HoeChangerScoreboard.hoechanger_red == GetterInt.hoechanger_change_blocks_to_win()){
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
		Bukkit.broadcastMessage("                        §fGame: §dHoeChanger");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                         §eWon §4RED §eteam");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                        §4RED §escore: §b" + HoeChangerScoreboard.hoechanger_red);
		Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + HoeChangerScoreboard.hoechanger_blue);
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
			Manager.setStage(GameStage.PAINTBALL);
	}
	}
	public static void paintball_win() {
		if (PaintballScoreboard.paintball_blue == GetterInt.paintball_kills_to_win()){
			Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
			Bukkit.broadcastMessage("                        §fGame: §dPaintball");
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("                         §eWon §9BLUE §eteam");
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("                        §4RED §escore: §b" + PaintballScoreboard.paintball_red);
			Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + PaintballScoreboard.paintball_blue);
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
	   		Manager.setStage(GameStage.MINING);

	}else if (PaintballScoreboard.paintball_red == GetterInt.paintball_kills_to_win()){
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
		Bukkit.broadcastMessage("                        §fGame: §dPaintball");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                         §eWon §9BLUE §eteam");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                        §4RED §escore: §b" + PaintballScoreboard.paintball_red);
		Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + PaintballScoreboard.paintball_blue);
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
   		Manager.setStage(GameStage.MINING);
	}
	}	
	
	public static void mining_win() {
		if (PaintballScoreboard.paintball_blue == GetterInt.mining_submit_blocks_to_win()){
			Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
			Bukkit.broadcastMessage("                        §fGame: §dMining");
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("                         §eWon §4RED §eteam");
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("                        §4RED §escore: §b" + MiningScoreboard.mining_red);
			Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + MiningScoreboard.mining_blue);
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
				Manager.setStage(GameStage.END);

	}else if (MiningScoreboard.mining_red == GetterInt.mining_submit_blocks_to_win()){
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
		Bukkit.broadcastMessage("                        §fGame: §dMining");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                         §eWon §9BLUE §eteam");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                        §4RED §escore: §b" + MiningScoreboard.mining_red);
		Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + MiningScoreboard.mining_blue);
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
			Manager.setStage(GameStage.END);
	}
	}
}