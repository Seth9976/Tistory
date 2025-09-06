package w0;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f1 extends Lambda implements Function2 {
    public final Function2 A;
    public final boolean B;
    public final State C;
    public final TextStyle w;
    public final TextStyle x;
    public final float y;
    public final State z;

    public f1(TextStyle textStyle0, TextStyle textStyle1, float f, State state0, Function2 function20, boolean z, State state1) {
        this.w = textStyle0;
        this.x = textStyle1;
        this.y = f;
        this.z = state0;
        this.A = function20;
        this.B = z;
        this.C = state1;
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
            ComposerKt.traceEventStart(0xB64B33A0, v, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:139)");
        }
        TextStyle textStyle0 = TextStyleKt.lerp(this.w, this.x, this.y);
        TextStyle textStyle1 = this.B ? TextStyle.copy-p1EtxEg$default(textStyle0, ((Color)this.C.getValue()).unbox-impl(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null) : textStyle0;
        TextFieldImplKt.access$Decoration-3J-VO9M(((Color)this.z.getValue()).unbox-impl(), textStyle1, this.A, ((Composer)object0), 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

