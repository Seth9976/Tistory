package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.viewmodel.EntryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final EntryViewActivity a;

    public f(EntryViewActivity entryViewActivity0) {
        this.a = entryViewActivity0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EntryViewModel.onClickComment$default(EntryViewActivity.access$getEntryViewModel(this.a), null, null, 3, null);
        return Unit.INSTANCE;
    }
}

