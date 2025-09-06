package androidx.paging;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final Function2 w;

    public e(Function2 function20) {
        this.w = function20;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return !(((PagedListListener)object0) instanceof c) || ((c)(((PagedListListener)object0))).a != this.w ? false : true;
    }
}

