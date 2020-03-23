import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;
    @Before
    public void before(){
        printer = new Printer(50, 100);
    }

    @Test
    public void getSheets(){
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void getTonerVolume(){
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void printPages(){
        printer.print(5, 8);
        assertEquals(10, printer.getSheets());
    }

    @Test
    public void cannotPrintPages(){
        printer.print(5, 20);
        assertEquals(50, printer.getSheets());
    }

    @Test
    public void tonerReducesOnPrint(){
        printer.print(5, 8);
        assertEquals(60, printer.getTonerVolume());
    }

    @Test
    public void tonerDoesNotReduceIfCantPrint(){
        printer.print(5, 20);
        assertEquals(100, printer.getTonerVolume());
    }
}
