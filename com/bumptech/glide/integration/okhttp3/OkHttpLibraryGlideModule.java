package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.LibraryGlideModule;
import java.io.InputStream;

@GlideModule
public final class OkHttpLibraryGlideModule extends LibraryGlideModule {
    @Override  // com.bumptech.glide.module.LibraryGlideModule
    public void registerComponents(@NonNull Context context0, @NonNull Glide glide0, @NonNull Registry registry0) {
        Factory okHttpUrlLoader$Factory0 = new Factory();
        registry0.replace(GlideUrl.class, InputStream.class, okHttpUrlLoader$Factory0);
    }
}

