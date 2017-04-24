package me.Fanatixteam.TG.gamemanagement;

import org.bukkit.Bukkit;

import me.Fanatixteam.TG.scoreboard.HoeChangerScoreboard;
import me.Fanatixteam.TG.scoreboard.MiningScoreboard;
import me.Fanatixteam.TG.scoreboard.OITCScoreboard;
import me.Fanatixteam.TG.scoreboard.PaintballScoreboard;
import me.Fanatixteam.TG.scoreboard.SwordWarsScoreboard;

public class WinningSystem {
	
	
	
	public static void swordwars_win() {
		if (SwordWarsScoreboard.swordwars_red < SwordWarsScoreboard.swordwars_blue){
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

	}else {
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
		if (OITCScoreboard.oitc_red < OITCScoreboard.oitc_blue){
			Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
			Bukkit.broadcastMessage("                        §fGame: §dOneInTheChamber");
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("                         §eWon §9BLUE §eteam");
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("                        §4RED §escore: §b" + OITCScoreboard.oitc_red);
			Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + OITCScoreboard.oitc_red);
			Bukkit.broadcastMessage("");
			Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
	   		Manager.setStage(GameStage.HOECHANGER);

	}else {
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
		Bukkit.broadcastMessage("                        §fGame: §dOneInTheChamber");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                         §eWon §4RED §eteam");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                        §4RED §escore: §b" + OITCScoreboard.oitc_red);
		Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + OITCScoreboard.oitc_red);
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
   		Manager.setStage(GameStage.HOECHANGER);

	}
	}
	
	public static void paintball_win() {
		if (PaintballScoreboard.paintball_red < PaintballScoreboard.paintball_blue){
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

		}else {
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
		Bukkit.broadcastMessage("                        §fGame: §dPaintball");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                         §eWon §4RED §eteam");
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("                        §4RED §escore: §b" + PaintballScoreboard.paintball_red);
		Bukkit.broadcastMessage("                        §9BLUE §escore: §b" + PaintballScoreboard.paintball_blue);
		Bukkit.broadcastMessage("");
		Bukkit.broadcastMessage("§7☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒☒");
   		Manager.setStage(GameStage.MINING);

	}
	}
	
	public static void hoechanger_win() {
		if (HoeChangerScoreboard.hoechanger_red < HoeChangerScoreboard.hoechanger_blue){
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

	}else {
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
	
	public static void mining_win() {
		if (MiningScoreboard.mining_red < MiningScoreboard.mining_blue){
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
	}else {
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

	}
	}
}
