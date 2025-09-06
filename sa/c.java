package sa;

import androidx.compose.runtime.State;
import com.kakao.kandinsky.signature.SignatureScreenKt;
import com.kakao.kandinsky.signature.contract.SignatureState.TextEditor;
import com.kakao.kandinsky.signature.contract.SignatureState;
import com.kakao.kandinsky.utils.Logger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function0 {
    public final State w;

    public c(State state0) {
        this.w = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        State state0 = this.w;
        SignatureState signatureState0 = SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getState();
        Logger.INSTANCE.log("current State " + signatureState0);
        SignatureState signatureState1 = SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getState();
        Unit unit0 = null;
        TextEditor signatureState$TextEditor0 = signatureState1 instanceof TextEditor ? ((TextEditor)signatureState1) : null;
        if(signatureState$TextEditor0 != null) {
            Function0 function00 = signatureState$TextEditor0.getOnClose();
            if(function00 != null) {
                function00.invoke();
                unit0 = Unit.INSTANCE;
            }
        }
        if(unit0 == null) {
            SignatureScreenKt.access$SignatureScreen$lambda$0(state0).getOnClickCancel().invoke();
        }
        return Unit.INSTANCE;
    }
}

