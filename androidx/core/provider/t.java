package androidx.core.provider;

import android.os.Handler;
import java.util.concurrent.Callable;

public final class t implements Runnable {
    public final Callable a;
    public final Handler b;
    public final ReplyCallback c;

    public t(Callable callable0, Handler handler0, ReplyCallback selfDestructiveThread$ReplyCallback0) {
        this.a = callable0;
        this.b = handler0;
        this.c = selfDestructiveThread$ReplyCallback0;
    }

    @Override
    public final void run() {
        Object object0 = null;
        try {
            object0 = this.a.call();
        }
        catch(Exception unused_ex) {
        }
        s s0 = new s(this, object0);
        this.b.post(s0);
    }
}

