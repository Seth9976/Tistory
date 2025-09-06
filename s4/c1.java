package s4;

import androidx.paging.PagedListAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c1 extends Lambda implements Function2 {
    public final PagedListAdapter w;

    public c1(PagedListAdapter pagedListAdapter0) {
        this.w = pagedListAdapter0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        return Unit.INSTANCE;
    }
}

