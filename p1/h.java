package p1;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import androidx.annotation.DoNotInline;
import org.jetbrains.annotations.NotNull;

public final class h {
    public static final h a;

    static {
        h.a = new h();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @DoNotInline
    @NotNull
    public final float[] a(@NotNull ColorMatrixColorFilter colorMatrixColorFilter0) {
        ColorMatrix colorMatrix0 = new ColorMatrix();
        colorMatrixColorFilter0.getColorMatrix(colorMatrix0);
        return androidx.compose.ui.graphics.ColorMatrix.constructor-impl(colorMatrix0.getArray());
    }
}

