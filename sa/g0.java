package sa;

import com.kakao.kandinsky.base.contract.Destination;
import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureEvent.Go;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function0 {
    public final SignatureVieModel w;

    public g0(SignatureVieModel signatureVieModel0) {
        this.w = signatureVieModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Go signatureEvent$Go0 = new Go(Destination.HOME);
        this.w.sendEvent(signatureEvent$Go0);
        return Unit.INSTANCE;
    }
}

