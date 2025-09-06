package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.BadgeTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\u0007\n\u0002\b\u0005\u001AU\u0010\t\u001A\u00020\u00022\u001C\u0010\u0005\u001A\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\u001C\u0010\b\u001A\u0018\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0004\b\t\u0010\n\u001AR\u0010\u0011\u001A\u00020\u00022\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\r\u001A\u00020\u000B2 \b\u0002\u0010\b\u001A\u001A\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010\"\u001A\u0010\u0017\u001A\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u001A\u0010\u001A\u001A\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001A\u0004\b\u0019\u0010\u0016\"\u001A\u0010\u001D\u001A\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u0014\u001A\u0004\b\u001C\u0010\u0016\"\u001A\u0010 \u001A\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u0014\u001A\u0004\b\u001F\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006&²\u0006\u000E\u0010\"\u001A\u00020!8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010#\u001A\u00020!8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010$\u001A\u00020!8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010%\u001A\u00020!8\n@\nX\u008A\u008E\u0002"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "badge", "Landroidx/compose/ui/Modifier;", "modifier", "content", "BadgedBox", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/RowScope;", "Badge-eopBjH0", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Badge", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getBadgeWithContentHorizontalPadding", "()F", "BadgeWithContentHorizontalPadding", "b", "getBadgeWithContentHorizontalOffset", "BadgeWithContentHorizontalOffset", "c", "getBadgeWithContentVerticalOffset", "BadgeWithContentVerticalOffset", "d", "getBadgeOffset", "BadgeOffset", "", "layoutAbsoluteLeft", "layoutAbsoluteTop", "greatGrandParentAbsoluteRight", "greatGrandParentAbsoluteTop", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,243:1\n1223#2,6:244\n1223#2,6:250\n1223#2,6:256\n1223#2,6:262\n1223#2,6:268\n1223#2,6:274\n78#3,6:280\n85#3,4:295\n89#3,2:305\n78#3,6:314\n85#3,4:329\n89#3,2:339\n93#3:345\n78#3,6:354\n85#3,4:369\n89#3,2:379\n93#3:385\n93#3:389\n78#3,6:393\n85#3,4:408\n89#3,2:418\n93#3:424\n368#4,9:286\n377#4:307\n368#4,9:320\n377#4:341\n378#4,2:343\n368#4,9:360\n377#4:381\n378#4,2:383\n378#4,2:387\n368#4,9:399\n377#4:420\n378#4,2:422\n4032#5,6:299\n4032#5,6:333\n4032#5,6:373\n4032#5,6:412\n71#6:308\n69#6,5:309\n74#6:342\n78#6:346\n71#6:347\n68#6,6:348\n74#6:382\n78#6:386\n98#7,3:390\n101#7:421\n105#7:425\n76#8:426\n109#8,2:427\n76#8:429\n109#8,2:430\n76#8:432\n109#8,2:433\n76#8:435\n109#8,2:436\n148#9:438\n148#9:439\n148#9:440\n148#9:441\n*S KotlinDebug\n*F\n+ 1 Badge.kt\nandroidx/compose/material3/BadgeKt\n*L\n74#1:244,6\n75#1:250,6\n78#1:256,6\n79#1:262,6\n91#1:268,6\n103#1:274,6\n81#1:280,6\n81#1:295,4\n81#1:305,2\n83#1:314,6\n83#1:329,4\n83#1:339,2\n83#1:345\n88#1:354,6\n88#1:369,4\n88#1:379,2\n88#1:385\n81#1:389\n194#1:393,6\n194#1:408,4\n194#1:418,2\n194#1:424\n81#1:286,9\n81#1:307\n83#1:320,9\n83#1:341\n83#1:343,2\n88#1:360,9\n88#1:381\n88#1:383,2\n81#1:387,2\n194#1:399,9\n194#1:420\n194#1:422,2\n81#1:299,6\n83#1:333,6\n88#1:373,6\n194#1:412,6\n83#1:308\n83#1:309,5\n83#1:342\n83#1:346\n88#1:347\n88#1:348,6\n88#1:382\n88#1:386\n194#1:390,3\n194#1:421\n194#1:425\n74#1:426\n74#1:427,2\n75#1:429\n75#1:430,2\n78#1:432\n78#1:433,2\n79#1:435\n79#1:436,2\n229#1:438\n235#1:439\n236#1:440\n242#1:441\n*E\n"})
public final class BadgeKt {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        BadgeKt.a = 4.0f;
        BadgeKt.b = 12.0f;
        BadgeKt.c = 14.0f;
        BadgeKt.d = 6.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Badge-eopBjH0(@Nullable Modifier modifier0, long v, long v1, @Nullable Function3 function30, @Nullable Composer composer0, int v2, int v3) {
        Modifier modifier1;
        Shape shape0;
        Function3 function31;
        long v6;
        long v5;
        int v4;
        Composer composer1 = composer0.startRestartGroup(0x4D601B49);
        if((v3 & 1) == 0) {
            v4 = (v2 & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v2 : v2;
        }
        else {
            v4 = v2 | 6;
        }
        if((v2 & 0x30) == 0) {
            v5 = v;
            v4 |= ((v3 & 2) != 0 || !composer1.changed(v5) ? 16 : 0x20);
        }
        else {
            v5 = v;
        }
        if((v2 & 0x180) == 0) {
            v6 = v1;
            v4 |= ((v3 & 4) != 0 || !composer1.changed(v6) ? 0x80 : 0x100);
        }
        else {
            v6 = v1;
        }
        if((v3 & 8) != 0) {
            v4 |= 0xC00;
            function31 = function30;
        }
        else if((v2 & 0xC00) == 0) {
            function31 = function30;
            v4 |= (composer1.changedInstance(function31) ? 0x800 : 0x400);
        }
        else {
            function31 = function30;
        }
        if((v4 & 0x493) != 1170 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v2 & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v3 & 1) == 0 ? modifier0 : Modifier.Companion;
                if((v3 & 2) != 0) {
                    v5 = BadgeDefaults.INSTANCE.getContainerColor(composer1, 6);
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v6 = ColorSchemeKt.contentColorFor-ek8zF_U(v5, composer1, v4 >> 3 & 14);
                    v4 &= -897;
                }
                if((v3 & 8) != 0) {
                    function31 = null;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v3 & 2) != 0) {
                    v4 &= 0xFFFFFF8F;
                }
                if((v3 & 4) != 0) {
                    v4 &= -897;
                }
                modifier1 = modifier0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x4D601B49, v4, -1, "androidx.compose.material3.Badge (Badge.kt:183)");
            }
            if(function31 == null) {
                composer1.startReplaceGroup(0xB432BAD3);
                shape0 = ShapesKt.getValue(BadgeTokens.INSTANCE.getShape(), composer1, 6);
            }
            else {
                composer1.startReplaceGroup(-1271801170);
                shape0 = ShapesKt.getValue(BadgeTokens.INSTANCE.getLargeShape(), composer1, 6);
            }
            composer1.endReplaceGroup();
            Modifier modifier2 = BackgroundKt.background-bw27NRU(SizeKt.defaultMinSize-VpY3zN4(modifier1, 0.0f, 0.0f), v5, shape0);
            Modifier modifier3 = function31 == null ? Modifier.Companion : PaddingKt.padding-VpY3zN4$default(Modifier.Companion, BadgeKt.a, 0.0f, 2, null);
            Modifier modifier4 = modifier2.then(modifier3);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.Companion.getCenterVertically(), composer1, 54);
            int v7 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v7)) {
                a.t(v7, composer1, v7, function20);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            RowScopeInstance rowScopeInstance0 = RowScopeInstance.INSTANCE;
            composer1.startReplaceGroup(0x9A5B4407);
            if(function31 != null) {
                ProvideContentColorTextStyleKt.ProvideContentColorTextStyle-3J-VO9M(v6, TypographyKt.getValue(BadgeTokens.INSTANCE.getLargeLabelTextFont(), composer1, 6), ComposableLambdaKt.rememberComposableLambda(0x2ADE5802, true, new e1(function31, rowScopeInstance0, 0), composer1, 54), composer1, v4 >> 6 & 14 | 0x180);
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f1(modifier1, v5, v6, function31, v2, v3, 0));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BadgedBox(@NotNull Function3 function30, @Nullable Modifier modifier0, @NotNull Function3 function31, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        MutableFloatState mutableFloatState4;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x53AFAF07);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changedInstance(function30) ? 4 : 2) | v : v;
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
            v2 |= (composer1.changedInstance(function31) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v1 & 2) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x53AFAF07, v2, -1, "androidx.compose.material3.BadgedBox (Badge.kt:72)");
            }
            MutableFloatState mutableFloatState0 = composer1.rememberedValue();
            androidx.compose.runtime.Composer.Companion composer$Companion0 = Composer.Companion;
            if(mutableFloatState0 == composer$Companion0.getEmpty()) {
                mutableFloatState0 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer1.updateRememberedValue(mutableFloatState0);
            }
            MutableFloatState mutableFloatState1 = composer1.rememberedValue();
            if(mutableFloatState1 == composer$Companion0.getEmpty()) {
                mutableFloatState1 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer1.updateRememberedValue(mutableFloatState1);
            }
            MutableFloatState mutableFloatState2 = composer1.rememberedValue();
            if(mutableFloatState2 == composer$Companion0.getEmpty()) {
                mutableFloatState2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(Infinityf);
                composer1.updateRememberedValue(mutableFloatState2);
            }
            MutableFloatState mutableFloatState3 = composer1.rememberedValue();
            if(mutableFloatState3 == composer$Companion0.getEmpty()) {
                mutableFloatState3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(-Infinityf);
                composer1.updateRememberedValue(mutableFloatState3);
            }
            g1 g10 = composer1.rememberedValue();
            if(g10 == composer$Companion0.getEmpty()) {
                mutableFloatState4 = mutableFloatState3;
                g10 = new g1(0, mutableFloatState0, mutableFloatState1, mutableFloatState2, mutableFloatState3);
                composer1.updateRememberedValue(g10);
            }
            else {
                mutableFloatState4 = mutableFloatState3;
            }
            Modifier modifier2 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier1, g10);
            i1 i10 = composer1.rememberedValue();
            if(i10 == composer$Companion0.getEmpty()) {
                i10 = new i1(mutableFloatState1, mutableFloatState0, mutableFloatState2, mutableFloatState4);
                composer1.updateRememberedValue(i10);
            }
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, i10, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                a.t(v3, composer1, v3, function20);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier4 = LayoutIdKt.layoutId(modifier$Companion0, "anchor");
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                a.t(v4, composer1, v4, function21);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            BoxScopeInstance boxScopeInstance0 = BoxScopeInstance.INSTANCE;
            function31.invoke(boxScopeInstance0, composer1, ((int)((v2 << 3 & 0x1C00 | 54) >> 6 & 0x70 | 6)));
            composer1.endNode();
            Modifier modifier6 = LayoutIdKt.layoutId(modifier$Companion0, "badge");
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
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
            Function2 function22 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                a.t(v5, composer1, v5, function22);
            }
            Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
            function30.invoke(boxScopeInstance0, composer1, ((int)((v2 << 9 & 0x1C00 | 6) >> 6 & 0x70 | 6)));
            composer1.endNode();
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
            scopeUpdateScope0.updateScope(new j1(function30, modifier1, function31, v, v1, 0));
        }
    }

    public static final float access$BadgedBox$lambda$1(MutableFloatState mutableFloatState0) {
        return mutableFloatState0.getFloatValue();
    }

    public static final float access$BadgedBox$lambda$10(MutableFloatState mutableFloatState0) {
        return mutableFloatState0.getFloatValue();
    }

    public static final void access$BadgedBox$lambda$11(MutableFloatState mutableFloatState0, float f) {
        mutableFloatState0.setFloatValue(f);
    }

    public static final void access$BadgedBox$lambda$2(MutableFloatState mutableFloatState0, float f) {
        mutableFloatState0.setFloatValue(f);
    }

    public static final float access$BadgedBox$lambda$4(MutableFloatState mutableFloatState0) {
        return mutableFloatState0.getFloatValue();
    }

    public static final void access$BadgedBox$lambda$5(MutableFloatState mutableFloatState0, float f) {
        mutableFloatState0.setFloatValue(f);
    }

    public static final float access$BadgedBox$lambda$7(MutableFloatState mutableFloatState0) {
        return mutableFloatState0.getFloatValue();
    }

    public static final void access$BadgedBox$lambda$8(MutableFloatState mutableFloatState0, float f) {
        mutableFloatState0.setFloatValue(f);
    }

    public static final float getBadgeOffset() [...] // 潜在的解密器

    public static final float getBadgeWithContentHorizontalOffset() [...] // 潜在的解密器

    public static final float getBadgeWithContentHorizontalPadding() {
        return BadgeKt.a;
    }

    public static final float getBadgeWithContentVerticalOffset() [...] // 潜在的解密器
}

