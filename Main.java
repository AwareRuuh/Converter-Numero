class Main {
  public static void main(String[] args) {
    double d = 12.56;
		System.out.println("Valor original: " + d);
    int d1 = (int)d;
    System.out.println("Inteiro: " + d1);
		d -= ((int)d);
		System.out.printf("Fracionário: " + "%.5f", d);
  }
}