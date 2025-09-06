package androidx.compose.foundation.contextmenu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.foundation.text.selection.y;
import androidx.compose.material3.i3;
import androidx.compose.material3.sf;
import androidx.compose.material3.v2;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment.Vertical;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import androidx.room.a;
import j.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\u001AH\u0010\u000B\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u000B\u0010\f\u001AP\u0010\u000B\u001A\u00020\u00032\u0006\u0010\u0001\u001A\u00020\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\r2\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u000B\u0010\u000F\u001A?\u0010\u0013\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0006\u001A\u00020\u00052\u001C\u0010\u0012\u001A\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\u0011¢\u0006\u0002\b\tH\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001Ak\u0010\u001F\u001A\u00020\u00032\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0006\u001A\u00020\u00052*\b\u0002\u0010\u001D\u001A$\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\u001A\u0012\b\b\u001B\u0012\u0004\b\b(\u001C\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\b\u00112\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u001F\u0010 \u001A#\u0010$\u001A\u00020\r2\b\b\u0003\u0010\"\u001A\u00020!2\b\b\u0003\u0010#\u001A\u00020!H\u0001¢\u0006\u0004\b$\u0010%\" \u0010,\u001A\u00020\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b&\u0010\'\u0012\u0004\b*\u0010+\u001A\u0004\b(\u0010)¨\u0006-"}, d2 = {"Landroidx/compose/ui/window/PopupPositionProvider;", "popupPositionProvider", "Lkotlin/Function0;", "", "onDismiss", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "Lkotlin/ExtensionFunctionType;", "contextMenuBuilderBlock", "ContextMenuPopup", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "colors", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/contextmenu/ContextMenuColors;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "content", "ContextMenuColumn", "(Landroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "label", "", "enabled", "Landroidx/compose/ui/graphics/Color;", "Lkotlin/ParameterName;", "name", "iconColor", "leadingIcon", "onClick", "ContextMenuItem", "(Ljava/lang/String;ZLandroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "backgroundStyleId", "foregroundStyleId", "computeContextMenuColors", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "b", "Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "getDefaultContextMenuColors", "()Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "getDefaultContextMenuColors$annotations", "()V", "DefaultContextMenuColors", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContextMenuUi.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,415:1\n85#2:416\n82#2,6:417\n88#2:451\n92#2:455\n78#3,6:423\n85#3,4:438\n89#3,2:448\n93#3:454\n78#3,6:465\n85#3,4:480\n89#3,2:490\n78#3,6:501\n85#3,4:516\n89#3,2:526\n93#3:532\n93#3:536\n368#4,9:429\n377#4:450\n378#4,2:452\n368#4,9:471\n377#4:492\n368#4,9:507\n377#4:528\n378#4,2:530\n378#4,2:534\n4032#5,6:442\n4032#5,6:484\n4032#5,6:520\n1223#6,6:456\n1223#6,6:540\n98#7,3:462\n101#7:493\n105#7:537\n71#8:494\n68#8,6:495\n74#8:529\n78#8:533\n77#9:538\n77#9:539\n*S KotlinDebug\n*F\n+ 1 ContextMenuUi.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuUi_androidKt\n*L\n146#1:416\n146#1:417,6\n146#1:451\n146#1:455\n146#1:423,6\n146#1:438,4\n146#1:448,2\n146#1:454\n183#1:465,6\n183#1:480,4\n183#1:490,2\n205#1:501,6\n205#1:516,4\n205#1:526,2\n205#1:532\n183#1:536\n146#1:429,9\n146#1:450\n146#1:452,2\n183#1:471,9\n183#1:492\n205#1:507,9\n205#1:528\n205#1:530,2\n183#1:534,2\n146#1:442,6\n183#1:484,6\n205#1:520,6\n190#1:456,6\n357#1:540,6\n183#1:462,3\n183#1:493\n183#1:537\n205#1:494\n205#1:495,6\n205#1:529\n205#1:533\n356#1:538\n357#1:539\n*E\n"})
public final class ContextMenuUi_androidKt {
    public static final PopupProperties a;
    public static final ContextMenuColors b;

    // 去混淆评级： 低(33)
    static {
        ContextMenuUi_androidKt.a = new PopupProperties(true, false, false, false, 14, null);
        ContextMenuUi_androidKt.b = new ContextMenuColors(0xFFFFFFFF00000000L, 0xFF00000000000000L, 0xFF00000000000000L, Color.copy-wmQWz5c$default(0xFF00000000000000L, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.copy-wmQWz5c$default(0xFF00000000000000L, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    @VisibleForTesting
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuColumn(@NotNull ContextMenuColors contextMenuColors0, @Nullable Modifier modifier0, @NotNull Function3 function30, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xC916B2E3);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(contextMenuColors0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(modifier0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xC916B2E3, v2, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumn (ContextMenuUi.android.kt:144)");
            }
            Modifier modifier2 = ScrollKt.verticalScroll$default(PaddingKt.padding-VpY3zN4$default(IntrinsicKt.width(BackgroundKt.background-bw27NRU$default(ShadowKt.shadow-s4CzXII$default(modifier1, 3.0f, RoundedCornerShapeKt.RoundedCornerShape-0680j_4(4.0f), false, 0L, 0L, 28, null), contextMenuColors0.getBackgroundColor-0d7_KjU(), null, 2, null), IntrinsicSize.Max), 0.0f, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer1, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicy0 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer1, 0);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            function30.invoke(ColumnScopeInstance.INSTANCE, composer1, ((int)((v2 << 3 & 0x1C00) >> 6 & 0x70 | 6)));
            composer1.endNode();
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
            scopeUpdateScope0.updateScope(new sf(contextMenuColors0, modifier1, function30, v, v1, 20));
        }
    }

    @SuppressLint({"ComposableLambdaParameterPosition"})
    @VisibleForTesting
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContextMenuItem(@NotNull String s, boolean z, @NotNull ContextMenuColors contextMenuColors0, @Nullable Modifier modifier0, @Nullable Function3 function30, @NotNull Function0 function00, @Nullable Composer composer0, int v, int v1) {
        Function3 function32;
        Function3 function31;
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x2F25FB7F);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(s) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(contextMenuColors0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            modifier1 = modifier0;
        }
        else if((v & 0xC00) == 0) {
            modifier1 = modifier0;
            v2 |= (composer1.changed(modifier1) ? 0x800 : 0x400);
        }
        else {
            modifier1 = modifier0;
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
            function31 = function30;
        }
        else if((v & 0x6000) == 0) {
            function31 = function30;
            v2 |= (composer1.changedInstance(function31) ? 0x4000 : 0x2000);
        }
        else {
            function31 = function30;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((v & 0x30000) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x20000 : 0x10000);
        }
        if((74899 & v2) != 74898 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 8) == 0 ? modifier1 : Modifier.Companion;
            if((v1 & 16) != 0) {
                function31 = null;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x2F25FB7F, v2, -1, "androidx.compose.foundation.contextmenu.ContextMenuItem (ContextMenuUi.android.kt:181)");
            }
            ContextMenuSpec contextMenuSpec0 = ContextMenuSpec.INSTANCE;
            Vertical alignment$Vertical0 = contextMenuSpec0.getLabelVerticalTextAlignment();
            HorizontalOrVertical arrangement$HorizontalOrVertical0 = Arrangement.INSTANCE.spacedBy-0680j_4(0.0f);
            b b0 = composer1.rememberedValue();
            if((((v2 & 0x70) == 0x20 ? 1 : 0) | ((0x70000 & v2) == 0x20000 ? 1 : 0)) != 0 || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(z, function00, 3);
                composer1.updateRememberedValue(b0);
            }
            Modifier modifier3 = PaddingKt.padding-VpY3zN4$default(SizeKt.sizeIn-qDBjuR0(SizeKt.fillMaxWidth$default(ClickableKt.clickable-XHw0xAI$default(modifier2, z, s, null, b0, 4, null), 0.0f, 1, null), 112.0f, 48.0f, 280.0f, 48.0f), 0.0f, 0.0f, 2, null);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(arrangement$HorizontalOrVertical0, alignment$Vertical0, composer1, 54);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier4 = ComposedModifierKt.materializeModifier(composer1, modifier3);
            Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function01 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function01);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier4, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            if(function31 == null) {
                composer1.startReplaceGroup(0x210E0CCD);
            }
            else {
                composer1.startReplaceGroup(0x210E0CCE);
                Modifier modifier5 = SizeKt.requiredSizeIn-qDBjuR0$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 2, null);
                MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
                CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
                Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
                Function0 function02 = composeUiNode$Companion0.getConstructor();
                if(composer1.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer1.startReusableNode();
                if(composer1.getInserting()) {
                    composer1.createNode(function02);
                }
                else {
                    composer1.useNode();
                }
                Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
                if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                    a.t(v4, composer1, v4, function21);
                }
                Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
                function31.invoke(Color.box-impl((z ? contextMenuColors0.getIconColor-0d7_KjU() : contextMenuColors0.getDisabledIconColor-0d7_KjU())), composer1, 0);
                composer1.endNode();
            }
            composer1.endReplaceGroup();
            TextStyle textStyle0 = contextMenuSpec0.textStyle-8_81llA((z ? contextMenuColors0.getTextColor-0d7_KjU() : contextMenuColors0.getDisabledTextColor-0d7_KjU()));
            BasicTextKt.BasicText-VhcvRP8(s, rowScopeInstance0.weight(Modifier.Companion, 1.0f, true), textStyle0, null, 0, false, 1, 0, null, composer1, v2 & 14 | 0x180000, 440);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function32 = function31;
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            function32 = function31;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new i3(s, z, contextMenuColors0, modifier1, function32, function00, v, v1));
        }
    }

    @VisibleForTesting
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ContextMenuPopup(@NotNull PopupPositionProvider popupPositionProvider0, @NotNull Function0 function00, @Nullable Modifier modifier0, @NotNull ContextMenuColors contextMenuColors0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x56425B5B);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(popupPositionProvider0) ? 4 : 2) | v : v;
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
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(contextMenuColors0) ? 0x800 : 0x400);
        }
        if((v1 & 16) != 0) {
            v2 |= 0x6000;
        }
        else if((v & 0x6000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x4000 : 0x2000);
        }
        if((v2 & 9363) != 9362 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 4) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x56425B5B, v2, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:121)");
            }
            ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0x2F709E7D, true, new y(contextMenuColors0, modifier2, function10), composer1, 54);
            AndroidPopup_androidKt.Popup(popupPositionProvider0, function00, ContextMenuUi_androidKt.a, composableLambda0, composer1, v2 & 14 | 0xD80 | v2 & 0x70, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new v2(popupPositionProvider0, function00, modifier1, contextMenuColors0, function10, v, v1, 6));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void ContextMenuPopup(@NotNull PopupPositionProvider popupPositionProvider0, @NotNull Function0 function00, @Nullable Modifier modifier0, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        int v2;
        Composer composer1 = composer0.startRestartGroup(712057293);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(popupPositionProvider0) ? 4 : 2) | v : v;
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
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v2 & 0x493) != 1170 || !composer1.getSkipping()) {
            if((v1 & 4) != 0) {
                modifier0 = Modifier.Companion;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(712057293, v2, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:103)");
            }
            ContextMenuUi_androidKt.ContextMenuPopup(popupPositionProvider0, function00, modifier0, ContextMenuUi_androidKt.computeContextMenuColors(0, 0, composer1, 0, 3), function10, composer1, v2 & 0x3FE | v2 << 3 & 0xE000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b0(popupPositionProvider0, function00, modifier0, function10, v, v1));
        }
    }

    @VisibleForTesting
    @Composable
    @NotNull
    public static final ContextMenuColors computeContextMenuColors(@StyleRes int v, @StyleRes int v1, @Nullable Composer composer0, int v2, int v3) {
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x64B3CE0E, v2, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:354)");
        }
        Context context0 = (Context)composer0.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Configuration configuration0 = (Configuration)composer0.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        boolean z = composer0.changed(context0);
        boolean z1 = composer0.changed(configuration0);
        ContextMenuColors contextMenuColors0 = composer0.rememberedValue();
        if(z1 || z || contextMenuColors0 == Composer.Companion.getEmpty()) {
            ContextMenuColors contextMenuColors1 = ContextMenuUi_androidKt.b;
            long v4 = contextMenuColors1.getBackgroundColor-0d7_KjU();
            TypedArray typedArray0 = context0.obtainStyledAttributes(((v3 & 1) == 0 ? v : 0x1030086), new int[]{0x1010031});
            int v5 = ColorKt.toArgb-8_81llA(v4);
            int v6 = typedArray0.getColor(0, v5);
            typedArray0.recycle();
            if(v6 != v5) {
                v4 = ColorKt.Color(v6);
            }
            TypedArray typedArray1 = context0.obtainStyledAttributes(((v3 & 2) == 0 ? v1 : 0x1030080), new int[]{0x1010036});
            ColorStateList colorStateList0 = typedArray1.getColorStateList(0);
            typedArray1.recycle();
            long v7 = contextMenuColors1.getTextColor-0d7_KjU();
            int v8 = ColorKt.toArgb-8_81llA(v7);
            Integer integer0 = null;
            Integer integer1 = colorStateList0 == null ? null : colorStateList0.getColorForState(new int[]{0x101009E}, v8);
            if(integer1 != null && ((int)integer1) != v8) {
                v7 = ColorKt.Color(((int)integer1));
            }
            long v9 = contextMenuColors1.getDisabledTextColor-0d7_KjU();
            int v10 = ColorKt.toArgb-8_81llA(v9);
            if(colorStateList0 != null) {
                integer0 = colorStateList0.getColorForState(new int[]{0xFEFEFF62}, v10);
            }
            long v11 = integer0 == null || ((int)integer0) == v10 ? v9 : ColorKt.Color(((int)integer0));
            contextMenuColors0 = new ContextMenuColors(v4, v7, v7, v11, v11, null);
            composer0.updateRememberedValue(contextMenuColors0);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return contextMenuColors0;
    }

    @NotNull
    public static final ContextMenuColors getDefaultContextMenuColors() {
        return ContextMenuUi_androidKt.b;
    }

    @VisibleForTesting
    public static void getDefaultContextMenuColors$annotations() {
    }
}

