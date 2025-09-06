package com.kakao.tistory.presentation.view.search;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class q extends Lambda implements Function2 {
    public final SearchActivity a;

    public q(SearchActivity searchActivity0) {
        this.a = searchActivity0;
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
            ComposerKt.traceEventStart(0x3EBE688, v, -1, "com.kakao.tistory.presentation.view.search.SearchActivity.Content.<anonymous> (SearchActivity.kt:94)");
        }
        State state0 = LiveDataAdapterKt.observeAsState(SearchActivity.access$getSearchViewModel(this.a).getSearchKeyword(), "", ((Composer)object0), 56);
        ((Composer)object0).startMovableGroup(1738646404, LiveDataAdapterKt.observeAsState(SearchActivity.access$getSearchViewModel(this.a).isTextAttached(), Boolean.FALSE, ((Composer)object0), 56).getValue());
        boolean z = SearchActivity.access$getSearchViewModel(this.a).isBlogSearch();
        Object object2 = state0.getValue();
        f f0 = new f(SearchActivity.access$getSearchViewModel(this.a));
        g g0 = new g(SearchActivity.access$getSearchViewModel(this.a));
        h h0 = new h(SearchActivity.access$getSearchViewModel(this.a));
        i i0 = new i(SearchActivity.access$getSearchViewModel(this.a));
        j j0 = new j(SearchActivity.access$getSearchViewModel(this.a));
        k k0 = new k(SearchActivity.access$getSearchViewModel(this.a));
        Intrinsics.checkNotNull(((String)object2));
        l l0 = new l(this.a);
        SearchToolbarKt.SearchToolbar(z, this.a.n, ((String)object2), f0, i0, j0, g0, l0, h0, k0, ((Composer)object0), 0);
        ((Composer)object0).endMovableGroup();
        EffectsKt.LaunchedEffect(SearchActivity.access$getSearchViewModel(this.a).isTextCleared(), new o(this.a, null), ((Composer)object0), 72);
        p p0 = new p(this.a, null);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, p0, ((Composer)object0), 70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

