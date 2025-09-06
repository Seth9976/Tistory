package com.kakao.kandinsky;

import a.a0;
import a.b1;
import a.c1;
import a.e1;
import a.f0;
import a.f;
import a.g1;
import a.h1;
import a.i2;
import a.i;
import a.j1;
import a.k0;
import a.l0;
import a.l1;
import a.m1;
import a.n1;
import a.n;
import a.o2;
import a.o;
import a.p0;
import a.p1;
import a.p;
import a.q0;
import a.q1;
import a.q;
import a.r0;
import a.s0;
import a.t0;
import a.t;
import a.u;
import a.v0;
import a.v;
import a.w0;
import a.w;
import a.x0;
import a.x;
import a.z0;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsetsController;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.SystemBarStyle;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.animation.TransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.ViewModelKt;
import androidx.room.a;
import b.b0;
import b.j;
import b.s;
import com.kakao.kandinsky.base.ConsumeDialogKt;
import com.kakao.kandinsky.bitmap.usecase.GetBitmapSizeUseCase;
import com.kakao.kandinsky.bitmap.usecase.GetBitmapUseCase;
import com.kakao.kandinsky.border.BorderScreenKt;
import com.kakao.kandinsky.border.BorderViewModel;
import com.kakao.kandinsky.core.filter.repository.FilterRepository;
import com.kakao.kandinsky.core.filter.usecase.DeleteBitmapFilterEngineUseCase;
import com.kakao.kandinsky.core.filter.usecase.GetFilterListUseCase;
import com.kakao.kandinsky.core.filter.usecase.GetFilteredBitmapUseCase;
import com.kakao.kandinsky.core.filter.usecase.GetViewFilterEngineUseCase;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.crop.CropScreenKt;
import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.delegate.ImageLibraryKt;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import com.kakao.kandinsky.filter.FilterScreenKt;
import com.kakao.kandinsky.filter.FilterViewModel;
import com.kakao.kandinsky.filter.contract.FilterIntent.OnActivityDestroy;
import com.kakao.kandinsky.history.KPhotoKey;
import com.kakao.kandinsky.home.HomeScreenKt;
import com.kakao.kandinsky.launcher.Kandinsky;
import com.kakao.kandinsky.launcher.KandinskyInput;
import com.kakao.kandinsky.mosaic.MosaicAndBlurBitmapLoader;
import com.kakao.kandinsky.mosaic.MosaicScreenKt;
import com.kakao.kandinsky.mosaic.MosaicViewModel;
import com.kakao.kandinsky.preview.ImagePreviewKt;
import com.kakao.kandinsky.preview.PreviewAnimator;
import com.kakao.kandinsky.preview.PreviewGestureController;
import com.kakao.kandinsky.preview.PreviewUiState;
import com.kakao.kandinsky.preview.ui.PreviewTextureLoader;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import com.kakao.kandinsky.resize.ResizeViewModel;
import com.kakao.kandinsky.resize.contract.ResizeIntent.Init;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import com.kakao.kandinsky.selector.SelectorEvent.MultipleSelector;
import com.kakao.kandinsky.selector.SelectorEvent.SingleSelector;
import com.kakao.kandinsky.selector.SelectorEvent;
import com.kakao.kandinsky.selector.SelectorImageDate;
import com.kakao.kandinsky.selector.SingleImageSelectorKt;
import com.kakao.kandinsky.signature.SignatureScreenKt;
import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.database.SignatureDao;
import com.kakao.kandinsky.sticker.StickerScreenKt;
import com.kakao.kandinsky.sticker.StickerViewModel;
import com.kakao.kandinsky.text.TextScreenKt;
import com.kakao.kandinsky.text.TextViewModel;
import com.kakao.kdtracker.KDTracker;
import d.h;
import dagger.internal.Preconditions;
import e.g;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000E²\u0006\f\u0010\u0005\u001A\u00020\u00048\nX\u008A\u0084\u0002²\u0006\f\u0010\u0007\u001A\u00020\u00068\nX\u008A\u0084\u0002²\u0006\f\u0010\t\u001A\u00020\b8\nX\u008A\u0084\u0002²\u0006\f\u0010\u000B\u001A\u00020\n8\nX\u008A\u0084\u0002²\u0006\f\u0010\r\u001A\u00020\f8\nX\u008A\u0084\u0002"}, d2 = {"Lcom/kakao/kandinsky/KandinskyActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lb/b0;", "uiState", "Lcom/kakao/kandinsky/preview/PreviewUiState;", "previewUiState", "Lb/s;", "screen", "Landroidx/compose/ui/unit/Dp;", "offsetY", "Landroidx/compose/ui/graphics/Color;", "color", "kandinsky_release"}, k = 1, mv = {1, 9, 0})
public final class KandinskyActivity extends ComponentActivity {
    public b a;
    public PreviewTextureLoader b;
    public ResizeViewModel c;
    public CropViewModel d;
    public FilterViewModel e;
    public SignatureVieModel f;
    public StickerViewModel g;
    public MosaicViewModel h;
    public TextViewModel i;
    public BorderViewModel j;
    public String k;
    public static final int l;

