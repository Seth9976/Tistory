package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Engine;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.ImageViewTargetFactory;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.util.GlideSuppliers.GlideSupplier;
import com.bumptech.glide.util.GlideSuppliers;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class GlideContext extends ContextWrapper {
    public final ArrayPool a;
    public final GlideSupplier b;
    public final ImageViewTargetFactory c;
    public final RequestOptionsFactory d;
    public final List e;
    public final Map f;
    public final Engine g;
    public final GlideExperiments h;
    public final int i;
    public RequestOptions j;
    public static final GenericTransitionOptions k;

    static {
        GlideContext.k = new GenericTransitionOptions();
    }

    public GlideContext(@NonNull Context context0, @NonNull ArrayPool arrayPool0, @NonNull GlideSupplier glideSuppliers$GlideSupplier0, @NonNull ImageViewTargetFactory imageViewTargetFactory0, @NonNull RequestOptionsFactory glide$RequestOptionsFactory0, @NonNull Map map0, @NonNull List list0, @NonNull Engine engine0, @NonNull GlideExperiments glideExperiments0, int v) {
        super(context0.getApplicationContext());
        this.a = arrayPool0;
        this.c = imageViewTargetFactory0;
        this.d = glide$RequestOptionsFactory0;
        this.e = list0;
        this.f = map0;
        this.g = engine0;
        this.h = glideExperiments0;
        this.i = v;
        this.b = GlideSuppliers.memorize(glideSuppliers$GlideSupplier0);
    }

    @NonNull
    public ViewTarget buildImageViewTarget(@NonNull ImageView imageView0, @NonNull Class class0) {
        return this.c.buildTarget(imageView0, class0);
    }

    @NonNull
    public ArrayPool getArrayPool() {
        return this.a;
    }

    public List getDefaultRequestListeners() {
        return this.e;
    }

    public RequestOptions getDefaultRequestOptions() {
        synchronized(this) {
            if(this.j == null) {
                this.j = (RequestOptions)this.d.build().lock();
            }
            return this.j;
        }
    }

    @NonNull
    public TransitionOptions getDefaultTransitionOptions(@NonNull Class class0) {
        Map map0 = this.f;
        TransitionOptions transitionOptions0 = (TransitionOptions)map0.get(class0);
        if(transitionOptions0 == null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((Class)map$Entry0.getKey()).isAssignableFrom(class0)) {
                    transitionOptions0 = (TransitionOptions)map$Entry0.getValue();
                }
            }
        }
        return transitionOptions0 == null ? GlideContext.k : transitionOptions0;
    }

    @NonNull
    public Engine getEngine() {
        return this.g;
    }

    public GlideExperiments getExperiments() {
        return this.h;
    }

    public int getLogLevel() {
        return this.i;
    }

    @NonNull
    public Registry getRegistry() {
        return (Registry)this.b.get();
    }
}

