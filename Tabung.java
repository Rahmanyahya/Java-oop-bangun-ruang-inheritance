class Tabung extends bangunRuang {
  private double r, t;

  @Override
  double volume() {
    System.out.print("MASUKAN JARI JARI : ");
    r = input.nextDouble();
    System.out.print("MASUKAN TINGGI : ");
    t = input.nextDouble();
    super.volume();
    return 3.14 * (r * r) * t;
  }

  @Override
  double luasPermukaan() {
    System.out.print("MASUKAN JARI JARI : ");
    r = input.nextDouble();
    System.out.print("MASUKAN TINGGI : ");
    t = input.nextDouble();
    super.luasPermukaan();
    return 2 * 3.14 * r * (r + t);
  }
}
