public class CuerpoDeAgua {
  // Attributes
  private String name;
  private int id;
  private String town;
  private double irca;

  // Methods
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public int getId(){
    return id;
  }
  public void setId(int id){
    this.id = id;
  }
  public String getTown(){
    return town;
  }
  public void setTown(String town){
    this.town = town;
  }
  public double getIrca(){
    return irca;
  }
  public void setIrca(double irca){
    this.irca = irca;
  }
  public String category(double irca){
    if (irca >= 80.1 && irca <= 100){
      return "INVIABLE SANITARIAMENTE";
    } else if (irca >= 35.1 && irca <= 80){
      return "ALTO";
    } else if (irca >= 14.1 && irca <= 35){
      return "MEDIO";
    } else if (irca >= 5.1 && irca <= 14){
      return "BAJO";
    } else if (irca >= 0 && irca <= 5){
      return "SIN RIESGO";
    }
    return "0";
  }
}
