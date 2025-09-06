package n0;

import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierNodeImpl28;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function1 {
    public final int w;
    public final TextFieldMagnifierNodeImpl28 x;

    public b(TextFieldMagnifierNodeImpl28 textFieldMagnifierNodeImpl280, int v) {
        this.w = v;
        this.x = textFieldMagnifierNodeImpl280;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            long v = ((DpSize)object0).unbox-impl();
            Density density0 = (Density)CompositionLocalConsumerModifierNodeKt.currentValueOf(this.x, CompositionLocalsKt.getLocalDensity());
            long v1 = IntSizeKt.IntSize(density0.roundToPx-0680j_4(DpSize.getWidth-D9Ej5fM(v)), density0.roundToPx-0680j_4(DpSize.getHeight-D9Ej5fM(v)));
            TextFieldMagnifierNodeImpl28.access$setMagnifierSize-ozmzZPI(this.x, v1);
            return Unit.INSTANCE;
        }
        Density density1 = (Density)object0;
        return Offset.box-impl(((Offset)this.x.u.getValue()).unbox-impl());
    }
}

