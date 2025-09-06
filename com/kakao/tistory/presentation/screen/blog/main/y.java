package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import com.kakao.tistory.presentation.screen.blog.navigation.FromRefer;
import com.kakao.tistory.presentation.screen.item.ViewState.Success;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function2 {
    public final FromRefer a;
    public final Success b;
    public final ComposableLambda c;
    public final State d;
    public final State e;

    public y(FromRefer fromRefer0, Success viewState$Success0, ComposableLambda composableLambda0, State state0, State state1) {
        this.a = fromRefer0;
        this.b = viewState$Success0;
        this.c = composableLambda0;
        this.d = state0;
        this.e = state1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1805288618, v, -1, "com.kakao.tistory.presentation.screen.blog.main.BlogMainScreen.<anonymous> (BlogMainScreen.kt:107)");
        }
        BlogMainUiState blogMainUiState0 = BlogMainScreenKt.access$BlogMainScreen$lambda$1(this.d);
        Function0 function00 = BlogMainScreenKt.access$BlogMainScreen$lambda$0(this.e).getRefresh();
        BlogMainScreenKt.access$BlogMainContent(blogMainUiState0, this.a, ((BlogInfo)this.b.getItem()), function00, this.c, ((Composer)object0), 0x6200);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

