package p0;

import androidx.compose.material.BottomNavigationKt;
import androidx.compose.material.NavigationRailKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class f1 extends Lambda implements Function3 {
    public final int w;
    public final boolean x;
    public final Function2 y;
    public final ComposableLambda z;

    public f1(boolean z, Function2 function20, ComposableLambda composableLambda0, int v) {
        this.w = v;
        this.x = z;
        this.y = function20;
        this.z = composableLambda0;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            float f = ((Number)object0).floatValue();
            int v = ((Number)object2).intValue();
            if((v & 14) == 0) {
                v |= (((Composer)object1).changed(f) ? 4 : 2);
            }
            if((v & 91) == 18 && ((Composer)object1).getSkipping()) {
                ((Composer)object1).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x27F83098, v, -1, "androidx.compose.material.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:250)");
            }
            if(this.x) {
                f = 1.0f;
            }
            NavigationRailKt.access$NavigationRailItemBaselineLayout(this.y, this.z, f, ((Composer)object1), 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        float f1 = ((Number)object0).floatValue();
        int v1 = ((Number)object2).intValue();
        if((v1 & 14) == 0) {
            v1 |= (((Composer)object1).changed(f1) ? 4 : 2);
        }
        if((v1 & 91) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1411872801, v1, -1, "androidx.compose.material.BottomNavigationItem.<anonymous>.<anonymous> (BottomNavigation.kt:240)");
        }
        if(this.x) {
            f1 = 1.0f;
        }
        BottomNavigationKt.access$BottomNavigationItemBaselineLayout(this.y, this.z, f1, ((Composer)object1), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

