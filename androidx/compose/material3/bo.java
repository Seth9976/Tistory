package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class bo extends Lambda implements Function3 {
    public final int w;

    public bo(int v) {
        this.w = v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x85AFD601, v, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:306)");
        }
        int v1 = this.w;
        if(v1 < ((List)object0).size()) {
            TabPosition tabPosition0 = (TabPosition)((List)object0).get(v1);
            Modifier modifier0 = TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.Companion, tabPosition0);
            TabRowDefaults.INSTANCE.SecondaryIndicator-9IZ8Weo(modifier0, 0.0f, 0L, ((Composer)object1), 0xC00, 6);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

