package q105;

//public class Main {
//	public static void main(String[] args) {
//		System.out.printf("%15s%15s%15s\n", "Seoul", "10,312,545", "+91,375");
//		System.out.printf("%15s%15s%15s\n", "Pusan", "3,567,910", "+5,868");
//		System.out.printf("%15s%15s%15s\n", "Incheon", "2,758,296", "+64,888");
//		System.out.printf("%15s%15s%15s\n", "Daegu", "2,511,676", "+17,230");
//		System.out.printf("%15s%15s%15s\n", "Gwangju", "1,454,636", "+29,774");
//	}
//}


public class Main {
    public static void main(String[] args) {
        String[] cities = {"Seoul", "Pusan", "Incheon", "Daegu", "Gwangju"};
        String[] populations = {"10,312,545", "3,567,910", "2,758,296", "2,511,676", "1,454,636"};
        String[] changes = {"+91,375", "+5,868", "+64,888", "+17,230", "+29,774"};

        for (int i = 0; i < cities.length; i++) {
            System.out.println(
                    String.format("%15s", cities[i]) +
                    String.format("%15s", populations[i]) +
                    String.format("%15s", changes[i])
            );
        }
    }
}
