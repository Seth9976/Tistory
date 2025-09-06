package sa;

import com.kakao.kandinsky.signature.contract.SignatureState.TextEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g extends Lambda implements Function0 {
    public final TextEditor w;

    public g(TextEditor signatureState$TextEditor0) {
        this.w = signatureState$TextEditor0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.w.getOnClose().invoke();
        return Unit.INSTANCE;
    }
}

