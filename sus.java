package src;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class sus {
    public static void main (String args[]) throws IOException{
        File file = new File("c://sus//file.txt");
        file.createNewFile();

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String str1 = sc1.nextLine();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите номер группы: ");
        String str2 = sc2.nextLine();

        FileWriter writer = new FileWriter(file);

        writer.write("ФИО: " + str1);
        writer.write("\n");
        writer.write("Номер группы: " + str2);
        writer.close();

        FileReader reader = new FileReader(file);
        Scanner scan = new Scanner(reader);

        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        reader.close();
    }

}
