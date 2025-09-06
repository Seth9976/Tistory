package ma;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import com.kakao.kandinsky.mosaic.ui.MosaicDecorationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;

public final class l extends Lambda implements Function2 {
    public final MosaicAndBlurBitmapLoader A;
    public final DecorationControllerInterface B;
    public final int C;
    public final DecorationStatus w;
    public final ImmutableList x;
    public final Absolute y;
    public final Rect z;

    public l(DecorationStatus decorationStatus0, ImmutableList immutableList0, Absolute decoration$Absolute0, Rect rect0, MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, DecorationControllerInterface decorationControllerInterface0, int v) {
        this.w = decorationStatus0;
        this.x = immutableList0;
        this.y = decoration$Absolute0;
        this.z = rect0;
        this.A = mosaicAndBlurBitmapLoader0;
        this.B = decorationControllerInterface0;
        this.C = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        MosaicDecorationKt.MosaicDecoration-w1lL6yk(this.w, this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)));
        return Unit.INSTANCE;
    }
}

