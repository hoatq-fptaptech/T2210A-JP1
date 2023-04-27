package demo2;

public class PhanSo {
    int tuSo;
    int mauSo;

    public PhanSo(){

    }

    public PhanSo(int tuSo,int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void inPhanSo(){

    }

    public void inPhanSo(String s){

    }

    public void nghichDao(){

    }

    public void rutGon(){
        int ucln = 1;
        tuSo = tuSo/ucln;
        mauSo = mauSo/ucln;
    }

    public PhanSo add(PhanSo p){
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo* p.mauSo + p.tuSo * this.mauSo;
        kq.mauSo = this.mauSo * p.mauSo;
        return kq;
    }

    public PhanSo sub(PhanSo p){
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo* p.mauSo - p.tuSo * this.mauSo;
        kq.mauSo = this.mauSo * p.mauSo;
        return kq;
    }

    public PhanSo mul(PhanSo p){
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo* p.tuSo ;
        kq.mauSo = this.mauSo * p.mauSo;
        return kq;
    }

    public PhanSo div(PhanSo p){
        PhanSo kq = new PhanSo();
        kq.tuSo = this.tuSo* p.mauSo ;
        kq.mauSo = this.mauSo * p.tuSo;
        return kq;
    }
}
