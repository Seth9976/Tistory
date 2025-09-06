package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class ye extends Lambda implements Function3 {
    public final long A;
    public final long B;
    public final float C;
    public final Function3 D;
    public final int w;
    public final WindowInsets x;
    public final Modifier y;
    public final Shape z;

    public ye(WindowInsets windowInsets0, Modifier modifier0, Shape shape0, long v, long v1, float f, Function3 function30, int v2) {
        this.w = v2;
        this.x = windowInsets0;
        this.y = modifier0;
        this.z = shape0;
        this.A = v;
        this.B = v1;
        this.C = f;
        this.D = function30;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        if(this.w != 0) {
            int v = ((Number)object2).intValue();
            if((v & 6) == 0) {
                v |= (((Composer)object1).changed(((DrawerPredictiveBackState)object0)) ? 4 : 2);
            }
            if((v & 19) == 18 && ((Composer)object1).getSkipping()) {
                ((Composer)object1).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x5C86DF91, v, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:613)");
            }
            NavigationDrawerKt.DrawerSheet-7zSek6w(((DrawerPredictiveBackState)object0), this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object1), v & 14, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        int v1 = ((Number)object2).intValue();
        if((v1 & 6) == 0) {
            v1 |= (((Composer)object1).changed(((DrawerPredictiveBackState)object0)) ? 4 : 2);
        }
        if((v1 & 19) == 18 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xCFD79302, v1, -1, "androidx.compose.material3.DismissibleDrawerSheet.<anonymous> (NavigationDrawer.kt:701)");
        }
        NavigationDrawerKt.DrawerSheet-7zSek6w(((DrawerPredictiveBackState)object0), this.x, this.y, this.z, this.A, this.B, this.C, this.D, ((Composer)object1), v1 & 14, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

