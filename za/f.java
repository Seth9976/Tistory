package za;

import com.kakao.kandinsky.text.TextViewModel;
import com.kakao.kandinsky.text.contract.TextIntent.RemoveAllDeco;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class f extends Lambda implements Function0 {
    public final TextViewModel w;

    public f(TextViewModel textViewModel0) {
        this.w = textViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.sendIntent(RemoveAllDeco.INSTANCE);
        return Unit.INSTANCE;
    }
}

