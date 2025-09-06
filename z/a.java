package z;

import java.util.concurrent.CancellationException;

public final class a extends CancellationException {
    @Override
    public final Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

