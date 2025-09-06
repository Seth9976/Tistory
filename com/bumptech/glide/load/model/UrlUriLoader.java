package com.bumptech.glide.load.model;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UrlUriLoader implements ModelLoader {
    public static class StreamFactory implements ModelLoaderFactory {
        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            return new UrlUriLoader(multiModelLoaderFactory0.build(GlideUrl.class, InputStream.class));
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public final ModelLoader a;
    public static final Set b;

    static {
        UrlUriLoader.b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    }

    public UrlUriLoader(ModelLoader modelLoader0) {
        this.a = modelLoader0;
    }

    public LoadData buildLoadData(@NonNull Uri uri0, int v, int v1, @NonNull Options options0) {
        GlideUrl glideUrl0 = new GlideUrl(uri0.toString());
        return this.a.buildLoadData(glideUrl0, v, v1, options0);
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((Uri)object0), v, v1, options0);
    }

    public boolean handles(@NonNull Uri uri0) {
        String s = uri0.getScheme();
        return UrlUriLoader.b.contains(s);
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((Uri)object0));
    }
}

