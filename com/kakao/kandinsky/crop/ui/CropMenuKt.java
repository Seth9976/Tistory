package com.kakao.kandinsky.crop.ui;

import aa.e;
import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.kakao.kandinsky.crop.contract.CropRatioType;
import com.kakao.kandinsky.crop.contract.CropRatioTypeKt;
import com.kakao.kandinsky.designsystem.common.ItemSliderKt;
import ga.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z9.k;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A)\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"CropMenu", "", "currentCropRatioType", "Lcom/kakao/kandinsky/crop/contract/CropRatioType;", "onClickRatioType", "Lkotlin/Function1;", "(Lcom/kakao/kandinsky/crop/contract/CropRatioType;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "crop_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCropMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropMenu.kt\ncom/kakao/kandinsky/crop/ui/CropMenuKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,37:1\n77#2:38\n1223#3,6:39\n*S KotlinDebug\n*F\n+ 1 CropMenu.kt\ncom/kakao/kandinsky/crop/ui/CropMenuKt\n*L\n19#1:38\n24#1:39,6\n*E\n"})
public final class CropMenuKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void CropMenu(@NotNull CropRatioType cropRatioType0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(cropRatioType0, "currentCropRatioType");
        Intrinsics.checkNotNullParameter(function10, "onClickRatioType");
        Composer composer1 = composer0.startRestartGroup(1590567236);
        int v1 = (v & 14) == 0 ? (composer1.changed(cropRatioType0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.changedInstance(function10) ? 0x20 : 16);
        }
        if((v1 & 91) != 18 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1590567236, v1, -1, "com.kakao.kandinsky.crop.ui.CropMenu (CropMenu.kt:17)");
            }
            Context context0 = (Context)composer1.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int v2 = CropRatioTypeKt.getCropRatioTypeList().size();
            int v3 = CropRatioTypeKt.getCropRatioTypeList().indexOf(cropRatioType0);
            composer1.startReplaceGroup(0xD148AE2B);
            e e0 = composer1.rememberedValue();
            if((v1 & 0x70) == 0x20 || e0 == Composer.Companion.getEmpty()) {
                e0 = new e(function10, 8);
                composer1.updateRememberedValue(e0);
            }
            composer1.endReplaceGroup();
            ItemSliderKt.ItemSlider(null, v2, v3, e0, new a(context0, 2), ComposableSingletons.CropMenuKt.INSTANCE.getLambda-1$crop_release(), null, composer1, 0x30000, 65);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new k(cropRatioType0, function10, v, 0));
        }
    }
}

