package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.locks.Lock;

public final class s extends zaq {
    public final int a;
    public final Object b;

    public s(Object object0, Looper looper0, int v) {
        this.a = v;
        this.b = object0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        switch(this.a) {
            case 0: {
                int v2 = message0.what;
                zabe zabe0 = (zabe)this.b;
                switch(v2) {
                    case 1: {
                        Lock lock0 = zabe0.b;
                        lock0.lock();
                        try {
                            if(zabe0.c()) {
                                zabe0.e();
                            }
                        }
                        finally {
                            lock0.unlock();
                        }
                        return;
                    }
                    case 2: {
                        zabe.b(zabe0);
                        return;
                    }
                    default: {
                        Log.w("GoogleApiClientImpl", "Unknown message id: " + v2);
                        return;
                    }
                }
            }
            case 1: {
                int v4 = message0.what;
                switch(v4) {
                    case 1: {
                        u u0 = (u)message0.obj;
                        zabi zabi0 = (zabi)this.b;
                        u0.getClass();
                        zabi0.a.lock();
                        try {
                            if(zabi0.k == u0.a) {
                                u0.a();
                            }
                        }
                        finally {
                            zabi0.a.unlock();
                        }
                        return;
                    }
                    case 2: {
                        throw (RuntimeException)message0.obj;
                    }
                    default: {
                        Log.w("GACStateManager", "Unknown message id: " + v4);
                        return;
                    }
                }
            }
            default: {
                int v = message0.what;
                switch(v) {
                    case 0: {
                        PendingResult pendingResult0 = (PendingResult)message0.obj;
                        Object object0 = ((zada)this.b).e;
                        synchronized(object0) {
                            zada zada0 = (zada)Preconditions.checkNotNull(((zada)this.b).b);
                            if(pendingResult0 == null) {
                                zada0.a(new Status(13, "Transform returned null"));
                            }
                            else if(pendingResult0 instanceof zacp) {
                                zada0.a(((zacp)pendingResult0).a);
                            }
                            else {
                                zada0.zai(pendingResult0);
                            }
                        }
                        return;
                    }
                    case 1: {
                        RuntimeException runtimeException0 = (RuntimeException)message0.obj;
                        String s = runtimeException0.getMessage();
                        Log.e("TransformedResultImpl", (s.length() == 0 ? new String("Runtime exception on the transformation worker thread: ") : "Runtime exception on the transformation worker thread: " + s));
                        throw runtimeException0;
                    }
                    default: {
                        Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + v);
                    }
                }
            }
        }
    }
}

