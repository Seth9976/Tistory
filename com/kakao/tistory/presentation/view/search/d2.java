package com.kakao.tistory.presentation.view.search;

import androidx.compose.material3.TabKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import com.google.accompanist.pager.PagerState;
import com.kakao.tistory.presentation.R.color;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

public final class d2 extends Lambda implements Function2 {
    public final List a;
    public final PagerState b;
    public final CoroutineScope c;

    public d2(List list0, PagerState pagerState0, CoroutineScope coroutineScope0) {
        this.a = list0;
        this.b = pagerState0;
        this.c = coroutineScope0;
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
            ComposerKt.traceEventStart(0x4E50D8AE, v, -1, "com.kakao.tistory.presentation.view.search.SearchResultTab.<anonymous> (SearchResultListFragment.kt:155)");
        }
        PagerState pagerState0 = this.b;
        CoroutineScope coroutineScope0 = this.c;
        int v1 = 0;
        for(Object object2: this.a) {
            if(v1 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            ((Composer)object0).startReplaceGroup(0xE5E28ED0);
            boolean z = ((Composer)object0).changed(pagerState0);
            boolean z1 = ((Composer)object0).changed(v1);
            c2 c20 = ((Composer)object0).rememberedValue();
            if(z || z1 || c20 == Composer.Companion.getEmpty()) {
                c20 = new c2(pagerState0, v1);
                ((Composer)object0).updateRememberedValue(c20);
            }
            ((Composer)object0).endReplaceGroup();
            State state0 = SnapshotStateKt.derivedStateOf(c20);
            boolean z2 = ((Boolean)state0.getValue()).booleanValue();
            long v2 = ColorResources_androidKt.colorResource(color.gray1, ((Composer)object0), 0);
            long v3 = ColorResources_androidKt.colorResource(color.gray2, ((Composer)object0), 0);
            TabKt.Tab-wqdebIU(z2, new a2(coroutineScope0, pagerState0, v1), null, false, ComposableLambdaKt.rememberComposableLambda(108603021, true, new b2(((ResultViewType)object2), state0), ((Composer)object0), 54), null, v2, v3, null, ((Composer)object0), 0x6000, 300);
            ++v1;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

