package edu.hm.cs.cnj.cnjbackend.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {

	@Autowired
	private VeranstaltungService veranstaltungen;

	@PostConstruct
	public void erstelleDaten() {
		VeranstaltungDto v1 = new VeranstaltungDto();
		v1.setTitel("100 Jahre Java");
		v1.setBeschreibung("Festmahl zu Ehren aller Java-Entwickler");
		v1.setBeginn(new GregorianCalendar(2017, Calendar.JULY, 12, 20, 00, 00).getTime());
		veranstaltungen.erzeugeVeranstaltung(v1);
		//veranstaltungen.fuegeTeilnahmeHinzu(v1, "Bernd das Brot", 3);
		//veranstaltungen.fuegeTeilnahmeHinzu(v1, "Spongebob", 0);
		VeranstaltungDto v2 = new VeranstaltungDto();
		v2.setTitel("Workshop aufrechtes Sitzen");
		v2.setBeschreibung("Zertifizierungsworkshop für das Sitzen auf St\u00FChlen mit mindestens drei Beinen.");
		v2.setBeginn(new GregorianCalendar(2018, Calendar.AUGUST, 2, 9, 30, 00).getTime());
		veranstaltungen.erzeugeVeranstaltung(v2);
		//veranstaltungen.fuegeTeilnahmeHinzu(v2, "Thor", 0);
		//veranstaltungen.fuegeTeilnahmeHinzu(v2, "Superman", 0);
		
		//veranstaltungen.sageOffeneTeilnahmenAbBis(
		//		new GregorianCalendar(2017, Calendar.DECEMBER, 31, 23, 59, 59).getTime());
	}
}
