package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.RestrictType;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b2 extends Lambda implements Function5 {
    public final String a;
    public final BlogMainViewModel b;
    public final boolean c;

    public b2(String s, BlogMainViewModel blogMainViewModel0, boolean z) {
        this.a = s;
        this.b = blogMainViewModel0;
        this.c = z;
        super(5);
    }

    @Override  // kotlin.jvm.functions.Function5
    public final Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4) {
        long v = ((Number)object0).longValue();
        Intrinsics.checkNotNullParameter(((String)object1), "title");
        Intrinsics.checkNotNullParameter(((String)object2), "pLink");
        BlogMainTiara.INSTANCE.trackClickEntryItem(this.a, v, ((String)object1), ((String)object2), ((String)object3), ((RestrictType)object4));
        BlogMainViewModel.access$onClickEntry(this.b, this.a, v, this.c, ((RestrictType)object4));
        return Unit.INSTANCE;
    }
}

