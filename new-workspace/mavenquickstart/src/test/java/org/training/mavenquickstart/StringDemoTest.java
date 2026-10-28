package org.training.mavenquickstart;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringDemoTest {

	
	
	@Test
	public void getLengthTest() {

		assertEquals(8, new StringDemo().getLength("prasanth"));
		assertNotEquals(80, new StringDemo().getLength("prasanth"));
	}

	@Test
	public void toUppercase() {

		assertEquals("PRASANTH", new StringDemo().toUppercase("prasanth"));
	}

	@Test
	public void toLowercase() {

		assertEquals("prasanth", new StringDemo().toLowercase("PRASANTH"));
	}

	@Test
	public void getCharAtTest() {

		assertEquals('a', new StringDemo().getCharAt(4, "prasanth"));
		assertNotEquals('a', new StringDemo().getCharAt(5, "prasanth"));

	}

	@Test
	public void getStartsWith() {

		assertTrue(new StringDemo().getStartsWith("prasanth"));
	}

	@Test
	public void getEndsWith() {

		assertTrue(new StringDemo().getEndsWith("prasanth"));
	}

	@Test
	public void isEmpty() {

		assertFalse(new StringDemo().isEmpty("prasanth"));
	}

	@Test
	public void replace() {
		assertEquals("kota", new StringDemo().replace("prasanth"));
	}

	@Test
	public void isreplace() {
		assertEquals("s", new StringDemo().replace("s"));
	}

	@Test
	public void getTrim() {

		assertEquals("prasanthkota", new StringDemo().getTrim("    prasanthkota"));
	}

	@Test
	public void toSubstringTest() {
		assertEquals("nth", new StringDemo().toSubString("prasanth", 5));
	}

	@Test
	public void isSubString() {

		assertEquals("santh", new StringDemo().isSubString("prasanth", 3, 8));
	}

	@Test
	public void getIndexOf() {

		assertEquals(0, new StringDemo().getIndexOf("prasanth"));
	}

	@Test
	public void lastIndexOf() {

		assertEquals(7, new StringDemo().lastIndexOf("prasanth"));
	}

	@Test
	public void isEqualTo() {

		assertFalse(new StringDemo().equalTo("prasanth", "kota"));
	}


	
	
	@Test 
	public void arrayof () {
		char[] array =  {'j','a','n'};
		assertArrayEquals( array, new StringDemo().arrayof("jan"));
	}


	
	@Test 
	public void splitof() {
		String[] array = {"jan","mar","jun","aug","sep","dec","nov","may","feb","apr","jul"};
		assertArrayEquals( array, new StringDemo().splitOf("jan,mar,jun,aug,sep,dec,nov,may,feb,apr,jul")); 
	}
	
	
	
	@Test 
	public void reverse() {
	
		assertEquals("etinifnI", new StringDemo().reverse("Infinite"));
	
	}
	
	
	@Test 
	public void count() {
		assertEquals(2,new StringDemo().Count("Infinite"));
	}
	
	
	
	
	
	@Test
	public void countOf() {
		assertEquals(5, new StringDemo().countof("Java Programming"));
	}
	
	
	
	
	
	@Test 
	public void valuOf() {
		String str = "abcabcbb";
		assertEquals(3, new  StringDemo().Valueof(str));
	}

	
	

	@Test 
	public void arraySortOfTest() {
		int [] arr = {1,10,12, 34, 987654321 };
		int [] exp = { 987654321,34,12,10,1} ;
		assertArrayEquals(exp, new StringDemo().arraySortOf(arr));
	}
}
