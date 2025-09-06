package com.google.accompanist.navigation.material;

import androidx.compose.material.ColorsKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ModalBottomSheetDefaults;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n6.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001Ai\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2\u0011\u0010\u000E\u001A\r\u0012\u0004\u0012\u00020\u00010\u000F¢\u0006\u0002\b\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013"}, d2 = {"ModalBottomSheetLayout", "", "bottomSheetNavigator", "Lcom/google/accompanist/navigation/material/BottomSheetNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetShape", "Landroidx/compose/ui/graphics/Shape;", "sheetElevation", "Landroidx/compose/ui/unit/Dp;", "sheetBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "sheetContentColor", "scrimColor", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "ModalBottomSheetLayout-4erKP6g", "(Lcom/google/accompanist/navigation/material/BottomSheetNavigator;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;FJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "navigation-material_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class BottomSheetKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @ExperimentalMaterialNavigationApi
    public static final void ModalBottomSheetLayout-4erKP6g(@NotNull BottomSheetNavigator bottomSheetNavigator0, @Nullable Modifier modifier0, @Nullable Shape shape0, float f, long v, long v1, long v2, @NotNull Function2 function20, @Nullable Composer composer0, int v3, int v4) {
        long v10;
        long v9;
        long v8;
        float f1;
        Shape shape1;
        Modifier modifier1;
        float f2;
        Shape shape2;
        Modifier modifier2;
        long v11;
        long v12;
        float f3;
        Shape shape3;
        long v7;
        long v6;
        int v5;
        Intrinsics.checkNotNullParameter(bottomSheetNavigator0, "bottomSheetNavigator");
        Intrinsics.checkNotNullParameter(function20, "content");
        Composer composer1 = composer0.startRestartGroup(46058684);
        if((v4 & 1) == 0) {
            v5 = (v3 & 14) == 0 ? (composer1.changed(bottomSheetNavigator0) ? 4 : 2) | v3 : v3;
        }
        else {
            v5 = v3 | 6;
        }
        if((v4 & 2) != 0) {
            v5 |= 0x30;
        }
        else if((v3 & 0x70) == 0) {
            v5 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v3 & 0x380) == 0) {
            v5 |= ((v4 & 4) != 0 || !composer1.changed(shape0) ? 0x80 : 0x100);
        }
        if((v3 & 0x1C00) == 0) {
            v5 |= ((v4 & 8) != 0 || !composer1.changed(f) ? 0x400 : 0x800);
        }
        if((v3 & 0xE000) == 0) {
            v5 |= ((v4 & 16) != 0 || !composer1.changed(v) ? 0x2000 : 0x4000);
        }
        if((v3 & 0x70000) == 0) {
            v6 = v1;
            v5 |= ((v4 & 0x20) != 0 || !composer1.changed(v6) ? 0x10000 : 0x20000);
        }
        else {
            v6 = v1;
        }
        if((v3 & 0x380000) == 0) {
            v7 = v2;
            v5 |= ((v4 & 0x40) != 0 || !composer1.changed(v7) ? 0x80000 : 0x100000);
        }
        else {
            v7 = v2;
        }
        if((v4 & 0x80) != 0) {
            v5 |= 0xC00000;
        }
        else if((v3 & 0x1C00000) == 0) {
            v5 |= (composer1.changedInstance(function20) ? 0x800000 : 0x400000);
        }
        if((0x16DB6DB & v5) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v3 & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v4 & 2) == 0 ? modifier0 : Modifier.Companion;
                if((v4 & 4) == 0) {
                    shape3 = shape0;
                }
                else {
                    shape3 = MaterialTheme.INSTANCE.getShapes(composer1, MaterialTheme.$stable).getLarge();
                    v5 &= -897;
                }
                if((v4 & 8) == 0) {
                    f3 = f;
                }
                else {
                    f3 = 16.0f;
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) == 0) {
                    v12 = v;
                }
                else {
                    v12 = MaterialTheme.INSTANCE.getColors(composer1, MaterialTheme.$stable).getSurface-0d7_KjU();
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x20) != 0) {
                    v6 = ColorsKt.contentColorFor-ek8zF_U(v12, composer1, v5 >> 12 & 14);
                    v5 &= 0xFFF8FFFF;
                }
                if((v4 & 0x40) != 0) {
                    v7 = ModalBottomSheetDefaults.INSTANCE.getScrimColor(composer1, ModalBottomSheetDefaults.$stable);
                    v5 &= 0xFFC7FFFF;
                }
                modifier2 = modifier3;
                shape2 = shape3;
                f2 = f3;
                v11 = v12;
            }
            else {
                composer1.skipToGroupEnd();
                if((v4 & 4) != 0) {
                    v5 &= -897;
                }
                if((v4 & 8) != 0) {
                    v5 &= 0xFFFFE3FF;
                }
                if((v4 & 16) != 0) {
                    v5 &= 0xFFFF1FFF;
                }
                if((v4 & 0x20) != 0) {
                    v5 &= 0xFFF8FFFF;
                }
                if((v4 & 0x40) != 0) {
                    v5 &= 0xFFC7FFFF;
                }
                v11 = v;
                modifier2 = modifier0;
                shape2 = shape0;
                f2 = f;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(46058684, v5, -1, "com.google.accompanist.navigation.material.ModalBottomSheetLayout (BottomSheet.kt:46)");
            }
            ModalBottomSheetKt.ModalBottomSheetLayout-Gs3lGvM(bottomSheetNavigator0.getSheetContent(), modifier2, bottomSheetNavigator0.getSheetState$navigation_material_release(), false, shape2, f2, v11, v6, v7, function20, composer1, v5 & 0x70 | ModalBottomSheetState.$stable << 6 | 0xE000 & v5 << 6 | 0x70000 & v5 << 6 | 0x380000 & v5 << 6 | v5 << 6 & 0x1C00000 | 0xE000000 & v5 << 6 | v5 << 6 & 0x70000000, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            shape1 = shape2;
            f1 = f2;
            v10 = v11;
            v8 = v6;
            v9 = v7;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            shape1 = shape0;
            f1 = f;
            v8 = v6;
            v9 = v7;
            v10 = v;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new a(bottomSheetNavigator0, modifier1, shape1, f1, v10, v8, v9, function20, v3, v4));
        }
    }
}

