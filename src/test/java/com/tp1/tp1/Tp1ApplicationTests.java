package com.tp1.tp1;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tp1.tp1.models.AnimalDansMauvaisSecteurException;
import com.tp1.tp1.models.Chien;
import com.tp1.tp1.models.LimiteVisiteurException;
import com.tp1.tp1.models.Secteur;
import com.tp1.tp1.models.TypeAnimal;
import com.tp1.tp1.models.Zoo;

@SpringBootTest
class Tp1ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void maxVisiteurstest() {
		assertThrows(LimiteVisiteurException.class, () -> {
			Zoo zoo = new Zoo(15, new ArrayList<>());
			zoo.ajouterSecteur(TypeAnimal.TIGRE);
			zoo.nouveauVisiteur();
		});
	}

	@Test
	void ajoutChientest() {
		Chien chien = new Chien("Medor");
		Zoo zoo = new Zoo(10, new ArrayList<>());
		zoo.ajouterSecteur(TypeAnimal.CHAT);
		zoo.ajouterSecteur(TypeAnimal.CHIEN);
		try {
			zoo.nouvelAnimal(chien);
		} catch (AnimalDansMauvaisSecteurException e) {
			e.printStackTrace();
		}
		assertEquals(1, zoo.getSecteursAnimaux().get(1).getNombreAnimaux());
	}

}
