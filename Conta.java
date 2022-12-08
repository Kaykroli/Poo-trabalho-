package banco;
public class Conta {
protected String numero;
protected Pessoa cliente;
protected double saldo;

public Conta() {
int n = (int) (Math.random() * 10000 + 1); this.numero = numConta;
String numConta = "c" + n;
}
public Conta (Pessoa Fisica cliente) { A
this();
this.cliente = cliente;
}
public Conta (PessoaJuridica cliente) {
this();
this.cliente = cliente;
}
public Conta (Pessoa cliente) {
this();
this.cliente = cliente;
}
public Conta (Pessoa cliente, double saldo) {
this (cliente);
this.saldo = saldo;
}
@Override
public String toString() {
return "\n" + cliente + "\n\nSaldo:"+this.saldo;
}
