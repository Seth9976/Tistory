package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.presentation.common.extension.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g7 extends Lambda implements Function0 {
    public final TistoryLoginViewModel a;

    public g7(TistoryLoginViewModel tistoryLoginViewModel0) {
        this.a = tistoryLoginViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.isShowProgress().postValue(Boolean.FALSE);
        if(this.a.s) {
            this.a.k.postValue(new Event(Unit.INSTANCE));
            return Unit.INSTANCE;
        }
        this.a.j.postValue(new Event(Unit.INSTANCE));
        return Unit.INSTANCE;
    }
}

