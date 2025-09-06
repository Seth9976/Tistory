package p0;

import androidx.compose.material.FabPlacement;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class x6 extends Lambda implements Function2 {
    public final FabPlacement w;
    public final Function2 x;

    public x6(FabPlacement fabPlacement0, Function2 function20) {
        this.w = fabPlacement0;
        this.x = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xF0F18202, v, -1, "androidx.compose.material.LegacyScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:714)");
        }
        CompositionLocalKt.CompositionLocalProvider(ScaffoldKt.getLocalFabPlacement().provides(this.w), this.x, ((Composer)object0), ProvidedValue.$stable);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

