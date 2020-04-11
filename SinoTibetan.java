class SinoTibetan extends Language{
  SinoTibetan(String languageName, double speakers){
    super(languageName, "Asia",  "subject-object-verb", speakers);
    if (languageName.contains("Chinese")){
    this.wordOrder = "subject-verb-object";
    }
  }
}