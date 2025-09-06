package androidx.compose.material3;

import aa.o;
import android.content.res.Configuration;
import android.view.View;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zd.c;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001AS\u0010\u000B\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u001C\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000B\u0010\f¨\u0006\u0012²\u0006\u0010\u0010\u000E\u001A\u0004\u0018\u00010\r8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0010\u001A\u00020\u000F8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0011\u001A\u00020\u000F8\n@\nX\u008A\u008E\u0002"}, d2 = {"", "expanded", "Lkotlin/Function1;", "", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ExposedDropdownMenuBox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "anchorCoordinates", "", "anchorWidth", "menuMaxHeight", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1490:1\n77#2:1491\n77#2:1492\n77#2:1493\n77#2:1519\n1#3:1494\n1223#4,6:1495\n1223#4,6:1501\n1223#4,6:1507\n1223#4,6:1513\n1223#4,6:1523\n1223#4,6:1529\n1223#4,6:1535\n1223#4,6:1581\n1223#4,6:1587\n1223#4,6:1593\n1223#4,6:1599\n66#5:1520\n69#5:1521\n72#5:1522\n71#6:1541\n68#6,6:1542\n74#6:1576\n78#6:1580\n78#7,6:1548\n85#7,4:1563\n89#7,2:1573\n93#7:1579\n368#8,9:1554\n377#8:1575\n378#8,2:1577\n4032#9,6:1567\n81#10:1605\n107#10,2:1606\n75#11:1608\n108#11,2:1609\n75#11:1611\n108#11,2:1612\n148#12:1614\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.android.kt\nandroidx/compose/material3/ExposedDropdownMenu_androidKt\n*L\n141#1:1491\n142#1:1492\n143#1:1493\n152#1:1519\n147#1:1495,6\n148#1:1501,6\n149#1:1507,6\n151#1:1513,6\n156#1:1523,6\n159#1:1529,6\n201#1:1535,6\n216#1:1581,6\n226#1:1587,6\n230#1:1593,6\n241#1:1599,6\n153#1:1520\n154#1:1521\n155#1:1522\n200#1:1541\n200#1:1542,6\n200#1:1576\n200#1:1580\n200#1:1548,6\n200#1:1563,4\n200#1:1573,2\n200#1:1579\n200#1:1554,9\n200#1:1575\n200#1:1577,2\n200#1:1567,6\n147#1:1605\n147#1:1606,2\n148#1:1608\n148#1:1609,2\n149#1:1611\n149#1:1612,2\n1489#1:1614\n*E\n"})
public final class ExposedDropdownMenu_androidKt {
    public static final float a;

    static {
        ExposedDropdownMenu_androidKt.a = 16.0f;
    }

