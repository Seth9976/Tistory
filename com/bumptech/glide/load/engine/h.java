package com.bumptech.glide.load.engine;

import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.UnitTransformation;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class h {
    public final ArrayList a;
    public final ArrayList b;
    public GlideContext c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public t h;
    public Options i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public Key n;
    public Priority o;
    public DiskCacheStrategy p;
    public boolean q;
    public boolean r;

    public h() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public final ArrayList a() {
        ArrayList arrayList0 = this.b;
        if(!this.m) {
            this.m = true;
            arrayList0.clear();
            ArrayList arrayList1 = this.b();
            int v = arrayList1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                LoadData modelLoader$LoadData0 = (LoadData)arrayList1.get(v1);
                if(!arrayList0.contains(modelLoader$LoadData0.sourceKey)) {
                    arrayList0.add(modelLoader$LoadData0.sourceKey);
                }
                for(int v2 = 0; v2 < modelLoader$LoadData0.alternateKeys.size(); ++v2) {
                    if(!arrayList0.contains(modelLoader$LoadData0.alternateKeys.get(v2))) {
                        arrayList0.add(modelLoader$LoadData0.alternateKeys.get(v2));
                    }
                }
            }
        }
        return arrayList0;
    }

    public final ArrayList b() {
        ArrayList arrayList0 = this.a;
        if(!this.l) {
            this.l = true;
            arrayList0.clear();
            List list0 = this.c.getRegistry().getModelLoaders(this.d);
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                LoadData modelLoader$LoadData0 = ((ModelLoader)list0.get(v1)).buildLoadData(this.d, this.e, this.f, this.i);
                if(modelLoader$LoadData0 != null) {
                    arrayList0.add(modelLoader$LoadData0);
                }
            }
        }
        return arrayList0;
    }

    public final Transformation c(Class class0) {
        Transformation transformation0 = (Transformation)this.j.get(class0);
        if(transformation0 == null) {
            for(Object object0: this.j.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((Class)map$Entry0.getKey()).isAssignableFrom(class0)) {
                    transformation0 = (Transformation)map$Entry0.getValue();
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        if(transformation0 == null) {
            if(this.j.isEmpty() && this.q) {
                throw new IllegalArgumentException("Missing transformation for " + class0 + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return UnitTransformation.get();
        }
        return transformation0;
    }
}

