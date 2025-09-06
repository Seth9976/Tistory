package za;

import com.kakao.kandinsky.text.TextViewModel;
import com.kakao.kandinsky.text.contract.TextIntent.ChangeModeToControl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function0 {
    public final TextViewModel w;

    public d(TextViewModel textViewModel0) {
        this.w = textViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.sendIntent(ChangeModeToControl.INSTANCE);
        return Unit.INSTANCE;
    }
}

