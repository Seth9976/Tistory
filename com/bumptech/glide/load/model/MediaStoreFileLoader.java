package com.bumptech.glide.load.model;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.signature.ObjectKey;

public final class MediaStoreFileLoader implements ModelLoader {
    public static final class Factory implements ModelLoaderFactory {
        public final Context a;

        public Factory(Context context0) {
            this.a = context0;
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new MediaStoreFileLoader(this.a);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public final Context a;

    public MediaStoreFileLoader(Context context0) {
        this.a = context0;
    }

    public LoadData buildLoadData(@NonNull Uri uri0, int v, int v1, @NonNull Options options0) {
        return new LoadData(new ObjectKey(uri0), new p(this.a, uri0));
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((Uri)object0), v, v1, options0);
    }

    public boolean handles(@NonNull Uri uri0) {
        return MediaStoreUtil.isMediaStoreUri(uri0);
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((Uri)object0));
    }
}

