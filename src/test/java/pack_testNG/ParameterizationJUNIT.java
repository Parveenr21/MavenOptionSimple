package pack_testNG;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(value = Parameterized.class)
public class ParameterizationJUNIT {


    private int a;
    private int b;
    private boolean c;


    //Using constructor

    public  ParameterizationJUNIT(int a, int b, boolean c)

    {
        this.a=a;
        this.b=b;
        this.c=c;

    }



    @Parameterized.Parameters
    public static Collection<Object[]> ParameterProvider() {
        return Arrays.asList(new Object[][] {
                { 2,4, true },
                { 6,16, false },
                { 19,1, true },
                { 22,2, false },
                { 23,5, true }
        });
    }



    @Test
    public void foo1()
    {
        System.out.println(a);

    }


    @Test
    public void foo2()
    {
        System.out.println(a);

    }

    @Test
    public void foo3()
    {
        System.out.println("sample");

    }



}
