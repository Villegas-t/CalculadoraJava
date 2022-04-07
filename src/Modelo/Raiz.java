package Modelo;

public class Raiz extends Operacao {

	@Override
	public String getNomeOperacao() {
		
		return "R";
	}

	@Override
	public int getNumeroOperandos() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	protected Double executarCalculo() {
		return Math.sqrt(operandos.get(0));
	}
	
	
	@Override
	public String saidaCalculo() {
		return "R" + this.operandos.get(0) + " = " + calcular().toString();
		
	}
}
