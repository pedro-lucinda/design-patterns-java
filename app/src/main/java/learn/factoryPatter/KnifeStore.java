package learn.factoryPatter;

public abstract class KnifeStore{
  public Knife orderKnife(String KnifeType){
    Knife knife;

    knife = createKnife(KnifeType);
    knife.sharpen();
    return knife;
  }

  abstract Knife createKnife(String type);
  
}
