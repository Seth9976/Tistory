package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class z0 extends Lambda implements Function1 {
    public final EntryViewActivity a;

    public z0(EntryViewActivity entryViewActivity0) {
        this.a = entryViewActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((EntryItem)object0), "it");
        NavigatorExtensionKt.goToStatistics(this.a, ((EntryItem)object0), true);
        return Unit.INSTANCE;
    }
}

