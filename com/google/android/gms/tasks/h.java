package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import jeb.synthetic.FIN;

public final class h {
    public final Object a;
    public ArrayDeque b;
    public boolean c;

    public h() {
        this.a = new Object();
    }

    public final void a(zzq zzq0) {
        synchronized(this.a) {
            if(this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(zzq0);
        }
    }

    public final void b(Task task0) {
        zzq zzq0;
        int v;
        synchronized(this.a) {
            if(this.b != null && !this.c) {
                this.c = true;
                while(true) {
                    Object object1 = this.a;
                    synchronized(object1) {
                        v = FIN.finallyOpen$NT();
                        zzq0 = (zzq)this.b.poll();
                        if(zzq0 == null) {
                            break;
                        }
                        FIN.finallyCodeBegin$NT(v);
                    }
                    FIN.finallyCodeEnd$NT(v);
                    zzq0.zzd(task0);
                }
                this.c = false;
                FIN.finallyExec$NT(v);
            }
        }
    }
}

