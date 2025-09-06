package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class StreamGifDecoder implements ResourceDecoder {
    public final List a;
    public final ResourceDecoder b;
    public final ArrayPool c;

    public StreamGifDecoder(List list0, ResourceDecoder resourceDecoder0, ArrayPool arrayPool0) {
        this.a = list0;
        this.b = resourceDecoder0;
        this.c = arrayPool0;
    }

    public Resource decode(@NonNull InputStream inputStream0, int v, int v1, @NonNull Options options0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0x4000);
        try {
            byte[] arr_b = new byte[0x4000];
            int v2;
            while((v2 = inputStream0.read(arr_b)) != -1) {
                byteArrayOutputStream0.write(arr_b, 0, v2);
            }
            byteArrayOutputStream0.flush();
            goto label_13;
        }
        catch(IOException iOException0) {
        }
        if(Log.isLoggable("StreamGifDecoder", 5)) {
            Log.w("StreamGifDecoder", "Error reading data from stream", iOException0);
        }
        byte[] arr_b1 = null;
        goto label_14;
    label_13:
        arr_b1 = byteArrayOutputStream0.toByteArray();
    label_14:
        if(arr_b1 == null) {
            return null;
        }
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b1);
        return this.b.decode(byteBuffer0, v, v1, options0);
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public Resource decode(@NonNull Object object0, int v, int v1, @NonNull Options options0) throws IOException {
        return this.decode(((InputStream)object0), v, v1, options0);
    }

    public boolean handles(@NonNull InputStream inputStream0, @NonNull Options options0) throws IOException {
        return !((Boolean)options0.get(GifOptions.DISABLE_ANIMATION)).booleanValue() && ImageHeaderParserUtils.getType(this.a, inputStream0, this.c) == ImageType.GIF;
    }

    @Override  // com.bumptech.glide.load.ResourceDecoder
    public boolean handles(@NonNull Object object0, @NonNull Options options0) throws IOException {
        return this.handles(((InputStream)object0), options0);
    }
}

