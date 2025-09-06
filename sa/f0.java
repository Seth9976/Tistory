package sa;

import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureIntent.UpdateImageSignature;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class f0 extends Lambda implements Function1 {
    public final SignatureVieModel w;

    public f0(SignatureVieModel signatureVieModel0) {
        this.w = signatureVieModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((String)object0), "it");
        UpdateImageSignature signatureIntent$UpdateImageSignature0 = new UpdateImageSignature(((String)object0));
        this.w.sendIntent(signatureIntent$UpdateImageSignature0);
        return Unit.INSTANCE;
    }
}

