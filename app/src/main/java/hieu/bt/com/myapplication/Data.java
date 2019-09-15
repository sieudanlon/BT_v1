package hieu.bt.com.myapplication;

public class Data {
    private String ten,namsinh,tinhthanh;
    private int id;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getTinhthanh() {
        return tinhthanh;
    }

    public void setTinhthanh(String tinhthanh) {
        this.tinhthanh = tinhthanh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data(int id,String ten, String namsinh, String tinhthanh) {
        this.ten = ten;
        this.namsinh = namsinh;
        this.tinhthanh = tinhthanh;
        this.id = id;
    }
}
