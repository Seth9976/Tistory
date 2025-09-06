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

public final class j extends Lambda implements Function0 {
    public final State w;

    public j(State state0) {
        this.w = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s;
        KDTracker kDTracker0 = KDTracker.INSTANCE;
        State state0 = this.w;
        SignatureState signatureState0 = SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getState();
        if(Intrinsics.areEqual(signatureState0, Image.INSTANCE)) {
            s = "complete-imagesignature";
        }
        else {
            s = Intrinsics.areEqual(signatureState0, Text.INSTANCE) ? "complete-textsignature" : "complete-history";
        }
        KDTracker.clickEvent$default(kDTracker0, "sign-tab", s, null, null, 12, null);
        SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getOnClickConfirm().invoke();
        return Unit.INSTANCE;
    }
}

