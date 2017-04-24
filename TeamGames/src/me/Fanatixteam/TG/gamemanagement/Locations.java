package me.Fanatixteam.TG.gamemanagement;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Locations {
	
	public static void setLocation(String path, Location loc, boolean direction)
	  {
	    File file = new File("plugins/TeamGames", "locations.yml");
	    FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	    
	    cfg.set(path + ".world", loc.getWorld().getName());
	    cfg.set(path + ".x", Double.valueOf(loc.getX()));
	    cfg.set(path + ".y", Double.valueOf(loc.getY()));
	    cfg.set(path + ".z", Double.valueOf(loc.getZ()));
	    if (direction)
	    {
	      cfg.set(path + ".yaw", Float.valueOf(loc.getYaw()));
	      cfg.set(path + ".pitch", Float.valueOf(loc.getPitch()));
	    }
	    try
	    {
	      cfg.save(file);
	    }
	    catch (IOException e)
	    {
	      e.printStackTrace();
	    }
	  }

	  public static Location getLocation(String path, boolean direction)
	  {
	    Location loc = null;
	    
	    File file = new File("plugins/TeamGames", "locations.yml");
	    FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	    if (cfg.contains(path))
	    {
	      String w = cfg.getString(path + ".world");
	      double x = cfg.getDouble(path + ".x");
	      double y = cfg.getDouble(path + ".y");
	      double z = cfg.getDouble(path + ".z");
	      double yaw = 0.0D;
	      double pitch = 0.0D;
	      if (cfg.contains(path + ".yaw"))
	      {
	        yaw = cfg.getDouble(path + ".yaw");
	        pitch = cfg.getDouble(path + ".pitch");
	      }
	      loc = new Location(Bukkit.getWorld(w), x, y, z);
	      if (direction)
	      {
	        loc.setYaw((float)yaw);
	        loc.setPitch((float)pitch);
	      }
	    }
	    else
	    {
	      return null;
	    }
	    return loc;
	  }
}