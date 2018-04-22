/**
* ������������� �������������� ������ � ������ testPackage
*/
package test;
/**
* ����������� ����������
*/
import static org.junit.Assert.*;
/**
* ����������� ����������
*/
import org.junit.*;
/**
* ����������� ����� Calculator
*/
import mainPackage.Calculator;
/**
* �������� �����
*/
public class Testing2 {
/**
* ��������� ���������� ���� Calculator
*/
private Calculator test;
/**
* ���������� , ��� ��������� ����� ����� �����������
*/
@Test
/**
* ����������� �����
*/
public void testCalculator() {
/**
* �������������� ���������� test
*/
test = new Calculator();
/**
* ��������� ����� � �������� ����������� 4, 6, 1.85, 1.75, 2450, 2250, 2050, 1.95 � � �������������� ����������� 331256.25
*/
assertEquals("500780.0", test.SetToutCost(5, 7, 1.9, 1.8, 2500, 2300, 2100, 2));
}
}