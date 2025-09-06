package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class CollectionsKt__IteratorsJVMKt extends l {
    @NotNull
    public static final Iterator iterator(@NotNull Enumeration enumeration0) {
        Intrinsics.checkNotNullParameter(enumeration0, "<this>");
        return new Object() {
            public final Enumeration a;

            {
                Enumeration enumeration0 = enumeration0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = enumeration0;
            }

            @Override
            public boolean hasNext() {
                return this.a.hasMoreElements();
            }

            @Override
            public Object next() {
                return this.a.nextElement();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}

