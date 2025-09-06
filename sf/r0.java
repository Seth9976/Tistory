package sf;

import kotlin.coroutines.CoroutineContext.Element.DefaultImpls;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

public final class r0 implements Element, Key {
    public static final r0 a;

    static {
        r0.a = new r0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public final Object fold(Object object0, Function2 function20) {
        return DefaultImpls.fold(this, object0, function20);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public final Element get(Key coroutineContext$Key0) {
        return DefaultImpls.get(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public final Key getKey() {
        return this;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    public final CoroutineContext minusKey(Key coroutineContext$Key0) {
        return DefaultImpls.minusKey(this, coroutineContext$Key0);
    }

    @Override  // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext0) {
        return DefaultImpls.plus(this, coroutineContext0);
    }
}

