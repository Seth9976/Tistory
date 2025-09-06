package h3;

import android.net.TrafficStats;
import androidx.annotation.DoNotInline;
import java.net.DatagramSocket;
import java.net.SocketException;

public abstract class b {
    @DoNotInline
    public static void a(DatagramSocket datagramSocket0) throws SocketException {
        TrafficStats.tagDatagramSocket(datagramSocket0);
    }

    @DoNotInline
    public static void b(DatagramSocket datagramSocket0) throws SocketException {
        TrafficStats.untagDatagramSocket(datagramSocket0);
    }
}

