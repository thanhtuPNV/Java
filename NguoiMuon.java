import java.util.*;
public class NguoiMuon{
    private String id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;
    static Scanner scanner = new Scanner(System.in);

    public NguoiMuon(){

    }

    public NguoiMuon(String id, String name, int age, String gender, String address, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }
    public void inputs(){
        System.out.print("Nhập mã Người mượn: ");
        boolean x = true;
        while (x) {
            x = false;
            String ma = scanner.nextLine();   
            for (int i = 0; i < Main.nguoimuonList.size(); i++) {
                if (Main.nguoimuonList.get(i).getId().equalsIgnoreCase(ma)) {
                    x = true;
                    System.err.print("Id bạn nhập đã tồn tại: ");
                    break;
                }

            }
            id=ma;
        }
        System.out.print("Nhập tên người mượn: ");
        name =  scanner .nextLine();
        System.out.printf("Nhập tuổi %s: ",name);
        age = Menu.nhapso();
        System.out.printf("Nhập giới tính %s: ",name);
        gender=  scanner .nextLine();
        System.out.printf("Nhập địa chỉ %s ",name);
        address=  scanner .nextLine();
        System.out.printf("Nhập số điện thoại  %s: ",name );
        phone = scanner .nextLine();

    }


    public static void nhap(){
        System.out.print("Nhập số lượng người mượn cần thêm vào: ");
        int coun = Menu.nhapso();
        for (int i=0 ;i<coun;i++){
            System.out.printf("Người thứ %d\n", (i+1));
            NguoiMuon nguoi = new NguoiMuon();
            nguoi.inputs();
                //  lưu vào mẳng Sách Lít 
            Main.nguoimuonList.add(nguoi);
            
        }
    }

    
    public static NguoiMuon timkiem_id_nguoimuon(String id, ArrayList<NguoiMuon> nguoimuonList) {
        for (NguoiMuon nm : nguoimuonList) {
            if (id.equalsIgnoreCase(nm.getId())) return nm;
        }
        System.err.println("Bạn nhập id không tồn tại vui lòng nhập lại : ");
        return null;
    }


    public static int timkiem_id_nguoimuon(ArrayList<NguoiMuon> nguoimuonList){
        System.out.print("Nhập ID sách: ");
        String n =  scanner.nextLine();
        int i = 0;
        for (NguoiMuon j : nguoimuonList){
            i++;
            if (j.getId().equalsIgnoreCase(n)){
                System.out.print("\t|Mã người mượn|\t\t|Tên người mượn|\t|Tuổi|\t\t|Giới tính|\t|Địa chỉ|\t|Số điện thoại|\n");
                j.displayy();
                System.out.printf("Vi tri: %d",i);
                return i;
            }
        }
        System.out.print("Chắc bạn nhập sai ID nên không tìm thấy người mượn!"); return -1;
    }
    
    public static int timkiem_name_nguoimuon(){
        System.out.print("Nhập tên sách: ");
        String n = scanner.nextLine();
        int i = 0;
        for (NguoiMuon l : Main.nguoimuonList){
            i++;
            if (l.getname().equalsIgnoreCase(n)){
                System.out.print("\t|Mã người mượn|\t\t|Tên người mượn|\t|Tuổi|\t\t|Giới tính|\t|Địa chỉ|\t|Số điện thoại|\n");
                l.displayy();
                System.out.printf("Vi tri: %d",i);
                return i;
            }
        }
        System.out.print("Chắc bạn nhập sai tên sách nên không tìm thấy người mượn!");
        return -1;
    }

    public static int tim_id() {
        int dem;
        boolean x = true;
        while (x) {
            System.out.print("Nhập id người mượn: ");
            String ma = scanner.nextLine();;
            dem = 0;
            for (int i = 0; i <Main.nguoimuonList.size(); i++) {
                if (Main.nguoimuonList.get(i).getId().equalsIgnoreCase(ma)) {
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
            for (int i = 0; i <Main.nguoimuonList.size(); i++) {
                if (Main.nguoimuonList.get(i).getname().equalsIgnoreCase(ten)) {
                    x = false;
                    return i;
                } else {
                    dem++;
                }
            }
            if (dem == Main.nguoimuonList.size()) {
                System.err.println("Bạn nhập id không tồn tại vui lòng nhập lại : ");
                x = true;

            }
        }
        return -1;
    }
// xóa nè
    public static void xoa_id (){
        int index = tim_id();
        if (index != -1) Main.nguoimuonList.remove(index);
    }



    public static void xoa_name(){
        int index = tim_ten();
        if (index != -1) Main.nguoimuonList.remove(index);
    } 
        
    public void displayy(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return String.format("\t|%-15s|\t|%-15s|\t|%-7d|\t|%-10s|\t\t|%-15s|\t\t|%-20s|",getId(),getname(),getAge(),getGender(),getAddress(),getPhone());
    }

    public String showone()
    {
        return " Nguời mượn : id= "+this.id +" Name : "+ this.name +", "+ this.phone ;
    }
}