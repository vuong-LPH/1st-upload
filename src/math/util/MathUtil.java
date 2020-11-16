/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import vuong.util.MathUtility;

/**
 *
 * @author HP
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
//
        long expected = 120;
        long actual = MathUtility.getFactorial(5);
//ky vong 120, may chay thuc te ra cai j t luu o actual
//so sanh = mat
System.out.println("5! ? expected: " + expected + "; actual: " + actual);
System.out.println("6! ? expected: 720; actual: " + MathUtility.getFactorial(6));
System.out.println("0! ? expected: 1; actual: " + MathUtility.getFactorial(0));
//t ky vong m nem ve ngoai le neu t dua am giai thua MathUtility.getFactorial(-5)
//ko sout() vi chet ngay khi goi ham r
//chong at xem co dung ngoai le minh can nhu thiet ke de chui thang xai ham ko dung cach
    }
    
}

// nhuoc diem cua ky thuat nay:
// can phai dung mat de so sanh tung truong hop xai ham, so expected va actual
//neu test nhieu tinh huong , mat du  met moi phai do tung output
//cach nang cao
//gom ca dma test case nay lai, chay 1 luot nhu o tren
//may so gium ta luon expected va actual
//sau do
//neu tat ca cac case ma deu dung , thay ra 1 mau xanh- den xanh- code on
//new tat ca cac case deu dung , ngoai tru co 1, 2 va thang nao do
//expected kjhac actual, thay ra 1 mau do , ham y, ham sai r
// ham dung gan het, ket luon ngay ham sai
//do: chi co it nhat 1 cap expected actual ko bang nhau, ket luan ngay ham sai
//thay vi nhin tung case , ta se nhin chi mau xanh hoac do la du r
//ta can them bo thu vien de giup ta viec nay
//bo thu vien nay lam hai viec: ss gium actual vs expected
//tuy khop -> thay ra mau xah
//ko khop-> thay ra mau do
//no tu quwet het cac case ma minh da thiet ke de no ket luan, mat nhin duy nhat mau la du
//