package com.kakao.kandinsky.preview;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.w2;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.OnPlacedModifierKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import na.j;
import na.k;
import na.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\t\u001A)\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001Aw\u0010\u0016\u001A\u00020\u000F2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\n2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000F0\u000E2\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000F0\u000E2\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000F0\u000E2\u0006\u0010\u0015\u001A\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001D²\u0006\u000E\u0010\u0018\u001A\u00020\u00028\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u0019\u001A\u00020\u00118\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u001A\u001A\u00020\u00008\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u001B\u001A\u00020\u00008\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\u001C\u001A\u00020\u00008\n@\nX\u008A\u008E\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "originRect", "", "scaleChange", "Lkotlin/Pair;", "getIncrements", "(Landroidx/compose/ui/geometry/Rect;F)Lkotlin/Pair;", "Landroidx/compose/ui/Modifier;", "modifier", "buttonModifier", "Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap", "", "contentDescription", "Lkotlin/Function1;", "", "setScale", "Landroidx/compose/ui/geometry/Offset;", "setTranslation", "setBounds", "", "isZoomPossible", "PinchZoomImage", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/ImageBitmap;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "scale", "translation", "currentBounds", "originBounds", "parentSize", "preview_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPinchZoomImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PinchZoomImage.kt\ncom/kakao/kandinsky/preview/PinchZoomImageKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,195:1\n1223#2,6:196\n1223#2,6:202\n1223#2,6:209\n1223#2,6:215\n1223#2,6:221\n1223#2,6:227\n1223#2,6:233\n1223#2,6:239\n1223#2,6:246\n1#3:208\n148#4:245\n81#5:252\n107#5,2:253\n81#5:255\n107#5,2:256\n81#5:258\n107#5,2:259\n81#5:261\n107#5,2:262\n81#5:264\n107#5,2:265\n*S KotlinDebug\n*F\n+ 1 PinchZoomImage.kt\ncom/kakao/kandinsky/preview/PinchZoomImageKt\n*L\n53#1:196,6\n55#1:202,6\n56#1:209,6\n57#1:215,6\n58#1:221,6\n59#1:227,6\n72#1:233,6\n77#1:239,6\n115#1:246,6\n115#1:245\n55#1:252\n55#1:253,2\n56#1:255\n56#1:256,2\n57#1:258\n57#1:259,2\n58#1:261\n58#1:262,2\n59#1:264\n59#1:265,2\n*E\n"})
public final class PinchZoomImageKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void PinchZoomImage(@NotNull Modifier modifier0, @NotNull Modifier modifier1, @NotNull ImageBitmap imageBitmap0, @Nullable String s, @NotNull Function1 function10, @NotNull Function1 function11, @NotNull Function1 function12, boolean z, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier6;
        Pair pair0;
        Intrinsics.checkNotNullParameter(modifier0, "modifier");
        Intrinsics.checkNotNullParameter(modifier1, "buttonModifier");
        Intrinsics.checkNotNullParameter(imageBitmap0, "bitmap");
        Intrinsics.checkNotNullParameter(function10, "setScale");
        Intrinsics.checkNotNullParameter(function11, "setTranslation");
        Intrinsics.checkNotNullParameter(function12, "setBounds");
        Composer composer1 = composer0.startRestartGroup(1110553146);
        String s1 = (v1 & 8) == 0 ? s : null;
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1110553146, v, -1, "com.kakao.kandinsky.preview.PinchZoomImage (PinchZoomImage.kt:51)");
        }
        composer1.startReplaceGroup(0x3A47E2BF);
        boolean z1 = composer1.changed(imageBitmap0);
        Float float0 = composer1.rememberedValue();
        if(z1 || float0 == Composer.Companion.getEmpty()) {
            float0 = (float)(((float)imageBitmap0.getWidth()) / ((float)imageBitmap0.getHeight()));
            composer1.updateRememberedValue(float0);
        }
        float f = float0.floatValue();
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(0x3A47E324);
        MutableState mutableState0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(mutableState0 == composer$Companion0.getEmpty()) {
            mutableState0 = SnapshotStateKt.mutableStateOf$default(1.0f, null, 2, null);
            composer1.updateRememberedValue(mutableState0);
        }
        composer1.endReplaceGroup();
        function10.invoke(mutableState0.getValue());
        composer1.startReplaceGroup(0x3A47E375);
        MutableState mutableState1 = composer1.rememberedValue();
        if(mutableState1 == composer$Companion0.getEmpty()) {
            mutableState1 = SnapshotStateKt.mutableStateOf$default(Offset.box-impl(0L), null, 2, null);
            composer1.updateRememberedValue(mutableState1);
        }
        composer1.endReplaceGroup();
        function11.invoke(mutableState1.getValue());
        composer1.startReplaceGroup(0x3A47E3D7);
        MutableState mutableState2 = composer1.rememberedValue();
        if(mutableState2 == composer$Companion0.getEmpty()) {
            mutableState2 = SnapshotStateKt.mutableStateOf$default(Rect.Companion.getZero(), null, 2, null);
            composer1.updateRememberedValue(mutableState2);
        }
        composer1.endReplaceGroup();
        function12.invoke(mutableState2.getValue());
        composer1.startReplaceGroup(977790001);
        MutableState mutableState3 = composer1.rememberedValue();
        if(mutableState3 == composer$Companion0.getEmpty()) {
            mutableState3 = SnapshotStateKt.mutableStateOf$default(Rect.Companion.getZero(), null, 2, null);
            composer1.updateRememberedValue(mutableState3);
        }
        composer1.endReplaceGroup();
        composer1.startReplaceGroup(977790062);
        MutableState mutableState4 = composer1.rememberedValue();
        if(mutableState4 == composer$Companion0.getEmpty()) {
            MutableState mutableState5 = SnapshotStateKt.mutableStateOf$default(Rect.Companion.getZero(), null, 2, null);
            composer1.updateRememberedValue(mutableState5);
            mutableState4 = mutableState5;
        }
        composer1.endReplaceGroup();
        if(Float.compare(f, 1.0f) >= 0) {
            Modifier modifier2 = SizeKt.fillMaxWidth$default(modifier0, 0.0f, 1, null);
            pair0 = TuplesKt.to(ContentScale.Companion.getFillWidth(), modifier2);
        }
        else {
            Modifier modifier3 = SizeKt.fillMaxHeight$default(modifier0, 0.0f, 1, null);
            pair0 = TuplesKt.to(ContentScale.Companion.getFillHeight(), modifier3);
        }
        Object object0 = pair0.component1();
        Object object1 = pair0.component2();
        composer1.startReplaceGroup(977790298);
        if(z) {
            Modifier modifier4 = GraphicsLayerModifierKt.graphicsLayer-Ap8cVGQ$default(((Modifier)object1), ((Number)mutableState0.getValue()).floatValue(), ((Number)mutableState0.getValue()).floatValue(), 0.0f, Offset.getX-impl(((Offset)mutableState1.getValue()).unbox-impl()), Offset.getY-impl(((Offset)mutableState1.getValue()).unbox-impl()), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0x1FFE4, null);
            composer1.startReplaceGroup(977790561);
            boolean z2 = composer1.changed(mutableState2);
            k k0 = composer1.rememberedValue();
            if(z2 || k0 == composer$Companion0.getEmpty()) {
                k0 = new k(mutableState4, mutableState3, mutableState2);
                composer1.updateRememberedValue(k0);
            }
            composer1.endReplaceGroup();
            Modifier modifier5 = OnPlacedModifierKt.onPlaced(modifier4, k0);
            Unit unit0 = Unit.INSTANCE;
            composer1.startReplaceGroup(977790830);
            boolean z3 = composer1.changed(mutableState0);
            boolean z4 = composer1.changed(mutableState2);
            boolean z5 = composer1.changed(mutableState1);
            m m0 = composer1.rememberedValue();
            if((z3 | z4 | z5) != 0 || m0 == composer$Companion0.getEmpty()) {
                m0 = new m(mutableState0, mutableState4, mutableState2, mutableState3, mutableState1, null);
                composer1.updateRememberedValue(m0);
            }
            composer1.endReplaceGroup();
            modifier6 = SuspendingPointerInputFilterKt.pointerInput(modifier5, unit0, m0);
        }
        else {
            modifier6 = (Modifier)object1;
        }
        composer1.endReplaceGroup();
        ImageKt.Image-5h-nEew(imageBitmap0, s1, modifier6, null, ((ContentScale)object0), 0.0f, null, 0, composer1, v >> 6 & 0x70 | 8, 0xE8);
        if(z && (((Number)mutableState0.getValue()).floatValue() != 1.0f || !Offset.equals-impl0(((Offset)mutableState1.getValue()).unbox-impl(), 0L))) {
            Modifier modifier7 = PaddingKt.padding-qDBjuR0$default(modifier1, 0.0f, 0.0f, 10.0f, 10.0f, 3, null);
            composer1.startReplaceGroup(0x3A47ED40);
            boolean z6 = composer1.changed(mutableState0);
            boolean z7 = composer1.changed(mutableState1);
            j j0 = composer1.rememberedValue();
            if(z6 || z7 || j0 == composer$Companion0.getEmpty()) {
                j0 = new j(mutableState0, mutableState1);
                composer1.updateRememberedValue(j0);
            }
            composer1.endReplaceGroup();
            ButtonKt.Button(j0, modifier7, false, null, null, null, null, null, null, ComposableSingletons.PinchZoomImageKt.INSTANCE.getLambda-1$preview_release(), composer1, 0x30000000, 508);
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w2(modifier0, modifier1, imageBitmap0, s1, function10, function11, function12, z, v, v1));
        }
    }

    public static final Rect access$PinchZoomImage$lambda$11(MutableState mutableState0) {
        return (Rect)mutableState0.getValue();
    }

    public static final void access$PinchZoomImage$lambda$12(MutableState mutableState0, Rect rect0) {
        mutableState0.setValue(rect0);
    }

    public static final Rect access$PinchZoomImage$lambda$14(MutableState mutableState0) {
        return (Rect)mutableState0.getValue();
    }

    public static final void access$PinchZoomImage$lambda$15(MutableState mutableState0, Rect rect0) {
        mutableState0.setValue(rect0);
    }

    public static final Rect access$PinchZoomImage$lambda$17(MutableState mutableState0) {
        return (Rect)mutableState0.getValue();
    }

    public static final void access$PinchZoomImage$lambda$18(MutableState mutableState0, Rect rect0) {
        mutableState0.setValue(rect0);
    }

    public static final float access$PinchZoomImage$lambda$3(MutableState mutableState0) {
        return ((Number)mutableState0.getValue()).floatValue();
    }

    public static final void access$PinchZoomImage$lambda$4(MutableState mutableState0, float f) {
        mutableState0.setValue(f);
    }

    public static final long access$PinchZoomImage$lambda$7(MutableState mutableState0) {
        return ((Offset)mutableState0.getValue()).unbox-impl();
    }

    public static final void access$PinchZoomImage$lambda$8(MutableState mutableState0, long v) {
        mutableState0.setValue(Offset.box-impl(v));
    }

    public static final long access$moveImage-YqVAtuI(float f, long v, Rect rect0, Rect rect1, Rect rect2) {
        float f2;
        if(f == 1.0f) {
            rect1 = rect2;
        }
        float f1 = 0.0f;
        if(Offset.getX-impl(v) <= 0.0f || rect1.getLeft() >= 0.0f) {
            f2 = Offset.getX-impl(v) >= 0.0f || rect1.getRight() <= rect0.getRight() ? 0.0f : Float.max(rect0.getRight() + -rect1.getRight(), Offset.getX-impl(v) * f);
        }
        else {
            f2 = Float.min(-rect1.getLeft(), Offset.getX-impl(v) * f);
        }
        if(Offset.getY-impl(v) > 0.0f && rect1.getTop() < 0.0f) {
            return OffsetKt.Offset(f2, Float.min(-rect1.getTop(), Offset.getY-impl(v) * f));
        }
        if(Offset.getY-impl(v) < 0.0f && rect1.getBottom() > rect0.getBottom()) {
            f1 = Float.max(rect0.getBottom() + -rect1.getBottom(), Offset.getY-impl(v) * f);
        }
        return OffsetKt.Offset(f2, f1);
    }

    public static final long access$scaleAndMoveImage-pGV3PM0(float f, float f1, long v, long v1, Rect rect0, Rect rect1) {
        Pair pair0 = PinchZoomImageKt.getIncrements(rect1, f);
        float f2 = ((Number)pair0.component1()).floatValue();
        float f3 = ((Number)pair0.component2()).floatValue();
        Rect rect2 = new Rect(rect0.getLeft() - f2, rect0.getTop() - f3, rect0.getRight() + f2, rect0.getBottom() + f3);
        if(f1 == 1.0f) {
            return OffsetKt.Offset(-Offset.getX-impl(v1), -Offset.getY-impl(v1));
        }
        if(f > 0.0f) {
            return OffsetKt.Offset((1.0f - Offset.getX-impl(v) / Offset.getX-impl(rect1.getCenter-F1C5BW0())) * f2, (1.0f - Offset.getY-impl(v) / Offset.getY-impl(rect1.getCenter-F1C5BW0())) * f3);
        }
        float f4 = Offset.getX-impl(rect1.getCenter-F1C5BW0()) - Offset.getX-impl(rect2.getCenter-F1C5BW0());
        float f5 = Offset.getY-impl(rect1.getCenter-F1C5BW0()) - Offset.getY-impl(rect2.getCenter-F1C5BW0());
        if(Math.abs(f4) < Math.abs(f2)) {
            f2 = f4;
        }
        else if(f4 >= 0.0f) {
            f2 = -f2;
        }
        if(Math.abs(f5) < Math.abs(f3)) {
            return OffsetKt.Offset(f2, f5);
        }
        if(f5 >= 0.0f) {
            f3 = -f3;
        }
        return OffsetKt.Offset(f2, f3);
    }

    @NotNull
    public static final Pair getIncrements(@NotNull Rect rect0, float f) {
        Intrinsics.checkNotNullParameter(rect0, "originRect");
        float[] arr_f = Matrix.constructor-impl$default(null, 1, null);
        Matrix.scale-impl$default(arr_f, f, f, 0.0f, 4, null);
        Rect rect1 = Matrix.map-impl(arr_f, rect0);
        int v = Float.compare(f, 0.0f);
        float f1 = rect1.getWidth();
        if(v <= 0) {
            f1 = -f1;
        }
        float f2 = rect1.getHeight();
        return v <= 0 ? TuplesKt.to(((float)(f1 / 2.0f)), ((float)(-f2 / 2.0f))) : TuplesKt.to(((float)(f1 / 2.0f)), ((float)(f2 / 2.0f)));
    }
}

