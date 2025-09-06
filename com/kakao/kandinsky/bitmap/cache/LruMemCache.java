package com.kakao.kandinsky.bitmap.cache;

import android.graphics.Bitmap;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000B2\u00020\u0001:\u0001\u000BB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bJ\u0006\u0010\t\u001A\u00020\u0004J\u0010\u0010\n\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001A\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/kakao/kandinsky/bitmap/cache/LruMemCache;", "", "()V", "addBitmap", "", "key", "", "bitmap", "Landroid/graphics/Bitmap;", "clearCache", "getBitmap", "Companion", "bitmap_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLruMemCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruMemCache.kt\ncom/kakao/kandinsky/bitmap/cache/LruMemCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1#2:33\n*E\n"})
public final class LruMemCache {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/kandinsky/bitmap/cache/LruMemCache$Companion;", "", "Landroid/util/LruCache;", "", "Landroid/graphics/Bitmap;", "memoryCache", "Landroid/util/LruCache;", "bitmap_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public static final LruMemCache.Companion.1 a;

    static {
        LruMemCache.Companion = new Companion(null);
        LruMemCache.a = new LruMemCache.Companion.1(((int)(Runtime.getRuntime().maxMemory() / 0x400L)) / 8);  // 初始化器: Landroid/util/LruCache;-><init>(I)V
    }

    public final void addBitmap(@NotNull String s, @NotNull Bitmap bitmap0) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(bitmap0, "bitmap");
        LruMemCache.a.put(s, bitmap0);
    }

    public final void clearCache() {
        LruMemCache.a.evictAll();
    }

    @Nullable
    public final Bitmap getBitmap(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "key");
        Bitmap bitmap0 = (Bitmap)LruMemCache.a.get(s);
        Logger.INSTANCE.log(s + " is " + (bitmap0 == null ? "NOT exist" : "exist"));
        return bitmap0;
    }
}

