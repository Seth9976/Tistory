package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainCategoryItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final List a;
    public final BlogMainCategoryItem b;
    public final Function0 c;

    public c(List list0, BlogMainCategoryItem blogMainCategoryItem0, Function0 function00) {
        this.a = list0;
        this.b = blogMainCategoryItem0;
        this.c = function00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        BlogMainCategoryBottomSheetKt.BlogMainCategoryBottomSheet.2.1.1.invoke..inlined.itemsIndexed.default.2 blogMainCategoryBottomSheetKt$BlogMainCategoryBottomSheet$2$1$1$invoke$$inlined$itemsIndexed$default$20 = new BlogMainCategoryBottomSheetKt.BlogMainCategoryBottomSheet.2.1.1.invoke..inlined.itemsIndexed.default.2(this.a);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new BlogMainCategoryBottomSheetKt.BlogMainCategoryBottomSheet.2.1.1.invoke..inlined.itemsIndexed.default.3(this.a, this.b, this.c, this.a));
        ((LazyListScope)object0).items(this.a.size(), null, blogMainCategoryBottomSheetKt$BlogMainCategoryBottomSheet$2$1$1$invoke$$inlined$itemsIndexed$default$20, composableLambda0);
        return Unit.INSTANCE;
    }
}

