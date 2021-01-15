package it.prova.manytomanycdmaven.test;

import java.text.SimpleDateFormat;

import it.prova.manytomanycdmaven.dao.EntityManagerUtil;
import it.prova.manytomanycdmaven.model.Cd;
import it.prova.manytomanycdmaven.model.Genere;
import it.prova.manytomanycdmaven.service.CdService;
import it.prova.manytomanycdmaven.service.GenereService;
import it.prova.manytomanycdmaven.service.MyServiceFactory;

public class MyTest {

	public static void main(String[] args) {
		CdService cdServiceInstance = MyServiceFactory.getCdServiceInstance();
		GenereService genereServiceInstance = MyServiceFactory.getGenereServiceInstance();
		
		try {
			//*********************************************************************************
			//TEST INSERIMENTO NUOVO CD  ******************************************************
			//*********************************************************************************
//			System.out.println("Inserimento nuovo cd...");
//			Cd cdInstance = new Cd("titolo1","autore1",new SimpleDateFormat("dd/MM/yyyy").parse("24/09/2019"));
//			cdServiceInstance.inserisciNuovo(cdInstance);
//			if(cdServiceInstance.caricaSingoloElemento(cdInstance.getId()) != null)
//				System.out.println("Inserimento nuovo cd...OK: "+cdInstance);
//			
//			//*********************************************************************************
//			//TEST CARICA CD  *****************************************************************
//			//*********************************************************************************
//			Long idCdDaCaricare = 1L;
//			System.out.println("Carica cd con id.."+idCdDaCaricare);
//			Cd cdDaCaricare = cdServiceInstance.caricaSingoloElemento(idCdDaCaricare);
//			if(cdDaCaricare != null)
//				System.out.println("Cd caricato con successo: "+cdDaCaricare);
//			else
//				System.out.println("Cd non trovato.");
//			
//			//*********************************************************************************
//			//TEST INSERIMENTO NUOVO GENERE****************************************************
//			//*********************************************************************************
//			String descrizioneGenere = "rock";
//			if(genereServiceInstance.cercaPerDescrizione(descrizioneGenere) == null) {
//				genereServiceInstance.inserisciNuovo(new Genere(descrizioneGenere));
//				System.out.println("Nuovo genere inserito.");
//			}
//			
//			//*********************************************************************************
//			//COLLEGHIAMO GENERE A CD ****************************************************
//			//*********************************************************************************
//			Long idCdDaCaricarePerCollegamentoGenere = 1L;
//			System.out.println("Carica cd con id.."+idCdDaCaricarePerCollegamentoGenere);
//			Cd cdDaCaricarePerCollegamentoGenere = cdServiceInstance.caricaSingoloElemento(idCdDaCaricarePerCollegamentoGenere);
//			Genere genereDaCaricarePerCollegamente = genereServiceInstance.cercaPerDescrizione(descrizioneGenere);
//			if(cdDaCaricarePerCollegamentoGenere != null) {
//				cdServiceInstance.aggiungiGenere(cdDaCaricarePerCollegamentoGenere, genereDaCaricarePerCollegamente);
//			}
//			
//			//*********************************************************************************
//			//CREAZIONE CD E CREAZIONE GENERE  IN UN SOLO COLPO  ******************************
//			//*********************************************************************************
//			Cd cdInstanceX = new Cd("titoloX","autoreX",new SimpleDateFormat("dd/MM/yyyy").parse("10/08/2020"));
//			Genere genereX = new Genere("X");
//			cdServiceInstance.creaECollegaCdEGenere(cdInstanceX, genereX);
			
			//*********************************************************************************
			//COLLEGHIAMO UN  CD A DUE GENERI ED UN GENERE A DUE CD ******************************
			//*********************************************************************************
//			System.out.println("COLLEGHIAMO UN  CD A DUE GENERI ED UN GENERE A DUE CD...");
//			Cd cdInstance3 = new Cd("titolo3","autore3",new SimpleDateFormat("dd/MM/yyyy").parse("07/04/2018"));
//			Cd cdInstance4 = new Cd("titolo4","autore4",new SimpleDateFormat("dd/MM/yyyy").parse("07/04/2018"));
//			Genere genereJ = new Genere("J");
//			Genere genereK = new Genere("K");
//			//cd3 con J e cd4 con J e K
//			cdServiceInstance.creaECollegaCdEGenere(cdInstance3, genereJ);
//			cdServiceInstance.creaECollegaCdEGenere(cdInstance4, genereK);
//			cdServiceInstance.aggiungiGenere(cdInstance4, genereJ);
//			System.out.println("...end...");
			
			//*********************************************************************************
			//RIMUOVIAMO UN CD E VEDIAMO COSA ACCADE AI GENERI ********************************
			//per eseguire questo test dobbiamo prendere un cd esistente collegato a due generi
			//il risultato atteso è la rimozione dalla tabella cd, la rimozione dalla tabella 
			//di legame lasciando inalterate le voci nella tabella genere. Tutto ciò
			//a prescindere della presenza dei Cascade. Se mettiamo CascadeType.ALL o REMOVE...
			//DISASTRO!!!
			//*********************************************************************************
//			System.out.println("RIMUOVIAMO UN CD E VEDIAMO COSA ACCADE AI GENERI...");
//			Long idCdDaCaricarePerRimozione = 34L;
//			Cd cdDaCaricarePerRimozione = cdServiceInstance.caricaSingoloElemento(idCdDaCaricarePerRimozione);
//			if(cdDaCaricarePerRimozione != null) {
//				System.out.println("Cd caricato con successo: "+cdDaCaricarePerRimozione);
//				//rimuovo
//				cdServiceInstance.rimuovi(cdDaCaricarePerRimozione);
//			}else
//				System.out.println("Cd non trovato.");
//			System.out.println("...end...");
			
//			//TODO: TESTARE TUTTO IL CRUD
//			System.out.println("\n TEST CRUD \n");
			
//			System.out.println("\n LISTA GENERI \n");
//			for (Genere genereItem : genereServiceInstance.listAll()) {
//				System.out.println(genereItem);
//			}
			
//			System.out.println("\n LISTA CD \n");
//			for (Cd cdItem : cdServiceInstance.listAll()) {
//				System.out.println(cdItem);
//			}
			
//			System.out.println("\n SINGOLO GENERE \n");
//			Long IdGenereSingolo = 1L;
//			System.out.println("Carica genere con id.."+IdGenereSingolo);
//			Genere genereDaCaricare = genereServiceInstance.caricaSingoloElemento(IdGenereSingolo);
//			if(genereDaCaricare != null)
//				System.out.println("Genere caricato con successo: "+genereDaCaricare);
//			else
//				System.out.println("Genere non trovato.");
			
//			System.out.println("\n SINGOLO CD \n");
//			Long idCdSingolo = 1L;
//			System.out.println("Carica cd con id.."+idCdSingolo);
//			Cd cdDaCaricare = cdServiceInstance.caricaSingoloElemento(idCdSingolo);
//			if(cdDaCaricare != null)
//				System.out.println("Cd caricato con successo: "+cdDaCaricare);
//			else
//				System.out.println("Cd non trovato.");
			
//			System.out.println("\n UPDATE GENERE \n");
//			Genere generePresoDaDb = genereServiceInstance.listAll().stream().findFirst().orElse(null);
//			if (generePresoDaDb != null) {
//				System.out.println(
//						"descrizione attuale del genere: " + generePresoDaDb.getDescrizione());
//				String nuovaDescrizione = "Reggae";
//				generePresoDaDb.setDescrizione(nuovaDescrizione);
//				genereServiceInstance.aggiorna(generePresoDaDb);
//				System.out.println(
//						"descrizione aggiornata del genere: " + generePresoDaDb.getDescrizione());
//			}
			
//			System.out.println("\n UPDATE CD \n");
//			Cd cdPresoDaDb = cdServiceInstance.listAll().stream().findFirst().orElse(null);
//			if (cdPresoDaDb != null) {
//				System.out.println(
//						"titolo attuale del cd: " + cdPresoDaDb.getTitolo());
//				String nuovoTitolo = "Hits of 2021";
//				cdPresoDaDb.setTitolo(nuovoTitolo);
//				cdServiceInstance.aggiorna(cdPresoDaDb);
//				System.out.println(
//						"titolo aggiornato del cd: " + cdPresoDaDb.getTitolo());
//			}
			
//			System.out.println("\n NUOVO GENERE \n");
//			Genere nuovoGenere = new Genere("Hip-Hop");
//			genereServiceInstance.inserisciNuovo(nuovoGenere);
//			if(genereServiceInstance.caricaSingoloElemento(nuovoGenere.getId()) != null)
//				System.out.println("Nuovo Genere inserito: "+nuovoGenere);
			
//			System.out.println("\n NUOVO CD \n");
//			Cd cdNuovoDaInserire = new Cd("Nuovo CD","Autore Nuovo",new SimpleDateFormat("dd/MM/yyyy").parse("24/09/2019"));
//			cdServiceInstance.inserisciNuovo(cdNuovoDaInserire);
//			if(cdServiceInstance.caricaSingoloElemento(cdNuovoDaInserire.getId()) != null)
//				System.out.println("Nuovo CD inserito: "+cdNuovoDaInserire);

//			System.out.println("\n AGGIUNGI CD \n");
//			Cd cdDaDb = cdServiceInstance.caricaSingoloElemento(1L);
//			Genere genereDaDb = genereServiceInstance.listAll().stream().findFirst().orElse(null);
//			if (cdDaDb != null && genereDaDb != null) {
//				genereServiceInstance.aggiungiCd(genereDaDb, cdDaDb);
//			}
			
			System.out.println("\n DELETE GENERE \n");
			Long idGenereDaEliminare = 2L;
			Genere genereCaricato = genereServiceInstance.caricaSingoloElemento(idGenereDaEliminare);
			if(genereCaricato != null) {
				System.out.println("Genere caricato: "+genereCaricato);
				genereServiceInstance.rimuovi(genereCaricato);
				System.out.println("Rimozione Genere avvenuta con successo");
			} else {
				System.out.println("Nessun Genere trovato");
			}
			
//			System.out.println("\n DELETE CD \n");
//			Long idCdDaEliminare = 3L;
//			Cd cdCaricato = cdServiceInstance.caricaSingoloElemento(idCdDaEliminare);
//			if(cdCaricato != null) {
//				System.out.println("Cd caricato: "+cdCaricato);
//				cdServiceInstance.rimuovi(cdCaricato);
//				System.out.println("Rimozione CD avvenuta con successo");
//			} else {
//				System.out.println("Nessun CD trovato");
//			}
			
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// questa è necessaria per chiudere tutte le connessioni quindi rilasciare il
			// main
			EntityManagerUtil.shutdown();
		}

	}

}
