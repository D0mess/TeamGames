package me.D0mess.TG;

public class GetterInt {
	
	  public static int minplayers()
	  {
	    return TeamGames.tg.getConfig().getInt("minplayers");
	  }
	  
	  public static int swordwars_kills_to_win()
	  {
	    return TeamGames.tg.getConfig().getInt("swordwars_kills_to_win");
	  }
	  
	  public static int swordwars_shop_iron_helmet_cost()
	  {
	    return TeamGames.tg.getConfig().getInt("iron_helmet");
	  }

	  public static int swordwars_shop_iron_chestplate_cost()
	  {
	    return TeamGames.tg.getConfig().getInt("iron_chestplate");
	  }
	  
	  public static int swordwars_shop_iron_leggings_cost()
	  {
	    return TeamGames.tg.getConfig().getInt("iron_leggings");
	  }
	  
	  public static int swordwars_shop_iron_boots_cost()
	  {
	    return TeamGames.tg.getConfig().getInt("iron_boots");
	  }
	  
	  public static int swordwars_shop_iron_sword_cost()
	  {
	    return TeamGames.tg.getConfig().getInt("iron_sword");
	  }
	  
	  public static int swordwars_time_to_end(){
		  return TeamGames.tg.getConfig().getInt("swordwars_time_to_end");
	  }
	  
	  public static int oitc_time_to_end(){
		  return TeamGames.tg.getConfig().getInt("oitc_time_to_end");
	  }
	  
	  public static int hoechanger_time_to_end(){
		  return TeamGames.tg.getConfig().getInt("hoechanger_time_to_end");
	  }
	  
	  public static int paintball_time_to_end(){
		  return TeamGames.tg.getConfig().getInt("paitball_time_to_end");
	  }
	  
	  public static int mining_time_to_end(){
		  return TeamGames.tg.getConfig().getInt("mining_time_to_end");
	  }
	  
	  public static int lobby_time_to_start(){
		  return TeamGames.tg.getConfig().getInt("lobby_time_to_start");
	  }
	  
	  public static int lobby_time_to_start_nextgame(){
		  return TeamGames.tg.getConfig().getInt("lobby_time_to_start_nextgame");
	  }
	  
	  public static int oitc_kills_to_win()
	  {
	    return TeamGames.tg.getConfig().getInt("oitc_kills_to_win");
	  }
	  
	  public static int hoechanger_change_blocks_to_win()
	  {
	    return TeamGames.tg.getConfig().getInt("hoechanger_change_blocks_to_win");
	  }
	  
	  public static int paintball_kills_to_win()
	  {
	    return TeamGames.tg.getConfig().getInt("paintball_kills_to_win");
	  }
	  
	  public static int mining_submit_blocks_to_win()
	  {
	    return TeamGames.tg.getConfig().getInt("mining_submit_blocks_to_win");
	  }
}
