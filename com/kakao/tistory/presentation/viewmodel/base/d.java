package com.kakao.tistory.presentation.viewmodel.base;

import androidx.lifecycle.MutableLiveData;
import com.kakao.android.base.BaseKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public final TistoryViewModel a;

    public d(TistoryViewModel tistoryViewModel0) {
        this.a = tistoryViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MutableLiveData mutableLiveData0 = this.a.d;
        String s = BaseKt.getAppContext().getResources().getString(string.web_link_faq);
        Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
        mutableLiveData0.setValue(new Event(s));
        return Unit.INSTANCE;
    }
}

