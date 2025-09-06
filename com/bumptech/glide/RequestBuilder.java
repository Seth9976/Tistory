package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.ErrorRequestCoordinator;
import com.bumptech.glide.request.FutureTarget;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestCoordinator;
import com.bumptech.glide.request.RequestFutureTarget;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.request.ThumbnailRequestCoordinator;
import com.bumptech.glide.request.target.PreloadTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.signature.AndroidResourceSignature;
import com.bumptech.glide.util.Executors;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public class RequestBuilder extends BaseRequestOptions implements ModelTypes, Cloneable {
    protected static final RequestOptions DOWNLOAD_ONLY_OPTIONS;
    public final Context G;
    public final RequestManager H;
    public final Class I;
    public final Glide J;
    public final GlideContext K;
    public TransitionOptions L;
    public Object M;
    public ArrayList N;
    public RequestBuilder O;
    public RequestBuilder P;
    public Float Q;
    public boolean R;
    public boolean S;
    public boolean T;

    static {
        RequestBuilder.DOWNLOAD_ONLY_OPTIONS = (RequestOptions)((RequestOptions)((RequestOptions)new RequestOptions().diskCacheStrategy(DiskCacheStrategy.DATA)).priority(Priority.LOW)).skipMemoryCache(true);
    }

    @SuppressLint({"CheckResult"})
    public RequestBuilder(@NonNull Glide glide0, RequestManager requestManager0, Class class0, Context context0) {
        this.R = true;
        this.J = glide0;
        this.H = requestManager0;
        this.I = class0;
        this.G = context0;
        this.L = requestManager0.glide.d.getDefaultTransitionOptions(class0);
        this.K = glide0.d;
        for(Object object0: requestManager0.g) {
            this.addListener(((RequestListener)object0));
        }
        this.apply(requestManager0.h);
    }

    @SuppressLint({"CheckResult"})
    public RequestBuilder(Class class0, RequestBuilder requestBuilder0) {
        this(requestBuilder0.J, requestBuilder0.H, class0, requestBuilder0.G);
        this.M = requestBuilder0.M;
        this.S = requestBuilder0.S;
        this.apply(requestBuilder0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder addListener(@Nullable RequestListener requestListener0) {
        if(this.isAutoCloneEnabled()) {
            return this.clone().addListener(requestListener0);
        }
        if(requestListener0 != null) {
            if(this.N == null) {
                this.N = new ArrayList();
            }
            this.N.add(requestListener0);
        }
        return (RequestBuilder)this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestBuilder apply(@NonNull BaseRequestOptions baseRequestOptions0) {
        Preconditions.checkNotNull(baseRequestOptions0);
        return (RequestBuilder)super.apply(baseRequestOptions0);
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    @NonNull
    public BaseRequestOptions apply(@NonNull BaseRequestOptions baseRequestOptions0) {
        return this.apply(baseRequestOptions0);
    }

    @CheckResult
    public RequestBuilder clone() {
        RequestBuilder requestBuilder0 = (RequestBuilder)super.clone();
        requestBuilder0.L = requestBuilder0.L.clone();
        if(requestBuilder0.N != null) {
            requestBuilder0.N = new ArrayList(requestBuilder0.N);
        }
        RequestBuilder requestBuilder1 = requestBuilder0.O;
        if(requestBuilder1 != null) {
            requestBuilder0.O = requestBuilder1.clone();
        }
        RequestBuilder requestBuilder2 = requestBuilder0.P;
        if(requestBuilder2 != null) {
            requestBuilder0.P = requestBuilder2.clone();
        }
        return requestBuilder0;
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    public BaseRequestOptions clone() {
        return this.clone();
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    @CheckResult
    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @CheckResult
    @Deprecated
    public FutureTarget downloadOnly(int v, int v1) {
        return this.getDownloadOnlyRequest().submit(v, v1);
    }

    @CheckResult
    @Deprecated
    public Target downloadOnly(@NonNull Target target0) {
        return this.getDownloadOnlyRequest().into(target0);
    }

    // 去混淆评级： 中等(90)
    @Override  // com.bumptech.glide.request.BaseRequestOptions
    public boolean equals(Object object0) {
        return object0 instanceof RequestBuilder && super.equals(((RequestBuilder)object0)) && Objects.equals(this.I, ((RequestBuilder)object0).I) && this.L.equals(((RequestBuilder)object0).L) && Objects.equals(this.M, ((RequestBuilder)object0).M) && Objects.equals(this.N, ((RequestBuilder)object0).N) && Objects.equals(this.O, ((RequestBuilder)object0).O) && Objects.equals(this.P, ((RequestBuilder)object0).P) && Objects.equals(this.Q, ((RequestBuilder)object0).Q) && this.R == ((RequestBuilder)object0).R && this.S == ((RequestBuilder)object0).S;
    }

    @NonNull
    public RequestBuilder error(@Nullable RequestBuilder requestBuilder0) {
        if(this.isAutoCloneEnabled()) {
            return this.clone().error(requestBuilder0);
        }
        this.P = requestBuilder0;
        return (RequestBuilder)this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestBuilder error(Object object0) {
        return object0 == null ? this.error(null) : this.error(this.clone().error(null).thumbnail(null).load(object0));
    }

    @CheckResult
    @NonNull
    public RequestBuilder getDownloadOnlyRequest() {
        return new RequestBuilder(File.class, this).apply(RequestBuilder.DOWNLOAD_ONLY_OPTIONS);
    }

    public final Request h(int v, int v1, Priority priority0, TransitionOptions transitionOptions0, BaseRequestOptions baseRequestOptions0, RequestCoordinator requestCoordinator0, RequestFutureTarget requestFutureTarget0, Target target0, Object object0, Executor executor0) {
        Request request1;
        Request request0;
        RequestCoordinator requestCoordinator1;
        if(this.P == null) {
            request0 = null;
            requestCoordinator1 = requestCoordinator0;
        }
        else {
            requestCoordinator1 = new ErrorRequestCoordinator(object0, requestCoordinator0);
            request0 = requestCoordinator1;
        }
        RequestBuilder requestBuilder0 = this.O;
        if(requestBuilder0 != null) {
            if(this.T) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            TransitionOptions transitionOptions1 = requestBuilder0.R ? transitionOptions0 : requestBuilder0.L;
            Priority priority1 = requestBuilder0.isPrioritySet() ? this.O.getPriority() : this.i(priority0);
            int v2 = this.O.getOverrideWidth();
            int v3 = this.O.getOverrideHeight();
            if(Util.isValidDimensions(v, v1) && !this.O.isValidOverride()) {
                v2 = baseRequestOptions0.getOverrideWidth();
                v3 = baseRequestOptions0.getOverrideHeight();
            }
            ThumbnailRequestCoordinator thumbnailRequestCoordinator0 = new ThumbnailRequestCoordinator(object0, requestCoordinator1);
            request1 = thumbnailRequestCoordinator0;
            SingleRequest singleRequest0 = this.l(v, v1, priority0, transitionOptions0, baseRequestOptions0, thumbnailRequestCoordinator0, requestFutureTarget0, target0, object0, executor0);
            this.T = true;
            Request request2 = this.O.h(v2, v3, priority1, transitionOptions1, this.O, ((RequestCoordinator)request1), requestFutureTarget0, target0, object0, executor0);
            this.T = false;
            ((ThumbnailRequestCoordinator)request1).setRequests(singleRequest0, request2);
        }
        else if(this.Q != null) {
            ThumbnailRequestCoordinator thumbnailRequestCoordinator1 = new ThumbnailRequestCoordinator(object0, requestCoordinator1);
            SingleRequest singleRequest1 = this.l(v, v1, priority0, transitionOptions0, baseRequestOptions0, thumbnailRequestCoordinator1, requestFutureTarget0, target0, object0, executor0);
            BaseRequestOptions baseRequestOptions1 = baseRequestOptions0.clone().sizeMultiplier(((float)this.Q));
            thumbnailRequestCoordinator1.setRequests(singleRequest1, this.l(v, v1, this.i(priority0), transitionOptions0, baseRequestOptions1, thumbnailRequestCoordinator1, requestFutureTarget0, target0, object0, executor0));
            request1 = thumbnailRequestCoordinator1;
        }
        else {
            request1 = this.l(v, v1, priority0, transitionOptions0, baseRequestOptions0, requestCoordinator1, requestFutureTarget0, target0, object0, executor0);
        }
        if(request0 == null) {
            return request1;
        }
        int v4 = this.P.getOverrideWidth();
        int v5 = this.P.getOverrideHeight();
        if(Util.isValidDimensions(v, v1) && !this.P.isValidOverride()) {
            v4 = baseRequestOptions0.getOverrideWidth();
            v5 = baseRequestOptions0.getOverrideHeight();
        }
        ((ErrorRequestCoordinator)request0).setRequests(request1, this.P.h(v4, v5, this.P.getPriority(), this.P.L, this.P, ((RequestCoordinator)request0), requestFutureTarget0, target0, object0, executor0));
        return request0;
    }

    @Override  // com.bumptech.glide.request.BaseRequestOptions
    public int hashCode() {
        return Util.hashCode(this.S, Util.hashCode(this.R, Util.hashCode(this.Q, Util.hashCode(this.P, Util.hashCode(this.O, Util.hashCode(this.N, Util.hashCode(this.M, Util.hashCode(this.L, Util.hashCode(this.I, super.hashCode())))))))));
    }

    public final Priority i(Priority priority0) {
        switch(j.b[priority0.ordinal()]) {
            case 1: {
                return Priority.NORMAL;
            }
            case 2: {
                return Priority.HIGH;
            }
            case 3: 
            case 4: {
                return Priority.IMMEDIATE;
            }
            default: {
                throw new IllegalArgumentException("unknown priority: " + this.getPriority());
            }
        }
    }

    @Deprecated
    public FutureTarget into(int v, int v1) {
        return this.submit(v, v1);
    }

    @NonNull
    public Target into(@NonNull Target target0) {
        this.j(target0, null, this, Executors.mainThreadExecutor());
        return target0;
    }

    @NonNull
    public ViewTarget into(@NonNull ImageView imageView0) {
        BaseRequestOptions baseRequestOptions0;
        Util.assertMainThread();
        Preconditions.checkNotNull(imageView0);
        if(this.isTransformationSet() || !this.isTransformationAllowed() || imageView0.getScaleType() == null) {
            baseRequestOptions0 = this;
        }
        else {
            switch(j.a[imageView0.getScaleType().ordinal()]) {
                case 1: {
                    baseRequestOptions0 = this.clone().optionalCenterCrop();
                    break;
                }
                case 2: {
                    baseRequestOptions0 = this.clone().optionalCenterInside();
                    break;
                }
                case 3: 
                case 4: 
                case 5: {
                    baseRequestOptions0 = this.clone().optionalFitCenter();
                    break;
                }
                case 6: {
                    baseRequestOptions0 = this.clone().optionalCenterInside();
                    break;
                }
                default: {
                    baseRequestOptions0 = this;
                }
            }
        }
        ViewTarget viewTarget0 = this.K.buildImageViewTarget(imageView0, this.I);
        this.j(viewTarget0, null, baseRequestOptions0, Executors.mainThreadExecutor());
        return viewTarget0;
    }

    public final void j(Target target0, RequestFutureTarget requestFutureTarget0, BaseRequestOptions baseRequestOptions0, Executor executor0) {
        Preconditions.checkNotNull(target0);
        if(!this.S) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Object object0 = new Object();
        Request request0 = this.h(baseRequestOptions0.getOverrideWidth(), baseRequestOptions0.getOverrideHeight(), baseRequestOptions0.getPriority(), this.L, baseRequestOptions0, null, requestFutureTarget0, target0, object0, executor0);
        Request request1 = target0.getRequest();
        if(request0.isEquivalentTo(request1) && (baseRequestOptions0.isMemoryCacheable() || !request1.isComplete())) {
            if(!((Request)Preconditions.checkNotNull(request1)).isRunning()) {
                request1.begin();
            }
            return;
        }
        this.H.clear(target0);
        target0.setRequest(request0);
        synchronized(this.H) {
            this.H.d.track(target0);
            this.H.b.runRequest(request0);
        }
    }

    public final RequestBuilder k(Object object0) {
        if(this.isAutoCloneEnabled()) {
            return this.clone().k(object0);
        }
        this.M = object0;
        this.S = true;
        return (RequestBuilder)this.selfOrThrowIfLocked();
    }

    public final SingleRequest l(int v, int v1, Priority priority0, TransitionOptions transitionOptions0, BaseRequestOptions baseRequestOptions0, RequestCoordinator requestCoordinator0, RequestFutureTarget requestFutureTarget0, Target target0, Object object0, Executor executor0) {
        Object object1 = this.M;
        ArrayList arrayList0 = this.N;
        Engine engine0 = this.K.getEngine();
        return SingleRequest.obtain(this.G, this.K, object0, object1, this.I, baseRequestOptions0, v, v1, priority0, target0, requestFutureTarget0, arrayList0, requestCoordinator0, engine0, transitionOptions0.a, executor0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder listener(@Nullable RequestListener requestListener0) {
        if(this.isAutoCloneEnabled()) {
            return this.clone().listener(requestListener0);
        }
        this.N = null;
        return this.addListener(requestListener0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Bitmap bitmap0) {
        return this.k(bitmap0).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Drawable drawable0) {
        return this.k(drawable0).apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Uri uri0) {
        RequestBuilder requestBuilder0 = this.k(uri0);
        return uri0 == null || !"android.resource".equals(uri0.getScheme()) ? requestBuilder0 : ((RequestBuilder)((RequestBuilder)requestBuilder0.theme(this.G.getTheme())).signature(AndroidResourceSignature.obtain(this.G)));
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable File file0) {
        return this.k(file0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@DrawableRes @Nullable @RawRes Integer integer0) {
        return (RequestBuilder)((RequestBuilder)this.k(integer0).theme(this.G.getTheme())).signature(AndroidResourceSignature.obtain(this.G));
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable Object object0) {
        return this.k(object0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable String s) {
        return this.k(s);
    }

    @CheckResult
    @Deprecated
    public RequestBuilder load(@Nullable URL uRL0) {
        return this.k(uRL0);
    }

    @CheckResult
    @NonNull
    public RequestBuilder load(@Nullable byte[] arr_b) {
        RequestBuilder requestBuilder0 = this.k(arr_b);
        if(!requestBuilder0.isDiskCacheStrategySet()) {
            requestBuilder0 = requestBuilder0.apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE));
        }
        return requestBuilder0.isSkipMemoryCacheSet() ? requestBuilder0 : requestBuilder0.apply(RequestOptions.skipMemoryCacheOf(true));
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

    @NonNull
    public Target preload() {
        return this.preload(0x80000000, 0x80000000);
    }

    @NonNull
    public Target preload(int v, int v1) {
        return this.into(PreloadTarget.obtain(this.H, v, v1));
    }

    @NonNull
    public FutureTarget submit() {
        return this.submit(0x80000000, 0x80000000);
    }

    @NonNull
    public FutureTarget submit(int v, int v1) {
        FutureTarget futureTarget0 = new RequestFutureTarget(v, v1);
        this.j(futureTarget0, ((RequestFutureTarget)futureTarget0), this, Executors.directExecutor());
        return futureTarget0;
    }

    @CheckResult
    @NonNull
    @Deprecated
    public RequestBuilder thumbnail(float f) {
        if(this.isAutoCloneEnabled()) {
            return this.clone().thumbnail(f);
        }
        if(f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.Q = f;
        return (RequestBuilder)this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestBuilder thumbnail(@Nullable RequestBuilder requestBuilder0) {
        if(this.isAutoCloneEnabled()) {
            return this.clone().thumbnail(requestBuilder0);
        }
        this.O = requestBuilder0;
        return (RequestBuilder)this.selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestBuilder thumbnail(@Nullable List list0) {
        RequestBuilder requestBuilder0 = null;
        if(list0 != null && !list0.isEmpty()) {
            for(int v = list0.size() - 1; v >= 0; --v) {
                RequestBuilder requestBuilder1 = (RequestBuilder)list0.get(v);
                if(requestBuilder1 != null) {
                    requestBuilder0 = requestBuilder0 == null ? requestBuilder1 : requestBuilder1.thumbnail(requestBuilder0);
                }
            }
            return this.thumbnail(requestBuilder0);
        }
        return this.thumbnail(null);
    }

    @CheckResult
    @NonNull
    public RequestBuilder thumbnail(@Nullable RequestBuilder[] arr_requestBuilder) {
        return arr_requestBuilder == null || arr_requestBuilder.length == 0 ? this.thumbnail(null) : this.thumbnail(Arrays.asList(arr_requestBuilder));
    }

    @CheckResult
    @NonNull
    public RequestBuilder transition(@NonNull TransitionOptions transitionOptions0) {
        if(this.isAutoCloneEnabled()) {
            return this.clone().transition(transitionOptions0);
        }
        this.L = (TransitionOptions)Preconditions.checkNotNull(transitionOptions0);
        this.R = false;
        return (RequestBuilder)this.selfOrThrowIfLocked();
    }
}

