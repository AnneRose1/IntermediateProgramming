/* Made by Annabel Adeyeri for Intermediate Programming on 4/7/2020.*/
class Language{
  protected String name;
  protected String regionsSpoken;
  protected String wordOrder;
  protected double numSpeakers;
  Language(String langName,String placesSpoken, String howWordsOrdered, double numberOfSpeakers){
  this.name = langName;
  this.regionsSpoken = placesSpoken;
  this.wordOrder = howWordsOrdered;
  this.numSpeakers = numberOfSpeakers;
  }
  public void getInfo(){
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken +". The language follows the word order: " + wordOrder + ".");
  }
  public static void main (String[] args){
    Language english = new Language("English","United States, United Kingdom, Austalian, and Nigeria", "subject-verb-object", 15000000000.0);
english.getInfo();
  Mayan chontal = new Mayan("Chontal", 36810);
  chontal.getInfo();
  SinoTibetan mandarinChinese = new SinoTibetan("Mandarin Chinese", 920000000);
  mandarinChinese.getInfo();
  SinoTibetan burmese = new SinoTibetan("Burmese", 33000000);
  burmese.getInfo();
  Japonic japanese = new Japonic("Japanese", 126000000);
  japanese.getInfo();
  }
}