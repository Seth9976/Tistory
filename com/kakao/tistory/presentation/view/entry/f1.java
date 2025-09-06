package com.kakao.tistory.presentation.view.entry;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f1 extends Lambda implements Function1 {
    public final EntryViewActivity a;
    public final String b;
    public final String c;

    public f1(EntryViewActivity entryViewActivity0, String s, String s1) {
        this.a = entryViewActivity0;
        this.b = s;
        this.c = s1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "password");
        EntryViewActivity.access$getEntryViewModel(this.a).getEntry(this.b, this.c, ((String)object0));
        return Unit.INSTANCE;
    }
}

