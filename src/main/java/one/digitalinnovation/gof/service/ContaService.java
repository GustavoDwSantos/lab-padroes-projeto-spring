package one.digitalinnovation.gof.service;
import one.digitalinnovation.gof.model.Conta;


public interface ContaService {
    
    double transferir(double saldo, double contaDestinatario);
    double depositar(double saldo);
    double sacar(double saldo);
}
