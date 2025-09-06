package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import e6.a;
import e6.b;
import java.io.InputStream;

@RequiresApi(29)
public final class QMediaStoreUriLoader implements ModelLoader {
    @RequiresApi(29)
    public static final class FileDescriptorFactory extends a {
        public FileDescriptorFactory(Context context0) {
            super(context0, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi(29)
    public static final class InputStreamFactory extends a {
        public InputStreamFactory(Context context0) {
            super(context0, InputStream.class);
        }
    }

    public final Context a;
    public final ModelLoader b;
    public final ModelLoader c;
    public final Class d;

    public QMediaStoreUriLoader(Context context0, ModelLoader modelLoader0, ModelLoader modelLoader1, Class class0) {
        this.a = context0.getApplicationContext();
        this.b = modelLoader0;
        this.c = modelLoader1;
        this.d = class0;
    }

    public LoadData buildLoadData(@NonNull Uri uri0, int v, int v1, @NonNull Options options0) {
        return new LoadData(new ObjectKey(uri0), new b(this.a, this.b, this.c, uri0, v, v1, options0, this.d));
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public LoadData buildLoadData(@NonNull Object object0, int v, int v1, @NonNull Options options0) {
        return this.buildLoadData(((Uri)object0), v, v1, options0);
    }

    public boolean handles(@NonNull Uri uri0) {
        return Build.VERSION.SDK_INT >= 29 && MediaStoreUtil.isMediaStoreUri(uri0);
    }

    @Override  // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(@NonNull Object object0) {
        return this.handles(((Uri)object0));
    }
}

