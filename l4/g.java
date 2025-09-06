package l4;

import a6.a;
import android.os.Looper;
import androidx.loader.content.ModernAsyncTask.Status;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class g {
    public final a a;
    public final c b;
    public volatile ModernAsyncTask.Status c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public static final ThreadPoolExecutor f;
    public static f g;
    public static volatile ThreadPoolExecutor h;

    static {
        b b0 = new b(0);
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue(10);
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(5, 0x80, 1L, TimeUnit.SECONDS, linkedBlockingQueue0, b0);
        g.f = threadPoolExecutor0;
        g.h = threadPoolExecutor0;
    }

    public g() {
        this.c = ModernAsyncTask.Status.PENDING;
        this.d = new AtomicBoolean();
        this.e = new AtomicBoolean();
        a a0 = new a(this, 6);
        this.a = a0;
        this.b = new c(this, a0);
    }

    public final void a(Object object0) {
        synchronized(g.class) {
            if(g.g == null) {
                g.g = new f(Looper.getMainLooper());  // 初始化器: Landroid/os/Handler;-><init>(Landroid/os/Looper;)V
            }
        }
        g.g.obtainMessage(1, new e(this, new Object[]{object0})).sendToTarget();
    }
}

