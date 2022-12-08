package banco;
public class ContaEspecial extends Conta
{
private double limite;
public ContaEspecial (Pessoa Fisica cliente) {
super (cliente);
this.limite = 500;
this.numero += "S";
}
public ContaEspecial (Pessoa Fisica cliente, double saldo) {
this (cliente);

this.saldo = saldo;
}
public ContaEspecial (PessoaJuridica cliente) {
super(cliente);
this.limite = 500;
this.numero += "s";
}
public ContaEspecial (PessoaJuridica cliente, double saldo) {
this (cliente);
this.saldo = saldo;
}
public void setLimite (double valor) {
this.limite = valor;
}
public void setLimite (String valor) {
double num = Double.parseDouble(valor);
this.limite = num;
}
public double getLimite()
{
return this.limite;
}