package androidx.paging;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@VisibleForTesting
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001B\u0010\b\u001A\u00020\u00072\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\n¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/paging/FlattenedPageEventStorage;", "", "T", "<init>", "()V", "Landroidx/paging/PageEvent;", "event", "", "add", "(Landroidx/paging/PageEvent;)V", "", "getAsEvents", "()Ljava/util/List;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCachedPageEventFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageEventStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n1#2:282\n1855#3,2:283\n*S KotlinDebug\n*F\n+ 1 CachedPageEventFlow.kt\nandroidx/paging/FlattenedPageEventStorage\n*L\n222#1:283,2\n*E\n"})
public final class FlattenedPageEventStorage {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LoadType.values().length];
            try {
                arr_v[LoadType.PREPEND.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.APPEND.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[LoadType.REFRESH.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public int a;
    public int b;
    public final ArrayDeque c;
    public final MutableLoadStateCollection d;
    public LoadStates e;
    public boolean f;

    public FlattenedPageEventStorage() {
        this.c = new ArrayDeque();
        this.d = new MutableLoadStateCollection();
    }

    public final void add(@NotNull PageEvent pageEvent0) {
        Intrinsics.checkNotNullParameter(pageEvent0, "event");
        this.f = true;
        int v = 0;
        ArrayDeque arrayDeque0 = this.c;
        MutableLoadStateCollection mutableLoadStateCollection0 = this.d;
        if(pageEvent0 instanceof Insert) {
            mutableLoadStateCollection0.set(((Insert)pageEvent0).getSourceLoadStates());
            this.e = ((Insert)pageEvent0).getMediatorLoadStates();
            int v1 = WhenMappings.$EnumSwitchMapping$0[((Insert)pageEvent0).getLoadType().ordinal()];
            switch(v1) {
                case 1: {
                    this.a = ((Insert)pageEvent0).getPlaceholdersBefore();
                    Iterator iterator0 = c.downTo(((Insert)pageEvent0).getPages().size() - 1, 0).iterator();
                    while(iterator0.hasNext()) {
                        arrayDeque0.addFirst(((Insert)pageEvent0).getPages().get(((IntIterator)iterator0).nextInt()));
                    }
                    return;
                }
                case 2: {
                    this.b = ((Insert)pageEvent0).getPlaceholdersAfter();
                    arrayDeque0.addAll(((Insert)pageEvent0).getPages());
                    return;
                }
            }
            if(v1 == 3) {
                arrayDeque0.clear();
                this.b = ((Insert)pageEvent0).getPlaceholdersAfter();
                this.a = ((Insert)pageEvent0).getPlaceholdersBefore();
                arrayDeque0.addAll(((Insert)pageEvent0).getPages());
            }
        }
        else {
            if(pageEvent0 instanceof Drop) {
                mutableLoadStateCollection0.set(((Drop)pageEvent0).getLoadType(), NotLoading.Companion.getIncomplete$paging_common_release());
                switch(WhenMappings.$EnumSwitchMapping$0[((Drop)pageEvent0).getLoadType().ordinal()]) {
                    case 1: {
                        this.a = ((Drop)pageEvent0).getPlaceholdersRemaining();
                        int v2 = ((Drop)pageEvent0).getPageCount();
                        while(v < v2) {
                            arrayDeque0.removeFirst();
                            ++v;
                        }
                        return;
                    }
                    case 2: {
                        this.b = ((Drop)pageEvent0).getPlaceholdersRemaining();
                        int v3 = ((Drop)pageEvent0).getPageCount();
                        while(v < v3) {
                            arrayDeque0.removeLast();
                            ++v;
                        }
                        return;
                    }
                    default: {
                        throw new IllegalArgumentException("Page drop type must be prepend or append");
                    }
                }
            }
            if(pageEvent0 instanceof LoadStateUpdate) {
                mutableLoadStateCollection0.set(((LoadStateUpdate)pageEvent0).getSource());
                this.e = ((LoadStateUpdate)pageEvent0).getMediator();
                return;
            }
            if(pageEvent0 instanceof StaticList) {
                if(((StaticList)pageEvent0).getSourceLoadStates() != null) {
                    mutableLoadStateCollection0.set(((StaticList)pageEvent0).getSourceLoadStates());
                }
                if(((StaticList)pageEvent0).getMediatorLoadStates() != null) {
                    this.e = ((StaticList)pageEvent0).getMediatorLoadStates();
                }
                arrayDeque0.clear();
                this.b = 0;
                this.a = 0;
                arrayDeque0.add(new TransformablePage(0, ((StaticList)pageEvent0).getData()));
            }
        }
    }

    @NotNull
    public final List getAsEvents() {
        if(!this.f) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List list0 = new ArrayList();
        LoadStates loadStates0 = this.d.snapshot();
        ArrayDeque arrayDeque0 = this.c;
        if(!arrayDeque0.isEmpty()) {
            List list1 = CollectionsKt___CollectionsKt.toList(arrayDeque0);
            ((ArrayList)list0).add(Insert.Companion.Refresh(list1, this.a, this.b, loadStates0, this.e));
            return list0;
        }
        ((ArrayList)list0).add(new LoadStateUpdate(loadStates0, this.e));
        return list0;
    }
}

