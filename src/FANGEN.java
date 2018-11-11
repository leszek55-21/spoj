import java.lang.*;
import java.util.Scanner;


enum FanDirection {
    CLOCKWISE, COUNTERCLOCKWISE
}

enum WingType {
    ASTERISK_TRIANGLE
}

class WingChars {

    private char first;
    private char second;

    public WingChars(char first, char second) {
        this.first = first;
        this.second = second;
    }

    public char getFirst () {
        return first;
    }

    public char getSecond () {
        return second;
    }
}

interface WingedFanPrinter {
    void printFan(int fanSize, FanDirection direction);
}

class WingedFanPrinterQuadrupleSymmetry implements WingedFanPrinter {

    private WingChars wingChars;

    public WingedFanPrinterQuadrupleSymmetry (WingChars creatingChars) {
        this.wingChars = creatingChars;
    }

    public void printFan(int fanSize, FanDirection direction) {
        if(fanSize < -200 || fanSize > 200) {
            System.exit(0);
        }
        for (int i = 0; i < 2 * fanSize; i++)
        {
            for (int j = 0; j < 2 * fanSize; j++)
            {
                // CLOCKWISE
                if (direction == FanDirection.CLOCKWISE)
                {
                    if (i < fanSize)
                    {
                        // LEFT - TOP
                        if (j < fanSize)
                        {
                            if (j < i + 1)
                                System.out.print(wingChars.getFirst());
                            else
                                System.out.print(wingChars.getSecond());
                        }
                        // RIGHT-TOP
                        else
                        {
                            if (j < (2 * fanSize) - i)
                                System.out.print(wingChars.getFirst());
                            else
                                System.out.print(wingChars.getSecond());
                        }
                    }
                    else
                    {
                        // LEFT-BOTTOM
                        if (j < fanSize)
                        {
                            if (j >= (2 * fanSize) - i - 1)
                                System.out.print(wingChars.getFirst());
                            else
                                System.out.print(wingChars.getSecond());
                        }
                        // RIGHT-BOTTOM
                        else
                        {
                            if (j >= i)
                                System.out.print(wingChars.getFirst());
                            else
                                System.out.print(wingChars.getSecond());
                        }
                    }
                }
                // COUNTERCLOCKWISE
                else
                {
                    if (i < fanSize)
                    {
                        // LEFT-TOP
                        if (j < fanSize)
                        {
                            if (j >= i)
                                System.out.print(wingChars.getFirst());
                            else
                                System.out.print(wingChars.getSecond());
                        }
                        // RIGHT-TOP
                        else
                        {
                            if (j >= (2 * fanSize) - i - 1)
                                System.out.print(wingChars.getFirst());
                            else
                                System.out.print(wingChars.getSecond());
                        }
                    }
                    else
                    {
                        // LEFT-BOTTOM
                        if (j < fanSize)
                        {
                            if (j < (2 * fanSize) - i)
                                System.out.print(wingChars.getFirst());
                            else
                                System.out.print(wingChars.getSecond());
                        }
                        // RIGHT-BOTTOM
                        else
                        {
                            if (j <= i)
                                System.out.print(wingChars.getFirst());
                            else
                                System.out.print(wingChars.getSecond());
                        }
                    }
                }

            }
            System.out.println();
        }
    }
}

class WingedFanPrinterFactory {
    public static WingedFanPrinter getWingedFanPrinter(WingType type) {

        if (type == WingType.ASTERISK_TRIANGLE) {
            return new WingedFanPrinterQuadrupleSymmetry(new WingChars('*', '.'));
        }
        throw new IllegalArgumentException("Illegal FanPrinterType: " + type);
    }
}

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        WingedFanPrinter fanPrinter = WingedFanPrinterFactory.getWingedFanPrinter(WingType.ASTERISK_TRIANGLE);
        while(scanner.hasNext()) {
            int size = scanner.nextInt();
            if(size > 0) {
                fanPrinter.printFan(size, FanDirection.CLOCKWISE);
            } else if (size < 0) {
                fanPrinter.printFan(Math.abs(size), FanDirection.COUNTERCLOCKWISE);
            } else {
                System.exit(0);
            }
        }
    }
}