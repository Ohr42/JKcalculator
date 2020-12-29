import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Convert {
    private String[] romNumUnit  = {"X","I","II","III","IV","V","VI","VII","VIII","IX"};
    private String[] romNumDoz  = {"C","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    String z;
    String  whatAreNum;

    public void convertResult(String whatAreNum, int calc){
        if(whatAreNum.equals("Arabian")){
            System.out.println(calc);
        }else if(whatAreNum.equals("Rom")){
            int dozens = 0;
            int units = 0 ;
            String romDozens = "";
            String romUnits = "";

            if (calc/10 > 0) {
                dozens = calc / 10;
                units = calc % 10;
                if (dozens == 10) {
                    romDozens = romNumDoz[0];
                } else {
                    romDozens = romNumDoz[dozens];
                }
                if (units != 0){
                    romUnits = romNumUnit[units];
                }
            }else {
                if (calc == 10){
                    romUnits = romNumUnit[0];
                }else {
                    romUnits = romNumUnit[calc];
                }

            }

            System.out.println(romDozens + romUnits);
            }

        }


    public void convertInput(String a, String b, String z, String  whatAreNum) throws Exception {
        int rA = 0;
        int rB = 0;
        this.z = z;
        this.whatAreNum = whatAreNum;

        for (int i = 0; i < romNumUnit.length; i++) {

            if (a.equals(romNumUnit[i]) && i == 0) {
                rA = 10;
            } else if (a.equals(romNumUnit[i])) {
                rA = i;
            }

            if (b.equals(romNumUnit[i]) && i == 0) {
                rB = 10;
            } else if (b.equals(romNumUnit[i])) {
                rB = i;
            }
        }
        if (rA == 0){
            throw new Exception("Символ "+ a +" не поддерживается");
        }
        if (rB == 0) {
            throw new Exception("Символ "+ b +" не поддерживается");
        }

        if(rA > 10 || rA >10 ){
            throw new Exception("Число должно быть не больше 10");
        }else{
            new Calculation(rA, rB, z, whatAreNum).calculation();
        }
//        new CheckInput(rA,rB);
    }

    public Convert() throws IOException{
    }
}
