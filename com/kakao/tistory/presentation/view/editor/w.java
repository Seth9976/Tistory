package com.kakao.tistory.presentation.view.editor;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.widget.swipe.CommonSwipeGroupState;
import com.kakao.tistory.presentation.widget.swipe.LazyListExtensionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function1 {
    public final LazyPagingItems a;
    public final CommonSwipeGroupState b;
    public final d c;
    public final Function1 d;
    public final Function1 e;

    public w(LazyPagingItems lazyPagingItems0, CommonSwipeGroupState commonSwipeGroupState0, d d0, Function1 function10, Function1 function11) {
        this.a = lazyPagingItems0;
        this.b = commonSwipeGroupState0;
        this.c = d0;
        this.d = function10;
        this.e = function11;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyColumn");
        if(this.a.getItemCount() == 0) {
            LazyListScope.item$default(((LazyListScope)object0), null, null, ComposableSingletons.DraftBottomSheetKt.INSTANCE.getLambda-1$presentation_prodRelease(), 3, null);
            return Unit.INSTANCE;
        }
        Integer integer0 = color.gray6;
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(2095621294, true, new v(this.d, this.e));
        LazyListExtensionKt.swipeableItems(((LazyListScope)object0), this.a, s.a, this.b, this.c, integer0, composableLambda0);
        return Unit.INSTANCE;
    }
}

