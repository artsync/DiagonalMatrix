package nl.arthurvlug.diagonalmatrix;

import java.util.List;

public class DiagonalMatrix {
	public DiagonalMatrix(List<List<Integer>> matrix) {
		for(int i = 0; i < 2*matrix.size()-1; i++) {
			printLine(matrix, i);
		}
		System.out.println();
	}

	private void printLine(List<List<Integer>> matrix, int i) {
		if(i < matrix.size()) {
			printDiagonal(matrix, i, 0);
		} else {
			printDiagonal(matrix, matrix.size()-1, i - matrix.size()+1);
		}
		
	}

	private void printDiagonal(List<List<Integer>> matrix, int x, int y) {
		while(x >= 0 && y < matrix.size()) {
			System.out.print(matrix.get(y).get(x) + " ");
			x--;
			y++;
		}
		System.out.println();
	}
	
//	@Getter
//	private List<List<Integer>> result = new ArrayList<List<Integer>>();
//	
//	public DiagonalMatrix(List<List<Integer>> matrix) {
//		for(int i = 0; i < matrix.size(); i++) {
//			List<Integer> list = matrix.get(i);
//			for(int j = 0; j < list.size(); j++) {
//				Integer value = list.get(j);
//				add(i+j, value);
//			}
//		}
//	}
//
//	private void add(int row, int value) {
//		if(row == result.size()) {
//			result.add(new ArrayList<Integer>());
//		}
//		result.get(row).add(value);
//	}
}
