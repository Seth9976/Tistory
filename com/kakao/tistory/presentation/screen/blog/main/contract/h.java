package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.Entry;
import com.kakao.tistory.domain.common.Thumbnail;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function0 {
    public final Function5 a;
    public final Entry b;
    public final RestrictType c;

    public h(Function5 function50, Entry entry0, RestrictType restrictType0) {
        this.a = function50;
        this.b = entry0;
        this.c = restrictType0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Thumbnail thumbnail0 = this.b.getThumbnail();
        this.a.invoke(this.b.getId(), this.b.getTitle(), this.b.getPermalink(), (thumbnail0 == null ? null : thumbnail0.getOrigin()), this.c);
        return Unit.INSTANCE;
    }
}

