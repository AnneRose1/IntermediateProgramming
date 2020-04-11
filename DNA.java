/* Program made by Annabel Adeyeri for Introduction To Programming Block 8.
It makes proteins.
*/
public class DNA {
  public DNA(){
    boolean isProtein;
  }
  /*
  public boolean isItProtein(String aDNA){
    if(aDNA.length()%3!=0){
     return false;
    }
    if(aDNA.substring(aDNA.length()-3,aDNA.length()+1)== "TGA" && aDNA.substring(0,4)=="ATG"){
      return true;
    }else{
      return false;
    }
  }
  */
  public static void main(String[] args) {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna1;
    System.out.println(dna.length());
    System.out.println(dna.indexOf("ATG"));
    System.out.println(dna.indexOf("TGA"));
    //checks if dna contains a protein
    if (dna.indexOf("ATG") != -1 && dna.indexOf("TGA") != -1 && (dna.indexOf("TGA") - dna.indexOf("ATG")) % 3 == 0){
      String protein = dna.substring(dna.indexOf("ATG"), dna.indexOf("TGA")+3);
      System.out.println(protein);
    }else {
      System.out.println("No Protein!");
    }
   
  }
}
