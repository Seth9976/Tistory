package ca;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.designsystem.common.RotatableScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class z1 extends Lambda implements Function2 {
    public final long A;
    public final Function2 B;
    public final int C;
    public final int D;
    public final Modifier w;
    public final PaddingValues x;
    public final Function1 y;
    public final Function2 z;

    public z1(Modifier modifier0, PaddingValues paddingValues0, Function1 function10, Function2 function20, long v, Function2 function21, int v1, int v2) {
        this.w = modifier0;
        this.x = paddingValues0;
        this.y = function10;
        this.z = function20;
        this.A = v;
        this.B = function21;
        this.C = v1;
        this.D = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        RotatableScreenKt.RotatableScreen-FHprtrg(this.w, this.x, this.y, this.z, this.A, this.B, ((Composer)object0), (this.C | 1) & -920350135 | ((0x24924924 & (this.C | 1)) >> 1 | 306783378 & (this.C | 1)) | (306783378 & (this.C | 1)) << 1 & (0x24924924 & (this.C | 1)), this.D);
        return Unit.INSTANCE;
    }
}

