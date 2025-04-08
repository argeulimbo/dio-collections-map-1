package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	private Set<Convidado> convidadoSet;
	
	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvidado) {
		convidadoSet.add(new Convidado(nome, codigoConvidado));
	}
	
	public void removerConvidado(int codigoConvite) {
		Convidado convidadoParaRemover = null;
		for (Convidado c : convidadoSet) {
			if (c.getCodigoConvite() == codigoConvite) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
		
		conjuntoConvidados.adicionarConvidado("Argeu", 1234);
		conjuntoConvidados.adicionarConvidado("Ana", 1235);
		conjuntoConvidados.adicionarConvidado("Letícia", 1234);

		System.out.println("[Convites Lidos] Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
		
		conjuntoConvidados.exibirConvidados();
	}

}
