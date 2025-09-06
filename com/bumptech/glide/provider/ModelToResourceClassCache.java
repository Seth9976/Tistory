package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.bumptech.glide.util.MultiClassKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ModelToResourceClassCache {
    public final AtomicReference a;
    public final ArrayMap b;

    public ModelToResourceClassCache() {
        this.a = new AtomicReference();
        this.b = new ArrayMap();
    }

    public void clear() {
        synchronized(this.b) {
            this.b.clear();
        }
    }

    @Nullable
    public List get(@NonNull Class class0, @NonNull Class class1, @NonNull Class class2) {
        List list0;
        MultiClassKey multiClassKey0 = (MultiClassKey)this.a.getAndSet(null);
        if(multiClassKey0 == null) {
            multiClassKey0 = new MultiClassKey(class0, class1, class2);
        }
        else {
            multiClassKey0.set(class0, class1, class2);
        }
        synchronized(this.b) {
            list0 = (List)this.b.get(multiClassKey0);
        }
        this.a.set(multiClassKey0);
        return list0;
    }

    public void put(@NonNull Class class0, @NonNull Class class1, @NonNull Class class2, @NonNull List list0) {
        synchronized(this.b) {
            MultiClassKey multiClassKey0 = new MultiClassKey(class0, class1, class2);
            this.b.put(multiClassKey0, list0);
        }
    }
}

