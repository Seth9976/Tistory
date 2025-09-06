package g0;

import androidx.compose.foundation.relocation.BringIntoViewResponderNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics.Kotlin;

public final class c extends FunctionReferenceImpl implements Function0 {
    public final BringIntoViewResponderNode a;
    public final LayoutCoordinates b;
    public final Function0 c;

    public c(BringIntoViewResponderNode bringIntoViewResponderNode0, LayoutCoordinates layoutCoordinates0, Function0 function00) {
        this.a = bringIntoViewResponderNode0;
        this.b = layoutCoordinates0;
        this.c = function00;
        super(0, Kotlin.class, "localRect", "bringChildIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return BringIntoViewResponderNode.access$bringChildIntoView$localRect(this.a, this.b, this.c);
    }
}

