//package br.edu.ifba.saj.ads.demo;
//
//import br.edu.ifba.saj.ads.demo.model.polimorfismo.Banco;
//import br.edu.ifba.saj.ads.demo.repository.BancoRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class PolimorfismoApplication implements CommandLineRunner {
//
//    @Autowired
//    private BancoRepository bancoRepository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(PolimorfismoApplication.class, args);
//    }
//    @Override
//    public void run(String... args) throws Exception {
//        Banco banco = new Banco();
//        banco.addCorrentista("João");
//        banco.addCorrentista("Maria");
//        banco.addCorrentista("José");
//
//        banco.creditar("João", 1000);
//        banco.creditar("Maria", 2000);
//        banco.creditar("José", 3000);
//
//        bancoRepository.save(banco);
//
////         Exibindo todos os usuários
//        System.out.println("Lista de Correntista:");
//        bancoRepository.findAll().forEach(System.out::println);
//
////         Realizando Operação
//        bancoRepository.findById(1).ifPresent(banco1 -> {
//            banco1.transferir("João", "Maria", 500);
//            bancoRepository.save(banco);
//        });
//    }
//}