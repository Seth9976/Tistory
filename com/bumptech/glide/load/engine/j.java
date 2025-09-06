package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry.NoResultEncoderAvailableException;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;

public final class j implements DecodeCallback {
    public final DataSource a;
    public final n b;

    public j(n n0, DataSource dataSource0) {
        this.b = n0;
        this.a = dataSource0;
    }

    @Override  // com.bumptech.glide.load.engine.DecodePath$DecodeCallback
    public final Resource onResourceDecoded(Resource resource0) {
        f f0;
        EncodeStrategy encodeStrategy0;
        Resource resource1;
        Transformation transformation1;
        n n0 = this.b;
        n0.getClass();
        Class class0 = resource0.get().getClass();
        DataSource dataSource0 = this.a;
        h h0 = n0.a;
        ResourceEncoder resourceEncoder0 = null;
        if(dataSource0 == DataSource.RESOURCE_DISK_CACHE) {
            resource1 = resource0;
            transformation1 = null;
        }
        else {
            Transformation transformation0 = h0.c(class0);
            transformation1 = transformation0;
            resource1 = transformation0.transform(n0.h, resource0, n0.l, n0.m);
        }
        if(!resource0.equals(resource1)) {
            resource0.recycle();
        }
        if(h0.c.getRegistry().isResourceEncoderAvailable(resource1)) {
            resourceEncoder0 = h0.c.getRegistry().getResultEncoder(resource1);
            encodeStrategy0 = resourceEncoder0.getEncodeStrategy(n0.o);
        }
        else {
            encodeStrategy0 = EncodeStrategy.NONE;
        }
        Key key0 = n0.w;
        ArrayList arrayList0 = h0.b();
        int v = arrayList0.size();
        for(int v1 = 0; true; ++v1) {
            int v2 = 0;
            if(v1 >= v) {
                break;
            }
            if(((LoadData)arrayList0.get(v1)).sourceKey.equals(key0)) {
                v2 = 1;
                break;
            }
        }
        if(n0.n.isResourceCacheable(((boolean)(v2 ^ 1)), dataSource0, encodeStrategy0)) {
            if(resourceEncoder0 == null) {
                throw new NoResultEncoderAvailableException(resource1.get().getClass());
            }
            switch(encodeStrategy0) {
                case 1: {
                    f0 = new f(n0.w, n0.i);
                    break;
                }
                case 2: {
                    f0 = new e0(h0.c.getArrayPool(), n0.w, n0.i, n0.l, n0.m, transformation1, class0, n0.o);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown strategy: " + encodeStrategy0);
                }
            }
            c0 c00 = (c0)Preconditions.checkNotNull(((c0)c0.e.acquire()));
            c00.d = false;
            c00.c = true;
            c00.b = resource1;
            n0.f.a = f0;
            n0.f.b = resourceEncoder0;
            n0.f.c = c00;
            return c00;
        }
        return resource1;
    }
}

