package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import java.io.InputStream;

public class ResourceLoader implements ModelLoader {
    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory {
        public final Resources a;

        public AssetFileDescriptorFactory(Resources resources0) {
            this.a = resources0;
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            ModelLoader modelLoader0 = multiModelLoaderFactory0.build(Uri.class, AssetFileDescriptor.class);
            return new ResourceLoader(this.a, modelLoader0);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    @Deprecated
    public static class FileDescriptorFactory implements ModelLoaderFactory {
        public final Resources a;

        public FileDescriptorFactory(Resources resources0) {
            this.a = resources0;
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            ModelLoader modelLoader0 = multiModelLoaderFactory0.build(Uri.class, ParcelFileDescriptor.class);
            return new ResourceLoader(this.a, modelLoader0);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class StreamFactory implements ModelLoaderFactory {
        public final Resources a;

        public StreamFactory(Resources resources0) {
            this.a = resources0;
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            ModelLoader modelLoader0 = multiModelLoaderFactory0.build(Uri.class, InputStream.class);
            return new ResourceLoader(this.a, modelLoader0);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public static class UriFactory implements ModelLoaderFactory {
        public final Resources a;

        public UriFactory(Resources resources0) {
            this.a = resources0;
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        @NonNull
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory0) {
            UnitModelLoader unitModelLoader0 = UnitModelLoader.getInstance();
            return new ResourceLoader(this.a, unitModelLoader0);
        }

        @Override  // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }
    }

    public final ModelLoader a;
    public final Resources b;

    public ResourceLoader(Resources resources0, ModelLoader modelLoader0) {
        this.b = resources0;
        this.a = modelLoader0;
    }

    public LoadData buildLoadData(@NonNull Integer integer0, int v, int v1, @NonNull Options options0) {
        try {
            Uri uri0 = Uri.parse(("android.resource://" + this.b.getResourcePackageName(((int)integer0)) + '/' + this.b.getResourceTypeName(((int)integer0)) + '/' + this.b.getResourceEntryName(((int)integer0))));
            return uri0 == null ? null : this.a.buildLoadData(uri0, v, v1, options0);
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            if(Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + integer0, resources$NotFoundException0);
            }
            return null;
        }
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((Integer)object0), v, v1, options0);
    }

    public boolean handles(@NonNull Integer integer0) {
        return true;
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((Integer)object0));
    }
}

