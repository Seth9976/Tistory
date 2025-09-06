package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.presentation.screen.blog.main.contract.RestrictType;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class o1 extends Lambda implements Function4 {
    public final String a;
    public final BlogMainViewModel b;
    public final boolean c;

    public o1(String s, BlogMainViewModel blogMainViewModel0, boolean z) {
        this.a = s;
        this.b = blogMainViewModel0;
        this.c = z;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        long v = ((Number)object0).longValue();
        Intrinsics.checkNotNullParameter(((String)object1), "title");
        Intrinsics.checkNotNullParameter(((String)object2), "pLink");
        BlogMainTiara.INSTANCE.trackClickNoticeItem(v, this.a, ((String)object2), ((String)object1));
        BlogMainViewModel.access$onClickEntry(this.b, this.a, v, this.c, ((RestrictType)object3));
        return Unit.INSTANCE;
    }
}

