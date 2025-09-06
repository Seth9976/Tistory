package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoStoryCreator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class u2 extends Lambda implements Function2 {
    public final BlogMainViewModel a;

    public u2(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((String)object0), "link");
        Intrinsics.checkNotNullParameter(((String)object1), "label");
        BlogMainTiara.INSTANCE.trackClickTopCategory(((String)object0), ((String)object1));
        GoStoryCreator blogMainEvent$GoStoryCreator0 = new GoStoryCreator(((String)object0));
        this.a.sendEvent(blogMainEvent$GoStoryCreator0);
        return Unit.INSTANCE;
    }
}

