package ea;

import aa.l;
import aa.w;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.core.kdphoto.Filter;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.designsystem.common.FunctionStateKt;
import com.kakao.kandinsky.designsystem.theme.OrientationKt;
import com.kakao.kandinsky.filter.FilterScreenKt.FilterScreen.3.WhenMappings;
import com.kakao.kandinsky.filter.FilterScreenKt;
import com.kakao.kandinsky.filter.contract.EffectMenu;
import com.kakao.kandinsky.filter.ui.EffectMenuKt;
import com.kakao.kandinsky.filter.ui.EffectSliderKt;
import com.kakao.kandinsky.filter.ui.FilterMenuKt;
import com.kakao.kandinsky.filter.ui.FilterSliderKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function2 {
    public final State w;
    public final Function1 x;
    public final Function0 y;
    public final Function2 z;

    public f(State state0, Function1 function10, Function0 function00, Function2 function20) {
        this.w = state0;
        this.x = function10;
        this.y = function00;
        this.z = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Composer composer0 = (Composer)object0;
        int v = ((Number)object1).intValue();
        if((v & 11) == 2 && composer0.getSkipping()) {
            composer0.skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xBB16ECE3, v, -1, "com.kakao.kandinsky.filter.FilterScreen.<anonymous> (FilterScreen.kt:45)");
        }
        State state0 = this.w;
        switch(FilterScreenKt.FilterScreen.3.WhenMappings.$EnumSwitchMapping$0[FilterScreenKt.access$FilterScreen$lambda$0(state0).getFeatureMenu().ordinal()]) {
            case 1: {
                composer0.startReplaceGroup(0x24FF6FC2);
                Effect effect0 = FilterScreenKt.access$FilterScreen$lambda$0(state0).getEffect();
                EffectMenu effectMenu0 = FilterScreenKt.access$FilterScreen$lambda$0(state0).getEffectMenu();
                composer0.startReplaceGroup(0x24FF7066);
                boolean z = composer0.changed(state0);
                w w0 = composer0.rememberedValue();
                if(z || w0 == Composer.Companion.getEmpty()) {
                    w0 = new w(state0, 6);
                    composer0.updateRememberedValue(w0);
                }
                composer0.endReplaceGroup();
                EffectMenuKt.EffectMenu(effect0, effectMenu0, w0, composer0, 0);
                EffectMenu effectMenu1 = FilterScreenKt.access$FilterScreen$lambda$0(state0).getEffectMenu();
                float f = FilterScreenKt.access$FilterScreen$lambda$0(state0).getEffectValue();
                composer0.startReplaceGroup(620720520);
                boolean z1 = composer0.changed(state0);
                w w1 = composer0.rememberedValue();
                if(z1 || w1 == Composer.Companion.getEmpty()) {
                    w1 = new w(state0, 7);
                    composer0.updateRememberedValue(w1);
                }
                composer0.endReplaceGroup();
                composer0.startReplaceGroup(0x24FF7207);
                boolean z2 = composer0.changed(state0);
                c c0 = composer0.rememberedValue();
                if(z2 || c0 == Composer.Companion.getEmpty()) {
                    c0 = new c(state0, 0);
                    composer0.updateRememberedValue(c0);
                }
                composer0.endReplaceGroup();
                EffectSliderKt.EffectSlider(effectMenu1, f, w1, c0, composer0, 0);
                composer0.endReplaceGroup();
                break;
            }
            case 2: {
                composer0.startReplaceGroup(0x24FF72F8);
                List list0 = FilterScreenKt.access$FilterScreen$lambda$0(state0).getFilterList();
                Filter filter0 = FilterScreenKt.access$FilterScreen$lambda$0(state0).getFilter();
                float f1 = FilterScreenKt.access$FilterScreen$lambda$0(state0).getFilterIntensity();
                composer0.startReplaceGroup(0x24FF73DF);
                boolean z3 = composer0.changed(state0);
                d d0 = composer0.rememberedValue();
                if(z3 || d0 == Composer.Companion.getEmpty()) {
                    d0 = new d(0, state0, null);
                    composer0.updateRememberedValue(d0);
                }
                composer0.endReplaceGroup();
                composer0.startReplaceGroup(0x24FF748E);
                boolean z4 = composer0.changed(state0);
                w w2 = composer0.rememberedValue();
                if(z4 || w2 == Composer.Companion.getEmpty()) {
                    w2 = new w(state0, 8);
                    composer0.updateRememberedValue(w2);
                }
                composer0.endReplaceGroup();
                FilterMenuKt.FilterMenu(list0, filter0, f1, d0, w2, composer0, 0x1008);
                Filter filter1 = FilterScreenKt.access$FilterScreen$lambda$0(state0).getFilter();
                float f2 = FilterScreenKt.access$FilterScreen$lambda$0(state0).getFilterIntensity();
                composer0.startReplaceGroup(0x24FF75BD);
                boolean z5 = composer0.changed(state0);
                w w3 = composer0.rememberedValue();
                if(z5 || w3 == Composer.Companion.getEmpty()) {
                    w3 = new w(state0, 9);
                    composer0.updateRememberedValue(w3);
                }
                composer0.endReplaceGroup();
                composer0.startReplaceGroup(0x24FF7640);
                boolean z6 = composer0.changed(state0);
                c c1 = composer0.rememberedValue();
                if(z6 || c1 == Composer.Companion.getEmpty()) {
                    c1 = new c(state0, 1);
                    composer0.updateRememberedValue(c1);
                }
                composer0.endReplaceGroup();
                FilterSliderKt.FilterSlider(filter1, f2, w3, c1, composer0, 0);
                composer0.endReplaceGroup();
                break;
            }
            default: {
                composer0.startReplaceGroup(0x24FF7708);
                composer0.endReplaceGroup();
            }
        }
        SpacerKt.Spacer(OrientationKt.byOrientation(Modifier.Companion, e.x, e.y), composer0, 0);
        boolean z7 = FilterScreenKt.access$FilterScreen$lambda$0(state0).isSingleImage();
        composer0.startReplaceGroup(0x24FF7B8F);
        boolean z8 = composer0.changed(state0);
        l l0 = composer0.rememberedValue();
        if(z8 || l0 == Composer.Companion.getEmpty()) {
            l0 = new l(state0, 12);
            composer0.updateRememberedValue(l0);
        }
        composer0.endReplaceGroup();
        Function0 function00 = FunctionStateKt.skippableLambda(l0, composer0, 0);
        composer0.startReplaceGroup(0x24FF7C4A);
        boolean z9 = composer0.changed(state0);
        Function1 function10 = this.x;
        boolean z10 = composer0.changed(function10);
        Function0 function01 = this.y;
        boolean z11 = composer0.changed(function01);
        a a0 = composer0.rememberedValue();
        if((z9 | z10 | z11) != 0 || a0 == Composer.Companion.getEmpty()) {
            a0 = new a(function10, function01, state0, 0);
            composer0.updateRememberedValue(a0);
        }
        composer0.endReplaceGroup();
        Function0 function02 = FunctionStateKt.skippableLambda(a0, composer0, 0);
        composer0.startReplaceGroup(0x24FF7D31);
        boolean z12 = composer0.changed(state0);
        Function2 function20 = this.z;
        boolean z13 = composer0.changed(function20);
        b b0 = composer0.rememberedValue();
        if(z12 || z13 || b0 == Composer.Companion.getEmpty()) {
            b0 = new b(function20, state0, 0);
            composer0.updateRememberedValue(b0);
        }
        composer0.endReplaceGroup();
        FeatureBottomBarKt.CommonFeatureBottomBar(z7, function00, function02, FunctionStateKt.skippableLambda(b0, composer0, 0), ComposableLambdaKt.rememberComposableLambda(0x3E5C475, true, new com.kakao.kandinsky.filter.a(state0), composer0, 54), composer0, 0x6000, 0);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

