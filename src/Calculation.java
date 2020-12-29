import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculation {
    private int a;
    private int b;
    private String z;
    private String whatAreNum = "Arabian";

    public void calculation () throws IOException {
        switch (z){
            case "*": new Convert().convertResult(whatAreNum,a * b);
                break;
            case "/": new Convert().convertResult(whatAreNum,a / b);
                break;
            case "+":
                new Convert().convertResult(whatAreNum,a + b);
                break;
            case "-": new Convert().convertResult(whatAreNum,a - b);
                break;
            default:
                break;
        }
    }

    public Calculation(int a, int b,String z, String whatAreNum) throws IOException {
        this.a = a;
        this.b = b;
        this.z = z;
        this.whatAreNum = whatAreNum;
    }


}
