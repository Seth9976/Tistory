package com.kakao.tistory.presentation.screen.blog.noticeList.contract;

import com.kakao.tistory.domain.blog.entity.Notice;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final Function4 a;
    public final Notice b;

    public a(Function4 function40, Notice notice0) {
        this.a = function40;
        this.b = notice0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.b.getBlogName();
        this.a.invoke(s, this.b.getId(), this.b.getTitle(), this.b.getVisibility());
        return Unit.INSTANCE;
    }
}

