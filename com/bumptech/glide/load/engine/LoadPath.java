package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.core.util.Pools.Pool;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadPath {
    public final Class a;
    public final Pool b;
    public final List c;
    public final String d;

    public LoadPath(Class class0, Class class1, Class class2, List list0, Pool pools$Pool0) {
        this.a = class0;
        this.b = pools$Pool0;
        this.c = (List)Preconditions.checkNotEmpty(list0);
        this.d = "Failed LoadPath{" + class0.getSimpleName() + "->" + class1.getSimpleName() + "->" + class2.getSimpleName() + "}";
    }

    public Class getDataClass() {
        return this.a;
    }

    public Resource load(DataRewinder dataRewinder0, @NonNull Options options0, int v, int v1, DecodeCallback decodePath$DecodeCallback0) throws GlideException {
        ArrayList arrayList0;
        Pool pools$Pool0 = this.b;
        List list0 = (List)Preconditions.checkNotNull(pools$Pool0.acquire());
        try {
            List list1 = this.c;
            int v3 = list1.size();
            Resource resource0 = null;
            for(int v4 = 0; v4 < v3; ++v4) {
                DecodePath decodePath0 = (DecodePath)list1.get(v4);
                try {
                    resource0 = decodePath0.decode(dataRewinder0, v, v1, options0, decodePath$DecodeCallback0);
                }
                catch(GlideException glideException0) {
                    list0.add(glideException0);
                }
                if(resource0 != null) {
                    break;
                }
            }
            if(resource0 != null) {
                return resource0;
            }
            arrayList0 = new ArrayList(list0);
        }
        finally {
            pools$Pool0.release(list0);
        }
        throw new GlideException(this.d, arrayList0);
    }

    @Override
    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.c.toArray()) + '}';
    }
}

