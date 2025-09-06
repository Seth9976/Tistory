package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.statistics.entity.TopEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class k7 extends Lambda implements Function0 {
    public final TopPostViewModel a;
    public final int b;
    public final TopEntry c;

    public k7(TopPostViewModel topPostViewModel0, int v, TopEntry topEntry0) {
        this.a = topPostViewModel0;
        this.b = v;
        this.c = topEntry0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TopPostViewModel.access$onClickTopPost(this.a, this.b, this.c);
        return Unit.INSTANCE;
    }
}

