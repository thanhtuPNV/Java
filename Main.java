import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static ArrayList<Sach> sachList = new ArrayList<>();
    public static ArrayList<NguoiMuon> nguoimuonList = new ArrayList<>();
    public static ArrayList<Themuon> themuonlist = new ArrayList<>();
    
    public static void main(String[] args) {
        Sach s1 = new Sach (2222,"BBBB","Tiểu thuyết","Trường huế",4.5f,10);
        Sach s2 = new Sach (1111,"DDDD","Truyện tranh","Trường huế",6.9f,10);
        Sach s3 = new Sach (3333,"CCCC","Luật pháp","Trường Hà NỘi",9.5f,10);
        Sach s4 = new Sach (4444,"AAAA","truyện ma","Thái Lan",9.56f,10);
        sachList.add(s1);
        sachList.add(s2);
        sachList.add(s3);
        sachList.add(s4);

        NguoiMuon nm1 = new NguoiMuon ("aaaa", "Nguyen Van A", 11, "Nam", "Đà Nẵng", "1234567890");
        NguoiMuon nm2 = new NguoiMuon ("bbbb", "Tran Thi B", 21, "Nữ", "Đà Nẵng", "9876543211");
        NguoiMuon nm3 = new NguoiMuon ("cccc", "Hoang van c", 14, "Nam", "Đà Nẵng", "12132123542");
        NguoiMuon nm4 = new NguoiMuon ("dddd", "Nguyen Thi D", 16, "Nữ", "Đà Nẵng", "12312345123");
        nguoimuonList.add(nm1);
        nguoimuonList.add(nm2);
        nguoimuonList.add(nm3);
        nguoimuonList.add(nm4);

        
        Themuon tm1 = new Themuon("1111", "23/05/2021", "29/05/2021",2, nm3, s3);
        Themuon tm2 = new Themuon("2222", "07/06/2021", "13/06/2021",1, nm3, s2);
        Themuon tm3 = new Themuon("3333", "15/06/2021", "20/06/2021",3, nm1, s4);
        Themuon tm4 = new Themuon("4444", "20/07/2021", "27/07/2021",2, nm2, s1);
        themuonlist.add(tm1);
        themuonlist.add(tm2);
        themuonlist.add(tm3);
        themuonlist.add(tm4);

        
        int luachon;
        Menu.menu();
        do {
            
            luachon = Menu.nhapso();
            switch(luachon){
                case 1: {
                    Menu.case1();
                    do {
                        luachon = Menu.nhapso();
                        switch(luachon){
                            case 1:{ 
                                Sach.nhap();
                                Menu.showsss();
                                Menu.shows();   
                                Menu.case1();;                
                            }
                            break;
                            case 2: {
                                Menu.showsss();
                                Menu.shows();
                                Menu.case1();            
                            }
                            break;
                            
                            case 3:{
                                Menu.case1_3();
                                do{
                                    luachon = Menu.nhapso();
                                    switch(luachon){
                                        case 1 : Menu.showsss();
                                        Sach.sapxep_id(sachList);Menu.case1_3(); break;
                                        case 2: Menu.showsss();
                                        Sach.sapxep_name(sachList);Menu.case1_3(); break;
                                        case 3:Menu.case1(); break;
                                        default:
                                            System.out.println("Chức năng bạn muốn không có ! vui lòng nhập lại: ");
                                    }
                                }
                                while (luachon != 3);
                            }
                            break;
                            case 4:{
                                Menu.case1_4();
                                do{
                                    luachon = Menu.nhapso();
                                    switch(luachon){
                                        case 1 : {                                                                                                                                               
                                            Sach.timkiem_id(sachList); Menu.case1_4();
                                        }
                                            break;
                                        case 2:  Sach.timkiem_name(sachList);Menu.case1_4();break;
                                        case 3: Menu.case1();break;
                                        default:
                                            System.out.println("Chức năng bạn muốn không có ! vui lòng nhập lại:  ");
                                    }
                                }
                                while (luachon != 3);
                            }
                            break;
                            case 5:{
                                Menu.case1_5();
                                do{
                                    
                                    luachon = Menu.nhapso();
                                    switch(luachon){
                                        case 1 :{
                                            Sach.xoa_id();
                                            Menu.showsss();
                                            Menu.shows();
                                            Menu.case1_5();

                                        }
                                        break;

                                        case 2: Sach.xoa_name();
                                            Menu.showsss();
                                            Menu.shows();
                                            Menu.case1_5();
                                            break;
                                        case 3:Menu.case1(); break;
                                        default:
                                            System.out.println("Chức năng bạn muốn không có ! vui lòng nhập lại");
                                    }
                                }
                                while (luachon != 3);
                            }
                            break;
                            case 6:Menu.menu();
                            break;
                            default:
                            System.out.println("Chức năng bạn muốn không có ! vui lòng nhập lại:  ");
                        }
                    }
                    while (luachon !=6);
                }
                break;

                case 2:{
                    Menu.case2();
                    do {
                        luachon = Menu.nhapso();
                        switch(luachon){
                            case 1: NguoiMuon.nhap();Menu.shownguoimuon();Menu.showsnguoi(); Menu.case2(); break;
                            case 2: Menu.shownguoimuon();Menu.showsnguoi();Menu.case2();;break;
                            case 3:{
                                Menu.case2_3();
                                do{
                                    
                                    luachon = Menu.nhapso();
                                    switch(luachon){
                                        case 1 : {
                                            NguoiMuon.timkiem_id_nguoimuon(nguoimuonList); Menu.case2_3();
                                        }break;
                                        case 2: {
                                            NguoiMuon.timkiem_name_nguoimuon();Menu.case2_3();
                                        }break;
                                        case 3:{
                                            Menu.case2();}
                                            break;
                                        default:
                                            System.out.println("Chức năng bạn muốn không có ! vui lòng nhập lại:   ");
                                    }
                                }
                                while (luachon != 3);
                            }break;
                            case 4:{
                                Menu.case2_4();
                                do{
                                    luachon = Menu.nhapso();
                                    switch(luachon){
                                        case 1: {
                                            NguoiMuon.xoa_id();
                                            Menu.shownguoimuon();
                                            Menu.showsnguoi();
                                            Menu.case2_4();
                                        }break;
                                        case 2: {
                                            NguoiMuon.xoa_name();
                                            Menu.shownguoimuon();
                                            Menu.showsnguoi();
                                            Menu.case2_4();
                                        }break;
                                        case 3: {
                                            Menu.case2();
                                        }break;
                                        default:
                                        System.out.println("Chức năng bạn muốn không có ! vui lòng nhập lại:   ");
                                        
                                    }
                                }
                                while (luachon != 3);
                            }break;
                            case 5: Menu.menu();
                            break;
                            default:
                                System.out.println("Chức năng bạn muốn không có ! vui lòng nhập lại:   ");
                        }                    
                    } 
                    while (luachon != 5);
                }
                break;
                case 3:{
                    Menu.case3();
                    int chon;
                    do{
                        chon = Menu.nhapso();
                        switch(chon){
                            case 1: {
                                
                                Themuon muon = new Themuon();
                                System.out.print("Số lượng thẻ: ");
                                int the = Menu.nhapso();
                                for (int i=1;i <= the;i++){
                                    System.out.println("Thẻ: " + i);
                                    muon.input_the_muon();
                                    NguoiMuon nm;
                                    while (true){
                                        System.out.print("Nhập id của người mươn: ");
                                        String id = sc.nextLine();
                                        nm = NguoiMuon.timkiem_id_nguoimuon(id, nguoimuonList);
                                        if (nm != null) 
                                        break;
                                    }
                                    Sach s;
                                    while (true){
                                        System.out.print("Nhập id sách: ");
                                        int idsach = Menu.nhapso(); 
                                        s = Sach.tim_ma(idsach, sachList);
                                        if (s != null)
                                        break;
                                    }
                                    muon.input_nm_s(nm, s);
                                    themuonlist.add(muon);
                                }
                                Menu.showthe1();
                                Menu.showthemuon();                             
                            }
                            Menu.case3();
                            break;
                            case 2: Menu.showthe1();
                            Menu.showthemuon();Menu.case3(); break;
                            case 3: Menu.menu();
                            break;
                            default: 
                                System.out.println("Chức năng bạn muốn không có ! vui lòng nhập lại:   ");
                        }
                    }
                    while (chon != 3);
                }break;
                case 4:; break;
                default:
                    System.out.println("Chức năng bạn muốn không có ! vui lòng nhập lại:   ");
            }    
        } 
        while (luachon != 4);
    }
}   