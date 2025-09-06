package com.kakao.tistory.presentation.screen.blog.setting.ui;

import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.kakao.tistory.presentation.widget.common.TistoryTopAppBarKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A9\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0007\u001A\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"BlogSettingTopAppBar", "", "completeEnabled", "", "onClickComplete", "Lkotlin/Function0;", "onClickClose", "scrollBehavior", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/TopAppBarScrollBehavior;Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BlogSettingTopAppBarKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogSettingTopAppBar(boolean z, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull TopAppBarScrollBehavior topAppBarScrollBehavior0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "onClickComplete");
        Intrinsics.checkNotNullParameter(function01, "onClickClose");
        Intrinsics.checkNotNullParameter(topAppBarScrollBehavior0, "scrollBehavior");
        Composer composer1 = composer0.startRestartGroup(61007630);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(topAppBarScrollBehavior0) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(61007630, v1, -1, "com.kakao.tistory.presentation.screen.blog.setting.ui.BlogSettingTopAppBar (BlogSettingTopAppBar.kt:19)");
            }
            TistoryTopAppBarKt.TistoryTopAppBar-nbWgWpA(topAppBarScrollBehavior0, false, ComposableLambdaKt.rememberComposableLambda(0xFB366CF0, true, new d(function01), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0xF90413DD, true, new e(z, function00), composer1, 54), ComposableSingletons.BlogSettingTopAppBarKt.INSTANCE.getLambda-1$presentation_prodRelease(), 0.0f, 0.0f, composer1, v1 >> 9 & 14 | 0x6D80, 98);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(z, function00, function01, topAppBarScrollBehavior0, v));
        }
    }
}

