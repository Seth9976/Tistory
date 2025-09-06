package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.common.extension.NavigatorExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i1 extends Lambda implements Function1 {
    public final EntryViewActivity a;

    public i1(EntryViewActivity entryViewActivity0) {
        this.a = entryViewActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        NavigatorExtensionKt.goToWebView$default(this.a, ((String)object0), false, false, false, false, 30, null);
        return Unit.INSTANCE;
    }
}

