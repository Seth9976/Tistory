package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.StoryCreator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class l0 extends Lambda implements Function0 {
    public final Function2 a;
    public final StoryCreator b;

    public l0(Function2 function20, StoryCreator storyCreator0) {
        this.a = function20;
        this.b = storyCreator0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.b.getLink();
        this.a.invoke(s, this.b.getLabel());
        return Unit.INSTANCE;
    }
}

