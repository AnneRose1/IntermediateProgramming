class Mayan extends Language{
  Mayan(String languageName, double speakers) {
    super(languageName, "Central America", "verb-object-subject", speakers);
    }
    @Override
    public void getInfo() {
      System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder);
    System.out.println("Fun fact: " + this.name + " is an ergative language.");
  }
}