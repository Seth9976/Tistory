package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public final NestedScrollScope w;
    public final ScrollingLogic x;

    public w(NestedScrollScope nestedScrollScope0, ScrollingLogic scrollingLogic0) {
        this.w = nestedScrollScope0;
        this.x = scrollingLogic0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        long v = ((DragDelta)object0).getDelta-F1C5BW0();
        long v1 = this.x.singleAxisOffset-MK-Hz9U(v);
        this.w.scrollByWithOverscroll-OzD1aCk(v1, 1);
        return Unit.INSTANCE;
    }
}

