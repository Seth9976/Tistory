package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@RequiresApi(27)
public final class ExifInterfaceImageHeaderParser implements ImageHeaderParser {
    @Override  // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@NonNull InputStream inputStream0, @NonNull ArrayPool arrayPool0) throws IOException {
        int v = new ExifInterface(inputStream0).getAttributeInt("Orientation", 1);
        return v == 0 ? -1 : v;
    }

    @Override  // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@NonNull ByteBuffer byteBuffer0, @NonNull ArrayPool arrayPool0) throws IOException {
        return this.getOrientation(ByteBufferUtil.toStream(byteBuffer0), arrayPool0);
    }

    @Override  // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageType getType(@NonNull InputStream inputStream0) {
        return ImageType.UNKNOWN;
    }

    @Override  // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageType getType(@NonNull ByteBuffer byteBuffer0) {
        return ImageType.UNKNOWN;
    }
}

