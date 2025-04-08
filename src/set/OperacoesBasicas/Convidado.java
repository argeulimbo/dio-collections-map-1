package set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
	
	private String nome;
	private Integer codigoConvite;
	
	public Convidado() {
		
	}
	
	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}
	
	public int getCodigoConvite() {
		return codigoConvite;
	}

	@Override
	public String toString() {
		return "[ Convidado - Nome: " + nome + ", codigoConvite: " + codigoConvite + " ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return Objects.equals(codigoConvite, other.codigoConvite);
	}	

}
