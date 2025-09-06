package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.g;
import com.bumptech.glide.gifdecoder.GifHeader;
import com.bumptech.glide.gifdecoder.GifHeaderParser;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.util.LogTime;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.text.q;

public class ByteBufferGifDecoder implements ResourceDecoder {
    public final Context a;
    public final List b;
    public final g c;
    public final a d;
    public final GifBitmapProvider e;
    public static final a f;
    public static final g g;

    static {
        ByteBufferGifDecoder.f = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        ByteBufferGifDecoder.g = new g();
    }

    public ByteBufferGifDecoder(Context context0) {
        this(context0, Glide.get(context0).getRegistry().getImageHeaderParsers(), Glide.get(context0).getBitmapPool(), Glide.get(context0).getArrayPool());
    }

    public ByteBufferGifDecoder(Context context0, List list0, BitmapPool bitmapPool0, ArrayPool arrayPool0) {
        this.a = context0.getApplicationContext();
        this.b = list0;
        this.d = ByteBufferGifDecoder.f;
        this.e = new GifBitmapProvider(bitmapPool0, arrayPool0);
        this.c = ByteBufferGifDecoder.g;
    }

    public final GifDrawableResource a(ByteBuffer byteBuffer0, int v, int v1, GifHeaderParser gifHeaderParser0, Options options0) {
        GifDrawableResource gifDrawableResource0;
        long v2 = LogTime.getLogTime();
        try {
            GifHeader gifHeader0 = gifHeaderParser0.parseHeader();
            if(gifHeader0.getNumFrames() > 0 && gifHeader0.getStatus() == 0) {
                Bitmap.Config bitmap$Config0 = options0.get(GifOptions.DECODE_FORMAT) == DecodeFormat.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int v3 = ByteBufferGifDecoder.b(gifHeader0, v, v1);
                this.d.getClass();
                StandardGifDecoder standardGifDecoder0 = new StandardGifDecoder(this.e, gifHeader0, byteBuffer0, v3);
                standardGifDecoder0.setDefaultBitmapConfig(bitmap$Config0);
                standardGifDecoder0.advance();
                Bitmap bitmap0 = standardGifDecoder0.getNextFrame();
                if(bitmap0 != null) {
                    gifDrawableResource0 = new GifDrawableResource(new GifDrawable(this.a, standardGifDecoder0, UnitTransformation.get(), v, v1, bitmap0));
                    goto label_17;
                }
                goto label_20;
            }
            goto label_23;
        }
        catch(Throwable throwable0) {
        }
        if(Log.isLoggable("BufferGifDecoder", 2)) {
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + LogTime.getElapsedMillis(v2));
        }
        throw throwable0;
    label_17:
        if(Log.isLoggable("BufferGifDecoder", 2)) {
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + LogTime.getElapsedMillis(v2));
        }
        return gifDrawableResource0;
    label_20:
        if(Log.isLoggable("BufferGifDecoder", 2)) {
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + LogTime.getElapsedMillis(v2));
        }
        return null;
    label_23:
        if(Log.isLoggable("BufferGifDecoder", 2)) {
            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + LogTime.getElapsedMillis(v2));
        }
        return null;
    }

    public static int b(GifHeader gifHeader0, int v, int v1) {
        int v2 = Math.min(gifHeader0.getHeight() / v1, gifHeader0.getWidth() / v);
        int v3 = Math.max(1, (v2 == 0 ? 0 : Integer.highestOneBit(v2)));
        if(Log.isLoggable("BufferGifDecoder", 2) && v3 > 1) {
            StringBuilder stringBuilder0 = q.u("Downsampling GIF, sampleSize: ", v3, ", target dimens: [", v, "x");
            stringBuilder0.append(v1);
            stringBuilder0.append("], actual dimens: [");
            stringBuilder0.append(gifHeader0.getWidth());
            stringBuilder0.append("x");
            stringBuilder0.append(gifHeader0.getHeight());
            stringBuilder0.append("]");
            Log.v("BufferGifDecoder", stringBuilder0.toString());
        }
        return v3;
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((ByteBuffer)object0), v, v1, options0);
    }

    public GifDrawableResource decode(@NonNull ByteBuffer byteBuffer0, int v, int v1, @NonNull Options options0) {
        GifHeaderParser gifHeaderParser1;
        g g0 = this.c;
        synchronized(g0) {
            GifHeaderParser gifHeaderParser0 = (GifHeaderParser)g0.a.poll();
            if(gifHeaderParser0 == null) {
                gifHeaderParser0 = new GifHeaderParser();
            }
            gifHeaderParser1 = gifHeaderParser0.setData(byteBuffer0);
        }
        try {
            return this.a(byteBuffer0, v, v1, gifHeaderParser1, options0);
        }
        finally {
            synchronized(this.c) {
                gifHeaderParser1.clear();
                this.c.a.offer(gifHeaderParser1);
            }
        }
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((ByteBuffer)object0), options0);
    }

    public boolean handles(@NonNull ByteBuffer byteBuffer0, @NonNull Options options0) throws IOException {
        return !((Boolean)options0.get(GifOptions.DISABLE_ANIMATION)).booleanValue() && ImageHeaderParserUtils.getType(this.b, byteBuffer0) == ImageType.GIF;
    }
}

