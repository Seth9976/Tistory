package w0;

import java.util.concurrent.CancellationException;

public final class i extends CancellationException {
    @Override
    public final Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

