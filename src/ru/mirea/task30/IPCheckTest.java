package ru.mirea.task30;

import org.junit.Test;
import java.io.FileWriter;
import java.io.IOException;
import static org.junit.Assert.*;

public class IPCheckTest {
    static boolean checkIPTest = false;
    @Test
    public void checkIP()
    {
        assertTrue(IP.checkIP("127.0.0.1"));
        assertTrue(IP.checkIP("255.255.255.0"));
        assertFalse(IP.checkIP("1300.6.7.8"));
        assertFalse(IP.checkIP("abc.def.gha.bcd"));
        checkIPTest = true;
        writeCheckIPTestResults();
    }

    static void writeCheckIPTestResults()
    {
        try
        {
            FileWriter fw = new FileWriter("src\\ru\\mirea\\task31\\CheckIPTestsResults.md");

            fw.write("Результаты тестирования:\n");

            fw.write("Тест IPCheck()\n");
            if (IPCheckTest.checkIPTest)
            {
                fw.write("Тесты прошли успешно\n");
            }
            else
            {
                fw.write("Тесты не прошли\n");
            }

            System.out.println("Результаты успешно записаны");
            fw.flush();
        }
        catch (IOException e)
        {
            System.out.println("Ошибка: \n" + e.getMessage());
        }

    }
}
