package com.kakao.tistory.presentation.screen.blog.main.ui;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.tooling.preview.Preview;
import com.kakao.tistory.presentation.theme.TistoryThemeKt;
import com.kakao.tistory.presentation.widget.dialog.TistoryComposeBottomSheetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\\\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032!\u0010\u0004\u001A\u001D\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\t\u001A\u00020\u00032\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00010\u000B2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u00010\u000BH\u0007¢\u0006\u0002\u0010\r\u001A\r\u0010\u000E\u001A\u00020\u0001H\u0007¢\u0006\u0002\u0010\u000F¨\u0006\u0010"}, d2 = {"BlogMainOthersMenuBottomSheet", "", "isBlocking", "", "onClickBlock", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "needBlock", "isReportable", "onClickReport", "Lkotlin/Function0;", "onDismiss", "(ZLkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PreviewBlogMainOthersBlogMenuBottomSheet", "(Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BlogMainOthersMenuBottomSheetKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void BlogMainOthersMenuBottomSheet(boolean z, @NotNull Function1 function10, boolean z1, @NotNull Function0 function00, @NotNull Function0 function01, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function10, "onClickBlock");
        Intrinsics.checkNotNullParameter(function00, "onClickReport");
        Intrinsics.checkNotNullParameter(function01, "onDismiss");
        Composer composer1 = composer0.startRestartGroup(0x981B8980);
        int v1 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(z1) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v1) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x981B8980, v1, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.BlogMainOthersMenuBottomSheet (BlogMainOthersMenuBottomSheet.kt:17)");
            }
            TistoryComposeBottomSheetKt.TistoryComposeBottomSheet(false, function01, ComposableLambdaKt.rememberComposableLambda(0x6889D505, true, new y1(z, z1, function10, function01, function00), composer1, 54), composer1, v1 >> 9 & 0x70 | 0x180, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new z1(z, function10, z1, function00, function01, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview
    public static final void PreviewBlogMainOthersBlogMenuBottomSheet(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x475223E3);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x475223E3, v, -1, "com.kakao.tistory.presentation.screen.blog.main.ui.PreviewBlogMainOthersBlogMenuBottomSheet (BlogMainOthersMenuBottomSheet.kt:47)");
            }
            TistoryThemeKt.TistoryTheme(false, ComposableSingletons.BlogMainOthersMenuBottomSheetKt.INSTANCE.getLambda-1$presentation_prodRelease(), composer1, 0x30, 1);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a2(v));
        }
    }
}

