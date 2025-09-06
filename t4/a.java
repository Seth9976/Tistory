package t4;

import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.PagingPlaceholderContentType;
import androidx.paging.compose.PagingPlaceholderKey_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class a extends Lambda implements Function1 {
    public final int w;
    public final Function1 x;
    public final LazyPagingItems y;

    public a(Function1 function10, LazyPagingItems lazyPagingItems0, int v) {
        this.w = v;
        this.x = function10;
        this.y = lazyPagingItems0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(this.w != 0) {
            int v = ((Number)object0).intValue();
            Function1 function10 = this.x;
            if(function10 == null) {
                return PagingPlaceholderKey_androidKt.getPagingPlaceholderKey(v);
            }
            Object object1 = this.y.peek(v);
            return object1 == null ? PagingPlaceholderKey_androidKt.getPagingPlaceholderKey(v) : function10.invoke(object1);
        }
        int v1 = ((Number)object0).intValue();
        Function1 function11 = this.x;
        if(function11 == null) {
            return null;
        }
        Object object2 = this.y.peek(v1);
        return object2 == null ? PagingPlaceholderContentType.INSTANCE : function11.invoke(object2);
    }
}

