package com.jonasriedel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GetHexCode();
    }

    public static void GetHexCode() {
        TerminalColors tc = new TerminalColors();
        Scanner sc = new Scanner(System.in);

        System.out.println("Which HEX code do you want?" + tc.GREEN + "Green " + tc.BLUE + "Blue " + tc.RED + "Red " + tc.YELLOW + "Yellow " + tc.BLACK +
                           "Black " + tc.CYAN + "Cyan " + tc.RESET + "or " + tc.WHITE + "White?");

        String userInput = sc.nextLine();

        switch(userInput.toLowerCase()) {
            case "green":
                System.out.println(tc.GREEN + HexCode.GREEN + tc.RESET);
                break;
            case "blue":
                System.out.println(tc.BLUE + HexCode.BLUE + tc.RESET);
                break;
            case "red":
                System.out.println(tc.RED + HexCode.RED + tc.RESET);
                break;
            case "yellow":
                System.out.println(tc.YELLOW + HexCode.YELLOW + tc.RESET);
                break;
            case "black":
                System.out.println(tc.BLACK + HexCode.BLACK + tc.RESET);
                break;
            case "cyan":
                System.out.println(tc.CYAN + HexCode.CYAN + tc.RESET);
                break;
            case "white":
                System.out.println(tc.WHITE + HexCode.WHITE + tc.RESET);
                break;
            default:
                System.out.println(tc.RED + userInput + " is not a valid color!" + tc.RESET);
        }
    }
}
