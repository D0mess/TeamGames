package me.Fanatixteam.TG.gamemanagement;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.ClickEvent.Action;

import org.bukkit.entity.Player;

public class ClickText {
	
	public static void player_end_stats(Player p){
		TextComponent player_end_stats = new TextComponent();
		player_end_stats.setText("§c§lGame end! §eClick here to check your stats in this game! ");
		player_end_stats.setColor(ChatColor.AQUA);
		player_end_stats.setBold(true);	
		player_end_stats.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/endstats player"));
		player_end_stats.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§7Click to view your stats").create()));
		p.spigot().sendMessage(player_end_stats);
	}
	
	public static void team_end_stats(Player p){
		TextComponent team_end_stats = new TextComponent();
		team_end_stats.setText("§c§lGame end! §eClick here to check teams stats in this game! ");
		team_end_stats.setColor(ChatColor.AQUA);
		team_end_stats.setBold(true);	
		team_end_stats.setClickEvent(new ClickEvent(Action.RUN_COMMAND,"/endstats team"));
		team_end_stats.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§7Click to view teams stats").create()));
		p.spigot().sendMessage(team_end_stats);
	}

}
