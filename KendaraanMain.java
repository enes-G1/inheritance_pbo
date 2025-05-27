package inheritance;

public class KendaraanMain {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "SUV", 170, 60);
        Mobil mobil2 = new Mobil("Honda", "Sedan", 150, 45);

        System.out.println("Merek Mobil: " + mobil1.getMerek());
        System.out.println("Jenis: " + mobil1.getJenis());
        System.out.println("Tenaga Kuda: " + mobil1.getTenagaKuda());
        System.out.println("Kapasitas Bahan Bakar: " + mobil1.getKapasitasBahanBakar());
        System.out.println("---------------------------------");
        System.out.println("Merek Mobil: " + mobil2.getMerek());
        System.out.println("Jenis: " + mobil2.getJenis());
        System.out.println("Tenaga Kuda: " + mobil2.getTenagaKuda());
        System.out.println("Kapasitas Bahan Bakar: " + mobil2.getKapasitasBahanBakar());
    }
}
