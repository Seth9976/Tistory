package androidx.paging;

import a5.b;
import androidx.annotation.IntRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\u0018\u0000*\u0004\b\u0000\u0010\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0002B)\u0012\b\b\u0001\u0010\u0004\u001A\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001A\u00020\u0003\u0012\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\u000B\u001A\u0004\u0018\u00018\u00002\u0006\u0010\n\u001A\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fR\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0005\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000E\u001A\u0004\b\u0012\u0010\u0010R\u001D\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001A\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0010¨\u0006\u0019"}, d2 = {"Landroidx/paging/ItemSnapshotList;", "T", "Lkotlin/collections/AbstractList;", "", "placeholdersBefore", "placeholdersAfter", "", "items", "<init>", "(IILjava/util/List;)V", "index", "get", "(I)Ljava/lang/Object;", "a", "I", "getPlaceholdersBefore", "()I", "b", "getPlaceholdersAfter", "c", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getSize", "size", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ItemSnapshotList extends AbstractList {
    public final int a;
    public final int b;
    public final List c;

    public ItemSnapshotList(@IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "items");
        super();
        this.a = v;
        this.b = v1;
        this.c = list0;
    }

    @Override  // kotlin.collections.AbstractList
    @Nullable
    public Object get(int v) {
        int v1 = this.a;
        if(v < 0 || v >= v1) {
            List list0 = this.c;
            if(v < list0.size() + v1 && v1 <= v) {
                return list0.get(v - v1);
            }
            if(v >= this.size() || list0.size() + v1 > v) {
                StringBuilder stringBuilder0 = b.s(v, "Illegal attempt to access index ", " in ItemSnapshotList of size ");
                stringBuilder0.append(this.size());
                throw new IndexOutOfBoundsException(stringBuilder0.toString());
            }
        }
        return null;
    }

    @NotNull
    public final List getItems() {
        return this.c;
    }

    public final int getPlaceholdersAfter() {
        return this.b;
    }

    public final int getPlaceholdersBefore() {
        return this.a;
    }

    @Override  // kotlin.collections.AbstractList
    public int getSize() {
        return this.c.size() + this.a + this.b;
    }
}

