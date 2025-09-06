package com.kakao.kandinsky.decoration;

import aa.a;
import aa.b;
import aa.c;
import aa.d;
import aa.f;
import aa.g;
import aa.i;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.v;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.kakao.kandinsky.designsystem.common.KDButtonKt;
import com.kakao.kandinsky.designsystem.common.ModifierKt;
import com.kakao.kandinsky.designsystem.theme.ColorKt;
import com.kakao.kandinsky.designsystem.util.DpExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001AM\u0010\b\u001A\u00020\u00032\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00030\u00002\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0006H\u0001¢\u0006\u0004\b\b\u0010\t\u001A+\u0010\u000B\u001A\u00020\u00032\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\u0000H\u0001¢\u0006\u0004\b\u000B\u0010\f\u001Ao\u0010\u001A\u001A\u00020\u00032\b\b\u0002\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u00112\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00130\u00002\f\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u00002\u0017\u0010\u0017\u001A\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001AL\u0010%\u001A\u00020\r*\u00020\r2\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u001F\u001A\u00020\u001E2\b\b\u0002\u0010!\u001A\u00020 2\u0006\u0010\"\u001A\u00020\u001Eø\u0001\u0000¢\u0006\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006&"}, d2 = {"Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "offsetProvider", "", "onDragStart", "onDragEnd", "Lkotlin/Function1;", "onDrag", "RotateScaleControl", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "onClickDelete", "DeleteControl", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/ui/geometry/Size;", "size", "", "rotateProvider", "scaleProvider", "Landroidx/compose/runtime/Composable;", "content", "ContentMoveControl-dBrA5TM", "(Landroidx/compose/ui/Modifier;ZJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ContentMoveControl", "sizeProvider", "", "radiusPercent", "Landroidx/compose/ui/graphics/Color;", "shadowColor", "Landroidx/compose/ui/unit/Dp;", "borderWidth", "borderColor", "drawControlBound-qFH2uYw", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IJFJ)Landroidx/compose/ui/Modifier;", "drawControlBound", "decoration_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Control.kt\ncom/kakao/kandinsky/decoration/ControlKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,162:1\n1223#2,6:163\n1223#2,6:208\n1223#2,6:214\n1223#2,6:255\n71#3:169\n69#3,5:170\n74#3:203\n78#3:207\n71#3:220\n69#3,5:221\n74#3:254\n71#3:261\n68#3,6:262\n74#3:296\n78#3:300\n78#3:304\n78#4,6:175\n85#4,4:190\n89#4,2:200\n93#4:206\n78#4,6:226\n85#4,4:241\n89#4,2:251\n78#4,6:268\n85#4,4:283\n89#4,2:293\n93#4:299\n93#4:303\n368#5,9:181\n377#5:202\n378#5,2:204\n368#5,9:232\n377#5:253\n368#5,9:274\n377#5:295\n378#5,2:297\n378#5,2:301\n4032#6,6:194\n4032#6,6:245\n4032#6,6:287\n148#7:305\n148#7:306\n*S KotlinDebug\n*F\n+ 1 Control.kt\ncom/kakao/kandinsky/decoration/ControlKt\n*L\n45#1:163,6\n86#1:208,6\n90#1:214,6\n111#1:255,6\n41#1:169\n41#1:170,5\n41#1:203\n41#1:207\n82#1:220\n82#1:221,5\n82#1:254\n108#1:261\n108#1:262,6\n108#1:296\n108#1:300\n82#1:304\n41#1:175,6\n41#1:190,4\n41#1:200,2\n41#1:206\n82#1:226,6\n82#1:241,4\n82#1:251,2\n108#1:268,6\n108#1:283,4\n108#1:293,2\n108#1:299\n82#1:303\n41#1:181,9\n41#1:202\n41#1:204,2\n82#1:232,9\n82#1:253\n108#1:274,9\n108#1:295\n108#1:297,2\n82#1:301,2\n41#1:194,6\n82#1:245,6\n108#1:287,6\n127#1:305\n32#1:306\n*E\n"})
public final class ControlKt {
    public static final float a;

