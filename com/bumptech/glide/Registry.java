package com.bumptech.glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataRewinder.Factory;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinderRegistry;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.ImageHeaderParserRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ModelToResourceClassCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.provider.ResourceEncoderRegistry;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Registry {
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(@NonNull String s) {
            super(s);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(@NonNull Class class0, @NonNull Class class1) {
            super("Failed to find any ModelLoaders for model: " + class0 + " and data: " + class1);
        }

        public NoModelLoaderAvailableException(@NonNull Object object0) {
            super("Failed to find any ModelLoaders registered for model class: " + object0.getClass());
        }

        public NoModelLoaderAvailableException(@NonNull Object object0, @NonNull List list0) {
            super("Found ModelLoaders for model class: " + list0 + ", but none that handle this specific model instance: " + object0);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(@NonNull Class class0) {
            super("Failed to find result encoder for resource class: " + class0 + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(@NonNull Class class0) {
            super("Failed to find source encoder for data class: " + class0);
        }
    }

    public static final String BUCKET_ANIMATION = "Animation";
    public static final String BUCKET_BITMAP = "Bitmap";
    public static final String BUCKET_BITMAP_DRAWABLE = "BitmapDrawable";
    @Deprecated
    public static final String BUCKET_GIF = "Animation";
    public final ModelLoaderRegistry a;
    public final EncoderRegistry b;
    public final ResourceDecoderRegistry c;
    public final ResourceEncoderRegistry d;
    public final DataRewinderRegistry e;
    public final TranscoderRegistry f;
    public final ImageHeaderParserRegistry g;
    public final ModelToResourceClassCache h;
    public final LoadPathCache i;
    public final Pool j;

    public Registry() {
        this.h = new ModelToResourceClassCache();
        this.i = new LoadPathCache();
        Pool pools$Pool0 = FactoryPools.threadSafeList();
        this.j = pools$Pool0;
        this.a = new ModelLoaderRegistry(pools$Pool0);
        this.b = new EncoderRegistry();
        this.c = new ResourceDecoderRegistry();
        this.d = new ResourceEncoderRegistry();
        this.e = new DataRewinderRegistry();
        this.f = new TranscoderRegistry();
        this.g = new ImageHeaderParserRegistry();
        this.setResourceDecoderBucketPriorityList(Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"}));
    }

    @NonNull
    public Registry append(@NonNull Class class0, @NonNull Encoder encoder0) {
        this.b.append(class0, encoder0);
        return this;
    }

    @NonNull
    public Registry append(@NonNull Class class0, @NonNull ResourceEncoder resourceEncoder0) {
        this.d.append(class0, resourceEncoder0);
        return this;
    }

    @NonNull
    public Registry append(@NonNull Class class0, @NonNull Class class1, @NonNull ResourceDecoder resourceDecoder0) {
        this.append("legacy_append", class0, class1, resourceDecoder0);
        return this;
    }

    @NonNull
    public Registry append(@NonNull Class class0, @NonNull Class class1, @NonNull ModelLoaderFactory modelLoaderFactory0) {
        this.a.append(class0, class1, modelLoaderFactory0);
        return this;
    }

    @NonNull
    public Registry append(@NonNull String s, @NonNull Class class0, @NonNull Class class1, @NonNull ResourceDecoder resourceDecoder0) {
        this.c.append(s, resourceDecoder0, class0, class1);
        return this;
    }

    @NonNull
    public List getImageHeaderParsers() {
        List list0 = this.g.getParsers();
        if(list0.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return list0;
    }

    @Nullable
    public LoadPath getLoadPath(@NonNull Class class0, @NonNull Class class1, @NonNull Class class2) {
        LoadPathCache loadPathCache0 = this.i;
        LoadPath loadPath0 = loadPathCache0.get(class0, class1, class2);
        if(loadPathCache0.isEmptyLoadPath(loadPath0)) {
            return null;
        }
        if(loadPath0 == null) {
            ArrayList arrayList0 = new ArrayList();
            ResourceDecoderRegistry resourceDecoderRegistry0 = this.c;
            for(Object object0: resourceDecoderRegistry0.getResourceClasses(class0, class1)) {
                Class class3 = (Class)object0;
                TranscoderRegistry transcoderRegistry0 = this.f;
                for(Object object1: transcoderRegistry0.getTranscodeClasses(class3, class2)) {
                    arrayList0.add(new DecodePath(class0, class3, ((Class)object1), resourceDecoderRegistry0.getDecoders(class0, class3), transcoderRegistry0.get(class3, ((Class)object1)), this.j));
                }
            }
            loadPath0 = arrayList0.isEmpty() ? null : new LoadPath(class0, class1, class2, arrayList0, this.j);
            loadPathCache0.put(class0, class1, class2, loadPath0);
        }
        return loadPath0;
    }

    @NonNull
    public List getModelLoaders(@NonNull Object object0) {
        return this.a.getModelLoaders(object0);
    }

    @NonNull
    public List getRegisteredResourceClasses(@NonNull Class class0, @NonNull Class class1, @NonNull Class class2) {
        ModelToResourceClassCache modelToResourceClassCache0 = this.h;
        List list0 = modelToResourceClassCache0.get(class0, class1, class2);
        if(list0 == null) {
            list0 = new ArrayList();
            for(Object object0: this.a.getDataClasses(class0)) {
                for(Object object1: this.c.getResourceClasses(((Class)object0), class1)) {
                    Class class3 = (Class)object1;
                    if(!this.f.getTranscodeClasses(class3, class2).isEmpty() && !((ArrayList)list0).contains(class3)) {
                        ((ArrayList)list0).add(class3);
                    }
                }
            }
            modelToResourceClassCache0.put(class0, class1, class2, Collections.unmodifiableList(list0));
        }
        return list0;
    }

    @NonNull
    public ResourceEncoder getResultEncoder(@NonNull Resource resource0) throws NoResultEncoderAvailableException {
        Class class0 = resource0.getResourceClass();
        ResourceEncoder resourceEncoder0 = this.d.get(class0);
        if(resourceEncoder0 == null) {
            throw new NoResultEncoderAvailableException(resource0.getResourceClass());
        }
        return resourceEncoder0;
    }

    @NonNull
    public DataRewinder getRewinder(@NonNull Object object0) {
        return this.e.build(object0);
    }

    @NonNull
    public Encoder getSourceEncoder(@NonNull Object object0) throws NoSourceEncoderAvailableException {
        Class class0 = object0.getClass();
        Encoder encoder0 = this.b.getEncoder(class0);
        if(encoder0 == null) {
            throw new NoSourceEncoderAvailableException(object0.getClass());
        }
        return encoder0;
    }

    public boolean isResourceEncoderAvailable(@NonNull Resource resource0) {
        Class class0 = resource0.getResourceClass();
        return this.d.get(class0) != null;
    }

    @NonNull
    public Registry prepend(@NonNull Class class0, @NonNull Encoder encoder0) {
        this.b.prepend(class0, encoder0);
        return this;
    }

    @NonNull
    public Registry prepend(@NonNull Class class0, @NonNull ResourceEncoder resourceEncoder0) {
        this.d.prepend(class0, resourceEncoder0);
        return this;
    }

    @NonNull
    public Registry prepend(@NonNull Class class0, @NonNull Class class1, @NonNull ResourceDecoder resourceDecoder0) {
        this.prepend("legacy_prepend_all", class0, class1, resourceDecoder0);
        return this;
    }

    @NonNull
    public Registry prepend(@NonNull Class class0, @NonNull Class class1, @NonNull ModelLoaderFactory modelLoaderFactory0) {
        this.a.prepend(class0, class1, modelLoaderFactory0);
        return this;
    }

    @NonNull
    public Registry prepend(@NonNull String s, @NonNull Class class0, @NonNull Class class1, @NonNull ResourceDecoder resourceDecoder0) {
        this.c.prepend(s, resourceDecoder0, class0, class1);
        return this;
    }

    @NonNull
    public Registry register(@NonNull ImageHeaderParser imageHeaderParser0) {
        this.g.add(imageHeaderParser0);
        return this;
    }

    @NonNull
    public Registry register(@NonNull Factory dataRewinder$Factory0) {
        this.e.register(dataRewinder$Factory0);
        return this;
    }

    @NonNull
    @Deprecated
    public Registry register(@NonNull Class class0, @NonNull Encoder encoder0) {
        return this.append(class0, encoder0);
    }

    @NonNull
    @Deprecated
    public Registry register(@NonNull Class class0, @NonNull ResourceEncoder resourceEncoder0) {
        return this.append(class0, resourceEncoder0);
    }

    @NonNull
    public Registry register(@NonNull Class class0, @NonNull Class class1, @NonNull ResourceTranscoder resourceTranscoder0) {
        this.f.register(class0, class1, resourceTranscoder0);
        return this;
    }

    @NonNull
    public Registry replace(@NonNull Class class0, @NonNull Class class1, @NonNull ModelLoaderFactory modelLoaderFactory0) {
        this.a.replace(class0, class1, modelLoaderFactory0);
        return this;
    }

    @NonNull
    public final Registry setResourceDecoderBucketPriorityList(@NonNull List list0) {
        ArrayList arrayList0 = new ArrayList(list0.size());
        arrayList0.add("legacy_prepend_all");
        for(Object object0: list0) {
            arrayList0.add(((String)object0));
        }
        arrayList0.add("legacy_append");
        this.c.setBucketPriorityList(arrayList0);
        return this;
    }
}

