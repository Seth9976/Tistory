package com.bumptech.glide.load.resource.drawable;

import android.graphics.ImageDecoder;
import android.os.Build.VERSION;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class b implements ResourceDecoder {
    public final int a;
    public final AnimatedImageDecoder b;

    public b(AnimatedImageDecoder animatedImageDecoder0, int v) {
        this.a = v;
        this.b = animatedImageDecoder0;
        super();
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object object0, int v, int v1, Options options0) {
        return this.a == 0 ? AnimatedImageDecoder.a(ImageDecoder.createSource(((ByteBuffer)object0)), v, v1, options0) : AnimatedImageDecoder.a(ImageDecoder.createSource(ByteBufferUtil.fromStream(((InputStream)object0))), v, v1, options0);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object object0, Options options0) {
        if(this.a != 0) {
            ImageType imageHeaderParser$ImageType0 = ImageHeaderParserUtils.getType(this.b.a, ((InputStream)object0), this.b.b);
            return imageHeaderParser$ImageType0 == ImageType.ANIMATED_WEBP || Build.VERSION.SDK_INT >= 0x1F && imageHeaderParser$ImageType0 == ImageType.ANIMATED_AVIF;
        }
        ImageType imageHeaderParser$ImageType1 = ImageHeaderParserUtils.getType(this.b.a, ((ByteBuffer)object0));
        return imageHeaderParser$ImageType1 == ImageType.ANIMATED_WEBP || Build.VERSION.SDK_INT >= 0x1F && imageHeaderParser$ImageType1 == ImageType.ANIMATED_AVIF;
    }
}