    static {
        ControlKt.a = 40.0f;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ContentMoveControl-dBrA5TM(@Nullable Modifier modifier0, boolean z, long v, @NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function3 function30, @Nullable Composer composer0, int v1, int v2) {
        Modifier modifier1;
        Modifier modifier4;
        int v3;
        Intrinsics.checkNotNullParameter(function00, "rotateProvider");
        Intrinsics.checkNotNullParameter(function01, "scaleProvider");
        Intrinsics.checkNotNullParameter(function02, "offsetProvider");
        Intrinsics.checkNotNullParameter(function30, "content");
        Composer composer1 = composer0.startRestartGroup(1841400201);
        if((v2 & 1) == 0) {
            v3 = (v1 & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v1 : v1;
        }
        else {
            v3 = v1 | 6;
        }
        if((v2 & 2) != 0) {
            v3 |= 0x30;
        }
        else if((v1 & 0x70) == 0) {
            v3 |= (composer1.changed(z) ? 0x20 : 16);
        }
        if((v2 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v1 & 0x380) == 0) {
            v3 |= (composer1.changed(v) ? 0x100 : 0x80);
        }
        if((v2 & 8) != 0) {
            v3 |= 0xC00;
        }
        else if((v1 & 0x1C00) == 0) {
            v3 |= (composer1.changedInstance(function00) ? 0x800 : 0x400);
        }
        if((v2 & 16) != 0) {
            v3 |= 0x6000;
        }
        else if((v1 & 0xE000) == 0) {
            v3 |= (composer1.changedInstance(function01) ? 0x4000 : 0x2000);
        }
        if((v2 & 0x20) != 0) {
            v3 |= 0x30000;
        }
        else if((0x70000 & v1) == 0) {
            v3 |= (composer1.changedInstance(function02) ? 0x20000 : 0x10000);
        }
        if((v2 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((0x380000 & v1) == 0) {
            v3 |= (composer1.changedInstance(function30) ? 0x100000 : 0x80000);
        }
        if((0x2DB6DB & v3) != 0x92492 || !composer1.getSkipping()) {
            modifier1 = (v2 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1841400201, v3, -1, "com.kakao.kandinsky.decoration.ContentMoveControl (Control.kt:79)");
            }
            Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            Modifier modifier2 = ModifierKt.centerOffset(SizeKt.wrapContentSize(modifier$Companion0, alignment$Companion0.getTopStart(), true), function02);
            composer1.startReplaceGroup(-784066450);
            a a0 = composer1.rememberedValue();
            if((v3 & 0x1C00) == 0x800 || a0 == Composer.Companion.getEmpty()) {
                a0 = new a(function00, 0);
                composer1.updateRememberedValue(a0);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = GraphicsLayerModifierKt.graphicsLayer(modifier2, a0);
            composer1.startReplaceGroup(-784066382);
            if(z) {
                long v4 = MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getOnBackground-0d7_KjU();
                long v5 = ColorKt.getShadow(MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable));
                composer1.startReplaceGroup(-784066281);
                b b0 = composer1.rememberedValue();
                if((((v3 & 0xE000) == 0x4000 ? 1 : 0) | ((v3 & 0x380) == 0x100 ? 1 : 0)) != 0 || b0 == Composer.Companion.getEmpty()) {
                    b0 = new b(v, function01);
                    composer1.updateRememberedValue(b0);
                }
                composer1.endReplaceGroup();
                modifier4 = ControlKt.drawControlBound-qFH2uYw$default(modifier$Companion0, b0, 8, v5, 0.0f, v4, 8, null);
            }
            else {
                modifier4 = modifier$Companion0;
            }
            composer1.endReplaceGroup();
            Modifier modifier5 = modifier3.then(modifier4);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getCenter(), false);
            int v6 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier6 = ComposedModifierKt.materializeModifier(composer1, modifier5);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v6)) {
                androidx.room.a.t(v6, composer1, v6, function20);
            }
            Updater.set-impl(composer1, modifier6, composeUiNode$Companion0.getSetModifier());
            long v7 = ((Offset)function01.invoke()).unbox-impl();
            RoundedCornerShape roundedCornerShape0 = z ? RoundedCornerShapeKt.RoundedCornerShape$default(0, 8, 0, 8, 5, null) : RoundedCornerShapeKt.RoundedCornerShape(8);
            int v8 = v3 >> 6 & 14;
            Modifier modifier7 = SizeKt.size-6HolHcs(modifier$Companion0, DpExtensionKt.toDpSize-Pq9zytI(v, composer1, v8));
            composer1.startReplaceGroup(0xA2FC4EF7);
            boolean z1 = composer1.changed(v7);
            c c0 = composer1.rememberedValue();
            if(z1 || c0 == Composer.Companion.getEmpty()) {
                c0 = new c(v7, 0);
                composer1.updateRememberedValue(c0);
            }
            composer1.endReplaceGroup();
            Modifier modifier8 = ClipKt.clip(GraphicsLayerModifierKt.graphicsLayer(modifier7, c0), roundedCornerShape0).then(modifier1);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v9 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier9 = ComposedModifierKt.materializeModifier(composer1, modifier8);
            Function0 function04 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function04);
            }
            else {
                composer1.useNode();
            }
            Function2 function21 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v9)) {
                androidx.room.a.t(v9, composer1, v9, function21);
            }
            Updater.set-impl(composer1, modifier9, composeUiNode$Companion0.getSetModifier());
            function30.invoke(Size.box-impl(v), composer1, ((int)(v3 >> 15 & 0x70 | v8)));
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
            scopeUpdateScope0.updateScope(new v(modifier1, z, v, function00, function01, function02, function30, v1, v2));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void DeleteControl(@NotNull Function0 function00, @NotNull Function0 function01, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "offsetProvider");
        Intrinsics.checkNotNullParameter(function01, "onClickDelete");
        Composer composer1 = composer0.startRestartGroup(0x76A90505);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x76A90505, v1, -1, "com.kakao.kandinsky.decoration.DeleteControl (Control.kt:59)");
            }
            KDButtonKt.KDIconButton(function01, ModifierKt.centerOffset(SizeKt.size-3ABfNKs(Modifier.Companion, ControlKt.a), function00), false, null, null, ComposableSingletons.ControlKt.INSTANCE.getLambda-1$decoration_release(), composer1, v1 >> 3 & 14 | 0x30000, 28);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(function00, function01, v, 0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void RotateScaleControl(@NotNull Function0 function00, @NotNull Function0 function01, @NotNull Function0 function02, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(function00, "offsetProvider");
        Intrinsics.checkNotNullParameter(function01, "onDragStart");
        Intrinsics.checkNotNullParameter(function02, "onDragEnd");
        Intrinsics.checkNotNullParameter(function10, "onDrag");
        Composer composer1 = composer0.startRestartGroup(0x712F77B6);
        int v1 = (v & 14) == 0 ? (composer1.changedInstance(function00) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function01) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changedInstance(function02) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x712F77B6, v1, -1, "com.kakao.kandinsky.decoration.RotateScaleControl (Control.kt:39)");
            }
            Modifier modifier0 = ModifierKt.centerOffset(SizeKt.size-3ABfNKs(Modifier.Companion, ControlKt.a), function00);
            composer1.startReplaceGroup(-1837704411);
            f f0 = composer1.rememberedValue();
            if((((v1 & 0x70) == 0x20 ? 1 : 0) | ((v1 & 0x380) == 0x100 ? 1 : 0) | ((v1 & 0x1C00) == 0x800 ? 1 : 0)) != 0 || f0 == Composer.Companion.getEmpty()) {
                f0 = new f(function02, function01, function10, null);
                composer1.updateRememberedValue(f0);
            }
            composer1.endReplaceGroup();
            Modifier modifier1 = SuspendingPointerInputFilterKt.pointerInput(modifier0, null, f0);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier2 = ComposedModifierKt.materializeModifier(composer1, modifier1);
            androidx.compose.ui.node.ComposeUiNode.Companion composeUiNode$Companion0 = ComposeUiNode.Companion;
            Function0 function03 = composeUiNode$Companion0.getConstructor();
            if(composer1.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer1.startReusableNode();
            if(composer1.getInserting()) {
                composer1.createNode(function03);
            }
            else {
                composer1.useNode();
            }
            Function2 function20 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                androidx.room.a.t(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier2, composeUiNode$Companion0.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(drawable.toolbox_handle, composer1, 0), null, null, null, null, 0.0f, null, composer1, 56, 0x7C);
            composer1.endNode();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(v, 0, function00, function01, function02, function10));
        }
    }

    @NotNull
    public static final Modifier drawControlBound-qFH2uYw(@NotNull Modifier modifier0, @NotNull Function1 function10, int v, long v1, float f, long v2) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$drawControlBound");
        Intrinsics.checkNotNullParameter(function10, "sizeProvider");
        return DrawModifierKt.drawWithCache(modifier0, new i(f, v1, function10, v, v2));
    }

    public static Modifier drawControlBound-qFH2uYw$default(Modifier modifier0, Function1 function10, int v, long v1, float f, long v2, int v3, Object object0) {
        int v4 = (v3 & 2) == 0 ? v : 5;
        return (v3 & 8) == 0 ? ControlKt.drawControlBound-qFH2uYw(modifier0, function10, v4, v1, f, v2) : ControlKt.drawControlBound-qFH2uYw(modifier0, function10, v4, v1, 1.0f, v2);
    }
}

