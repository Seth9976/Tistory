package p0;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class w6 extends Lambda implements Function2 {
    public final Integer A;
    public final Function3 B;
    public final WindowInsets w;
    public final SubcomposeMeasureScope x;
    public final ArrayList y;
    public final ArrayList z;

    public w6(WindowInsets windowInsets0, SubcomposeMeasureScope subcomposeMeasureScope0, ArrayList arrayList0, ArrayList arrayList1, Integer integer0, Function3 function30) {
        this.w = windowInsets0;
        this.x = subcomposeMeasureScope0;
        this.y = arrayList0;
        this.z = arrayList1;
        this.A = integer0;
        this.B = function30;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        float f1;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(230985361, v, -1, "androidx.compose.material.LegacyScaffoldLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:748)");
        }
        SubcomposeMeasureScope subcomposeMeasureScope0 = this.x;
        PaddingValues paddingValues0 = WindowInsetsKt.asPaddingValues(this.w, subcomposeMeasureScope0);
        float f = this.y.isEmpty() ? paddingValues0.calculateTopPadding-D9Ej5fM() : 0.0f;
        if(this.z.isEmpty()) {
            f1 = paddingValues0.calculateBottomPadding-D9Ej5fM();
        }
        else {
            Integer integer0 = this.A;
            f1 = integer0 == null ? paddingValues0.calculateBottomPadding-D9Ej5fM() : subcomposeMeasureScope0.toDp-u2uoSUM(((int)integer0));
        }
        PaddingValues paddingValues1 = PaddingKt.PaddingValues-a9UjIt4(PaddingKt.calculateStartPadding(paddingValues0, subcomposeMeasureScope0.getLayoutDirection()), f, PaddingKt.calculateEndPadding(paddingValues0, subcomposeMeasureScope0.getLayoutDirection()), f1);
        this.B.invoke(paddingValues1, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

