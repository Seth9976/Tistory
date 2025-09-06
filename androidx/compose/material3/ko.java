package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class ko extends Lambda implements Function2 {
    public final Function2 w;
    public final Function2 x;
    public final Function3 y;

    public ko(Function2 function20, Function2 function21, Function3 function30) {
        this.w = function20;
        this.x = function21;
        this.y = function30;
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
            ComposerKt.traceEventStart(0x9F93D1E0, v, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:948)");
        }
        Modifier modifier0 = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
        Function2 function20 = this.w;
        boolean z = ((Composer)object0).changed(function20);
        Function2 function21 = this.x;
        boolean z1 = ((Composer)object0).changed(function21);
        Function3 function30 = this.y;
        boolean z2 = ((Composer)object0).changed(function30);
        jo jo0 = ((Composer)object0).rememberedValue();
        if((z | z1 | z2) != 0 || jo0 == Composer.Companion.getEmpty()) {
            jo0 = new jo(function20, function21, function30);
            ((Composer)object0).updateRememberedValue(jo0);
        }
        SubcomposeLayoutKt.SubcomposeLayout(modifier0, jo0, ((Composer)object0), 6, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

