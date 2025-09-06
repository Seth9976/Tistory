package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.kakao.tistory.presentation.screen.blog.main.contract.BlogMainInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001A=\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000B\u001A\'\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00050\r*\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"BlogMainAppBar", "", "blogMainInfo", "Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;", "fraction", "", "showDivider", "", "hasBackStack", "onFinish", "Lkotlin/Function0;", "(Lcom/kakao/tistory/presentation/screen/blog/main/contract/BlogMainInfo;FZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "appBarFraction", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/lazy/LazyListState;", "index", "", "height", "(Landroidx/compose/foundation/lazy/LazyListState;IFLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogMainTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogMainTopAppBar.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainTopAppBarKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,74:1\n1223#2,6:75\n*S KotlinDebug\n*F\n+ 1 BlogMainTopAppBar.kt\ncom/kakao/tistory/presentation/screen/blog/main/ui/BlogMainTopAppBarKt\n*L\n58#1:75,6\n*E\n"})
public final class BlogMainTopAppBarKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogMainAppBar(@Nullable BlogMainInfo blogMainInfo0, float f, boolean z, boolean z1, @NotNull Function0 function00, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onFinish");
        Composer composer1 = composer0.startRestartGroup(0xE223F70B);
        int v1 = (v & 14) == 0 ? (composer1.changed(blogMainInfo0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(f) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(z) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v1) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xE223F70B, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainAppBar (BlogMainTopAppBar.kt:25)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.box-impl(ColorKt.lerp-jxsXWHM(0L, 0L, f))), ComposableLambdaKt.rememberComposableLambda(2030717899, true, new o3(f, z, z1, function00, blogMainInfo0), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new p3(blogMainInfo0, f, z, z1, function00, v));
        }
    }

    @Composable
    @NotNull
    public static final State appBarFraction(@NotNull LazyListState lazyListState0, int v, float f, @Nullable Composer composer0, int v1) {
        Intrinsics.checkNotNullParameter(lazyListState0, "<this>");
        composer0.startReplaceGroup(-100130754);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-100130754, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.appBarFraction (BlogMainTopAppBar.kt:57)");
        }
        composer0.startReplaceGroup(0xC30D407);
        boolean z = (v1 & 0x70 ^ 0x30) > 0x20 && composer0.changed(v) || (v1 & 0x30) == 0x20;
        State state0 = composer0.rememberedValue();
        if(z || state0 == Composer.Companion.getEmpty()) {
            state0 = SnapshotStateKt.derivedStateOf(new q3(lazyListState0, v, f));
            composer0.updateRememberedValue(state0);
        }
        composer0.endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return state0;
    }
}

