package s0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntRect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function2 {
    public final int w;
    public static final a x;
    public static final a y;

    static {
        a.x = new a(2, 0);
        a.y = new a(2, 1);
    }

    public a(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        boolean z = false;
        if(this.w != 0) {
            if(((Offset)object0) != null && (Offset.getX-impl(((Offset)object0).unbox-impl()) < ((float)((IntRect)object1).getLeft()) || Offset.getX-impl(((Offset)object0).unbox-impl()) > ((float)((IntRect)object1).getRight()) || Offset.getY-impl(((Offset)object0).unbox-impl()) < ((float)((IntRect)object1).getTop()) || Offset.getY-impl(((Offset)object0).unbox-impl()) > ((float)((IntRect)object1).getBottom()))) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xA1E7E873, v, -1, "androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopup_androidKt.lambda-1.<anonymous> (ExposedDropdownMenuPopup.android.kt:285)");
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

