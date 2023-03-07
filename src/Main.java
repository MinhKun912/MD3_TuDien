import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         String[] student={"minh","tuan","cuong"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ten Muon tim kiem");
        String inputName=scanner.nextLine();
        boolean isExits=false;

        for(int i=0;i<student.length;i++){
            if (student[i].equals(inputName)){
                System.out.println(inputName + " o vi tri thu"+i);
                isExits=true;
                break;
            }if (!isExits){
                System.out.println("Khong tim thay"+inputName+"trong list");
            }
        }

    }
}