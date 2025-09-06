package z9;

import androidx.compose.runtime.Composer;
import com.kakao.kandinsky.crop.contract.TouchCirclePoint;
import com.kakao.kandinsky.crop.ui.CropBoxKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final int A;
    public final long w;
    public final long x;
    public final TouchCirclePoint y;
    public final Function0 z;

    public g(long v, long v1, TouchCirclePoint touchCirclePoint0, Function0 function00, int v2) {
        this.w = v;
        this.x = v1;
        this.y = touchCirclePoint0;
        this.z = function00;
        this.A = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        CropBoxKt.a(this.w, this.x, this.y, this.z, ((Composer)object0), (this.A | 1) & -920350135 | ((0x24924924 & (this.A | 1)) >> 1 | 306783378 & (this.A | 1)) | (306783378 & (this.A | 1)) << 1 & (0x24924924 & (this.A | 1)));
        return Unit.INSTANCE;
    }
}

