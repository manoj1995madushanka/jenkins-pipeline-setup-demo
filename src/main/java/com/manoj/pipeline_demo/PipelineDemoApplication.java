package com.manoj.pipeline_demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class PipelineDemoApplication {

    private static Logger logger = LoggerFactory.getLogger(PipelineDemoApplication.class);

    public static void main(String[] args) {
        logger.info("app started");
        // test build pipeline
        //test
        SpringApplication.run(PipelineDemoApplication.class, args);
    }

}
