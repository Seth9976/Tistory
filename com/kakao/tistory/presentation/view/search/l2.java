package com.kakao.tistory.presentation.view.search;

import com.kakao.tistory.domain.entity.entry.EntryItem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l2 extends Lambda implements Function0 {
    public final EntryItem a;
    public final long b;
    public final long c;

    public l2(EntryItem entryItem0, long v, long v1) {
        this.a = entryItem0;
        this.b = v;
        this.c = v1;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.setLikeCount(this.b);
        this.a.setCommentCount(this.c);
        return this.a;
    }
}

