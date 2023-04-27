package demo2;

public class Customer {
    int id = 10;
    String name;
    int age;
    String address;

    public Customer(){
        // hàm khởi tạo - constructor
        // tên giống hệt tên lớp
        // không có kiểu dữ liệu trả về
        // tự động chạy khi tạo đối tượng
        System.out.println("Đã tạo ra 1 đối tượng customer");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    void buyCart(){

    }
    void sayHello(String msg){
        System.out.println("Hello "+msg);
    }
    void printInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}
