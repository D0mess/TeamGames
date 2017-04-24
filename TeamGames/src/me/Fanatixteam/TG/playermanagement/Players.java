package me.Fanatixteam.TG.playermanagement;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

import me.Fanatixteam.TG.gamemanagement.Team;
import me.Fanatixteam.TG.playermanagement.Teams;
public class Players {

	public static HashMap<UUID, Team> team = new HashMap<UUID, Team> ();
	  

	public static void setTeam(Player p, Team t){
  		team.put(p.getUniqueId(), t);
		if (t == Team.RED){
			   if (Teams.red.size() <= Teams.blue.size()) {
					Teams.red.add(p.getUniqueId());
					Teams.blue.remove(p.getUniqueId());
				     p.sendMessage("§eYou are now in §4RED §eteam!");	
				     p.setPlayerListName("§4" + p.getName());
					 p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 10.0F, 10.0F);

				   
			}else{
			     p.sendMessage("§eThe §4RED §eteam is already full!");
				    p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 10.0F, 10.0F);
				  	 team.remove(p.getUniqueId(), t);
         	  	     Teams.noneTeam(p);
				    }
		}
		
		else if (t == Team.BLUE){
		      if (Teams.red.size() >= Teams.blue.size()) {
				Teams.red.remove(p.getUniqueId());
				Teams.blue.add(p.getUniqueId());
			     p.sendMessage("§eYou are now in §9BLUE §eteam!");	
			     p.setPlayerListName("§9"  + p.getName());
				 p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 10.0F, 10.0F);
		}else{
		     p.sendMessage("§eThe §9BLUE §eteam is already full!");
			    p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 10.0F, 10.0F);
				}
		}
	}
	
	public static void join_red_team(Player p, Team t){
		 if (Teams.red.size() <= Teams.blue.size()) {
				Teams.blue.remove(p.getUniqueId());
				Teams.red.add(p.getUniqueId());
		  		team.put(p.getUniqueId(), Team.RED);
			     p.sendMessage("§eYou are now in §4RED §eteam!");	
			     p.setPlayerListName("§4" + p.getName());
				 p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 10.0F, 10.0F);
			}else{
				
			     p.sendMessage("§eThe §4RED §eteam is already full!");
				    p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 10.0F, 10.0F);
				    }
		}
	
	
	public static void join_blue_team(Player p){
	      if (Teams.red.size() >= Teams.blue.size()) {
			Teams.red.remove(p.getUniqueId());
			Teams.blue.add(p.getUniqueId());
		     p.sendMessage("§eYou are now in §9BLUE §eteam!");	
		     p.setPlayerListName("§9"  + p.getName());
			 p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 10.0F, 10.0F);
	}else{
	     p.sendMessage("§eThe §9BLUE §eteam is already full!");
		    p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 10.0F, 10.0F);
			}
	}

	
	
	public static void setSpectator(Player p, Team t){
		team.put(p.getUniqueId(), t);
		if (t == Team.SPECTATOR){
			Teams.spectator.add(p.getUniqueId());
			p.sendMessage("You are in spectators");
		}
	}
	
	public static Team getTeam(Player player){
		return team.get(player.getUniqueId());
	}
}