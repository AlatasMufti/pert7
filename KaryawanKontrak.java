public class KaryawanKontrak {
    public static void main(String[]args ) {

        int UpahHarian;
        int HariMasuk;
        int TunjanganAnak;
        int Total;
    
        UpahHarian = 100000;
        HariMasuk = 15;
        TunjanganAnak = 300000;
        Total= TotalUpah(UpahHarian,HariMasuk,TunjanganAnak);

        System.out.println("Nama        : Aldo wijaya ");
        System.out.println("Upah harian : "+UpahHarian);
        System.out.println("Hari masuk  : "+HariMasuk);
        System.out.println("Tunjangan   : "+TunjanganAnak);
        System.out.println("Total Upah  : "+Total);
        System.out.println("===================");

        UpahHarian = 100000;
        HariMasuk = 9;
        TunjanganAnak = 300000;
        Total = TotalUpah(UpahHarian,HariMasuk,TunjanganAnak);

        System.out.println("Nama        : Kaesang pribumi ");
        System.out.println("Upah harian : "+UpahHarian);
        System.out.println("Hari masuk  : "+HariMasuk);
        System.out.println("Tunjangan   : "+TunjanganAnak);
        System.out.println("Total Upah  : "+Total);
        System.out.println("===================");

        UpahHarian = 900000;
        HariMasuk = 27;
        TunjanganAnak = 200000;
        Total = TotalUpah(UpahHarian,HariMasuk,TunjanganAnak);

        System.out.println("Nama        : Bambang candra ");
        System.out.println("Upah harian : "+UpahHarian);
        System.out.println("Hari masuk  : "+HariMasuk);
        System.out.println("Tunjangan   : "+TunjanganAnak);
        System.out.println("Total Upah  : "+Total);

        

    }
    public static int TotalUpah(int UpahHarian, int HariMasuk, int TunjanganAnak) {
        int total;

        total = UpahHarian * HariMasuk + TunjanganAnak;
        return total;

        }

}
