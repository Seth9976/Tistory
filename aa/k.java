package aa;

import android.graphics.Matrix;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.decoration.DecorationStatus;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function2 {
    public final Rect A;
    public final Matrix B;
    public final Matrix C;
    public final DecorationControllerInterface D;
    public final Function E;
    public final int F;
    public final int G;
    public final int w;
    public final DecorationStatus x;
    public final Object y;
    public final long z;

    public k(DecorationStatus decorationStatus0, Object object0, long v, Rect rect0, Matrix matrix0, Matrix matrix1, DecorationControllerInterface decorationControllerInterface0, Function function0, int v1, int v2, int v3) {
        this.w = v3;
        this.x = decorationStatus0;
        this.y = object0;
        this.z = v;
        this.A = rect0;
        this.B = matrix0;
        this.C = matrix1;
        this.D = decorationControllerInterface0;
        this.E = function0;
        this.F = v1;
        this.G = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                ((Number)object1).intValue();
                DecorationBoxKt.BasicDecorationBox-vzil-yM(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Function5)this.E), ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
                return Unit.INSTANCE;
            }
            case 1: {
                ((Number)object1).intValue();
                DecorationBoxKt.BasicDecorationBox-vzil-yM(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Function5)this.E), ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
                return Unit.INSTANCE;
            }
            default: {
                ((Number)object1).intValue();
                DecorationBoxKt.DecorationBox-vzil-yM(this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Function3)this.E), ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)), this.G);
                return Unit.INSTANCE;
            }
        }
    }
}

