package com.kakao.kandinsky.preview.ui;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.gc;
import androidx.compose.material3.sf;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.b0;
import oa.h;
import oa.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A)\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000E²\u0006\u000E\u0010\n\u001A\u00020\t8\n@\nX\u008A\u008E\u0002²\u0006\u000E\u0010\f\u001A\u00020\u000B8\n@\nX\u008A\u008E\u0002²\u0006\f\u0010\r\u001A\u00020\t8\nX\u008A\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/kakao/kandinsky/preview/ui/PreviewTextureLoader;", "textureLoader", "Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;", "photo", "", "PreviewTextureView", "(Landroidx/compose/ui/Modifier;Lcom/kakao/kandinsky/preview/ui/PreviewTextureLoader;Lcom/kakao/kandinsky/core/kdphoto/KDPhoto;Landroidx/compose/runtime/Composer;II)V", "", "bitmapScale", "", "isTextureLoaded", "alpha", "preview_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPreviewTextureView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewTextureView.kt\ncom/kakao/kandinsky/preview/ui/PreviewTextureViewKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,116:1\n1223#2,6:117\n1223#2,6:123\n1223#2,6:129\n1223#2,6:135\n1223#2,6:141\n76#3:147\n109#3,2:148\n81#4:150\n107#4,2:151\n81#4:153\n*S KotlinDebug\n*F\n+ 1 PreviewTextureView.kt\ncom/kakao/kandinsky/preview/ui/PreviewTextureViewKt\n*L\n32#1:117,6\n37#1:123,6\n67#1:129,6\n78#1:135,6\n86#1:141,6\n32#1:147\n32#1:148,2\n78#1:150\n78#1:151,2\n79#1:153\n*E\n"})
public final class PreviewTextureViewKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void PreviewTextureView(@Nullable Modifier modifier0, @NotNull PreviewTextureLoader previewTextureLoader0, @NotNull KDPhoto kDPhoto0, @Nullable Composer composer0, int v, int v1) {
        Modifier modifier1;
        int v2;
        Intrinsics.checkNotNullParameter(previewTextureLoader0, "textureLoader");
        Intrinsics.checkNotNullParameter(kDPhoto0, "photo");
        Composer composer1 = composer0.startRestartGroup(146468580);
        if((v1 & 1) != 0) {
            v2 = v | 6;
            modifier1 = modifier0;
        }
        else if((v & 14) == 0) {
            modifier1 = modifier0;
            v2 = (composer1.changed(modifier1) ? 4 : 2) | v;
        }
        else {
            modifier1 = modifier0;
            v2 = v;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x70) == 0) {
            v2 |= (composer1.changed(previewTextureLoader0) ? 0x20 : 16);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x380) == 0) {
            v2 |= (composer1.changed(kDPhoto0) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            Modifier modifier2 = (v1 & 1) == 0 ? modifier1 : Modifier.Companion;
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(146468580, v2, -1, "com.kakao.kandinsky.preview.ui.PreviewTextureView (PreviewTextureView.kt:29)");
            }
            long v3 = previewTextureLoader0.getBitmapSize-YbymL2g();
            composer1.startReplaceGroup(-336041140);
            boolean z = composer1.changed(kDPhoto0.getOriginalUri());
            MutableFloatState mutableFloatState0 = composer1.rememberedValue();
            if(z || mutableFloatState0 == Composer.Companion.getEmpty()) {
                mutableFloatState0 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer1.updateRememberedValue(mutableFloatState0);
            }
            composer1.endReplaceGroup();
            Modifier modifier3 = SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null);
            composer1.startReplaceGroup(-336040988);
            boolean z1 = composer1.changed(mutableFloatState0);
            b0 b00 = composer1.rememberedValue();
            if(z1 || b00 == Composer.Companion.getEmpty()) {
                b00 = new b0(mutableFloatState0, 14);
                composer1.updateRememberedValue(b00);
            }
            composer1.endReplaceGroup();
            BoxWithConstraintsKt.BoxWithConstraints(GraphicsLayerModifierKt.graphicsLayer(modifier3, b00), null, false, ComposableLambdaKt.rememberComposableLambda(0x75350DBA, true, new h(v3, mutableFloatState0, kDPhoto0, previewTextureLoader0), composer1, 54), composer1, 0xC00, 6);
            Unit unit0 = Unit.INSTANCE;
            composer1.startReplaceGroup(0xEBF8701F);
            b0 b01 = composer1.rememberedValue();
            if((v2 & 0x70) == 0x20 || b01 == Composer.Companion.getEmpty()) {
                b01 = new b0(previewTextureLoader0, 15);
                composer1.updateRememberedValue(b01);
            }
            composer1.endReplaceGroup();
            EffectsKt.DisposableEffect(unit0, b01, composer1, 6);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier1 = modifier2;
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new sf(modifier1, previewTextureLoader0, kDPhoto0, v, v1, 12));
        }
    }

    public static final float access$PreviewTextureView$lambda$1(MutableFloatState mutableFloatState0) {
        return mutableFloatState0.getFloatValue();
    }

    public static final void access$PreviewTextureView$lambda$2(MutableFloatState mutableFloatState0, float f) {
        mutableFloatState0.setFloatValue(f);
    }

    public static final void access$TextureView-03bzQGs(long v, Function3 function30, Function0 function00, Composer composer0, int v1) {
        Composer composer1 = composer0.startRestartGroup(-260401803);
        int v2 = (v1 & 14) == 0 ? (composer1.changed(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (composer1.changedInstance(function30) ? 0x20 : 16);
        }
        if((v1 & 0x380) == 0) {
            v2 |= (composer1.changedInstance(function00) ? 0x100 : 0x80);
        }
        if((v2 & 731) != 0x92 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-260401803, v2, -1, "com.kakao.kandinsky.preview.ui.TextureView (PreviewTextureView.kt:76)");
            }
            composer1.startReplaceGroup(0x9064AD44);
            MutableState mutableState0 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(mutableState0 == composer$Companion0.getEmpty()) {
                mutableState0 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer1.updateRememberedValue(mutableState0);
            }
            composer1.endReplaceGroup();
            float f = ((Boolean)mutableState0.getValue()).booleanValue() ? 1.0f : 0.0f;
            TweenSpec tweenSpec0 = ((Boolean)mutableState0.getValue()).booleanValue() ? AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null) : AnimationSpecKt.tween$default(0, 0, null, 6, null);
            State state0 = AnimateAsStateKt.animateFloatAsState(f, tweenSpec0, 0.0f, "", null, composer1, 0xC40, 20);
            composer1.startReplaceGroup(0x9064AE47);
            k k0 = composer1.rememberedValue();
            if((((v2 & 0x380) == 0x100 ? 1 : 0) | ((v2 & 0x70) == 0x20 ? 1 : 0) | ((v2 & 14) == 4 ? 1 : 0)) != 0 || k0 == composer$Companion0.getEmpty()) {
                k0 = new k(v, function30, mutableState0, function00);
                composer1.updateRememberedValue(k0);
            }
            composer1.endReplaceGroup();
            AndroidView_androidKt.AndroidView(k0, AlphaKt.alpha(SizeKt.wrapContentSize(Modifier.Companion, Alignment.Companion.getTopStart(), true), ((Number)state0.getValue()).floatValue()), null, composer1, 0, 4);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new gc(v, function30, function00, v1, 1));
        }
    }

    public static final void access$TextureView_03bzQGs$lambda$7(MutableState mutableState0, boolean z) {
        mutableState0.setValue(Boolean.valueOf(z));
    }
}

