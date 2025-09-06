package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoEntryEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g1 extends Lambda implements Function0 {
    public final BlogMainViewModel a;
    public final String b;
    public final long c;

    public g1(BlogMainViewModel blogMainViewModel0, String s, long v) {
        this.a = blogMainViewModel0;
        this.b = s;
        this.c = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BlogMainTiara.INSTANCE.trackClickEntryModify();
        GoEntryEditor blogMainEvent$GoEntryEditor0 = new GoEntryEditor(this.b, this.c);
        this.a.sendEvent(blogMainEvent$GoEntryEditor0);
        return Unit.INSTANCE;
    }
}

