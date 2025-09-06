package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class f implements Executor {
    public final Handler a;

    public f() {
        this.a = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void execute(Runnable runnable0) {
        this.a.post(runnable0);
    }
}

