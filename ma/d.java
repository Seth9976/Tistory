package ma;

import android.graphics.Matrix;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ImageBitmap;
import com.kakao.kandinsky.mosaic.ui.MosaicDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function2 {
    public final int A;
    public final int B;
    public final ImageBitmap w;
    public final float x;
    public final Rect y;
    public final Matrix z;

    public d(ImageBitmap imageBitmap0, float f, Rect rect0, Matrix matrix0, int v, int v1) {
        this.w = imageBitmap0;
        this.x = f;
        this.y = rect0;
        this.z = matrix0;
        this.A = v;
        this.B = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        MosaicDecorationKt.access$BitmapImage(this.w, this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)), this.B);
        return Unit.INSTANCE;
    }
}

