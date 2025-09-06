package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ByteBufferEncoder implements Encoder {
    @Override  // com.bumptech.glide.load.Encoder
    public boolean encode(@NonNull Object object0, @NonNull File file0, @NonNull Options options0) {
        return this.encode(((ByteBuffer)object0), file0, options0);
    }

    public boolean encode(@NonNull ByteBuffer byteBuffer0, @NonNull File file0, @NonNull Options options0) {
        try {
            ByteBufferUtil.toFile(byteBuffer0, file0);
            return true;
        }
        catch(IOException iOException0) {
            if(Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", iOException0);
            }
            return false;
        }
    }
}

