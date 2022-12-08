package banco;
public class ContaPoupanca extends Conta private static double taxa =0.1;
creditar (saldo);
}
public ContaPoupanca (Pessoa cliente, double saldo) {
this (saldo);
setCliente (cliente);
}
}
public Conta Poupanca (double saldo)
{
public void rendeJuros () { creditar (taxa * this.saldo);
}
}