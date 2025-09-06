package ea;

import androidx.compose.runtime.State;
import com.kakao.kandinsky.border.BorderScreenKt;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.filter.FilterScreenKt.FilterScreen.3.12.1.WhenMappings;
import com.kakao.kandinsky.filter.FilterScreenKt;
import com.kakao.kandinsky.filter.contract.FeatureMenu;
import com.kakao.kandinsky.filter.contract.FilterTracker;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import com.kakao.kdtracker.KDTracker;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final int w;
    public final Function2 x;
    public final State y;

    public b(Function2 function20, State state0, int v) {
        this.w = v;
        this.x = function20;
        this.y = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s;
        switch(this.w) {
            case 0: {
                FeatureMenu featureMenu0 = FilterScreenKt.access$FilterScreen$lambda$0(this.y).getFeatureMenu();
                FilterTracker.INSTANCE.multiConfirmClickEvent(featureMenu0);
                KDPhoto kDPhoto1 = FilterScreenKt.access$FilterScreen$lambda$0(this.y).getPhoto();
                switch(FilterScreenKt.FilterScreen.3.12.1.WhenMappings.$EnumSwitchMapping$0[FilterScreenKt.access$FilterScreen$lambda$0(this.y).getFeatureMenu().ordinal()]) {
                    case 1: {
                        s = "filter";
                        break;
                    }
                    case 2: {
                        s = "retouch";
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                this.x.invoke(kDPhoto1, s);
                return Unit.INSTANCE;
            }
            case 1: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "size-tab", "size-tab", null, "applymultiple", 4, null);
                KDPhoto kDPhoto2 = ReSizeScreenKt.access$ResizeScreen$lambda$0(this.y).getPhoto();
                this.x.invoke(kDPhoto2, "size");
                return Unit.INSTANCE;
            }
            default: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "frame-tab", "frame-tab", null, "applymultiple", 4, null);
                KDPhoto kDPhoto0 = BorderScreenKt.access$BorderScreen$lambda$0(this.y).getPhoto();
                this.x.invoke(kDPhoto0, "frame");
                return Unit.INSTANCE;
            }
        }
    }
}

