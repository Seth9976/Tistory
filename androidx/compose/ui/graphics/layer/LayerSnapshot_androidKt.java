package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.media.Image.Plane;
import android.media.Image;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class LayerSnapshot_androidKt {
    public static final Bitmap access$toBitmap(Image image0) {
        Image.Plane[] arr_image$Plane = image0.getPlanes();
        Intrinsics.checkNotNull(arr_image$Plane);
        Image.Plane image$Plane0 = arr_image$Plane[0];
        int v1 = image0.getWidth();
        int v2 = image0.getHeight() * v1;
        int[] arr_v = new int[v2];
        image$Plane0.getBuffer().asIntBuffer().get(arr_v);
        for(int v = 0; v < v2; ++v) {
            int v3 = arr_v[v];
            arr_v[v] = ColorKt.toArgb-8_81llA(ColorKt.Color(v3 & 0xFF, v3 >> 8 & 0xFF, v3 >> 16 & 0xFF, v3 >> 24 & 0xFF));
        }
        return Bitmap.createBitmap(arr_v, image0.getWidth(), image0.getHeight(), Bitmap.Config.ARGB_8888);
    }
}

