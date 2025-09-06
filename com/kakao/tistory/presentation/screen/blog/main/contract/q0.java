package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.common.Thumbnail;
import com.kakao.tistory.domain.statistics.entity.TopEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

public final class q0 extends Lambda implements Function0 {
    public final Function5 a;
    public final TopEntry b;
    public final int c;

    public q0(Function5 function50, TopEntry topEntry0, int v) {
        this.a = function50;
        this.b = topEntry0;
        this.c = v;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Thumbnail thumbnail0 = this.b.getThumbnail();
        this.a.invoke(this.b.getId(), this.b.getTitle(), (thumbnail0 == null ? null : thumbnail0.getOrigin()), this.c, this.b.getPermalink());
        return Unit.INSTANCE;
    }
}

