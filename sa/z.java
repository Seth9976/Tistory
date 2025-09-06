package sa;

import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureIntent.OnClickMenuImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class z extends Lambda implements Function0 {
    public final SignatureVieModel w;

    public z(SignatureVieModel signatureVieModel0) {
        this.w = signatureVieModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.sendIntent(OnClickMenuImage.INSTANCE);
        return Unit.INSTANCE;
    }
}

