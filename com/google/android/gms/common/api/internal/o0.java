package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

public final class o0 implements zabz {
    public final int a;
    public final b b;

    public o0(b b0, int v) {
        this.a = v;
        this.b = b0;
        super();
    }

    @Override  // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult0) {
        if(this.a != 0) {
            this.b.m.lock();
            try {
                this.b.k = connectionResult0;
                b.d(this.b);
            }
            finally {
                this.b.m.unlock();
            }
            return;
        }
        this.b.m.lock();
        try {
            this.b.j = connectionResult0;
            b.d(this.b);
        }
        finally {
            this.b.m.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle0) {
        if(this.a != 0) {
            this.b.m.lock();
            try {
                this.b.k = ConnectionResult.RESULT_SUCCESS;
                b.d(this.b);
            }
            finally {
                this.b.m.unlock();
            }
            return;
        }
        b b0 = this.b;
        b0.m.lock();
        try {
            Bundle bundle1 = b0.i;
            if(bundle1 == null) {
                b0.i = bundle0;
            }
            else if(bundle0 != null) {
                bundle1.putAll(bundle0);
            }
            b0.j = ConnectionResult.RESULT_SUCCESS;
            b.d(b0);
        }
        finally {
            b0.m.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zabz
    public final void zac(int v, boolean z) {
        if(this.a != 0) {
            b b0 = this.b;
            Lock lock0 = b0.m;
            b0.m.lock();
            try {
                if(b0.l) {
                    b0.l = false;
                    b0.b.zac(v, z);
                    b0.k = null;
                    b0.j = null;
                }
                else {
                    b0.l = true;
                    b0.d.onConnectionSuspended(v);
                }
            }
            finally {
                lock0.unlock();
            }
            return;
        }
        b b1 = this.b;
        Lock lock1 = b1.m;
        b1.m.lock();
        try {
            if(b1.l || (b1.k == null || !b1.k.isSuccess())) {
                b1.l = false;
                b1.b.zac(v, z);
                b1.k = null;
                b1.j = null;
            }
            else {
                b1.l = true;
                b1.e.onConnectionSuspended(v);
            }
        }
        finally {
            lock1.unlock();
        }
    }
}

