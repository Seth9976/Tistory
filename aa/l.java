package aa;

import androidx.compose.foundation.lazy.LazyListIntervalContent;
import androidx.compose.foundation.lazy.grid.LazyGridIntervalContent;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemProvider;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.selection.SelectionMagnifierKt;
import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.NavHostKt;
import com.kakao.kandinsky.border.BorderScreenKt;
import com.kakao.kandinsky.decoration.DecorationBoxKt;
import com.kakao.kandinsky.filter.FilterScreenKt;
import com.kakao.kandinsky.filter.contract.FeatureMenu;
import com.kakao.kandinsky.filter.contract.FilterTracker;
import com.kakao.kandinsky.mosaic.MosaicScreenKt;
import com.kakao.kandinsky.mosaic.ViewType;
import com.kakao.kandinsky.resize.ReSizeScreenKt;
import com.kakao.kandinsky.textedit.ui.TextInputKt;
import com.kakao.kdtracker.KDTracker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class l extends Lambda implements Function0 {
    public final int w;
    public final State x;

    public l(State state0, int v) {
        this.w = v;
        this.x = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return Offset.box-impl(Offset.minus-MK-Hz9U(DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$11(this.x).getTransition-F1C5BW0(), DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$11(this.x).getControlVector-F1C5BW0()));
            }
            case 1: {
                return Offset.box-impl(Offset.plus-MK-Hz9U(DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$11(this.x).getTransition-F1C5BW0(), DecorationBoxKt.access$BasicDecorationBox_vzil_yM$lambda$11(this.x).getControlVector-F1C5BW0()));
            }
            case 2: {
                return Offset.box-impl(((Offset)this.x.getValue()).unbox-impl());
            }
            case 3: {
                return Offset.box-impl(SelectionMagnifierKt.access$rememberAnimatedMagnifierPosition$lambda$1(this.x));
            }
            case 4: {
                return (Float)this.x.getValue();
            }
            case 5: {
                return (Float)this.x.getValue();
            }
            case 6: {
                return (Float)this.x.getValue();
            }
            case 7: {
                return new LazyListIntervalContent(((Function1)this.x.getValue()));
            }
            case 8: {
                return new LazyGridIntervalContent(((Function1)this.x.getValue()));
            }
            case 9: {
                return (LazyLayoutItemProvider)((Function0)this.x.getValue()).invoke();
            }
            case 10: {
                return new LazyStaggeredGridIntervalContent(((Function1)this.x.getValue()));
            }
            case 11: {
                FilterScreenKt.access$FilterScreen$lambda$0(this.x).getOnClickCancel().invoke();
                return Unit.INSTANCE;
            }
            case 12: {
                FeatureMenu featureMenu0 = FilterScreenKt.access$FilterScreen$lambda$0(this.x).getFeatureMenu();
                FilterTracker.INSTANCE.cancelClickEvent(featureMenu0);
                FilterScreenKt.access$FilterScreen$lambda$0(this.x).getOnClickCancel().invoke();
                return Unit.INSTANCE;
            }
            case 13: {
                FilterScreenKt.access$FilterScreen$lambda$0(this.x).getOnClickFeatureMenu().invoke(FeatureMenu.Filter);
                return Unit.INSTANCE;
            }
            case 14: {
                FilterScreenKt.access$FilterScreen$lambda$0(this.x).getOnClickFeatureMenu().invoke(FeatureMenu.Effect);
                return Unit.INSTANCE;
            }
            case 15: {
                return Boolean.valueOf(TextInputKt.access$TextInput_ca1Bfew$lambda$1(this.x));
            }
            case 16: {
                return Boolean.valueOf(CoreTextFieldKt.access$CoreTextField$lambda$11(this.x));
            }
            case 17: {
                MosaicScreenKt.access$MosaicScreen$lambda$0(this.x).getOnClickCancel().invoke();
                return Unit.INSTANCE;
            }
            case 18: {
                return MosaicScreenKt.access$MosaicScreen$lambda$0(this.x).getPhoto();
            }
            case 19: {
                return MosaicScreenKt.access$MosaicScreen$lambda$0(this.x).getSelectedNo();
            }
            case 20: {
                String s = MosaicScreenKt.access$MosaicScreen$lambda$0(this.x).getViewType() == ViewType.Mosaic ? "cancel-mosaic" : "cancel-blur";
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", s, null, null, 12, null);
                MosaicScreenKt.access$MosaicScreen$lambda$0(this.x).getOnClickCancel().invoke();
                return Unit.INSTANCE;
            }
            case 21: {
                MosaicScreenKt.access$MosaicScreen$lambda$0(this.x).getOnChangeViewType().invoke(ViewType.Mosaic);
                return Unit.INSTANCE;
            }
            case 22: {
                MosaicScreenKt.access$MosaicScreen$lambda$0(this.x).getOnChangeViewType().invoke(ViewType.Blur);
                return Unit.INSTANCE;
            }
            case 23: {
                Iterable iterable0 = NavHostKt.access$NavHost$lambda$15(this.x);
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    if(Intrinsics.areEqual(((NavBackStackEntry)object0).getDestination().getNavigatorName(), "composable")) {
                        arrayList0.add(object0);
                    }
                }
                return arrayList0;
            }
            case 24: {
                ((Function0)this.x.getValue()).invoke();
                return Unit.INSTANCE;
            }
            case 25: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", "cancel-size", null, null, 12, null);
                ReSizeScreenKt.access$ResizeScreen$lambda$0(this.x).getOnBackPressed().invoke();
                return Unit.INSTANCE;
            }
            case 26: {
                BorderScreenKt.access$BorderScreen$lambda$0(this.x).getOnClickCancel().invoke();
                return Unit.INSTANCE;
            }
            case 27: {
                KDTracker.clickEvent$default(KDTracker.INSTANCE, "footer", "cancel-frame", null, null, 12, null);
                BorderScreenKt.access$BorderScreen$lambda$0(this.x).getOnClickCancel().invoke();
                return Unit.INSTANCE;
            }
            case 28: {
                return (RippleAlpha)this.x.getValue();
            }
            default: {
                return ((Number)this.x.getValue()).floatValue() > 0.0f;
            }
        }
    }
}

