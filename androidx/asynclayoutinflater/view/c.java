package androidx.asynclayoutinflater.view;

import android.os.Message;
import android.util.Log;
import androidx.core.util.Pools.SynchronizedPool;
import java.util.concurrent.ArrayBlockingQueue;

public final class c extends Thread {
    public ArrayBlockingQueue a;
    public SynchronizedPool b;
    public static final c c;

    static {
        c c0 = new c();  // 初始化器: Ljava/lang/Thread;-><init>()V
        c0.a = new ArrayBlockingQueue(10);
        c0.b = new SynchronizedPool(10);
        c.c = c0;
        c0.start();
    }

    @Override
    public final void run() {
        b b0;
        while(true) {
            try {
                b0 = (b)this.a.take();
            }
            catch(InterruptedException interruptedException0) {
                Log.w("AsyncLayoutInflater", interruptedException0);
                b0 = (b)this.a.take();
            }
            try {
                b0.d = b0.a.a.inflate(b0.c, b0.b, false);
            }
            catch(RuntimeException runtimeException0) {
                Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", runtimeException0);
            }
            Message.obtain(b0.a.b, 0, b0).sendToTarget();
        }
    }
}

