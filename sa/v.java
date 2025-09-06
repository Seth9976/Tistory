package sa;

import androidx.compose.ui.geometry.Rect;
import com.kakao.kandinsky.signature.SignatureVieModel;
import com.kakao.kandinsky.signature.contract.SignatureIntent.UpdateContentBounds;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class v extends Lambda implements Function1 {
    public final SignatureVieModel w;

    public v(SignatureVieModel signatureVieModel0) {
        this.w = signatureVieModel0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Rect)object0), "it");
        UpdateContentBounds signatureIntent$UpdateContentBounds0 = new UpdateContentBounds(((Rect)object0));
        this.w.sendIntent(signatureIntent$UpdateContentBounds0);
        return Unit.INSTANCE;
    }
}

