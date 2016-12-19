package AdapterPattern;

/**
 * Created by will on 16-12-19.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        GBSocketInterface gbSocket = new GBSocket();

        Hotel hotel = new Hotel();

        SocketAdapter socketAdapter = new SocketAdapter(gbSocket);

        hotel.setSocket(socketAdapter);

        hotel.charge();
    }
}
