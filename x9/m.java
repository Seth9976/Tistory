package x9;

import androidx.compose.ui.geometry.Offset;
import com.kakao.kandinsky.crop.CropViewModel;
import com.kakao.kandinsky.crop.contract.CropIntent.OnMove;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final CropViewModel w;

    public m(CropViewModel cropViewModel0) {
        this.w = cropViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        OnMove cropIntent$OnMove0 = new OnMove(((Offset)object0).unbox-impl(), null);
        this.w.sendIntent(cropIntent$OnMove0);
        return Unit.INSTANCE;
    }
}

