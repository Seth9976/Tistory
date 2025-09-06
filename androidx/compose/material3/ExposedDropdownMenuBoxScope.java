package androidx.compose.material3;

import android.view.View;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalMaterial3Api
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001J(\u0010\t\u001A\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0005H&\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\u000B\u001A\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\n\u001A\u00020\u0005H&\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0098\u0001\u0010$\u001A\u00020\u000F2\u0006\u0010\r\u001A\u00020\u00052\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001A\u001A\u00020\u00182\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\u001C\u0010!\u001A\u0018\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u000F0\u001D\u00A2\u0006\u0002\b\u001F\u00A2\u0006\u0002\b H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\"\u0010#J\u0013\u0010\t\u001A\u00020\u0002*\u00020\u0002H\u0007\u00A2\u0006\u0004\b\t\u0010%J\u00A2\u0001\u0010$\u001A\u00020\u000F2\u0006\u0010\r\u001A\u00020\u00052\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010&\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001A\u001A\u00020\u00182\n\b\u0002\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\u001C\u0010!\u001A\u0018\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u000F0\u001D\u00A2\u0006\u0002\b\u001F\u00A2\u0006\u0002\b H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010(JW\u0010$\u001A\u00020\u000F2\u0006\u0010\r\u001A\u00020\u00052\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u00122\u001C\u0010!\u001A\u0018\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u000F0\u001D\u00A2\u0006\u0002\b\u001F\u00A2\u0006\u0002\b H\u0007\u00A2\u0006\u0004\b$\u0010)R\u001A\u0010,\u001A\u00020\u00038 X\u00A0\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0006\u001A\u0004\b*\u0010+\u0082\u0001\u0001-\u0082\u0002\u000B\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006."}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/material3/MenuAnchorType;", "type", "", "enabled", "menuAnchor-fsE2BvY", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Z)Landroidx/compose/ui/Modifier;", "menuAnchor", "matchTextFieldWidth", "exposedDropdownSize", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "expanded", "Lkotlin/Function0;", "", "onDismissRequest", "modifier", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "shadowElevation", "Landroidx/compose/foundation/BorderStroke;", "border", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ExposedDropdownMenu-vNxi1II", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "ExposedDropdownMenu", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "focusable", "ExposedDropdownMenu-kbRbctU", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZZLandroidx/compose/ui/graphics/Shape;JFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "getAnchorType-Mg6Rgbw$material3_release", "()Ljava/lang/String;", "anchorType", "Landroidx/compose/material3/n9;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,1490:1\n1223#2,6:1491\n1223#2,6:1499\n1223#2,6:1505\n1223#2,6:1511\n1223#2,6:1517\n77#3:1497\n77#3:1498\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenuBoxScope\n*L\n348#1:1491,6\n354#1:1499,6\n358#1:1505,6\n362#1:1511,6\n364#1:1517,6\n349#1:1497\n350#1:1498\n*E\n"})
public abstract class ExposedDropdownMenuBoxScope {
    public static final int $stable;

