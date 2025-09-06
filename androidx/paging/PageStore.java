package androidx.paging;

import a5.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 0*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00010B+\u0012\u0012\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007¢\u0006\u0004\b\n\u0010\u000BB\u0017\b\u0016\u0012\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\n\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001A\u0004\u0018\u00018\u00002\u0006\u0010\u0012\u001A\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J!\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u001B2\f\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001C\u0010\u001DJ\r\u0010\u001F\u001A\u00020\u001E¢\u0006\u0004\b\u001F\u0010 J\u0015\u0010\"\u001A\u00020!2\u0006\u0010\u0012\u001A\u00020\u0007¢\u0006\u0004\b\"\u0010#R$\u0010)\u001A\u00020\u00072\u0006\u0010$\u001A\u00020\u00078\u0016@RX\u0096\u000E¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(R$\u0010\b\u001A\u00020\u00072\u0006\u0010$\u001A\u00020\u00078\u0016@RX\u0096\u000E¢\u0006\f\n\u0004\b*\u0010&\u001A\u0004\b+\u0010(R$\u0010\t\u001A\u00020\u00072\u0006\u0010$\u001A\u00020\u00078\u0016@RX\u0096\u000E¢\u0006\f\n\u0004\b,\u0010&\u001A\u0004\b-\u0010(R\u0014\u0010/\u001A\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b.\u0010(¨\u00061"}, d2 = {"Landroidx/paging/PageStore;", "", "T", "Landroidx/paging/PlaceholderPaddedList;", "", "Landroidx/paging/TransformablePage;", "pages", "", "placeholdersBefore", "placeholdersAfter", "<init>", "(Ljava/util/List;II)V", "Landroidx/paging/PageEvent$Insert;", "insertEvent", "(Landroidx/paging/PageEvent$Insert;)V", "", "toString", "()Ljava/lang/String;", "index", "get", "(I)Ljava/lang/Object;", "Landroidx/paging/ItemSnapshotList;", "snapshot", "()Landroidx/paging/ItemSnapshotList;", "getItem", "Landroidx/paging/PageEvent;", "pageEvent", "Landroidx/paging/PagingDataEvent;", "processEvent", "(Landroidx/paging/PageEvent;)Landroidx/paging/PagingDataEvent;", "Landroidx/paging/ViewportHint$Initial;", "initializeHint", "()Landroidx/paging/ViewportHint$Initial;", "Landroidx/paging/ViewportHint$Access;", "accessHintForPresenterIndex", "(I)Landroidx/paging/ViewportHint$Access;", "<set-?>", "b", "I", "getDataCount", "()I", "dataCount", "c", "getPlaceholdersBefore", "d", "getPlaceholdersAfter", "getSize", "size", "Companion", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPageStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageStore.kt\nandroidx/paging/PageStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,255:1\n1#2:256\n1360#3:257\n1446#3,5:258\n1360#3:263\n1446#3,5:264\n1360#3:269\n1446#3,5:270\n12774#4,2:275\n*S KotlinDebug\n*F\n+ 1 PageStore.kt\nandroidx/paging/PageStore\n*L\n79#1:257\n79#1:258,5\n168#1:263\n168#1:264,5\n183#1:269\n183#1:270,5\n200#1:275,2\n*E\n"})
public final class PageStore implements PlaceholderPaddedList {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001J/\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0001\u0010\u0002*\u00020\u00012\u000E\u0010\u0004\u001A\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001A\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Landroidx/paging/PageStore$Companion;", "", "T", "Landroidx/paging/PageEvent$Insert;", "event", "Landroidx/paging/PageStore;", "initial$paging_common_release", "(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PageStore;", "initial", "INITIAL", "Landroidx/paging/PageStore;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PageStore initial$paging_common_release(@Nullable Insert pageEvent$Insert0) {
            if(pageEvent$Insert0 != null) {
                return new PageStore(pageEvent$Insert0);
            }
            PageStore pageStore0 = PageStore.e;
            Intrinsics.checkNotNull(pageStore0, "null cannot be cast to non-null type androidx.paging.PageStore<T of androidx.paging.PageStore.Companion.initial>");
            return pageStore0;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LoadType.values().length];
            try {
                arr_v[LoadType.REFRESH.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.PREPEND.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.APPEND.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final List a;
    public int b;
    public int c;
    public int d;
    public static final PageStore e;

    static {
        PageStore.Companion = new Companion(null);
        PageStore.e = new PageStore(Insert.Companion.getEMPTY_REFRESH_LOCAL());
    }

    public PageStore(@NotNull Insert pageEvent$Insert0) {
        Intrinsics.checkNotNullParameter(pageEvent$Insert0, "insertEvent");
        this(pageEvent$Insert0.getPages(), pageEvent$Insert0.getPlaceholdersBefore(), pageEvent$Insert0.getPlaceholdersAfter());
    }

    public PageStore(@NotNull List list0, int v, int v1) {
        Intrinsics.checkNotNullParameter(list0, "pages");
        super();
        this.a = CollectionsKt___CollectionsKt.toMutableList(list0);
        int v2 = 0;
        for(Object object0: list0) {
            v2 += ((TransformablePage)object0).getData().size();
        }
        this.b = v2;
        this.c = v;
        this.d = v1;
    }

    @NotNull
    public final Access accessHintForPresenterIndex(int v) {
        List list0;
        int v1 = 0;
        int v2 = v - this.getPlaceholdersBefore();
        while(true) {
            list0 = this.a;
            if(v2 < ((TransformablePage)list0.get(v1)).getData().size() || v1 >= CollectionsKt__CollectionsKt.getLastIndex(list0)) {
                break;
            }
            v2 -= ((TransformablePage)list0.get(v1)).getData().size();
            ++v1;
        }
        Object object0 = list0.get(v1);
        int v3 = this.getSize();
        Integer integer0 = ArraysKt___ArraysKt.minOrNull(((TransformablePage)CollectionsKt___CollectionsKt.first(list0)).getOriginalPageOffsets());
        Intrinsics.checkNotNull(integer0);
        Integer integer1 = ArraysKt___ArraysKt.maxOrNull(((TransformablePage)CollectionsKt___CollectionsKt.last(list0)).getOriginalPageOffsets());
        Intrinsics.checkNotNull(integer1);
        return ((TransformablePage)object0).viewportHintFor(v2, v - this.getPlaceholdersBefore(), v3 - v - this.getPlaceholdersAfter() - 1, ((int)integer0), ((int)integer1));
    }

    @Nullable
    public final Object get(int v) {
        if(v >= 0 && v < this.getSize()) {
            int v1 = v - this.getPlaceholdersBefore();
            return v1 < 0 || v1 >= this.getDataCount() ? null : this.getItem(v1);
        }
        StringBuilder stringBuilder0 = b.s(v, "Index: ", ", Size: ");
        stringBuilder0.append(this.getSize());
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @Override  // androidx.paging.PlaceholderPaddedList
    public int getDataCount() {
        return this.b;
    }

    @Override  // androidx.paging.PlaceholderPaddedList
    @NotNull
    public Object getItem(int v) {
        List list0 = this.a;
        int v1 = list0.size();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            int v3 = ((TransformablePage)list0.get(v2)).getData().size();
            if(v3 > v) {
                break;
            }
            v -= v3;
        }
        return ((TransformablePage)list0.get(v2)).getData().get(v);
    }

    @Override  // androidx.paging.PlaceholderPaddedList
    public int getPlaceholdersAfter() {
        return this.d;
    }

    @Override  // androidx.paging.PlaceholderPaddedList
    public int getPlaceholdersBefore() {
        return this.c;
    }

    @Override  // androidx.paging.PlaceholderPaddedList
    public int getSize() {
        return this.getPlaceholdersAfter() + (this.getDataCount() + this.getPlaceholdersBefore());
    }

    @NotNull
    public final Initial initializeHint() {
        int v = this.getDataCount();
        Integer integer0 = ArraysKt___ArraysKt.minOrNull(((TransformablePage)CollectionsKt___CollectionsKt.first(this.a)).getOriginalPageOffsets());
        Intrinsics.checkNotNull(integer0);
        Integer integer1 = ArraysKt___ArraysKt.maxOrNull(((TransformablePage)CollectionsKt___CollectionsKt.last(this.a)).getOriginalPageOffsets());
        Intrinsics.checkNotNull(integer1);
        return new Initial(v / 2, v / 2, ((int)integer0), ((int)integer1));
    }

    @NotNull
    public final PagingDataEvent processEvent(@NotNull PageEvent pageEvent0) {
        Intrinsics.checkNotNullParameter(pageEvent0, "pageEvent");
        List list0 = this.a;
        if(pageEvent0 instanceof Insert) {
            int v = 0;
            for(Object object0: ((Insert)pageEvent0).getPages()) {
                v += ((TransformablePage)object0).getData().size();
            }
            switch(WhenMappings.$EnumSwitchMapping$0[((Insert)pageEvent0).getLoadType().ordinal()]) {
                case 1: {
                    throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                }
                case 2: {
                    int v1 = this.getPlaceholdersBefore();
                    list0.addAll(0, ((Insert)pageEvent0).getPages());
                    this.b = this.getDataCount() + v;
                    this.c = ((Insert)pageEvent0).getPlaceholdersBefore();
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object1: ((Insert)pageEvent0).getPages()) {
                        o.addAll(arrayList0, ((TransformablePage)object1).getData());
                    }
                    return new Prepend(arrayList0, this.getPlaceholdersBefore(), v1);
                }
                case 3: {
                    int v2 = this.getPlaceholdersAfter();
                    int v3 = this.getDataCount();
                    list0.addAll(list0.size(), ((Insert)pageEvent0).getPages());
                    this.b = this.getDataCount() + v;
                    this.d = ((Insert)pageEvent0).getPlaceholdersAfter();
                    int v4 = this.getPlaceholdersBefore();
                    ArrayList arrayList1 = new ArrayList();
                    for(Object object2: ((Insert)pageEvent0).getPages()) {
                        o.addAll(arrayList1, ((TransformablePage)object2).getData());
                    }
                    return new Append(v4 + v3, arrayList1, this.getPlaceholdersAfter(), v2);
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if(!(pageEvent0 instanceof Drop)) {
            throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        IntRange intRange0 = new IntRange(((Drop)pageEvent0).getMinPageOffset(), ((Drop)pageEvent0).getMaxPageOffset());
        int v5 = 0;
        Iterator iterator3 = list0.iterator();
        while(iterator3.hasNext()) {
            Object object3 = iterator3.next();
            TransformablePage transformablePage0 = (TransformablePage)object3;
            int[] arr_v = transformablePage0.getOriginalPageOffsets();
            for(int v6 = 0; v6 < arr_v.length; ++v6) {
                if(intRange0.contains(arr_v[v6])) {
                    v5 += transformablePage0.getData().size();
                    iterator3.remove();
                    break;
                }
            }
        }
        this.b = this.getDataCount() - v5;
        if(((Drop)pageEvent0).getLoadType() == LoadType.PREPEND) {
            this.c = ((Drop)pageEvent0).getPlaceholdersRemaining();
            return new DropPrepend(v5, this.getPlaceholdersBefore(), this.getPlaceholdersBefore());
        }
        this.d = ((Drop)pageEvent0).getPlaceholdersRemaining();
        return new DropAppend(this.getDataCount() + this.getPlaceholdersBefore(), v5, ((Drop)pageEvent0).getPlaceholdersRemaining(), this.getPlaceholdersAfter());
    }

    @NotNull
    public final ItemSnapshotList snapshot() {
        int v = this.getPlaceholdersBefore();
        int v1 = this.getPlaceholdersAfter();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.a) {
            o.addAll(arrayList0, ((TransformablePage)object0).getData());
        }
        return new ItemSnapshotList(v, v1, arrayList0);
    }

    @Override
    @NotNull
    public String toString() {
        int v = this.getDataCount();
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add(this.getItem(v1));
        }
        return "[(" + this.getPlaceholdersBefore() + " placeholders), " + CollectionsKt___CollectionsKt.joinToString$default(arrayList0, null, null, null, 0, null, null, 0x3F, null) + ", (" + this.getPlaceholdersAfter() + " placeholders)]";
    }
}

