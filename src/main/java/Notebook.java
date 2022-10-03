public class Notebook {
    int weight;
    int price;
    int year;
  public Notebook (int weight, int price, int year){
      this.weight = weight;
      this.price = price;
      this.year = year;}
      public void checkPrice() {
          if (this.price < 900) {
              System.out.println("This notebook is very cheap.");
          } else if (this.price > 900 && this.price <2500)
          System.out.println ("This price is good");}{
      if (this.price >4000);
      System.out.println("This notebook is quite expensive.");}

    public void checkWeight() {
      if (this.weight < 1000){
          System.out.println ("This notebook is light.");}
      else if (this.weight >1000 && this.weight < 1900){
          System.out.println ("Notebook weight is ok.");}
      if (this.weight >2000){
          System.out.println("This notebook is heavy.");

      }
    }
    public void checkYear() {
      if (this.year <2017 && this.price > 900 && this.price <2500){
          System.out.println("This notebook is the oldest and the cheapest");}
      else if (this.year>2021 && this.price >2500) {
          System.out.println("This notebook is to expsenive and to new");
      }if (this.year>2019 && this.year <2021 && this.price > 900 && this.price <2500){
          System.out.println("This is your dream");}
    }

  }
