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
public class Testing1 {
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
* ��������� ����� � �������� ����������� 5, 7, 1.9, 1.8, 2500, 2300, 2100, 2 � � �������������� ����������� 500780.0
*/
assertEquals("500780.0", test.SetToutCost(5, 7, 1.9, 1.8, 2500, 2300, 2100, 2));
}
}