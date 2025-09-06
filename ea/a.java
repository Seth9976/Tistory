package ea;

import androidx.compose.runtime.State;
import com.kakao.kandinsky.border.BorderScreenKt;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.filter.FilterScreenKt;
import com.kakao.kandinsky.filter.contract.FeatureMenu;
import com.kakao.kandinsky.filter.contract.FilterTracker;
import com.kakao.kandinsky.mosaic.MosaicScreenKt;
import com.kakao.kandinsky.mosaic.ViewType;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function0 {
    public final int w;
    public final Function1 x;
    public final Function0 y;
    public final State z;

    public a(Function1 function10, Function0 function00, State state0, int v) {
        this.w = v;
        this.x = function10;
        this.y = function00;
        this.z = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                FeatureMenu featureMenu0 = FilterScreenKt.access$FilterScreen$lambda$0(this.z).getFeatureMenu();
                FilterTracker.INSTANCE.confirmClickEvent(featureMenu0);
                KDPhoto kDPhoto1 = FilterScreenKt.access$FilterScreen$lambda$0(this.z).getPhoto();
                this.x.invoke(kDPhoto1);
                this.y.invoke();
                return Unit.INSTANCE;
            }
            case 1: {
                String s = MosaicScreenKt.access$MosaicScreen$lambda$0(this.z).getViewType() == ViewType.Mosaic ? "complete-mosaic" : "complete-blur";
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", s, null, null, 12, null);
                KDPhoto kDPhoto2 = MosaicScreenKt.access$MosaicScreen$lambda$0(this.z).getPhoto();
                this.x.invoke(kDPhoto2);
                this.y.invoke();
                return Unit.INSTANCE;
            }
            case 2: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", "complete-size", null, null, 12, null);
                KDPhoto kDPhoto3 = ReSizeScreenKt.access$ResizeScreen$lambda$0(this.z).getPhoto();
                this.x.invoke(kDPhoto3);
                this.y.invoke();
                return Unit.INSTANCE;
            }
            default: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", "complete-frame", null, null, 12, null);
                KDPhoto kDPhoto0 = BorderScreenKt.access$BorderScreen$lambda$0(this.z).getPhoto();
                this.x.invoke(kDPhoto0);
                this.y.invoke();
                return Unit.INSTANCE;
            }
        }
    }
}

