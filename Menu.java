import java.util.*;
public class Menu{
    
    public static int nhapso(){
        int so;
        Scanner scanner = new Scanner(System.in);

        while(true){
            String str = scanner.nextLine();
            // if (str.trim().equals("")) {
            //     System.out.println("Ban nhap chuoi rong, xin vui long nhap lai.");
            //     continue;
            // }
            try {
                so = Integer.parseInt(str);
            } catch (NumberFormatException ex) {
                System.out.print("Bạn nhập chuỗi không hợp lệ, xin vui lòng nhập số: ");
                continue;
            }
            return so;
        }
    }
        
    public static void showsss(){
        System.out.printf("\n\t|%-7s|\t|%-8s|\t|%-15s|\t|%-16s|\t\t|%-7s|\t|%-8s|\n","Mã sách","Tên sách","Thể loại","Tên nhà xuất bản","Đơn giá","Số lượng");
    }
    public static void showthe1(){
        System.out.printf("%-10s%-30s%-30s%-30s%-30s%-30s\n","ID thẻ","Ngày mượn","ngày trả","số luượg","người mượn","sách");
    }
    public static void showthemuon(){
        for (Themuon a: Main.themuonlist){
            a.showthe();
        }
    }
    public static void shows(){
        for (Sach sa : Main.sachList){
            sa.display();;
        }
    }

    public static void shownguoimuon(){
        System.out.printf("\t|%-15s|\t|%-15s|\t|%-7s|\t|%-10s|\t\t|%-15s|\t\t|%-20s|\n","Mã người mượn","Tên người mượn","Tuổi","Giới tính","Địa chỉ","Số điện thoại");

    }
    public static void showsnguoi(){
        for (NguoiMuon sa : Main.nguoimuonList){
            sa.displayy();
        }
    }
    // menu chính

    public static void menu() {
        System.out.println("""
    
        _______________________________________
       |                                       |
       |****  ******QUẢN LÍ THƯ VIỆN*****  ****|
       |                                       |
       |1: Quản lí sách!                       |
       |2: Quản lí người mượn!                 |
       |3: Quản lý thẻ mượn!                   |
       |4. Thoát chương trình!                 |
       |_______________________________________|""");
        System.out.print("Xin vui lòng chọn! :");
    }
    // menu Sách
    public static void case1(){
        System.out.println("""  

         _____________________________
        |&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|
        |****** QUẢN LÝ SÁCH *********|
        |&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|
        |&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|

        1. Nhập thêm thông tin sách!
        2. Hiển thị thông tin cuốn sách! 
        3. Sắp xếp sách! 
        4. Tìm Sách! 
        5. Xóa Sách!
        6. Trở về menu!""") ; 
        System.out.print("Xin vui lòng chọn! :");

    }
    // xáp xếp
    public static void case1_3(){
        System.out.println("""


         _____________________________
        |*****************************|
        |********* SẮP XẾP ***********|
        |*****************************|
        |&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|

        1. Sắp xếp sách  theo ID! 
        2. Sắp xếp sách theo tên! 
        3. Trở về menu quản lý Sách!""");
        System.out.print("Xin vui lòng chọn! :");
    }
    // tìm Sách
    public static void case1_4(){
        System.out.println("""

         _____________________________
        |*****************************|
        |******** TÌM SÁCH ***********|
        |*****************************|
        |&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|

        1. Tìm sách theo ID! 
        2. Tìm xếp sách theo tên sách!
        3. Trở về menu quản lý Sách!""");
        System.out.print("Xin vui lòng chọn! :");
    }
    // xóa sách
    public static void case1_5(){
        System.out.println("""

         _____________________________
        |*****************************|
        |******** XÓA SÁCH ***********|
        |*****************************|
        |&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|

        1. Xóa sách theo ID! 
        2. Xóa xếp sách theo tên sách!
        3. Trở về menu quản lý Sách!""");
        System.out.print("Xin vui lòng chọn! :");
    }

    // menu Người mượn
    public static void case2(){
        System.out.println("""

         _____________________________
        |&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|
        |**** QUẢN LÝ NGƯỜI MƯỢN *****|
        |&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|
        |&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|

        1. Nhập thêm thông tin Người mượn!
        2. Hiển thị thông tin Người mượn!
        3. Tìm Người mượn! 
        4. Xóa Người mượn!
        5. Trở về menu!""") ; 
        System.out.print("Xin vui lòng chọn! :");
    }
    // tìm người mượn
    public static void case2_3(){
        System.out.println("""

         _____________________________
        |*****************************|
        |***** TÌM NGƯỜI MƯỢN ********|
        |*****************************|
        |&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|

        1. Tìm người mượn theo ID!
        2. Tìm người mượn theo tên người mượn!
        3. Trở về menu!""");
        System.out.print("Xin vui lòng chọn! :");
    }
    // xóa người mượn
    public static void case2_4(){
        System.out.println("""

         _____________________________
        |*****************************|
        |***** XÓA NGƯỜI MƯỢN ********|
        |*****************************|
        |&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|
        
        1. Xóa người mượn theo ID! 
        2. Xóa người mượn theo tên người mượn!
        3. Trở về menu!""");
        System.out.print("Xin vui lòng chọn! :");
    }
    public static void case3(){
        System.out.println("""
         _____________________________
        |*****************************|
        |***** QUẢN LÝ THẺ MƯỢN ******|
        |*****************************|
        |&&&&&&&&&&&&&&&&&&&&&&&&&&&&&|

        1. Thêm thẻ mượn!
        2. Hiện thị thẻ mượn!
        3. Trở về menu!""");
        System.out.print("Xin vui lòng chọn! :");
    }
}