package jmri.jmrit.throttle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Test simple functioning of ThrottlesPreferences
 *
 * @author	Paul Bender Copyright (C) 2016
 */
public class ThrottlesPreferencesTest extends TestCase {

    public void testCtor() {
        ThrottlesPreferences panel = new ThrottlesPreferences();
        Assert.assertNotNull("exists", panel );
    }

    // from here down is testing infrastructure
    public ThrottlesPreferencesTest(String s) {
        super(s);
    }

    // Main entry point
    static public void main(String[] args) {
        String[] testCaseName = {"-noloading", ThrottlesPreferencesTest.class.getName()};
        junit.textui.TestRunner.main(testCaseName);
    }

    // test suite from all defined tests
    public static Test suite() {
        TestSuite suite = new TestSuite(ThrottlesPreferencesTest.class);
        return suite;
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        jmri.util.JUnitUtil.setUp();

    }
    
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        jmri.util.JUnitUtil.tearDown();

    }
}
