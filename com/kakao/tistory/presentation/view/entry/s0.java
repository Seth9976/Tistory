package com.kakao.tistory.presentation.view.entry;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class s0 extends Lambda implements Function1 {
    public final EntryViewActivity a;
    public final String b;
    public final long c;

    public s0(EntryViewActivity entryViewActivity0, String s, long v) {
        this.a = entryViewActivity0;
        this.b = s;
        this.c = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "password");
        EntryViewActivity.access$getEntryViewModel(this.a).getEntry(this.b, this.c, ((String)object0));
        return Unit.INSTANCE;
    }
}

