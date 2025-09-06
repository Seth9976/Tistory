package com.kakao.tistory.presentation.screen.blog.main.contract;

import com.kakao.tistory.domain.blog.entity.EntryRestrictType;
import com.kakao.tistory.domain.blog.entity.Notice;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

public final class n0 extends Lambda implements Function0 {
    public final Function4 a;
    public final Notice b;

    public n0(Function4 function40, Notice notice0) {
        this.a = function40;
        this.b = notice0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EntryRestrictType entryRestrictType0 = this.b.getRestrictType();
        RestrictType restrictType0 = entryRestrictType0 == null ? null : BlogMainEntryRestrictTypeKt.toState(entryRestrictType0);
        this.a.invoke(this.b.getId(), this.b.getTitle(), this.b.getPermalink(), restrictType0);
        return Unit.INSTANCE;
    }
}

