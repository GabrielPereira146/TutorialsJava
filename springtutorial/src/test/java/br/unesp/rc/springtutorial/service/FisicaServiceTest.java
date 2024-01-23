package br.unesp.rc.springtutorial.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.unesp.rc.springtutorial.entity.Fisica;
import br.unesp.rc.springtutorial.utils.InstanceGenerator;

@SpringBootTest
public class FisicaServiceTest {
    private Fisica entity;

    @Autowired
    private FisicaService fs = new FisicaService();
    
    //@Disabled
    @Test
    @DisplayName("FisicaService.save(Fisica)")
    void testSave() {
        String cpf = "222.333.444-55";

        entity = fs.findByCpf(cpf);
        if (entity != null){
            fs.delete(entity); 
        }      
        entity = InstanceGenerator.getPessoaFisica(cpf, "user1");
        System.out.println(entity);

        Fisica f = fs.save(entity);
        System.out.println("----------------------------------------");
        System.out.println(f);
        System.out.println("----------------------------------------");

        assertEquals(entity, f);
    }

    @Test
    void testCreateInstance(){

        String cpf = "111.222.353-44";

        entity = fs.findByCpf(cpf);
        if (entity != null){
            fs.delete(entity); 
        }
         
        entity = InstanceGenerator.getPessoaFisica(cpf, "user5");
        //  System.out.println(entity);

        Fisica f = fs.save(entity);
        System.out.println("----------------------------------------");
        System.out.println(f);
        System.out.println("----------------------------------------");

    }

    @Disabled
    @Test
    @DisplayName("FisicaService.findByCpf(cpf)")
    void testFindByCpf() {
        entity = InstanceGenerator.getPessoaFisica("222.333.444-55", "user1");

        String cpf = "222.333.444-55";
        Fisica f = fs.findByCpf(cpf);
        System.out.println("----------------------------------------");
        System.out.println(f);
        System.out.println("----------------------------------------");

        assertEquals(entity, f);
    }

    @Disabled
    @Test
    public void testDelete() {
        //...
    }

    @Disabled
    @Test
    public void testUpdate() {
        //...
    }

    @Disabled
    @Test
    @DisplayName("FisicaService.findAll()")
    public void testFindAll() {
        System.out.println("findAll");

        Fisica expResult = null;
        List<Fisica> result = fs.findAll();
        for (Fisica f : result){
            System.out.println("FISICA: " + f);
        }
        assertNotEquals(expResult, result);
    }
}
