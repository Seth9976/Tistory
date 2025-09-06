package androidx.paging;

import java.util.List;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function0 {
    public final List w;

    public w0(List list0) {
        this.w = list0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list0 = k.listOf(new TransformablePage(0, this.w));
        return Insert.Companion.Refresh(list0, 0, 0, LoadStates.Companion.getIDLE(), null);
    }
}

