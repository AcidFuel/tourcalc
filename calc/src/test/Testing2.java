/**
* Устанавливаем принадлежность класса к пакету testPackage
*/
package test;
/**
* Импортируем библиотеку
*/
import static org.junit.Assert.*;
/**
* Импортируем библиотеку
*/
import org.junit.*;
/**
* Импортируем класс Calculator
*/
import mainPackage.Calculator;
/**
* Основной класс
*/
public class Testing2 {
/**
* Объявляем переменную типа Calculator
*/
private Calculator test;
/**
* Обозначаем , что следующий метод будет тестируемым
*/
@Test
/**
* тестируемый метод
*/
public void testCalculator() {
/**
* Инициализируем переменную test
*/
test = new Calculator();
/**
* Тестируем метод с входными параметрами 4, 6, 1.85, 1.75, 2450, 2250, 2050, 1.95 и с предполагаемым результатом 331256.25
*/
assertEquals("500780.0", test.SetToutCost(5, 7, 1.9, 1.8, 2500, 2300, 2100, 2));
}
}