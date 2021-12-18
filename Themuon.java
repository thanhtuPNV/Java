import java.util.Scanner;

public class Themuon {
    private String id_the_muon;
    private String ngay_muon;
    private String ngay_tra;
    private String thang_muon;
    private String thang_tra;
    private NguoiMuon nguoimuon;
    private Sach id_sach;
    private int so_luong;
    

    public Themuon(){

    }

    public Themuon(String id_the_muon, String ngay_muon, String ngay_tra, int so_luong, NguoiMuon nguoimuon, Sach id_sach) {
        this.setId_the_muon(id_the_muon);
        this.setngay_muon(ngay_muon);
        this.setngay_tra(ngay_tra);
        this.setNguoimuon(nguoimuon);
        this.setId_sach(id_sach);
        this.setSo_luong(so_luong);
    }
    
    public String getThang_tra() {
        return thang_tra;
    }

    public void setThang_tra(String thang_tra) {
        this.thang_tra = thang_tra;
    }

    public String getThang_muon() {
        return thang_muon;
    }

    public void setThang_muon(String thang_muon) {
        this.thang_muon = thang_muon;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public Sach getId_sach() {
        return id_sach;
    }

    public void setId_sach(Sach id_sach) {
        this.id_sach = id_sach;
    }

    public NguoiMuon getNguoimuon() {
        return nguoimuon;
    }

    public  void setNguoimuon(NguoiMuon nguoimuon) {
        this.nguoimuon = nguoimuon;
    }

    public String getngay_tra() {
        return ngay_tra;
    }

    public void setngay_tra(String ngay_tra) {
        this.ngay_tra = ngay_tra;
    }

    public String getngay_muon() {
        return ngay_muon;
    }

    public void setngay_muon(String ngay_muon) {
        this.ngay_muon = ngay_muon;
    }

    public String getId_the_muon() {
        return id_the_muon;
    }

    public void setId_the_muon(String id_the_muon) {
        this.id_the_muon = id_the_muon;
    }

    
    
    // them thẻ mượn
    protected int days;
    protected int months;
    public void input_the_muon()  { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã thẻ:");
        boolean a = true;
        while (a) {
            a = false;
            String ma = sc.nextLine();   
            for (int i = 0; i < Main.themuonlist.size(); i++) {
                if (Main.themuonlist.get(i).getId_the_muon().equalsIgnoreCase(ma)) {
                    a = true;
                    System.err.print("Id bạn nhập đã tồn tại: ");
                    break;
                }

            }
            id_the_muon=ma;
        }
        boolean x = true;
        int  day;
        int month;
        while (x) {
            String save;
            System.out.print("Nhập ngày mượn:(dd--mm--yy): ");
            this.ngay_muon=save = sc.nextLine();
            day = (save.charAt(0)*10+save.charAt(1));
            days = day;
            month =(save.charAt(3)*10)+save.charAt(4);
            months = month;
            if ((day <=559 && day >=501) && (month <= 540 && month >= 500 )){
                x = false;
            }
            else{
                System.out.println("Vui lòng nhập lại: ");
            }
        }
        x = true;
        
        while (x) {
            String save;
            System.out.print("Nhập ngày trả:(dd--mm--yy): ");
            this.ngay_tra=save = sc.nextLine();
            int day1 = (save.charAt(0)*10+save.charAt(1));
            int month1 =(save.charAt(3)*10)+save.charAt(4);
            
            if ((day1 <=559 && day1 >=501) && (month1 <= 540 && month1 >= 500 )){
                x = false;
                if(day1 < days ){
                    x = true;
                    System.out.println("Ngày trả nhỏ hơn ngày mượn! Vui lòng nhập lại!");
                }
                if(month1 < months){
                    x = true;
                    System.out.println("Tháng trả nhỏ hơn tháng mượn! Vui lòng nhập lại!");
                }
            }
            else {
                System.out.println("Nhập sai ngày! Vui lòng nhập lại!");
            }
        }
        System.err.print("Nhập số lượng cuốn sách: ");
        so_luong= Menu.nhapso();
    }

    public void input_nm_s(NguoiMuon nm, Sach s){
        this.setNguoimuon(nm);
        this.setId_sach(s);

    }
    
    public void showthe(){
        System.out.print(toString());
    }
    @Override
    public String toString() {
        
        return String.format("%-10s%-30s%-30s%-30d%-30s%-30s\n",this.id_the_muon, this.ngay_muon, this.ngay_tra, this. so_luong, this.nguoimuon.getId(),this.id_sach.getMaSach());
    }
}