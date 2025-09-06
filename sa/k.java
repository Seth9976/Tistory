package sa;

import androidx.compose.runtime.State;
import com.kakao.kandinsky.signature.SignatureScreenKt;
import com.kakao.kandinsky.signature.contract.SignatureState.Image;
import com.kakao.kandinsky.signature.contract.SignatureState.Text;
import com.kakao.kandinsky.signature.contract.SignatureState;
import com.kakao.kdtracker.KDTracker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class k extends Lambda implements Function0 {
    public final State w;

    public k(State state0) {
        this.w = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        State state0 = this.w;
        SignatureState signatureState0 = SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getState();
        if(Intrinsics.areEqual(signatureState0, Image.INSTANCE)) {
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "sign-tab", "image-tab", null, "applymultiple", 4, null);
            SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getOnClickMultipleConfirm().invoke();
            return Unit.INSTANCE;
        }
        if(Intrinsics.areEqual(signatureState0, Text.INSTANCE)) {
            KDTracker.clickEvent$default(KDTracker.INSTANCE, "sign-tab", "text-tab", null, "applymultiple", 4, null);
            SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getOnClickMultipleConfirm().invoke();
        }
        return Unit.INSTANCE;
    }
}

