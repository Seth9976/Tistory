package com.bumptech.glide.load.resource.drawable;

import android.graphics.ImageDecoder.Source;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.DefaultOnHeaderDecodedListener;
import java.io.IOException;
import java.util.List;

@RequiresApi(28)
@Deprecated
public final class AnimatedWebpDecoder {
    public final List a;
    public final ArrayPool b;

    public AnimatedWebpDecoder(List list0, ArrayPool arrayPool0) {
        this.a = list0;
        this.b = arrayPool0;
    }

    public static a a(ImageDecoder.Source imageDecoder$Source0, int v, int v1, Options options0) {
        Drawable drawable0 = ImageDecoder.decodeDrawable(imageDecoder$Source0, new DefaultOnHeaderDecodedListener(v, v1, options0));
        if(!androidx.work.impl.background.systemjob.a.y(drawable0)) {
            throw new IOException("Received unexpected drawable type for animated webp, failing: " + drawable0);
        }
        return new a(((AnimatedImageDrawable)drawable0), 1);
    }

    public static ResourceDecoder byteBufferDecoder(List list0, ArrayPool arrayPool0) {
        return new c(new AnimatedWebpDecoder(list0, arrayPool0), 0);
    }

    public static ResourceDecoder streamDecoder(List list0, ArrayPool arrayPool0) {
        return new c(new AnimatedWebpDecoder(list0, arrayPool0), 1);
    }
}

