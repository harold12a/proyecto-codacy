package com.jaax.jpaprojections;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaprojectionsApplicationTests {

	@Test
   void contextLoads() {
        assertThat(myService).isNotNull(); // Verifica que el bean MyService no sea nulo
    }
}
