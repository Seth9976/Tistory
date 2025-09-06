package com.kakao.tistory.presentation.screen.blog.noticeList.contract;

import com.kakao.tistory.domain.blog.entity.Notice;
import com.kakao.tistory.presentation.screen.blog.main.contract.RestrictType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final Function3 a;
    public final Notice b;
    public final RestrictType c;

    public b(Function3 function30, Notice notice0, RestrictType restrictType0) {
        this.a = function30;
        this.b = notice0;
        this.c = restrictType0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b.getBlogName(), this.b.getId(), this.c);
        return Unit.INSTANCE;
    }
}

