package TwoSum;

public class Main {
    public static void main(String [] args) {

        SomaDupla s = new SomaDupla();

        int [] nums = {2,7,11,15};
        int alvo = 26;

        int [] resultado = s.twoSum(nums, alvo);

        if(resultado.length == 2) {
            System.out.println(resultado[0] + "," + resultado[1]);
        } else {
            System.out.println("Indices não encotrado!");
        }
    }
}
