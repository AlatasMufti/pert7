public class KaryawanTetap{
    public static void main(String[]args ) {

        int GajiPokok;
        int TunjanganAnak;
        int Gaji;
    
        GajiPokok = 3500000;
        TunjanganAnak = 500000;
        Gaji = TotalGaji(GajiPokok,TunjanganAnak);

        System.out.println("Nama : Kevin Pangarep ");
        System.out.println("Gaji Pokok : "+GajiPokok);
        System.out.println("Tunjangan : "+TunjanganAnak);
        System.out.println("Total : "+Gaji);
        System.out.println("===================");

        GajiPokok = 400000;
        TunjanganAnak = 70000;
        Gaji = TotalGaji(GajiPokok,TunjanganAnak);

        System.out.println("Nama : Dendi prabowo ");
        System.out.println("Gaji Pokok : "+GajiPokok);
        System.out.println("Tunjangan : "+TunjanganAnak);
        System.out.println("Total : "+Gaji);

        

    }
    public static int TotalGaji(int GajiPokok, int TunjanganAnak) {
        int hasil;

        hasil = GajiPokok + TunjanganAnak;
        return hasil;

        }


    
}