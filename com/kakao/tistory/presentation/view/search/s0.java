package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.domain.entity.SearchItem.Keyword;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class s0 extends Lambda implements Function0 {
    public final Function2 a;
    public final int b;
    public final Keyword c;

    public s0(Function2 function20, int v, Keyword searchItem$Keyword0) {
        this.a = function20;
        this.b = v;
        this.c = searchItem$Keyword0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b, this.c);
        return Unit.INSTANCE;
    }
}

