package com.kakao.tistory.presentation.view.search;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.kakao.tistory.presentation.R.string;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function3 {
    public static final a a;

    static {
        a.a = new a();
    }

    public a() {
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((LazyItemScope)object0), "$this$item");
        if((v & 81) == 16 && ((Composer)object1).getSkipping()) {
            ((Composer)object1).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x9E67ECF1, v, -1, "com.kakao.tistory.presentation.view.search.ComposableSingletons$SearchResultListFragmentKt.lambda-1.<anonymous> (SearchResultListFragment.kt:232)");
        }
        SearchKeywordFragmentKt.SearchEmptyView(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), string.label_search_result_empty, ((Composer)object1), 6, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

