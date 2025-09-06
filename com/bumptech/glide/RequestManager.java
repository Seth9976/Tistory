package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.widget.a;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class RequestManager implements ComponentCallbacks2, ModelTypes, LifecycleListener {
    public final Lifecycle a;
    public final RequestTracker b;
    public final RequestManagerTreeNode c;
    protected final Context context;
    public final TargetTracker d;
    public final a e;
    public final ConnectivityMonitor f;
    public final CopyOnWriteArrayList g;
    protected final Glide glide;
    public RequestOptions h;
    public boolean i;
    public static final RequestOptions j;
    public static final RequestOptions k;
    public static final RequestOptions l;

    static {
        RequestManager.j = (RequestOptions)RequestOptions.decodeTypeOf(Bitmap.class).lock();
        RequestManager.k = (RequestOptions)RequestOptions.decodeTypeOf(GifDrawable.class).lock();
        RequestManager.l = (RequestOptions)((RequestOptions)RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.DATA).priority(Priority.LOW)).skipMemoryCache(true);
    }

    public RequestManager(@NonNull Glide glide0, @NonNull Lifecycle lifecycle0, @NonNull RequestManagerTreeNode requestManagerTreeNode0, @NonNull Context context0) {
        RequestTracker requestTracker0 = new RequestTracker();
        super();
        this.d = new TargetTracker();
        a a0 = new a(this, 6);
        this.e = a0;
        this.glide = glide0;
        this.a = lifecycle0;
        this.c = requestManagerTreeNode0;
        this.b = requestTracker0;
        this.context = context0;
        Context context1 = context0.getApplicationContext();
        l l0 = new l(this, requestTracker0);
        ConnectivityMonitor connectivityMonitor0 = glide0.g.build(context1, l0);
        this.f = connectivityMonitor0;
        synchronized(glide0.h) {
            if(!glide0.h.contains(this)) {
                glide0.h.add(this);
                if(Util.isOnBackgroundThread()) {
                    Util.postOnUiThread(a0);
                }
                else {
                    lifecycle0.addListener(this);
                }
                lifecycle0.addListener(connectivityMonitor0);
                this.g = new CopyOnWriteArrayList(glide0.d.getDefaultRequestListeners());
                this.setRequestOptions(glide0.d.getDefaultRequestOptions());
                return;
            }
        }
        throw new IllegalStateException("Cannot register already registered manager");
    }

    public final boolean a(Target target0) {
        synchronized(this) {
            Request request0 = target0.getRequest();
            if(request0 == null) {
                return true;
            }
            if(this.b.clearAndRemove(request0)) {
                this.d.untrack(target0);
                target0.setRequest(null);
                return true;
            }
            return false;
        }
    }

    public RequestManager addDefaultRequestListener(RequestListener requestListener0) {
        this.g.add(requestListener0);
        return this;
    }

    @NonNull
    public RequestManager applyDefaultRequestOptions(@NonNull RequestOptions requestOptions0) {
        synchronized(this) {
            synchronized(this) {
                this.h = (RequestOptions)this.h.apply(requestOptions0);
            }
        }
        return this;
    }

    @CheckResult
    @NonNull
    public RequestBuilder as(@NonNull Class class0) {
        return new RequestBuilder(this.glide, this, class0, this.context);
    }

    @CheckResult
    @NonNull
    public RequestBuilder asBitmap() {
        return this.as(Bitmap.class).apply(RequestManager.j);
    }

    @CheckResult
    @NonNull
    public RequestBuilder asDrawable() {
        return this.as(Drawable.class);
    }

    @CheckResult
    @NonNull
    public RequestBuilder asFile() {
        return this.as(File.class).apply(RequestOptions.skipMemoryCacheOf(true));
    }

    @CheckResult
    @NonNull
    public RequestBuilder asGif() {
        return this.as(GifDrawable.class).apply(RequestManager.k);
    }

    public void clear(@NonNull View view0) {
        this.clear(new k(0, view0));
    }

    public void clear(@Nullable Target target0) {
        if(target0 == null) {
            return;
        }
        boolean z = this.a(target0);
        Request request0 = target0.getRequest();
        if(!z) {
            synchronized(this.glide.h) {
                for(Object object0: this.glide.h) {
                    if(((RequestManager)object0).a(target0)) {
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(request0 != null) {
                target0.setRequest(null);
                request0.clear();
            }
        }
    }

    @CheckResult
    @NonNull
    public RequestBuilder download(@Nullable Object object0) {
        return this.downloadOnly().load(object0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder downloadOnly() {
        return this.as(File.class).apply(RequestManager.l);
    }

    public boolean isPaused() {
        synchronized(this) {
        }
        return this.b.isPaused();
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Bitmap bitmap0) {
        return this.asDrawable().load(bitmap0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Drawable drawable0) {
        return this.asDrawable().load(drawable0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Uri uri0) {
        return this.asDrawable().load(uri0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable File file0) {
        return this.asDrawable().load(file0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.asDrawable().load(integer0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Object object0) {
        return this.asDrawable().load(object0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable String s) {
        return this.asDrawable().load(s);
    }

    @CheckResult
    @Deprecated
    public RequestBuilder load(@Nullable URL uRL0) {
        return this.asDrawable().load(uRL0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable byte[] arr_b) {
        return this.asDrawable().load(arr_b);
    }

    @Override  // com.bumptech.glide.ModelTypes
    @CheckResult
    @NonNull
    public Object load(@Nullable Bitmap bitmap0) {
        return this.load(bitmap0);
    }

    @Override  // com.bumptech.glide.ModelTypes
    @CheckResult
    @NonNull
    public Object load(@Nullable Drawable drawable0) {
        return this.load(drawable0);
    }

    @Override  // com.bumptech.glide.ModelTypes
    @CheckResult
    @NonNull
    public Object load(@Nullable Uri uri0) {
        return this.load(uri0);
    }

    @Override  // com.bumptech.glide.ModelTypes
    @CheckResult
    @NonNull
    public Object load(@Nullable File file0) {
        return this.load(file0);
    }

    @Override  // com.bumptech.glide.ModelTypes
    @CheckResult
    @NonNull
    public Object load(@DrawableRes @Nullable @RawRes Integer integer0) {
        return this.load(integer0);
    }

    @Override  // com.bumptech.glide.ModelTypes
    @CheckResult
    @NonNull
    public Object load(@Nullable Object object0) {
        return this.load(object0);
    }

    @Override  // com.bumptech.glide.ModelTypes
    @CheckResult
    @NonNull
    public Object load(@Nullable String s) {
        return this.load(s);
    }

    @Override  // com.bumptech.glide.ModelTypes
    @CheckResult
    @Deprecated
    public Object load(@Nullable URL uRL0) {
        return this.load(uRL0);
    }

    @Override  // com.bumptech.glide.ModelTypes
    @CheckResult
    @NonNull
    public Object load(@Nullable byte[] arr_b) {
        return this.load(arr_b);
    }

    @Override  // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration0) {
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onDestroy() {
        synchronized(this) {
            this.d.onDestroy();
            for(Object object0: this.d.getAll()) {
                this.clear(((Target)object0));
            }
            this.d.clear();
            this.b.clearRequests();
            this.a.removeListener(this);
            this.a.removeListener(this.f);
            Util.removeCallbacksOnUiThread(this.e);
            Glide glide0 = this.glide;
            ArrayList arrayList0 = glide0.h;
            synchronized(arrayList0) {
                if(!glide0.h.contains(this)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                glide0.h.remove(this);
            }
        }
    }

    @Override  // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onStart() {
        synchronized(this) {
            this.resumeRequests();
            this.d.onStart();
        }
    }

    @Override  // com.bumptech.glide.manager.LifecycleListener
    public void onStop() {
        synchronized(this) {
            this.pauseRequests();
            this.d.onStop();
        }
    }

    @Override  // android.content.ComponentCallbacks2
    public void onTrimMemory(int v) {
        if(v == 60 && this.i) {
            this.pauseAllRequestsRecursive();
        }
    }

    public void pauseAllRequests() {
        synchronized(this) {
            this.b.pauseAllRequests();
        }
    }

    public void pauseAllRequestsRecursive() {
        synchronized(this) {
            this.pauseAllRequests();
            for(Object object0: this.c.getDescendants()) {
                ((RequestManager)object0).pauseAllRequests();
            }
        }
    }

    public void pauseRequests() {
        synchronized(this) {
            this.b.pauseRequests();
        }
    }

    public void pauseRequestsRecursive() {
        synchronized(this) {
            this.pauseRequests();
            for(Object object0: this.c.getDescendants()) {
                ((RequestManager)object0).pauseRequests();
            }
        }
    }

    public void resumeRequests() {
        synchronized(this) {
            this.b.resumeRequests();
        }
    }

    public void resumeRequestsRecursive() {
        synchronized(this) {
            Util.assertMainThread();
            this.resumeRequests();
            for(Object object0: this.c.getDescendants()) {
                ((RequestManager)object0).resumeRequests();
            }
        }
    }

    @NonNull
    public RequestManager setDefaultRequestOptions(@NonNull RequestOptions requestOptions0) {
        synchronized(this) {
            this.setRequestOptions(requestOptions0);
            return this;
        }
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z) {
        this.i = z;
    }

    public void setRequestOptions(@NonNull RequestOptions requestOptions0) {
        synchronized(this) {
            this.h = (RequestOptions)((RequestOptions)requestOptions0.clone()).autoClone();
        }
    }

    @Override
    public String toString() {
        synchronized(this) {
        }
        return super.toString() + "{tracker=" + this.b + ", treeNode=" + this.c + "}";
    }
}

