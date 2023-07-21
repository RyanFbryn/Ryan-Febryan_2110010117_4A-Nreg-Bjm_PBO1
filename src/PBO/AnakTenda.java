package PBO;

// Class AnakTenda sebagai subclass yang mengextends Tenda
class AnakTenda extends Tenda {
    private int kapasitas;

    public AnakTenda(String namaTenda, double hargaSewa, int kapasitas) {
        super(namaTenda, hargaSewa);
        this.kapasitas = kapasitas;
    }
    //polymophism
    // Override method cetakInfo() dari superclass
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kapasitas: " + kapasitas + " orang");
    }

    // Overload method hitungBiayaSewa() dari superclass
    public double hitungBiayaSewa(int lamaSewa, int jumlahOrang) {
        // Tambahan biaya jika kapasitas tidak mencukupi
        //seleksi
        if (jumlahOrang > kapasitas) {
            int tambahanBiaya = (jumlahOrang - kapasitas) * 10000;
            return super.hitungBiayaSewa(lamaSewa) + tambahanBiaya;
        } else {
            return super.hitungBiayaSewa(lamaSewa);
        }
    }
}
