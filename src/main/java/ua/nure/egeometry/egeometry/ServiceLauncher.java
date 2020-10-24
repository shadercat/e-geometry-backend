package ua.nure.egeometry.egeometry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.nure.egeometry.egeometry.repository.UserRepository;
import ua.nure.egeometry.egeometry.entity.UserEntity;

@SpringBootApplication
public class ServiceLauncher implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(ServiceLauncher.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        // save a couple of customers
        userRepository.save(new UserEntity("Alice", "Smith", "Gfg"));
        userRepository.save(new UserEntity("Alice2", "Smith2", "Gfg2"));

        // fetch all customers
        System.out.println("Users found with findAll():");
        System.out.println("-------------------------------");
        for (UserEntity customer : userRepository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();


    }

}
