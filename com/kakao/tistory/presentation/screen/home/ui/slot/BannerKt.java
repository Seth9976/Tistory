package com.kakao.tistory.presentation.screen.home.ui.slot;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.tooling.preview.Preview.Container;
import androidx.compose.ui.tooling.preview.Preview;
import com.kakao.tistory.presentation.screen.home.item.HomeSlotUiState.Banner;
import com.kakao.tistory.presentation.screen.home.ui.common.SlotContainerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0015\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001A\r\u0010\u0005\u001A\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Banner", "", "uiState", "Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Banner;", "(Lcom/kakao/tistory/presentation/screen/home/item/HomeSlotUiState$Banner;Landroidx/compose/runtime/Composer;I)V", "BannerPreview1", "(Landroidx/compose/runtime/Composer;I)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Banner.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/BannerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,61:1\n148#2:62\n*S KotlinDebug\n*F\n+ 1 Banner.kt\ncom/kakao/tistory/presentation/screen/home/ui/slot/BannerKt\n*L\n37#1:62\n*E\n"})
public final class BannerKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void Banner(@NotNull Banner homeSlotUiState$Banner0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(homeSlotUiState$Banner0, "uiState");
        Composer composer1 = composer0.startRestartGroup(0x1B07468F);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x1B07468F, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.Banner (Banner.kt:33)");
        }
        SlotContainerKt.SlotContainer(null, false, PaddingKt.PaddingValues-0680j_4(0.0f), ComposableLambdaKt.rememberComposableLambda(1292049706, true, new a(homeSlotUiState$Banner0), composer1, 54), composer1, 0xD80, 3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(homeSlotUiState$Banner0, v));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Container({@Preview(backgroundColor = 0xFFFFFFFFL, showBackground = true, widthDp = 675), @Preview(backgroundColor = 0xFFFFFFFFL, showBackground = true, widthDp = 375), @Preview(backgroundColor = 0xFFFFFFFFL, showBackground = true, widthDp = 0xAF)})
    public static final void BannerPreview1(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-596707100);
        if(v != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-596707100, v, -1, "com.kakao.tistory.presentation.screen.home.ui.slot.BannerPreview1 (Banner.kt:22)");
            }
            BannerKt.Banner(new Banner(null, null, "https://t1.daumcdn.net/daumtop_deco/images/pctop/2023/logo_daum.png", ColorKt.Color(0xFFCCD9E9L), c.a, null, 35, null), composer1, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(v));
        }
    }
}

