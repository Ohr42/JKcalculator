import java.io.IOException;
import java.util.HashMap;

public class CheckInput {
    private String a;
    private String b;
    private String z;
    private String whatAreNum = "Arabian";
    private int rA;
    private int rB;

    public void check(){

        try {
            if (a.matches("\\d+") && b.matches("\\d+")) {
                int cA = Integer.parseInt(a);
                int cB = Integer.parseInt(b);
                if(cA > 10 || cB >10){
                    throw new Exception("Число должно быть не больше 10");
                }else{
                    new Calculation(cA, cB, z, whatAreNum).calculation();
                }
            }else if (a.matches("\\D+") && b.matches("\\D+")) {
                whatAreNum = "Rom";
                new Convert().convertInput(a,b,z,whatAreNum);

            }else {
                throw new Exception("Числа должны быть либо Арабскими, либо Римскими!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public CheckInput(String a, String b, String z){
        this.a = a;
        this.b = b;
        this.z = z;
    }

    public CheckInput(int rA, int rB){
        this.rA = rA;
        this.rB = rB;
    }
    public CheckInput(){
    }
}
