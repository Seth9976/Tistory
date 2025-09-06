package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class r1 extends Lambda implements Function2 {
    public final Shape A;
    public final long B;
    public final long C;
    public final float D;
    public final float E;
    public final Function2 F;
    public final Function3 G;
    public final BottomSheetScaffoldState w;
    public final float x;
    public final float y;
    public final boolean z;

    public r1(BottomSheetScaffoldState bottomSheetScaffoldState0, float f, float f1, boolean z, Shape shape0, long v, long v1, float f2, float f3, Function2 function20, Function3 function30) {
        this.w = bottomSheetScaffoldState0;
        this.x = f;
        this.y = f1;
        this.z = z;
        this.A = shape0;
        this.B = v;
        this.C = v1;
        this.D = f2;
        this.E = f3;
        this.F = function20;
        this.G = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x74EFCE1F, v, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous> (BottomSheetScaffold.kt:138)");
        }
        BottomSheetScaffoldKt.access$StandardBottomSheet-w7I5h1o(this.w.getBottomSheetState(), this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, ((Composer)object0), 0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

