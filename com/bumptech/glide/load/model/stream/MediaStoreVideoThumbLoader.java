package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.signature.ObjectKey;

public class MediaStoreVideoThumbLoader implements ModelLoader {
    public static class Factory implements ModelLoaderFactory {
        public final Context a;

        public Factory(Context context0) {
            this.a = context0;
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new MediaStoreVideoThumbLoader(this.a);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public final Context a;

    public MediaStoreVideoThumbLoader(Context context0) {
        this.a = context0.getApplicationContext();
    }

    @Nullable
    public LoadData buildLoadData(@NonNull Uri uri0, int v, int v1, @NonNull Options options0) {
        if(MediaStoreUtil.isThumbnailSize(v, v1)) {
            Long long0 = (Long)options0.get(VideoDecoder.TARGET_FRAME);
            return long0 == null || ((long)long0) != -1L ? null : new LoadData(new ObjectKey(uri0), ThumbFetcher.buildVideoFetcher(this.a, uri0));
        }
        return null;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    @Nullable
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((Uri)object0), v, v1, options0);
    }

    public boolean handles(@NonNull Uri uri0) {
        return MediaStoreUtil.isMediaStoreVideoUri(uri0);
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((Uri)object0));
    }
}

