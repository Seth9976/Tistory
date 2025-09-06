package androidx.paging;

import a5.b;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u000F\b\u0080\b\u0018\u0000 2*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u00012B5\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u000E\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u00A2\u0006\u0004\b\n\u0010\u000BB\u001F\b\u0016\u0012\u0006\u0010\f\u001A\u00020\u0007\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u00A2\u0006\u0004\b\n\u0010\rJ5\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000E\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u0010\u001A\u00020\u00072\u0006\u0010\u0011\u001A\u00020\u00072\u0006\u0010\u0012\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0010\u0010\u001C\u001A\u00020\u0003H\u00C6\u0003\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0016\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u00C6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b \u0010\u001BJ\u0018\u0010!\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u00C6\u0003\u00A2\u0006\u0004\b!\u0010\u001FJL\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001A\u00020\u00032\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\b\u001A\u00020\u00072\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005H\u00C6\u0001\u00A2\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001A\u00020$H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010&R\u0017\u0010\u0004\u001A\u00020\u00038\u0006\u00A2\u0006\f\n\u0004\b\'\u0010(\u001A\u0004\b)\u0010\u001DR\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010\u001FR\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b/\u0010\u001BR\u001F\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006\u00A2\u0006\f\n\u0004\b0\u0010+\u001A\u0004\b1\u0010\u001F\u00A8\u00063"}, d2 = {"Landroidx/paging/TransformablePage;", "", "T", "", "originalPageOffsets", "", "data", "", "hintOriginalPageOffset", "hintOriginalIndices", "<init>", "([ILjava/util/List;ILjava/util/List;)V", "originalPageOffset", "(ILjava/util/List;)V", "index", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "Landroidx/paging/ViewportHint$Access;", "viewportHintFor", "(IIIII)Landroidx/paging/ViewportHint$Access;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()[I", "component2", "()Ljava/util/List;", "component3", "component4", "copy", "([ILjava/util/List;ILjava/util/List;)Landroidx/paging/TransformablePage;", "", "toString", "()Ljava/lang/String;", "a", "[I", "getOriginalPageOffsets", "b", "Ljava/util/List;", "getData", "c", "I", "getHintOriginalPageOffset", "d", "getHintOriginalIndices", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class TransformablePage {
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001A\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/paging/TransformablePage$Companion;", "", "T", "Landroidx/paging/TransformablePage;", "empty", "()Landroidx/paging/TransformablePage;", "EMPTY_INITIAL_PAGE", "Landroidx/paging/TransformablePage;", "getEMPTY_INITIAL_PAGE", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final TransformablePage empty() {
            TransformablePage transformablePage0 = this.getEMPTY_INITIAL_PAGE();
            Intrinsics.checkNotNull(transformablePage0, "null cannot be cast to non-null type androidx.paging.TransformablePage<T of androidx.paging.TransformablePage.Companion.empty>");
            return transformablePage0;
        }

        @NotNull
        public final TransformablePage getEMPTY_INITIAL_PAGE() {
            return TransformablePage.e;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int[] a;
    public final List b;
    public final int c;
    public final List d;
    public static final TransformablePage e;

    static {
        TransformablePage.Companion = new Companion(null);
        TransformablePage.e = new TransformablePage(0, CollectionsKt__CollectionsKt.emptyList());
    }

    public TransformablePage(int v, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "data");
        this(new int[]{v}, list0, v, null);
    }

    public TransformablePage(@NotNull int[] arr_v, @NotNull List list0, int v, @Nullable List list1) {
        Intrinsics.checkNotNullParameter(arr_v, "originalPageOffsets");
        Intrinsics.checkNotNullParameter(list0, "data");
        super();
        this.a = arr_v;
        this.b = list0;
        this.c = v;
        this.d = list1;
        if(arr_v.length == 0) {
            throw new IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage");
        }
        if(list1 != null && list1.size() != list0.size()) {
            Intrinsics.checkNotNull(list1);
            throw new IllegalArgumentException(("If originalIndices (size = " + list1.size() + ") is provided, it must be same length as data (size = " + list0.size() + ')').toString());
        }
    }

    @NotNull
    public final int[] component1() {
        return this.a;
    }

    @NotNull
    public final List component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    @Nullable
    public final List component4() {
        return this.d;
    }

    @NotNull
    public final TransformablePage copy(@NotNull int[] arr_v, @NotNull List list0, int v, @Nullable List list1) {
        Intrinsics.checkNotNullParameter(arr_v, "originalPageOffsets");
        Intrinsics.checkNotNullParameter(list0, "data");
        return new TransformablePage(arr_v, list0, v, list1);
    }

    public static TransformablePage copy$default(TransformablePage transformablePage0, int[] arr_v, List list0, int v, List list1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            arr_v = transformablePage0.a;
        }
        if((v1 & 2) != 0) {
            list0 = transformablePage0.b;
        }
        if((v1 & 4) != 0) {
            v = transformablePage0.c;
        }
        if((v1 & 8) != 0) {
            list1 = transformablePage0.d;
        }
        return transformablePage0.copy(arr_v, list0, v, list1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(TransformablePage.class != class0 || !Arrays.equals(this.a, ((TransformablePage)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((TransformablePage)object0).b)) {
                return false;
            }
            return this.c == ((TransformablePage)object0).c ? Intrinsics.areEqual(this.d, ((TransformablePage)object0).d) : false;
        }
        return false;
    }

    @NotNull
    public final List getData() {
        return this.b;
    }

    @Nullable
    public final List getHintOriginalIndices() {
        return this.d;
    }

    public final int getHintOriginalPageOffset() {
        return this.c;
    }

    @NotNull
    public final int[] getOriginalPageOffsets() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = Arrays.hashCode(this.a);
        int v1 = (b.c(this.b, v * 0x1F, 0x1F) + this.c) * 0x1F;
        return this.d == null ? v1 : v1 + this.d.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.a) + ", data=" + this.b + ", hintOriginalPageOffset=" + this.c + ", hintOriginalIndices=" + this.d + ')';
    }

    @NotNull
    public final Access viewportHintFor(int v, int v1, int v2, int v3, int v4) {
        List list0 = this.d;
        if(list0 != null) {
            IntRange intRange0 = CollectionsKt__CollectionsKt.getIndices(list0);
            if(intRange0 != null && intRange0.contains(v)) {
                v = ((Number)list0.get(v)).intValue();
            }
        }
        return new Access(this.c, v, v1, v2, v3, v4);
    }
}

