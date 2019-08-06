package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		String csvFile = "C:\\Users\\laxmi\\Desktop\\App_Docs\\test.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(cvsSplitBy);
                System.out.println("Country [code= " + values[3] + " , name=" + values[4] + "]");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
