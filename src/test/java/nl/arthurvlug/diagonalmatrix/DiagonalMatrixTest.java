package nl.arthurvlug.diagonalmatrix;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class DiagonalMatrixTest {
	@Test
	@SuppressWarnings("unchecked")
	public void matrix_1x1() throws Exception {
		List<List<Integer>> matrix = Arrays.asList(
			Arrays.asList(1)
		);
		List<List<Integer>> expectedMatrix = Arrays.asList(
			Arrays.asList(1)
		);
		new DiagonalMatrix(matrix);
//		assertEquals(expectedMatrix, new DiagonalMatrix(matrix).getResult());
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void matrix_2x2() throws Exception {
		List<List<Integer>> matrix = Arrays.asList(
				Arrays.asList(1, 2),
				Arrays.asList(3, 4)
		);
		List<List<Integer>> expectedMatrix = Arrays.asList(
				Arrays.asList(1),
				Arrays.asList(2, 3),
				Arrays.asList(4)
		);
		new DiagonalMatrix(matrix);
//		assertEquals(expectedMatrix, new DiagonalMatrix(matrix).getResult());
	}
	
	@Test
	@SuppressWarnings("unchecked")
	public void matrix_3x3() throws Exception {
		List<List<Integer>> matrix = Arrays.asList(
				Arrays.asList(1, 2, 3),
				Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9)
		);
		List<List<Integer>> expectedMatrix = Arrays.asList(
				Arrays.asList(1),
				Arrays.asList(2, 4),
				Arrays.asList(3, 5, 7),
				Arrays.asList(6, 8),
				Arrays.asList(9)
		);
		new DiagonalMatrix(matrix);
//		assertEquals(expectedMatrix, new DiagonalMatrix(matrix).getResult());
	}
}
