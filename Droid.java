/*
This makes a droid and uses commands to control it. Made on 2/14/2020 by Annabel Adeyeri
*/
public class Droid{
  int batteryLevel;
  String name;
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
 public String toString(){
    String droidToName = "Hello, I’m the droid: " + name;
    return droidToName;
 }
public void performTask(String task){
  System.out.println(name + " is performing task: " + task);
 batteryLevel = batteryLevel - 10;
}
public void energyReport(){
  System.out.println(name +"'s battery level is " + batteryLevel);
}
public int charging(){
  batteryLevel = 100;
  return batteryLevel;
}
  public static void main(String[] args){
    Droid cody = new Droid("Codey");
    System.out.println(cody.toString());
    cody.performTask("tapdancing");
    cody.energyReport();
    System.out.println(cody.charging());
  }
}
