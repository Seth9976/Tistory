package p0;

import java.util.concurrent.CancellationException;

public final class g extends CancellationException {
    @Override
    public final Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

