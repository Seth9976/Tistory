package ga;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import com.kakao.kandinsky.core.kdphoto.Effect;
import com.kakao.kandinsky.filter.contract.EffectMenu;
import com.kakao.kandinsky.filter.contract.MenuKt;
import com.kakao.kandinsky.filter.ui.EffectMenuKt.EffectMenu.3.WhenMappings;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import zd.c;

public final class b extends Lambda implements Function4 {
    public final Effect w;

    public b(Effect effect0) {
        this.w = effect0;
        super(4);
    }

    @Override  // kotlin.jvm.functions.Function4
    public final Object invoke(Object object0, Object object1, Object object2, Object object3) {
        long v4;
        float f;
        boolean z = ((Boolean)object0).booleanValue();
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 14) == 0 ? (((Composer)object2).changed(z) ? 4 : 2) | v1 : v1;
        if((v1 & 0x70) == 0) {
            v2 |= (((Composer)object2).changed(v) ? 0x20 : 16);
        }
        if((v2 & 731) == 0x92 && ((Composer)object2).getSkipping()) {
            ((Composer)object2).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB82611B1, v2, -1, "com.kakao.kandinsky.filter.ui.EffectMenu.<anonymous> (EffectMenu.kt:31)");
        }
        EffectMenu effectMenu0 = (EffectMenu)MenuKt.getEffectMenuList().get(v);
        int v3 = EffectMenuKt.EffectMenu.3.WhenMappings.$EnumSwitchMapping$0[effectMenu0.ordinal()];
        Effect effect0 = this.w;
        switch(v3) {
            case 1: {
                f = effect0.getBrightness();
                break;
            }
            case 2: {
                f = effect0.getContrast();
                break;
            }
            case 3: {
                f = effect0.getSaturation();
                break;
            }
            case 4: {
                f = effect0.getTemperature();
                break;
            }
            default: {
                if(v3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                f = effect0.getVignette();
                break;
            }
        }
        float f1 = ((Number)effectMenu0.getRange().getEndInclusive()).floatValue() * f;
        if(!z || f1 == 0.0f) {
            ((Composer)object2).startReplaceGroup(-373989034);
            Painter painter0 = PainterResources_androidKt.painterResource(effectMenu0.getIcon(), ((Composer)object2), 0);
            Modifier modifier0 = SizeKt.size-3ABfNKs(Modifier.Companion, 28.0f);
            if(f1 == 0.0f) {
                ((Composer)object2).startReplaceGroup(0xE9B5624D);
                v4 = MaterialTheme.INSTANCE.getColorScheme(((Composer)object2), MaterialTheme.$stable).getSecondary-0d7_KjU();
            }
            else {
                ((Composer)object2).startReplaceGroup(0xE9B5628A);
                v4 = MaterialTheme.INSTANCE.getColorScheme(((Composer)object2), MaterialTheme.$stable).getPrimary-0d7_KjU();
            }
            ((Composer)object2).endReplaceGroup();
            IconKt.Icon-ww6aTOc(painter0, null, modifier0, v4, ((Composer)object2), 440, 0);
        }
        else {
            ((Composer)object2).startReplaceGroup(0xE9B56052);
            String s = String.valueOf(c.roundToInt(f1));
            TextStyle textStyle0 = MaterialTheme.INSTANCE.getTypography(((Composer)object2), MaterialTheme.$stable).getHeadlineMedium();
            TextKt.Text--4IGK_g(s, null, MaterialTheme.INSTANCE.getColorScheme(((Composer)object2), MaterialTheme.$stable).getSecondary-0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle0, ((Composer)object2), 0, 0, 0xFFFA);
        }
        ((Composer)object2).endReplaceGroup();
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

