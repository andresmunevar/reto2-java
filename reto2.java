import java.util.Scanner;

public class reto2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int number = Integer.parseInt(input.nextLine());
    CuerpoDeAgua[] bodiesOfWater = new CuerpoDeAgua[number];
    float amountHighAndLow = 0;
    int amountMed = 0;
    double sum = 0;
    for (int i = 0; i < number; i++) {
      bodiesOfWater[i] = new CuerpoDeAgua();
      String[] temp = input.nextLine().split(" ");
      bodiesOfWater[i].setName(temp[0]);
      bodiesOfWater[i].setId(Integer.parseInt(temp[1]));
      bodiesOfWater[i].setTown(temp[2]);
      bodiesOfWater[i].setIrca(Double.parseDouble(temp[3]));
      String catTemp = bodiesOfWater[i].category(bodiesOfWater[i].getIrca());
      if(catTemp == "ALTO" || catTemp == "MEDIO")
        amountHighAndLow++;
      sum += bodiesOfWater[i].getIrca();
    }

    for (int i = 0; i < number; i++)
      System.out.println(bodiesOfWater[i].getId());

    System.out.printf("%.2f%n",amountHighAndLow);

    for (int i = 0; i < number; i++){
      String catTemp = bodiesOfWater[i].category(bodiesOfWater[i].getIrca());
      if(catTemp == "MEDIO"){
        System.out.println(bodiesOfWater[i].getTown());
        amountMed++;
      }
    }
    
    if (amountMed == 0)
      System.out.println("NA");
    System.out.printf("%.2f%n",sum / number);

    input.close();
  }
}
