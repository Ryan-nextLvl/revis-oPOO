
package com.unifsa.logitech;

public class Rota {
    public String origem;
    public String destino;
    public double distanciaKm;
    public double precoCombustivel;

    public void iniciarViagem(Veiculo v, Carga c) {
        System.out.println("--- Iniciando Verificação de Viagem ---");
        
        // TODO 1: Verificar se o peso da carga (c.peso) é maior que a capacidade do veículo (v.capacidadeCarga)
        if (c.peso > v.capacidadeCarga) {
            System.out.println("ALERTA: Carga excede a capacidade do veículo. Viagem não autorizada.");
            return;
        }
        System.out.println("Carga dentro da capacidade do veículo. Seguindo com a operação...");
        
        // TODO 2: Verificar se o veículo está em manutenção (v.emManutencao)
        if (v.emManutencao) {
            System.out.println("ALERTA: Veículo em manutenção. Viagem não autorizada.");
            return;
        }
        System.out.println("Veículo disponível. Seguindo com a operação...");
        // TODO 3: Verificar se o veículo tem autonomia suficiente para a viagem (distanciaKm / autonomiaKmPorLitro)
        precoCombustivel = distanciaKm / v.autonomiaKmPorLitro;
        double custoViagem = distanciaKm / v.autonomiaKmPorLitro * precoCombustivel;
        
        // TODO 4: Verificar se o veículo possui um condutor (v.condutor == null)
        Motorista condutorMotorista = v.condutor;
        if (condutorMotorista == null) {
            System.out.println("ALERTA: Veículo sem condutor. Falta de pessoal.");
            return;
        } else if (condutorMotorista.cnh == null) {
            System.out.println("ALERTA: Condutor sem CNH. Viagem não autorizada.");
            return;
        }
        System.out.println("Condutor disponível. Seguindo com a operação...");
        // Se passar em tudo, autorizar a viagem!
    }

    public void gerarManifesto(Veiculo v, Carga c) {
        System.out.println("\n========== MANIFESTO DE CARGA ==========");
        
       
    }
    
}
