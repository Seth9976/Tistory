package sa;

import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureIntent.DeleteHistory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class n extends Lambda implements Function1 {
    public final SignatureVieModel w;

    public n(SignatureVieModel signatureVieModel0) {
        this.w = signatureVieModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        DeleteHistory signatureIntent$DeleteHistory0 = new DeleteHistory(((Number)object0).intValue());
        this.w.sendIntent(signatureIntent$DeleteHistory0);
        return Unit.INSTANCE;
    }
}

