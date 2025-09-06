package t9;

import com.kakao.kandinsky.border.BorderViewModel;
import com.kakao.kandinsky.border.contract.BorderIntent.Cancel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final BorderViewModel w;

    public f(BorderViewModel borderViewModel0) {
        this.w = borderViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.sendIntent(Cancel.INSTANCE);
        return Unit.INSTANCE;
    }
}

