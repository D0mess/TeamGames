package me.D0mess.TG.gamemanagement;


public class Manager
{
  public static GameStage stage = GameStage.LOBBY;
  
  public static void setStage(GameStage gstage)
  {
    stage = gstage;
  }
  
  public static GameStage getStage()
  {
    return stage;
  }
}