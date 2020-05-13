package innerClasses.anonymous;

public class DriverManager {
	static Connection getConnection() {
		Connection con = new Connection() {
			@Override
			public void getConnection() {
				System.out.println("Getting Connection");
			}
		};
		return con;
	}
}
