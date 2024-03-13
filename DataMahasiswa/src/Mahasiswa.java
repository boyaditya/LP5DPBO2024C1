/* Saya Boy Aditya Rohmaulana NIM 2203488 mengerjakan
soal Latihan Praktikum 5 dalam mata kuliah DPBO untuk keberkahanNya
maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin. */

public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String prodi;
    private String status;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String prodi, String status) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.prodi = prodi;
        this.status = status;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
