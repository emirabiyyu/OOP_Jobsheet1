package Tugas1;

public class Mobil extends Kendaraan {
    private String transmisi;
    private int kapasitas;

    public void setTransmisi (String newValue)
    {
        transmisi = newValue;
    }
    public void setKapasitas (int newValue)
    {
        kapasitas = newValue;
    }

    public void cetakStatus()
    {
        System.out.println();
        super.cetakStatus();
        System.out.println("Transmisi: " + transmisi);
        System.out.println("Kapasitas Penumpang: " + kapasitas);
    }
}
