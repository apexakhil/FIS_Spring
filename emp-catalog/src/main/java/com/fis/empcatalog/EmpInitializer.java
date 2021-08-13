package com.fis.empcatalog;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class ItemInitializer implements CommandLineRunner {

    private final EmpRepository EmpRepository;

    ItemInitializer(EmpRepository EmpRepository) {
        this.EmpRepository = EmpRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
                .forEach(item -> EmpRepository.save(new Item(item)));

        EmpRepository.findAll().forEach(System.out::println);
    }
}