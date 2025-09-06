package pa;

import com.kakao.kandinsky.resize.ResizeViewModel;
import com.kakao.kandinsky.resize.contract.ResizeIntent.ChangeWidth;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public final ResizeViewModel w;

    public x(ResizeViewModel resizeViewModel0) {
        this.w = resizeViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ChangeWidth resizeIntent$ChangeWidth0 = new ChangeWidth(((Number)object0).intValue());
        this.w.sendIntent(resizeIntent$ChangeWidth0);
        return Unit.INSTANCE;
    }
}

