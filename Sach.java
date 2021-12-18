import java.util.*;

public class Sach {
    private int maSach;
    private String theloai;
    private String tensach;
    private String nhaXuatBan;
    private float donGia;
    private int soLuong;
    

    static Scanner scanner = new Scanner(System.in);
    public Sach(){
        
    }


    public Sach(int maSach,String tensach,String theloai, String nhaXuatBan, float donGia, int soLuong) {
        this.maSach = maSach;
        this.nhaXuatBan = nhaXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.tensach = tensach;
        this .theloai = theloai;
    }
 
    public String getTheloai() {
        return theloai;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }
    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getMaSach() {
        return maSach;
    }
 
    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }
 
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
 
    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
 
    public float getDonGia() {
        return donGia;
    }
 
    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
 
    public int getSoLuong() {
        return soLuong;
    }
 
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public void input(ArrayList<Sach> sachList){
        System.out.print("Nhập Id : ");
        boolean x = true;
        while (x) {
            x = false;
            int ma = Menu.nhapso();
            for (int i = 0; i < Main.sachList.size(); i++) {
                if (Main.sachList.get(i).getMaSach()==ma) {
                    x = true;
                    System.err.print("Id bạn nhập đã tồn tại (Vui lòng nhập lại!): ");
                    break;
                }

            }
            maSach=ma;
        }  
        scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        tensach=  scanner .nextLine();
        System.out.printf("Nhập thể loại của Sách %s: ",tensach);
        theloai = scanner.nextLine();//scanner.nextLine();
        System.out.printf("Nhà xuất bản của Sách %s: ",tensach);
        nhaXuatBan=  scanner .nextLine();//scanner.nextLine();
        System.out.printf("Nhập giá sách %s: ",tensach);
        donGia=  scanner .nextFloat();
        System.out.printf("Nhập số lượng sách %s: ",tensach );
        soLuong = Menu.nhapso();

    }
    public static void nhap(){
        System.out.print("Nhập số lượng sách cần thêm vào: ");
        int coun = Menu.nhapso();
        for (int i=1 ;i<=coun;i++){
            System.out.printf("Sách thứ %d\n", i);
            Sach sach1 = new Sach();
            sach1.input(Main.sachList);
            //  lưu vào mẳng Sách Lít 
            Main.sachList.add(sach1);
        }
    }
    public static void sapxep_id(ArrayList<Sach> sachList){
        for (int i = 0; i < sachList.size() - 1; i++){
            for (int j = 0; j < sachList.size() - i - 1; j++){
                if (sachList.get(j).getMaSach() > sachList.get(j+1).getMaSach()){
                    Sach temp = sachList.get(j);
                    sachList.set(j, sachList.get(j+1));
                    sachList.set(j+1, temp);
                }
            }
        }
        for (Sach i : sachList){
            i.display();
        }
    }

    public static void sapxep_name(ArrayList<Sach> sachList) {
        int n = sachList.size();
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
            // sắp xếp them alphabel a-->z
                if (sachList.get(j).getTensach().compareTo(sachList.get(j+1).getTensach()) > 0) {
                    dao_vt(j,sachList);
                }
            }
        }
        for (Sach i : sachList){
            i.display();
        }
    }
    static void dao_vt(int j,ArrayList<Sach> sachList){
        Sach temp = sachList.get(j);
        sachList.set(j,sachList.get(j+1));
        sachList.set(j+1, temp);
    }  
// tìm kiếm
    public static int timkiem_id(ArrayList<Sach> sachList){
        System.out.print("Nhập ID sách: ");
        int n =  Menu.nhapso();
        int i = 0;
        for (Sach j : sachList){
            i++;
            if (j.getMaSach() == n){
                System.out.print("\t|Mã sách|\t|Tên sach|\t|Thể loại\t|\t|Tên nhà xuất bản|\t\t|Đơn giá|\t|Số lượng|\n");
                j.display();
                System.out.printf("Vi tri: %d",i);
                return j.getMaSach();
            }
        }
        System.out.print("Chắc bạn nhập sai ID nên không tìm thấy sách!"); return -1;
    } 
    public static int timkiem_name(ArrayList<Sach> sachList){
        System.out.print("Nhập tên sách: ");
        String n = scanner.nextLine();
        int i = 0 ;
        for (Sach l : sachList){
            i++;
            if (l.getTensach().equalsIgnoreCase(n)){
                System.out.print("\t|Mã sách|\t|Tên sach|\t|Thể loại\t|\t|Tên nhà xuất bản|\t\t|Đơn giá|\t|Số lượng|\n");
                l.display();
                System.out.printf("Vi tri: %d",i);
                return i;
            }
        }
        System.out.print("Chắc bạn nhập sai tên sách nên không tìm thấy sách!");
        return -1;
    }
/// xóa and tim
    public static void xoa_id (){
        int index = tim_id();
        if (index != -1) Main.sachList.remove(index);
    }
    public static void xoa_name(){
        int index = tim_ten();
        if (index != -1) Main.sachList.remove(index);
    }
    public static int tim_id() {
        int dem;
        boolean x = true;
        while (x) {
            System.out.print("Nhập id: ");
            int ma = Menu.nhapso();
            dem = 0;
            for (int i = 0; i <Main.sachList.size(); i++) {
                if (ma == Main.sachList.get(i).getMaSach()) {
                    x = false;
                    return i;
                } else {
                    dem++;
                }
            }
            if (dem == Main.sachList.size()) {
                System.err.println("Bạn nhập id không tồn tại vui lòng nhập lại : ");
                x = true;
            }
        }
        return -1;
    }
    public static int tim_ten() {
        int dem;
        boolean x = true;
        while (x) {
            System.out.print("Nhập name ");
            String ten = scanner.nextLine();
            dem = 0;
            for (int i = 0; i <Main.sachList.size(); i++) {
                if (Main.sachList.get(i).getTensach().equalsIgnoreCase(ten)) {
                    x = false;
                    return i;
                } else {
                    dem++;
                }
            }
            if (dem == Main.sachList.size()) {
                System.err.println("Bạn nhập id không tồn tại vui lòng nhập lại : ");
                x = true;

            }
        }
        return -1;
    }


    public static Sach tim_ma(int ma, ArrayList<Sach> sachList) {
        for (Sach sach : sachList)
            if (ma == sach.getMaSach()) return sach;
        System.out.println("Không tồn tại");
        return null;
    }

    public void display(){
        
        System.out.print(toString());
    }
    @Override
    public String toString() {
        return String.format("\t|%-7s|\t|%-8s|\t|%-15s|\t|%-16s|\t\t|%-7.3f|\t|%-8d|\n",this.maSach, this.tensach, this.theloai, this.nhaXuatBan , this.donGia, this.soLuong);
    }
    

    public String showone() {
        return " Book : Id : " + this.maSach + ", Name Book : " + tensach;

    }  
}