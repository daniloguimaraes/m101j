package br.com.daniloguimaraes.main;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.daniloguimaraes.routes.ISparkRoute;

import com.eztech.util.JavaClassFinder;

public class SparkRoutesInitializer {
	
	private static final Logger LOG = Logger.getLogger(SparkRoutesInitializer.class.getCanonicalName());

	public static void main(String[] args) {
		LOG.info("Iniciando configuracao de rotas...");
		
		List<Class<? extends ISparkRoute>> classes = new JavaClassFinder().findAllMatchingTypes(ISparkRoute.class, true);
		
		for (Class<?> clazz : classes) {
			System.out.println("Classe carregada: " + clazz.getCanonicalName());
			
			iniciarRota(clazz);
		}

	}

	private static void iniciarRota(Class<?> clazz) {
		ISparkRoute rota;
		try {
			rota = (ISparkRoute) clazz.newInstance();
			rota.initRoute();
		} catch (InstantiationException | IllegalAccessException e) {
			LOG.log(Level.SEVERE, "Falha ao configurar a rota " + clazz.getCanonicalName());
		}
	}

}
