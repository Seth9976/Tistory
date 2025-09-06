package za;

import com.kakao.kandinsky.text.TextViewModel;
import com.kakao.kandinsky.text.contract.TextIntent.ChangeModeToInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function1 {
    public final TextViewModel w;

    public c(TextViewModel textViewModel0) {
        this.w = textViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ChangeModeToInput textIntent$ChangeModeToInput0 = new ChangeModeToInput(((Boolean)object0).booleanValue());
        this.w.sendIntent(textIntent$ChangeModeToInput0);
        return Unit.INSTANCE;
    }
}

