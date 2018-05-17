package main.java.main;

import main.java.entity.Gerenciador;
import main.java.utils.Utils;

import javax.xml.transform.sax.SAXSource;
import java.io.Console;
import java.util.Scanner;



public class PrincipalLogin {

    public static void main(String args[]){
        System.out.println("Login.... ");

        Scanner input = new Scanner(System.in);

        boolean login = false;

        while(login == false){
            login = login(input);

            if(login){
                Principal.main(null);
            }else{
                System.out.println("\nFaça o login novamente..");
            }
        }
    }

    public static boolean login(Scanner input) {
        String email = "", senha;

        email = obtemEmail(input);

        senha = obtemSenha(input);

        return Gerenciador.login(email, senha);
    }

    private static String obtemEmail(Scanner input) {
        String email = "";
        do {
            if (!email.trim().equals("")) {
                System.out.println("Email inválido");
            }

            System.out.println("Digite o email:");
            email = input.next();

        } while (!Utils.validateEmail(email) && !email.equals("admin"));
        return email;
    }

    private static String obtemSenha(Scanner input){
        //return new String(System.console().readPassword("Please enter your password: "));
        System.out.println("Digite a senha:");
        return input.next();
    }
}