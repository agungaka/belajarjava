/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agung
 */
public class DemoOperatorLogika {
    public static void main(String args [])
    {
  
  OperatorLogika test = new OperatorLogika();
  
  System.out.println("Nilai kondisi (Umur > 32) && (Berat < 70) adalah " + 
  test.testKondisionalOperatorAND1());
  
  System.out.println("Nilai kondisi (Umur > 32) && (Berat >= 70) adalah " + 
    test.testKondisionalOperatorAND2());
  
  System.out.println("Nilai kondisi (Umur >= 25) && (Berat < 70) adalah " + 
    test.testKondisionalOperatorAND3());
  
  System.out.println("Nilai kondisi (Umur >=25) && (Berat >= 70) adalah " + 
    test.testKondisionalOperatorAND4());
  
  System.out.println();
  
  System.out.println("Nilai kondisi (Umur > 32) || (Berat < 70) adalah " + 
    test.testKondisionalOperatorOR1());
    
  System.out.println("Nilai kondisi (Umur > 32) || (Berat >= 70) adalah " + 
    test.testKondisionalOperatorOR2());
    
  System.out.println("Nilai kondisi (Umur >= 25) || (Berat < 70) adalah " + 
    test.testKondisionalOperatorOR3());
    
  System.out.println("Nilai kondisi (Umur >=25) || (Berat >= 70) adalah " + 
    test.testKondisionalOperatorOR4());
  
  System.out.println();
  
  System.out.println("Nilai kondisi (Umur > 32) & (Berat < 70) adalah " + 
    test.testLogikaAND1());
    
  System.out.println("Nilai kondisi (Umur > 32) & (Berat >= 70) adalah " + 
    test.testLogikaAND2());
    
  System.out.println("Nilai kondisi (Umur >= 25) & (Berat < 70) adalah " + 
    test.testLogikaAND3());
    
  System.out.println("Nilai kondisi (Umur >=25) & (Berat >= 70) adalah " + 
    test.testLogikaAND4());
  
  System.out.println();
  
  System.out.println("Nilai kondisi (Umur > 32) | (Berat < 70) adalah " + 
    test.testLogikaInclusiveOR1());
    
  System.out.println("Nilai kondisi (Umur > 32) | (Berat >= 70) adalah " + 
    test.testLogikaInclusiveOR2());
    
  System.out.println("Nilai kondisi (Umur >= 25) | (Berat < 70) adalah " + 
    test.testLogikaInclusiveOR3());
    
  System.out.println("Nilai kondisi (Umur >=25) | (Berat >= 70) adalah " + 
    test.testLogikaInclusiveOR4());
  
  System.out.println();
  
  System.out.println("Nilai kondisi (Umur > 32) ^ (Berat < 70) adalah " + 
    test.testLogikaExclusiveOR1());
    
  System.out.println("Nilai kondisi (Umur > 32) ^ (Berat >= 70) adalah " + 
    test.testLogikaExclusiveOR2());
    
  System.out.println("Nilai kondisi (Umur >= 25) ^ (Berat < 70) adalah " + 
    test.testLogikaExclusiveOR3());
    
  System.out.println("Nilai kondisi (Umur >=25) ^ (Berat >= 70) adalah " + 
    test.testLogikaExclusiveOR4());
  
  System.out.println();
  
  System.out.println("Nilai kondisi !(Umur >=25) adalah " + 
    test.testLogikaNOT1());
  
  System.out.println("Nilai kondisi !(Berat < 70) adalah " + 
    test.testLogikaNOT2());
  
  System.out.println("Nilai kondisi !(Berat == 70) adalah " + 
    test.testLogikaNOT3());
  
  System.out.println("Nilai kondisi !(Umur == 30) adalah " + 
    test.testLogikaNOT4());
 }
}
