package androidx.core.net;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import h3.b;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketException;

public final class TrafficStatsCompat {
    @Deprecated
    public static void clearThreadStatsTag() {
        TrafficStats.clearThreadStatsTag();
    }

    @Deprecated
    public static int getThreadStatsTag() {
        return TrafficStats.getThreadStatsTag();
    }

    @Deprecated
    public static void incrementOperationCount(int v) {
        TrafficStats.incrementOperationCount(v);
    }

    @Deprecated
    public static void incrementOperationCount(int v, int v1) {
        TrafficStats.incrementOperationCount(v, v1);
    }

    @Deprecated
    public static void setThreadStatsTag(int v) {
        TrafficStats.setThreadStatsTag(v);
    }

    public static void tagDatagramSocket(@NonNull DatagramSocket datagramSocket0) throws SocketException {
        b.a(datagramSocket0);
    }

    @Deprecated
    public static void tagSocket(Socket socket0) throws SocketException {
        TrafficStats.tagSocket(socket0);
    }

    public static void untagDatagramSocket(@NonNull DatagramSocket datagramSocket0) throws SocketException {
        b.b(datagramSocket0);
    }

    @Deprecated
    public static void untagSocket(Socket socket0) throws SocketException {
        TrafficStats.untagSocket(socket0);
    }
}

