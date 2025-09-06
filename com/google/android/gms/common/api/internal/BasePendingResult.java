package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zaq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
@KeepName
public abstract class BasePendingResult extends PendingResult {
    @VisibleForTesting
    public static class CallbackHandler extends zaq {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        public CallbackHandler(@NonNull Looper looper0) {
            super(looper0);
        }

        @Override  // android.os.Handler
        public final void handleMessage(@NonNull Message message0) {
            int v = message0.what;
            switch(v) {
                case 1: {
                    Pair pair0 = (Pair)message0.obj;
                    ResultCallback resultCallback0 = (ResultCallback)pair0.first;
                    Result result0 = (Result)pair0.second;
                    try {
                        resultCallback0.onResult(result0);
                        return;
                    }
                    catch(RuntimeException runtimeException0) {
                        BasePendingResult.zal(result0);
                        throw runtimeException0;
                    }
                }
                case 2: {
                    ((BasePendingResult)message0.obj).forceFailureUnlessReady(Status.RESULT_TIMEOUT);
                    return;
                }
                default: {
                    Log.wtf("BasePendingResult", "Don\'t know how to handle message: " + v, new Exception());
                }
            }
        }

        public final void zaa(@NonNull ResultCallback resultCallback0, @NonNull Result result0) {
            this.sendMessage(this.obtainMessage(1, new Pair(((ResultCallback)Preconditions.checkNotNull(resultCallback0)), result0)));
        }
    }

    public final Object a;
    public final CountDownLatch b;
    public final ArrayList c;
    public ResultCallback d;
    public final AtomicReference e;
    public Result f;
    public Status g;
    public volatile boolean h;
    public boolean i;
    public boolean j;
    public ICancelToken k;
    public volatile zada l;
    public boolean m;
    @KeepName
    private n0 mResultGuardian;
    public static final m0 n;
    @NonNull
    protected final CallbackHandler zab;
    @NonNull
    protected final WeakReference zac;
    public static final int zad;

    static {
        BasePendingResult.n = new m0(0);
    }

    @KeepForSdk
    @Deprecated
    public BasePendingResult(@NonNull Looper looper0) {
        this.a = new Object();
        this.b = new CountDownLatch(1);
        this.c = new ArrayList();
        this.e = new AtomicReference();
        this.m = false;
        this.zab = new CallbackHandler(looper0);
        this.zac = new WeakReference(null);
    }

    @KeepForSdk
    public BasePendingResult(@Nullable GoogleApiClient googleApiClient0) {
        this.a = new Object();
        this.b = new CountDownLatch(1);
        this.c = new ArrayList();
        this.e = new AtomicReference();
        this.m = false;
        this.zab = new CallbackHandler((googleApiClient0 == null ? Looper.getMainLooper() : googleApiClient0.getLooper()));
        this.zac = new WeakReference(googleApiClient0);
    }

    @KeepForSdk
    @VisibleForTesting
    public BasePendingResult(@NonNull CallbackHandler basePendingResult$CallbackHandler0) {
        this.a = new Object();
        this.b = new CountDownLatch(1);
        this.c = new ArrayList();
        this.e = new AtomicReference();
        this.m = false;
        this.zab = (CallbackHandler)Preconditions.checkNotNull(basePendingResult$CallbackHandler0, "CallbackHandler must not be null");
        this.zac = new WeakReference(null);
    }

