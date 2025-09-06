package p0;

import androidx.compose.foundation.text.selection.y;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.LineHeightStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class a5 extends Lambda implements Function2 {
    public final float w;
    public final TextStyle x;
    public final LineHeightStyle y;
    public final Function2 z;

    public a5(float f, TextStyle textStyle0, LineHeightStyle lineHeightStyle0, Function2 function20) {
        this.w = f;
        this.x = textStyle0;
        this.y = lineHeightStyle0;
        this.z = function20;
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
            ComposerKt.traceEventStart(-830176860, v, -1, "androidx.compose.material.applyTextStyle.<anonymous> (ListItem.kt:430)");
        }
        CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(this.w), ComposableLambdaKt.composableLambda(((Composer)object0), 1665877604, true, new y(this.x, this.y, 6, this.z)), ((Composer)object0), ProvidedValue.$stable | 0x30);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

