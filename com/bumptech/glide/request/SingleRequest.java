package com.bumptech.glide.request;

import a5.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.GlideBuilder.LogRequestOrigins;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.Engine.LoadStatus;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.StateVerifier;
import java.util.List;
import java.util.concurrent.Executor;

public final class SingleRequest implements Request, ResourceCallback, SizeReadyCallback {
    public int A;
    public boolean B;
    public final RuntimeException C;
    public int D;
    public static final boolean E;
    public int a;
    public final String b;
    public final StateVerifier c;
    public final Object d;
    public final RequestListener e;
    public final RequestCoordinator f;
    public final Context g;
    public final GlideContext h;
    public final Object i;
    public final Class j;
    public final BaseRequestOptions k;
    public final int l;
    public final int m;
    public final Priority n;
    public final Target o;
    public final List p;
    public final TransitionFactory q;
    public final Executor r;
    public Resource s;
    public LoadStatus t;
    public long u;
    public volatile Engine v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public int z;

    static {
        SingleRequest.E = Log.isLoggable("GlideRequest", 2);
    }

    public SingleRequest(Context context0, GlideContext glideContext0, Object object0, Object object1, Class class0, BaseRequestOptions baseRequestOptions0, int v, int v1, Priority priority0, Target target0, RequestListener requestListener0, List list0, RequestCoordinator requestCoordinator0, Engine engine0, TransitionFactory transitionFactory0, Executor executor0) {
        this.b = SingleRequest.E ? String.valueOf(this.hashCode()) : null;
        this.c = StateVerifier.newInstance();
        this.d = object0;
        this.g = context0;
        this.h = glideContext0;
        this.i = object1;
        this.j = class0;
        this.k = baseRequestOptions0;
        this.l = v;
        this.m = v1;
        this.n = priority0;
        this.o = target0;
        this.e = requestListener0;
        this.p = list0;
        this.f = requestCoordinator0;
        this.v = engine0;
        this.q = transitionFactory0;
        this.r = executor0;
        this.D = 1;
        if(this.C == null && glideContext0.getExperiments().isEnabled(LogRequestOrigins.class)) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    public final Drawable a() {
        if(this.y == null) {
            BaseRequestOptions baseRequestOptions0 = this.k;
            Drawable drawable0 = baseRequestOptions0.getFallbackDrawable();
            this.y = drawable0;
            if(drawable0 == null && baseRequestOptions0.getFallbackId() > 0) {
                this.y = this.d(baseRequestOptions0.getFallbackId());
            }
        }
        return this.y;
    }

    public final Drawable b() {
        if(this.x == null) {
            BaseRequestOptions baseRequestOptions0 = this.k;
            Drawable drawable0 = baseRequestOptions0.getPlaceholderDrawable();
            this.x = drawable0;
            if(drawable0 == null && baseRequestOptions0.getPlaceholderId() > 0) {
                this.x = this.d(baseRequestOptions0.getPlaceholderId());
            }
        }
        return this.x;
    }

    @Override  // com.bumptech.glide.request.Request
    public void begin() {
        synchronized(this.d) {
            if(!this.B) {
                this.c.throwIfRecycled();
                this.u = LogTime.getLogTime();
                int v1 = 3;
                if(this.i == null) {
                    if(Util.isValidDimensions(this.l, this.m)) {
                        this.z = this.l;
                        this.A = this.m;
                    }
                    if(this.a() == null) {
                        v1 = 5;
                    }
                    this.f(new GlideException("Received null model"), v1);
                    return;
                }
                switch(this.D) {
                    case 2: {
                        throw new IllegalArgumentException("Cannot restart a running request");
                    }
                    case 4: {
                        this.onResourceReady(this.s, DataSource.MEMORY_CACHE, false);
                        return;
                    }
                    default: {
                        List list0 = this.p;
                        if(list0 != null) {
                            for(Object object1: list0) {
                                if(((RequestListener)object1) instanceof ExperimentalRequestListener) {
                                }
                            }
                        }
                        this.a = -1;
                        this.D = 3;
                        if(Util.isValidDimensions(this.l, this.m)) {
                            this.onSizeReady(this.l, this.m);
                        }
                        else {
                            this.o.getSize(this);
                        }
                        if((this.D == 2 || this.D == 3) && (this.f == null || this.f.canNotifyStatusChanged(this))) {
                            Drawable drawable0 = this.b();
                            this.o.onLoadStarted(drawable0);
                        }
                        if(SingleRequest.E) {
                            this.e("finished run method in " + LogTime.getElapsedMillis(this.u));
                        }
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final boolean c() {
        return this.f == null || !this.f.getRoot().isAnyResourceSet();
    }

    @Override  // com.bumptech.glide.request.Request
    public void clear() {
        synchronized(this.d) {
            if(!this.B) {
                this.c.throwIfRecycled();
                if(this.D == 6) {
                    return;
                }
                if(this.B) {
                    throw new IllegalStateException("You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.c.throwIfRecycled();
                this.o.removeCallback(this);
                LoadStatus engine$LoadStatus0 = this.t;
                Resource resource0 = null;
                if(engine$LoadStatus0 != null) {
                    engine$LoadStatus0.cancel();
                    this.t = null;
                }
                Resource resource1 = this.s;
                if(resource1 != null) {
                    this.s = null;
                    resource0 = resource1;
                }
                if(this.f == null || this.f.canNotifyCleared(this)) {
                    Drawable drawable0 = this.b();
                    this.o.onLoadCleared(drawable0);
                }
                this.D = 6;
                if(resource0 != null) {
                    this.v.release(resource0);
                }
                return;
            }
        }
        throw new IllegalStateException("You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable d(int v) {
        return this.k.getTheme() == null ? DrawableDecoderCompat.getDrawable(this.g, v, this.g.getTheme()) : DrawableDecoderCompat.getDrawable(this.g, v, this.k.getTheme());
    }

    public final void e(String s) {
        StringBuilder stringBuilder0 = b.u(s, " this: ");
        stringBuilder0.append(this.b);
        Log.v("GlideRequest", stringBuilder0.toString());
    }

    public final void f(GlideException glideException0, int v) {
        boolean z1;
        this.c.throwIfRecycled();
        synchronized(this.d) {
            glideException0.setOrigin(this.C);
            int v2 = this.h.getLogLevel();
            if(v2 <= v) {
                Log.w("Glide", "Load failed for [" + this.i + "] with dimensions [" + this.z + "x" + this.A + "]", glideException0);
                if(v2 <= 4) {
                    glideException0.logRootCauses("Glide");
                }
            }
            this.t = null;
            this.D = 5;
            RequestCoordinator requestCoordinator0 = this.f;
            if(requestCoordinator0 != null) {
                requestCoordinator0.onRequestFailed(this);
            }
            try {
                boolean z = true;
                this.B = true;
                List list0 = this.p;
                if(list0 == null) {
                    z1 = false;
                }
                else {
                    z1 = false;
                    for(Object object1: list0) {
                        boolean z2 = this.c();
                        z1 |= ((RequestListener)object1).onLoadFailed(glideException0, this.i, this.o, z2);
                    }
                }
                RequestListener requestListener0 = this.e;
                if(requestListener0 == null) {
                    z = false;
                }
                else {
                    boolean z3 = this.c();
                    if(!requestListener0.onLoadFailed(glideException0, this.i, this.o, z3)) {
                        z = false;
                    }
                }
                if(!z1 && !z) {
                    this.h();
                }
            }
            catch(Throwable throwable0) {
                this.B = false;
                throw throwable0;
            }
            this.B = false;
        }
    }

    public final void g(Resource resource0, Object object0, DataSource dataSource0) {
        boolean z2;
        boolean z = this.c();
        this.D = 4;
        this.s = resource0;
        if(this.h.getLogLevel() <= 3) {
            Log.d("Glide", "Finished loading " + object0.getClass().getSimpleName() + " from " + dataSource0 + " for " + this.i + " with size [" + this.z + "x" + this.A + "] in " + LogTime.getElapsedMillis(this.u) + " ms");
        }
        RequestCoordinator requestCoordinator0 = this.f;
        if(requestCoordinator0 != null) {
            requestCoordinator0.onRequestSuccess(this);
        }
        try {
            boolean z1 = true;
            this.B = true;
            List list0 = this.p;
            if(list0 == null) {
                z2 = false;
            }
            else {
                z2 = false;
                for(Object object1: list0) {
                    z2 |= ((RequestListener)object1).onResourceReady(object0, this.i, this.o, dataSource0, z);
                }
            }
            if(this.e == null || !this.e.onResourceReady(object0, this.i, this.o, dataSource0, z)) {
                z1 = false;
            }
            if(!z1 && !z2) {
                Transition transition0 = this.q.build(dataSource0, z);
                this.o.onResourceReady(object0, transition0);
            }
        }
        finally {
            this.B = false;
        }
    }

    @Override  // com.bumptech.glide.request.ResourceCallback
    public Object getLock() {
        this.c.throwIfRecycled();
        return this.d;
    }

    public final void h() {
        if(this.f != null && !this.f.canNotifyStatusChanged(this)) {
            return;
        }
        Drawable drawable0 = this.i == null ? this.a() : null;
        if(drawable0 == null) {
            if(this.w == null) {
                BaseRequestOptions baseRequestOptions0 = this.k;
                Drawable drawable1 = baseRequestOptions0.getErrorPlaceholder();
                this.w = drawable1;
                if(drawable1 == null && baseRequestOptions0.getErrorId() > 0) {
                    this.w = this.d(baseRequestOptions0.getErrorId());
                }
            }
            drawable0 = this.w;
        }
        if(drawable0 == null) {
            drawable0 = this.b();
        }
        this.o.onLoadFailed(drawable0);
    }

    @Override  // com.bumptech.glide.request.Request
    public boolean isAnyResourceSet() {
        synchronized(this.d) {
        }
        return this.D == 4;
    }

    @Override  // com.bumptech.glide.request.Request
    public boolean isCleared() {
        synchronized(this.d) {
        }
        return this.D == 6;
    }

    @Override  // com.bumptech.glide.request.Request
    public boolean isComplete() {
        synchronized(this.d) {
        }
        return this.D == 4;
    }

    @Override  // com.bumptech.glide.request.Request
    public boolean isEquivalentTo(Request request0) {
        List list0;
        if(!(request0 instanceof SingleRequest)) {
            return false;
        }
        synchronized(this.d) {
        }
        synchronized(((SingleRequest)request0).d) {
            list0 = ((SingleRequest)request0).p;
        }
        return this.l == ((SingleRequest)request0).l && this.m == ((SingleRequest)request0).m && Util.bothModelsNullEquivalentOrEquals(this.i, ((SingleRequest)request0).i) && this.j.equals(((SingleRequest)request0).j) && this.k.equals(((SingleRequest)request0).k) && this.n == ((SingleRequest)request0).n && (this.p == null ? 0 : this.p.size()) == (list0 == null ? 0 : list0.size());
    }

    @Override  // com.bumptech.glide.request.Request
    public boolean isRunning() {
        synchronized(this.d) {
        }
        return this.D == 2 || this.D == 3;
    }

    public static SingleRequest obtain(Context context0, GlideContext glideContext0, Object object0, Object object1, Class class0, BaseRequestOptions baseRequestOptions0, int v, int v1, Priority priority0, Target target0, RequestListener requestListener0, @Nullable List list0, RequestCoordinator requestCoordinator0, Engine engine0, TransitionFactory transitionFactory0, Executor executor0) {
        return new SingleRequest(context0, glideContext0, object0, object1, class0, baseRequestOptions0, v, v1, priority0, target0, requestListener0, list0, requestCoordinator0, engine0, transitionFactory0, executor0);
    }

    @Override  // com.bumptech.glide.request.ResourceCallback
    public void onLoadFailed(GlideException glideException0) {
        this.f(glideException0, 5);
    }

    @Override  // com.bumptech.glide.request.ResourceCallback
    public void onResourceReady(Resource resource0, DataSource dataSource0, boolean z) {
        Object object1;
        Object object0;
        this.c.throwIfRecycled();
        Resource resource1 = null;
        try {
            object0 = this.d;
            __monitor_enter(object0);
        }
        catch(Throwable throwable0) {
            goto label_49;
        }
        try {
            this.t = null;
            if(resource0 == null) {
                this.onLoadFailed(new GlideException("Expected to receive a Resource<R> with an object of " + this.j + " inside, but instead got null."));
                __monitor_exit(object0);
                return;
            }
            object1 = resource0.get();
            if(object1 != null) {
                Class class0 = object1.getClass();
                if(this.j.isAssignableFrom(class0)) {
                    if(this.f == null || this.f.canSetImage(this)) {
                        this.g(resource0, object1, dataSource0);
                        __monitor_exit(object0);
                        return;
                    }
                    goto label_17;
                }
            }
            goto label_22;
        }
        catch(Throwable throwable1) {
            goto label_46;
        }
        try {
        label_17:
            this.s = null;
            this.D = 4;
            __monitor_exit(object0);
        }
        catch(Throwable throwable2) {
            goto label_41;
        }
        this.v.release(resource0);
        return;
        try {
        label_22:
            this.s = null;
            StringBuilder stringBuilder0 = new StringBuilder("Expected to receive an object of ");
            stringBuilder0.append(this.j);
            stringBuilder0.append(" but instead got ");
            Class class1 = object1 == null ? "" : object1.getClass();
            stringBuilder0.append(class1);
            stringBuilder0.append("{");
            stringBuilder0.append(object1);
            stringBuilder0.append("} inside Resource{");
            stringBuilder0.append(resource0);
            stringBuilder0.append("}.");
            stringBuilder0.append((object1 == null ? " To indicate failure return a null Resource object, rather than a Resource object containing null data." : ""));
            this.onLoadFailed(new GlideException(stringBuilder0.toString()));
            __monitor_exit(object0);
            goto label_52;
        }
        catch(Throwable throwable2) {
        label_41:
            resource1 = resource0;
            throwable1 = throwable2;
            try {
                while(true) {
                    __monitor_exit(object0);
                    break;
                label_46:
                }
            }
            catch(Throwable throwable1) {
                goto label_46;
            }
        }
        try {
            throw throwable1;
        }
        catch(Throwable throwable0) {
        label_49:
            if(resource1 != null) {
                this.v.release(resource1);
            }
            throw throwable0;
        }
    label_52:
        this.v.release(resource0);
    }

    @Override  // com.bumptech.glide.request.target.SizeReadyCallback
    public void onSizeReady(int v, int v1) {
        this.c.throwIfRecycled();
        synchronized(this.d) {
            boolean z = SingleRequest.E;
            if(z) {
                this.e("Got onSizeReady in " + LogTime.getElapsedMillis(this.u));
            }
            if(this.D != 3) {
                return;
            }
            this.D = 2;
            float f = this.k.getSizeMultiplier();
            if(v != 0x80000000) {
                v = Math.round(((float)v) * f);
            }
            this.z = v;
            this.A = v1 == 0x80000000 ? 0x80000000 : Math.round(f * ((float)v1));
            if(z) {
                this.e("finished setup for calling load in " + LogTime.getElapsedMillis(this.u));
            }
            this.t = this.v.load(this.h, this.i, this.k.getSignature(), this.z, this.A, this.k.getResourceClass(), this.j, this.n, this.k.getDiskCacheStrategy(), this.k.getTransformations(), this.k.isTransformationRequired(), this.k.E, this.k.getOptions(), this.k.isMemoryCacheable(), this.k.getUseUnlimitedSourceGeneratorsPool(), this.k.getUseAnimationPool(), this.k.getOnlyRetrieveFromCache(), this, this.r);
            if(this.D != 2) {
                this.t = null;
            }
            if(z) {
                this.e("finished onSizeReady in " + LogTime.getElapsedMillis(this.u));
            }
        }
    }

    @Override  // com.bumptech.glide.request.Request
    public void pause() {
        synchronized(this.d) {
            if(this.isRunning()) {
                this.clear();
            }
        }
    }

    @Override
    public String toString() {
        synchronized(this.d) {
        }
        return super.toString() + "[model=" + this.i + ", transcodeClass=" + this.j + "]";
    }
}

