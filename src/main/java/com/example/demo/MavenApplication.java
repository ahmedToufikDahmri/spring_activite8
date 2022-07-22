package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;



@SpringBootApplication
public abstract class MavenApplication implements CommandLineRunner {
	
    @Autowired
    JdbcTemplate JdbcTemplate;
    
	public static void main(String[] args) {
		SpringApplication.run(MavenApplication.class, args);
	}
	
    
    @Override
	public void run (String... strings) throws Exception {
		JdbcTemplate.query ("select * FROM wilaya",  
		(rs, rowNum) -> new Wilaya(rs.getLong(1), rs.getBoolean(2), rs.getLong(3), rs.getLong(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9) )
		).forEach(wil -> System.out.println(wil));	
	
}
	
}



//id,actif,compte_creation;compte_maj,date_creation,date_maj,nom_arabe,nom_latin,nom_tamazight