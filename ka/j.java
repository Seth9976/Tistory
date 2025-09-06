package ka;

import aa.l;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.feature.mosaic.R.string;
import com.kakao.kandinsky.designsystem.common.FeatureBottomBarKt;
import com.kakao.kandinsky.mosaic.MosaicScreenKt;
import com.kakao.kandinsky.mosaic.ViewType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class j extends Lambda implements Function2 {
    public final State w;

    public j(State state0) {
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
            ComposerKt.traceEventStart(0x5895ED1F, v, -1, "com.kakao.kandinsky.mosaic.MosaicScreen.<anonymous>.<anonymous> (MosaicScreen.kt:100)");
        }
        String s = StringResources_androidKt.stringResource(string.menu_mosaic, ((Composer)object0), 0);
        State state0 = this.w;
        boolean z = MosaicScreenKt.access$MosaicScreen$lambda$0(state0).getViewType() == ViewType.Mosaic;
        ((Composer)object0).startReplaceGroup(1011828106);
        boolean z1 = ((Composer)object0).changed(state0);
        l l0 = ((Composer)object0).rememberedValue();
        if(z1 || l0 == Composer.Companion.getEmpty()) {
            l0 = new l(state0, 21);
            ((Composer)object0).updateRememberedValue(l0);
        }
        ((Composer)object0).endReplaceGroup();
        FeatureBottomBarKt.BottomBarFeatureTypeText(s, false, z, l0, ((Composer)object0), 0, 2);
        String s1 = StringResources_androidKt.stringResource(string.menu_blur, ((Composer)object0), 0);
        boolean z2 = MosaicScreenKt.access$MosaicScreen$lambda$0(state0).getViewType() == ViewType.Blur;
        ((Composer)object0).startReplaceGroup(0x3C4F46AF);
        boolean z3 = ((Composer)object0).changed(state0);
        l l1 = ((Composer)object0).rememberedValue();
        if(z3 || l1 == Composer.Companion.getEmpty()) {
            l1 = new l(state0, 22);
            ((Composer)object0).updateRememberedValue(l1);
        }
        ((Composer)object0).endReplaceGroup();
        FeatureBottomBarKt.BottomBarFeatureTypeText(s1, false, z2, l1, ((Composer)object0), 0, 2);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

