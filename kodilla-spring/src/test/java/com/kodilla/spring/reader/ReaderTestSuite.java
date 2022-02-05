package com.kodilla.spring.reader;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = {ReaderTestSuite.class})
@ExtendWith(SpringExtension.class)
public class ReaderTestSuite {

    @Test
    void testRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        Reader reader = context.getBean(Reader.class);

        //When & Then
        reader.read();
    }
}
