package com.kakao.kandinsky.designsystem.common;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.sf;
import androidx.compose.material3.ti;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A/\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001A\u00020\u00042\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\b\u001A/\u0010\u0000\u001A\u00020\u0001*\u00020\t2\b\b\u0002\u0010\u0003\u001A\u00020\u00042\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\n\u001A\u001E\u0010\u0005\u001A\u00020\u000B*\u00020\u000B2\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¨\u0006\f"}, d2 = {"PreviewSpacer", "", "Landroidx/compose/foundation/layout/ColumnScope;", "boundPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "onBoundsChanged", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/Modifier;", "designsystem_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class PreviewSpacerKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void PreviewSpacer(@NotNull ColumnScope columnScope0, @Nullable PaddingValues paddingValues0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(columnScope0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "onBoundsChanged");
        Composer composer1 = composer0.startRestartGroup(0x570F730A);
        if((0x80000000 & v1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(columnScope0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 1) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x20 : 16);
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                paddingValues0 = PaddingKt.PaddingValues-YgX7TsA$default(0.0f, 0.0f, 3, null);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x570F730A, v2, -1, "com.kakao.kandinsky.designsystem.common.PreviewSpacer (PreviewSpacer.kt:14)");
            }
            BoxKt.Box(PreviewSpacerKt.onBoundsChanged(ColumnScope.weight$default(columnScope0, PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), paddingValues0), 1.0f, false, 2, null), function10), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(v, columnScope0, v1, paddingValues0, 5, function10));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void PreviewSpacer(@NotNull RowScope rowScope0, @Nullable PaddingValues paddingValues0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Intrinsics.checkNotNullParameter(rowScope0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "onBoundsChanged");
        Composer composer1 = composer0.startRestartGroup(487806450);
        if((0x80000000 & v1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(rowScope0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 1) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x20 : 16);
        }
        if((v1 & 2) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if((v1 & 1) != 0) {
                paddingValues0 = PaddingKt.PaddingValues-YgX7TsA$default(0.0f, 0.0f, 3, null);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(487806450, v2, -1, "com.kakao.kandinsky.designsystem.common.PreviewSpacer (PreviewSpacer.kt:28)");
            }
            BoxKt.Box(PreviewSpacerKt.onBoundsChanged(RowScope.weight$default(rowScope0, PaddingKt.padding(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), paddingValues0), 1.0f, false, 2, null), function10), composer1, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(v, rowScope0, v1, paddingValues0, 6, function10));
        }
    }

    @NotNull
    public static final Modifier onBoundsChanged(@NotNull Modifier modifier0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "onBoundsChanged");
        return OnGloballyPositionedModifierKt.onGloballyPositioned(modifier0, new ti(function10, 2));
    }
}

