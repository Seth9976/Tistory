package com.kakao.tistory.presentation.view.toppost;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class t extends Lambda implements Function1 {
    public final TopPostListActivity a;

    public t(TopPostListActivity topPostListActivity0) {
        this.a = topPostListActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        EntryItem entryItem0 = (EntryItem)object0;
        String s = null;
        if(entryItem0 == null) {
            entryItem0 = null;
        }
        else {
            String s1 = this.a.g;
            if(s1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("blogName");
            }
            else {
                s = s1;
            }
            entryItem0.setBlogName(s);
        }
        NavigatorExtensionKt.goToStatistics(this.a, entryItem0, true);
        return Unit.INSTANCE;
    }
}

