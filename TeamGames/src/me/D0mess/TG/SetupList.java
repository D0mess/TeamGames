package me.D0mess.TG;

import org.bukkit.entity.Player;

public class SetupList {

	 public static void setuplist(Player p) {  
			if (TeamGames.getPlugin().getConfig().getBoolean("game_enable") == true)
			{
		        p.sendMessage("Game_Enable - §aEnable");
			}
			else{
		        p.sendMessage("Game_Enable - §cDisable §f- (Because locations are not setup all)");
		        p.sendMessage("");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("lobby") == true)
			{
		        p.sendMessage("Lobby - §aEnable");
			}
			else{
		        p.sendMessage("Lobby - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("end_lobby") == true)
			{
		        p.sendMessage("End_Lobby - §aEnable");
			}
			else{
		        p.sendMessage("End_Lobby - §cDisable §f- (Must be set!)");;
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("swordwars_spawn_red") == true)
			{
		        p.sendMessage("Swordwars_spawn_red - §aEnable");
			}
			else{
		        p.sendMessage("Swordwars_spawn_red - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("swordwars_spawn_blue") == true)
			{
		        p.sendMessage("Swordwars_spawn_blue - §aEnable");
			}
			else{
		        p.sendMessage("Swordwars_spawn_blue - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("swordwars_spawn_spectator") == true)
			{
		        p.sendMessage("Swordwars_spawn_spectator - §aEnable");
			}
			else{
		        p.sendMessage("Swordwars_spawn_spectator - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("oitc_spawn_red") == true)
			{
		        p.sendMessage("Oitc_spawn_red - §aEnable");
			}
			else{
		        p.sendMessage("Oitc_spawn_red - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("oitc_spawn_blue") == true)
			{
		        p.sendMessage("Oitc_spawn_blue - §aEnable");
			}
			else{
		        p.sendMessage("Oitc_spawn_blue - §cDisable §f- (Must be set!)");;
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("oitc_spawn_spectator") == true)
			{
		        p.sendMessage("Oitc_spawn_spectator - §aEnable");
			}
			else{
		        p.sendMessage("Oitc_spawn_spectator - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("hoechanger_spawn_red") == true)
			{
		        p.sendMessage("Hoechanger_spawn_red - §aEnable");
			}
			else{
		        p.sendMessage("Hoechanger_spawn_red - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("hoechanger_spawn_blue") == true)
			{
		        p.sendMessage("Hoechanger_spawn_blue - §aEnable");
			}
			else{
		        p.sendMessage("Hoechanger_spawn_blue - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("hoechanger_spawn_spectator") == true)
			{
		        p.sendMessage("Hoechanger_spawn_spectator - §aEnable");
			}
			else{
		        p.sendMessage("Hoechanger_spawn_spectator - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("paintball_spawn_red") == true)
			{
		        p.sendMessage("Paintball_spawn_red - §aEnable");
			}
			else{
		        p.sendMessage("Paintball_spawn_red - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("paintball_spawn_blue") == true)
			{
		        p.sendMessage("Paintball_spawn_blue - §aEnable");
			}
			else{
		        p.sendMessage("Paintball_spawn_blue - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("paintball_spawn_spectator") == true)
			{
		        p.sendMessage("Paintball_spawn_spectator - §aEnable");
			}
			else{
		        p.sendMessage("Paintball_spawn_spectator - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("mining_spawn_red") == true)
			{
		        p.sendMessage("Mining_spawn_red - §aEnable");
			}
			else{
		        p.sendMessage("Mining_spawn_red - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("mining_spawn_blue") == true)
			{
		        p.sendMessage("Mining_spawn_blue - §aEnable");
			}
			else{
		        p.sendMessage("Mining_spawn_blue - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("mining_spawn_spectator") == true)
			{
		        p.sendMessage("Mining_spawn_spectator - §aEnable");
			}
			else{
		        p.sendMessage("Mining_spawn_spectator - §cDisable §f- (Must be set!)");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("firework_spawn_one") == true)
			{
		        p.sendMessage("Firework_spawn_one - §aEnable");
			}
			else{
		        p.sendMessage("Firework_spawn_one - §cDisable");
			  }
			if (TeamGames.getPlugin().getConfig().getBoolean("firework_spawn_two") == true)
			{
		        p.sendMessage("Firework_spawn_two - §aEnable");
			}
			else{
		        p.sendMessage("Firework_spawn_two - §cDisable ");
			  }
	 }
	 
}