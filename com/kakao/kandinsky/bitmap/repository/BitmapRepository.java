package com.kakao.kandinsky.bitmap.repository;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Size;
import com.kakao.kandinsky.bitmap.bitmap.BitmapUtils;
import com.kakao.kandinsky.delegate.BitmapLoader;
import com.kakao.kandinsky.utils.Logger;
import java.io.File;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s9.a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u000E\u001A\u0004\u0018\u00010\r2\u0006\u0010\n\u001A\u00020\u00012\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\u000BH\u0086@¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\u0011\u001A\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/kandinsky/bitmap/repository/BitmapRepository;", "", "Landroid/content/Context;", "context", "Landroid/content/ContentResolver;", "contentResolver", "Lcom/kakao/kandinsky/delegate/BitmapLoader;", "bitmapLoader", "<init>", "(Landroid/content/Context;Landroid/content/ContentResolver;Lcom/kakao/kandinsky/delegate/BitmapLoader;)V", "imageData", "Landroid/util/Size;", "requireSize", "Landroid/graphics/Bitmap;", "getBitmap", "(Ljava/lang/Object;Landroid/util/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uri", "getBitmapSize", "(Ljava/lang/String;)Landroid/util/Size;", "bitmap_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BitmapRepository {
    public final Context a;
    public final ContentResolver b;
    public final BitmapLoader c;
    public final Lazy d;

    @Inject
    public BitmapRepository(@NotNull Context context0, @NotNull ContentResolver contentResolver0, @Nullable BitmapLoader bitmapLoader0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(contentResolver0, "contentResolver");
        super();
        this.a = context0;
        this.b = contentResolver0;
        this.c = bitmapLoader0;
        this.d = c.lazy(a.w);
    }

    @Nullable
    public final Object getBitmap(@NotNull Object object0, @Nullable Size size0, @NotNull Continuation continuation0) {
        return this.c == null ? null : this.c.getBitmap(this.a, object0, size0, continuation0);
    }

    public static Object getBitmap$default(BitmapRepository bitmapRepository0, Object object0, Size size0, Continuation continuation0, int v, Object object1) {
        if((v & 2) != 0) {
            size0 = null;
        }
        return bitmapRepository0.getBitmap(object0, size0, continuation0);
    }

    @Deprecated(message = "문제가 많음.. 분기 처리 불가")
    @NotNull
    public final Size getBitmapSize(@NotNull String s) {
        Uri uri0;
        Intrinsics.checkNotNullParameter(s, "uri");
        BitmapUtils bitmapUtils0 = BitmapUtils.INSTANCE;
        if(((Regex)this.d.getValue()).matches(s)) {
            Logger.INSTANCE.log("bitmap uri");
            uri0 = Uri.parse(s);
        }
        else {
            Logger.INSTANCE.log("bitmap file");
            uri0 = Uri.fromFile(new File(s));
        }
        Intrinsics.checkNotNull(uri0);
        Logger.INSTANCE.log("getBitmapSize " + s + ", " + uri0);
        return bitmapUtils0.getBitmapSize(uri0, this.b);
    }
}

