import java.util.ArrayList;

public class DataMahasiswa {
    ArrayList<Mahasiswa> dataMahasiswa=new ArrayList<Mahasiswa>();

    void tambahMahasiswa(Mahasiswa data){
        this.dataMahasiswa.add(data);
    }
    int tampilMahasiswa(){
        int i=0;
        System.out.println("''''''''''''''''''''''''''''");
        for(Mahasiswa item: this.dataMahasiswa){
            item.output();
            i=1;
        }
        return i;
    }
    void updateMahasiswa(int kode, String updateMahasiswa, String updateNPM){
        this.dataMahasiswa.set(kode, new Mahasiswa(kode, updateMahasiswa, updateNPM));
    }
    void hapusMahasiswa(int hapus){
        this.dataMahasiswa.removeIf(item->item.kode==hapus);
    }
    void cariMahasiswa(int kode){
        boolean ditemukan=false;
        int index=-1;
        for (int i=0; i<this.dataMahasiswa.size(); i++){
            if(this.dataMahasiswa.get(i).kode==kode){
                index=i;
                ditemukan=true;
            }
        }
        if (ditemukan==true){
            this.dataMahasiswa.get(index).output();
        }
        else{
            System.out.println("Mahasiswa tidak ditemukan!");
        }
    }
}
