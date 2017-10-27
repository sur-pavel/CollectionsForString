package ru.surpavel;
public class Main
{
    public static void main( String[] args )
    {
        CountStringChars countStringChars = new CountStringChars();
        countStringChars.count("hello world!");
        System.out.println(countStringChars.count("hello world!"));
    }
}
