package week5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     House houseInno104 = new House(104, 5, 40, 1234);
     House houseInno126 = new House(126, 10, 35, 4325);
     House[] houseInnoSportivnaya = {houseInno104, houseInno126};

     House houseInno180 = new House(180, 10, 55, 45165);
     House houseInno185 = new House(185, 15, 36, 3456423);
     House[] houseInnoCentralnaya = {houseInno180, houseInno185};

     Parks cone = new Parks("Шишки", 15, 50);
     Parks artSpace = new Parks("ArtSpace", 20, 25);
     Parks[] parksInno = {cone, artSpace};

     Streets sportivnaya = new Streets("Спортивная", 100, 50, false, houseInnoSportivnaya, parksInno);
     Streets centralnaya = new Streets("Центральная", 150, 46, true, houseInnoCentralnaya, parksInno);
     Streets[] streetsInno = {sportivnaya, centralnaya};

     Cities Inno = new Cities("Иннополис", 3000, 5000, streetsInno);

     House houseKizlyar1 = new House(1, 15, 53, 5415091);
     House houseKizlyar6 = new House(6, 25, 44, 46271);
     House[] houseKizlyarBagrations = {houseKizlyar1, houseKizlyar6};

     House houseKizlyar10 = new House(10, 11, 65, 5425265);
     House houseKizlyar56 = new House(56, 23, 44, 367265);
     House[] houseKizlyarNaberezhnaya = {houseKizlyar10, houseKizlyar56};

     Parks victory = new Parks("Победы", 50, 150);
     Parks cheremushki = new Parks("Черемушки", 66, 222);
     Parks[] parksKizlyar = {victory, cheremushki};

     Streets bagrations = new Streets("Багратиона", 2000, 60, false, houseKizlyarBagrations, parksKizlyar);
     Streets naberezhnaya = new Streets("Набережная", 3000, 50, false, houseKizlyarNaberezhnaya, parksKizlyar);
     Streets[] streetsKizlyar = {bagrations, naberezhnaya};

     Cities Kizlyar = new Cities("Кизляр", 30000, 50000, streetsKizlyar);
    }
}
