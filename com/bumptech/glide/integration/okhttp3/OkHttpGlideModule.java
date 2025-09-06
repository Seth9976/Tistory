package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.GlideModule;
import java.io.InputStream;

@Deprecated
public class OkHttpGlideModule implements GlideModule {
    @Override  // com.bumptech.glide.module.GlideModule
    public void applyOptions(@NonNull Context context0, @NonNull GlideBuilder glideBuilder0) {
    }

    @Override  // com.bumptech.glide.module.GlideModule
    public void registerComponents(Context context0, Glide glide0, Registry registry0) {
        Factory okHttpUrlLoader$Factory0 = new Factory();
        registry0.replace(GlideUrl.class, InputStream.class, okHttpUrlLoader$Factory0);
    }
}

