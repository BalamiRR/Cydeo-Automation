package com.fuatkara.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test(){
        //Creating Faker object to reach methods
        Faker faker = new Faker();

        System.out.println("faker.name().firstname() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //numerify() method will generate random numbers in the format we want to get
        System.out.println("faker.numerify(\"###-###-###\" = " + faker.numerify("###-###-###"));
        System.out.println("faker.numerify(\"312-###-###\" = " + faker.numerify("312-###-###"));

        //letterify() means random letter
        System.out.println("faker.letterify(\"???x???x?\") = " + faker.letterify("???x???x?"));

        //bothify means random letter and number -- mixed
        System.out.println("faker.bothify(\"##?#-##?#-#?#?#-##??\") = " + faker.bothify("##?#-##?#-#?#?#-##??"));

        //finance random credit-card
        System.out.println("faker.finance().creditCard().replaceAll(\"-\", \"\") = " + faker.finance().creditCard().replaceAll("-", ""));

        System.out.println("faker.chuckNorris().fact().replaceAll(\"Chuck Norris\", \"Muhtar\") = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));
    }
}



