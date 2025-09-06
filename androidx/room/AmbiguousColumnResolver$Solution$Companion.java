package androidx.room;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0006\u001A\u00020\u00052\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"androidx/room/AmbiguousColumnResolver$Solution$Companion", "", "", "Landroidx/room/b;", "matches", "Landroidx/room/d;", "build", "(Ljava/util/List;)Landroidx/room/d;", "NO_SOLUTION", "Landroidx/room/d;", "getNO_SOLUTION", "()Landroidx/room/d;", "room-common"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAmbiguousColumnResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,253:1\n1#2:254\n1774#3,3:255\n1855#3,2:258\n1777#3:260\n*S KotlinDebug\n*F\n+ 1 AmbiguousColumnResolver.kt\nandroidx/room/AmbiguousColumnResolver$Solution$Companion\n*L\n232#1:255,3\n234#1:258,2\n232#1:260\n*E\n"})
public final class AmbiguousColumnResolver.Solution.Companion {
    public AmbiguousColumnResolver.Solution.Companion(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    @NotNull
    public final d build(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "matches");
        int v = 0;
        int v1 = 0;
        for(Object object0: list0) {
            v1 += ((b)object0).a.getLast() - ((b)object0).a.getFirst() + 1 - ((b)object0).b.size();
        }
        Iterator iterator1 = list0.iterator();
        if(!iterator1.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object1 = iterator1.next();
        int v2 = ((b)object1).a.getFirst();
        while(iterator1.hasNext()) {
            Object object2 = iterator1.next();
            int v3 = ((b)object2).a.getFirst();
            if(v2 > v3) {
                v2 = v3;
            }
        }
        Iterator iterator2 = list0.iterator();
        if(!iterator2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object3 = iterator2.next();
        int v4 = ((b)object3).a.getLast();
        while(iterator2.hasNext()) {
            Object object4 = iterator2.next();
            int v5 = ((b)object4).a.getLast();
            if(v4 < v5) {
                v4 = v5;
            }
        }
        IntRange intRange0 = new IntRange(v2, v4);
        if(!(intRange0 instanceof Collection) || !((Collection)intRange0).isEmpty()) {
            int v6 = 0;
            Iterator iterator3 = intRange0.iterator();
        label_32:
            while(iterator3.hasNext()) {
                int v7 = ((IntIterator)iterator3).nextInt();
                int v8 = 0;
                Iterator iterator4 = list0.iterator();
                do {
                    if(!iterator4.hasNext()) {
                        continue label_32;
                    }
                    Object object5 = iterator4.next();
                    if(((b)object5).a.contains(v7)) {
                        ++v8;
                    }
                }
                while(v8 <= 1);
                ++v6;
                if(v6 < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
            v = v6;
        }
        return new d(list0, v1, v);
    }

    @NotNull
    public final d getNO_SOLUTION() {
        return d.e;
    }
}

