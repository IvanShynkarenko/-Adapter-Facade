//task3
package com.example.lab13.task3;

public class Main
{
    public static void main(String[] args)
    {
        String url1 = "https://github.com/";
        Company company1 = PDLReader.getCompanyInfo(url1);
        System.out.println(company1);

        String url2 = "https://learn.ucu.edu.ua/";
        Company company2 = PDLReader.getCompanyInfo(url2);
        System.out.println(company2);

        String url3 = "https://www.youtube.com/";
        Company company3 = PDLReader.getCompanyInfo(url3);
        System.out.println(company3);

        String url4 = "https://www.spotify.com/";
        Company company4 = PDLReader.getCompanyInfo(url4);
        System.out.println(company4);
    }
}
