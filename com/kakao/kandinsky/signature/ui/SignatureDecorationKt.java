package com.kakao.kandinsky.signature.ui;

import aa.d;
import aa.g;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.e0;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import com.kakao.kandinsky.base.ui.KDAsyncImageKt;
import com.kakao.kandinsky.core.kdphoto.Signature.Image;
import com.kakao.kandinsky.core.kdphoto.Signature.Text.Companion.WatermarkDrawData;
import com.kakao.kandinsky.core.kdphoto.Signature.Text;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.core.kdphoto.SignatureMetaData;
import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.decoration.TextKt;
import com.kakao.kandinsky.designsystem.util.DpExtensionKt;
import com.kakao.kandinsky.signature.MetaDataConverter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import va.q;
import va.r;
import va.s;
import va.t;
import va.u;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A5\u0010\t\u001A\u00020\b2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001A)\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0005\u001A\u00020\r2\u0006\u0010\u0003\u001A\u00020\u0002H\u0001¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/kandinsky/decoration/DecorationStatus;", "status", "Landroidx/compose/ui/geometry/Rect;", "displayRect", "Lcom/kakao/kandinsky/core/kdphoto/Signature;", "signature", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "decorationController", "", "SignatureDecoration", "(Lcom/kakao/kandinsky/decoration/DecorationStatus;Landroidx/compose/ui/geometry/Rect;Lcom/kakao/kandinsky/core/kdphoto/Signature;Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;", "WatermarkSignatureContent", "(Landroidx/compose/ui/Modifier;Lcom/kakao/kandinsky/core/kdphoto/Signature$Text;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/runtime/Composer;II)V", "signature_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSignatureDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureDecoration.kt\ncom/kakao/kandinsky/signature/ui/SignatureDecorationKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,129:1\n71#2:130\n68#2,6:131\n74#2:165\n78#2:169\n71#2:170\n68#2,6:171\n74#2:205\n78#2:209\n71#2:210\n68#2,6:211\n74#2:245\n78#2:249\n78#3,6:137\n85#3,4:152\n89#3,2:162\n93#3:168\n78#3,6:177\n85#3,4:192\n89#3,2:202\n93#3:208\n78#3,6:217\n85#3,4:232\n89#3,2:242\n93#3:248\n368#4,9:143\n377#4:164\n378#4,2:166\n368#4,9:183\n377#4:204\n378#4,2:206\n368#4,9:223\n377#4:244\n378#4,2:246\n4032#5,6:156\n4032#5,6:196\n4032#5,6:236\n*S KotlinDebug\n*F\n+ 1 SignatureDecoration.kt\ncom/kakao/kandinsky/signature/ui/SignatureDecorationKt\n*L\n69#1:130\n69#1:131,6\n69#1:165\n69#1:169\n89#1:170\n89#1:171,6\n89#1:205\n89#1:209\n103#1:210\n103#1:211,6\n103#1:245\n103#1:249\n69#1:137,6\n69#1:152,4\n69#1:162,2\n69#1:168\n89#1:177,6\n89#1:192,4\n89#1:202,2\n89#1:208\n103#1:217,6\n103#1:232,4\n103#1:242,2\n103#1:248\n69#1:143,9\n69#1:164\n69#1:166,2\n89#1:183,9\n89#1:204\n89#1:206,2\n103#1:223,9\n103#1:244\n103#1:246,2\n69#1:156,6\n89#1:196,6\n103#1:236,6\n*E\n"})
public final class SignatureDecorationKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void SignatureDecoration(@NotNull DecorationStatus decorationStatus0, @NotNull Rect rect0, @NotNull Signature signature0, @NotNull DecorationControllerInterface decorationControllerInterface0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(decorationStatus0, "status");
        Intrinsics.checkNotNullParameter(rect0, "displayRect");
        Intrinsics.checkNotNullParameter(signature0, "signature");
        Intrinsics.checkNotNullParameter(decorationControllerInterface0, "decorationController");
        Composer composer1 = composer0.startRestartGroup(0x6576FCC1);
        int v1 = (v & 14) == 0 ? (composer1.changed(decorationStatus0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(rect0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(signature0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(decorationControllerInterface0) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x6576FCC1, v1, -1, "com.kakao.kandinsky.signature.ui.SignatureDecoration (SignatureDecoration.kt:28)");
            }
            if(!(signature0 instanceof Text) || !((Text)signature0).getWatermark()) {
                composer1.startReplaceGroup(0x3FEDB0ED);
                float f = Size.getWidth-impl(rect0.getSize-NH-jbRc());
                SignatureMetaData signatureMetaData0 = signature0.getMetaData();
                long v2 = MetaDataConverter.INSTANCE.createSize-xjbvk4A(f, signatureMetaData0);
                SignatureMetaData signatureMetaData1 = signature0.getMetaData();
                DecorationBoxKt.DecorationBox-vzil-yM(decorationStatus0, signature0, v2, rect0, null, MetaDataConverter.INSTANCE.createMatrixForPhoto(rect0, signatureMetaData1), decorationControllerInterface0, ComposableLambdaKt.rememberComposableLambda(0x6DEA5AF, true, new e0(signature0, 14), composer1, 54), composer1, v1 & 14 | 0xC40000 | v1 >> 3 & 0x70 | v1 << 6 & 0x1C00 | v1 << 9 & 0x380000, 16);
            }
            else {
                composer1.startReplaceGroup(0x3FEDAFB9);
                SignatureDecorationKt.c(rect0, ComposableLambdaKt.rememberComposableLambda(105104830, true, new r(decorationStatus0, signature0, rect0), composer1, 54), composer1, v1 >> 3 & 14 | 0x30);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new g(v, 12, decorationStatus0, rect0, signature0, decorationControllerInterface0));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void WatermarkSignatureContent(@Nullable Modifier modifier0, @NotNull Text signature$Text0, @NotNull Rect rect0, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(signature$Text0, "signature");
        Intrinsics.checkNotNullParameter(rect0, "displayRect");
        Composer composer1 = composer0.startRestartGroup(-649940461);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(signature$Text0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(rect0) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649940461, v2, -1, "com.kakao.kandinsky.signature.ui.WatermarkSignatureContent (SignatureDecoration.kt:98)");
            }
            TextData textData0 = signature$Text0.getTextData();
            WatermarkDrawData signature$Text$Companion$WatermarkDrawData0 = signature$Text0.getWatermarkDrawData-uvyYCjk(rect0.getSize-NH-jbRc());
            Modifier modifier2 = GraphicsLayerModifierKt.graphicsLayer(SizeKt.size-6HolHcs(SizeKt.wrapContentSize(modifier1, Alignment.Companion.getTopStart(), true), DpExtensionKt.toDpSize-Pq9zytI(signature$Text$Companion$WatermarkDrawData0.getBoundsSize-NH-jbRc(), composer1, 0)), new t(signature$Text$Companion$WatermarkDrawData0, rect0));
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
            r0.a.z(composeUiNode$Companion0, composer1, modifier3, composer1, 0x3235D984);
            for(float f = 0.0f; f < Size.getWidth-impl(signature$Text$Companion$WatermarkDrawData0.getBoundsSize-NH-jbRc()); f += signature$Text$Companion$WatermarkDrawData0.getPadding() + Size.getWidth-impl(signature$Text$Companion$WatermarkDrawData0.getSignSize-NH-jbRc())) {
                composer1.startReplaceGroup(1257002608);
                for(float f1 = 0.0f; f1 < Size.getHeight-impl(signature$Text$Companion$WatermarkDrawData0.getBoundsSize-NH-jbRc()); f1 = signature$Text$Companion$WatermarkDrawData0.getPadding() + Size.getHeight-impl(signature$Text$Companion$WatermarkDrawData0.getSignSize-NH-jbRc()) + f1) {
                    float f2 = DpExtensionKt.toDp(f, composer1, 0);
                    float f3 = DpExtensionKt.toDp(f1, composer1, 0);
                    TextKt.Text(textData0, signature$Text$Companion$WatermarkDrawData0.getSignScale(), OffsetKt.offset-VpY3zN4(Modifier.Companion, f2, f3), composer1, 0, 0);
                }
                composer1.endReplaceGroup();
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
            scopeUpdateScope0.updateScope(new u(modifier1, signature$Text0, rect0, v, v1));
        }
    }

    public static final void a(Image signature$Image0, long v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x341F4C60);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(signature$Image0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x341F4C60, v2, -1, "com.kakao.kandinsky.signature.ui.ImageSignatureContent (SignatureDecoration.kt:67)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = AlphaKt.alpha(modifier$Companion0, signature$Image0.getAlpha() / 100.0f);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            KDAsyncImageKt.AsyncImage(signature$Image0.getUri(), false, null, SizeKt.size-6HolHcs(modifier$Companion0, DpExtensionKt.toDpSize-Pq9zytI(v, composer1, v2 >> 3 & 14)), null, null, composer1, 0x1B0, 0x30);
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
            scopeUpdateScope0.updateScope(new q(signature$Image0, v, v1));
        }
    }

    public static final void access$SignatureContent-x_KDEd0(Signature signature0, long v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(1603957090);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(signature0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1603957090, v2, -1, "com.kakao.kandinsky.signature.ui.SignatureContent (SignatureDecoration.kt:58)");
            }
            if(signature0 instanceof Image) {
                composer1.startReplaceGroup(0x6C36E117);
                SignatureDecorationKt.a(((Image)signature0), v, composer1, v2 & 0x70);
            }
            else if(signature0 instanceof Text) {
                composer1.startReplaceGroup(0x6C36E16E);
                SignatureDecorationKt.b(((Text)signature0), v, composer1, v2 & 0x70);
            }
            else {
                composer1.startReplaceGroup(1815536044);
            }
            composer1.endReplaceGroup();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new bb.a(v, v1, 1, signature0));
        }
    }

    public static final void access$WatermarkContainer(Rect rect0, Function3 function30, Composer composer0, int v) {
        SignatureDecorationKt.c(rect0, function30, composer0, v);
    }

    public static final void b(Text signature$Text0, long v, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(1575179208);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(signature$Text0) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(v) ? 0x20 : 16);
        }
        if((v2 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1575179208, v2, -1, "com.kakao.kandinsky.signature.ui.TextSignatureContent (SignatureDecoration.kt:79)");
            }
            TextData textData0 = signature$Text0.getTextData();
            TextKt.Text(textData0, Size.getWidth-impl(v) / Size.getWidth-impl(textData0.getBoundsSize-NH-jbRc()), null, composer1, 0, 4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new s(signature$Text0, v, v1));
        }
    }

    public static final void c(Rect rect0, Function3 function30, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xB0B28E62);
        int v1 = (v & 14) == 0 ? (composer1.changed(rect0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB0B28E62, v1, -1, "com.kakao.kandinsky.signature.ui.WatermarkContainer (SignatureDecoration.kt:87)");
            }
            float f = DpExtensionKt.toDp(rect0.getLeft(), composer1, 0);
            float f1 = DpExtensionKt.toDp(rect0.getTop(), composer1, 0);
            Modifier modifier0 = ClipKt.clipToBounds(SizeKt.size-6HolHcs(OffsetKt.offset-VpY3zN4(Modifier.Companion, f, f1), DpExtensionKt.toDpSize-Pq9zytI(rect0.getSize-NH-jbRc(), composer1, 0)));
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            function30.invoke(BoxScopeInstance.INSTANCE, composer1, ((int)((v1 << 6 & 0x1C00) >> 6 & 0x70 | 6)));
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
            scopeUpdateScope0.updateScope(new d(rect0, function30, v, 24));
        }
    }
}

