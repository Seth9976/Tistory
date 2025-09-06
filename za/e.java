package za;

import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.text.TextViewModel;
import com.kakao.kandinsky.text.contract.TextIntent.UpdateTextData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final TextViewModel w;

    public e(TextViewModel textViewModel0) {
        this.w = textViewModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        UpdateTextData textIntent$UpdateTextData0 = new UpdateTextData(((TextData)object0));
        this.w.sendIntent(textIntent$UpdateTextData0);
        return Unit.INSTANCE;
    }
}

