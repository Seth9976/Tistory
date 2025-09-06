package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.util.List;

public final class b {
    public final ThumbnailQuery a;
    public final ArrayPool b;
    public final ContentResolver c;
    public final List d;

    static {
    }

    public b(List list0, ThumbnailQuery thumbnailQuery0, ArrayPool arrayPool0, ContentResolver contentResolver0) {
        this.a = thumbnailQuery0;
        this.b = arrayPool0;
        this.c = contentResolver0;
        this.d = list0;
    }
}

