package l8;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class c implements Executor {
    public static final Handler a;

    static {
        c.a = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void execute(Runnable runnable0) {
        c.a.post(runnable0);
    }
}

