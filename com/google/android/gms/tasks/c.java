package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

public final class c implements zzae {
    public final Object a;
    public final int b;
    public final k c;
    public int d;
    public int e;
    public int f;
    public Exception g;
    public boolean h;

    public c(int v, k k0) {
        this.a = new Object();
        this.b = v;
        this.c = k0;
    }

    public final void a() {
        int v = this.b;
        if(this.d + this.e + this.f == v) {
            k k0 = this.c;
            if(this.g != null) {
                k0.a(new ExecutionException(this.e + " out of " + v + " underlying tasks failed", this.g));
                return;
            }
            if(this.h) {
                k0.c();
                return;
            }
            k0.b(null);
        }
    }

    @Override  // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        synchronized(this.a) {
            ++this.f;
            this.h = true;
            this.a();
        }
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exception0) {
        synchronized(this.a) {
            ++this.e;
            this.g = exception0;
            this.a();
        }
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object object0) {
        synchronized(this.a) {
            ++this.d;
            this.a();
        }
    }
}

