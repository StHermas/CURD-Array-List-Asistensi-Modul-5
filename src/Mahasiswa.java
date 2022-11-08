public class Mahasiswa {
    //Att
    String namaMahasiswa;
    String npm;
    int kode;
    //Const
    Mahasiswa(int kode, String namaMahasiswa, String npm){
        this.namaMahasiswa=namaMahasiswa;
        this.npm=npm;
        this.kode=kode;
    }
    void output(){
        System.out.println("Nama: "+this.namaMahasiswa);
        System.out.println("NPM: "+this.npm);
    }


}

