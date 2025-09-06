package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v1 extends Lambda implements Function2 {
    public final Function2 A;
    public final Function0 B;
    public final SheetState C;
    public final long D;
    public final long E;
    public final int F;
    public final Modifier w;
    public final Function2 x;
    public final Function2 y;
    public final Function2 z;

    public v1(Modifier modifier0, Function2 function20, Function2 function21, Function2 function22, Function2 function23, Function0 function00, SheetState sheetState0, long v, long v1, int v2) {
        this.w = modifier0;
        this.x = function20;
        this.y = function21;
        this.z = function22;
        this.A = function23;
        this.B = function00;
        this.C = sheetState0;
        this.D = v;
        this.E = v1;
        this.F = v2;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Number)object1).intValue();
        BottomSheetScaffoldKt.a(this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, ((Composer)object0), (this.F | 1) & -920350135 | ((0x24924924 & (this.F | 1)) >> 1 | 306783378 & (this.F | 1)) | (306783378 & (this.F | 1)) << 1 & (0x24924924 & (this.F | 1)));
        return Unit.INSTANCE;
    }
}

