package ru.geekbrains.coverage;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class SomeServiceTest {
    private SomeService someService;

    @BeforeEach
    void setUp(){
       someService = new SomeService();
    }

    @Test
    void multipleTreeNotFiveReturnsFizz(){
        assertEquals("Fizz", someService.fizzBuzz(3));
    }
    @Test
    void multipleFiveNotTreeReturnsBuzz(){
        assertEquals("Buzz", someService.fizzBuzz(5));
    }
    @Test
    void multipleTreeAndFifteenReturnsFizzBuzz(){
        assertEquals("FizzBuzz", someService.fizzBuzz(15));
    }
    @Test
    void notMultipleTreeAndFiveReturnsNumber(){
        assertEquals(Integer.toString(1), someService.fizzBuzz(1));
    }

    @Test
    void firstLast6() {
        assertTrue(someService.firstLast6(new int[]{6,4,3}));
        assertTrue(someService.firstLast6(new int[]{1,4,6}));
        assertFalse(someService.firstLast6(new int[]{2,4,3}));
    }

    @Test
    void calculatingCorrectDiscount() {
        assertThat(someService.calculatingDiscount(100, 10)).isEqualTo(90);
        assertThat(someService.calculatingDiscount(100, 100)).isEqualTo(0);
        assertThat(someService.calculatingDiscount(100, 0)).isEqualTo(100);
    }

    @Test
    void negativePurchaseAmountReturnsException() {
        assertThatThrownBy(() -> someService.calculatingDiscount(-1000, 10))
                .isInstanceOf(ArithmeticException.class).hasMessage("Отрицательная сумма заказа!!!");
    }

    @Test
    void negativeDiscountReturnsException() {
        assertThatThrownBy(() -> someService.calculatingDiscount(1000, -10))
                .isInstanceOf(ArithmeticException.class).hasMessage("Не верная скидка! 0% - 100%");
    }

    @Test
    void more100DiscountReturnsException() {
        assertThatThrownBy(() -> someService.calculatingDiscount(1000, 101))
                .isInstanceOf(ArithmeticException.class).hasMessage("Не верная скидка! 0% - 100%");
    }

    @Test
    void correctLuckySum() {
        assertThat(someService.luckySum(2, 3, 4)).isEqualTo(9);
        assertThat(someService.luckySum(13, 3, 4)).isEqualTo(7);
        assertThat(someService.luckySum(2, 13, 4)).isEqualTo(6);
        assertThat(someService.luckySum(2, 3, 13)).isEqualTo(5);
    }

    @Test
    void moodAnalyser() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Это грустное сообщение");

        assertThat(mood).isEqualTo("Sad");
    }

    @Test
    void testHappyMoodAnalyser() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Это веселое сообщение");

        assertThat(mood).isEqualTo("Happy");
    }

    @Test
    void evenOddNumber() {
        assertTrue(someService.evenOddNumber(4));
        assertFalse(someService.evenOddNumber(7));
    }


    @Test
    void numberInInterval() {
        assertTrue(someService.numberInInterval(45));
        assertFalse(someService.numberInInterval(9));
    }
}
