package robert;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int size, iterations, bc, method;
        Scanner sc = new Scanner(System.in);

        System.out.println("podaj dlugosc tablicy");
        size = sc.nextInt();
        size = size + 2;

        System.out.println("podaj ilosc iteracji");
        iterations = sc.nextInt();

        System.out.println("podaj warunek brzegowy");
        bc = sc.nextInt();

        System.out.println("podaj metode");
        method = sc.nextInt();

        int a[] = new int[size];
        int temp[] = new int[size];


        for (int i = 0; i < size; i++) {
            a[i] = 0;
            temp[i] = 0;
        }

        if (bc == 1) {
            a[0] = 1;
            a[size - 1] = 1;
            temp[0] = 1;
            temp[size - 1] = 1;
        }

        a[(int) size / 2] = 1;


        if (method == 30) {
            for (int j = 0; j < iterations; j++) {
                for (int k = 0; k < size - 2; k++) {
                    if (a[k] == 1 && a[k + 1] == 1 && a[k + 2] == 1) {
                        temp[k + 1] = 0;
                    } else if (a[k] == 1 && a[k + 1] == 1 && a[k + 2] == 0) {
                        temp[k + 1] = 0;
                    } else if (a[k] == 1 && a[k + 1] == 0 && a[k + 2] == 1) {
                        temp[k + 1] = 0;
                    } else if (a[k] == 1 && a[k + 1] == 0 && a[k + 2] == 0) {
                        temp[k + 1] = 1;
                    } else if (a[k] == 0 && a[k + 1] == 1 && a[k + 2] == 1) {
                        temp[k + 1] = 1;
                    } else if (a[k] == 0 && a[k + 1] == 1 && a[k + 2] == 0) {
                        temp[k + 1] = 1;
                    } else if (a[k] == 0 && a[k + 1] == 0 && a[k + 2] == 1) {
                        temp[k + 1] = 1;
                    } else if (a[k] == 0 && a[k + 1] == 0 && a[k + 2] == 0) {
                        temp[k + 1] = 0;
                    }
                }

                for (int i = 1; i < size - 1; i++) {
                    if (a[i] == 0) {
                        System.out.print(" ");
                    } else
                        System.out.print("o");
                }
                System.out.println();

                for (int l = 0; l < size; l++) {
                    a[l] = temp[l];
                }


            }
        } else if (method == 90) {
            for (int j = 0; j < iterations; j++) {
                for (int k = 0; k < size - 2; k++) {
                    if (a[k] == 1 && a[k + 1] == 1 && a[k + 2] == 1) {
                        temp[k + 1] = 0;
                    } else if (a[k] == 1 && a[k + 1] == 1 && a[k + 2] == 0) {
                        temp[k + 1] = 1;
                    } else if (a[k] == 1 && a[k + 1] == 0 && a[k + 2] == 1) {
                        temp[k + 1] = 0;
                    } else if (a[k] == 1 && a[k + 1] == 0 && a[k + 2] == 0) {
                        temp[k + 1] = 1;
                    } else if (a[k] == 0 && a[k + 1] == 1 && a[k + 2] == 1) {
                        temp[k + 1] = 1;
                    } else if (a[k] == 0 && a[k + 1] == 1 && a[k + 2] == 0) {
                        temp[k + 1] = 0;
                    } else if (a[k] == 0 && a[k + 1] == 0 && a[k + 2] == 1) {
                        temp[k + 1] = 1;
                    } else if (a[k] == 0 && a[k + 1] == 0 && a[k + 2] == 0) {
                        temp[k + 1] = 0;
                    }
                }

                for (int i = 1; i < size - 1; i++) {
                    if (a[i] == 0) {
                        System.out.print(" ");
                    } else
                        System.out.print("o");
                }
                System.out.println();

                for (int l = 0; l < size; l++) {
                    a[l] = temp[l];
                }


            }
        } else if (method == 60) {
            for (int j = 0; j < iterations; j++) {
                for (int k = 0; k < size - 2; k++) {
                    if (a[k] == 1 && a[k + 1] == 1 && a[k + 2] == 1) {
                        temp[k + 1] = 0;
                    } else if (a[k] == 1 && a[k + 1] == 1 && a[k + 2] == 0) {
                        temp[k + 1] = 0;
                    } else if (a[k] == 1 && a[k + 1] == 0 && a[k + 2] == 1) {
                        temp[k + 1] = 1;
                    } else if (a[k] == 1 && a[k + 1] == 0 && a[k + 2] == 0) {
                        temp[k + 1] = 1;
                    } else if (a[k] == 0 && a[k + 1] == 1 && a[k + 2] == 1) {
                        temp[k + 1] = 1;
                    } else if (a[k] == 0 && a[k + 1] == 1 && a[k + 2] == 0) {
                        temp[k + 1] = 1;
                    } else if (a[k] == 0 && a[k + 1] == 0 && a[k + 2] == 1) {
                        temp[k + 1] = 0;
                    } else if (a[k] == 0 && a[k + 1] == 0 && a[k + 2] == 0) {
                        temp[k + 1] = 0;
                    }
                }

                for (int i = 1; i < size - 1; i++) {
                    if (a[i] == 0) {
                        System.out.print(" ");
                    } else
                        System.out.print("o");
                }
                System.out.println();

                for (int l = 0; l < size; l++) {
                    a[l] = temp[l];
                }


            }
        } else {
            System.err.println("zla metoda");
        }

        System.out.println("\n\tKONIEC");
    }
}
