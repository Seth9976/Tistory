package com.bumptech.glide.provider;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.resource.transcode.UnitTranscoder;
import com.bumptech.glide.util.MultiClassKey;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class LoadPathCache {
    public final ArrayMap a;
    public final AtomicReference b;
    public static final LoadPath c;

    static {
        List list0 = Collections.emptyList();
        UnitTranscoder unitTranscoder0 = new UnitTranscoder();
        List list1 = Collections.singletonList(new DecodePath(Object.class, Object.class, Object.class, list0, unitTranscoder0, null));
        LoadPathCache.c = new LoadPath(Object.class, Object.class, Object.class, list1, null);
    }

    public LoadPathCache() {
        this.a = new ArrayMap();
        this.b = new AtomicReference();
    }

    @Nullable
    public LoadPath get(Class class0, Class class1, Class class2) {
        LoadPath loadPath0;
        MultiClassKey multiClassKey0 = (MultiClassKey)this.b.getAndSet(null);
        if(multiClassKey0 == null) {
            multiClassKey0 = new MultiClassKey();
        }
        multiClassKey0.set(class0, class1, class2);
        synchronized(this.a) {
            loadPath0 = (LoadPath)this.a.get(multiClassKey0);
        }
        this.b.set(multiClassKey0);
        return loadPath0;
    }

    public boolean isEmptyLoadPath(@Nullable LoadPath loadPath0) {
        return LoadPathCache.c.equals(loadPath0);
    }

    public void put(Class class0, Class class1, Class class2, @Nullable LoadPath loadPath0) {
        synchronized(this.a) {
            ArrayMap arrayMap1 = this.a;
            MultiClassKey multiClassKey0 = new MultiClassKey(class0, class1, class2);
            if(loadPath0 == null) {
                loadPath0 = LoadPathCache.c;
            }
            arrayMap1.put(multiClassKey0, loadPath0);
        }
    }
}

