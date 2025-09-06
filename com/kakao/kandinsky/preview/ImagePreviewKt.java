package com.kakao.kandinsky.preview;

import android.graphics.Matrix;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment.Companion;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.room.a;
import com.kakao.kandinsky.core.kdphoto.Blur;
import com.kakao.kandinsky.core.kdphoto.Decoration.Absolute;
import com.kakao.kandinsky.core.kdphoto.Decoration.Relative;
import com.kakao.kandinsky.core.kdphoto.Mosaic;
import com.kakao.kandinsky.decoration.DecorationStatus;
import com.kakao.kandinsky.gesture.GestureInteractionKt;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import com.kakao.kandinsky.preview.ui.PreviewTextureViewKt;
import com.kakao.kandinsky.utils.MatrixValues;
import j0.t1;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import na.b;
import na.c;
import na.d;
import na.e;
import na.f;
import na.g;
import na.h;
import na.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001AÉ\u0001\u0010\u001D\u001A\u00020\u00142\u0006\u0010\u0001\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n28\u0010\u0016\u001A4\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\f¢\u0006\u0002\b\u001522\u0010\u0019\u001A.\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0018\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0017¢\u0006\u0002\b\u00152\u0012\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u00140\u001AH\u0007¢\u0006\u0004\b\u001D\u0010\u001E¨\u0006\"²\u0006\f\u0010 \u001A\u00020\u001F8\nX\u008A\u0084\u0002²\u0006\f\u0010!\u001A\u00020\u00108\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/kandinsky/preview/PreviewUiState;", "previewUiState", "Lcom/kakao/kandinsky/preview/PreviewAnimator;", "previewAnimator", "Lcom/kakao/kandinsky/preview/ui/PreviewTextureLoader;", "previewTextureLoader", "Lcom/kakao/kandinsky/preview/DimState;", "dimState", "", "gestureEnabled", "Lcom/kakao/kandinsky/preview/PreviewGestureController;", "gestureController", "Lkotlin/Function4;", "Lcom/kakao/kandinsky/decoration/DecorationStatus;", "Lcom/kakao/kandinsky/utils/MatrixValues;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration;", "Landroidx/compose/ui/geometry/Rect;", "Lkotlin/ParameterName;", "name", "displayRect", "", "Landroidx/compose/runtime/Composable;", "decorationContent", "Lkotlin/Function3;", "Lcom/kakao/kandinsky/core/kdphoto/Decoration$Relative;", "relativeDecorationContent", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "onClickEmptyArea", "ImagePreview", "(Lcom/kakao/kandinsky/preview/PreviewUiState;Lcom/kakao/kandinsky/preview/PreviewAnimator;Lcom/kakao/kandinsky/preview/ui/PreviewTextureLoader;Lcom/kakao/kandinsky/preview/DimState;ZLcom/kakao/kandinsky/preview/PreviewGestureController;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcom/kakao/kandinsky/preview/ImagePreviewGestureInteraction;", "gestureInteraction", "relativeRect", "preview_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImagePreview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePreview.kt\ncom/kakao/kandinsky/preview/ImagePreviewKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,140:1\n1223#2,6:141\n1223#2,6:147\n1223#2,6:153\n1223#2,6:159\n1223#2,6:165\n1223#2,6:207\n71#3:171\n68#3,6:172\n74#3:206\n71#3:213\n68#3,6:214\n74#3:248\n78#3:252\n78#3:261\n71#3:262\n68#3,6:263\n74#3:297\n78#3:301\n78#4,6:178\n85#4,4:193\n89#4,2:203\n78#4,6:220\n85#4,4:235\n89#4,2:245\n93#4:251\n93#4:260\n78#4,6:269\n85#4,4:284\n89#4,2:294\n93#4:300\n368#5,9:184\n377#5:205\n368#5,9:226\n377#5:247\n378#5,2:249\n378#5,2:258\n368#5,9:275\n377#5:296\n378#5,2:298\n4032#6,6:197\n4032#6,6:239\n4032#6,6:288\n1045#7:253\n1855#7,2:254\n1855#7,2:256\n81#8:302\n81#8:303\n*S KotlinDebug\n*F\n+ 1 ImagePreview.kt\ncom/kakao/kandinsky/preview/ImagePreviewKt\n*L\n56#1:141,6\n61#1:147,6\n67#1:153,6\n71#1:159,6\n75#1:165,6\n90#1:207,6\n80#1:171\n80#1:172,6\n80#1:206\n84#1:213\n84#1:214,6\n84#1:248\n84#1:252\n80#1:261\n128#1:262\n128#1:263,6\n128#1:297\n128#1:301\n80#1:178,6\n80#1:193,4\n80#1:203,2\n84#1:220,6\n84#1:235,4\n84#1:245,2\n84#1:251\n80#1:260\n128#1:269,6\n128#1:284,4\n128#1:294,2\n128#1:300\n80#1:184,9\n80#1:205\n84#1:226,9\n84#1:247\n84#1:249,2\n80#1:258,2\n128#1:275,9\n128#1:296\n128#1:298,2\n80#1:197,6\n84#1:239,6\n128#1:288,6\n105#1:253\n106#1:254,2\n115#1:256,2\n61#1:302\n82#1:303\n*E\n"})
public final class ImagePreviewKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void ImagePreview(@NotNull PreviewUiState previewUiState0, @Nullable PreviewAnimator previewAnimator0, @NotNull PreviewTextureLoader previewTextureLoader0, @Nullable DimState dimState0, boolean z, @Nullable PreviewGestureController previewGestureController0, @NotNull Function6 function60, @NotNull Function5 function50, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        PreviewAnimator previewAnimator2;
        boolean z1;
        Modifier modifier3;
        PreviewAnimator previewAnimator3;
        DimState dimState2;
        Companion alignment$Companion1;
        int v4;
        PreviewGestureController previewGestureController2;
        boolean z2;
        PreviewGestureController previewGestureController1;
        DimState dimState1;
        PreviewAnimator previewAnimator1;
        int v2;
        Intrinsics.checkNotNullParameter(previewUiState0, "previewUiState");
        Intrinsics.checkNotNullParameter(previewTextureLoader0, "previewTextureLoader");
        Intrinsics.checkNotNullParameter(function60, "decorationContent");
        Intrinsics.checkNotNullParameter(function50, "relativeDecorationContent");
        Intrinsics.checkNotNullParameter(function10, "onClickEmptyArea");
        Composer composer1 = composer0.startRestartGroup(0x3706904A);
        if((v1 & 1) == 0) {
            v2 = (v & 14) == 0 ? v | (composer1.changed(previewUiState0) ? 4 : 2) : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x70) == 0) {
            previewAnimator1 = previewAnimator0;
            v2 |= ((v1 & 2) != 0 || !composer1.changed(previewAnimator1) ? 16 : 0x20);
        }
        else {
            previewAnimator1 = previewAnimator0;
        }
        int v3 = v2;
        if((v1 & 4) != 0) {
            v3 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v3 |= (composer1.changed(previewTextureLoader0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v3 |= 0xC00;
            dimState1 = dimState0;
        }
        else if((v & 0x1C00) == 0) {
            dimState1 = dimState0;
            v3 |= (composer1.changed(dimState1) ? 0x800 : 0x400);
        }
        else {
            dimState1 = dimState0;
        }
        if((16 & v1) != 0) {
            v3 |= 0x6000;
        }
        else if((v & 0xE000) == 0) {
            v3 |= (composer1.changed(z) ? 0x4000 : 0x2000);
        }
        if((v1 & 0x20) == 0) {
            previewGestureController1 = previewGestureController0;
            if((v & 0x70000) == 0) {
                v3 |= (composer1.changed(previewGestureController1) ? 0x20000 : 0x10000);
            }
        }
        else {
            v3 |= 0x30000;
            previewGestureController1 = previewGestureController0;
        }
        if((v1 & 0x40) != 0) {
            v3 |= 0x180000;
        }
        else if((v & 0x380000) == 0) {
            v3 |= (composer1.changedInstance(function60) ? 0x100000 : 0x80000);
        }
        if((0x80 & v1) != 0) {
            v3 |= 0xC00000;
        }
        else if((0x1C00000 & v) == 0) {
            v3 |= (composer1.changedInstance(function50) ? 0x800000 : 0x400000);
        }
        if((0x100 & v1) != 0) {
            v3 |= 0x6000000;
        }
        else if((v & 0xE000000) == 0) {
            v3 |= (composer1.changedInstance(function10) ? 0x4000000 : 0x2000000);
        }
        if((0xB6DB6DB & v3) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                if((v1 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                    previewAnimator1 = new PreviewAnimator();
                }
                if((v1 & 8) != 0) {
                    dimState1 = DimState.Decoration;
                }
                boolean z3 = (16 & v1) == 0 ? z : true;
                if((v1 & 0x20) == 0) {
                    z2 = z3;
                    previewGestureController2 = previewGestureController1;
                    v4 = v3;
                }
                else {
                    composer1.startReplaceGroup(-890401548);
                    PreviewGestureController previewGestureController3 = composer1.rememberedValue();
                    if(previewGestureController3 == Composer.Companion.getEmpty()) {
                        previewGestureController3 = new PreviewGestureController();
                        composer1.updateRememberedValue(previewGestureController3);
                    }
                    composer1.endReplaceGroup();
                    v4 = v3;
                    z2 = z3;
                    previewGestureController2 = previewGestureController3;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v3 &= 0xFFFFFF8F;
                }
                z2 = z;
                previewGestureController2 = previewGestureController1;
                v4 = v3;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x3706904A, v4, -1, "com.kakao.kandinsky.preview.ImagePreview (ImagePreview.kt:59)");
            }
            composer1.startReplaceGroup(-890401215);
            int v5 = v4 & 0x70 ^ 0x30;
            int v6 = (v5 <= 0x20 || !composer1.changed(previewAnimator1)) && (v4 & 0x30) != 0x20 ? 0 : 1;
            State state0 = composer1.rememberedValue();
            if((v6 | ((v4 & 0x70000) == 0x20000 ? 1 : 0)) != 0 || state0 == Composer.Companion.getEmpty()) {
                previewAnimator1.updateGestureMatrix(previewGestureController2.getGestureMatrix(), true);
                state0 = SnapshotStateKt.derivedStateOf(new t1(17, previewGestureController2, previewAnimator1));
                composer1.updateRememberedValue(state0);
            }
            composer1.endReplaceGroup();
            String s = previewUiState0.getPhoto().getOriginalUri();
            composer1.startReplaceGroup(-890400914);
            int v7 = (v5 <= 0x20 || !composer1.changed(previewAnimator1)) && (v4 & 0x30) != 0x20 ? 0 : 1;
            b b0 = composer1.rememberedValue();
            if((v7 | ((v4 & 14) == 4 ? 1 : 0)) != 0 || b0 == Composer.Companion.getEmpty()) {
                b0 = new b(previewAnimator1, previewUiState0, null);
                composer1.updateRememberedValue(b0);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(s, b0, composer1, 0x40);
            Matrix matrix0 = previewUiState0.getPreviewMatrix();
            composer1.startReplaceGroup(0xCAED9001);
            int v8 = (v5 <= 0x20 || !composer1.changed(previewAnimator1)) && (v4 & 0x30) != 0x20 ? 0 : 1;
            c c0 = composer1.rememberedValue();
            if((v8 | ((v4 & 14) == 4 ? 1 : 0)) != 0 || c0 == Composer.Companion.getEmpty()) {
                c0 = new c(previewAnimator1, previewUiState0, null);
                composer1.updateRememberedValue(c0);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(matrix0, c0, composer1, 72);
            Size size0 = Size.box-impl(previewUiState0.getPhoto().getCropSize-NH-jbRc());
            Matrix matrix1 = previewUiState0.getDisplayMatrix();
            composer1.startReplaceGroup(-890400584);
            int v9 = (v5 <= 0x20 || !composer1.changed(previewAnimator1)) && (v4 & 0x30) != 0x20 ? 0 : 1;
            d d0 = composer1.rememberedValue();
            if((v9 | ((v4 & 14) == 4 ? 1 : 0) | ((v4 & 0x70000) == 0x20000 ? 1 : 0)) != 0 || d0 == Composer.Companion.getEmpty()) {
                d0 = new d(previewAnimator1, previewUiState0, previewGestureController2, null);
                composer1.updateRememberedValue(d0);
            }
            composer1.endReplaceGroup();
            EffectsKt.LaunchedEffect(previewGestureController2, size0, matrix1, d0, composer1, v4 >> 15 & 14 | 0x1200);
            int v10 = v4 >> 3 & 14;
            Modifier modifier0 = previewAnimator1.gestureModifier(composer1, v10);
            Companion alignment$Companion0 = Alignment.Companion;
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion0.getTopStart(), false);
            int v11 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function20 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting()) {
                alignment$Companion1 = alignment$Companion0;
                a.t(v11, composer1, v11, function20);
            }
            else {
                alignment$Companion1 = alignment$Companion0;
                if(!Intrinsics.areEqual(composer1.rememberedValue(), v11)) {
                    a.t(v11, composer1, v11, function20);
                }
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            Pair pair0 = previewAnimator1.absoluteMatrixAndModifier(composer1, v10);
            ImmutableList immutableList0 = ((MatrixValues)pair0.component1()).unbox-impl();
            Modifier modifier2 = (Modifier)pair0.component2();
            State state1 = previewAnimator1.animatedRelativeRect(composer1, v10);
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            if(dimState1 == DimState.None) {
                dimState2 = dimState1;
                previewAnimator3 = previewAnimator1;
                modifier3 = modifier$Companion0;
            }
            else {
                Rect rect0 = (Rect)state1.getValue();
                dimState2 = dimState1;
                previewAnimator3 = previewAnimator1;
                modifier3 = DrawModifierKt.drawWithContent(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), new i(rect0));
            }
            Modifier modifier4 = z2 ? GestureInteractionKt.gesture(modifier$Companion0, ((ImagePreviewGestureInteraction)state0.getValue())) : modifier$Companion0;
            Modifier modifier5 = ClipKt.clipToBounds(SizeKt.fillMaxSize$default(modifier3.then(modifier4), 0.0f, 1, null));
            composer1.startReplaceGroup(0xF6A69B56);
            e e0 = composer1.rememberedValue();
            if((((v4 & 0x70000) == 0x20000 ? 1 : 0) | ((v4 & 0xE000000) == 0x4000000 ? 1 : 0)) != 0 || e0 == Composer.Companion.getEmpty()) {
                e0 = new e(previewGestureController2, function10, null);
                composer1.updateRememberedValue(e0);
            }
            composer1.endReplaceGroup();
            Modifier modifier6 = SuspendingPointerInputFilterKt.pointerInput(modifier5, previewGestureController2, e0).then(modifier2);
            MeasurePolicy measurePolicy1 = BoxKt.maybeCachedBoxMeasurePolicy(alignment$Companion1.getTopStart(), false);
            int v12 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
            CompositionLocalMap compositionLocalMap1 = composer1.getCurrentCompositionLocalMap();
            Modifier modifier7 = ComposedModifierKt.materializeModifier(composer1, modifier6);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy1, composer1, compositionLocalMap1);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v12)) {
                a.t(v12, composer1, v12, function21);
            }
            Updater.set-impl(composer1, modifier7, composeUiNode$Companion0.getSetModifier());
            PreviewTextureViewKt.PreviewTextureView(modifier$Companion0, previewTextureLoader0, previewUiState0.getPhoto(), composer1, v4 >> 3 & 0x70 | 6, 0);
            composer1.endNode();
            composer1.startReplaceGroup(0xF6A69D7C);
            for(Object object0: CollectionsKt___CollectionsKt.sortedWith(previewUiState0.getPhoto().getDecorationList(), new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    boolean z = false;
                    Boolean boolean0 = Boolean.valueOf(!(((Absolute)object0) instanceof Blur) && !(((Absolute)object0) instanceof Mosaic));
                    if(!(((Absolute)object1) instanceof Blur) && !(((Absolute)object1) instanceof Mosaic)) {
                        z = true;
                    }
                    return pd.c.compareValues(boolean0, Boolean.valueOf(z));
                }
            })) {
                composer1.startMovableGroup(0xEA743BC5, ((Absolute)object0).getNo());
                DecorationStatus decorationStatus0 = previewUiState0.getDecorationStatus(((Absolute)object0));
                ImagePreviewKt.a(dimState2, decorationStatus0, ((Rect)state1.getValue()), ComposableLambdaKt.rememberComposableLambda(-1939580827, true, new f(function60, decorationStatus0, immutableList0, ((Absolute)object0), state1), composer1, 54), composer1, v4 >> 9 & 14 | 0xC00);
                composer1.endMovableGroup();
            }
            composer1.endReplaceGroup();
            composer1.startReplaceGroup(-890398828);
            for(Object object1: CollectionsKt__CollectionsKt.listOfNotNull(new Relative[]{previewUiState0.getPhoto().getBorder(), previewUiState0.getPhoto().getSignature()})) {
                DecorationStatus decorationStatus1 = previewUiState0.getDecorationStatus(((Relative)object1));
                ImagePreviewKt.a(dimState2, decorationStatus1, ((Rect)state1.getValue()), ComposableLambdaKt.rememberComposableLambda(1091067486, true, new g(function50, decorationStatus1, ((Relative)object1), state1), composer1, 54), composer1, v4 >> 9 & 14 | 0xC00);
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
            previewGestureController1 = previewGestureController2;
            previewAnimator2 = previewAnimator3;
            dimState1 = dimState2;
            z1 = z2;
        }
        else {
            composer1.skipToGroupEnd();
            z1 = z;
            previewAnimator2 = previewAnimator1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new h(previewUiState0, previewAnimator2, previewTextureLoader0, dimState1, z1, previewGestureController1, function60, function50, function10, v, v1));
        }
    }

    public static final void a(DimState dimState0, DecorationStatus decorationStatus0, Rect rect0, Function2 function20, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x467A297E);
        int v1 = (v & 14) == 0 ? (composer1.changed(dimState0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changed(decorationStatus0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.changed(rect0) ? 0x100 : 0x80);
        }
        if((v & 0x1C00) == 0) {
            v1 |= (composer1.changedInstance(function20) ? 0x800 : 0x400);
        }
        if((v1 & 5851) != 1170 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x467A297E, v1, -1, "com.kakao.kandinsky.preview.ClippedBox (ImagePreview.kt:124)");
            }
            androidx.compose.ui.Modifier.Companion modifier$Companion0 = Modifier.Companion;
            Modifier modifier0 = dimState0 == DimState.None || decorationStatus0 == DecorationStatus.Selected ? modifier$Companion0 : DrawModifierKt.drawWithContent(SizeKt.fillMaxSize$default(modifier$Companion0, 0.0f, 1, null), new i(rect0));
            MeasurePolicy measurePolicy0 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int v2 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            Function2 function21 = a.r(composeUiNode$Companion0, composer1, measurePolicy0, composer1, compositionLocalMap0);
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v2)) {
                a.t(v2, composer1, v2, function21);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            function20.invoke(composer1, ((int)(v1 >> 9 & 14)));
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
            scopeUpdateScope0.updateScope(new aa.g(v, 5, dimState0, decorationStatus0, rect0, function20));
        }
    }

    public static final void access$ClippedBox(DimState dimState0, DecorationStatus decorationStatus0, Rect rect0, Function2 function20, Composer composer0, int v) {
        ImagePreviewKt.a(dimState0, decorationStatus0, rect0, function20, composer0, v);
    }

    public static final Rect access$ImagePreview$lambda$12$lambda$6(State state0) {
        return (Rect)state0.getValue();
    }
}

