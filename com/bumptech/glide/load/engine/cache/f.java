package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

public final class f implements CacheDirectoryGetter {
    public final Context a;
    public final String b;

    public f(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override  // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$CacheDirectoryGetter
    public final File getCacheDirectory() {
        File file0 = this.a.getCacheDir();
        if(file0 == null) {
            return null;
        }
        return this.b == null ? file0 : new File(file0, this.b);
    }
}

