package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Tip;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class j2 extends Lambda implements Function1 {
    public final Tip a;

    public j2(Tip homeSlotUiState$Tip0) {
        this.a = homeSlotUiState$Tip0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((LazyListScope)object0), "$this$LazyRow");
        List list0 = this.a.getContents();
        ((LazyListScope)object0).items(list0.size(), null, new TipKt.Tip.2.1.invoke..inlined.itemsIndexed.default.2(list0), ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new TipKt.Tip.2.1.invoke..inlined.itemsIndexed.default.3(list0)));
        return Unit.INSTANCE;
    }
}

