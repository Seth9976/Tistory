package androidx.emoji2.text;

import androidx.core.os.TraceCompat;
import io.reactivex.internal.schedulers.SchedulerPoolFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class n implements Runnable {
    public final int a;

    public n(int v) {
        this.a = v;
        super();
    }

    private final void a() {
    }

    @Override
    public final void run() {
    alab1:
        switch(this.a) {
            case 0: {
                try {
                    TraceCompat.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                }
                finally {
                    TraceCompat.endSection();
                }
                return;
            label_8:
                Iterator iterator0 = new ArrayList(SchedulerPoolFactory.b.keySet()).iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        break alab1;
                    }
                    Object object0 = iterator0.next();
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = (ScheduledThreadPoolExecutor)object0;
                    if(scheduledThreadPoolExecutor0.isShutdown()) {
                        SchedulerPoolFactory.b.remove(scheduledThreadPoolExecutor0);
                    }
                    else {
                        scheduledThreadPoolExecutor0.purge();
                    }
                }
            }
            case 1: {
                break;
            }
            default: {
                goto label_8;
            }
        }
    }

    @Override
    public String toString() {
        return this.a == 1 ? "EmptyRunnable" : super.toString();
    }
}

