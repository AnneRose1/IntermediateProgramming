/*Intermediate Programming Block 8 2/26/2020
Program Creates a Playlist incase I get stuff on a desert island by Annabel Adeyeri*/
import java.util.ArrayList;

class Playlist {
  public Playlist(){
    
  }
  public void reverseSongOrder(){
    
  }
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Party Rock");
    desertIslandPlaylist.add("Red Flavor");
    desertIslandPlaylist.add("Icy");
    desertIslandPlaylist.add("Cheer Up");
    desertIslandPlaylist.add("Russian Roulette");
    desertIslandPlaylist.add("Into The Unknown");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist.remove("Into The Unknown"));
    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.indexOf("Icy"));
    System.out.println(desertIslandPlaylist.indexOf("Party Rock"));
    int indexofA = 2;
    int indexofB = 0;
    String tempA = "Icy";
    desertIslandPlaylist.indexOf("Icy");
    desertIslandPlaylist.set(indexofA, "Party Rock");
    desertIslandPlaylist.set(indexofB, tempA);
    System.out.println(desertIslandPlaylist);
  }
  
}
