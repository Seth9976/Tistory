package sa;

import androidx.compose.runtime.State;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.signature.SignatureScreenKt;
import com.kakao.kandinsky.signature.contract.SignatureState.Image;
import com.kakao.kandinsky.signature.contract.SignatureState.Text;
import com.kakao.kandinsky.signature.contract.SignatureState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class d extends Lambda implements Function1 {
    public final Function2 w;
    public final State x;

    public d(Function2 function20, State state0) {
        this.w = function20;
        this.x = state0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((KDPhoto)object0), "it");
        State state0 = this.x;
        SignatureState signatureState0 = SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getState();
        if(Intrinsics.areEqual(signatureState0, Image.INSTANCE)) {
            this.w.invoke(((KDPhoto)object0), "imagesignature");
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(signatureState0, Text.INSTANCE)) {
            com.kakao.kandinsky.core.kdphoto.Signature.Text signature$Text0 = SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getSavedTextSignature();
            this.w.invoke(((KDPhoto)object0), (signature$Text0 == null || !signature$Text0.getWatermark() ? "textsignature" : "textwatermark"));
        }
        return Unit.INSTANCE;
    }
}

