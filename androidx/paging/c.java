package androidx.paging;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class c implements PagedListListener {
    public final Function2 a;

    public c(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "callback");
        super();
        this.a = function20;
    }

    @Override  // androidx.paging.AsyncPagedListDiffer$PagedListListener
    public final void onCurrentListChanged(PagedList pagedList0, PagedList pagedList1) {
        this.a.invoke(pagedList0, pagedList1);
    }
}

