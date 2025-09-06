package vg;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;
import okio.Okio;

public final class i extends AsyncTimeout {
    public final Socket n;

    public i(Socket socket0) {
        Intrinsics.checkNotNullParameter(socket0, "socket");
        super();
        this.n = socket0;
    }

    @Override  // okio.AsyncTimeout
    public final IOException newTimeoutException(IOException iOException0) {
        IOException iOException1 = new SocketTimeoutException("timeout");
        if(iOException0 != null) {
            iOException1.initCause(iOException0);
        }
        return iOException1;
    }

    @Override  // okio.AsyncTimeout
    public final void timedOut() {
        Socket socket0;
        try {
            socket0 = this.n;
            socket0.close();
        }
        catch(Exception exception0) {
            g.a.log(Level.WARNING, "Failed to close timed out socket " + socket0, exception0);
        }
        catch(AssertionError assertionError0) {
            if(!Okio.isAndroidGetsocknameError(assertionError0)) {
                throw assertionError0;
            }
            g.a.log(Level.WARNING, "Failed to close timed out socket " + socket0, assertionError0);
        }
    }
}

