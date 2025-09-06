package x9;

import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.crop.contract.CropIntent.UpdateContentBounds;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final CropViewModel w;

    public i(CropViewModel cropViewModel0) {
        this.w = cropViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Rect)object0), "it");
        UpdateContentBounds cropIntent$UpdateContentBounds0 = new UpdateContentBounds(((Rect)object0));
        this.w.sendIntent(cropIntent$UpdateContentBounds0);
        return Unit.INSTANCE;
    }
}

