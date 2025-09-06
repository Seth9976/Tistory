package sa;

import com.kakao.kandinsky.core.kdphoto.TextData;
import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureIntent.UpdateTextSignature;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class r extends Lambda implements Function2 {
    public final SignatureVieModel w;

    public r(SignatureVieModel signatureVieModel0) {
        this.w = signatureVieModel0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(((TextData)object0), "textData");
        UpdateTextSignature signatureIntent$UpdateTextSignature0 = new UpdateTextSignature(false, ((TextData)object0), ((Boolean)object1).booleanValue());
        this.w.sendIntent(signatureIntent$UpdateTextSignature0);
        return Unit.INSTANCE;
    }
}

