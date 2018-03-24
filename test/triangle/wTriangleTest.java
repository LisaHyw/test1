package triangle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class wTriangleTest {
	
	wTriangle tr=new wTriangle();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEquilateralTriangle() {
		assertEquals("�ȱ�������",tr.whichTriangle(2, 2, 2));
		assertEquals("�ȱ�������",tr.whichTriangle(7, 7, 7));
	}
	
	@Test
	public void testIsoscelesTriangle() {
		assertEquals("����������",tr.whichTriangle(2, 3, 2));
		assertEquals("����������",tr.whichTriangle(2, 2, 3));
		assertEquals("����������",tr.whichTriangle(3, 2, 2));
	}
	
	@Test
	public void testScaleneTriangle() {
		wTriangle tr=new wTriangle();
		assertEquals("��ͨ������",tr.whichTriangle(2, 3, 4));
		assertEquals("��ͨ������",tr.whichTriangle(5, 3, 4));
	}
	
	@Test
	public void testFailTriangle() {
		wTriangle tr=new wTriangle();
		assertEquals("�߲��ܷ���",tr.whichTriangle(2, 2, -2));
		assertEquals("�߲��ܷ���",tr.whichTriangle(0, 0, 0));
		assertEquals("�߲��ܷ���",tr.whichTriangle(-1, -1, -111));
		assertEquals("�߲��ܷ���",tr.whichTriangle(1, -1, 1));
		assertEquals("���ܹ���������",tr.whichTriangle(2, 2, 4));
		assertEquals("���ܹ���������",tr.whichTriangle(100, 1000, 1));
		assertEquals("���ܹ���������",tr.whichTriangle(5, 1, 1));
	}

}
