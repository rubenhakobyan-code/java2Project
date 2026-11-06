public class Main {
    public static void main(String[] args) {
        int a = 8;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a - b);
        System.out.println(a % b);

        double c = 6.4;
        double d = 0.03;
        System.out.println(c + d);
        System.out.println(c * d);
        System.out.println(c / d);
        System.out.println(c - d);
        System.out.println(c % d);

        int x1 = 2 * ((5 + 3) * 4 - 8);
        int y1 = 2 * 5 + 3 * 4 - 8;
        System.out.println(x1);
        System.out.println(y1);

        int e = 10;
        int f = -88;
        boolean n1 = true;
        System.out.println(-e);
        System.out.println(-f);
        System.out.println(+e);
        System.out.println(-e + 92);
        System.out.println(!n1);
        System.out.println(!(!n1));
        System.out.println(e++);
        System.out.println(--f);

        int x2 = 3;
        int y2 = ++x2 * 5 / x2-- + --x2;
        System.out.println("x is " + x2);
        System.out.println("y is " + y2);

        System.out.println((int) 1.0);
        System.out.println((short) 1921222);
        System.out.println(2147483647 + 1);
        int xAssign = 0;
        long yLong = (xAssign = 3);
        System.out.println(yLong);
        boolean boolA = false;
        boolean boolB = (boolA = true);
        System.out.println(boolA);

        int relX = 10;
        int relY = 20;
        System.out.println(relX < relY);
        System.out.println(relX <= relY);
        System.out.println(relX >= relY);
        System.out.println(relX > relY);

        float fixedY1 = 2.1f;
        System.out.println(fixedY1);

        byte byteX = 5;
        byte byteY = 10;
        int byteZ = byteX + byteY;
        System.out.println(byteZ);

        short shortX = 10;
        short shortY = 3;
        int shortZ = shortX * shortY;
        System.out.println(shortZ);

        long longX = 10;
        int intY = 5;
        intY = (int) (intY * longX);
        System.out.println(intY);

        int v1 = 10;
        int v2 = 5;
        int temp = v1;
        v1 = v2;
        v2 = temp;
        System.out.println(v1);
        System.out.println(v2);

        int swapA = 10;
        int swapB = 5;
        swapA = swapA + swapB;
        swapB = swapA - swapB;
        swapA = swapA - swapB;
        System.out.println(swapA);
        System.out.println(swapB);

        int sum100 = 100 * (1 + 100) / 2;
        System.out.println(sum100);

        int bitA = 8;
        int bitB = 3;
        System.out.println(bitA & bitB);
        System.out.println(bitA ^ bitB);
        System.out.println(bitA | bitB);
        System.out.println(~bitA);
        System.out.println(true || (bitA < 4));
        System.out.println((bitB >= 6) || (++bitA <= 7));
        System.out.println((bitA < bitB) ? bitA : bitB);
        System.out.println(bitB ^ bitB);

        System.out.println(10 << 2);
        System.out.println(-10 << 3);
        System.out.println(20 >> 2);
        System.out.println(15 >> 3);

        int num = 5;
        System.out.println(num << 3);
        System.out.println(num << 4);
    }
}