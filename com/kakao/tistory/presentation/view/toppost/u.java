package com.kakao.tistory.presentation.view.toppost;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u extends Lambda implements Function1 {
    public final TopPostListActivity a;

    public u(TopPostListActivity topPostListActivity0) {
        this.a = topPostListActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((EntryItem)object0), "it");
        TopPostListActivity topPostListActivity0 = this.a;
        String s = topPostListActivity0.g;
        if(s == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blogName");
            s = null;
        }
        NavigatorExtensionKt.goToEntryView$default(topPostListActivity0, s, ((EntryItem)object0).getId(), null, null, null, 28, null);
        return Unit.INSTANCE;
    }
}

