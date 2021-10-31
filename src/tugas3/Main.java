package tugas3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String Nama;

        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Masukan Nama :");
        Nama = Keyboard.nextLine();
        System.out.println("Welcome to Java Programing " + Nama);
    }
}