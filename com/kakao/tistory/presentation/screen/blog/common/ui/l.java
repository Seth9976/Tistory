package com.kakao.tistory.presentation.screen.blog.common.ui;

import com.kakao.tistory.domain.blog.entity.EntryVisibilityType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final EntryVisibilityType a;
    public final EntryVisibilityType b;
    public final Function1 c;
    public final Function0 d;

    public l(EntryVisibilityType entryVisibilityType0, EntryVisibilityType entryVisibilityType1, Function1 function10, Function0 function00) {
        this.a = entryVisibilityType0;
        this.b = entryVisibilityType1;
        this.c = function10;
        this.d = function00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EntryVisibilityType entryVisibilityType0 = this.b;
        if(this.a != entryVisibilityType0) {
            this.c.invoke(entryVisibilityType0);
        }
        this.d.invoke();
        return Unit.INSTANCE;
    }
}

