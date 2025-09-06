package com.google.firebase.crashlytics.internal.metadata;

import androidx.work.impl.utils.e;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public final class i {
    public final AtomicMarkableReference a;
    public final AtomicReference b;
    public final boolean c;
    public final UserMetadata d;

    public i(UserMetadata userMetadata0, boolean z) {
        this.d = userMetadata0;
        this.b = new AtomicReference(null);
        this.c = z;
        this.a = new AtomicMarkableReference(new a((z ? 0x2000 : 0x400)), false);
    }

    public final boolean a(String s, String s1) {
        synchronized(this) {
            if(!((a)this.a.getReference()).b(s, s1)) {
                return false;
            }
            a a0 = (a)this.a.getReference();
            this.a.set(a0, true);
        }
        e e0 = new e(this, 2);
        AtomicReference atomicReference0 = this.b;
        do {
            if(atomicReference0.compareAndSet(null, e0)) {
                this.d.b.submit(e0);
                return true;
            }
        }
        while(atomicReference0.get() == null);
        return true;
    }
}

