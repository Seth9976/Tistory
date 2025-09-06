package androidx.paging;

import a5.b;
import androidx.annotation.IntRange;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B=\u0012\u0018\u0010\u0006\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\u0012\b\u0010\b\u001A\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\b\b\u0001\u0010\u000B\u001A\u00020\u0007\u00A2\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0010\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001A\u0004\u0018\u00018\u00012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00052\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001A\u001A\u0004\u0018\u00018\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001C\u001A\u0004\u0018\u00018\u0001\u00A2\u0006\u0004\b\u001C\u0010\u001BJ\u000F\u0010\u001E\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b\u001E\u0010\u001FJY\u0010)\u001A\u00028\u0002\"\u0004\b\u0002\u0010 2\u0006\u0010\b\u001A\u00020\u000726\u0010&\u001A2\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00028\u00020!H\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0004\b\'\u0010(R)\u0010\u0006\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u00048\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u0019\u0010\b\u001A\u0004\u0018\u00010\u00078\u0006\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u00066"}, d2 = {"Landroidx/paging/PagingState;", "", "Key", "Value", "", "Landroidx/paging/PagingSource$LoadResult$Page;", "pages", "", "anchorPosition", "Landroidx/paging/PagingConfig;", "config", "leadingPlaceholderCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Landroidx/paging/PagingConfig;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "closestItemToPosition", "(I)Ljava/lang/Object;", "closestPageToPosition", "(I)Landroidx/paging/PagingSource$LoadResult$Page;", "isEmpty", "()Z", "firstItemOrNull", "()Ljava/lang/Object;", "lastItemOrNull", "", "toString", "()Ljava/lang/String;", "T", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "pageIndex", "index", "block", "anchorPositionToPagedIndices$paging_common_release", "(ILkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "anchorPositionToPagedIndices", "a", "Ljava/util/List;", "getPages", "()Ljava/util/List;", "b", "Ljava/lang/Integer;", "getAnchorPosition", "()Ljava/lang/Integer;", "c", "Landroidx/paging/PagingConfig;", "getConfig", "()Landroidx/paging/PagingConfig;", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagingState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingState.kt\nandroidx/paging/PagingState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n142#1,8:156\n142#1,8:175\n1726#2,3:153\n223#2,2:164\n451#2,6:166\n1726#2,3:172\n1726#2,3:183\n288#2,2:186\n533#2,6:188\n*S KotlinDebug\n*F\n+ 1 PagingState.kt\nandroidx/paging/PagingState\n*L\n76#1:156,8\n103#1:175,8\n74#1:153,3\n77#1:164,2\n78#1:166,6\n101#1:172,3\n115#1:183,3\n122#1:186,2\n130#1:188,6\n*E\n"})
public final class PagingState {
    public final List a;
    public final Integer b;
    public final PagingConfig c;
    public final int d;

    public PagingState(@NotNull List list0, @Nullable Integer integer0, @NotNull PagingConfig pagingConfig0, @IntRange(from = 0L) int v) {
        Intrinsics.checkNotNullParameter(list0, "pages");
        Intrinsics.checkNotNullParameter(pagingConfig0, "config");
        super();
        this.a = list0;
        this.b = integer0;
        this.c = pagingConfig0;
        this.d = v;
    }

    public final Object anchorPositionToPagedIndices$paging_common_release(int v, @NotNull Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        int v1 = v - this.d;
        int v2;
        for(v2 = 0; v2 < CollectionsKt__CollectionsKt.getLastIndex(this.getPages()) && v1 > CollectionsKt__CollectionsKt.getLastIndex(((Page)this.getPages().get(v2)).getData()); ++v2) {
            v1 -= ((Page)this.getPages().get(v2)).getData().size();
        }
        return function20.invoke(v2, v1);
    }

    @Nullable
    public final Object closestItemToPosition(int v) {
        List list0 = this.a;
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                if(!((Page)object0).getData().isEmpty()) {
                    int v1 = v - this.d;
                    int v2;
                    for(v2 = 0; v2 < CollectionsKt__CollectionsKt.getLastIndex(this.getPages()) && v1 > CollectionsKt__CollectionsKt.getLastIndex(((Page)this.getPages().get(v2)).getData()); ++v2) {
                        v1 -= ((Page)this.getPages().get(v2)).getData().size();
                    }
                    for(Object object1: list0) {
                        Page pagingSource$LoadResult$Page0 = (Page)object1;
                        if(!pagingSource$LoadResult$Page0.getData().isEmpty()) {
                            ListIterator listIterator0 = list0.listIterator(list0.size());
                            while(listIterator0.hasPrevious()) {
                                Page pagingSource$LoadResult$Page1 = (Page)listIterator0.previous();
                                if(!pagingSource$LoadResult$Page1.getData().isEmpty()) {
                                    if(v1 < 0) {
                                        return CollectionsKt___CollectionsKt.first(pagingSource$LoadResult$Page0.getData());
                                    }
                                    return v2 != CollectionsKt__CollectionsKt.getLastIndex(list0) || v1 <= CollectionsKt__CollectionsKt.getLastIndex(((Page)CollectionsKt___CollectionsKt.last(list0)).getData()) ? ((Page)list0.get(v2)).getData().get(v1) : CollectionsKt___CollectionsKt.last(pagingSource$LoadResult$Page1.getData());
                                }
                                if(false) {
                                    break;
                                }
                            }
                            throw new NoSuchElementException("List contains no element matching the predicate.");
                        }
                        if(false) {
                            break;
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    @Nullable
    public final Page closestPageToPosition(int v) {
        List list0 = this.a;
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
            for(Object object0: list0) {
                if(!((Page)object0).getData().isEmpty()) {
                    int v1 = v - this.d;
                    int v2;
                    for(v2 = 0; v2 < CollectionsKt__CollectionsKt.getLastIndex(this.getPages()) && v1 > CollectionsKt__CollectionsKt.getLastIndex(((Page)this.getPages().get(v2)).getData()); ++v2) {
                        v1 -= ((Page)this.getPages().get(v2)).getData().size();
                    }
                    return v1 >= 0 ? ((Page)list0.get(v2)) : ((Page)CollectionsKt___CollectionsKt.first(list0));
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof PagingState && Intrinsics.areEqual(this.a, ((PagingState)object0).a) && Intrinsics.areEqual(this.b, ((PagingState)object0).b) && Intrinsics.areEqual(this.c, ((PagingState)object0).c) && this.d == ((PagingState)object0).d;
    }

    @Nullable
    public final Object firstItemOrNull() {
        Object object0 = null;
        for(Object object1: this.a) {
            if(!((Page)object1).getData().isEmpty()) {
                object0 = object1;
                break;
            }
        }
        if(((Page)object0) != null) {
            List list0 = ((Page)object0).getData();
            return list0 == null ? null : CollectionsKt___CollectionsKt.firstOrNull(list0);
        }
        return null;
    }

    @Nullable
    public final Integer getAnchorPosition() {
        return this.b;
    }

    @NotNull
    public final PagingConfig getConfig() {
        return this.c;
    }

    @NotNull
    public final List getPages() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.d + (this.c.hashCode() + v) : this.d + (this.c.hashCode() + (v + this.b.hashCode()));
    }

    public final boolean isEmpty() {
        Iterable iterable0 = this.a;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(!((Page)object0).getData().isEmpty()) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Nullable
    public final Object lastItemOrNull() {
        Object object0 = null;
        ListIterator listIterator0 = this.a.listIterator(this.a.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(!((Page)object1).getData().isEmpty()) {
                object0 = object1;
                break;
            }
        }
        if(((Page)object0) != null) {
            List list0 = ((Page)object0).getData();
            return list0 == null ? null : CollectionsKt___CollectionsKt.lastOrNull(list0);
        }
        return null;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PagingState(pages=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", anchorPosition=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", config=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", leadingPlaceholderCount=");
        return b.p(stringBuilder0, this.d, ')');
    }
}

