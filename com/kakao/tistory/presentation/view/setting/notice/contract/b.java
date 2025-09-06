package com.kakao.tistory.presentation.view.setting.notice.contract;

import com.kakao.tistory.domain.blog.entity.Entry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final Function3 a;
    public final Entry b;

    public b(Function3 function30, Entry entry0) {
        this.a = function30;
        this.b = entry0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s = this.b.getBlogName();
        this.a.invoke(s, this.b.getId(), this.b.getTitle());
        return Unit.INSTANCE;
    }
}

