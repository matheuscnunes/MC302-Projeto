package main.java.Interface;

import main.java.repositorio.Gerenciador;
import main.java.entity.member.TipoDeUsuario;
import main.java.repositorio.GerenciadorLogin;

import java.util.Scanner;

public class LoginInterface extends Interface {
    private final TipoDeUsuario TIPO_USUARIO;

    public LoginInterface(Scanner input, TipoDeUsuario tipoUsuario) {
        super(input);
        this.TIPO_USUARIO = tipoUsuario;
    }

    public boolean apresentarLogin() throws Exception {
        System.out.println("\n//////////////////////////////////////////\n");
        String email = PrincipalAluno.obtemEmail(input);
        System.out.print("\nDigite sua senha: ");
        String senha = input.next();

        return validarLogin(email, senha);
    }

    private boolean validarLogin(String email, String senha) throws Exception {
        return GerenciadorLogin.login(TIPO_USUARIO, email, senha);
    }
}
