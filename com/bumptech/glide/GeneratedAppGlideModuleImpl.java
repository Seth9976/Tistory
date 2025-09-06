package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule;
import com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory;
import com.kakao.tistory.presentation.common.glide.TistoryGlideModule;
import java.util.Collections;
import java.util.Set;

final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    public final TistoryGlideModule a;

    public GeneratedAppGlideModuleImpl(Context context0) {
        this.a = new TistoryGlideModule();
        if(Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.kakao.tistory.presentation.common.glide.TistoryGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
        }
    }

    @Override  // com.bumptech.glide.GeneratedAppGlideModule
    public final Set a() {
        return Collections.emptySet();
    }

    @Override  // com.bumptech.glide.module.AppGlideModule
    public final void applyOptions(Context context0, GlideBuilder glideBuilder0) {
        this.a.applyOptions(context0, glideBuilder0);
    }

    @Override  // com.bumptech.glide.GeneratedAppGlideModule
    public final RequestManagerFactory b() {
        return new a();
    }

    @Override  // com.bumptech.glide.module.AppGlideModule
    public final boolean isManifestParsingEnabled() {
        return this.a.isManifestParsingEnabled();
    }

    @Override  // com.bumptech.glide.module.LibraryGlideModule
    public final void registerComponents(Context context0, Glide glide0, Registry registry0) {
        new OkHttpLibraryGlideModule().registerComponents(context0, glide0, registry0);
        this.a.registerComponents(context0, glide0, registry0);
    }
}

