package com.unifsa.logitech;

public class GestaoLogistica {

    public static void main(String[] args) {
       // Exemplo de como eles devem começar:
        
        Motorista mot1 = new Motorista();
        mot1.nome = "Joaquim";
        mot1.cnh = "123456-A";

        Veiculo caminhao = new Veiculo();
        caminhao.modelo = "Volvo FH";
        caminhao.capacidadeCarga = 15000.0;
        caminhao.condutor = mot1; // Atribuindo o objeto motorista ao veículo

        // TODO: Instanciar a Carga e a Rota, e chamar os métodos.
    }
}
