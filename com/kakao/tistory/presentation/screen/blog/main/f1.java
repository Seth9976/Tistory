package com.kakao.tistory.presentation.screen.blog.main;

import androidx.lifecycle.ViewModelKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;

public final class f1 extends Lambda implements Function2 {
    public final BlogMainViewModel a;

    public f1(BlogMainViewModel blogMainViewModel0) {
        this.a = blogMainViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((String)object0), "blogName");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this.a), null, null, new e1(this.a, ((String)object0), ((Number)object1).longValue(), null), 3, null);
        return Unit.INSTANCE;
    }
}

