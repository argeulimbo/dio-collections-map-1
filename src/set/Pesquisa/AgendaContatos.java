package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	private Set<Contato> contatoSet;
	
	public AgendaContatos() {
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisaPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		for (Contato c : contatoSet) {
			if (c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContatos(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for (Contato c : contatoSet) {
			if (c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		
		AgendaContatos agendaContatos = new AgendaContatos();
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Argeu", 123456);
		agendaContatos.adicionarContato("Argeu", 0);
		agendaContatos.adicionarContato("Argeu Souza", 111111);
		agendaContatos.adicionarContato("Argeu DIO", 40028922);
		agendaContatos.adicionarContato("Ailton Santos", 111111);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisaPorNome("Argeu"));
		System.out.println();
		
		System.out.println(agendaContatos.atualizarNumeroContatos("Argeu", 2929292));
	}

}
