package Gün16;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        //aşağıdaki görüntüyü veren programı yazınız(yaznızca 1 * ile)
        //*
        //**
        //***
        //****
        //*****
        //*****
        //****
        //***
        //**
        //*

        for (int j = 1; j <= 5; j++) {

            for (int a = 1; a <= j; a++)
                System.out.print("*");
            System.out.println();
        }

        for (int j = 5; j > 0; j--) {

            for (int a = 1; a <= j; a++)
                System.out.print("*");
            System.out.println();
        }


    }
}
