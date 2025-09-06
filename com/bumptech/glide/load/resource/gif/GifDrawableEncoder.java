package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;

public class GifDrawableEncoder implements ResourceEncoder {
    public boolean encode(@NonNull Resource resource0, @NonNull File file0, @NonNull Options options0) {
        GifDrawable gifDrawable0 = (GifDrawable)resource0.get();
        try {
            ByteBufferUtil.toFile(gifDrawable0.getBuffer(), file0);
            return true;
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", iOException0);
            }
            return false;
        }
    }

    @Override  // com.bumptech.glide.load.Encoder
    public boolean encode(@NonNull Object object0, @NonNull File file0, @NonNull Options options0) {
        return this.encode(((Resource)object0), file0, options0);
    }

    @Override  // com.bumptech.glide.load.ResourceEncoder
    @NonNull
    public EncodeStrategy getEncodeStrategy(@NonNull Options options0) {
        return EncodeStrategy.SOURCE;
    }
}