    @ExperimentalMaterial3Api
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ExposedDropdownMenuBox(boolean z, @NotNull Function1 function10, @Nullable Modifier modifier0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        View view0;
        int v7;
        int v6;
        int v5;
        FocusRequester focusRequester1;
        int v4;
        Modifier modifier3;
        Density density0;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x7B3CC390);
        boolean z1 = true;
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
            v2 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x7B3CC390, v2, -1, "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.android.kt:139)");
            }
            Configuration configuration0 = (Configuration)composer1.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
            Object object0 = composer1.consume(AndroidCompositionLocals_androidKt.getLocalView());
            Object object1 = composer1.consume(CompositionLocalsKt.getLocalDensity());
            int v3 = ((Density)object1).roundToPx-0680j_4(48.0f);
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            MutableIntState mutableIntState0 = composer1.rememberedValue();
            if(mutableIntState0 == composer$Companion0.getEmpty()) {
                mutableIntState0 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer1.updateRememberedValue(mutableIntState0);
            }
            MutableIntState mutableIntState1 = composer1.rememberedValue();
            if(mutableIntState1 == composer$Companion0.getEmpty()) {
                mutableIntState1 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer1.updateRememberedValue(mutableIntState1);
            }
            FocusRequester focusRequester0 = composer1.rememberedValue();
            if(focusRequester0 == composer$Companion0.getEmpty()) {
                focusRequester0 = new FocusRequester();
                composer1.updateRememberedValue(focusRequester0);
            }
            Object object2 = composer1.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            String s = Strings_androidKt.getString-2EP1pXo(string.m3c_dropdown_menu_expanded, composer1, 0);
            String s1 = Strings_androidKt.getString-2EP1pXo(string.m3c_dropdown_menu_collapsed, composer1, 0);
            String s2 = Strings_androidKt.getString-2EP1pXo(string.m3c_dropdown_menu_toggle, composer1, 0);
            MutableState mutableState1 = composer1.rememberedValue();
            if(mutableState1 == composer$Companion0.getEmpty()) {
                mutableState1 = SnapshotStateKt.mutableStateOf$default(MenuAnchorType.box-impl("PrimaryNotEditable"), null, 2, null);
                composer1.updateRememberedValue(mutableState1);
            }
            boolean z2 = composer1.changed(configuration0);
            boolean z3 = composer1.changed(((View)object0));
            boolean z4 = composer1.changed(((Density)object1));
            androidx.compose.material3.ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox.scope.1.1 exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$10 = composer1.rememberedValue();
            if((z2 | (((v2 & 14) == 4 ? 1 : 0) | ((v2 & 0x70) == 0x20 ? 1 : 0)) | z3 | z4) != 0 || exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$10 == composer$Companion0.getEmpty()) {
                v5 = v2 & 0x70;
                v7 = v3;
                v6 = v2 & 14;
                density0 = (Density)object1;
                view0 = (View)object0;
                modifier3 = modifier2;
                v4 = v2;
                focusRequester1 = focusRequester0;
                androidx.compose.material3.ExposedDropdownMenu_androidKt.ExposedDropdownMenuBox.scope.1.1 exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$11 = new n9(focusRequester0, z, s, s1, s2, ((SoftwareKeyboardController)object2), mutableState1, function10, mutableIntState0, mutableIntState1) {
                    public final FocusRequester a;
                    public final boolean b;
                    public final String c;
                    public final String d;
                    public final String e;
                    public final SoftwareKeyboardController f;
                    public final MutableState g;
                    public final Function1 h;
                    public final MutableIntState i;
                    public final MutableIntState j;

                    {
                        this.a = focusRequester0;
                        this.b = z;
                        this.c = s;
                        this.d = s1;
                        this.e = s2;
                        this.f = softwareKeyboardController0;
                        this.g = mutableState0;
                        this.h = function10;
                        this.i = mutableIntState0;
                        this.j = mutableIntState1;
                        super(null);
                    }

                    @Override  // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier exposedDropdownSize(@NotNull Modifier modifier0, boolean z) {
                        return LayoutModifierKt.layout(modifier0, new v9(z, this.i, this.j));
                    }

                    @Override  // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    @NotNull
                    public String getAnchorType-Mg6Rgbw$material3_release() {
                        return ((MenuAnchorType)this.g.getValue()).unbox-impl();
                    }

                    @Override  // androidx.compose.material3.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier menuAnchor-fsE2BvY(@NotNull Modifier modifier0, @NotNull String s, boolean z) {
                        Modifier modifier1 = FocusRequesterModifierKt.focusRequester(modifier0, this.a);
                        if(!z) {
                            return modifier1.then(Modifier.Companion);
                        }
                        w9 w90 = new w9(this.g, s, this.h, this.b);
                        return modifier1.then(ExposedDropdownMenu_androidKt.access$expandable-Gq7TBQ4(Modifier.Companion, this.b, w90, s, this.c, this.d, this.e, this.f));
                    }
                };
                composer1.updateRememberedValue(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$11);
                exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$10 = exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$11;
            }
            else {
                density0 = (Density)object1;
                modifier3 = modifier2;
                v4 = v2;
                focusRequester1 = focusRequester0;
                v5 = v2 & 0x70;
                v6 = v2 & 14;
                v7 = v3;
                view0 = (View)object0;
            }
            boolean z5 = composer1.changedInstance(view0);
            boolean z6 = composer1.changed(v7);
            c7 c70 = composer1.rememberedValue();
            if(z5 || z6 || c70 == composer$Companion0.getEmpty()) {
                c70 = new c7(v7, 1, view0, mutableState0, mutableIntState0, mutableIntState1);
                composer1.updateRememberedValue(c70);
            }
            Modifier modifier4 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier3, c70);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v8 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function00 = composeUiNode$Companion0.getConstructor();
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v8)) {
                a.t(v8, composer1, v8, function20);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            function30.invoke(exposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$10, composer1, ((int)(v4 >> 6 & 0x70)));
            composer1.endNode();
            composer1.startReplaceGroup(0x1969CC5E);
            if(z) {
                boolean z7 = composer1.changedInstance(view0);
                boolean z8 = composer1.changed(v7);
                q9 q90 = composer1.rememberedValue();
                if(z7 || z8 || q90 == composer$Companion0.getEmpty()) {
                    q90 = new q9(v7, 0, view0, mutableState0, mutableIntState1);
                    composer1.updateRememberedValue(q90);
                }
                ExposedDropdownMenu_androidKt.a(view0, density0, q90, composer1, 0);
            }
            composer1.endReplaceGroup();
            r9 r90 = composer1.rememberedValue();
            if(v6 == 4 || r90 == composer$Companion0.getEmpty()) {
                r90 = new r9(z, focusRequester1, 0);
                composer1.updateRememberedValue(r90);
            }
            EffectsKt.SideEffect(r90, composer1, 0);
            if(v5 != 0x20) {
                z1 = false;
            }
            s9 s90 = composer1.rememberedValue();
            if(z1 || s90 == composer$Companion0.getEmpty()) {
                s90 = new s9(function10, 0);
                composer1.updateRememberedValue(s90);
            }
            BackHandlerKt.BackHandler(z, s90, composer1, v6, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t9(z, function10, modifier1, function30, v, v1, 0));
        }
    }

    public static final void a(View view0, Density density0, Function0 function00, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xB159AF58);
        int v1 = (v & 6) == 0 ? (composer1.changedInstance(view0) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (composer1.changed(density0) ? 0x20 : 16);
        }
        if((v & 0x180) == 0) {
            v1 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v1 & 0x93) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB159AF58, v1, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:237)");
            }
            boolean z = composer1.changedInstance(view0);
            o o0 = composer1.rememberedValue();
            if(z || (v1 & 0x380) == 0x100 || o0 == Composer.Companion.getEmpty()) {
                o0 = new o(6, view0, function00);
                composer1.updateRememberedValue(o0);
            }
            EffectsKt.DisposableEffect(view0, density0, o0, composer1, v1 & 0x7E);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new androidx.compose.foundation.text.selection.a(v, 1, view0, density0, function00));
        }
    }

    public static final LayoutCoordinates access$ExposedDropdownMenuBox$lambda$2(MutableState mutableState0) {
        return (LayoutCoordinates)mutableState0.getValue();
    }

    public static final void access$ExposedDropdownMenuBox$lambda$3(MutableState mutableState0, LayoutCoordinates layoutCoordinates0) {
        mutableState0.setValue(layoutCoordinates0);
    }

    public static final int access$ExposedDropdownMenuBox$lambda$5(MutableIntState mutableIntState0) {
        return mutableIntState0.getIntValue();
    }

    public static final void access$ExposedDropdownMenuBox$lambda$6(MutableIntState mutableIntState0, int v) {
        mutableIntState0.setIntValue(v);
    }

    public static final int access$ExposedDropdownMenuBox$lambda$8(MutableIntState mutableIntState0) {
        return mutableIntState0.getIntValue();
    }

    public static final void access$ExposedDropdownMenuBox$lambda$9(MutableIntState mutableIntState0, int v) {
        mutableIntState0.setIntValue(v);
    }

    public static final void access$SoftKeyboardListener(View view0, Density density0, Function0 function00, Composer composer0, int v) {
        ExposedDropdownMenu_androidKt.a(view0, density0, function00, composer0, v);
    }

    public static final int access$calculateMaxHeight(Rect rect0, Rect rect1, int v) {
        if(rect1 != null) {
            float f = rect0.getTop() + ((float)v);
            float f1 = rect0.getBottom() - ((float)v);
            return rect1.getTop() > rect0.getBottom() || rect1.getBottom() < rect0.getTop() ? Math.max(c.roundToInt(f1 - f), 0) : Math.max(c.roundToInt(Math.max(rect1.getTop() - f, f1 - rect1.getBottom())), 0);
        }
        return 0;
    }

    public static final Modifier access$expandable-Gq7TBQ4(Modifier modifier0, boolean z, Function0 function00, String s, String s1, String s2, String s3, SoftwareKeyboardController softwareKeyboardController0) {
        return SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifier0, function00, new y9(s, function00, null)), false, new aa(s, z, s1, s2, s3, function00, softwareKeyboardController0), 1, null);
    }

    public static final Rect access$getAnchorBounds(LayoutCoordinates layoutCoordinates0) {
        return layoutCoordinates0 == null ? Rect.Companion.getZero() : RectKt.Rect-tz77jQw(LayoutCoordinatesKt.positionInWindow(layoutCoordinates0), IntSizeKt.toSize-ozmzZPI(layoutCoordinates0.getSize-YbymL2g()));
    }

    public static final float access$getExposedDropdownMenuItemHorizontalPadding$p() [...] // 潜在的解密器

    public static final Rect access$getWindowBounds(View view0) {
        android.graphics.Rect rect0 = new android.graphics.Rect();
        view0.getWindowVisibleDisplayFrame(rect0);
        return RectHelper_androidKt.toComposeRect(rect0);
    }
}

