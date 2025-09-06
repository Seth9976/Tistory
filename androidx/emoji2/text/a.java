package androidx.emoji2.text;

import android.os.Handler;
import android.view.Choreographer;
import j2.k;
import java.util.concurrent.Executor;

public final class a implements Executor {
    public final int a;
    public final Object b;

    public a(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override
    public final void execute(Runnable runnable0) {
        if(this.a != 0) {
            k k0 = new k(runnable0, 0);
            ((Choreographer)this.b).postFrameCallback(k0);
            return;
        }
        ((Handler)this.b).post(runnable0);
    }
}

