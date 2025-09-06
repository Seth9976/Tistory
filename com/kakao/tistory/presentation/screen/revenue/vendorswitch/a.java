package com.kakao.tistory.presentation.screen.revenue.vendorswitch;

import com.kakao.tistory.presentation.screen.item.Vendor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final Function1 a;
    public final Vendor b;

    public a(Function1 function10, Vendor vendor0) {
        this.a = function10;
        this.b = vendor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.invoke(this.b);
        return Unit.INSTANCE;
    }
}

