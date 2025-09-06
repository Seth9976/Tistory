package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoEntry;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainEvent.GoEntryStatistics;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n1 extends Lambda implements Function5 {
    public final String a;
    public final boolean b;
    public final BlogMainViewModel c;

    public n1(String s, boolean z, BlogMainViewModel blogMainViewModel0) {
        this.a = s;
        this.b = z;
        this.c = blogMainViewModel0;
        super(5);
    }

    @Override  // kotlin.jvm.functions.Function5
    public final Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4) {
        long v = ((Number)object0).longValue();
        Intrinsics.checkNotNullParameter(((String)object1), "title");
        Intrinsics.checkNotNullParameter(((String)object4), "url");
        BlogMainTiara.INSTANCE.trackClickTopEntry(((String)object1), ((String)object2), ((String)object4), ((Number)object3).intValue(), v, this.a);
        if(this.b) {
            GoEntryStatistics blogMainEvent$GoEntryStatistics0 = new GoEntryStatistics(this.a, v, ((String)object1));
            this.c.sendEvent(blogMainEvent$GoEntryStatistics0);
            return Unit.INSTANCE;
        }
        GoEntry blogMainEvent$GoEntry0 = new GoEntry(this.a, v);
        this.c.sendEvent(blogMainEvent$GoEntry0);
        return Unit.INSTANCE;
    }
}

