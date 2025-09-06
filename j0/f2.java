package j0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.TextFieldScrollKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f2 extends Lambda implements Function1 {
    public final MeasureScope w;
    public final g2 x;
    public final Placeable y;
    public final int z;

    public f2(MeasureScope measureScope0, g2 g20, Placeable placeable0, int v) {
        this.w = measureScope0;
        this.x = g20;
        this.y = placeable0;
        this.z = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextLayoutResultProxy textLayoutResultProxy0 = (TextLayoutResultProxy)this.x.d.invoke();
        boolean z = this.w.getLayoutDirection() == LayoutDirection.Rtl;
        Rect rect0 = TextFieldScrollKt.access$getCursorRectInScroller(this.w, this.x.b, this.x.c, (textLayoutResultProxy0 == null ? null : textLayoutResultProxy0.getValue()), z, this.y.getWidth());
        this.x.a.update(Orientation.Horizontal, rect0, this.z, this.y.getWidth());
        int v = Math.round(-this.x.a.getOffset());
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.y, v, 0, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

