/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuong.util.test;

import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import static vuong.util.MathUtility.*;
// chi co tu jdk 5, chi danh cho static
//tuc la khi choi tro import static, thi moi ham static trong class nay khi goi thi can ten class cham, goi nhu C, vi hieu ngam da cham roi

/**
 *
 * @author HP
 */
public class MathUtilityTest {

//    class nay la class xai bo thu vien jUnit dung de test code theo dang xnah d thay vi nhin bang mat nhu ben main() sout()
// 2 file .jar da dc add vao project nay va ta thoai mai xai cac ham cua no
// trong cac ham cua thu vien nau=y co n ham dac biet deu co ten xuat phat la assertX( expected va actual dua vao)
// neu no thya expected ko bnag actual, no thay mau do
// neu co no thay mau xnah
// quy tac xanh do : neu tat ca xanh -> ket luan xnah
// neu co it nhat 1 do, khong quan tam con lai -> ket luan do
//dam bao: ham chay dung moi case, truong hop
@Test // bien ham sau day thanh puclic static void main va muon chay thi nhan shilft fe
public void getFactorial_Runswell_IfValidArgument() {
    assertEquals(120,getFactorial(5));
    assertEquals(720,getFactorial(6));   
    assertEquals(24,getFactorial(4));   
    assertEquals(1,getFactorial(0));   
}

@Test (expected = SQLException.class)
//@Test (expected = IllegalArgumentException.class)
public void getFactorial_ThrowsException_IfInvalidArgument() {
//    ngoai le khong phai la value de assert()
// chi co the chup no lai
getFactorial(-5);
}
}
