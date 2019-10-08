// The skeleton program for Server
import java.net.*;//classes for networking
import java.io.*;//any input and output


public class Server
{
	//input stream defined
	private Socket socket = null;
	private ServerSocket server = null;
	private DataInputStream in = null;
}

    public static void main(String args[])
    {
        Server server = new Server(5000);
    }
}
