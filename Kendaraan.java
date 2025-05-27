package inheritance;

public class Kendaraan {
    private final String merek, jenis;

    public Kendaraan(String merek, String jenis) {
        this.merek = merek;
        this.jenis = jenis;
    }

    public String getMerek() {
        return merek;
    }

    public String getJenis() {
        return jenis;
    }
}
