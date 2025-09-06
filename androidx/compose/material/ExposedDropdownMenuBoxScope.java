package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt;
import androidx.compose.material3.i3;
import androidx.compose.material3.x;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.d4;

@ExperimentalMaterialApi
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001JU\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\u001C\u0010\f\u001A\u0018\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000F¢\u0006\u0002\b\u0010H\u0017¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001A\u00020\t*\u00020\t2\b\b\u0002\u0010\u0013\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "", "ExposedDropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "exposedDropdownSize", "matchTextFieldWidth", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,740:1\n25#2:741\n25#2:748\n1116#3,6:742\n1116#3,6:749\n1116#3,6:756\n74#4:755\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenuBoxScope\n*L\n249#1:741\n253#1:748\n249#1:742,6\n253#1:749,6\n258#1:756,6\n254#1:755\n*E\n"})
public interface ExposedDropdownMenuBoxScope {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @Composable
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        @Deprecated
        public static void ExposedDropdownMenu(@NotNull ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope0, boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable ScrollState scrollState0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
            exposedDropdownMenuBoxScope0.super.ExposedDropdownMenu(z, function00, modifier0, scrollState0, function30, composer0, v, v1);
        }

        public static Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope0, Modifier modifier0, boolean z, int v, Object object0) {
            return ExposedDropdownMenuBoxScope.exposedDropdownSize$default(exposedDropdownMenuBoxScope0, modifier0, z, v, object0);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    default void ExposedDropdownMenu(boolean z, @NotNull Function0 function00, @Nullable Modifier modifier0, @Nullable ScrollState scrollState0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        ScrollState scrollState2;
        Modifier modifier2;
        int v3;
        ScrollState scrollState1;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x3CFFBE8);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            modifier1 = modifier0;
        }
        else if((v & 0x380) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x100 : 0x80);
        }
        else {
            modifier1 = modifier0;
        }
        if((v & 0x1C00) == 0) {
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
        else if((0xE000 & v) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x70000 & v) == 0) {
            v2 |= (composer1.changed(this) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v2) != 74898 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier3 = (v1 & 4) == 0 ? modifier1 : Modifier.Companion;
                if((v1 & 8) == 0) {
                    modifier2 = modifier3;
                    scrollState2 = scrollState1;
                }
                else {
                    v2 &= 0xFFFFE3FF;
                    modifier2 = modifier3;
                    scrollState2 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 8) != 0) {
                    v2 &= 0xFFFFE3FF;
                }
                modifier2 = modifier1;
                scrollState2 = scrollState1;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3CFFBE8, v2, -1, "androidx.compose.material.ExposedDropdownMenuBoxScope.ExposedDropdownMenu (ExposedDropdownMenu.android.kt:238)");
            }
            composer1.startReplaceableGroup(0xE2A708A4);
            MutableTransitionState mutableTransitionState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableTransitionState0 == composer$Companion0.getEmpty()) {
                mutableTransitionState0 = new MutableTransitionState(Boolean.FALSE);
                composer1.updateRememberedValue(mutableTransitionState0);
            }
            composer1.endReplaceableGroup();
            mutableTransitionState0.setTargetState(Boolean.valueOf(z));
            if(((Boolean)mutableTransitionState0.getCurrentState()).booleanValue() || ((Boolean)mutableTransitionState0.getTargetState()).booleanValue()) {
                composer1.startReplaceableGroup(0xE2A708A4);
                MutableState mutableState0 = composer1.rememberedValue();
                if(mutableState0 == composer$Companion0.getEmpty()) {
                    mutableState0 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.box-impl(0x3F0000003F000000L), null, 2, null);
                    composer1.updateRememberedValue(mutableState0);
                }
                composer1.endReplaceableGroup();
                Object object0 = composer1.consume(CompositionLocalsKt.getLocalDensity());
                composer1.startReplaceableGroup(0x74C68B73);
                boolean z1 = composer1.changed(mutableState0);
                x x0 = composer1.rememberedValue();
                if(z1 || x0 == composer$Companion0.getEmpty()) {
                    x0 = new x(mutableState0, 6);
                    composer1.updateRememberedValue(x0);
                }
                composer1.endReplaceableGroup();
                ExposedDropdownMenuPopup_androidKt.ExposedDropdownMenuPopup(function00, new DropdownMenuPositionProvider(0L, ((Density)object0), x0, null), ComposableLambdaKt.composableLambda(composer1, 1001349006, true, new d4(mutableTransitionState0, mutableState0, scrollState2, this, modifier2, function30, 0)), composer1, v2 >> 3 & 14 | 0x180, 0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
            scrollState1 = scrollState2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i3(this, z, function00, modifier1, scrollState1, function30, v, v1, 5));
        }
    }

    @NotNull
    Modifier exposedDropdownSize(@NotNull Modifier arg1, boolean arg2);

    static Modifier exposedDropdownSize$default(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope0, Modifier modifier0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
        if((v & 1) != 0) {
            z = true;
        }
        return exposedDropdownMenuBoxScope0.exposedDropdownSize(modifier0, z);
    }
}

