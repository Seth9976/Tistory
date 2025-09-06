package p0;

import androidx.compose.material.TabPosition;
import androidx.compose.material.TabRowDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class wa extends Lambda implements Function3 {
    public final int w;

    public wa(int v) {
        this.w = v;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xDEFDF24C, v, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:139)");
        }
        TabPosition tabPosition0 = (TabPosition)((List)object0).get(this.w);
        Modifier modifier0 = TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.Companion, tabPosition0);
        TabRowDefaults.INSTANCE.Indicator-9IZ8Weo(modifier0, 0.0f, 0L, ((Composer)object1), 0xC00, 6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

