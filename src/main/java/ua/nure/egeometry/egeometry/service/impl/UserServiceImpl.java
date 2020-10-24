package ua.nure.egeometry.egeometry.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.nure.egeometry.egeometry.entity.UserEntity;
import ua.nure.egeometry.egeometry.repository.UserRepository;
import ua.nure.egeometry.egeometry.service.UserService;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    private UserRepository personRepository;

    @Autowired
    public UserServiceImpl(UserRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public UserEntity getByEmail(String email) {
        return personRepository.findByEmail(email);
    }

    @Override
    public UserEntity create(UserEntity person) {
        personRepository.save(person);
        return person;
    }

    @Override
    public List<UserEntity> getAll() {
        return personRepository.findAll();
    }

}