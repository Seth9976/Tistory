package com.kakao.tistory.presentation.view.entry;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function0 {
    public final EntryViewActivity a;
    public final MutableState b;

    public j(EntryViewActivity entryViewActivity0, MutableState mutableState0) {
        this.a = entryViewActivity0;
        this.b = mutableState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.b.setValue(Boolean.TRUE);
        EntryViewActivity.access$getEntryViewModel(this.a).init();
        return Unit.INSTANCE;
    }
}

