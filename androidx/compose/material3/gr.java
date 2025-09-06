package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class gr extends Lambda implements Function2 {
    public final long A;
    public final int w;
    public final Object x;
    public final Object y;
    public final long z;

    public gr(Modifier modifier0, long v, long v1, Function2 function20) {
        this.w = 2;
        this.x = modifier0;
        this.z = v;
        this.A = v1;
        this.y = function20;
        super(2);
    }

    public gr(Density density0, Configuration configuration0, long v, long v1, int v2) {
        this.w = v2;
        this.x = density0;
        this.y = configuration0;
        this.z = v;
        this.A = v1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                return Tooltip_androidKt.access$drawCaretWithPath-JKu-mZY(((CacheDrawScope)object0), x2.a, ((Density)this.x), ((Configuration)this.y), this.z, this.A, ((LayoutCoordinates)object1));
            }
            case 1: {
                return Tooltip_androidKt.access$drawCaretWithPath-JKu-mZY(((CacheDrawScope)object0), x2.b, ((Density)this.x), ((Configuration)this.y), this.z, this.A, ((LayoutCoordinates)object1));
            }
            default: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x17C7B382, v, -1, "androidx.compose.material3.BottomSheetScaffoldLayout.<anonymous> (BottomSheetScaffold.kt:360)");
                }
                SurfaceKt.Surface-T9BRK9s(((Modifier)this.x), null, this.z, this.A, 0.0f, 0.0f, null, ((Function2)this.y), ((Composer)object0), 0, 0x72);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
        }
    }
}

