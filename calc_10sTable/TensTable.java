package calc_10sTable;

public class TensTable {
//	//-------------METHOD 1 -----------
		public static int tenTable(int num) {
			for(int i=0; i<=10; i++) {
				System.out.println(num + "* " + i + " = " + num*i);
			}
			return num;
		}
		
//		//-------------MAIN METHOD -----------
		public static void main(String[] args) {
			tenTable(11);
		}
}
