package com.kakao.tistory.data.revenue.datasource;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final Function2 a;

    public b(Function2 function20) {
        this.a = function20;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new RevenueGraphDataSource(this.a);
    }
}

