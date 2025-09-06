package p0;

import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class fb extends Lambda implements Function2 {
    public final long A;
    public final float w;
    public final long x;
    public final Function2 y;
    public final boolean z;

    public fb(float f, long v, Function2 function20, boolean z, long v1) {
        this.w = f;
        this.x = v;
        this.y = function20;
        this.z = z;
        this.A = v1;
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
            ComposerKt.traceEventStart(0x15A0DC9E, v, -1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)");
        }
        TextStyle textStyle0 = TextStyleKt.lerp(MaterialTheme.INSTANCE.getTypography(((Composer)object0), 6).getSubtitle1(), MaterialTheme.INSTANCE.getTypography(((Composer)object0), 6).getCaption(), this.w);
        TextStyle textStyle1 = this.z ? TextStyle.copy-p1EtxEg$default(textStyle0, this.A, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null) : textStyle0;
        TextFieldImplKt.Decoration-euL9pac(this.x, textStyle1, null, this.y, ((Composer)object0), 0x180, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

