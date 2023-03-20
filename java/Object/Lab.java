package Object;

public class Lab {
    double scanner = 3.4;
    String computer = "Microsoft";
    int tables = 5;
    char medicine = 'T';
    double result = 63.825;

    public static void main(String[] args) {
        Lab obj = new Lab();
        System.out.println("The current version of the scanner is "+obj.scanner);
        System.out.println("A new software is installed called "+obj.computer);
        System.out.println("There are "+obj.tables+ "in the lab");
        System.out.println("We are using the medicine :"+obj.medicine);
        System.out.println("The result of the test is "+obj.result);

    }
}
/* scanner = v3.4 double variable
computer = software is Microsoft
tables = number of tables
medicine = char value A
result = use decimal value
 */