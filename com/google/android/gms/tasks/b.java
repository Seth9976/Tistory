package com.google.android.gms.tasks;

import java.util.concurrent.CountDownLatch;

public final class b implements OnSuccessListener, OnTokenCanceledListener, zzae {
    public final int a;
    public final Object b;

    public b() {
        this.a = 0;
        super();
        this.b = new CountDownLatch(1);
    }

    public b(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // com.google.android.gms.tasks.OnTokenCanceledListener, com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        if(this.a != 0) {
            ((TaskCompletionSource)this.b).a.c();
            return;
        }
        ((CountDownLatch)this.b).countDown();
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception0) {
        ((CountDownLatch)this.b).countDown();
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object object0) {
        if(this.a != 0) {
            Void void0 = (Void)object0;
            ((OnTokenCanceledListener)this.b).onCanceled();
            return;
        }
        ((CountDownLatch)this.b).countDown();
    }
}

