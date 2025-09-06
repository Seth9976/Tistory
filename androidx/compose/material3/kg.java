package androidx.compose.material3;

import aa.w;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class kg extends Lambda implements Function2 {
    public final State w;
    public final NavigationRailItemColors x;
    public final Shape y;

    public kg(State state0, NavigationRailItemColors navigationRailItemColors0, Shape shape0) {
        this.w = state0;
        this.x = navigationRailItemColors0;
        this.y = shape0;
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
            ComposerKt.traceEventStart(0x9103F59E, v, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:269)");
        }
        Modifier modifier0 = LayoutIdKt.layoutId(Modifier.Companion, "indicator");
        State state0 = this.w;
        boolean z = ((Composer)object0).changed(state0);
        w w0 = ((Composer)object0).rememberedValue();
        if(z || w0 == Composer.Companion.getEmpty()) {
            w0 = new w(state0, 2);
            ((Composer)object0).updateRememberedValue(w0);
        }
        BoxKt.Box(BackgroundKt.background-bw27NRU(GraphicsLayerModifierKt.graphicsLayer(modifier0, w0), this.x.getIndicatorColor-0d7_KjU$material3_release(), this.y), ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

