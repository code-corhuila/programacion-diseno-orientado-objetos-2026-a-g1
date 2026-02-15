public class CuentaBancaria {
    private String numero;
    private double saldo;

    public CuentaBancaria(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser mayor a 0.");
            return;
        }
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a 0.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes.");
            return;
        }
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}