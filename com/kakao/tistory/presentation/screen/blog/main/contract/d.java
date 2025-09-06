package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.Challenge;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public final Function1 a;
    public final Challenge b;

    public d(Function1 function10, Challenge challenge0) {
        this.a = function10;
        this.b = challenge0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b.getChallengeInfo().getTitle());
        return Unit.INSTANCE;
    }
}

