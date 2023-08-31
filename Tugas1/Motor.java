package Tugas1;

public class Motor extends Kendaraan {
    private String jenisMotor, sistemRem;

    public void setJM (String newValue)
    {
        jenisMotor = newValue;
    }
    public void sistemRem (String newValue)
    {
        sistemRem = newValue;
    }

    public void cetakStatus()
    {
        System.out.println();
        super.cetakStatus();
        System.out.println("Jenis Motor: " + jenisMotor);
        System.out.println("Sistem Rem: " + sistemRem);
    }
}
