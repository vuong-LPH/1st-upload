/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuong.util;

/**
 *
 * @author HP
 */
public class MathUtility {
//     fake claa Math giong nhu that
// Math.sqrt() . abs() .pow() .sin() pi
//    tinh n! = 1.2.3.4...n
//    21! tran long roi, am gia thua khong tinh duoc, vo nghia
//    0! = 1! = 1;
//    bai nay minh chi tinh gt trong khoang tu 0...20
//    neu dua n ca chon <0>20 chui, khong them tinh
    public static long getFactorial(int n) {
//       
if(n < 0 || n >20) 
    throw new IllegalArgumentException("n must be between 0..20");

     if(n == 0 || n ==1) 
            return 1; //n dac biet return luon
     //
     long result =1;
     for(int i =2; i <= n; i++) {
         result *=i;
     }
            return result;
     
    }
    
    //tu tin ham chay dung nhu thiet ke
    //khong tin, phai test da
    //co nhieu cach de test
    //kieu j cung phai la : minh tinh truoc ket qua ham can tra ve Expected value minh goi hma coi no chay ra may, actual value
    //so sanh oi expected value == actual value hay ko 
    // co bang, ham chay dung cho tinh huong x
    //khong bang, ham chay sai cho tinh huong x
    //vd: 
    //t nghi rang 5! phai la 120(expected)
    //gio t goi ham getFactorial(5 dua vao), coi ra ket qua may(actual)
    //neu actual gia su la 120 luon, may qua ham dung cho 5! vi khop ki vong //case(tinh huong) n= 5 ham dung
    //case(tinh huong) n = 5
}
