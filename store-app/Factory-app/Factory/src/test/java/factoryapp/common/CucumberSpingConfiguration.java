package factoryapp.common;

import factoryapp.FactoryApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { FactoryApplication.class })
public class CucumberSpingConfiguration {}