    public ExposedDropdownMenuBoxScope(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with customization options parameters.")
    public final void ExposedDropdownMenu(boolean z, Function0 function00, Modifier modifier0, ScrollState scrollState0, Function3 function30, Composer composer0, int v, int v1) {
        Modifier modifier1;
        ScrollState scrollState2;
        int v3;
        ScrollState scrollState1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x6716D61B);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v & 0xC00) == 0) {
            if((v1 & 8) == 0) {
                scrollState1 = scrollState0;
                v3 = composer1.changed(scrollState1) ? 0x800 : 0x400;
            }
            else {
                scrollState1 = scrollState0;
                v3 = 0x400;
            }
            v2 |= v3;
        }
        else {
            scrollState1 = scrollState0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changed(this) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v1 & 8) == 0) {
                    scrollState2 = scrollState1;
                }
                else {
                    scrollState2 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
                    v2 &= 0xFFFFE3FF;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                modifier1 = modifier0;
                scrollState2 = scrollState1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6716D61B, v2, -1, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:452)");
            }
            this.ExposedDropdownMenu-vNxi1II(z, function00, modifier1, scrollState2, true, MenuDefaults.INSTANCE.getShape(composer1, 6), MenuDefaults.INSTANCE.getContainerColor(composer1, 6), 0.0f, 0.0f, null, function30, composer1, v2 & 14 | 0x36C06000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00, v2 >> 12 & 0x7E, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            scrollState1 = scrollState2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i3(this, z, function00, modifier1, scrollState1, function30, v, v1, 1));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.WARNING, message = "The `focusable` parameter is unused. Pass the proper MenuAnchorType to Modifier.menuAnchor instead, which will handle focusability automatically.")
    public final void ExposedDropdownMenu-kbRbctU(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable ScrollState scrollState0, boolean z1, boolean z2, @Nullable Shape shape0, long v, float f, float f1, @Nullable BorderStroke borderStroke0, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2, int v3) {
        float f3;
        float f2;
        boolean z4;
        Modifier modifier1;
        long v8;
        Shape shape2;
        BorderStroke borderStroke1;
        boolean z3;
        ScrollState scrollState1;
        BorderStroke borderStroke2;
        boolean z6;
        int v9;
        float f5;
        float f4;
        boolean z5;
        ScrollState scrollState2;
        int v6;
        long v5;
        Shape shape1;
        int v4;
        Composer composer1 = composer0.startRestartGroup(366140493);
        if((v3 & 1) == 0) {
            v4 = (v1 & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v4 |= ((v3 & 8) != 0 || !composer1.changed(scrollState0) ? 0x400 : 0x800);
        }
        if((v3 & 0x20) != 0) {
            v4 |= 0x30000;
        }
        else if((v1 & 0x30000) == 0) {
            v4 |= (composer1.changed(z2) ? 0x20000 : 0x10000);
        }
        if((v1 & 0x180000) == 0) {
            shape1 = shape0;
            v4 |= ((v3 & 0x40) != 0 || !composer1.changed(shape1) ? 0x80000 : 0x100000);
        }
        else {
            shape1 = shape0;
        }
        if((v1 & 0xC00000) == 0) {
            v5 = v;
            v4 |= ((v3 & 0x80) != 0 || !composer1.changed(v5) ? 0x400000 : 0x800000);
        }
        else {
            v5 = v;
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v4 |= (composer1.changed(f) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x30000000) == 0) {
            v4 |= (composer1.changed(f1) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v6 = (v2 & 6) == 0 ? v2 | (composer1.changed(borderStroke0) ? 4 : 2) : v2;
        }
        else {
            v6 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v6 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v6 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        int v7 = v6;
        if((v3 & 0x1000) != 0) {
            v7 |= 0x180;
        }
        else if((v2 & 0x180) == 0) {
            v7 |= (composer1.changed(this) ? 0x100 : 0x80);
        }
        if((v4 & 0x12490493) != 0x12490492 || (v7 & 0x93) != 0x92 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
                z6 = true;
                if((v3 & 8) == 0) {
                    scrollState2 = scrollState0;
                }
                else {
                    scrollState2 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
                    v4 &= 0xFFFFE3FF;
                }
                boolean z7 = (v3 & 16) == 0 ? z1 : true;
                if((v3 & 0x20) == 0) {
                    z6 = z2;
                }
                if((v3 & 0x40) != 0) {
                    shape1 = MenuDefaults.INSTANCE.getShape(composer1, 6);
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) != 0) {
                    v5 = MenuDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v4 &= 0xFE3FFFFF;
                }
                f4 = (v3 & 0x100) == 0 ? f : 0.0f;
                float f6 = (v3 & 0x200) == 0 ? f1 : 0.0f;
                if((v3 & 0x400) == 0) {
                    f5 = f6;
                    v9 = v4;
                    z5 = z7;
                    borderStroke2 = borderStroke0;
                }
                else {
                    v9 = v4;
                    borderStroke2 = null;
                    f5 = f6;
                    z5 = z7;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                if((v3 & 0x80) != 0) {
                    v4 &= 0xFE3FFFFF;
                }
                scrollState2 = scrollState0;
                z5 = z1;
                f4 = f;
                f5 = f1;
                v9 = v4;
                modifier1 = modifier0;
                z6 = z2;
                borderStroke2 = borderStroke0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(366140493, v9, v7, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:424)");
            }
            this.ExposedDropdownMenu-vNxi1II(z, function00, modifier1, scrollState2, z6, shape1, v5, f4, f5, borderStroke2, function30, composer1, v9 & 0x1FFE | 0xE000 & v9 >> 3 | 0x70000 & v9 >> 3 | 0x380000 & v9 >> 3 | 0x1C00000 & v9 >> 3 | v9 >> 3 & 0xE000000 | v7 << 27 & 0x70000000, v7 >> 3 & 0x7E, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            borderStroke1 = borderStroke2;
            shape2 = shape1;
            scrollState1 = scrollState2;
            v8 = v5;
            z4 = z6;
            f3 = f5;
            f2 = f4;
            z3 = z5;
        }
        else {
            composer1.skipToGroupEnd();
            scrollState1 = scrollState0;
            z3 = z1;
            borderStroke1 = borderStroke0;
            shape2 = shape1;
            v8 = v5;
            modifier1 = modifier0;
            z4 = z2;
            f2 = f;
            f3 = f1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new m9(this, z, function00, modifier1, scrollState1, z3, z4, shape2, v8, f2, f3, borderStroke1, function30, v1, v2, v3));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void ExposedDropdownMenu-vNxi1II(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable ScrollState scrollState0, boolean z1, @Nullable Shape shape0, long v, float f, float f1, @Nullable BorderStroke borderStroke0, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2, int v3) {
        float f3;
        float f2;
        boolean z3;
        ScrollState scrollState1;
        Modifier modifier1;
        BorderStroke borderStroke1;
        long v6;
        Shape shape1;
        float f6;
        BorderStroke borderStroke2;
        long v8;
        Shape shape2;
        ScrollState scrollState2;
        Modifier modifier2;
        int v7;
        float f5;
        float f4;
        long v9;
        int v5;
        boolean z2;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x2AF87329);
        if((v3 & 1) == 0) {
            v4 = (v1 & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v1 : v1;
        }
        else {
            v4 = v1 | 6;
        }
        if((v3 & 2) != 0) {
            v4 |= 0x30;
        }
        else if((v1 & 0x30) == 0) {
            v4 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v3 & 4) != 0) {
            v4 |= 0x180;
        }
        else if((v1 & 0x180) == 0) {
            v4 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 0xC00) == 0) {
            v4 |= ((v3 & 8) != 0 || !composer1.changed(scrollState0) ? 0x400 : 0x800);
        }
        if((v3 & 16) != 0) {
            v4 |= 0x6000;
            z2 = z1;
        }
        else if((v1 & 0x6000) == 0) {
            z2 = z1;
            v4 |= (composer1.changed(z2) ? 0x4000 : 0x2000);
        }
        else {
            z2 = z1;
        }
        if((v1 & 0x30000) == 0) {
            v4 |= ((v3 & 0x20) != 0 || !composer1.changed(shape0) ? 0x10000 : 0x20000);
        }
        if((v1 & 0x180000) == 0) {
            v4 |= ((v3 & 0x40) != 0 || !composer1.changed(v) ? 0x80000 : 0x100000);
        }
        if((v3 & 0x80) != 0) {
            v4 |= 0xC00000;
        }
        else if((v1 & 0xC00000) == 0) {
            v4 |= (composer1.changed(f) ? 0x800000 : 0x400000);
        }
        if((v3 & 0x100) != 0) {
            v4 |= 0x6000000;
        }
        else if((v1 & 0x6000000) == 0) {
            v4 |= (composer1.changed(f1) ? 0x4000000 : 0x2000000);
        }
        if((v3 & 0x200) != 0) {
            v4 |= 0x30000000;
        }
        else if((v1 & 0x30000000) == 0) {
            v4 |= (composer1.changed(borderStroke0) ? 0x20000000 : 0x10000000);
        }
        if((v3 & 0x400) == 0) {
            v5 = (v2 & 6) == 0 ? v2 | (composer1.changedInstance(function30) ? 4 : 2) : v2;
        }
        else {
            v5 = v2 | 6;
        }
        if((v3 & 0x800) != 0) {
            v5 |= 0x30;
        }
        else if((v2 & 0x30) == 0) {
            v5 |= (composer1.changed(this) ? 0x20 : 16);
        }
        if((v4 & 306783379) != 306783378 || (v5 & 19) != 18 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v1 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier2 = (v3 & 4) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 8) == 0) {
                    scrollState2 = scrollState0;
                }
                else {
                    scrollState2 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 16) != 0) {
                    z2 = true;
                }
                if((v3 & 0x20) == 0) {
                    shape2 = shape0;
                }
                else {
                    shape2 = MenuDefaults.INSTANCE.getShape(composer1, 6);
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) == 0) {
                    v9 = v;
                }
                else {
                    v9 = MenuDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v4 &= 0xFFC7FFFF;
                }
                f4 = (v3 & 0x80) == 0 ? f : 0.0f;
                f5 = (v3 & 0x100) == 0 ? f1 : 0.0f;
                if((v3 & 0x200) == 0) {
                    borderStroke2 = borderStroke0;
                    v7 = v4;
                    v8 = v9;
                }
                else {
                    v7 = v4;
                    v8 = v9;
                    borderStroke2 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 8) != 0) {
                    v4 &= 0xFFFFE3FF;
                }
                if((v3 & 0x20) != 0) {
                    v4 &= 0xFFF8FFFF;
                }
                if((v3 & 0x40) != 0) {
                    v4 &= 0xFFC7FFFF;
                }
                f4 = f;
                f5 = f1;
                v7 = v4;
                modifier2 = modifier0;
                scrollState2 = scrollState0;
                shape2 = shape0;
                v8 = v;
                borderStroke2 = borderStroke0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2AF87329, v7, v5, "androidx.compose.material3.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:344)");
            }
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                SnapshotMutationPolicy snapshotMutationPolicy0 = SnapshotStateKt.neverEqualPolicy();
                mutableState0 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, snapshotMutationPolicy0);
                composer1.updateRememberedValue(mutableState0);
            }
            View view0 = (View)composer1.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            int v10 = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, composer1, 6).getTop(density0);
            composer1.startReplaceGroup(0x1329B2A6);
            if(z) {
                x5 x50 = composer1.rememberedValue();
                if(x50 == composer$Companion0.getEmpty()) {
                    x50 = new x5(mutableState0, 1);
                    composer1.updateRememberedValue(x50);
                }
                ExposedDropdownMenu_androidKt.access$SoftKeyboardListener(view0, density0, x50, composer1, 0x180);
            }
            composer1.endReplaceGroup();
            MutableTransitionState mutableTransitionState0 = composer1.rememberedValue();
            if(mutableTransitionState0 == composer$Companion0.getEmpty()) {
                mutableTransitionState0 = new MutableTransitionState(Boolean.FALSE);
                composer1.updateRememberedValue(mutableTransitionState0);
            }
            mutableTransitionState0.setTargetState(Boolean.valueOf(z));
            if(((Boolean)mutableTransitionState0.getCurrentState()).booleanValue() || ((Boolean)mutableTransitionState0.getTargetState()).booleanValue()) {
                MutableState mutableState1 = composer1.rememberedValue();
                if(mutableState1 == composer$Companion0.getEmpty()) {
                    f6 = f5;
                    mutableState1 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.box-impl(0x3F0000003F000000L), null, 2, null);
                    composer1.updateRememberedValue(mutableState1);
                }
                else {
                    f6 = f5;
                }
                boolean z4 = composer1.changed(density0);
                boolean z5 = composer1.changed(v10);
                ExposedDropdownMenuPositionProvider exposedDropdownMenuPositionProvider0 = composer1.rememberedValue();
                if(z4 || z5 || exposedDropdownMenuPositionProvider0 == composer$Companion0.getEmpty()) {
                    exposedDropdownMenuPositionProvider0 = new ExposedDropdownMenuPositionProvider(density0, v10, mutableState0, 0, new x(mutableState1, 2), 8, null);
                    composer1.updateRememberedValue(exposedDropdownMenuPositionProvider0);
                }
                String s = this.getAnchorType-Mg6Rgbw$material3_release();
                AndroidPopup_androidKt.Popup(exposedDropdownMenuPositionProvider0, function00, ExposedDropdownMenuDefaults.INSTANCE.popupProperties-pR6Bxps$material3_release(s, composer1, 0x30), ComposableLambdaKt.rememberComposableLambda(0xBF7C3019, true, new k9(this, modifier2, z2, mutableTransitionState0, mutableState1, scrollState2, shape2, v8, f4, f6, borderStroke2, function30), composer1, 54), composer1, v7 & 0x70 | 0xC00, 0);
            }
            else {
                f6 = f5;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            borderStroke1 = borderStroke2;
            f3 = f6;
            z3 = z2;
            f2 = f4;
            scrollState1 = scrollState2;
            v6 = v8;
            modifier1 = modifier2;
            shape1 = shape2;
        }
        else {
            composer1.skipToGroupEnd();
            shape1 = shape0;
            v6 = v;
            borderStroke1 = borderStroke0;
            modifier1 = modifier0;
            scrollState1 = scrollState0;
            z3 = z2;
            f2 = f;
            f3 = f1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l9(this, z, function00, modifier1, scrollState1, z3, shape1, v6, f2, f3, borderStroke1, function30, v1, v2, v3));
        }
    }

    @NotNull
    public abstract Modifier exposedDropdownSize(@NotNull Modifier arg1, boolean arg2);

    public static Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope0, Modifier modifier0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if((v & 1) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope0.exposedDropdownSize(modifier0, z);
    }

    @NotNull
    public abstract String getAnchorType-Mg6Rgbw$material3_release();

    // 去混淆评级： 低(20)
    @Deprecated(level = DeprecationLevel.WARNING, message = "Use overload that takes MenuAnchorType and enabled parameters", replaceWith = @ReplaceWith(expression = "menuAnchor(type, enabled)", imports = {}))
    @NotNull
    public final Modifier menuAnchor(@NotNull Modifier modifier0) {
        return ExposedDropdownMenuBoxScope.menuAnchor-fsE2BvY$default(this, modifier0, "PrimaryNotEditable", false, 2, null);
    }

    @NotNull
    public abstract Modifier menuAnchor-fsE2BvY(@NotNull Modifier arg1, @NotNull String arg2, boolean arg3);

    public static Modifier menuAnchor-fsE2BvY$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope0, Modifier modifier0, String s, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: menuAnchor-fsE2BvY");
        }
        if((v & 2) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope0.menuAnchor-fsE2BvY(modifier0, s, z);
    }
}

