package com.bumptech.glide.load.model;

import androidx.annotation.NonNull;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.Registry.NoModelLoaderAvailableException;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MultiModelLoaderFactory {
    public final ArrayList a;
    public final x b;
    public final HashSet c;
    public final Pool d;
    public static final x e;
    public static final v f;

    static {
        MultiModelLoaderFactory.e = new x();  // 初始化器: Ljava/lang/Object;-><init>()V
        MultiModelLoaderFactory.f = new v();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public MultiModelLoaderFactory(@NonNull Pool pools$Pool0) {
        this.a = new ArrayList();
        this.c = new HashSet();
        this.d = pools$Pool0;
        this.b = MultiModelLoaderFactory.e;
    }

    public final ArrayList a(Class class0) {
        ArrayList arrayList0;
        __monitor_enter(this);
        try {
            arrayList0 = new ArrayList();
            for(Object object0: this.a) {
                w w0 = (w)object0;
                if(!this.c.contains(w0) && w0.a.isAssignableFrom(class0)) {
                    this.c.add(w0);
                    arrayList0.add(((ModelLoader)Preconditions.checkNotNull(w0.c.build(this))));
                    this.c.remove(w0);
                }
            }
        }
        catch(Throwable throwable0) {
            try {
                this.c.clear();
                throw throwable0;
            }
            catch(Throwable throwable1) {
                __monitor_exit(this);
                throw throwable1;
            }
        }
        __monitor_exit(this);
        return arrayList0;
    }

    public final ArrayList b(Class class0) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.a) {
                w w0 = (w)object0;
                if(!arrayList0.contains(w0.b) && w0.a.isAssignableFrom(class0)) {
                    arrayList0.add(w0.b);
                }
            }
            return arrayList0;
        }
    }

    @NonNull
    public ModelLoader build(@NonNull Class class0, @NonNull Class class1) {
        ModelLoader modelLoader1;
        ModelLoader modelLoader0;
        ArrayList arrayList0;
        __monitor_enter(this);
        try {
            arrayList0 = new ArrayList();
            boolean z = false;
            for(Object object0: this.a) {
                w w0 = (w)object0;
                if(this.c.contains(w0)) {
                    z = true;
                }
                else if(w0.a.isAssignableFrom(class0) && w0.b.isAssignableFrom(class1)) {
                    this.c.add(w0);
                    arrayList0.add(((ModelLoader)Preconditions.checkNotNull(w0.c.build(this))));
                    this.c.remove(w0);
                }
            }
            if(arrayList0.size() > 1) {
                this.b.getClass();
                modelLoader0 = new u(arrayList0, this.d);
                goto label_18;
            }
            goto label_20;
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
    label_18:
        __monitor_exit(this);
        return modelLoader0;
        try {
        label_20:
            if(arrayList0.size() == 1) {
                modelLoader1 = (ModelLoader)arrayList0.get(0);
                goto label_22;
            }
            goto label_24;
        }
        catch(Throwable throwable0) {
            goto label_29;
        }
    label_22:
        __monitor_exit(this);
        return modelLoader1;
    label_24:
        if(z) {
            __monitor_exit(this);
            return MultiModelLoaderFactory.f;
        }
        try {
            throw new NoModelLoaderAvailableException(class0, class1);
        }
        catch(Throwable throwable0) {
        }
        try {
        label_29:
            this.c.clear();
            throw throwable0;
        }
        catch(Throwable throwable1) {
            __monitor_exit(this);
            throw throwable1;
        }
    }

    public final ArrayList c(Class class0, Class class1) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = this.a.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                w w0 = (w)object0;
                if(w0.a.isAssignableFrom(class0) && w0.b.isAssignableFrom(class1)) {
                    iterator0.remove();
                    arrayList0.add(w0.c);
                }
            }
            return arrayList0;
        }
    }
}