    public final Result a() {
        Result result0;
        synchronized(this.a) {
            Preconditions.checkState(!this.h, "Result has already been consumed.");
            Preconditions.checkState(this.isReady(), "Result is not ready.");
            result0 = this.f;
            this.f = null;
            this.d = null;
            this.h = true;
        }
        h0 h00 = (h0)this.e.getAndSet(null);
        if(h00 != null) {
            h00.a.a.remove(this);
        }
        return (Result)Preconditions.checkNotNull(result0);
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@NonNull StatusListener pendingResult$StatusListener0) {
        Preconditions.checkArgument(pendingResult$StatusListener0 != null, "Callback cannot be null.");
        synchronized(this.a) {
            if(this.isReady()) {
                pendingResult$StatusListener0.onComplete(this.g);
            }
            else {
                this.c.add(pendingResult$StatusListener0);
            }
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final Result await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        boolean z = true;
        Preconditions.checkState(!this.h, "Result has already been consumed");
        if(this.l != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            this.b.await();
        }
        catch(InterruptedException unused_ex) {
            this.forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(this.isReady(), "Result is not ready.");
        return this.a();
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final Result await(long v, @NonNull TimeUnit timeUnit0) {
        if(v > 0L) {
            Preconditions.checkNotMainThread("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        Preconditions.checkState(!this.h, "Result has already been consumed.");
        if(this.l != null) {
            z = false;
        }
        Preconditions.checkState(z, "Cannot await if then() has been called.");
        try {
            if(!this.b.await(v, timeUnit0)) {
                this.forceFailureUnlessReady(Status.RESULT_TIMEOUT);
            }
        }
        catch(InterruptedException unused_ex) {
            this.forceFailureUnlessReady(Status.RESULT_INTERRUPTED);
        }
        Preconditions.checkState(this.isReady(), "Result is not ready.");
        return this.a();
    }

    public final void b(Result result0) {
        this.f = result0;
        this.g = result0.getStatus();
        this.k = null;
        this.b.countDown();
        if(this.i) {
            this.d = null;
        }
        else {
            ResultCallback resultCallback0 = this.d;
            if(resultCallback0 != null) {
                this.zab.removeMessages(2);
                Result result1 = this.a();
                this.zab.zaa(resultCallback0, result1);
            }
            else if(this.f instanceof Releasable) {
                this.mResultGuardian = new n0(this);
            }
        }
        ArrayList arrayList0 = this.c;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((StatusListener)arrayList0.get(v1)).onComplete(this.g);
        }
        arrayList0.clear();
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public void cancel() {
        synchronized(this.a) {
            if(!this.i && !this.h) {
                ICancelToken iCancelToken0 = this.k;
                if(iCancelToken0 != null) {
                    try {
                        iCancelToken0.cancel();
                    }
                    catch(RemoteException unused_ex) {
                    }
                }
                BasePendingResult.zal(this.f);
                this.i = true;
                this.b(this.createFailedResult(Status.RESULT_CANCELED));
            }
        }
    }

    @NonNull
    @KeepForSdk
    public abstract Result createFailedResult(@NonNull Status arg1);

    @KeepForSdk
    @Deprecated
    public final void forceFailureUnlessReady(@NonNull Status status0) {
        synchronized(this.a) {
            if(!this.isReady()) {
                this.setResult(this.createFailedResult(status0));
                this.j = true;
            }
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        synchronized(this.a) {
        }
        return this.i;
    }

    @KeepForSdk
    public final boolean isReady() {
        return this.b.getCount() == 0L;
    }

    @KeepForSdk
    public final void setCancelToken(@NonNull ICancelToken iCancelToken0) {
        synchronized(this.a) {
            this.k = iCancelToken0;
        }
    }

    @KeepForSdk
    public final void setResult(@NonNull Result result0) {
        synchronized(this.a) {
            if(!this.j && !this.i) {
                this.isReady();
                Preconditions.checkState(!this.isReady(), "Results have already been set");
                Preconditions.checkState(!this.h, "Result has already been consumed");
                this.b(result0);
                return;
            }
            BasePendingResult.zal(result0);
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(@Nullable ResultCallback resultCallback0) {
        synchronized(this.a) {
            if(resultCallback0 == null) {
                this.d = null;
                return;
            }
            boolean z = true;
            Preconditions.checkState(!this.h, "Result has already been consumed.");
            if(this.l != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
            if(this.isCanceled()) {
                return;
            }
            if(this.isReady()) {
                Result result0 = this.a();
                this.zab.zaa(resultCallback0, result0);
            }
            else {
                this.d = resultCallback0;
            }
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @KeepForSdk
    public final void setResultCallback(@NonNull ResultCallback resultCallback0, long v, @NonNull TimeUnit timeUnit0) {
        synchronized(this.a) {
            if(resultCallback0 == null) {
                this.d = null;
                return;
            }
            boolean z = true;
            Preconditions.checkState(!this.h, "Result has already been consumed.");
            if(this.l != null) {
                z = false;
            }
            Preconditions.checkState(z, "Cannot set callbacks if then() has been called.");
            if(this.isCanceled()) {
                return;
            }
            if(this.isReady()) {
                Result result0 = this.a();
                this.zab.zaa(resultCallback0, result0);
            }
            else {
                this.d = resultCallback0;
                long v2 = timeUnit0.toMillis(v);
                Message message0 = this.zab.obtainMessage(2, this);
                this.zab.sendMessageDelayed(message0, v2);
            }
        }
    }

    @Override  // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final TransformedResult then(@NonNull ResultTransform resultTransform0) {
        boolean z = false;
        Preconditions.checkState(!this.h, "Result has already been consumed.");
        synchronized(this.a) {
            Preconditions.checkState(this.l == null, "Cannot call then() twice.");
            if(this.d == null) {
                z = true;
            }
            Preconditions.checkState(z, "Cannot call then() if callbacks are set.");
            Preconditions.checkState(!this.i, "Cannot call then() if result was canceled.");
            this.m = true;
            this.l = new zada(this.zac);
            TransformedResult transformedResult0 = this.l.then(resultTransform0);
            if(this.isReady()) {
                zada zada0 = this.l;
                Result result0 = this.a();
                this.zab.zaa(zada0, result0);
            }
            else {
                this.d = this.l;
            }
            return transformedResult0;
        }
    }

    public final void zak() {
        this.m = this.m || ((Boolean)BasePendingResult.n.get()).booleanValue();
    }

    public static void zal(@Nullable Result result0) {
        if(result0 instanceof Releasable) {
            try {
                ((Releasable)result0).release();
            }
            catch(RuntimeException runtimeException0) {
                Log.w("BasePendingResult", "Unable to release " + result0, runtimeException0);
            }
        }
    }

    public final boolean zam() {
        synchronized(this.a) {
            if(((GoogleApiClient)this.zac.get()) == null || !this.m) {
                this.cancel();
            }
        }
        return this.isCanceled();
    }

    public final void zan(@Nullable h0 h00) {
        this.e.set(h00);
    }
}

