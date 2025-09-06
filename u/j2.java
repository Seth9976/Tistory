package u;

import androidx.compose.foundation.MagnifierNode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j2 extends Lambda implements Function0 {
    public final MagnifierNode w;

    public j2(MagnifierNode magnifierNode0) {
        this.w = magnifierNode0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LayoutCoordinates layoutCoordinates0 = MagnifierNode.access$getLayoutCoordinates(this.w);
        return layoutCoordinates0 == null ? Offset.box-impl(0x7FC000007FC00000L) : Offset.box-impl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates0));
    }
}

