package sa;

import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureIntent.OnTextEditorClose;
import com.kakao.kandinsky.signature.contract.SignatureUiState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class s extends Lambda implements Function0 {
    public final SignatureVieModel w;
    public final SignatureUiState x;

    public s(SignatureVieModel signatureVieModel0, SignatureUiState signatureUiState0) {
        this.w = signatureVieModel0;
        this.x = signatureUiState0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        OnTextEditorClose signatureIntent$OnTextEditorClose0 = new OnTextEditorClose(this.x.getState());
        this.w.sendIntent(signatureIntent$OnTextEditorClose0);
        return Unit.INSTANCE;
    }
}

