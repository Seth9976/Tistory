package com.kakao.tistory.presentation.screen.blog.main.ui;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategoryItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function0 {
    public final BlogMainCategoryItem a;
    public final Function0 b;

    public p(BlogMainCategoryItem blogMainCategoryItem0, Function0 function00) {
        this.a = blogMainCategoryItem0;
        this.b = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.getOnClick().invoke(this.a);
        this.b.invoke();
        return Unit.INSTANCE;
    }
}

