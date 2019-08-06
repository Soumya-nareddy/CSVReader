package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@Test
	public void contextLoads() {
		String csvFile = "C:\\Users\\laxmi\\Desktop\\App_Docs\\test.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(cvsSplitBy);
                System.out.println("Values code= [" + values[0] + " , " + values[1] + ", " + values[2] +" , " + values[2] + "]");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

		
	}
	

}
