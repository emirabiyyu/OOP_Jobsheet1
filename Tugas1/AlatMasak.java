package Tugas1;

public class AlatMasak {
    private String nama, fungsi, bahan;

    public void setNama(String newValue)
    {
        nama = newValue;
    }
    public void setFungsi (String newValue)
    {
        fungsi = newValue;
    }
    public void bahan (String newValue)
    {
        bahan = newValue;
    }
    public void cetakStatus()
    {
        System.out.println();
        System.out.println("Nama alat: " + nama);
        System.out.println("Fungsi: " + fungsi);
        System.out.println("Bahan: " + bahan);
    }
}
