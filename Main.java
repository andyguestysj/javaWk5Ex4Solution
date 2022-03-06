class Main {
  public static void main(String[] args) {
    
    Celebrity a = new Celebrity("Paul", "Chuckle", 71, false , "To me , to you");
    System.out.println(a.description());

    Celebrity b = new Celebrity("Craig", "Charles", 50, true , "Rimmer you smeghead");
    System.out.println(b.description());

    Person c = new Person ("Harriet", "Harman", 64);
    System.out.println(c.description());
  }
}