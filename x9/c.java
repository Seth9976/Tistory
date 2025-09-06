package x9;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import ce.e;
import com.kakao.kandinsky.crop.CropScreenKt.CropScreen.3.WhenMappings;
import com.kakao.kandinsky.crop.CropScreenKt;
import com.kakao.kandinsky.crop.a;
import com.kakao.kandinsky.crop.contract.CropViewType;
import com.kakao.kandinsky.crop.ui.CropMenuKt;
import com.kakao.kandinsky.crop.ui.RotateMenuKt;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import w0.i1;

public final class c extends Lambda implements Function2 {
    public final BoxScope w;
    public final State x;

    public c(BoxScope boxScope0, State state0) {
        this.w = boxScope0;
        this.x = state0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        State state1;
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xD41A63EB, v, -1, "com.kakao.kandinsky.crop.CropScreen.<anonymous> (CropScreen.kt:77)");
        }
        composer0.startReplaceGroup(979804716);
        State state0 = this.x;
        if(CropScreenKt.access$CropScreen$lambda$0(state0).getViewType() == CropViewType.Rotate) {
            Modifier modifier0 = this.w.align(Modifier.Companion, Alignment.Companion.getBottomCenter());
            float f = CropScreenKt.access$CropScreen$lambda$0(state0).getAngle();
            Function1 function10 = CropScreenKt.access$CropScreen$lambda$0(state0).getOnRotate();
            ClosedFloatingPointRange closedFloatingPointRange0 = e.rangeTo(-50.0f, 50.0f);
            state1 = state0;
            KDSliderKt.KDSlider(modifier0, false, f, function10, 0.0f, b.w, false, null, 0, closedFloatingPointRange0, composer0, 0x30000, 466);
        }
        else {
            state1 = state0;
        }
        composer0.endReplaceGroup();
        switch(CropScreenKt.CropScreen.3.WhenMappings.$EnumSwitchMapping$0[CropScreenKt.access$CropScreen$lambda$0(state1).getViewType().ordinal()]) {
            case 1: {
                composer0.startReplaceGroup(979805370);
                CropMenuKt.CropMenu(CropScreenKt.access$CropScreen$lambda$0(state1).getCropRatioType(), CropScreenKt.access$CropScreen$lambda$0(state1).getOnChangeCropRatioType(), composer0, 0);
                KDSliderKt.SliderBoundBox(null, null, composer0, 0, 3);
                composer0.endReplaceGroup();
                break;
            }
            case 2: {
                composer0.startReplaceGroup(979805550);
                RotateMenuKt.RotateMenu(CropScreenKt.access$CropScreen$lambda$0(state1).getOnClickRotate(), CropScreenKt.access$CropScreen$lambda$0(state1).getOnClickFlip(), composer0, 0, 0);
                composer0.endReplaceGroup();
                break;
            }
            default: {
                composer0.startReplaceGroup(979805736);
                composer0.endReplaceGroup();
            }
        }
        composer0.startReplaceGroup(979805822);
        boolean z = composer0.changed(state1);
        i1 i10 = composer0.rememberedValue();
        if(z || i10 == Composer.Companion.getEmpty()) {
            i10 = new i1(state1, 5);
            composer0.updateRememberedValue(i10);
        }
        composer0.endReplaceGroup();
        Function0 function00 = FunctionStateKt.skippableLambda(i10, composer0, 0);
        composer0.startReplaceGroup(979806169);
        boolean z1 = composer0.changed(state1);
        i1 i11 = composer0.rememberedValue();
        if(z1 || i11 == Composer.Companion.getEmpty()) {
            i11 = new i1(state1, 6);
            composer0.updateRememberedValue(i11);
        }
        composer0.endReplaceGroup();
        FeatureBottomBarKt.CommonFeatureBottomBar(false, function00, FunctionStateKt.skippableLambda(i11, composer0, 0), null, ComposableLambdaKt.rememberComposableLambda(-1524203879, true, new a(state1), composer0, 54), composer0, 0x6000, 9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

