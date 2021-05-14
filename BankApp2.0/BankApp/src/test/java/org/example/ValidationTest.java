package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ValidationTest {

    private static Validation validation;

    @BeforeAll public static void setupValidation(){
        validation = new Validation();

    }

    @Test public void randomNumberCheck(){
        int x;
        Assertions.assertEquals(true,validation.randomNumberCheck());
    }

}
