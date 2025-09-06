package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.domain.entity.Blog;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function1 {
    public final List a;
    public final List b;
    public final PaddingValues c;
    public final Blog d;
    public final Blog e;
    public final Function2 f;

    public f(List list0, List list1, PaddingValues paddingValues0, Blog blog0, Blog blog1, Function2 function20) {
        this.a = list0;
        this.b = list1;
        this.c = paddingValues0;
        this.d = blog0;
        this.e = blog1;
        this.f = function20;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        if(!this.a.isEmpty() && !this.b.isEmpty()) {
            ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0x45CF4381, true, new b(this.c));
            LazyListScope.item$default(((LazyListScope)object0), null, h1.a, composableLambda0, 1, null);
        }
        BlogSwitchBottomSheetKt.BlogList.2.invoke..inlined.itemsIndexed.default.2 blogSwitchBottomSheetKt$BlogList$2$invoke$$inlined$itemsIndexed$default$20 = new BlogSwitchBottomSheetKt.BlogList.2.invoke..inlined.itemsIndexed.default.2(this.a);
        ComposableLambda composableLambda1 = ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new BlogSwitchBottomSheetKt.BlogList.2.invoke..inlined.itemsIndexed.default.3(this.a, 0, this.d, this.e, this.c, this.f));
        ((LazyListScope)object0).items(this.a.size(), null, blogSwitchBottomSheetKt$BlogList$2$invoke$$inlined$itemsIndexed$default$20, composableLambda1);
        if(!this.b.isEmpty()) {
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambdaInstance(18639480, true, new d(this.c));
            LazyListScope.item$default(((LazyListScope)object0), null, h1.a, composableLambda2, 1, null);
        }
        BlogSwitchBottomSheetKt.BlogList.2.invoke..inlined.itemsIndexed.default.5 blogSwitchBottomSheetKt$BlogList$2$invoke$$inlined$itemsIndexed$default$50 = new BlogSwitchBottomSheetKt.BlogList.2.invoke..inlined.itemsIndexed.default.5(this.b);
        ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new BlogSwitchBottomSheetKt.BlogList.2.invoke..inlined.itemsIndexed.default.6(this.b, this.a.size(), this.d, this.e, this.c, this.f));
        ((LazyListScope)object0).items(this.b.size(), null, blogSwitchBottomSheetKt$BlogList$2$invoke$$inlined$itemsIndexed$default$50, composableLambda3);
        return Unit.INSTANCE;
    }
}

