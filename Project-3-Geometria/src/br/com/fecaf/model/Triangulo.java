package br.com.fecaf.model;

import java.util.Scanner;

public class Triangulo {

    public double base, lado2, lado3, area, perimetro, altura, cateto1, cateto2, Hipotenua;

    Scanner scanner = new Scanner(System.in);

    public boolean cadastrarTriangulo() {
        System.out.println("/************************/");
        System.out.println("/*   Cadastro Triângulo */");
        System.out.println("/************************/");
        System.out.print("/* Informe o Base:     */");
        base = scanner.nextDouble();
        System.out.print("/* Informe o lado 2:     */");
        lado2 = scanner.nextDouble();
        System.out.print("/* Informe o lado 3:   */");
        lado3 = scanner.nextDouble();
        System.out.print("Informe a Altura: ");
        altura = scanner.nextDouble();
        System.out.println("/* Triângulo Cadastrado com Sucesso !");
        System.out.println("/***********************************/");

        // atribui o valor correto da Hipotenua caso usuário coloque errado
        if (base >= lado2 && base >= lado3) {
            Hipotenua = base;
        } else if (lado2 >= base && lado2 >= lado3) {
            Hipotenua =lado2;
        } else {
            Hipotenua = lado3;
        }

        if (Hipotenua == base){
            if (lado2 > lado3){
                cateto1 = lado2;
                cateto2 = lado3;
            }else {
                cateto1 = lado3;
                cateto2 = lado2;
            }


        }else if (Hipotenua == lado3) {
            if (lado2 > base) {
                cateto1 = lado2;
                cateto2 = base;
            } else {
                cateto1 = base;
                cateto2 = lado2;
            }
        }
        else {
            if (lado3 > base) {
                cateto1 = lado3;
                cateto2 = base;
            } else {
                cateto1 = base;
                cateto2 = lado3;
            }
        }

        return true;
    }

    public void calcularArea () {
        System.out.println("/*********************************/");
        System.out.println("/*        Calculando Area        */");
        System.out.println("/*********************************/");

        area = (base * altura) / 2 ;
        System.out.println("A área é: " + area);
        System.out.println("/*********************************/");
    }

    public void calcularPerimetro () {
        System.out.println("/*********************************/");
        System.out.println("/*      Calculando Perimetro     */");
        System.out.println("/*********************************/");

        perimetro = base + lado2 + lado3;
        System.out.println("O perimetro é: " + perimetro);
        System.out.println("/*********************************/");
    }

    // Isosceles / Escaleno / Equilatero
    public void definirTipo () {
        System.out.println("/*********************************/");
        System.out.println("/*        Definindo Tipo         */");
        System.out.println("/*********************************/");

        if (base == lado2 && base == lado3) {

            System.out.println("Este Triângulo é Equilátero ...");

        } else if (base != lado2 && base != lado3 && lado2 != lado3) {

            System.out.println("Este Triângulo é Escaleno ...");

        } else {
            System.out.println("Este Triângulo é Isosceles ...");
        }

        System.out.println("/***************************************/");


    }
    // Triângulo Retangulo
    public  void verificarseTrianguloRetangulo() {


        if (Hipotenua * Hipotenua == cateto1 * cateto1 + cateto2 * cateto2) {
            System.out.println(" Este Triângulo é Retângulo :).");
        } else {
            System.out.println("Não é um triângulo retângulo :(");
        }
    }
    // O Metodo abaixo verifica se o triagulo se encaixa nas condiçôes de pitagoras
    // 3,4,5
    public  void eumtriangulo345() {
        boolean tpitagoras = Hipotenua * Hipotenua == cateto1 * cateto1 + cateto2 * cateto2;
        System.out.println("cateto 1 = "+ cateto1 * cateto1 + " cateto 2 = "+ cateto2 * cateto2 + " Hipotenuia = "+ Hipotenua * Hipotenua);
        if (cateto1 %4 == 0 && cateto2 %3 == 0 && tpitagoras){
            System.out.println("É um triâgulo 3, 4, 5 :)");
        }else{
            System.out.println("Não é um triângulo 3, 4, 5 :(");
        }
    }





}
