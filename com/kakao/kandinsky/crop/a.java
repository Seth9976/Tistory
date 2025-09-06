package com.kakao.kandinsky.crop;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.kandinsky.crop.contract.CropViewType;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import w0.i1;

public final class a extends Lambda implements Function2 {
    public final State w;

    public a(State state0) {
        this.w = state0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1524203879, v, -1, "com.kakao.kandinsky.crop.CropScreen.<anonymous>.<anonymous> (CropScreen.kt:124)");
        }
        String s = StringResources_androidKt.stringResource(string.crop_feature_name, ((Composer)object0), 0);
        State state0 = this.w;
        boolean z = CropScreenKt.access$CropScreen$lambda$0(state0).getViewType() == CropViewType.Crop;
        ((Composer)object0).startReplaceGroup(0xA86BB8C7);
        boolean z1 = ((Composer)object0).changed(state0);
        i1 i10 = ((Composer)object0).rememberedValue();
        if(z1 || i10 == Composer.Companion.getEmpty()) {
            i10 = new i1(state0, 7);
            ((Composer)object0).updateRememberedValue(i10);
        }
        ((Composer)object0).endReplaceGroup();
        FeatureBottomBarKt.BottomBarFeatureTypeText(s, false, z, FunctionStateKt.skippableLambda(i10, ((Composer)object0), 0), ((Composer)object0), 0, 2);
        String s1 = StringResources_androidKt.stringResource(string.crop_feature_rotate_name, ((Composer)object0), 0);
        boolean z2 = CropScreenKt.access$CropScreen$lambda$0(state0).getViewType() == CropViewType.Rotate;
        ((Composer)object0).startReplaceGroup(0xA86BBA47);
        boolean z3 = ((Composer)object0).changed(state0);
        i1 i11 = ((Composer)object0).rememberedValue();
        if(z3 || i11 == Composer.Companion.getEmpty()) {
            i11 = new i1(state0, 8);
            ((Composer)object0).updateRememberedValue(i11);
        }
        ((Composer)object0).endReplaceGroup();
        FeatureBottomBarKt.BottomBarFeatureTypeText(s1, false, z2, FunctionStateKt.skippableLambda(i11, ((Composer)object0), 0), ((Composer)object0), 0, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

