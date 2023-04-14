package bytebank;

public class TestReferencia {
    
    public static void main(String[] args) {

        // Elemento mas generico puede ser adaptado 
        // a un elemento mas especifico
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Steve");

        Gerente gerente = new Gerente();
        gerente.setNombre("Lesly");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        funcionario.iniciarSesion
    }
}
