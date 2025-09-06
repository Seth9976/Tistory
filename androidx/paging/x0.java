package androidx.paging;

import java.util.List;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class x0 extends Lambda implements Function0 {
    public final List w;
    public final LoadStates x;
    public final LoadStates y;

    public x0(List list0, LoadStates loadStates0, LoadStates loadStates1) {
        this.w = list0;
        this.x = loadStates0;
        this.y = loadStates1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list0 = k.listOf(new TransformablePage(0, this.w));
        return Insert.Companion.Refresh(list0, 0, 0, this.x, this.y);
    }
}

