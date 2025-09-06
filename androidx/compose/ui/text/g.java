package androidx.compose.ui.text;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;

public final class g extends Lambda implements Function1 {
    public final ObjectRef w;
    public final Function3 x;
    public final AnnotatedString y;
    public final Map z;

    public g(ObjectRef ref$ObjectRef0, Function3 function30, AnnotatedString annotatedString0, Map map0) {
        this.w = ref$ObjectRef0;
        this.x = function30;
        this.y = annotatedString0;
        this.z = map0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        int v = ((Number)((List)object0).get(0)).intValue();
        int v1 = ((Number)((List)object0).get(1)).intValue();
        this.w.element = ((String)this.w.element) + ((String)this.x.invoke(this.y.getText(), v, v1));
        return (Integer)this.z.put(v1, ((String)this.w.element).length());
    }
}

