package com.kakao.tistory.presentation.view.entry;

import com.kakao.tistory.presentation.common.utils.ToastUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class w0 extends Lambda implements Function1 {
    public final EntryViewActivity a;

    public w0(EntryViewActivity entryViewActivity0) {
        this.a = entryViewActivity0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ToastUtils.show$default(ToastUtils.INSTANCE, this.a, ((Number)object0).intValue(), 0, 0, 12, null);
        return Unit.INSTANCE;
    }
}

