package com.kakao.kandinsky.bitmap.cache;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0003H\u0014¨\u0006\b"}, d2 = {"com/kakao/kandinsky/bitmap/cache/LruMemCache$Companion$1", "Landroid/util/LruCache;", "", "Landroid/graphics/Bitmap;", "sizeOf", "", "key", "bitmap", "bitmap_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LruMemCache.Companion.1 extends LruCache {
    @Override  // android.util.LruCache
    public int sizeOf(Object object0, Object object1) {
        return this.sizeOf(((String)object0), ((Bitmap)object1));
    }

    public int sizeOf(@NotNull String s, @NotNull Bitmap bitmap0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(bitmap0, "bitmap");
        return bitmap0.getByteCount() / 0x400;
    }
}

