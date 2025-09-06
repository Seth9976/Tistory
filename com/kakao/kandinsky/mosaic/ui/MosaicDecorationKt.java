package com.kakao.kandinsky.mosaic.ui;

import android.graphics.Matrix;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.selection.z;
import androidx.compose.material3.y3;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier.Companion;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.core.kdphoto.Mosaic.Type;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.decoration.DecorationControllerInterface;
import com.kakao.kandinsky.decoration.DecorationRect;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import com.kakao.kandinsky.utils.MatrixExtensionKt;
import com.kakao.kandinsky.utils.MatrixValues;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import m0.b0;
import ma.a;
import ma.c;
import ma.d;
import ma.e;
import ma.f;
import ma.g;
import ma.h;
import ma.i;
import ma.j;
import ma.k;
import ma.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AH\u0010\u0010\u001A\u00020\r2\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000E\u0010\u000F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0013²\u0006\f\u0010\u0012\u001A\u00020\u00118\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/kandinsky/decoration/DecorationStatus;", "status", "Lcom/kakao/kandinsky/utils/MatrixValues;", "displayMatrixValues", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;", "decoration", "Landroidx/compose/ui/geometry/Rect;", "displayRect", "Lcom/kakao/kandinsky/mosaic/MosaicAndBlurBitmapLoader;", "textureLoader", "Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "decorationController", "", "MosaicDecoration-w1lL6yk", "(Lcom/kakao/kandinsky/decoration/DecorationStatus;Lkotlinx/collections/immutable/ImmutableList;Lcom/kakao/kandinsky/core/kdphoto/Decoration$Absolute;Landroidx/compose/ui/geometry/Rect;Lcom/kakao/kandinsky/mosaic/MosaicAndBlurBitmapLoader;Lcom/kakao/kandinsky/decoration/DecorationControllerInterface;Landroidx/compose/runtime/Composer;I)V", "MosaicDecoration", "Landroidx/compose/ui/graphics/Path;", "path", "mosaic_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMosaicDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MosaicDecoration.kt\ncom/kakao/kandinsky/mosaic/ui/MosaicDecorationKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,253:1\n1223#2,3:254\n1226#2,3:262\n1223#2,6:301\n1223#2,6:347\n1223#2,6:397\n38#3,5:257\n71#4:265\n68#4,6:266\n74#4:300\n71#4:307\n68#4,6:308\n74#4:342\n78#4:346\n71#4:353\n68#4,6:354\n74#4:388\n78#4:392\n78#4:396\n78#5,6:272\n85#5,4:287\n89#5,2:297\n78#5,6:314\n85#5,4:329\n89#5,2:339\n93#5:345\n78#5,6:360\n85#5,4:375\n89#5,2:385\n93#5:391\n93#5:395\n368#6,9:278\n377#6:299\n368#6,9:320\n377#6:341\n378#6,2:343\n368#6,9:366\n377#6:387\n378#6,2:389\n378#6,2:393\n4032#7,6:291\n4032#7,6:333\n4032#7,6:379\n81#8:403\n*S KotlinDebug\n*F\n+ 1 MosaicDecoration.kt\ncom/kakao/kandinsky/mosaic/ui/MosaicDecorationKt\n*L\n179#1:254,3\n179#1:262,3\n203#1:301,6\n212#1:347,6\n235#1:397,6\n190#1:257,5\n202#1:265\n202#1:266,6\n202#1:300\n203#1:307\n203#1:308,6\n203#1:342\n203#1:346\n212#1:353\n212#1:354,6\n212#1:388\n212#1:392\n202#1:396\n202#1:272,6\n202#1:287,4\n202#1:297,2\n203#1:314,6\n203#1:329,4\n203#1:339,2\n203#1:345\n212#1:360,6\n212#1:375,4\n212#1:385,2\n212#1:391\n202#1:395\n202#1:278,9\n202#1:299\n203#1:320,9\n203#1:341\n203#1:343,2\n212#1:366,9\n212#1:387\n212#1:389,2\n202#1:393,2\n202#1:291,6\n203#1:333,6\n212#1:379,6\n179#1:403\n*E\n"})
public final class MosaicDecorationKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;
        public static final int[] $EnumSwitchMapping$2;

        static {
            int[] arr_v = new int[Type.values().length];
            try {
                arr_v[Type.Circle.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Type.Rectangle.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[com.kakao.kandinsky.core.kdphoto.Blur.Type.values().length];
            try {
                arr_v1[com.kakao.kandinsky.core.kdphoto.Blur.Type.Circle.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v1[com.kakao.kandinsky.core.kdphoto.Blur.Type.Rectangle.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
            int[] arr_v2 = new int[a.values().length];
            try {
                arr_v2[0] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v2[1] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$2 = arr_v2;
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void MosaicDecoration-w1lL6yk(@NotNull DecorationStatus decorationStatus0, @NotNull ImmutableList immutableList0, @NotNull Absolute decoration$Absolute0, @NotNull Rect rect0, @NotNull MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, @NotNull DecorationControllerInterface decorationControllerInterface0, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(decorationStatus0, "status");
        Intrinsics.checkNotNullParameter(immutableList0, "displayMatrixValues");
        Intrinsics.checkNotNullParameter(decoration$Absolute0, "decoration");
        Intrinsics.checkNotNullParameter(rect0, "displayRect");
        Intrinsics.checkNotNullParameter(mosaicAndBlurBitmapLoader0, "textureLoader");
        Intrinsics.checkNotNullParameter(decorationControllerInterface0, "decorationController");
        Composer composer1 = composer0.startRestartGroup(0xB4E01EC1);
        int v1 = (v & 14) == 0 ? (composer1.changed(decorationStatus0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(immutableList0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(decoration$Absolute0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changed(rect0) ? 0x800 : 0x400);
        }
        if((0xE000 & v) == 0) {
            v1 |= (composer1.changed(mosaicAndBlurBitmapLoader0) ? 0x4000 : 0x2000);
        }
        if((0x70000 & v) == 0) {
            v1 |= (composer1.changed(decorationControllerInterface0) ? 0x20000 : 0x10000);
        }
        if((0x5B6DB & v1) != 74898 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xB4E01EC1, v1, -1, "com.kakao.kandinsky.mosaic.ui.MosaicDecoration (MosaicDecoration.kt:34)");
            }
            Matrix matrix0 = MatrixValues.toMatrix-impl(immutableList0);
            DecorationBoxKt.BasicDecorationBox-vzil-yM(decorationStatus0, decoration$Absolute0, decoration$Absolute0.getSize-NH-jbRc(), rect0, MatrixExtensionKt.invert(matrix0), MatrixExtensionKt.buildMatrix(decoration$Absolute0.getMatrix(), new j(matrix0)), decorationControllerInterface0, ComposableLambdaKt.rememberComposableLambda(0xC84AB4EA, true, new k(decorationStatus0, decoration$Absolute0, mosaicAndBlurBitmapLoader0, rect0, matrix0), composer1, 54), composer1, 0xC48000 | v1 & 14 | v1 >> 3 & 0x70 | v1 & 0x1C00 | 0x380000 & v1 << 3, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l(decorationStatus0, immutableList0, decoration$Absolute0, rect0, mosaicAndBlurBitmapLoader0, decorationControllerInterface0, v));
        }
    }

    public static final void a(long v, a a0, DecorationRect decorationRect0, Function2 function20, Function2 function21, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(1033291236);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changed(a0) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changed(decorationRect0) ? 0x100 : 0x80);
        }
        if((v1 & 0x1C00) == 0) {
            v2 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((0xE000 & v1) == 0) {
            v2 |= (composer1.changedInstance(function21) ? 0x4000 : 0x2000);
        }
        if((0xB6DB & v2) != 9362 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1033291236, v2, -1, "com.kakao.kandinsky.mosaic.ui.DecorationContainer (MosaicDecoration.kt:177)");
            }
            composer1.startReplaceGroup(-1007012575);
            MutableState mutableState0 = composer1.rememberedValue();
            if((((v2 & 14) == 4 ? 1 : 0) | ((v2 & 0x70) == 0x20 ? 1 : 0) | ((v2 & 0x380) == 0x100 ? 1 : 0)) != 0 || mutableState0 == Composer.Companion.getEmpty()) {
                Path path0 = AndroidPath_androidKt.Path();
                Rect rect0 = SizeKt.toRect-uvyYCjk(v).translate-k-4lQ0M(Offset.unaryMinus-F1C5BW0(SizeKt.getCenter-uvyYCjk(v)));
                switch(a0.ordinal()) {
                    case 0: {
                        Path.addOval$default(path0, rect0, null, 2, null);
                        break;
                    }
                    case 1: {
                        Path.addRect$default(path0, rect0, null, 2, null);
                    }
                }
                if(!(path0 instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                ((AndroidPath)path0).getInternalPath().transform(MatrixExtensionKt.buildMatrix$default(null, new b0(decorationRect0, 2), 1, null));
                mutableState0 = SnapshotStateKt.mutableStateOf$default(path0, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            Companion modifier$Companion0 = Modifier.Companion;
            androidx.compose.ui.Alignment.Companion alignment$Companion0 = Alignment.Companion;
            Modifier modifier0 = androidx.compose.foundation.layout.SizeKt.wrapContentSize(modifier$Companion0, alignment$Companion0.getTopStart(), true);
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v3 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap0 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier1 = ComposedModifierKt.materializeModifier(composer1, modifier0);
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
            Function2 function22 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v3)) {
                androidx.room.a.t(v3, composer1, v3, function22);
            }
            r0.a.z(composeUiNode$Companion0, composer1, modifier1, composer1, -2061591989);
            boolean z = composer1.changed(mutableState0);
            g g0 = composer1.rememberedValue();
            if(z || g0 == Composer.Companion.getEmpty()) {
                g0 = new g(mutableState0);
                composer1.updateRememberedValue(g0);
            }
            composer1.endReplaceGroup();
            Modifier modifier2 = DrawModifierKt.drawWithContent(modifier$Companion0, g0);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v4 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier3 = ComposedModifierKt.materializeModifier(composer1, modifier2);
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
            Function2 function23 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v4)) {
                androidx.room.a.t(v4, composer1, v4, function23);
            }
            Updater.set-impl(composer1, modifier3, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v2 >> 9 & 14)));
            composer1.endNode();
            composer1.startReplaceGroup(-2061591757);
            boolean z1 = composer1.changed(mutableState0);
            h h0 = composer1.rememberedValue();
            if(z1 || h0 == Composer.Companion.getEmpty()) {
                h0 = new h(mutableState0);
                composer1.updateRememberedValue(h0);
            }
            composer1.endReplaceGroup();
            Modifier modifier4 = DrawModifierKt.drawWithContent(modifier$Companion0, h0);
            MeasurePolicy measurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v5 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap2 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier5 = ComposedModifierKt.materializeModifier(composer1, modifier4);
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
            Function2 function24 = androidx.room.a.r(composeUiNode$Companion0, composer1, measurePolicy2, composer1, compositionLocalMap2);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v5)) {
                androidx.room.a.t(v5, composer1, v5, function24);
            }
            Updater.set-impl(composer1, modifier5, composeUiNode$Companion0.getSetModifier());
            function21.invoke(composer1, ((int)(v2 >> 12 & 14)));
            composer1.endNode();
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
            scopeUpdateScope0.updateScope(new i(v, a0, decorationRect0, function20, function21, v1));
        }
    }

    public static final void access$BitmapImage(ImageBitmap imageBitmap0, float f, Rect rect0, Matrix matrix0, Composer composer0, int v, int v1) {
        Composer composer1 = composer0.startRestartGroup(0x13DED829);
        float f1 = (v1 & 2) == 0 ? f : 1.0f;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x13DED829, v, -1, "com.kakao.kandinsky.mosaic.ui.BitmapImage (MosaicDecoration.kt:228)");
        }
        boolean z = false;
        Modifier modifier0 = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(Modifier.Companion, null, false, 3, null);
        composer1.startReplaceGroup(0x91614B33);
        if((v & 0x380 ^ 0x180) > 0x100 && composer1.changed(rect0) || (v & 0x180) == 0x100) {
            z = true;
        }
        c c0 = composer1.rememberedValue();
        if(z || c0 == Composer.Companion.getEmpty()) {
            c0 = new c(rect0);
            composer1.updateRememberedValue(c0);
        }
        composer1.endReplaceGroup();
        ImageKt.Image-5h-nEew(imageBitmap0, null, GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(modifier0, c0), new y3(matrix0, f1, 2)), null, null, 0.0f, null, 0, composer1, 56, 0xF8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(imageBitmap0, f1, rect0, matrix0, v, v1));
        }
    }

    public static final void access$BlurDecoration-bHb6B40(Blur blur0, MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, long v, Rect rect0, Matrix matrix0, DecorationRect decorationRect0, Composer composer0, int v1) {
        a a0;
        Composer composer1 = composer0.startRestartGroup(0x90B1A9C6);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x90B1A9C6, v1, -1, "com.kakao.kandinsky.mosaic.ui.BlurDecoration (MosaicDecoration.kt:131)");
        }
        switch(WhenMappings.$EnumSwitchMapping$1[blur0.getBlurType().ordinal()]) {
            case 1: {
                a0 = a.a;
                break;
            }
            case 2: {
                a0 = a.b;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        MosaicDecorationKt.a(v, a0, decorationRect0, ComposableLambdaKt.rememberComposableLambda(0x973180E9, true, new e(mosaicAndBlurBitmapLoader0, rect0, matrix0, 0), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0x6E68FA48, true, new z(4, mosaicAndBlurBitmapLoader0, blur0, rect0, matrix0), composer1, 54), composer1, v1 >> 6 & 14 | 0x6C00 | v1 >> 9 & 0x380);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(blur0, mosaicAndBlurBitmapLoader0, v, rect0, matrix0, decorationRect0, v1, 0));
        }
    }

    public static final Path access$DecorationContainer_YLp_XPw$lambda$2(MutableState mutableState0) {
        return (Path)mutableState0.getValue();
    }

    public static final void access$MosaicContent-bHb6B40(Mosaic mosaic0, MosaicAndBlurBitmapLoader mosaicAndBlurBitmapLoader0, long v, Rect rect0, Matrix matrix0, DecorationRect decorationRect0, Composer composer0, int v1) {
        a a0;
        Composer composer1 = composer0.startRestartGroup(0x637D70ED);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x637D70ED, v1, -1, "com.kakao.kandinsky.mosaic.ui.MosaicContent (MosaicDecoration.kt:88)");
        }
        switch(WhenMappings.$EnumSwitchMapping$0[mosaic0.getMosaicType().ordinal()]) {
            case 1: {
                a0 = a.a;
                break;
            }
            case 2: {
                a0 = a.b;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        MosaicDecorationKt.a(v, a0, decorationRect0, ComposableLambdaKt.rememberComposableLambda(0x2CF87E2A, true, new z(5, mosaicAndBlurBitmapLoader0, mosaic0, rect0, matrix0), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0x3CB030AB, true, new e(mosaicAndBlurBitmapLoader0, rect0, matrix0, 1), composer1, 54), composer1, v1 >> 6 & 14 | 0x6C00 | v1 >> 9 & 0x380);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new f(mosaic0, mosaicAndBlurBitmapLoader0, v, rect0, matrix0, decorationRect0, v1, 1));
        }
    }
}

