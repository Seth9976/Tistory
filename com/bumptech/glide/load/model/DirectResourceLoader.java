package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.signature.ObjectKey;
import java.io.IOException;

public final class DirectResourceLoader implements ModelLoader {
    interface ResourceOpener {
        void close(Object arg1) throws IOException;

        Class getDataClass();

        Object open(@Nullable Resources.Theme arg1, Resources arg2, int arg3);
    }

    public final Context a;
    public final Object b;

    public DirectResourceLoader(Context context0, ResourceOpener directResourceLoader$ResourceOpener0) {
        this.a = context0.getApplicationContext();
        this.b = directResourceLoader$ResourceOpener0;
    }

    public static ModelLoaderFactory assetFileDescriptorFactory(Context context0) {
        return new g(context0);
    }

    public LoadData buildLoadData(@NonNull Integer integer0, int v, int v1, @NonNull Options options0) {
        Resources resources0;
        Resources.Theme resources$Theme0 = (Resources.Theme)options0.get(ResourceDrawableDecoder.THEME);
        if(resources$Theme0 != null) {
            resources0 = resources$Theme0.getResources();
            return new LoadData(new ObjectKey(integer0), new j(resources$Theme0, resources0, ((ResourceOpener)this.b), ((int)integer0)));
        }
        resources0 = this.a.getResources();
        return new LoadData(new ObjectKey(integer0), new j(null, resources0, ((ResourceOpener)this.b), ((int)integer0)));
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((Integer)object0), v, v1, options0);
    }

    public static ModelLoaderFactory drawableFactory(Context context0) {
        return new h(context0);
    }

    public boolean handles(@NonNull Integer integer0) {
        return true;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((Integer)object0));
    }

    public static ModelLoaderFactory inputStreamFactory(Context context0) {
        return new i(context0);
    }
}

