package w8;

import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

public final class a {
    public final Utils a;
    public long b;
    public int c;
    public static final long d;
    public static final long e;

    static {
        a.d = TimeUnit.HOURS.toMillis(24L);
        a.e = TimeUnit.MINUTES.toMillis(30L);
    }

    public a() {
        this.a = Utils.getInstance();
    }

    public final boolean a() {
        synchronized(this) {
            return this.c == 0 || this.a.currentTimeInMillis() > this.b;
        }
    }

    public final void b(int v) {
        synchronized(this) {
            if((v < 200 || v >= 300) && (v != 401 && v != 404)) {
                ++this.c;
                __monitor_enter(this);
                if(v == 429 || v >= 500 && v < 600) {
                    goto label_8;
                }
                else {
                    goto label_5;
                }
                goto label_10;
            }
            goto label_13;
        }
    label_5:
        long v1 = a.d;
        __monitor_exit(this);
        goto label_10;
    label_8:
        v1 = (long)Math.min(Math.pow(2.0, this.c) + 881.0, a.e);
        __monitor_exit(this);
        try {
        label_10:
            this.b = this.a.currentTimeInMillis() + v1;
        }
        catch(Throwable throwable0) {
            __monitor_exit(this);
            throw throwable0;
        }
        __monitor_exit(this);
        return;
        try {
        label_13:
            __monitor_enter(this);
        }
        catch(Throwable throwable0) {
            __monitor_exit(this);
            throw throwable0;
        }
        this.c = 0;
        __monitor_exit(this);
        __monitor_exit(this);
    }
}

