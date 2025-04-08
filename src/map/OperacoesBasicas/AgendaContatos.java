package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	private Map<String, Integer> agendaContatoMap;
	
	public AgendaContatos() {
		this.agendaContatoMap = new HashMap<>();
	}

	public Map<String, Integer> getAgendaContatoMap() {
		return agendaContatoMap;
	}

	public void setAgendaContatoMap(Map<String, Integer> agendaContatoMap) {
		this.agendaContatoMap = agendaContatoMap;
	}

	@Override
	public String toString() {
		return "AgendaContatos [agendaContatoMap=" + agendaContatoMap + "]";
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendaContatoMap);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroPorNome = null;
		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}
		return numeroPorNome;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.adicionarContato("Camila", 123456);
		agendaContatos.adicionarContato("Camila", 5663);
		agendaContatos.adicionarContato("Camila Cavalcante", 111111);
		agendaContatos.adicionarContato("Camila DIO", 654987);
		agendaContatos.adicionarContato("Maria Silva", 1111111);
		agendaContatos.adicionarContato("Camila", 44444);
		
		
		agendaContatos.exibirContatos();
	}
	
	
	
	

}
