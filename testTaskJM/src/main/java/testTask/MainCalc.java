package testTask;

import java.util.Scanner;

public class MainCalc {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Calculator calc = new Calculator();
        RomNum rom = new RomNum();
        int val1;
        int val2;
        char op =  '!';
        String info;
        System.out.println("Введите операцию, чтобы было "
                        + "обязательно с пробелами, например " + System.lineSeparator()
                        + "1 + 1 или VII + IV, в диапазоне от 1 до 10");
        info = scn.nextLine();
        String temp1 = info.split(" ")[0];
        String temp2 = info.split(" ")[2];
        String opt = info.split(" ")[1];
        val1 = Integer.parseInt(rom.romToDeca(temp1));
        val2 = Integer.parseInt(rom.romToDeca(temp2));
        if (opt.matches("[-*/+]")) {
            op = opt.charAt(0);
        }
        int rsl = calc.calculator(val1, val2, op);
        if (val1 > 0 && val1 <= 10 && val2 > 0 && val2 <= 10) {

            if (temp1.matches("[a-zA-Z]") && temp2.matches("[0-9]")
                    || temp1.matches("[0-9]") && temp2.matches("[a-zA-Z]")) {
                throw new IllegalStateException("Неправильный ввод данных!");
            } else if (temp1.matches("[0-9]") && temp2.matches("[0-9]")) {
                System.out.print(rsl);
            }  else {
                System.out.print(rom.DecaToRom(rsl));
            }
        } else {
            throw new IllegalStateException("Неправильный ввод данных!");
        }
    }
}
