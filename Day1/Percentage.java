class StudentPercentage{
    double markobtained;
    double totalmark;

    double CalculatePercentage(){
        return (markobtained/totalmark)*100;
    }
}
public class Percentage {
   public static void main(String[] args) {
    StudentPercentage find = new StudentPercentage();

    find.markobtained = 80;
    find.totalmark = 100;
    System.out.println("Total Percentage of a Student is " + find.CalculatePercentage());
   } 
}
