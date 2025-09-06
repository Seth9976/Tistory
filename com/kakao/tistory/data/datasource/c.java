package com.kakao.tistory.data.datasource;

import androidx.paging.PagingSource.LoadResult.Error;
import com.kakao.android.base.model.ErrorModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class c extends Lambda implements Function1 {
    public final ObjectRef a;

    public c(ObjectRef ref$ObjectRef0) {
        this.a = ref$ObjectRef0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((ErrorModel)object0), "it");
        this.a.element = new Error(new Throwable());
        return Unit.INSTANCE;
    }
}

