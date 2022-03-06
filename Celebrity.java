public class Celebrity extends Person {
  public boolean onIACGMOOH;
  public String catchphrase;

  public Celebrity(String firstName, String surname, int age, boolean celeb, String catchphrase)
  {
    super(firstName, surname, age);
    this.onIACGMOOH = celeb;
    this.catchphrase = catchphrase;
  }

  public String description(){
    String retVal = super.description();
    if (onIACGMOOH){
      retVal = retVal + " \"I was once on I'm a Celebrity, Get Me Out Of Here\".";
    }
    retVal = retVal + " " + catchphrase;

    return retVal;
  }
}