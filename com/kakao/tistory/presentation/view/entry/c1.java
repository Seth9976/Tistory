package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.viewmodel.EntryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c1 extends Lambda implements Function1 {
    public final EntryViewModel a;

    public c1(EntryViewModel entryViewModel0) {
        this.a = entryViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "password");
        EntryViewModel.onClickComment$default(this.a, null, ((String)object0), 1, null);
        return Unit.INSTANCE;
    }
}

