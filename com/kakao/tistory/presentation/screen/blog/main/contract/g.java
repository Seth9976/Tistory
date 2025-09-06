package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.Entry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final Function4 a;
    public final Entry b;

    public g(Function4 function40, Entry entry0) {
        this.a = function40;
        this.b = entry0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.b.getPassword();
        this.a.invoke(this.b.getId(), this.b.getTitle(), this.b.getVisibility(), s);
        return Unit.INSTANCE;
    }
}

