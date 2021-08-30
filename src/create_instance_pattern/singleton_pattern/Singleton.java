package create_instance_pattern.singleton_pattern;

class ConnectionPool {
    private static ConnectionPool instance = new ConnectionPool();
    private ConnectionPool() {}

    public static ConnectionPool getInstance() {

        if(instance == null) {
            instance = new ConnectionPool();
        }

        return instance;
    }
}


public class Singleton {

    public static void main(String[] args) {
//        인스턴스 생성 불가능
//        ConnectionPool connectionPool = new ConnectionPool();

        ConnectionPool connectionPool = ConnectionPool.getInstance();
        ConnectionPool connectionPool2 = ConnectionPool.getInstance();

        if(connectionPool == connectionPool2) {
            System.out.println(true);
        }
    }
}
