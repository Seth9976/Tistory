package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class p extends Lambda implements Function1 {
    public final List a;
    public final String b;

    public p(List list0, String s) {
        this.a = list0;
        this.b = s;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyRow");
        CategoryKt.CategoryList.2.invoke..inlined.items.default.3 categoryKt$CategoryList$2$invoke$$inlined$items$default$30 = new CategoryKt.CategoryList.2.invoke..inlined.items.default.3(CategoryKt.CategoryList.2.invoke..inlined.items.default.1.INSTANCE, this.a);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xDA480CDF, true, new CategoryKt.CategoryList.2.invoke..inlined.items.default.4(this.a, this.b));
        ((LazyListScope)object0).items(this.a.size(), null, categoryKt$CategoryList$2$invoke$$inlined$items$default$30, composableLambda0);
        return Unit.INSTANCE;
    }
}

