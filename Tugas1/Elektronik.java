package Tugas1;

public class Elektronik {
    private String nama, model, dayalistrik;

    public void setNama (String newValue)
    {
        nama = newValue;
    }
    public void setModel (String newValue){
        model = newValue;
    }
    public void dayalistrik (String newValue)
    {
        dayalistrik = newValue;
    }

    public void cetakStatus(){
        System.out.println();
        System.out.println("Nama Perangkat: " + nama);
        System.out.println("Model: " + model);
        System.out.println("Konsumsi Daya Listrik: " + dayalistrik);
    }
}
