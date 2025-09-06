package com.bumptech.glide.load.model;

import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import java.util.ArrayList;
import java.util.Arrays;

public final class u implements ModelLoader {
    public final ArrayList a;
    public final Pool b;

    public u(ArrayList arrayList0, Pool pools$Pool0) {
        this.a = arrayList0;
        this.b = pools$Pool0;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public final LoadData buildLoadData(Object object0, int v, int v1, Options options0) {
        ArrayList arrayList0 = this.a;
        int v2 = arrayList0.size();
        ArrayList arrayList1 = new ArrayList(v2);
        Key key0 = null;
        for(int v3 = 0; v3 < v2; ++v3) {
            ModelLoader modelLoader0 = (ModelLoader)arrayList0.get(v3);
            if(modelLoader0.handles(object0)) {
                LoadData modelLoader$LoadData0 = modelLoader0.buildLoadData(object0, v, v1, options0);
                if(modelLoader$LoadData0 != null) {
                    key0 = modelLoader$LoadData0.sourceKey;
                    arrayList1.add(modelLoader$LoadData0.fetcher);
                }
            }
        }
        return arrayList1.isEmpty() || key0 == null ? null : new LoadData(key0, new t(arrayList1, this.b));
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object object0) {
        for(Object object1: this.a) {
            if(((ModelLoader)object1).handles(object0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override
    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}

