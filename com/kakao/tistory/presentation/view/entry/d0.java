package com.kakao.tistory.presentation.view.entry;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function0 {
    public final EntryViewActivity a;

    public d0(EntryViewActivity entryViewActivity0) {
        this.a = entryViewActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EntryViewActivity.access$getEntryViewModel(this.a).onClickLike();
        return Unit.INSTANCE;
    }
}

