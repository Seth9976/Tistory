package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.r;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.Registry.NoModelLoaderAvailableException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ModelLoaderRegistry {
    public final MultiModelLoaderFactory a;
    public final r b;

    public ModelLoaderRegistry(@NonNull Pool pools$Pool0) {
        MultiModelLoaderFactory multiModelLoaderFactory0 = new MultiModelLoaderFactory(pools$Pool0);
        super();
        this.b = new r(1);
        this.a = multiModelLoaderFactory0;
    }

    public void append(@NonNull Class class0, @NonNull Class class1, @NonNull ModelLoaderFactory modelLoaderFactory0) {
        synchronized(this) {
            MultiModelLoaderFactory multiModelLoaderFactory0 = this.a;
            synchronized(multiModelLoaderFactory0) {
                w w0 = new w(class0, class1, modelLoaderFactory0);
                multiModelLoaderFactory0.a.add(multiModelLoaderFactory0.a.size(), w0);
            }
            this.b.a.clear();
        }
    }

    public ModelLoader build(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            return this.a.build(class0, class1);
        }
    }

    @NonNull
    public List getDataClasses(@NonNull Class class0) {
        synchronized(this) {
            return this.a.b(class0);
        }
    }

    @NonNull
    public List getModelLoaders(@NonNull Object object0) {
        List list0;
        Class class0 = object0.getClass();
        synchronized(this) {
            s s0 = (s)this.b.a.get(class0);
            list0 = s0 == null ? null : s0.a;
            if(list0 == null) {
                list0 = Collections.unmodifiableList(this.a.a(class0));
                s s1 = new s(list0);
                if(((s)this.b.a.put(class0, s1)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + class0);
                }
            }
        }
        if(list0.isEmpty()) {
            throw new NoModelLoaderAvailableException(object0);
        }
        int v1 = list0.size();
        List list1 = Collections.emptyList();
        boolean z = true;
        for(int v2 = 0; v2 < v1; ++v2) {
            ModelLoader modelLoader0 = (ModelLoader)list0.get(v2);
            if(modelLoader0.handles(object0)) {
                if(z) {
                    list1 = new ArrayList(v1 - v2);
                    z = false;
                }
                list1.add(modelLoader0);
            }
        }
        if(list1.isEmpty()) {
            throw new NoModelLoaderAvailableException(object0, list0);
        }
        return list1;
    }

    public void prepend(@NonNull Class class0, @NonNull Class class1, @NonNull ModelLoaderFactory modelLoaderFactory0) {
        synchronized(this) {
            MultiModelLoaderFactory multiModelLoaderFactory0 = this.a;
            synchronized(multiModelLoaderFactory0) {
                w w0 = new w(class0, class1, modelLoaderFactory0);
                multiModelLoaderFactory0.a.add(0, w0);
            }
            this.b.a.clear();
        }
    }

    public void remove(@NonNull Class class0, @NonNull Class class1) {
        synchronized(this) {
            for(Object object0: this.a.c(class0, class1)) {
                ((ModelLoaderFactory)object0).teardown();
            }
            this.b.a.clear();
        }
    }

    public void replace(@NonNull Class class0, @NonNull Class class1, @NonNull ModelLoaderFactory modelLoaderFactory0) {
        synchronized(this) {
            MultiModelLoaderFactory multiModelLoaderFactory0 = this.a;
            synchronized(multiModelLoaderFactory0) {
                ArrayList arrayList0 = multiModelLoaderFactory0.c(class0, class1);
                synchronized(multiModelLoaderFactory0) {
                    w w0 = new w(class0, class1, modelLoaderFactory0);
                    multiModelLoaderFactory0.a.add(multiModelLoaderFactory0.a.size(), w0);
                }
            }
            for(Object object0: arrayList0) {
                ((ModelLoaderFactory)object0).teardown();
            }
            this.b.a.clear();
        }
    }
}

