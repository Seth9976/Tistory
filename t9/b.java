package t9;

import com.kakao.kandinsky.core.kdphoto.Border;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;

public final class b extends Lambda implements Function2 {
    public final Function1 w;
    public final ImmutableList x;

    public b(Function1 function10, ImmutableList immutableList0) {
        this.w = function10;
        this.x = immutableList0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        ((Boolean)object0).booleanValue();
        int v = ((Number)object1).intValue();
        Function1 function10 = this.w;
        if(v == 0) {
            function10.invoke(Border.Companion.getORIGIN());
            return Unit.INSTANCE;
        }
        Border border0 = (Border)CollectionsKt___CollectionsKt.getOrNull(this.x, v - 1);
        if(border0 != null) {
            function10.invoke(border0);
        }
        return Unit.INSTANCE;
    }
}

