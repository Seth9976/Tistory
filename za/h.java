package za;

import com.kakao.kandinsky.text.TextViewModel;
import com.kakao.kandinsky.text.contract.TextIntent.Confirm;
import com.kakao.kandinsky.text.contract.TextIntent.SelectDecoText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function0 {
    public final TextViewModel w;

    public h(TextViewModel textViewModel0) {
        this.w = textViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SelectDecoText textIntent$SelectDecoText0 = new SelectDecoText(null);
        this.w.sendIntent(textIntent$SelectDecoText0);
        this.w.sendIntent(Confirm.INSTANCE);
        return Unit.INSTANCE;
    }
}

