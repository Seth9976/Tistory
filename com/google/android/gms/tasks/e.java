package com.google.android.gms.tasks;

import androidx.core.app.o;
import java.util.concurrent.Executor;

public final class e implements OnCanceledListener, OnFailureListener, OnSuccessListener, zzq {
    public final int a;
    public final Executor b;
    public final Continuation c;
    public final k d;

    public e(Executor executor0, Continuation continuation0, k k0, int v) {
        this.a = v;
        this.b = executor0;
        this.c = continuation0;
        this.d = k0;
        super();
    }

    @Override  // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        this.d.c();
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception0) {
        this.d.a(exception0);
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object object0) {
        this.d.b(object0);
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzc() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzd(Task task0) {
        if(this.a != 0) {
            o o0 = new o(this, task0, false, 12);
            this.b.execute(o0);
            return;
        }
        o o1 = new o(this, task0, false, 11);
        this.b.execute(o1);
    }
}

