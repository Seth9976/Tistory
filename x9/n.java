package x9;

import androidx.compose.ui.geometry.Offset;
import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.crop.contract.CropIntent.OnDrag;
import com.kakao.kandinsky.crop.contract.TouchDragPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function2 {
    public final CropViewModel w;

    public n(CropViewModel cropViewModel0) {
        this.w = cropViewModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((TouchDragPoint)object1), "touchPoint");
        OnDrag cropIntent$OnDrag0 = new OnDrag(((Offset)object0).unbox-impl(), ((TouchDragPoint)object1), null);
        this.w.sendIntent(cropIntent$OnDrag0);
        return Unit.INSTANCE;
    }
}

