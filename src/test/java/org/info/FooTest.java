package org.info;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Foo.
 */
public class FooTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FooTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FooTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testFoo()
    {
        assertTrue( true );
    }
}
