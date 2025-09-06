package com.kakao.tistory.presentation.screen.blog.main;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItemsKt;
import androidx.room.a;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainUiState;
import com.kakao.tistory.presentation.view.common.PagingItemListKt;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

public final class l extends Lambda implements Function3 {
    public final BlogMainUiState a;
    public final Function4 b;

    public l(BlogMainUiState blogMainUiState0, Function4 function40) {
        this.a = blogMainUiState0;
        this.b = function40;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object invoke(Object object0, Object object1, Object object2) {
        Composer composer0 = (Composer)object1;
        int v = ((Number)object2).intValue();
        Intrinsics.checkNotNullParameter(((BoxScope)object0), "$this$PullToRefreshBox");
        if((v & 81) == 16 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x23B5D7E8, v, -1, "com.kakao.tistory.presentation.screen.blog.main.BlogMainContent.<anonymous> (BlogMainScreen.kt:220)");
        }
        LazyListState lazyListState0 = LazyListStateKt.rememberLazyListState(0, 0, composer0, 0, 3);
        Flow flow0 = this.a.getEntryList();
        composer0.startReplaceGroup(0xA5EAE4FA);
        LazyPagingItems lazyPagingItems0 = flow0 == null ? null : LazyPagingItemsKt.collectAsLazyPagingItems(flow0, null, composer0, 8, 1);
        composer0.endReplaceGroup();
        State state0 = PagingItemListKt.rememberPagingSnapshot(lazyPagingItems0, composer0, LazyPagingItems.$stable);
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer0), composer0);
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        int v1 = ((Density)composer0.consume(CompositionLocalsKt.getLocalDensity())).roundToPx-0680j_4(56.0f);
        i i0 = new i(coroutineScope0, lazyListState0, this.a, v1);
        k k0 = new k(coroutineScope0, lazyListState0);
        Integer integer0 = this.a.getCategory().getCurrent().getId();
        composer0.startReplaceGroup(0xA5EB3862);
        boolean z = composer0.changed(this.a);
        boolean z1 = composer0.changed(i0);
        BlogMainUiState blogMainUiState0 = this.a;
        e e0 = composer0.rememberedValue();
        if(z || z1 || e0 == composer$Companion0.getEmpty()) {
            e0 = new e(blogMainUiState0, i0, null);
            composer0.updateRememberedValue(e0);
        }
        composer0.endReplaceGroup();
        EffectsKt.LaunchedEffect(integer0, e0, composer0, 0x40);
        BlogMainInfo blogMainInfo0 = this.a.getInfo();
        composer0.startReplaceGroup(0xA5EB4F39);
        boolean z2 = composer0.changed(k0);
        boolean z3 = composer0.changed(this.a);
        BlogMainUiState blogMainUiState1 = this.a;
        f f0 = composer0.rememberedValue();
        if(z2 || z3 || f0 == composer$Companion0.getEmpty()) {
            f0 = new f(k0, blogMainUiState1, null);
            composer0.updateRememberedValue(f0);
        }
        composer0.endReplaceGroup();
        EffectsKt.LaunchedEffect(blogMainInfo0, f0, composer0, 0x40);
        LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), lazyListState0, PaddingKt.PaddingValues-a9UjIt4$default(0.0f, 0.0f, 0.0f, 16.0f, 7, null), false, null, null, null, false, new g(this.a, lazyPagingItems0, state0), composer0, 390, 0xF8);
        BlogMainScreenKt.access$BlogMainContentAppBar(lazyListState0, this.a, this.b, composer0, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

