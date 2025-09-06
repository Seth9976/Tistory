package pa;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;

public final class c extends Lambda implements Function2 {
    public final int w;
    public static final c x;
    public static final c y;

    static {
        c.x = new c(2, 0);
        c.y = new c(2, 1);
    }

    public c(int v, int v1) {
        this.w = v1;
        super(v);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-467201360, v, -1, "com.kakao.kandinsky.resize.ComposableSingletons$ReSizeScreenKt.lambda-3.<anonymous> (ReSizeScreen.kt:83)");
            }
            ReSizeScreenKt.access$DefaultTypeToolbar-SUCSAKA(null, 0x19000000190L, 400, ExtensionsKt.persistentListOf(new Integer[]{300, 400, 500, 600, 700, 800, 900, 1000}), true, a.C, a.D, b.y, a.E, a.F, a.G, ((Composer)object0), 920350128, 6, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object1).intValue();
        if((v1 & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB6BE5F02, v1, -1, "com.kakao.kandinsky.resize.ComposableSingletons$ReSizeScreenKt.lambda-1.<anonymous> (ReSizeScreen.kt:60)");
        }
        ReSizeScreenKt.access$DefaultTypeToolbar-SUCSAKA(null, 0x19000000190L, 400, ExtensionsKt.persistentListOf(new Integer[]{300, 400, 500, 600, 700, 800, 900, 1000}), true, a.x, a.y, b.x, a.z, a.A, a.B, ((Composer)object0), 920350128, 6, 1);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

