package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import r0.a;

public class RequestFutureTarget implements FutureTarget, RequestListener {
    public final int a;
    public final int b;
    public Object c;
    public Request d;
    public boolean e;
    public boolean f;
    public boolean g;
    public GlideException h;

    static {
    }

    public RequestFutureTarget(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public final Object a(Long long0) {
        synchronized(this) {
            if(!this.isDone()) {
                Util.assertBackgroundThread();
            }
            if(!this.e) {
                if(this.g) {
                    throw new ExecutionException(this.h);
                }
                if(this.f) {
                    return this.c;
                }
                if(long0 == null) {
                    this.wait(0L);
                }
                else if(((long)long0) > 0L) {
                    long v1 = System.currentTimeMillis();
                    long v2 = ((long)long0) + v1;
                    while(!this.isDone() && v1 < v2) {
                        this.wait(v2 - v1);
                        v1 = System.currentTimeMillis();
                    }
                }
                if(Thread.interrupted()) {
                    throw new InterruptedException();
                }
                if(this.g) {
                    throw new ExecutionException(this.h);
                }
                if(this.e) {
                    throw new CancellationException();
                }
                if(!this.f) {
                    throw new TimeoutException();
                }
                return this.c;
            }
        }
        throw new CancellationException();
    }

    @Override
    public boolean cancel(boolean z) {
        Request request0;
        synchronized(this) {
            if(this.isDone()) {
                return false;
            }
            this.e = true;
            this.notifyAll();
            request0 = null;
            if(z) {
                Request request1 = this.d;
                this.d = null;
                request0 = request1;
            }
        }
        if(request0 != null) {
            request0.clear();
        }
        return true;
    }

    @Override
    public Object get() throws InterruptedException, ExecutionException {
        try {
            return this.a(null);
        }
        catch(TimeoutException timeoutException0) {
            throw new AssertionError(timeoutException0);
        }
    }

    @Override
    public Object get(long v, @NonNull TimeUnit timeUnit0) throws InterruptedException, ExecutionException, TimeoutException {
        return this.a(timeUnit0.toMillis(v));
    }

    @Override  // com.bumptech.glide.request.target.Target
    @Nullable
    public Request getRequest() {
        synchronized(this) {
        }
        return this.d;
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void getSize(@NonNull SizeReadyCallback sizeReadyCallback0) {
        sizeReadyCallback0.onSizeReady(this.a, this.b);
    }

    @Override
    public boolean isCancelled() {
        synchronized(this) {
        }
        return this.e;
    }

    @Override
    public boolean isDone() {
        synchronized(this) {
        }
        return this.e || this.f || this.g;
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onLoadCleared(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onLoadFailed(@Nullable Drawable drawable0) {
        synchronized(this) {
        }
    }

    @Override  // com.bumptech.glide.request.RequestListener
    public boolean onLoadFailed(@Nullable GlideException glideException0, Object object0, Target target0, boolean z) {
        synchronized(this) {
            this.g = true;
            this.h = glideException0;
            this.notifyAll();
            return false;
        }
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onLoadStarted(@Nullable Drawable drawable0) {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void onResourceReady(@NonNull Object object0, @Nullable Transition transition0) {
        synchronized(this) {
        }
    }

    @Override  // com.bumptech.glide.request.RequestListener
    public boolean onResourceReady(Object object0, Object object1, Target target0, DataSource dataSource0, boolean z) {
        synchronized(this) {
            this.f = true;
            this.c = object0;
            this.notifyAll();
            return false;
        }
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void removeCallback(@NonNull SizeReadyCallback sizeReadyCallback0) {
    }

    @Override  // com.bumptech.glide.request.target.Target
    public void setRequest(@Nullable Request request0) {
        synchronized(this) {
            this.d = request0;
        }
    }

    @Override
    public String toString() {
        String s1;
        Request request0 = null;
        String s = a.o(new StringBuilder(), super.toString(), "[status=");
        synchronized(this) {
            if(this.e) {
                s1 = "CANCELLED";
            }
            else if(this.g) {
                s1 = "FAILURE";
            }
            else if(this.f) {
                s1 = "SUCCESS";
            }
            else {
                s1 = "PENDING";
                request0 = this.d;
            }
        }
        return request0 == null ? s + s1 + "]" : s + s1 + ", request=[" + request0 + "]]";
    }
}

