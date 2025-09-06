package ug;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.ws.RealWebSocket;

public final class a extends Task {
    public final RealWebSocket e;

    public a(RealWebSocket realWebSocket0) {
        this.e = realWebSocket0;
        super(realWebSocket0.m + " writer", false, 2, null);
    }

    @Override  // okhttp3.internal.concurrent.Task
    public final long runOnce() {
        RealWebSocket realWebSocket0;
        try {
            realWebSocket0 = this.e;
            if(realWebSocket0.writeOneFrame$okhttp()) {
                return 0L;
            }
        }
        catch(IOException iOException0) {
            realWebSocket0.failWebSocket(iOException0, null);
        }
        return -1L;
    }
}

