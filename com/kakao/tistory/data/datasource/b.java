package com.kakao.tistory.data.datasource;

import androidx.paging.PagingSource.LoadResult.Page;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class b extends Lambda implements Function2 {
    public final ObjectRef a;

    public b(ObjectRef ref$ObjectRef0) {
        this.a = ref$ObjectRef0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((List)object0), "items");
        this.a.element = new Page(((List)object0), null, ((Integer)object1));
        return Unit.INSTANCE;
    }
}

