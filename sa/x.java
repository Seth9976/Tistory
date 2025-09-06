package sa;

import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.core.kdphoto.Signature;
import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureEvent.UpdateMultipleConfirm;
import com.kakao.kandinsky.signature.contract.SignatureUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class x extends Lambda implements Function1 {
    public final SignatureVieModel w;
    public final SignatureUiState x;

    public x(SignatureVieModel signatureVieModel0, SignatureUiState signatureUiState0) {
        this.w = signatureVieModel0;
        this.x = signatureUiState0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        UpdateMultipleConfirm signatureEvent$UpdateMultipleConfirm0 = new UpdateMultipleConfirm(KDPhoto.copy-2Ycw6ww$default(this.x.getPhoto(), null, 0, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, ((Signature)object0), 0x1FFF, null));
        this.w.sendEvent(signatureEvent$UpdateMultipleConfirm0);
        return Unit.INSTANCE;
    }
}

