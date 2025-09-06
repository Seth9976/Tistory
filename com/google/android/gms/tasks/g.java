package com.google.android.gms.tasks;

import androidx.core.app.o;
import java.util.concurrent.Executor;

public final class g implements OnCanceledListener, OnFailureListener, OnSuccessListener, zzq {
    public final int a;
    public final Executor b;
    public final Object c;
    public Object d;

    public g(Executor executor0, OnCanceledListener onCanceledListener0) {
        this.a = 0;
        super();
        this.c = new Object();
        this.b = executor0;
        this.d = onCanceledListener0;
    }

    public g(Executor executor0, OnCompleteListener onCompleteListener0) {
        this.a = 1;
        super();
        this.c = new Object();
        this.b = executor0;
        this.d = onCompleteListener0;
    }

    public g(Executor executor0, OnFailureListener onFailureListener0) {
        this.a = 2;
        super();
        this.c = new Object();
        this.b = executor0;
        this.d = onFailureListener0;
    }

    public g(Executor executor0, OnSuccessListener onSuccessListener0) {
        this.a = 3;
        super();
        this.c = new Object();
        this.b = executor0;
        this.d = onSuccessListener0;
    }

    public g(Executor executor0, SuccessContinuation successContinuation0, k k0) {
        this.a = 4;
        super();
        this.b = executor0;
        this.c = successContinuation0;
        this.d = k0;
    }

    @Override  // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((k)this.d).c();
    }

    @Override  // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exception0) {
        ((k)this.d).a(exception0);
    }

    @Override  // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object object0) {
        ((k)this.d).b(object0);
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzc() {
        switch(this.a) {
            case 0: {
                synchronized(this.c) {
                    this.d = null;
                }
                return;
            }
            case 1: {
                synchronized(this.c) {
                    this.d = null;
                }
                return;
            }
            case 2: {
                synchronized(this.c) {
                    this.d = null;
                }
                return;
            }
            case 3: {
                synchronized(this.c) {
                    this.d = null;
                }
                return;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }

    @Override  // com.google.android.gms.tasks.zzq
    public final void zzd(Task task0) {
        switch(this.a) {
            case 0: {
                if(task0.isCanceled()) {
                    Object object0 = this.c;
                    synchronized(object0) {
                        if(((OnCanceledListener)this.d) == null) {
                            return;
                        }
                    }
                    f f0 = new f(this);
                    this.b.execute(f0);
                }
                return;
            }
            case 1: {
                Object object1 = this.c;
                synchronized(object1) {
                    if(((OnCompleteListener)this.d) == null) {
                        return;
                    }
                }
                o o1 = new o(this, task0, false, 13);
                this.b.execute(o1);
                return;
            }
            case 2: {
                if(!task0.isSuccessful() && !task0.isCanceled()) {
                    Object object2 = this.c;
                    synchronized(object2) {
                        if(((OnFailureListener)this.d) == null) {
                            return;
                        }
                    }
                    o o2 = new o(this, task0, false, 14);
                    this.b.execute(o2);
                }
                return;
            }
            case 3: {
                if(task0.isSuccessful()) {
                    Object object3 = this.c;
                    synchronized(object3) {
                        if(((OnSuccessListener)this.d) == null) {
                            return;
                        }
                    }
                    o o3 = new o(this, task0, false, 15);
                    this.b.execute(o3);
                }
                return;
            }
            default: {
                o o0 = new o(this, task0, false, 16);
                this.b.execute(o0);
            }
        }
    }
}

