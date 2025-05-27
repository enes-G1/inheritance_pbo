package inheritance;

public class Mobil extends Kendaraan {
    private int tenagaKuda;
    private double kapasitasBahanBakar;

    public Mobil(String merek, String jenis, int tenagaKuda, double kapasitasBahanBakar) {
        super(merek, jenis);
        setTenagaKuda(tenagaKuda);
        setKapasitasBahanBakar(kapasitasBahanBakar);
    }

    public int getTenagaKuda() {
        return tenagaKuda;
    }

    public final void setTenagaKuda(int tenagaKuda) {
        this.tenagaKuda = tenagaKuda;
    }

    public double getKapasitasBahanBakar() {
        return kapasitasBahanBakar;
    }

    public final void setKapasitasBahanBakar(double kapasitasBahanBakar) {
        this.kapasitasBahanBakar = kapasitasBahanBakar;
    }
}
