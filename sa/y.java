package sa;

import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureIntent.OnClickMenuText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class y extends Lambda implements Function0 {
    public final SignatureVieModel w;

    public y(SignatureVieModel signatureVieModel0) {
        this.w = signatureVieModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.sendIntent(OnClickMenuText.INSTANCE);
        return Unit.INSTANCE;
    }
}

