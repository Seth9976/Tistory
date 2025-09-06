package androidx.appcompat.app;

import androidx.activity.m;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class m0 implements Executor {
    public final Object a;
    public final ArrayDeque b;
    public final n0 c;
    public Runnable d;

    public m0(n0 n00) {
        this.a = new Object();
        this.b = new ArrayDeque();
        this.c = n00;
    }

    public final void a() {
        synchronized(this.a) {
            Runnable runnable0 = (Runnable)this.b.poll();
            this.d = runnable0;
            if(runnable0 != null) {
                this.c.execute(runnable0);
            }
        }
    }

    @Override
    public final void execute(Runnable runnable0) {
        synchronized(this.a) {
            m m0 = new m(1, this, runnable0);
            this.b.add(m0);
            if(this.d == null) {
                this.a();
            }
        }
    }
}