    public static final void a(KandinskyActivity kandinskyActivity0, BoxScope boxScope0, b0 b00, Function1 function10, PreviewAnimator previewAnimator0, Composer composer0, int v) {
        BorderViewModel borderViewModel1;
        SignatureVieModel signatureVieModel1;
        FilterViewModel filterViewModel1;
        CropViewModel cropViewModel1;
        kandinskyActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(0xFB7F99A8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xFB7F99A8, v, -1, "com.kakao.kandinsky.KandinskyActivity.Screen (KandinskyActivity.kt:411)");
        }
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = composer1.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(compositionScopedCoroutineScopeCanceller0 == composer$Companion0.getEmpty()) {
            compositionScopedCoroutineScopeCanceller0 = a.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer1), composer1);
        }
        CoroutineScope coroutineScope0 = compositionScopedCoroutineScopeCanceller0.getCoroutineScope();
        Function0 function00 = FunctionStateKt.skippableLambda(new m1(b00), composer1, 0);
        boolean z = true;
        ScrollState scrollState0 = ScrollKt.rememberScrollState(0, composer1, 0, 1);
        StickerViewModel stickerViewModel0 = null;
        switch(b00.a.ordinal()) {
            case 0: {
                composer1.startReplaceGroup(0x5CA09657);
                Function0 function01 = FunctionStateKt.skippableLambda(new x0(b00), composer1, 0);
                Function1 function11 = FunctionStateKt.skippableLambda(new z0(kandinskyActivity0, b00), composer1, 0);
                Function0 function02 = FunctionStateKt.skippableLambda(new b1(kandinskyActivity0, function10, b00), composer1, 0);
                HomeScreenKt.HomeScreen(scrollState0, b00.g, b00.p, b00.b, b00.m, function01, function11, function02, b00.d, composer1, 0x1000, 0);
                BackHandlerKt.BackHandler(false, new c1(b00), composer1, 0, 1);
                kandinskyActivity0.a(kandinskyActivity0.a().getEvent(), composer1, 72);
                composer1.endReplaceGroup();
                break;
            }
            case 1: {
                composer1.startReplaceGroup(1554030241);
                ResizeViewModel resizeViewModel0 = kandinskyActivity0.c;
                if(resizeViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resizeViewModel");
                    resizeViewModel0 = null;
                }
                e1 e10 = new e1(coroutineScope0, previewAnimator0);
                g1 g10 = new g1(kandinskyActivity0, function10, b00);
                ReSizeScreenKt.ResizeScreen(resizeViewModel0, e10, b00.i, g10, function00, composer1, ResizeViewModel.$stable);
                composer1.endReplaceGroup();
                break;
            }
            case 2: {
                composer1.startReplaceGroup(1554030986);
                CropViewModel cropViewModel0 = kandinskyActivity0.d;
                if(cropViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cropViewModel");
                    cropViewModel1 = null;
                }
                else {
                    cropViewModel1 = cropViewModel0;
                }
                Function1 function12 = b00.i;
                composer1.startReplaceGroup(0x5CA0A22A);
                if(((v & 0x1C00 ^ 0xC00) <= 0x800 || !composer1.changed(previewAnimator0)) && (v & 0xC00) != 0x800) {
                    z = false;
                }
                h1 h10 = composer1.rememberedValue();
                if(z || h10 == composer$Companion0.getEmpty()) {
                    h10 = new h1(previewAnimator0);
                    composer1.updateRememberedValue(h10);
                }
                composer1.endReplaceGroup();
                CropScreenKt.CropScreen(boxScope0, cropViewModel1, function12, FunctionStateKt.skippableLambda(h10, composer1, 0), function00, composer1, v & 14 | CropViewModel.$stable << 3);
                composer1.endReplaceGroup();
                break;
            }
            case 3: {
                composer1.startReplaceGroup(0x5CA0A2A0);
                FilterViewModel filterViewModel0 = kandinskyActivity0.e;
                if(filterViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("filterViewModel");
                    filterViewModel1 = null;
                }
                else {
                    filterViewModel1 = filterViewModel0;
                }
                j1 j10 = new j1(kandinskyActivity0, function10, b00);
                FilterScreenKt.FilterScreen(filterViewModel1, b00.i, j10, function00, composer1, FilterViewModel.$stable);
                composer1.endReplaceGroup();
                break;
            }
            case 4: {
                composer1.startReplaceGroup(0x5CA0A517);
                SignatureVieModel signatureVieModel0 = kandinskyActivity0.f;
                if(signatureVieModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("signatureViewModel");
                    signatureVieModel1 = null;
                }
                else {
                    signatureVieModel1 = signatureVieModel0;
                }
                l1 l10 = new l1(kandinskyActivity0, function10, b00);
                SignatureScreenKt.SignatureScreen(signatureVieModel1, b00.i, l10, function00, composer1, SignatureVieModel.$stable);
                composer1.endReplaceGroup();
                break;
            }
            case 5: {
                composer1.startReplaceGroup(0x5CA0A6E5);
                StickerViewModel stickerViewModel1 = kandinskyActivity0.g;
                if(stickerViewModel1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("stickerViewModel");
                }
                else {
                    stickerViewModel0 = stickerViewModel1;
                }
                StickerScreenKt.StickerScreen(stickerViewModel0, b00.i, function00, composer1, StickerViewModel.$stable);
                composer1.endReplaceGroup();
                break;
            }
            case 6: {
                composer1.startReplaceGroup(0x5CA0A7AE);
                MosaicScreenKt.MosaicScreen(kandinskyActivity0.b(), b00.i, function00, composer1, MosaicViewModel.$stable);
                composer1.endReplaceGroup();
                break;
            }
            case 7: {
                composer1.startReplaceGroup(0x5CA0A872);
                TextViewModel textViewModel0 = kandinskyActivity0.i;
                if(textViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewModel");
                }
                else {
                    stickerViewModel0 = textViewModel0;
                }
                TextScreenKt.TextScreen(((TextViewModel)stickerViewModel0), b00.i, function00, composer1, TextViewModel.$stable);
                composer1.endReplaceGroup();
                break;
            }
            case 8: {
                composer1.startReplaceGroup(0x5CA0A934);
                BorderViewModel borderViewModel0 = kandinskyActivity0.j;
                if(borderViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("borderViewModel");
                    borderViewModel1 = null;
                }
                else {
                    borderViewModel1 = borderViewModel0;
                }
                Function2 function20 = FunctionStateKt.skippableLambda(new v0(kandinskyActivity0, function10, b00), composer1, 0);
                BorderScreenKt.BorderScreen(borderViewModel1, b00.i, function20, function00, composer1, BorderViewModel.$stable);
                composer1.endReplaceGroup();
                break;
            }
            default: {
                composer1.startReplaceGroup(0x5CA0AAEC);
                composer1.endReplaceGroup();
            }
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new w0(kandinskyActivity0, boxScope0, b00, function10, previewAnimator0, v));
        }
    }

    public static final void a(KandinskyActivity kandinskyActivity0, Composer composer0, int v) {
        kandinskyActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(2023036513);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2023036513, v, -1, "com.kakao.kandinsky.KandinskyActivity.KandinskyApp (KandinskyActivity.kt:208)");
        }
        CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{ImageLibraryKt.getLocalImageLibrary().provides(Kandinsky.INSTANCE.getImageLibrary$kandinsky_release()), OrientationKt.getLocalOrientation().provides(OrientationKt.getOrientation(composer1, 0))}, ComposableLambdaKt.rememberComposableLambda(0x48A849A1, true, new a0(kandinskyActivity0), composer1, 54), composer1, ProvidedValue.$stable | 0x30);
        f0 f00 = new f0(kandinskyActivity0, null);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, f00, composer1, 70);
        k0 k00 = new k0(kandinskyActivity0, ((Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext())), null);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, k00, composer1, 70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new l0(kandinskyActivity0, v));
        }
    }

    public static final void a(KandinskyActivity kandinskyActivity0, PreviewAnimator previewAnimator0, PreviewGestureController previewGestureController0, s s0, Composer composer0, int v) {
        StateFlow stateFlow1;
        kandinskyActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(0x8DB4FBF3);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x8DB4FBF3, v, -1, "com.kakao.kandinsky.KandinskyActivity.ImagePreview (KandinskyActivity.kt:317)");
        }
        composer1.startReplaceGroup(0x5D5A1D5E);
        boolean z = (v & 0x380 ^ 0x180) > 0x100 && composer1.changed(s0) || (v & 0x180) == 0x100;
        StateFlow stateFlow0 = composer1.rememberedValue();
        if(z || stateFlow0 == Composer.Companion.getEmpty()) {
            switch(s0.ordinal()) {
                case 0: {
                    stateFlow1 = kandinskyActivity0.a().getUiState();
                    break;
                }
                case 1: {
                    b b0 = kandinskyActivity0.c;
                    if(b0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resizeViewModel");
                        b0 = null;
                    }
                    stateFlow1 = b0.getUiState();
                    break;
                }
                case 2: {
                    CropViewModel cropViewModel0 = kandinskyActivity0.d;
                    if(cropViewModel0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cropViewModel");
                        cropViewModel0 = null;
                    }
                    stateFlow1 = cropViewModel0.getUiState();
                    break;
                }
                case 3: {
                    FilterViewModel filterViewModel0 = kandinskyActivity0.e;
                    if(filterViewModel0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("filterViewModel");
                        filterViewModel0 = null;
                    }
                    stateFlow1 = filterViewModel0.getUiState();
                    break;
                }
                case 4: {
                    SignatureVieModel signatureVieModel0 = kandinskyActivity0.f;
                    if(signatureVieModel0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("signatureViewModel");
                        signatureVieModel0 = null;
                    }
                    stateFlow1 = signatureVieModel0.getUiState();
                    break;
                }
                case 5: {
                    StickerViewModel stickerViewModel0 = kandinskyActivity0.g;
                    if(stickerViewModel0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stickerViewModel");
                        stickerViewModel0 = null;
                    }
                    stateFlow1 = stickerViewModel0.getUiState();
                    break;
                }
                case 6: {
                    stateFlow1 = kandinskyActivity0.b().getUiState();
                    break;
                }
                case 7: {
                    MosaicViewModel mosaicViewModel0 = kandinskyActivity0.i;
                    if(mosaicViewModel0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textViewModel");
                        mosaicViewModel0 = null;
                    }
                    stateFlow1 = mosaicViewModel0.getUiState();
                    break;
                }
                case 8: {
                    BorderViewModel borderViewModel0 = kandinskyActivity0.j;
                    if(borderViewModel0 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("borderViewModel");
                        borderViewModel0 = null;
                    }
                    stateFlow1 = borderViewModel0.getUiState();
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            stateFlow0 = stateFlow1;
            composer1.updateRememberedValue(stateFlow0);
        }
        composer1.endReplaceGroup();
        PreviewUiState previewUiState0 = new PreviewUiState();
        int v1 = PreviewUiState.$stable;
        State state0 = SnapshotStateKt.collectAsState(stateFlow0, previewUiState0, null, composer1, v1 << 3 | 8, 2);
        State state1 = SnapshotStateKt.rememberUpdatedState(s0, composer1, v >> 6 & 14);
        PreviewTextureLoader previewTextureLoader0 = kandinskyActivity0.b;
        if(previewTextureLoader0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previewTextureLoader");
            previewTextureLoader0 = null;
        }
        composer1.startReplaceGroup(0x5D5A2090);
        boolean z1 = composer1.changed(previewTextureLoader0);
        PreviewTextureLoader previewTextureLoader1 = composer1.rememberedValue();
        if(z1 || previewTextureLoader1 == Composer.Companion.getEmpty()) {
            PreviewTextureLoader previewTextureLoader2 = kandinskyActivity0.b;
            if(previewTextureLoader2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("previewTextureLoader");
                previewTextureLoader1 = null;
            }
            else {
                previewTextureLoader1 = previewTextureLoader2;
            }
            composer1.updateRememberedValue(previewTextureLoader1);
        }
        composer1.endReplaceGroup();
        int v2 = 0;
        ImagePreviewKt.ImagePreview(((PreviewUiState)state0.getValue()), previewAnimator0, previewTextureLoader1, ((s)state1.getValue()).a, ((s)state1.getValue()).b, previewGestureController0, ComposableLambdaKt.rememberComposableLambda(0x40729CFE, true, new p(kandinskyActivity0), composer1, 54), ComposableLambdaKt.rememberComposableLambda(0x35F23C0C, true, new q(kandinskyActivity0), composer1, 54), FunctionStateKt.skippableLambda(new a.s(kandinskyActivity0, state0, state1), composer1, 0), composer1, v1 | 0xD80000 | v << 3 & 0x70 | v << 12 & 0x70000, 0);
        Integer integer0 = ((View)composer1.consume(AndroidCompositionLocals_androidKt.getLocalView())).getWidth();
        Integer integer1 = ((View)composer1.consume(AndroidCompositionLocals_androidKt.getLocalView())).getHeight();
        composer1.startReplaceGroup(1566190507);
        int v3 = ((v & 0x70 ^ 0x30) <= 0x20 || !composer1.changed(previewGestureController0)) && (v & 0x30) != 0x20 ? 0 : 1;
        if((v & 14 ^ 6) > 4 && composer1.changed(previewAnimator0) || (v & 6) == 4) {
            v2 = 1;
        }
        t t0 = composer1.rememberedValue();
        if((v3 | v2) != 0 || t0 == Composer.Companion.getEmpty()) {
            t0 = new t(previewGestureController0, previewAnimator0, null);
            composer1.updateRememberedValue(t0);
        }
        composer1.endReplaceGroup();
        EffectsKt.LaunchedEffect(integer0, integer1, t0, composer1, 0x200);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new u(kandinskyActivity0, previewAnimator0, previewGestureController0, s0, v));
        }
    }

    public static final void a(KandinskyActivity kandinskyActivity0, SelectorEvent selectorEvent0, Function0 function00, Composer composer0, int v) {
        kandinskyActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(2116305503);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2116305503, v, -1, "com.kakao.kandinsky.KandinskyActivity.ImageSelector (KandinskyActivity.kt:573)");
        }
        if(selectorEvent0 != null) {
            if(selectorEvent0 instanceof SingleSelector) {
                composer1.startReplaceGroup(0x1D06DA34);
                SingleImageSelectorKt.SingleImageSelector(((SingleSelector)selectorEvent0).getSelectItems(), ((SingleSelector)selectorEvent0).getSelectedIndex(), new v(selectorEvent0), function00, composer1, v << 6 & 0x1C00 | 8);
            }
            else if(selectorEvent0 instanceof MultipleSelector) {
                composer1.startReplaceGroup(0x1D06DB9D);
                MultipleImageSelectorKt.MultipleImageSelector(((MultipleSelector)selectorEvent0).getSelectItems(), ((MultipleSelector)selectorEvent0).getFixedIndex(), kandinskyActivity0.k, new w(selectorEvent0), function00, composer1, v << 9 & 0xE000 | 8, 0);
            }
            else {
                composer1.startReplaceGroup(0x1D06DD02);
            }
            composer1.endReplaceGroup();
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new x(kandinskyActivity0, selectorEvent0, function00, v));
        }
    }

    public static final void a(KandinskyActivity kandinskyActivity0, boolean z) {
        kandinskyActivity0.getClass();
        if(Build.VERSION.SDK_INT < 30) {
            WindowInsetsControllerCompat windowInsetsControllerCompat0 = new WindowInsetsControllerCompat(kandinskyActivity0.getWindow(), kandinskyActivity0.getWindow().getDecorView());
            windowInsetsControllerCompat0.setSystemBarsBehavior(2);
            if(z) {
                windowInsetsControllerCompat0.hide(7);
                return;
            }
            windowInsetsControllerCompat0.show(7);
            return;
        }
        WindowInsetsController windowInsetsController0 = kandinskyActivity0.getWindow().getInsetsController();
        if(windowInsetsController0 != null) {
            i3.b.g(windowInsetsController0);
            if(z) {
                windowInsetsController0.hide(7);
                return;
            }
            windowInsetsController0.show(7);
        }
    }

    public static final void a(Function1 function10, b0 b00, Function1 function11) {
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(b00.f, 10));
        int v = 0;
        for(Object object0: b00.f) {
            if(v < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList0.add(new SelectorImageDate(v, ((KDPhoto)object0).getOriginalUri(), ((KDPhoto)object0).isEdited()));
            ++v;
        }
        n1 n10 = new n1(b00, function11);
        function10.invoke(new MultipleSelector(arrayList0, b00.g, n10));
    }

    public final b a() {
        b b0 = this.a;
        if(b0 != null) {
            return b0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("kandinskyViewModel");
        return null;
    }

    public final void a(Flow flow0, Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1120741600);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1120741600, v, -1, "com.kakao.kandinsky.KandinskyActivity.ConsumeEvent (KandinskyActivity.kt:599)");
        }
        ConsumeDialogKt.ConsumeDialog(new i(new f(flow0)), composer1, 8);
        EffectsKt.LaunchedEffect(flow0, new n(flow0, this, null), composer1, 72);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new o(this, flow0, v));
        }
    }

    public static final void b(KandinskyActivity kandinskyActivity0, Composer composer0, int v) {
        kandinskyActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(0x12D30E70);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x12D30E70, v, -1, "com.kakao.kandinsky.KandinskyActivity.KandinskyScreen (KandinskyActivity.kt:254)");
        }
        SurfaceKt.Surface-T9BRK9s(WindowInsetsPadding_androidKt.safeDrawingPadding(BackgroundKt.background-bw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getBackground-0d7_KjU(), null, 2, null)), null, MaterialTheme.INSTANCE.getColorScheme(composer1, MaterialTheme.$stable).getBackground-0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1638035915, true, new p0(kandinskyActivity0), composer1, 54), composer1, 0xC00000, 0x7A);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q0(kandinskyActivity0, v));
        }
    }

    public final MosaicViewModel b() {
        MosaicViewModel mosaicViewModel0 = this.h;
        if(mosaicViewModel0 != null) {
            return mosaicViewModel0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mosaicViewModel");
        return null;
    }

    public static final void c(KandinskyActivity kandinskyActivity0, Composer composer0, int v) {
        kandinskyActivity0.getClass();
        Composer composer1 = composer0.startRestartGroup(1785180888);
        if((v & 1) != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1785180888, v, -1, "com.kakao.kandinsky.KandinskyActivity.LoadingAnimation (KandinskyActivity.kt:639)");
            }
            Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 42.0f);
            MeasurePolicy measurePolicy0 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getCenterVertically(), composer1, 54);
            int v1 = ComposablesKt.getCurrentCompositeKeyHash(composer1, 0);
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
            if(composer1.getInserting() || !Intrinsics.areEqual(composer1.rememberedValue(), v1)) {
                a.t(v1, composer1, v1, function20);
            }
            Updater.set-impl(composer1, modifier1, composeUiNode$Companion0.getSetModifier());
            InfiniteTransition infiniteTransition0 = InfiniteTransitionKt.rememberInfiniteTransition("loading animation", composer1, 6, 0);
            KeyframesSpec keyframesSpec0 = AnimationSpecKt.keyframes(r0.a);
            KeyframesSpec keyframesSpec1 = AnimationSpecKt.keyframes(s0.a);
            composer1.startReplaceGroup(0xCC01ECC4);
            for(int v2 = 0; v2 < 3; ++v2) {
                long v3 = StartOffset.constructor-impl$default(v2 * 0x7D - 375, 0, 2, null);
                InfiniteRepeatableSpec infiniteRepeatableSpec0 = AnimationSpecKt.infiniteRepeatable-9IiC70o$default(keyframesSpec0, null, v3, 2, null);
                State state0 = InfiniteTransitionKt.animateValue(infiniteTransition0, Dp.box-impl(0.0f), Dp.box-impl(0.0f), VectorConvertersKt.getVectorConverter(Dp.Companion), infiniteRepeatableSpec0, "offsetY", composer1, 0x311B0 | InfiniteTransition.$stable | InfiniteRepeatableSpec.$stable << 12, 0);
                State state1 = TransitionKt.animateColor-DTcfvLk(infiniteTransition0, 0xFF00000000000000L, 0xFF00000000000000L, AnimationSpecKt.infiniteRepeatable-9IiC70o$default(keyframesSpec1, null, v3, 2, null), "color", composer1, InfiniteTransition.$stable | 25008 | InfiniteRepeatableSpec.$stable << 9, 0);
                BoxKt.Box(BackgroundKt.background-bw27NRU(OffsetKt.offset-VpY3zN4$default(SizeKt.size-3ABfNKs(Modifier.Companion, 10.0f), 0.0f, ((Dp)state0.getValue()).unbox-impl(), 1, null), ((Color)state1.getValue()).unbox-impl(), RoundedCornerShapeKt.getCircleShape()), composer1, 0);
            }
            if(a.x(composer1)) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new t0(kandinskyActivity0, v));
        }
    }

    @Override  // androidx.activity.ComponentActivity
    public final void onCreate(Bundle bundle0) {
        EdgeToEdge.enable(this, SystemBarStyle.Companion.dark(0xFF000000), SystemBarStyle.Companion.dark(0xFF000000));
        super.onCreate(bundle0);
        d.b b0 = (d.b)Preconditions.checkNotNull(new d.b(this));
        d.a a0 = (d.a)Preconditions.checkNotNull(new d.a(Kandinsky.INSTANCE.getBitmapLoader$kandinsky_release()));
        Context context0 = this.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getApplicationContext(...)");
        h h0 = (h)Preconditions.checkNotNull(new h(context0));
        Preconditions.checkBuilderRequirement(b0, d.b.class);
        Preconditions.checkBuilderRequirement(a0, d.a.class);
        Preconditions.checkBuilderRequirement(h0, h.class);
        d.f f0 = new d.f(b0, a0, h0);
        this.a = new b(new f.l(((Context)Preconditions.checkNotNullFromProvides(b0.a)), ((ContentResolver)f0.c.get()), ((File)f0.d.get()), new f.b(), new GetBitmapUseCase(f0.a()), new GetFilteredBitmapUseCase(((FilterRepository)f0.e.get())), new e.u(((g)f0.f.get()))), new GetBitmapSizeUseCase(f0.a()), new e.u(((g)f0.f.get())));
        this.b = new PreviewTextureLoader(new GetBitmapUseCase(f0.a()), new GetViewFilterEngineUseCase(((FilterRepository)f0.e.get())));
        this.c = new ResizeViewModel();
        this.d = new CropViewModel();
        this.e = new FilterViewModel(new GetFilterListUseCase(((FilterRepository)f0.e.get())), new GetBitmapUseCase(f0.a()), new GetFilteredBitmapUseCase(((FilterRepository)f0.e.get())), new DeleteBitmapFilterEngineUseCase(((FilterRepository)f0.e.get())));
        this.f = new SignatureVieModel(((SignatureDao)f0.g.get()), new GetBitmapSizeUseCase(f0.a()));
        this.g = new StickerViewModel();
        this.h = new MosaicViewModel(new MosaicAndBlurBitmapLoader(new GetBitmapUseCase(f0.a()), new GetFilteredBitmapUseCase(((FilterRepository)f0.e.get()))));
        this.i = new TextViewModel();
        this.j = new BorderViewModel();
        boolean z = false;
        String s = this.getIntent().getStringExtra("INPUT");
        if(s == null) {
            this.finish();
        }
        else {
            KandinskyInput kandinskyInput0 = (KandinskyInput)Json.Default.decodeFromString(KandinskyInput.Companion.serializer(), s);
            if(kandinskyInput0 == null) {
                this.finish();
            }
            else {
                if(kandinskyInput0.getSelectedItems().size() == 1) {
                    z = true;
                }
                Context context1 = this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(context1, "getApplicationContext(...)");
                KDTracker.INSTANCE.register(context1, "");
                this.a().sendIntent(new b.h(kandinskyInput0, bundle0 != null));
                ResizeViewModel resizeViewModel0 = this.c;
                if(resizeViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resizeViewModel");
                    resizeViewModel0 = null;
                }
                resizeViewModel0.sendIntent(new Init(z));
                CropViewModel cropViewModel0 = this.d;
                if(cropViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cropViewModel");
                    cropViewModel0 = null;
                }
                cropViewModel0.sendIntent(com.kakao.kandinsky.crop.contract.CropIntent.Init.INSTANCE);
                FilterViewModel filterViewModel0 = this.e;
                if(filterViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("filterViewModel");
                    filterViewModel0 = null;
                }
                filterViewModel0.sendIntent(new com.kakao.kandinsky.filter.contract.FilterIntent.Init(z));
                SignatureVieModel signatureVieModel0 = this.f;
                if(signatureVieModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("signatureViewModel");
                    signatureVieModel0 = null;
                }
                signatureVieModel0.sendIntent(new com.kakao.kandinsky.signature.contract.SignatureIntent.Init(z, "", kandinskyInput0.getAllowSystemFont(), kandinskyInput0.getFontResources()));
                this.b().sendIntent(com.kakao.kandinsky.mosaic.contract.MosaicIntent.Init.INSTANCE);
                TextViewModel textViewModel0 = this.i;
                if(textViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("textViewModel");
                    textViewModel0 = null;
                }
                textViewModel0.sendIntent(new com.kakao.kandinsky.text.contract.TextIntent.Init(kandinskyInput0.getAllowSystemFont(), kandinskyInput0.getFontResources()));
                BorderViewModel borderViewModel0 = this.j;
                if(borderViewModel0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("borderViewModel");
                    borderViewModel0 = null;
                }
                borderViewModel0.sendIntent(new com.kakao.kandinsky.border.contract.BorderIntent.Init(z));
            }
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(0x12D040E4, true, new p1(MovableContentKt.movableContentOf(ComposableLambdaKt.composableLambdaInstance(-1315304085, true, new q1(this))))), 1, null);
    }

    @Override  // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        FilterViewModel filterViewModel0 = this.e;
        if(filterViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterViewModel");
            filterViewModel0 = null;
        }
        filterViewModel0.sendIntent(OnActivityDestroy.INSTANCE);
        KDTracker.INSTANCE.unRegister();
    }

    @Override  // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "savedInstanceState");
        b b0 = this.a();
        b0.getClass();
        Intrinsics.checkNotNullParameter(bundle0, "saved");
        Serializable serializable0 = bundle0.getSerializable("KEY_SCREEN");
        s s0 = serializable0 instanceof s ? ((s)serializable0) : null;
        if(s0 == null) {
            s0 = s.d;
        }
        int v = bundle0.getInt("KEY_SELECTED_INDEX");
        String s1 = bundle0.getString("KEY_PHOTO_LIST");
        if(s1 != null) {
            ArrayListSerializer arrayListSerializer0 = new ArrayListSerializer(KPhotoKey.Companion.serializer());
            List list0 = (List)o2.b.decodeFromString(arrayListSerializer0, s1);
            if(list0 != null) {
                b0.sendIntent(new j(s0, v));
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(b0), null, null, new i2(b0, list0, null), 3, null);
            }
        }
        super.onRestoreInstanceState(bundle0);
        bundle0.clear();
    }

    @Override  // androidx.activity.ComponentActivity
    public final void onSaveInstanceState(Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outState");
        bundle0.clear();
        b b0 = this.a();
        b0.getClass();
        Intrinsics.checkNotNullParameter(bundle0, "out");
        b0 b00 = (b0)b0.getUiState().getValue();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(b00.f, 10));
        for(Object object0: b00.f) {
            arrayList0.add(new KPhotoKey(((KDPhoto)object0).getOriginalUri(), ((KDPhoto)object0).getId()));
        }
        bundle0.putSerializable("KEY_SCREEN", b00.a);
        bundle0.putInt("KEY_SELECTED_INDEX", b00.g);
        Json.Default.getSerializersModule();
        ArrayListSerializer arrayListSerializer0 = new ArrayListSerializer(KPhotoKey.Companion.serializer());
        bundle0.putString("KEY_PHOTO_LIST", Json.Default.encodeToString(arrayListSerializer0, arrayList0));
        super.onSaveInstanceState(bundle0);
    }
}

