import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę studentów");
        int studenci = inputInt();
        zadanie1(studenci);
        zadanie2();
        System.out.println("Podaj długość ciągu liczb");
        int n = inputInt();
        zadanie3(n);
        zadanie4();
        System.out.println("Podaj wyraz");
        String wyraz = inputChar();
        zadanie5(wyraz);
    }//koniec main
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static double inputDouble(){
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextDouble();
        return liczba;
    }
    public static boolean inputBoolean() {
        Scanner scanner = new Scanner(System.in);
        boolean wartoscBoolean = scanner.nextBoolean();
        return wartoscBoolean;
    }

    public static String inputChar(){
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();
        return symbol;
    }
    public static void zadanie1(int students){
        double avg = 0;
        for (int i=1;i<=students;i++)
        {
            System.out.println("Podaj liczbę punktów studenta");
            double punkty = inputDouble();
            avg = avg + punkty;
        }
        avg = avg/students;
        System.out.println("Średnia punktów: "+avg);
    }
    public static void zadanie2(){
        int ujemne = 0;
        int dodatnie = 0;
        double suma = 0;
        for(int i=0; i<10;i++){
            System.out.println("Podaj liczbę");
            double x = inputDouble();
            if(x<0)
            {
                ujemne++;
            } else{
                dodatnie++;
            }
            suma = suma + x;
        }
        System.out.println("Użytkownik wprowadził "+dodatnie+" liczb dodatnich, "+ujemne+" liczb ujemnych, ich suma wynosi "+suma);
    }
    public static void zadanie3(int n){
        double sumaParzystych = 0;
        for(int i=0;i<n;i++){
            System.out.println("Podaj liczbę");
            double x = inputDouble();
            if(x%2==0)
            {
                sumaParzystych = sumaParzystych + x;
            }
        }
        System.out.println("Suma parzystych liczb tego ciągu wynosi "+sumaParzystych);
    }
    public static int random(int poczatekPrzedzialu, int koniecPrzedzialu){
        Random random = new Random();
        int randomized = random.nextInt(koniecPrzedzialu-poczatekPrzedzialu+1)+poczatekPrzedzialu;
        return randomized;
    }
    public static void zadanie4(){
        System.out.println("Podaj ilość losowań");
        int n = inputInt();
        int suma = 0;
        for(int i = 0; i<n; i++){
            int losowa = random(-10,45);
            System.out.println(losowa);
            if (losowa%2 == 0){
                suma = suma + losowa;
            }
        }
        System.out.println("Suma parzystych losowych wynosi "+suma);
    }
    public static void zadanie5(String wyraz){
        int length = wyraz.length();
        for(int i=0;i < length; i++){
            if(wyraz.charAt(i) != wyraz.charAt(length-1-i)){
                System.out.println(wyraz+" nie jest palindromem");
                return;
            }
        }
        System.out.println(wyraz+" jest palindromem");
    }
}// koniec klasy