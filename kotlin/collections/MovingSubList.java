package kotlin.collections;

import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\r\u001A\u00020\f2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t¢\u0006\u0004\b\r\u0010\u000EJ\u0018\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u000F\u001A\u00020\tH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001A\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lkotlin/collections/MovingSubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "list", "<init>", "(Ljava/util/List;)V", "", "fromIndex", "toIndex", "", "move", "(II)V", "index", "get", "(I)Ljava/lang/Object;", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MovingSubList extends AbstractList implements RandomAccess {
    public final List a;
    public int b;
    public int c;

    public MovingSubList(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "list");
        super();
        this.a = list0;
    }

    @Override  // kotlin.collections.AbstractList
    public Object get(int v) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.c);
        return this.a.get(this.b + v);
    }

    @Override  // kotlin.collections.AbstractList
    public int getSize() {
        return this.c;
    }

    public final void move(int v, int v1) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, this.a.size());
        this.b = v;
        this.c = v1 - v;
    }
}

