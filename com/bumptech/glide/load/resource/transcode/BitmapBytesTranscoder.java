package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import java.io.ByteArrayOutputStream;

public class BitmapBytesTranscoder implements ResourceTranscoder {
    public final Bitmap.CompressFormat a;
    public final int b;

    public BitmapBytesTranscoder() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public BitmapBytesTranscoder(@NonNull Bitmap.CompressFormat bitmap$CompressFormat0, int v) {
        this.a = bitmap$CompressFormat0;
        this.b = v;
    }

    @Override  // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @Nullable
    public Resource transcode(@NonNull Resource resource0, @NonNull Options options0) {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        ((Bitmap)resource0.get()).compress(this.a, this.b, byteArrayOutputStream0);
        resource0.recycle();
        return new BytesResource(byteArrayOutputStream0.toByteArray());
    }
}

