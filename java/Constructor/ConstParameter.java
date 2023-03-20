package Constructor;

public class ConstParameter {
    int modelYear;
    String modelName;
    ConstParameter(int Year, String Name){
        modelName = Name;
        modelYear = Year;

    }

    public static void main(String[] args) {
        ConstParameter constParameter = new ConstParameter(2023, "BMW");
        System.out.println(constParameter.modelYear+ " " +constParameter.modelName);

    }
}
