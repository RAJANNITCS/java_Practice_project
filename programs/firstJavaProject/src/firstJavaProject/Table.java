package firstJavaProject;

public class Table {
	
	void printTable() {
		for(int i = 1;i <= 10;i++) {
			System.out.printf("%d x %d = %d",1,i,1*i).println();
		}
	}
	void printTable(int num) {
		for(int i = 1;i <= 10;i++) {
			System.out.printf("%d x %d = %d",num,i,num*i).println();
		}
	}
}
