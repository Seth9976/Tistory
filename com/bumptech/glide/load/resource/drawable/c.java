package com.bumptech.glide.load.resource.drawable;

import android.graphics.ImageDecoder;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class c implements ResourceDecoder {
    public final int a;
    public final AnimatedWebpDecoder b;

    public c(AnimatedWebpDecoder animatedWebpDecoder0, int v) {
        this.a = v;
        this.b = animatedWebpDecoder0;
        super();
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public final Resource decode(Object object0, int v, int v1, Options options0) {
        return this.a == 0 ? AnimatedWebpDecoder.a(ImageDecoder.createSource(((ByteBuffer)object0)), v, v1, options0) : AnimatedWebpDecoder.a(ImageDecoder.createSource(ByteBufferUtil.fromStream(((InputStream)object0))), v, v1, options0);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public final boolean handles(Object object0, Options options0) {
        return this.a == 0 ? ImageHeaderParserUtils.getType(this.b.a, ((ByteBuffer)object0)) == ImageType.ANIMATED_WEBP : ImageHeaderParserUtils.getType(this.b.a, ((InputStream)object0), this.b.b) == ImageType.ANIMATED_WEBP;
    }
}

