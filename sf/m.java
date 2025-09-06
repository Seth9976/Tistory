package sf;

import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlinx.coroutines.CopyableThreadContextElement;

public final class m extends Lambda implements Function2 {
    public final ObjectRef w;
    public final boolean x;

    public m(ObjectRef ref$ObjectRef0, boolean z) {
        this.w = ref$ObjectRef0;
        this.x = z;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        if(!(((Element)object1) instanceof CopyableThreadContextElement)) {
            return ((CoroutineContext)object0).plus(((Element)object1));
        }
        ObjectRef ref$ObjectRef0 = this.w;
        Element coroutineContext$Element0 = ((CoroutineContext)ref$ObjectRef0.element).get(((Element)object1).getKey());
        if(coroutineContext$Element0 == null) {
            CopyableThreadContextElement copyableThreadContextElement0 = (CopyableThreadContextElement)(((Element)object1));
            if(this.x) {
                copyableThreadContextElement0 = copyableThreadContextElement0.copyForChild();
            }
            return ((CoroutineContext)object0).plus(copyableThreadContextElement0);
        }
        ref$ObjectRef0.element = ((CoroutineContext)ref$ObjectRef0.element).minusKey(((Element)object1).getKey());
        return ((CoroutineContext)object0).plus(((CopyableThreadContextElement)(((Element)object1))).mergeForChild(coroutineContext$Element0));
    }
}

