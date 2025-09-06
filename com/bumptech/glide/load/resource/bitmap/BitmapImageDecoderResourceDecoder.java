package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPoolAdapter;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import java.io.IOException;

@RequiresApi(api = 28)
public final class BitmapImageDecoderResourceDecoder implements ResourceDecoder {
    public final BitmapPoolAdapter a;

    public BitmapImageDecoderResourceDecoder() {
        this.a = new BitmapPoolAdapter();
    }

    public Resource decode(@NonNull ImageDecoder.Source imageDecoder$Source0, int v, int v1, @NonNull Options options0) throws IOException {
        Bitmap bitmap0 = ImageDecoder.decodeBitmap(imageDecoder$Source0, new DefaultOnHeaderDecodedListener(v, v1, options0));
        if(Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmap0.getWidth() + "x" + bitmap0.getHeight() + "] for [" + v + "x" + v1 + "]");
        }
        return new BitmapResource(bitmap0, this.a);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((ImageDecoder.Source)object0), v, v1, options0);
    }

    public boolean handles(@NonNull ImageDecoder.Source imageDecoder$Source0, @NonNull Options options0) throws IOException {
        return true;
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((ImageDecoder.Source)object0), options0);
    }
}

