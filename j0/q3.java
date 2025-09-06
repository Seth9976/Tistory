package j0;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.TextFieldScrollKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class q3 extends Lambda implements Function1 {
    public final MeasureScope w;
    public final r3 x;
    public final Placeable y;
    public final int z;

    public q3(MeasureScope measureScope0, r3 r30, Placeable placeable0, int v) {
        this.w = measureScope0;
        this.x = r30;
        this.y = placeable0;
        this.z = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        TextLayoutResultProxy textLayoutResultProxy0 = (TextLayoutResultProxy)this.x.d.invoke();
        Rect rect0 = TextFieldScrollKt.access$getCursorRectInScroller(this.w, this.x.b, this.x.c, (textLayoutResultProxy0 == null ? null : textLayoutResultProxy0.getValue()), false, this.y.getWidth());
        this.x.a.update(Orientation.Vertical, rect0, this.z, this.y.getHeight());
        int v = Math.round(-this.x.a.getOffset());
        PlacementScope.placeRelative$default(((PlacementScope)object0), this.y, 0, v, 0.0f, 4, null);
        return Unit.INSTANCE;
    }
}

