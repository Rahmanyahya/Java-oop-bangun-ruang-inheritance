public class starterClass {
  public static void main(String[] args) {
    bola Bola = new bola();
    Balok balok = new Balok();
    limasSegitiga LimasSegitiga = new limasSegitiga();
    Tabung tabung = new Tabung();

    System.out.println("volume bola " + Bola.volume());
    System.out.println("\nvolume balok " + balok.volume());
    System.out.println("\nvolume limas segitiga " + LimasSegitiga.volume());
    System.out.println("\nvolume tabung " + tabung.volume());
    
    System.out.println("\nluas permukaan bola " + Bola.luasPermukaan());
    System.out.println("\nluas permukaan balok " + balok.luasPermukaan());
    System.out.println("\nluas permukaan limas segitiga " + LimasSegitiga.luasPermukaan());
    System.out.println("\nluas permukaan tabung " + tabung.luasPermukaan());
  }
}
