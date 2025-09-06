package a;

import com.kakao.kandinsky.preview.PreviewAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class h1 extends FunctionReferenceImpl implements Function1 {
    public h1(Object object0) {
        super(1, object0, PreviewAnimator.class, "enable", "enable(Z)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        ((PreviewAnimator)this.receiver).enable(((Boolean)object0).booleanValue());
        return Unit.INSTANCE;
    }
}

