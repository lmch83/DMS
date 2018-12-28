/*
 * Feel free to edit, copy and reuse the resources
 * available in this project, unless you are going to use autogenerated
 * code where different licences might apply. It is your responsibility
 * to ensure that you posses the right to modify, copy or reuse such 
 * resources.
 */
package beans;

import core.Stoppage;
import java.util.Date;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lukas
 */
public class StoppageBeanTest
{

    public StoppageBeanTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    /**
     * Test of getDate method, of class StoppageBean.
     */
    @Test
    public void testGetDate()
    {
        System.out.println("getDate");
        StoppageBean instance = new StoppageBean();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDate method, of class StoppageBean.
     */
    @Test
    public void testSetDate()
    {
        System.out.println("setDate");
        Date date = null;
        StoppageBean instance = new StoppageBean();
        instance.setDate(date);

    }

    /**
     * Test of getStoppage method, of class StoppageBean.
     */
    @Test
    public void testGetStoppage()
    {
        System.out.println("getStoppage");
        StoppageBean instance = new StoppageBean();
        Stoppage expResult = null;
        Stoppage result = instance.getStoppage();
        assertEquals(expResult, result);

    }

    /**
     * Test of setStoppage method, of class StoppageBean.
     */
    @Test
    public void testSetStoppage()
    {
        System.out.println("setStoppage");
        Stoppage stoppage = null;
        StoppageBean instance = new StoppageBean();
        instance.setStoppage(stoppage);

    }

    /**
     * Test of getStartTime method, of class StoppageBean.
     */
    @Test
    public void testGetStartTime()
    {
        System.out.println("getStartTime");
        StoppageBean instance = new StoppageBean();
        String expResult = "";
        String result = instance.getStartTime();
        assertEquals(expResult, result);

    }

    /**
     * Test of setStartTime method, of class StoppageBean.
     */
    @Test
    public void testSetStartTime()
    {
        System.out.println("setStartTime");
        String startTime = "";
        StoppageBean instance = new StoppageBean();
        instance.setStartTime(startTime);

    }

    /**
     * Test of getEndTime method, of class StoppageBean.
     */
    @Test
    public void testGetEndTime()
    {
        System.out.println("getEndTime");
        StoppageBean instance = new StoppageBean();
        String expResult = "";
        String result = instance.getEndTime();
        assertEquals(expResult, result);

    }

    /**
     * Test of setEndTime method, of class StoppageBean.
     */
    @Test
    public void testSetEndTime()
    {
        System.out.println("setEndTime");
        String endTime = "";
        StoppageBean instance = new StoppageBean();
        instance.setEndTime(endTime);

    }

    /**
     * Test of getOccurencies method, of class StoppageBean.
     */
    @Test
    public void testGetOccurencies()
    {
        System.out.println("getOccurencies");
        StoppageBean instance = new StoppageBean();
        int expResult = 0;
        int result = instance.getOccurencies();
        assertEquals(expResult, result);

    }

    /**
     * Test of setOccurencies method, of class StoppageBean.
     */
    @Test
    public void testSetOccurencies()
    {
        System.out.println("setOccurencies");
        int occurencies = 0;
        StoppageBean instance = new StoppageBean();
        instance.setOccurencies(occurencies);

    }

    /**
     * Test of getDescr method, of class StoppageBean.
     */
    @Test
    public void testGetDescr()
    {
        System.out.println("getDescr");
        StoppageBean instance = new StoppageBean();
        String expResult = "";
        String result = instance.getDescr();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDescr method, of class StoppageBean.
     */
    @Test
    public void testSetDescr()
    {
        System.out.println("setDescr");
        String descr = "";
        StoppageBean instance = new StoppageBean();
        instance.setDescr(descr);

    }

    /**
     * Test of getLineID method, of class StoppageBean.
     */
    @Test
    public void testGetLineID()
    {
        System.out.println("getLineID");
        StoppageBean instance = new StoppageBean();
        String expResult = "";
        String result = instance.getLineID();
        assertEquals(expResult, result);

    }

    /**
     * Test of setLineID method, of class StoppageBean.
     */
    @Test
    public void testSetLineID() throws Exception
    {
        System.out.println("setLineID");
        String lineID = "";
        StoppageBean instance = new StoppageBean();
        instance.setLineID(lineID);

    }

    /**
     * Test of getArea method, of class StoppageBean.
     */
    @Test
    public void testGetArea()
    {
        System.out.println("getArea");
        StoppageBean instance = new StoppageBean();
        String expResult = "";
        String result = instance.getArea();
        assertEquals(expResult, result);

    }

    /**
     * Test of setArea method, of class StoppageBean.
     */
    @Test
    public void testSetArea()
    {
        System.out.println("setArea");
        String area = "";
        StoppageBean instance = new StoppageBean();
        instance.setArea(area);

    }

    /**
     * Test of getDescriptions method, of class StoppageBean.
     */
    @Test
    public void testGetDescriptions()
    {
        System.out.println("getDescriptions");
        StoppageBean instance = new StoppageBean();
        Set<String> expResult = null;
        Set<String> result = instance.getDescriptions();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDescriptions method, of class StoppageBean.
     */
    @Test
    public void testSetDescriptions()
    {
        System.out.println("setDescriptions");
        Set<String> descriptions = null;
        StoppageBean instance = new StoppageBean();
        instance.setDescriptions(descriptions);

    }

    /**
     * Test of getSearchDescription method, of class StoppageBean.
     */
    @Test
    public void testGetSearchDescription()
    {
        System.out.println("getSearchDescription");
        StoppageBean instance = new StoppageBean();
        String expResult = "";
        String result = instance.getSearchDescription();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSearchDescription method, of class StoppageBean.
     */
    @Test
    public void testSetSearchDescription()
    {
        System.out.println("setSearchDescription");
        String searchDescription = "";
        StoppageBean instance = new StoppageBean();
        instance.setSearchDescription(searchDescription);

    }

    /**
     * Test of getSolution method, of class StoppageBean.
     */
    @Test
    public void testGetSolution()
    {
        System.out.println("getSolution");
        StoppageBean instance = new StoppageBean();
        String expResult = "";
        String result = instance.getSolution();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSolution method, of class StoppageBean.
     */
    @Test
    public void testSetSolution()
    {
        System.out.println("setSolution");
        String solution = "";
        StoppageBean instance = new StoppageBean();
        instance.setSolution(solution);

    }

    /**
     * Test of populateDescriptions method, of class StoppageBean.
     */
    @Test
    public void testPopulateDescriptions() throws Exception
    {
        System.out.println("populateDescriptions");
        StoppageBean instance = new StoppageBean();
        instance.populateDescriptions();

    }

    /**
     * Test of activateDowntime method, of class StoppageBean.
     */
    @Test
    public void testActivateDowntime() throws Exception
    {
        System.out.println("activateDowntime");
        StoppageBean instance = new StoppageBean();
        instance.activateDowntime();

    }

}
