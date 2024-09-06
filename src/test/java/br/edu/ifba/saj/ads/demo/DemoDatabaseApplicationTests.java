package br.edu.ifba.saj.ads.demo;

import br.edu.ifba.saj.ads.demo.model.polimorfismo.Banco;
import br.edu.ifba.saj.ads.demo.repository.BancoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = BibliotecaApplication.class)
class DemoDatabaseApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BancoRepository bancoRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testUserCreation() {
        User user = new User();
        user.setName("Test User");
        user.setEmail("testuser@example.com");
        userRepository.save(user);

        User foundUser = userRepository.findById(user.getId()).orElse(null);
        assertNotNull(foundUser);
        assertEquals("Test User", foundUser.getName());
        assertEquals("testuser@example.com", foundUser.getEmail());
    }

    @Test
    void testBancoOperations() {
        Banco banco = new Banco();
        banco.addCorrentista("Test User 1");
        banco.addCorrentista("Test User 2");

        banco.creditar("Test User 1", 1000);
        banco.creditar("Test User 2", 2000);

        bancoRepository.save(banco);

        Banco foundBanco = bancoRepository.findById(banco.getId()).orElse(null);
        assertNotNull(foundBanco);
        assertEquals(1000, foundBanco.getSaldo("Test User 1"));
        assertEquals(2000, foundBanco.getSaldo("Test User 2"));

        foundBanco.transferir("Test User 1", "Test User 2", 500);
        bancoRepository.save(foundBanco);

        Banco updatedBanco = bancoRepository.findById(banco.getId()).orElse(null);
        assertNotNull(updatedBanco);
        assertEquals(500, updatedBanco.getSaldo("Test User 1"));
        assertEquals(2500, updatedBanco.getSaldo("Test User 2"));
    }
}