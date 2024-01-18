class Balok extends bangunRuang{
  
  private double p, l, t;
  
  @Override
  double volume() {
    System.out.print("\nMASUKAN PANJANG : ");
    p = input.nextDouble();
    System.out.print("\nMASUKAN LEBAR : ");
    l = input.nextDouble();
    System.out.print("\nMASUKAN TINGGI : ");
    t = input.nextDouble();
    super.volume();
    return p * l * t;
  }

  @Override
  double luasPermukaan() {
    System.out.print("\nMASUKAN PANJANG : ");
    p = input.nextDouble();
    System.out.print("\nMASUKAN LEBAR : ");
    l = input.nextDouble();
    System.out.print("\nMASUKAN TINGGI : ");
    t = input.nextDouble();
    super.luasPermukaan();
    return  2 * ((p*l) + (p*t) + (l*t));
  }
}
