
package com.unifsa.logitech;

public class Rota {
    public String origem;
    public String destino;
    public double distanciaKm;
    public double precoCombustivel;

    public void iniciarViagem(Veiculo v, Carga c) {
        System.out.println("--- Iniciando Verificação de Viagem ---");
        
        // TODO 1: Verificar se o peso da carga (c.peso) é maior que a capacidade do veículo (v.capacidadeCarga)
        
        // TODO 2: Verificar se o veículo está em manutenção (v.emManutencao)
        
        // TODO 4: Verificar se o veículo possui um condutor (v.condutor == null)
        
        // Se passar em tudo, autorizar a viagem!
    }

    public void gerarManifesto(Veiculo v, Carga c) {
        System.out.println("\n========== MANIFESTO DE CARGA ==========");
        // TAREFA 5: Imprimir os dados consolidados: Motorista, Placa, Carga e Destino.
    }
    
}
