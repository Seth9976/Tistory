package sa;

import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureIntent.OnChangeImageSignatureAlpha;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function1 {
    public final SignatureVieModel w;

    public e0(SignatureVieModel signatureVieModel0) {
        this.w = signatureVieModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        OnChangeImageSignatureAlpha signatureIntent$OnChangeImageSignatureAlpha0 = new OnChangeImageSignatureAlpha(((Number)object0).floatValue());
        this.w.sendIntent(signatureIntent$OnChangeImageSignatureAlpha0);
        return Unit.INSTANCE;
    }
}

