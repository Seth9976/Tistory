package p0;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material.ExposedDropdownMenuBoxScope;
import androidx.compose.material.MenuKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class d4 extends Lambda implements Function2 {
    public final Object A;
    public final Object B;
    public final Object C;
    public final int w;
    public final Function3 x;
    public final Object y;
    public final Object z;

    public d4(Object object0, Object object1, Object object2, Object object3, Object object4, Function3 function30, int v) {
        this.w = v;
        this.y = object0;
        this.z = object1;
        this.A = object2;
        this.B = object3;
        this.C = object4;
        this.x = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        float f1;
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC97DED32, v, -1, "androidx.compose.material.ScaffoldLayoutWithMeasureFix.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:569)");
            }
            SubcomposeMeasureScope subcomposeMeasureScope0 = (SubcomposeMeasureScope)this.z;
            PaddingValues paddingValues0 = WindowInsetsKt.asPaddingValues(((WindowInsets)this.y), subcomposeMeasureScope0);
            float f = ((ArrayList)this.A).isEmpty() ? paddingValues0.calculateTopPadding-D9Ej5fM() : 0.0f;
            if(((ArrayList)this.B).isEmpty()) {
                f1 = paddingValues0.calculateBottomPadding-D9Ej5fM();
            }
            else {
                Integer integer0 = (Integer)this.C;
                f1 = integer0 == null ? paddingValues0.calculateBottomPadding-D9Ej5fM() : subcomposeMeasureScope0.toDp-u2uoSUM(((int)integer0));
            }
            PaddingValues paddingValues1 = PaddingKt.PaddingValues-a9UjIt4(PaddingKt.calculateStartPadding(paddingValues0, subcomposeMeasureScope0.getLayoutDirection()), f, PaddingKt.calculateEndPadding(paddingValues0, subcomposeMeasureScope0.getLayoutDirection()), f1);
            this.x.invoke(paddingValues1, ((Composer)object0), 0);
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
            ComposerKt.traceEventStart(1001349006, v1, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu.<anonymous> (ExposedDropdownMenu.android.kt:265)");
        }
        Modifier modifier0 = ExposedDropdownMenuBoxScope.exposedDropdownSize$default(((ExposedDropdownMenuBoxScope)this.B), ((Modifier)this.C), false, 1, null);
        MenuKt.DropdownMenuContent(((MutableTransitionState)this.y), ((MutableState)this.z), ((ScrollState)this.A), modifier0, this.x, ((Composer)object0), MutableTransitionState.$stable | 0x30, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

