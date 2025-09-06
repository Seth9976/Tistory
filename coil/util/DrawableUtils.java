package coil.util;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.WorkerThread;
import coil.decode.DecodeUtils;
import coil.size.-Sizes;
import coil.size.Scale;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zd.c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J7\u0010\r\u001A\u00020\f2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcoil/util/DrawableUtils;", "", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/Bitmap$Config;", "config", "Lcoil/size/Size;", "size", "Lcoil/size/Scale;", "scale", "", "allowInexactSize", "Landroid/graphics/Bitmap;", "convertToBitmap", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lcoil/size/Size;Lcoil/size/Scale;Z)Landroid/graphics/Bitmap;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDrawableUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawableUtils.kt\ncoil/util/DrawableUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\ncoil/util/-Utils\n+ 4 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 5 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,96:1\n1#2:97\n219#3:98\n223#3:99\n219#3:105\n223#3:106\n95#4:100\n38#5:101\n49#5:102\n60#5:103\n71#5:104\n*S KotlinDebug\n*F\n+ 1 DrawableUtils.kt\ncoil/util/DrawableUtils\n*L\n54#1:98\n55#1:99\n89#1:105\n90#1:106\n61#1:100\n63#1:101\n63#1:102\n63#1:103\n63#1:104\n*E\n"})
public final class DrawableUtils {
    @NotNull
    public static final DrawableUtils INSTANCE;

    static {
        DrawableUtils.INSTANCE = new DrawableUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @WorkerThread
    @NotNull
    public final Bitmap convertToBitmap(@NotNull Drawable drawable0, @NotNull Bitmap.Config bitmap$Config0, @NotNull Size size0, @NotNull Scale scale0, boolean z) {
        if(drawable0 instanceof BitmapDrawable) {
            Bitmap bitmap0 = ((BitmapDrawable)drawable0).getBitmap();
            if(bitmap0.getConfig() == -Bitmaps.toSoftware(bitmap$Config0) && (z || DecodeUtils.computeSizeMultiplier(bitmap0.getWidth(), bitmap0.getHeight(), (-Sizes.isOriginal(size0) ? bitmap0.getWidth() : -Utils.toPx(size0.getWidth(), scale0)), (-Sizes.isOriginal(size0) ? bitmap0.getHeight() : -Utils.toPx(size0.getHeight(), scale0)), scale0) == 1.0)) {
                return bitmap0;
            }
        }
        Drawable drawable1 = drawable0.mutate();
        int v = -Utils.getWidth(drawable1);
        int v1 = 0x200;
        if(v <= 0) {
            v = 0x200;
        }
        int v2 = -Utils.getHeight(drawable1);
        if(v2 > 0) {
            v1 = v2;
        }
        double f = DecodeUtils.computeSizeMultiplier(v, v1, (-Sizes.isOriginal(size0) ? v : -Utils.toPx(size0.getWidth(), scale0)), (-Sizes.isOriginal(size0) ? v1 : -Utils.toPx(size0.getHeight(), scale0)), scale0);
        int v3 = c.roundToInt(((double)v) * f);
        int v4 = c.roundToInt(f * ((double)v1));
        Bitmap bitmap1 = Bitmap.createBitmap(v3, v4, -Bitmaps.toSoftware(bitmap$Config0));
        Rect rect0 = drawable1.getBounds();
        int v5 = rect0.left;
        int v6 = rect0.top;
        int v7 = rect0.right;
        int v8 = rect0.bottom;
        drawable1.setBounds(0, 0, v3, v4);
        drawable1.draw(new Canvas(bitmap1));
        drawable1.setBounds(v5, v6, v7, v8);
        return bitmap1;
    }
}

