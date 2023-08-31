package Tugas1;

public class Kendaraan {
    private String merk, tipe;
    private int nomesin, kecepatan;

    public void setMerek (String newValue)
    {
        merk = newValue;
    }
    public void setTipe (String newValue)
    {
        tipe = newValue;
    }
    public void setNomesin (int newValue)
    {
        nomesin = newValue;
    }
    public void tambahKecepatan (int increment)
    {
        kecepatan = kecepatan + increment;
    }

    public void cetakStatus()
    {
        System.out.println();
        System.out.println("Tipe: " + tipe);
        System.out.println("Merk: " + merk);
        System.out.println("Nomor Mesin: " + nomesin);
        System.out.println("Kecepatan (CC): " + kecepatan);
    }

}
 