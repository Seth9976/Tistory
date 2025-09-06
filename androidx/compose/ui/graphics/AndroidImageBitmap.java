package androidx.compose.ui.graphics;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000B\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u0019R\u001A\u0010\u001D\u001A\u00020\u001B8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u0019R\u0014\u0010!\u001A\u00020\u001E8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001F\u0010 R\u0014\u0010%\u001A\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b#\u0010$\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/graphics/AndroidImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "", "buffer", "", "startX", "startY", "width", "height", "bufferOffset", "stride", "", "readPixels", "([IIIIIII)V", "prepareToDraw", "()V", "a", "Landroid/graphics/Bitmap;", "getBitmap$ui_graphics_release", "()Landroid/graphics/Bitmap;", "getWidth", "()I", "getHeight", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getConfig-_sVssgQ", "config", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "", "getHasAlpha", "()Z", "hasAlpha", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AndroidImageBitmap implements ImageBitmap {
    public final Bitmap a;

    public AndroidImageBitmap(@NotNull Bitmap bitmap0) {
        this.a = bitmap0;
    }

    @NotNull
    public final Bitmap getBitmap$ui_graphics_release() {
        return this.a;
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    @NotNull
    public ColorSpace getColorSpace() {
        return Api26Bitmap.composeColorSpace$ui_graphics_release(this.a);
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public int getConfig-_sVssgQ() {
        return AndroidImageBitmap_androidKt.toImageConfig(this.a.getConfig());
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public boolean getHasAlpha() {
        return this.a.hasAlpha();
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public int getHeight() {
        return this.a.getHeight();
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public int getWidth() {
        return this.a.getWidth();
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public void prepareToDraw() {
        this.a.prepareToDraw();
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public void readPixels(@NotNull int[] arr_v, int v, int v1, int v2, int v3, int v4, int v5) {
        Bitmap bitmap0 = AndroidImageBitmap_androidKt.asAndroidBitmap(this);
        boolean z = false;
        if(bitmap0.getConfig() == Bitmap.Config.HARDWARE) {
            bitmap0 = bitmap0.copy(Bitmap.Config.ARGB_8888, false);
            z = true;
        }
        bitmap0.getPixels(arr_v, v4, v5, v, v1, v2, v3);
        if(z) {
            bitmap0.recycle();
        }
    }
}

