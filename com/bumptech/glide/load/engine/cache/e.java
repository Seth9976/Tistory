package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

public final class e implements CacheDirectoryGetter {
    public final Context a;
    public final String b;

    public e(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override  // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory$CacheDirectoryGetter
    public final File getCacheDirectory() {
        Context context0 = this.a;
        File file0 = context0.getCacheDir();
        String s = this.b;
        if(file0 == null) {
            file0 = null;
        }
        else if(s != null) {
            file0 = new File(file0, s);
        }
        if(file0 != null && file0.exists()) {
            return file0;
        }
        File file1 = context0.getExternalCacheDir();
        if(file1 != null && file1.canWrite()) {
            return s == null ? file1 : new File(file1, s);
        }
        return file0;
    }
}

