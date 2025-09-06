package androidx.paging;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class v0 extends Lambda implements Function0 {
    public final LoadStates w;
    public final LoadStates x;

    public v0(LoadStates loadStates0, LoadStates loadStates1) {
        this.w = loadStates0;
        this.x = loadStates1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list0 = k.listOf(new TransformablePage(0, CollectionsKt__CollectionsKt.emptyList()));
        return Insert.Companion.Refresh(list0, 0, 0, this.w, this.x);
    }
}

