package week3day2;

public class JavaConnection implements DatabseConnection {

	public static void main(String[] args) {
		JavaConnection j = new JavaConnection();
		j.executeUpdate();
		j.connect();
		j.disconnect();

	}

	public void connect() {
		System.out.println("connect");
	}

	public void disconnect() {
		System.out.println("disconnect");
		
	}

	public void executeUpdate() {
		System.out.println("executeupdate");
		
	}

}
