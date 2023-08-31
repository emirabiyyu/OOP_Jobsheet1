package Tugas1;

public class Main {
    public static void main (String args[]){
        Mobil kd1 =  new Mobil();
        Motor kd2 = new Motor();
        AlatMasak alat1 = new AlatMasak();
        Elektronik elk1 = new Elektronik();

        kd1.setMerek("Honda");
        kd1.setTipe("Roda 4");
        kd1.setNomesin(987127);
        kd1.tambahKecepatan(1250);
        kd1.setTransmisi("Manual");
        kd1.setKapasitas(10);
        kd1.cetakStatus();
        
        kd2.setMerek("Yamaha");
        kd2.setTipe("Roda 2");
        kd2.setNomesin(912638);
        kd2.tambahKecepatan(125);
        kd2.setJM("Bebek");
        kd2.sistemRem("ABS");
        kd2.cetakStatus();

        alat1.setNama("Panci");
        alat1.setFungsi("Merebus");
        alat1.bahan("Alumunium");
        alat1.cetakStatus();

        elk1.setNama("Huawei");
        elk1.setModel("Smartphone");
        elk1.dayalistrik("120V");
        elk1.cetakStatus();
    }
}
