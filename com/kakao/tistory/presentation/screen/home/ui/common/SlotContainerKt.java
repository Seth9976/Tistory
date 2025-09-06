package com.kakao.tistory.presentation.screen.home.ui.common;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001AV\u0010\f\u001A\u00020\u00012\u0013\b\u0002\u0010\u0003\u001A\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u001C\u0010\u000B\u001A\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\u0002¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\f\u0010\r\"\u001D\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00040\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "slotTitle", "", "isLoading", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "SlotContainer", "(Lkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLoadingState", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalLoadingState", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSlotContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotContainer.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotContainerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,48:1\n148#2:49\n*S KotlinDebug\n*F\n+ 1 SlotContainer.kt\ncom/kakao/tistory/presentation/screen/home/ui/common/SlotContainerKt\n*L\n24#1:49\n*E\n"})
public final class SlotContainerKt {
    public static final ProvidableCompositionLocal a;

    static {
        SlotContainerKt.a = CompositionLocalKt.compositionLocalOf$default(null, t.a, 1, null);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void SlotContainer(@Nullable Function2 function20, boolean z, @Nullable PaddingValues paddingValues0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(function30, "content");
        Composer composer1 = composer0.startRestartGroup(-1051301832);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changedInstance(function20) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                function20 = ComposableSingletons.SlotContainerKt.INSTANCE.getLambda-1$presentation_prodRelease();
            }
            if((v1 & 2) != 0) {
                z = false;
            }
            if((v1 & 4) != 0) {
                paddingValues0 = PaddingKt.PaddingValues-YgX7TsA$default(20.0f, 0.0f, 2, null);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1051301832, v2, -1, "com.kakao.tistory.presentation.screen.home.ui.common.SlotContainer (SlotContainer.kt:25)");
            }
            CompositionLocalKt.CompositionLocalProvider(SlotContainerKt.a.provides(Boolean.valueOf(z)), ComposableLambdaKt.rememberComposableLambda(0xC5CB4CF8, true, new v(function20, paddingValues0, function30), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w(function20, z, paddingValues0, function30, v, v1));
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal getLocalLoadingState() {
        return SlotContainerKt.a;
    }
}

