package com.kakao.tistory.presentation.screen.blog.main;

import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k1 extends Lambda implements Function4 {
    public final BlogMainViewModel a;

    public k1(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        Intrinsics.checkNotNullParameter(((EntryVisibilityType)object3), "visibilityType");
        j1 j10 = new j1(((EntryVisibilityType)object3), this.a, ((String)object0), ((Number)object1).longValue());
        BlogMainViewModel.access$checkEntryEditable(this.a, ((Boolean)object2).booleanValue(), j10);
        return Unit.INSTANCE;
    }
}

