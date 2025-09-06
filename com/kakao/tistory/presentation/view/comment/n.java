package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final List a;
    public final Function1 b;

    public n(List list0, Function1 function10) {
        this.a = list0;
        this.b = function10;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        CommentBottomSheetKt.CommentMenuList.1.invoke..inlined.itemsIndexed.default.2 commentBottomSheetKt$CommentMenuList$1$invoke$$inlined$itemsIndexed$default$20 = new CommentBottomSheetKt.CommentMenuList.1.invoke..inlined.itemsIndexed.default.2(this.a);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new CommentBottomSheetKt.CommentMenuList.1.invoke..inlined.itemsIndexed.default.3(this.a, this.a, this.b));
        ((LazyListScope)object0).items(this.a.size(), null, commentBottomSheetKt$CommentMenuList$1$invoke$$inlined$itemsIndexed$default$20, composableLambda0);
        return Unit.INSTANCE;
    }
}

