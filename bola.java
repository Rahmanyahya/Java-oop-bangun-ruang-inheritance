class bola extends bangunRuang {
  private double jariJari;

  @Override
  double volume() {
    System.out.print("\nMasukan Jari-jari : ");
    jariJari = input.nextDouble();
    super.volume();
    return 4 * 3.14 * (jariJari * jariJari * jariJari) / 3;
  }

  @Override
  double luasPermukaan() {
    System.out.print("\nMasukan Jari-jari : ");
    jariJari = input.nextDouble();
    super.luasPermukaan();
    return 4 * 3.14 * (jariJari * jariJari);
  }
  
}
