package storeapp.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import storeapp.FactoryApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { FactoryApplication.class })
public class CucumberSpingConfiguration {}
