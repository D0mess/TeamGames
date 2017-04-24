package me.D0mess.TG.events;

import me.D0mess.TG.TeamGames;
import me.D0mess.TG.gamemanagement.GameStage;
import me.D0mess.TG.gamemanagement.Manager;
import me.D0mess.TG.gamemanagement.Team;
import me.D0mess.TG.playermanagement.Players;
import me.D0mess.TG.scoreboard.SwordWarsScoreboard;


import net.minecraft.server.v1_11_R1.PacketPlayInClientCommand;
import net.minecraft.server.v1_11_R1.PacketPlayInClientCommand.EnumClientCommand;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer;

public class Death implements Listener{
	
	   @EventHandler
       public void onPlayerDeath(final PlayerDeathEvent event) {
			  if (Manager.getStage() == GameStage.SWORDWARS) {
               event.setDroppedExp(0);
               event.getDrops().clear();

               new BukkitRunnable(){
                   @Override 
                 public void run(){
                 ((CraftPlayer)event.getEntity()).getHandle().playerConnection.a(new PacketPlayInClientCommand(EnumClientCommand.PERFORM_RESPAWN));
                   }
                 }.runTaskLater(TeamGames.getPlugin(), 1);
                 
   			  Player player = event.getEntity().getPlayer();
              Player killer = event.getEntity().getKiller();
              
                if (Players.getTeam(player.getPlayer()).equals(Team.RED)){  
                	player.sendMessage("Umrel jsi za cervene");
                }
                if (Players.getTeam(player.getPlayer()).equals(Team.BLUE)){  
                	player.sendMessage("Umrel jsi za modre");
                }
                if (Players.getTeam(killer.getPlayer()).equals(Team.RED)){  
                	killer.sendMessage("Zabil jsi za cervene");
      		      SwordWarsScoreboard.swordwars_red += 1;

                }
                if (Players.getTeam(killer.getPlayer()).equals(Team.BLUE)){  
                	killer.sendMessage("Zabil jsi za modre");
        		      SwordWarsScoreboard.swordwars_blue += 1;
                }
              event.setDeathMessage(null);      
		  }
	   }
}


