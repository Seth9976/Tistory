package ka;

import aa.l;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import ce.e;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.designsystem.common.KDSliderKt;
import com.kakao.kandinsky.mosaic.BlurMenu;
import com.kakao.kandinsky.mosaic.MosaicMenu;
import com.kakao.kandinsky.mosaic.MosaicScreenKt;
import com.kakao.kandinsky.mosaic.ui.BlurMenuKt;
import com.kakao.kandinsky.mosaic.ui.MosaicMenuKt;
import ea.a;
import ea.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;

public final class k extends Lambda implements Function2 {
    public final State w;
    public final Function1 x;
    public final Function0 y;

    public k(State state0, Function1 function10, Function0 function00) {
        this.w = state0;
        this.x = function10;
        this.y = function00;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        BlurMenu blurMenu0;
        MosaicMenu mosaicMenu0;
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x56DC270D, v, -1, "com.kakao.kandinsky.mosaic.MosaicScreen.<anonymous> (MosaicScreen.kt:59)");
        }
        State state0 = this.w;
        float f = MosaicScreenKt.access$MosaicScreen$lambda$0(state0).getSelectedItemIntensity();
        boolean z = MosaicScreenKt.access$MosaicScreen$lambda$0(state0).getSelectedItem() != null;
        Function1 function10 = MosaicScreenKt.access$MosaicScreen$lambda$0(state0).getOnChangeIntensity();
        ClosedFloatingPointRange closedFloatingPointRange0 = e.rangeTo(0.0f, 100.0f);
        composer0.startReplaceGroup(-406400809);
        boolean z1 = composer0.changed(state0);
        c c0 = composer0.rememberedValue();
        if(z1 || c0 == Composer.Companion.getEmpty()) {
            c0 = new c(state0, 2);
            composer0.updateRememberedValue(c0);
        }
        composer0.endReplaceGroup();
        KDSliderKt.KDSlider(null, z, f * 100.0f, function10, 100.0f, c0, true, "%s", 0, closedFloatingPointRange0, composer0, 0x6D86000, 1);
        switch(MosaicScreenKt.access$MosaicScreen$lambda$0(state0).getViewType()) {
            case 1: {
                composer0.startReplaceGroup(-406400314);
                switch(MosaicScreenKt.access$MosaicScreen$lambda$0(state0).getSelectedMosaicType()) {
                    case 1: {
                        mosaicMenu0 = MosaicMenu.Circle;
                        break;
                    }
                    case 2: {
                        mosaicMenu0 = MosaicMenu.Rectangle;
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                MosaicMenuKt.MosaicMenu(mosaicMenu0, MosaicScreenKt.access$MosaicScreen$lambda$0(state0).getOnClickMosaicMenu(), composer0, 0);
                composer0.endReplaceGroup();
                break;
            }
            case 2: {
                composer0.startReplaceGroup(-406399906);
                switch(MosaicScreenKt.access$MosaicScreen$lambda$0(state0).getSelectedBlurType()) {
                    case 1: {
                        blurMenu0 = BlurMenu.Circle;
                        break;
                    }
                    case 2: {
                        blurMenu0 = BlurMenu.Rectangle;
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                BlurMenuKt.BlurMenu(blurMenu0, MosaicScreenKt.access$MosaicScreen$lambda$0(state0).getOnClickBlurMenu(), composer0, 0);
                composer0.endReplaceGroup();
                break;
            }
            default: {
                composer0.startReplaceGroup(-406399555);
                composer0.endReplaceGroup();
            }
        }
        composer0.startReplaceGroup(-406398845);
        boolean z2 = composer0.changed(state0);
        l l0 = composer0.rememberedValue();
        if(z2 || l0 == Composer.Companion.getEmpty()) {
            l0 = new l(state0, 20);
            composer0.updateRememberedValue(l0);
        }
        composer0.endReplaceGroup();
        composer0.startReplaceGroup(-406398515);
        boolean z3 = composer0.changed(state0);
        Function1 function11 = this.x;
        boolean z4 = composer0.changed(function11);
        Function0 function00 = this.y;
        boolean z5 = composer0.changed(function00);
        a a0 = composer0.rememberedValue();
        if((z3 | z4 | z5) != 0 || a0 == Composer.Companion.getEmpty()) {
            a0 = new a(function11, function00, state0, 1);
            composer0.updateRememberedValue(a0);
        }
        composer0.endReplaceGroup();
        FeatureBottomBarKt.CommonFeatureBottomBar(false, l0, a0, null, ComposableLambdaKt.rememberComposableLambda(0x5895ED1F, true, new j(state0), composer0, 54), composer0, 0x6000, 9);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

