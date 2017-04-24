package me.D0mess.TG.actionbar;

import java.util.HashMap;

import me.D0mess.TG.TeamGames;
import net.minecraft.server.v1_11_R1.IChatBaseComponent;
import net.minecraft.server.v1_11_R1.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_11_R1.PacketPlayOutChat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class ActionBar {
    
    
    final static HashMap<String, Integer> Count = new HashMap<String,Integer>();
    
    public static void sendActionBar(Player player, String Nachricht)
    {
           final String NachrichtNeu = Nachricht.replace("_", " ");
      String s = ChatColor.translateAlternateColorCodes('&', NachrichtNeu);
      IChatBaseComponent icbc = ChatSerializer.a("{\"text\": \"" + s +
        "\"}");
      PacketPlayOutChat bar = new PacketPlayOutChat(icbc, (byte)2);
      ((CraftPlayer)player).getHandle().playerConnection.sendPacket(bar);
    }
 
    public static void sendActionBarTime(final Player player, final String Nachricht,final Integer Zeit)
    {
           
           
           final String NachrichtNeu = Nachricht.replace("_", " ");
           
            if(!Count.containsKey(player.getName())){
                    String s = ChatColor.translateAlternateColorCodes('&', NachrichtNeu);
                      IChatBaseComponent icbc = ChatSerializer.a("{\"text\": \"" + s +
                        "\"}");
                      PacketPlayOutChat bar = new PacketPlayOutChat(icbc, (byte)2);
                      ((CraftPlayer)player).getHandle().playerConnection.sendPacket(bar);
            }
           
            Bukkit.getScheduler().runTaskLater(TeamGames.getInstance(), new Runnable() {
                  @Override
                  public void run() {
                           String s = ChatColor.translateAlternateColorCodes('&', NachrichtNeu);
                              IChatBaseComponent icbc = ChatSerializer.a("{\"text\": \"" + s +
                                "\"}");
                              PacketPlayOutChat bar = new PacketPlayOutChat(icbc, (byte)2);
                              ((CraftPlayer)player).getHandle().playerConnection.sendPacket(bar);
                             
                              if(!Count.containsKey(player.getName())){
                                  Count.put(player.getName(),0);
                              }
                              int count = Count.get(player.getName());
                              int newCount = count+20;
                              Count.put(player.getName(), newCount);
                             
                              if(newCount < Zeit-20){
                          ActionBar.wait(player,Nachricht,Zeit);
                              }else{
                                  Count.remove(player.getName());
                              }
                  }
          }, 10);
    }

    private static void wait(final Player player, final String Nachricht,final Integer Zeit){
            Bukkit.getScheduler().runTaskLater(TeamGames.getInstance(), new Runnable() {
                          @Override
                          public void run() {
                                  sendActionBarTime(player,Nachricht,Zeit);
                          }
                  }, 10);
                         
    }
   
}