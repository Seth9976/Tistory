package ga;

import aa.m;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.kakao.kandinsky.designsystem.common.MenuButtonKt;
import com.kakao.kandinsky.home.contract.HomeMenu;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final int w;
    public final List x;
    public final Function1 y;

    public c(List list0, Function1 function10) {
        this.w = 1;
        this.x = list0;
        this.y = function10;
        super(2);
    }

    public c(Function1 function10, List list0) {
        this.w = 0;
        this.y = function10;
        this.x = list0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(this.w != 0) {
            int v = ((Number)object1).intValue();
            if((v & 11) == 2 && ((Composer)object0).getSkipping()) {
                ((Composer)object0).skipToGroupEnd();
                return Unit.INSTANCE;
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x965E87DD, v, -1, "com.kakao.kandinsky.home.BottomBar.<anonymous> (HomeScreen.kt:210)");
            }
            for(Object object2: this.x) {
                HomeMenu homeMenu0 = (HomeMenu)object2;
                String s = StringResources_androidKt.stringResource(homeMenu0.getTitle(), ((Composer)object0), 0);
                int v1 = homeMenu0.getIcon();
                ((Composer)object0).startReplaceGroup(0x2405DC3E);
                Function1 function10 = this.y;
                boolean z = ((Composer)object0).changed(function10);
                boolean z1 = ((Composer)object0).changed(homeMenu0);
                m m0 = ((Composer)object0).rememberedValue();
                if(z || z1 || m0 == Composer.Companion.getEmpty()) {
                    m0 = new m(27, function10, homeMenu0);
                    ((Composer)object0).updateRememberedValue(m0);
                }
                ((Composer)object0).endReplaceGroup();
                MenuButtonKt.MenuIconTextButton(v1, s, m0, ((Composer)object0), 0);
            }
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
        ((Boolean)object0).booleanValue();
        Object object3 = this.x.get(((Number)object1).intValue());
        this.y.invoke(object3);
        return Unit.INSTANCE;
    }
}

