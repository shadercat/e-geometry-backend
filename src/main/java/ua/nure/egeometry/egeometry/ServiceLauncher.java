package ua.nure.egeometry.egeometry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ua.nure.egeometry.egeometry.repository.UserRepository;
import ua.nure.egeometry.egeometry.entity.UserEntity;

@SpringBootApplication
public class ServiceLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLauncher.class, args);
    }
}
