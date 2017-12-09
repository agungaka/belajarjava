/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agung
 */
public class OperatorLogika {
    int Umur = 24;
    int Berat = 69;
    
    //Kondisional operator AND &&
    public boolean testKondisionalOperatorAND1(){
        return ((Umur > 32) && (Berat < 70));
    }
    public boolean testKondisionalOperatorAND2(){
        return ((Umur > 32) && (Berat >= 70));
    }
    public boolean testKondisionalOperatorAND3(){
        return ((Umur >= 25) && (Berat < 70));
    }
    public boolean testKondisionalOperatorAND4(){
        return ((Umur >= 25) && (Berat >= 70));
    }
    
    //Kondisional operator OR ||
    public boolean testKondisionalOperatorOR1(){
        return ((Umur > 32) || (Berat < 70));
    }
    public boolean testKondisionalOperatorOR2(){
        return ((Umur > 32) || (Berat >= 70));
    }
    public boolean testKondisionalOperatorOR3(){
        return ((Umur >= 25) || (Berat < 70));
    }
    public boolean testKondisionalOperatorOR4(){
        return ((Umur >= 25) || (Berat >= 70));
    }
    
    //Logika boolean AND &
    public boolean testLogikaAND1(){
        return ((Umur > 32) & (Berat < 70));
    }
    public boolean testLogikaAND2(){
        return ((Umur > 32) & (Berat >= 70));
    }
    public boolean testLogikaAND3(){
        return ((Umur >= 25) & (Berat < 70));
    }
    public boolean testLogikaAND4(){
        return ((Umur >= 25) & (Berat >= 70));
    }
    
    //Logika boolean inclusive OR |
    public boolean testLogikaInclusiveOR1(){
        return ((Umur > 32) | (Berat < 70));
    }
    public boolean testLogikaInclusiveOR2(){
        return ((Umur > 32) | (Berat >= 70));
    }
    public boolean testLogikaInclusiveOR3(){
        return ((Umur >= 25) | (Berat < 70));
    }
    public boolean testLogikaInclusiveOR4(){
        return ((Umur >= 25) | (Berat >= 70));
    }
    
    //Logika boolean exclusive OR ^
    public boolean testLogikaExclusiveOR1(){
        return ((Umur > 32) ^ (Berat < 70));
    }
    public boolean testLogikaExclusiveOR2(){
        return ((Umur > 32) ^ (Berat >= 70));
    }
    public boolean testLogikaExclusiveOR3(){
        return ((Umur >= 25) ^ (Berat < 70));
    }
    public boolean testLogikaExclusiveOR4(){
        return ((Umur >= 25) ^ (Berat >= 70));
    }
    
    //Logika NOT !
    public boolean testLogikaNOT1(){
        return (!(Umur >= 25));
    }
    public boolean testLogikaNOT2(){
        return (!(Umur < 70));
    }
    public boolean testLogikaNOT3(){
        return (!(Umur == 70));
    }
    public boolean testLogikaNOT4(){
        return (!(Umur == 30));
    }
}


