class limasSegitiga extends bangunRuang {

  private double a,t,tLimas,L1,L2,L3;

  @Override
  double volume() {
    System.out.print("\nMASUKAN PANJANG ALAS SEGITIGA : ");
    a = input.nextDouble();
    System.out.print("MASUKAN TINGGI SEGITIGA : ");
    t = input.nextDouble();
    System.out.print("MASUKAN TINGGI LIMAS : ");
    tLimas = input.nextDouble();
    super.volume();
    return (t * a / 2) * tLimas / 3;
  }

  @Override
  double luasPermukaan() {
    System.out.print("\nMASUKAN PANJANG ALAS SEGITIGA : ");
    a = input.nextDouble();
    System.out.print("MASUKAN TINGGI SEGITIGA : ");
    t = input.nextDouble();
    System.out.print("MASUKAN LUAS SEGITIGA 1 : ");
    L1 = input.nextDouble();
    System.out.print("MASUKAN LUAS SEGITIGA 2 : ");
    L2 = input.nextDouble();
    System.out.print("MASUKAN LUAS SEGITIGA 3 : ");
    L3 = input.nextDouble();
    super.luasPermukaan();
    return (t * a / 2) + (L1 + L2 + L3);
  }
}
