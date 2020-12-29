import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputString {
    private String a = "";
    private String b = "";
    private String z = "";
    public void readConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите два числа через пробел, \nне более 10 каждое, либо римскими, \nлибо арабскими цифрами :");
        String[] inp = reader.readLine().split(" ");
        this.a = inp[0];
        this.b = inp[2];
        this.z = inp[1];

        new CheckInput(a,b,z).check();

    }
}
