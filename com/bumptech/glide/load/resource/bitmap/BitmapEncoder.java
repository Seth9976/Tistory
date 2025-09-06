package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.BufferedOutputStream;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.LogTime;
import com.bumptech.glide.util.Util;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BitmapEncoder implements ResourceEncoder {
    public static final Option COMPRESSION_FORMAT;
    public static final Option COMPRESSION_QUALITY;
    public final ArrayPool a;

    static {
        BitmapEncoder.COMPRESSION_QUALITY = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);
        BitmapEncoder.COMPRESSION_FORMAT = Option.memory("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat");
    }

    @Deprecated
    public BitmapEncoder() {
        this.a = null;
    }

    public BitmapEncoder(@NonNull ArrayPool arrayPool0) {
        this.a = arrayPool0;
    }

    public boolean encode(@NonNull Resource resource0, @NonNull File file0, @NonNull Options options0) {
        boolean z;
        ArrayPool arrayPool0;
        FileOutputStream fileOutputStream0;
        Bitmap bitmap0 = (Bitmap)resource0.get();
        Bitmap.CompressFormat bitmap$CompressFormat0 = (Bitmap.CompressFormat)options0.get(BitmapEncoder.COMPRESSION_FORMAT);
        if(bitmap$CompressFormat0 == null) {
            bitmap$CompressFormat0 = bitmap0.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap0.getWidth();
        bitmap0.getHeight();
        long v = LogTime.getLogTime();
        int v1 = (int)(((Integer)options0.get(BitmapEncoder.COMPRESSION_QUALITY)));
        BufferedOutputStream bufferedOutputStream0 = null;
        try {
            try {
                fileOutputStream0 = new FileOutputStream(file0);
                arrayPool0 = this.a;
                if(arrayPool0 == null) {
                    goto label_18;
                }
                else {
                    bufferedOutputStream0 = fileOutputStream0;
                    bufferedOutputStream0 = new BufferedOutputStream(fileOutputStream0, arrayPool0);
                }
                goto label_19;
            }
            catch(IOException iOException0) {
                goto label_23;
            }
            try {
                bufferedOutputStream0 = fileOutputStream0;
                bufferedOutputStream0 = new BufferedOutputStream(fileOutputStream0, arrayPool0);
                goto label_19;
            }
            catch(IOException iOException0) {
            }
        }
        catch(Throwable throwable0) {
            goto label_30;
        }
        bufferedOutputStream0 = fileOutputStream0;
        goto label_23;
    label_18:
        bufferedOutputStream0 = fileOutputStream0;
        try {
        label_19:
            bitmap0.compress(bitmap$CompressFormat0, v1, bufferedOutputStream0);
            bufferedOutputStream0.close();
        }
        catch(IOException iOException0) {
            try {
            label_23:
                if(Log.isLoggable("BitmapEncoder", 3)) {
                    Log.d("BitmapEncoder", "Failed to encode Bitmap", iOException0);
                }
            }
            catch(Throwable throwable0) {
                goto label_30;
            }
            if(bufferedOutputStream0 != null) {
                try {
                    bufferedOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            z = false;
            goto label_35;
        }
        catch(Throwable throwable0) {
        label_30:
            if(bufferedOutputStream0 != null) {
                try {
                    bufferedOutputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
        }
        try {
            bufferedOutputStream0.close();
            z = true;
        }
        catch(IOException unused_ex) {
        }
    label_35:
        if(Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + bitmap$CompressFormat0 + " of size " + Util.getBitmapByteSize(bitmap0) + " in " + LogTime.getElapsedMillis(v) + ", options format: " + options0.get(BitmapEncoder.COMPRESSION_FORMAT) + ", hasAlpha: " + bitmap0.hasAlpha());
        }
        return z;
    }

    @Override  // com.bumptech.glide.load.Encoder
    public boolean encode(@NonNull Object object0, @NonNull File file0, @NonNull Options options0) {
        return this.encode(((Resource)object0), file0, options0);
    }

    @Override  // com.bumptech.glide.load.ResourceEncoder
    @NonNull
    public EncodeStrategy getEncodeStrategy(@NonNull Options options0) {
        return EncodeStrategy.TRANSFORMED;
    }
}

