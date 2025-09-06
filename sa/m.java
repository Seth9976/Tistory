package sa;

import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureIntent.ChangeSignature;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class m extends Lambda implements Function1 {
    public final SignatureVieModel w;

    public m(SignatureVieModel signatureVieModel0) {
        this.w = signatureVieModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Signature)object0), "it");
        ChangeSignature signatureIntent$ChangeSignature0 = new ChangeSignature(((Signature)object0));
        this.w.sendIntent(signatureIntent$ChangeSignature0);
        return Unit.INSTANCE;
    }
}

