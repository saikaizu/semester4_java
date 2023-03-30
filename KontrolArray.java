import java.util.Scanner;

class KontrolArray{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        String[] nama = new String[0];
        double [][]nilai = new double[0][0];

        int pilih, jumlah, i;
        double nilaiAkhir;
        String status, grade;

        do{
            System.out.println("Menu Pilihan:");
            System.out.println("1. Input data");
            System.out.println("2. Menampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Menu dipilih: "); 
            pilih = scanner.nextInt();

            System.out.println();

            switch (pilih){
                case 0: System.out.println("Selesai"); break;
                case 1: System.out.print("Jumlah data: "); jumlah = scanner.nextInt();

                        nama = new String[jumlah];
                        nilai = new double[jumlah][2];
                    for (i=0; i<jumlah; i++){
                        scanner.nextLine();
                        System.out.println("Data Mahasiswa ke-"+(i+1)+":");
                        System.out.print("Nama : "); nama[i] = scanner.nextLine();
                        System.out.print("UTS  : "); nilai[i][0] = scanner.nextDouble();
                        System.out.print("UAS  : "); nilai[i][1] = scanner.nextDouble();
                    }
                    break;
                case 2: System.out.println("Data yang tersimpan: ");
                i=0;
                while (i<nama.length){
                        System.out.println("Data Mahasiswa ke-"+(i+1)+":");
                        System.out.println("Nama : "+nama[i]);
                        System.out.println("UTS  : "+nilai[i][0]);
                        System.out.println("UAS  : "+nilai[i][1]);

                        nilaiAkhir = (nilai[i][0] + nilai[i][1])/2;

                        if (nilaiAkhir > 56){
                            status = "Lulus";
                        } else {
                            status = "Tidak Lulus";
                        }

                        grade="X";
                        if ((nilaiAkhir >= 0) && (nilaiAkhir <= 100)){
                            grade = "A";
                        } else if (nilaiAkhir >= 70){
                            grade = "B";
                        } else if (nilaiAkhir >= 56){
                            grade = "C";
                        } else if (nilaiAkhir >= 45){
                            grade = "D";
                        } else {
                            grade = "E";
                        }

                        System.out.println("Nilai Akhir : "+nilaiAkhir);
                        System.out.println("Grade       : "+grade);
                        System.out.println("Status      : "+status);

                        i++;
                    }
                    break;
            }
            System.out.println();
        } while (pilih != 0);
    }
}
