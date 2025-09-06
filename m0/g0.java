package m0;

import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function1 {
    public final TextFieldCoreModifierNode w;
    public final MeasureScope x;
    public final int y;
    public final Placeable z;

    public g0(TextFieldCoreModifierNode textFieldCoreModifierNode0, MeasureScope measureScope0, int v, Placeable placeable0) {
        this.w = textFieldCoreModifierNode0;
        this.x = measureScope0;
        this.y = v;
        this.z = placeable0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = this.w.s.getVisualText().getSelection-d9O1mEE();
        LayoutDirection layoutDirection0 = this.x.getLayoutDirection();
        TextFieldCoreModifierNode.access$updateScrollState-tIlFzwE(this.w, this.x, this.y, this.z.getHeight(), v, layoutDirection0);
        int v1 = this.w.w.getValue();
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.z, 0, -v1, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

