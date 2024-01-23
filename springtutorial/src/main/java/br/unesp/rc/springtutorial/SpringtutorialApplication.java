package br.unesp.rc.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringtutorialApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringtutorialApplication.class, args);

	}

	// @Override
    // public void run(String... args) throws Exception {
    //     entity = InstanceGenerator.getPessoaFisica("111.222.353-44", "user5");
    //     Fisica f = fs.save(entity);
    //     System.out.println("\n" + f + "\n");

    //     // entity = InstanceGenerator.getPessoaFisica( "222.333.444-55" , "user1" );
    //     // fs.save(entity);
    //     // System.out.println("\n" + entity + "\n");

    //     // entity = InstanceGenerator.getPessoaFisica( "222.333.444-56" , "user2" );
    //     // fs.save(entity);

    //     // System.out.println("\n" + entity + "\n");
    // }

}
