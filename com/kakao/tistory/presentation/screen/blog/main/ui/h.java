package com.kakao.tistory.presentation.screen.blog.main.ui;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategoryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function1 {
    public static final h a;

    static {
        h.a = new h();
    }

    public h() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((BlogMainCategoryItem)object0), "it");
        return Unit.INSTANCE;
    }
}

