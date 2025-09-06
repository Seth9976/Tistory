package v8;

import java.util.concurrent.ThreadFactory;

public final class d implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable0) {
        return new Thread(runnable0, "heartbeat-information-executor");
    }
}

