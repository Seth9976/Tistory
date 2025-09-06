package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.provider.q;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zaq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    @KeepName
    final class ImageReceiver extends ResultReceiver {
        public final Uri a;
        public final ArrayList b;
        public final ImageManager c;

        public ImageReceiver(Uri uri0) {
            super(new zaq(Looper.getMainLooper()));
            this.a = uri0;
            this.b = new ArrayList();
        }

        public final void a() {
            Intent intent0 = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            intent0.setPackage("com.google.android.gms");
            intent0.putExtra("com.google.android.gms.extras.uri", this.a);
            intent0.putExtra("com.google.android.gms.extras.resultReceiver", this);
            intent0.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.this.a.sendBroadcast(intent0);
        }

        @Override  // android.os.ResultReceiver
        public final void onReceiveResult(int v, Bundle bundle0) {
            ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)bundle0.getParcelable("com.google.android.gms.extra.fileDescriptor");
            q q0 = new q(ImageManager.this, this.a, 4, parcelFileDescriptor0);
            ImageManager.this.c.execute(q0);
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(@NonNull Uri arg1, @Nullable Drawable arg2, boolean arg3);
    }

    public final Context a;
    public final zaq b;
    public final ExecutorService c;
    public final HashMap d;
    public final HashMap e;
    public final HashMap f;
    public static final Object g;
    public static final HashSet h;
    public static ImageManager i;

    static {
        ImageManager.g = new Object();
        ImageManager.h = new HashSet();
    }

    public ImageManager(Context context0) {
        this.a = context0.getApplicationContext();
        this.b = new zaq(Looper.getMainLooper());
        this.c = zap.zaa().zab(4, 2);
        new zak();
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
    }

    @NonNull
    public static ImageManager create(@NonNull Context context0) {
        if(ImageManager.i == null) {
            ImageManager.i = new ImageManager(context0);
        }
        return ImageManager.i;
    }

    public void loadImage(@NonNull ImageView imageView0, int v) {
        this.zaj(new zae(imageView0, v));
    }

    public void loadImage(@NonNull ImageView imageView0, @NonNull Uri uri0) {
        this.zaj(new zae(imageView0, uri0));
    }

    public void loadImage(@NonNull ImageView imageView0, @NonNull Uri uri0, int v) {
        zae zae0 = new zae(imageView0, uri0);
        zae0.zab = v;
        this.zaj(zae0);
    }

    public void loadImage(@NonNull OnImageLoadedListener imageManager$OnImageLoadedListener0, @NonNull Uri uri0) {
        this.zaj(new zaf(imageManager$OnImageLoadedListener0, uri0));
    }

    public void loadImage(@NonNull OnImageLoadedListener imageManager$OnImageLoadedListener0, @NonNull Uri uri0, int v) {
        zaf zaf0 = new zaf(imageManager$OnImageLoadedListener0, uri0);
        zaf0.zab = v;
        this.zaj(zaf0);
    }

    public final void zaj(zag zag0) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new a(this, zag0).run();
    }
}

