package v2;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function2 {
    public final Function2 A;
    public final int B;
    public final int C;
    public final Alignment w;
    public final long x;
    public final Function0 y;
    public final PopupProperties z;

    public g(Alignment alignment0, long v, Function0 function00, PopupProperties popupProperties0, Function2 function20, int v1, int v2) {
        this.w = alignment0;
        this.x = v;
        this.y = function00;
        this.z = popupProperties0;
        this.A = function20;
        this.B = v1;
        this.C = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        AndroidPopup_androidKt.Popup-K5zGePQ(this.w, this.x, this.y, this.z, this.A, ((Composer)object0), (this.B | 1) & -920350135 | ((0x24924924 & (this.B | 1)) >> 1 | 306783378 & (this.B | 1)) | (306783378 & (this.B | 1)) << 1 & (0x24924924 & (this.B | 1)), this.C);
        return Unit.INSTANCE;
    }
}

