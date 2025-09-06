package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoTopEntryList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y1 extends Lambda implements Function0 {
    public final BlogMainViewModel a;
    public final String b;
    public final boolean c;

    public y1(BlogMainViewModel blogMainViewModel0, String s, boolean z) {
        this.a = blogMainViewModel0;
        this.b = s;
        this.c = z;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogMainTiara.INSTANCE.trackClickTopEntryAll();
        GoTopEntryList blogMainEvent$GoTopEntryList0 = new GoTopEntryList(this.b, this.c);
        this.a.sendEvent(blogMainEvent$GoTopEntryList0);
        return Unit.INSTANCE;
    }
}

