/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.codescale.util.imdb;

import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class JmdbTest {

    private Jmdb instance;
    private static int movieID  = 343818;
    private static String query = "I, Robot";


    @Before
    public void setUp() {
        Jmdb.Criteria c = new Jmdb.Criteria();
        c.put("timeout", "2000");
        this.instance = new Jmdb(c);
    }

    @After
    public void tearDown() {
        this.instance.clean();
        this.instance = null;
    }


    @Test
    public void testSearch_int() throws Exception {
        instance.search(movieID);
        assertEquals(Jmdb.Status.OK, instance.status);
    }

    @Test(expected=JmdbException.class)
    public void testSearch_int_fail() throws Exception {
        instance.search(786786746);
    }


    @Test
    public void testSearch_String() throws Exception {
        Map<Integer, String> matches;
        instance.search(query);
        matches = instance.getMatchedTitles();
        assertEquals(10, matches.size());
    }
//
//    /**
//     * Test of getStatus method, of class Jmdb.
//     */
//    @Test
//    public void testGetStatus() throws Exception {
//        System.out.println("getStatus");
//        Jmdb instance1 = new Jmdb();
//        if (instance1.getStatus() != null) {
//            fail("Status should be null for unused Jmdb instance");
//        }
//    }
//
//    /**
//     * Test of getMatchedTitles method, of class Jmdb.
//     */
//    @Test
//    public void testGetMatchedTitles() throws JmdbException {
//        System.out.println("getMatchedTitles");
//        Map<Integer, String> result = instance.getMatchedTitles();
//        assertTrue(result.size() > 0);
//    }
//
//    /**
//     * Test of getMovieID method, of class Jmdb.
//     */
//    @Test
//    public void testGetMovieID() {
//        System.out.println("getMovieID");
//        assertEquals(movieID, instance.getMovieID());
//    }
//
//    /**
//     * Test of getTitle method, of class Jmdb.
//     */
//    @Test
//    public void testGetTitle() {
//        System.out.println("getTitle");
//        assertEquals(query, instance.getTitle());
//    }
//
//    /**
//     * Test of getYear method, of class Jmdb.
//     */
//    @Test
//    public void testGetYear() {
//        System.out.println("getYear");
//        assertEquals("2004", instance.getYear());
//    }
//
//    /**
//     * Test of getPlot method, of class Jmdb.
//     */
//    @Test
//    public void testGetPlot() {
//        System.out.println("getPlot");
//        assertTrue(instance.getPlot().length() > 0);
//    }
//
//    /**
//     * Test of getCast method, of class Jmdb.
//     */
//    @Test
//    public void testGetCast() {
//        System.out.println("getCast");
//        assertTrue(instance.getCast().size() > 0);
//    }
//
//    /**
//     * Test of getDirectors method, of class Jmdb.
//     */
//    @Test
//    public void testGetDirectors() {
//        System.out.println("getDirectors");
//        assertTrue(instance.getDirectors().size() == 1);
//    }
//
//    /**
//     * Test of getWriters method, of class Jmdb.
//     */
//    @Test
//    public void testGetWriters() {
//        System.out.println("getWriters");
//        assertTrue(instance.getWriters().size() == 2);
//    }
//
//    /**
//     * Test of getCover method, of class Jmdb.
//     */
//    @Test
//    public void testGetCover() {
//        System.out.println("getCover");
//        assertTrue(instance.getCover().length() > 0);
//    }
//
//    /**
//     * Test of getCoverData method, of class Jmdb.
//     */
//    @Test
//    public void testGetCoverData() throws JmdbException {
//        System.out.println("getCoverData");
//        assertTrue(instance.getCoverData().length == 7259);
//    }
//
//    /**
//     * Test of getLanguage method, of class Jmdb.
//     */
//    @Test
//    public void testGetLanguage() {
//        System.out.println("getLanguage");
//        assertTrue(instance.getLanguage().length == 1);
//    }
//
//    /**
//     * Test of getCountry method, of class Jmdb.
//     */
//    @Test
//    public void testGetCountry() {
//        System.out.println("getCountry");
//        assertTrue(instance.getCountry().length == 2);
//    }
//
//    /**
//     * Test of getRating method, of class Jmdb.
//     */
//    @Test
//    public void testGetRating() {
//        System.out.println("getRating");
//        assertTrue(instance.getRating().getRating() >= 7.0f);
//        assertTrue(instance.getRating().getVotes() > 84000);
//    }
//
//    /**
//     * Test of getGenre method, of class Jmdb.
//     */
//    @Test
//    public void testGetGenre() {
//        System.out.println("getGenre");
//        assertTrue(instance.getGenre().length == 4);
//    }
//
//    /**
//     * Test of getTagline method, of class Jmdb.
//     */
//    @Test
//    public void testGetTagline() {
//        System.out.println("getTagline");
//        assertTrue(instance.getTagline().length() > 0);
//    }
//
//    /**
//     * Test of getAka method, of class Jmdb.
//     */
//    @Test
//    public void testGetAka() {
//        System.out.println("getAka");
//        assertTrue(instance.getAka().length == 2);
//    }
//
//    /**
//     * Test of getCertifications method, of class Jmdb.
//     */
//    @Test
//    public void testGetCertifications() {
//        System.out.println("getCertifications");
//        assertEquals(instance.getCertifications().size(), 27);
//    }
//
//    /**
//     * Test of getRuntime method, of class Jmdb.
//     */
//    @Test
//    public void testGetRuntime() {
//        System.out.println("getRuntime");
//        assertEquals(instance.getRuntime(), "115 min");
//    }
//
//    /**
//     * Test of getFullPlot method, of class Jmdb.
//     */
//    @Test
//    public void testGetFullPlot() throws Exception {
//        System.out.println("getFullPlot");
//        assertTrue(instance.getFullPlot().length() > 0);
//    }
//
//    /**
//     * Test of getTrivia method, of class Jmdb.
//     */
//    @Test
//    public void testGetTrivia() {
//        System.out.println("getTrivia");
//        assertTrue(instance.getTrivia().length() > 0);
//    }
//
//    /**
//     * Test of getGoofs method, of class Jmdb.
//     */
//    @Test
//    public void testGetGoofs() {
//        System.out.println("getGoofs");
//        assertTrue(instance.getGoofs().length() > 0);
//    }
//
//    /**
//     * Test of getAwards method, of class Jmdb.
//     */
//    @Test
//    public void testGetAwards() {
//        System.out.println("getAwards");
//        assertTrue(instance.getAwards().length() > 0);
//    }
//
//    /**
//     * Test of getOfficialSites method, of class Jmdb.
//     */
//    @Test
//    public void testGetOfficialSites() throws Exception {
//        System.out.println("getOfficialSites");
//        assertEquals(instance.getOfficialSites().size(), 2);
//    }
//
//    /**
//     * Test of clean method, of class Jmdb.
//     */
//    @Test
//    public void testClean() {
//        System.out.println("clean");
//        instance.clean();
//        try {
//            assertEquals(instance.getTitle(), null);
//            fail("Should throw exception");
//        } catch (NullPointerException ex) { }
//    }
}