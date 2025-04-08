package map.Ordenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {
	
	private Map<LocalDate, Evento> eventosMap;
	
	public AgendaEventos() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, evento);
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
	}
	
	public void obterProximoEvento() {
		Set<LocalDate> dateSet = eventosMap.keySet();
		Collection<Evento> values = eventosMap.values();
	}
	
	public static void main(String[] args) {
		AgendaEventos agendaEventos = new AgendaEventos();
	}

}
