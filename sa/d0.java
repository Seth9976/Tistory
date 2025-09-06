package sa;

import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureIntent.OnClickMultipleConfirm;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class d0 extends Lambda implements Function0 {
    public final SignatureVieModel w;

    public d0(SignatureVieModel signatureVieModel0) {
        this.w = signatureVieModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.sendIntent(OnClickMultipleConfirm.INSTANCE);
        return Unit.INSTANCE;
    }
}

