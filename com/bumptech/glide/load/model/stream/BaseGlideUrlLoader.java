package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.ModelCache;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.model.ModelLoader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class BaseGlideUrlLoader implements ModelLoader {
    public final ModelLoader a;
    public final ModelCache b;

    public BaseGlideUrlLoader(ModelLoader modelLoader0) {
        this(modelLoader0, null);
    }

    public BaseGlideUrlLoader(ModelLoader modelLoader0, @Nullable ModelCache modelCache0) {
        this.a = modelLoader0;
        this.b = modelCache0;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    @Nullable
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        ModelCache modelCache0 = this.b;
        GlideUrl glideUrl0 = modelCache0 == null ? null : ((GlideUrl)modelCache0.get(object0, v, v1));
        if(glideUrl0 == null) {
            String s = this.getUrl(object0, v, v1, options0);
            if(TextUtils.isEmpty(s)) {
                return null;
            }
            GlideUrl glideUrl1 = new GlideUrl(s, this.getHeaders(object0, v, v1, options0));
            if(modelCache0 != null) {
                modelCache0.put(object0, v, v1, glideUrl1);
            }
            glideUrl0 = glideUrl1;
        }
        List list0 = this.getAlternateUrls(object0, v, v1, options0);
        LoadData modelLoader$LoadData0 = this.a.buildLoadData(glideUrl0, v, v1, options0);
        if(modelLoader$LoadData0 != null && !list0.isEmpty()) {
            Key key0 = modelLoader$LoadData0.sourceKey;
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object1: list0) {
                arrayList0.add(new GlideUrl(((String)object1)));
            }
            return new LoadData(key0, arrayList0, modelLoader$LoadData0.fetcher);
        }
        return modelLoader$LoadData0;
    }

    public List getAlternateUrls(Object object0, int v, int v1, Options options0) {
        return Collections.emptyList();
    }

    @Nullable
    public Headers getHeaders(Object object0, int v, int v1, Options options0) {
        return Headers.DEFAULT;
    }

    public abstract String getUrl(Object arg1, int arg2, int arg3, Options arg4);
}

