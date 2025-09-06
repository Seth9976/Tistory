package com.kakao.tistory.presentation.view.editor;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.domain.entity.entry.DraftItem;
import com.kakao.tistory.presentation.widget.swipe.AnchorsProvider;
import com.kakao.tistory.presentation.widget.swipe.SwipeAnchors;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class d implements AnchorsProvider {
    public final Function1 a;

    public d(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "onClickDelete");
        super();
        this.a = function10;
    }

    @Override  // com.kakao.tistory.presentation.widget.swipe.AnchorsProvider
    public final SwipeAnchors create(int v, Object object0, Function0 function00) {
        Intrinsics.checkNotNullParameter(((DraftItem)object0), "item");
        Intrinsics.checkNotNullParameter(function00, "dismiss");
        return new SwipeAnchors(null, ComposableLambdaKt.composableLambdaInstance(0x37428A0E, true, new c(function00, this, ((DraftItem)object0))), 1, null);
    }
}

