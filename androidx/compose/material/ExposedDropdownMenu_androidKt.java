package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.c3;
import androidx.compose.material3.c7;
import androidx.compose.material3.ge;
import androidx.compose.material3.r9;
import androidx.compose.material3.t9;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.g4;
import p0.i4;
import r0.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001AS\u0010\u000B\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u001C\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u0010²\u0006\u000E\u0010\u000E\u001A\u00020\r8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u000F\u001A\u00020\r8\n@\nX\u008A\u008E\u0002"}, d2 = {"", "expanded", "Lkotlin/Function1;", "", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ExposedDropdownMenuBox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "width", "menuHeight", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,740:1\n74#2:741\n74#2:742\n25#3:743\n25#3:750\n25#3:758\n67#3,3:765\n66#3:768\n25#3:775\n456#3,8:805\n464#3,3:819\n467#3,3:823\n1116#4,6:744\n1116#4,6:751\n1116#4,6:759\n1116#4,6:769\n1116#4,6:776\n1116#4,6:782\n1116#4,6:828\n1#5:757\n68#6,6:788\n74#6:822\n78#6:827\n79#7,11:794\n92#7:826\n3737#8,6:813\n75#9:834\n108#9,2:835\n75#9:837\n108#9,2:838\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material/ExposedDropdownMenu_androidKt\n*L\n97#1:741\n98#1:742\n99#1:743\n100#1:750\n102#1:758\n104#1:765,3\n104#1:768\n117#1:775\n119#1:805,8\n119#1:819,3\n119#1:823,3\n99#1:744,6\n100#1:751,6\n102#1:759,6\n104#1:769,6\n117#1:776,6\n131#1:782,6\n138#1:828,6\n119#1:788,6\n119#1:822\n119#1:827\n119#1:794,11\n119#1:826\n119#1:813,6\n99#1:834\n99#1:835,2\n100#1:837\n100#1:838,2\n*E\n"})
public final class ExposedDropdownMenu_androidKt {
    @ExperimentalMaterialApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ExposedDropdownMenuBox(boolean z, @NotNull Function1 function10, @Nullable Modifier modifier0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xDB2C0BD3);
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
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v2 & 5851) != 1170 || !composer1.getSkipping()) {
            modifier1 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDB2C0BD3, v2, -1, "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.android.kt:95)");
            }
            Density density0 = (Density)composer1.consume(CompositionLocalsKt.getLocalDensity());
            View view0 = (View)composer1.consume(AndroidCompositionLocals_androidKt.getLocalView());
            composer1.startReplaceableGroup(0xE2A708A4);
            MutableIntState mutableIntState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableIntState0 == composer$Companion0.getEmpty()) {
                mutableIntState0 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer1.updateRememberedValue(mutableIntState0);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xE2A708A4);
            MutableIntState mutableIntState1 = composer1.rememberedValue();
            if(mutableIntState1 == composer$Companion0.getEmpty()) {
                mutableIntState1 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer1.updateRememberedValue(mutableIntState1);
            }
            composer1.endReplaceableGroup();
            int v3 = density0.roundToPx-0680j_4(48.0f);
            composer1.startReplaceableGroup(0xE2A708A4);
            Ref ref0 = composer1.rememberedValue();
            if(ref0 == composer$Companion0.getEmpty()) {
                ref0 = new Ref();
                composer1.updateRememberedValue(ref0);
            }
            composer1.endReplaceableGroup();
            Integer integer0 = mutableIntState1.getIntValue();
            Integer integer1 = mutableIntState0.getIntValue();
            composer1.startReplaceableGroup(0x607FB4C4);
            boolean z1 = composer1.changed(density0);
            boolean z2 = composer1.changed(integer0);
            boolean z3 = composer1.changed(integer1);
            androidx.compose.material.ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox.scope.1.1 exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$10 = composer1.rememberedValue();
            if((z2 | z1 | z3) != 0 || exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$10 == composer$Companion0.getEmpty()) {
                exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$10 = new ExposedDropdownMenuBoxScope() {
                    public final Density a;
                    public final MutableIntState b;
                    public final MutableIntState c;

                    {
                        Density density0 = density0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        MutableIntState mutableIntState0 = mutableIntState1;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        MutableIntState mutableIntState1 = mutableIntState0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        this.a = density0;
                        this.b = mutableIntState0;
                        this.c = mutableIntState1;
                    }

                    @Override  // androidx.compose.material.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier exposedDropdownSize(@NotNull Modifier modifier0, boolean z) {
                        int v = ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$4(this.b);
                        Modifier modifier1 = SizeKt.heightIn-VpY3zN4$default(modifier0, 0.0f, this.a.toDp-u2uoSUM(v), 1, null);
                        return z ? SizeKt.width-3ABfNKs(modifier1, this.a.toDp-u2uoSUM(ExposedDropdownMenu_androidKt.access$ExposedDropdownMenuBox$lambda$1(this.c))) : modifier1;
                    }
                };
                composer1.updateRememberedValue(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$10);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xE2A708A4);
            FocusRequester focusRequester0 = composer1.rememberedValue();
            if(focusRequester0 == composer$Companion0.getEmpty()) {
                focusRequester0 = new FocusRequester();
                composer1.updateRememberedValue(focusRequester0);
            }
            composer1.endReplaceableGroup();
            Modifier modifier2 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier1, new c7(ref0, view0, v3, mutableIntState0, mutableIntState1));
            composer1.startReplaceableGroup(0x74C67945);
            boolean z4 = composer1.changedInstance(function10);
            boolean z5 = composer1.changed(z);
            c3 c30 = composer1.rememberedValue();
            if(z4 || z5 || c30 == composer$Companion0.getEmpty()) {
                c30 = new c3(4, z, function10);
                composer1.updateRememberedValue(c30);
            }
            composer1.endReplaceableGroup();
            String s = Strings_androidKt.getString-4foXLRw(4, composer1, 6);
            Modifier modifier3 = FocusRequesterModifierKt.focusRequester(SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier2, c30, new i4(c30, null)), false, new ge(s, c30, 4), 1, null), focusRequester0);
            composer1.startReplaceableGroup(0x2BB5B5D7);
            MeasurePolicy measurePolicy0 = a.i(Alignment.Companion, false, composer1, 0, -1323940314);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
            Function3 function31 = LayoutKt.modifierMaterializerOf(modifier3);
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function00);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                androidx.room.a.t(v4, composer1, v4, function20);
            }
            a.w(0, function31, SkippableUpdater.box-impl(composer1), composer1, 2058660585);
            function30.invoke(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$10, composer1, ((int)(v2 >> 6 & 0x70)));
            composer1.endReplaceableGroup();
            composer1.endNode();
            composer1.endReplaceableGroup();
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0x74C67A04);
            boolean z6 = composer1.changed(z);
            boolean z7 = composer1.changed(focusRequester0);
            r9 r90 = composer1.rememberedValue();
            if(z6 || z7 || r90 == composer$Companion0.getEmpty()) {
                r90 = new r9(z, focusRequester0, 1);
                composer1.updateRememberedValue(r90);
            }
            composer1.endReplaceableGroup();
            EffectsKt.SideEffect(r90, composer1, 0);
            EffectsKt.DisposableEffect(view0, new g4(v3, 0, view0, ref0, mutableIntState1), composer1, 8);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t9(z, function10, modifier1, function30, v, v1, 1));
        }
    }

    public static final int access$ExposedDropdownMenuBox$lambda$1(MutableIntState mutableIntState0) {
        return mutableIntState0.getIntValue();
    }

    public static final void access$ExposedDropdownMenuBox$lambda$2(MutableIntState mutableIntState0, int v) {
        mutableIntState0.setIntValue(v);
    }

    public static final int access$ExposedDropdownMenuBox$lambda$4(MutableIntState mutableIntState0) {
        return mutableIntState0.getIntValue();
    }

    public static final void access$ExposedDropdownMenuBox$lambda$5(MutableIntState mutableIntState0, int v) {
        mutableIntState0.setIntValue(v);
    }

    public static final void access$updateHeight(View view0, LayoutCoordinates layoutCoordinates0, int v, Function1 function10) {
        if(layoutCoordinates0 != null) {
            Rect rect0 = new Rect();
            view0.getWindowVisibleDisplayFrame(rect0);
            function10.invoke(((int)(((int)Math.max(LayoutCoordinatesKt.boundsInWindow(layoutCoordinates0).getTop() - ((float)rect0.top), ((float)(rect0.bottom - rect0.top)) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates0).getBottom())) - v)));
        }
    }
}

