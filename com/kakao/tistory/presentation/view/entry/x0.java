package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class x0 extends Lambda implements Function1 {
    public final EntryViewActivity a;

    public x0(EntryViewActivity entryViewActivity0) {
        this.a = entryViewActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((EntryItem)object0), "it");
        this.a.setTitle(((EntryItem)object0).getTitle());
        this.a.a(((EntryItem)object0));
        return Unit.INSTANCE;
    }
}

