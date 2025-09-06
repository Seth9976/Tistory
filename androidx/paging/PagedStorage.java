package androidx.paging;

import a5.b;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000E\n\u0002\b$\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001WB\t\b\u0016\u00A2\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0010\u0010\u000B\u001A\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0010\f\u001A\u00020\b\u00A2\u0006\u0004\b\u0006\u0010\rJ\u0013\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000\u00A2\u0006\u0004\b\u000E\u0010\u000FJK\u0010\u0016\u001A\u00020\u00152\u0006\u0010\t\u001A\u00020\b2\u0010\u0010\u000B\u001A\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0012\u001A\u00020\u00112\b\b\u0002\u0010\u0014\u001A\u00020\u0013H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001A\u00028\u00002\u0006\u0010\u0018\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ!\u0010\u001E\u001A\u000E\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001D2\u0006\u0010\u001C\u001A\u00020\u001B\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001A\u0010 \u001A\u0004\u0018\u00018\u00002\u0006\u0010\u0018\u001A\u00020\bH\u0096\u0002\u00A2\u0006\u0004\b \u0010\u001AJ\u001D\u0010#\u001A\u00020\u00132\u0006\u0010!\u001A\u00020\b2\u0006\u0010\"\u001A\u00020\b\u00A2\u0006\u0004\b#\u0010$J\u001D\u0010%\u001A\u00020\u00132\u0006\u0010!\u001A\u00020\b2\u0006\u0010\"\u001A\u00020\b\u00A2\u0006\u0004\b%\u0010$J%\u0010\'\u001A\u00020\u00132\u0006\u0010!\u001A\u00020\b2\u0006\u0010\"\u001A\u00020\b2\u0006\u0010&\u001A\u00020\b\u00A2\u0006\u0004\b\'\u0010(J/\u0010,\u001A\u00020\u00132\u0006\u0010)\u001A\u00020\u00132\u0006\u0010!\u001A\u00020\b2\u0006\u0010\"\u001A\u00020\b2\u0006\u0010\u0012\u001A\u00020\u0011H\u0000\u00A2\u0006\u0004\b*\u0010+J/\u0010.\u001A\u00020\u00132\u0006\u0010)\u001A\u00020\u00132\u0006\u0010!\u001A\u00020\b2\u0006\u0010\"\u001A\u00020\b2\u0006\u0010\u0012\u001A\u00020\u0011H\u0000\u00A2\u0006\u0004\b-\u0010+J-\u00101\u001A\u00020\u00152\u0010\u0010\u000B\u001A\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0000\u00A2\u0006\u0004\b/\u00100J-\u00103\u001A\u00020\u00152\u0010\u0010\u000B\u001A\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\n2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0000\u00A2\u0006\u0004\b2\u00100J\u000F\u00105\u001A\u000204H\u0016\u00A2\u0006\u0004\b5\u00106R$\u0010<\u001A\u00020\b2\u0006\u00107\u001A\u00020\b8\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;R$\u0010?\u001A\u00020\b2\u0006\u00107\u001A\u00020\b8\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\b=\u00109\u001A\u0004\b>\u0010;R$\u0010\u0010\u001A\u00020\b2\u0006\u00107\u001A\u00020\b8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b@\u00109\u001A\u0004\bA\u0010;R$\u0010D\u001A\u00020\b2\u0006\u00107\u001A\u00020\b8\u0016@RX\u0096\u000E\u00A2\u0006\f\n\u0004\bB\u00109\u001A\u0004\bC\u0010;R\u0014\u0010G\u001A\u00028\u00008@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bE\u0010FR\u0014\u0010I\u001A\u00028\u00008@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\bH\u0010FR$\u0010N\u001A\u00020\b2\u0006\u0010J\u001A\u00020\b8F@FX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bK\u0010;\"\u0004\bL\u0010MR\u0011\u0010P\u001A\u00020\b8F\u00A2\u0006\u0006\u001A\u0004\bO\u0010;R\u0016\u0010R\u001A\u0004\u0018\u00010\u00018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bQ\u0010FR\u0016\u0010T\u001A\u0004\u0018\u00010\u00018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bS\u0010FR\u0014\u0010V\u001A\u00020\b8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bU\u0010;\u00A8\u0006X"}, d2 = {"Landroidx/paging/PagedStorage;", "", "T", "Ljava/util/AbstractList;", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "Landroidx/paging/PlaceholderPaddedList;", "<init>", "()V", "", "leadingNulls", "Landroidx/paging/PagingSource$LoadResult$Page;", "page", "trailingNulls", "(ILandroidx/paging/PagingSource$LoadResult$Page;I)V", "snapshot", "()Landroidx/paging/PagedStorage;", "positionOffset", "Landroidx/paging/PagedStorage$Callback;", "callback", "", "counted", "", "init", "(ILandroidx/paging/PagingSource$LoadResult$Page;IILandroidx/paging/PagedStorage$Callback;Z)V", "index", "getItem", "(I)Ljava/lang/Object;", "Landroidx/paging/PagedList$Config;", "config", "Landroidx/paging/PagingState;", "getRefreshKeyInfo", "(Landroidx/paging/PagedList$Config;)Landroidx/paging/PagingState;", "get", "maxSize", "requiredRemaining", "needsTrimFromFront", "(II)Z", "needsTrimFromEnd", "countToBeAdded", "shouldPreTrimNewPage", "(III)Z", "insertNulls", "trimFromFront$paging_common_release", "(ZIILandroidx/paging/PagedStorage$Callback;)Z", "trimFromFront", "trimFromEnd$paging_common_release", "trimFromEnd", "prependPage$paging_common_release", "(Landroidx/paging/PagingSource$LoadResult$Page;Landroidx/paging/PagedStorage$Callback;)V", "prependPage", "appendPage$paging_common_release", "appendPage", "", "toString", "()Ljava/lang/String;", "<set-?>", "b", "I", "getPlaceholdersBefore", "()I", "placeholdersBefore", "c", "getPlaceholdersAfter", "placeholdersAfter", "d", "getPositionOffset", "f", "getDataCount", "dataCount", "getFirstLoadedItem$paging_common_release", "()Ljava/lang/Object;", "firstLoadedItem", "getLastLoadedItem$paging_common_release", "lastLoadedItem", "value", "getLastLoadAroundIndex", "setLastLoadAroundIndex", "(I)V", "lastLoadAroundIndex", "getMiddleOfLoadedRange", "middleOfLoadedRange", "getPrevKey", "prevKey", "getNextKey", "nextKey", "getSize", "size", "Callback", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPagedStorage.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagedStorage.jvm.kt\nandroidx/paging/PagedStorage\n*L\n1#1,354:1\n149#1,15:355\n*S KotlinDebug\n*F\n+ 1 PagedStorage.jvm.kt\nandroidx/paging/PagedStorage\n*L\n170#1:355,15\n*E\n"})
public final class PagedStorage extends AbstractList implements KeyProvider, PlaceholderPaddedList {
    @RestrictTo({Scope.LIBRARY})
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J \u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\u0005H&J \u0010\n\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\u0005H&J\u0018\u0010\f\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0018\u0010\u000E\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000FÀ\u0006\u0001"}, d2 = {"Landroidx/paging/PagedStorage$Callback;", "", "onInitialized", "", "count", "", "onPageAppended", "endPosition", "changed", "added", "onPagePrepended", "leadingNulls", "onPagesRemoved", "startOfDrops", "onPagesSwappedToPlaceholder", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Callback {
        void onInitialized(int arg1);

        void onPageAppended(int arg1, int arg2, int arg3);

        void onPagePrepended(int arg1, int arg2, int arg3);

        void onPagesRemoved(int arg1, int arg2);

        void onPagesSwappedToPlaceholder(int arg1, int arg2);
    }

    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;

    public PagedStorage() {
        this.a = new ArrayList();
        this.e = true;
    }

    public PagedStorage(int v, @NotNull Page pagingSource$LoadResult$Page0, int v1) {
        Intrinsics.checkNotNullParameter(pagingSource$LoadResult$Page0, "page");
        this();
        this.a(v, pagingSource$LoadResult$Page0, v1, 0, true);
    }

    public PagedStorage(PagedStorage pagedStorage0) {
        ArrayList arrayList0 = new ArrayList();
        this.a = arrayList0;
        this.e = true;
        arrayList0.addAll(pagedStorage0.a);
        this.b = pagedStorage0.getPlaceholdersBefore();
        this.c = pagedStorage0.getPlaceholdersAfter();
        this.d = pagedStorage0.d;
        this.e = pagedStorage0.e;
        this.f = pagedStorage0.getDataCount();
        this.g = pagedStorage0.g;
    }

    public final void a(int v, Page pagingSource$LoadResult$Page0, int v1, int v2, boolean z) {
        this.b = v;
        this.a.clear();
        this.a.add(pagingSource$LoadResult$Page0);
        this.c = v1;
        this.d = v2;
        this.f = pagingSource$LoadResult$Page0.getData().size();
        this.e = z;
        this.g = pagingSource$LoadResult$Page0.getData().size() / 2;
    }

    public final void appendPage$paging_common_release(@NotNull Page pagingSource$LoadResult$Page0, @Nullable Callback pagedStorage$Callback0) {
        Intrinsics.checkNotNullParameter(pagingSource$LoadResult$Page0, "page");
        int v = pagingSource$LoadResult$Page0.getData().size();
        if(v == 0) {
            return;
        }
        this.a.add(pagingSource$LoadResult$Page0);
        this.f = this.getDataCount() + v;
        int v1 = Math.min(this.getPlaceholdersAfter(), v);
        if(v1 != 0) {
            this.c = this.getPlaceholdersAfter() - v1;
        }
        if(pagedStorage$Callback0 != null) {
            pagedStorage$Callback0.onPageAppended(this.getDataCount() + this.getPlaceholdersBefore() - v, v1, v - v1);
        }
    }

    public static void appendPage$paging_common_release$default(PagedStorage pagedStorage0, Page pagingSource$LoadResult$Page0, Callback pagedStorage$Callback0, int v, Object object0) {
        if((v & 2) != 0) {
            pagedStorage$Callback0 = null;
        }
        pagedStorage0.appendPage$paging_common_release(pagingSource$LoadResult$Page0, pagedStorage$Callback0);
    }

    public final boolean b(int v, int v1, int v2) {
        Page pagingSource$LoadResult$Page0 = (Page)this.a.get(v2);
        return this.getDataCount() > v && this.a.size() > 2 && this.getDataCount() - pagingSource$LoadResult$Page0.getData().size() >= v1;
    }

    @Override
    @Nullable
    public Object get(int v) {
        int v1 = v - this.getPlaceholdersBefore();
        if(v >= 0 && v < this.size()) {
            return v1 < 0 || v1 >= this.getDataCount() ? null : this.getItem(v1);
        }
        StringBuilder stringBuilder0 = b.s(v, "Index: ", ", Size: ");
        stringBuilder0.append(this.size());
        throw new IndexOutOfBoundsException(stringBuilder0.toString());
    }

    @Override  // androidx.paging.PlaceholderPaddedList
    public int getDataCount() {
        return this.f;
    }

    @NotNull
    public final Object getFirstLoadedItem$paging_common_release() {
        return CollectionsKt___CollectionsKt.first(((Page)CollectionsKt___CollectionsKt.first(this.a)).getData());
    }

    @Override  // androidx.paging.PlaceholderPaddedList
    @NotNull
    public Object getItem(int v) {
        ArrayList arrayList0 = this.a;
        int v1 = arrayList0.size();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            int v3 = ((Page)arrayList0.get(v2)).getData().size();
            if(v3 > v) {
                break;
            }
            v -= v3;
        }
        return ((Page)arrayList0.get(v2)).getData().get(v);
    }

    public final int getLastLoadAroundIndex() {
        return this.getPlaceholdersBefore() + this.g;
    }

    @NotNull
    public final Object getLastLoadedItem$paging_common_release() {
        return CollectionsKt___CollectionsKt.last(((Page)CollectionsKt___CollectionsKt.last(this.a)).getData());
    }

    public final int getMiddleOfLoadedRange() {
        return this.getDataCount() / 2 + this.getPlaceholdersBefore();
    }

    @Override  // androidx.paging.LegacyPageFetcher$KeyProvider
    @Nullable
    public Object getNextKey() {
        return !this.e || this.getPlaceholdersAfter() > 0 ? ((Page)CollectionsKt___CollectionsKt.last(this.a)).getNextKey() : null;
    }

    @Override  // androidx.paging.PlaceholderPaddedList
    public int getPlaceholdersAfter() {
        return this.c;
    }

    @Override  // androidx.paging.PlaceholderPaddedList
    public int getPlaceholdersBefore() {
        return this.b;
    }

    public final int getPositionOffset() {
        return this.d;
    }

    @Override  // androidx.paging.LegacyPageFetcher$KeyProvider
    @Nullable
    public Object getPrevKey() {
        return !this.e || this.getPlaceholdersBefore() + this.d > 0 ? ((Page)CollectionsKt___CollectionsKt.first(this.a)).getPrevKey() : null;
    }

    @Nullable
    public final PagingState getRefreshKeyInfo(@NotNull Config pagedList$Config0) {
        Intrinsics.checkNotNullParameter(pagedList$Config0, "config");
        ArrayList arrayList0 = this.a;
        if(arrayList0.isEmpty()) {
            return null;
        }
        List list0 = CollectionsKt___CollectionsKt.toList(arrayList0);
        Intrinsics.checkNotNull(list0, "null cannot be cast to non-null type kotlin.collections.List<androidx.paging.PagingSource.LoadResult.Page<kotlin.Any, T of androidx.paging.PagedStorage>>");
        return new PagingState(list0, this.getLastLoadAroundIndex(), new PagingConfig(pagedList$Config0.pageSize, pagedList$Config0.prefetchDistance, pagedList$Config0.enablePlaceholders, pagedList$Config0.initialLoadSizeHint, pagedList$Config0.maxSize, 0, 0x20, null), this.getPlaceholdersBefore());
    }

    @Override  // androidx.paging.PlaceholderPaddedList
    public int getSize() {
        return this.getPlaceholdersAfter() + (this.getDataCount() + this.getPlaceholdersBefore());
    }

    @RestrictTo({Scope.LIBRARY})
    public final void init(int v, @NotNull Page pagingSource$LoadResult$Page0, int v1, int v2, @NotNull Callback pagedStorage$Callback0, boolean z) {
        Intrinsics.checkNotNullParameter(pagingSource$LoadResult$Page0, "page");
        Intrinsics.checkNotNullParameter(pagedStorage$Callback0, "callback");
        this.a(v, pagingSource$LoadResult$Page0, v1, v2, z);
        pagedStorage$Callback0.onInitialized(this.size());
    }

    public static void init$default(PagedStorage pagedStorage0, int v, Page pagingSource$LoadResult$Page0, int v1, int v2, Callback pagedStorage$Callback0, boolean z, int v3, Object object0) {
        if((v3 & 0x20) != 0) {
            z = true;
        }
        pagedStorage0.init(v, pagingSource$LoadResult$Page0, v1, v2, pagedStorage$Callback0, z);
    }

    public final boolean needsTrimFromEnd(int v, int v1) {
        return this.b(v, v1, this.a.size() - 1);
    }

    public final boolean needsTrimFromFront(int v, int v1) {
        return this.b(v, v1, 0);
    }

    public final void prependPage$paging_common_release(@NotNull Page pagingSource$LoadResult$Page0, @Nullable Callback pagedStorage$Callback0) {
        Intrinsics.checkNotNullParameter(pagingSource$LoadResult$Page0, "page");
        int v = pagingSource$LoadResult$Page0.getData().size();
        if(v == 0) {
            return;
        }
        this.a.add(0, pagingSource$LoadResult$Page0);
        this.f = this.getDataCount() + v;
        int v1 = Math.min(this.getPlaceholdersBefore(), v);
        int v2 = v - v1;
        if(v1 != 0) {
            this.b = this.getPlaceholdersBefore() - v1;
        }
        this.d -= v2;
        if(pagedStorage$Callback0 != null) {
            pagedStorage$Callback0.onPagePrepended(this.getPlaceholdersBefore(), v1, v2);
        }
    }

    public static void prependPage$paging_common_release$default(PagedStorage pagedStorage0, Page pagingSource$LoadResult$Page0, Callback pagedStorage$Callback0, int v, Object object0) {
        if((v & 2) != 0) {
            pagedStorage$Callback0 = null;
        }
        pagedStorage0.prependPage$paging_common_release(pagingSource$LoadResult$Page0, pagedStorage$Callback0);
    }

    @Override
    public final Object remove(int v) {
        return this.removeAt(v);
    }

    public Object removeAt(int v) {
        return super.remove(v);
    }

    public final void setLastLoadAroundIndex(int v) {
        this.g = c.coerceIn(v - this.getPlaceholdersBefore(), 0, this.getDataCount() - 1);
    }

    public final boolean shouldPreTrimNewPage(int v, int v1, int v2) {
        return this.getDataCount() + v2 > v && this.a.size() > 1 && this.getDataCount() >= v1;
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @NotNull
    public final PagedStorage snapshot() {
        return new PagedStorage(this);
    }

    @Override
    @NotNull
    public String toString() {
        return "leading " + this.getPlaceholdersBefore() + ", dataCount " + this.getDataCount() + ", trailing " + this.getPlaceholdersAfter() + ' ' + CollectionsKt___CollectionsKt.joinToString$default(this.a, " ", null, null, 0, null, null, 62, null);
    }

    public final boolean trimFromEnd$paging_common_release(boolean z, int v, int v1, @NotNull Callback pagedStorage$Callback0) {
        Intrinsics.checkNotNullParameter(pagedStorage$Callback0, "callback");
        int v2 = 0;
        while(this.needsTrimFromEnd(v, v1)) {
            int v3 = ((Page)this.a.remove(this.a.size() - 1)).getData().size();
            v2 += v3;
            this.f = this.getDataCount() - v3;
        }
        this.g = c.coerceAtMost(this.g, this.getDataCount() - 1);
        if(v2 > 0) {
            int v4 = this.getDataCount() + this.getPlaceholdersBefore();
            if(z) {
                this.c = this.getPlaceholdersAfter() + v2;
                pagedStorage$Callback0.onPagesSwappedToPlaceholder(v4, v2);
                return v2 > 0;
            }
            pagedStorage$Callback0.onPagesRemoved(v4, v2);
        }
        return v2 > 0;
    }

    public final boolean trimFromFront$paging_common_release(boolean z, int v, int v1, @NotNull Callback pagedStorage$Callback0) {
        Intrinsics.checkNotNullParameter(pagedStorage$Callback0, "callback");
        int v2 = 0;
        while(this.needsTrimFromFront(v, v1)) {
            int v3 = ((Page)this.a.remove(0)).getData().size();
            v2 += v3;
            this.f = this.getDataCount() - v3;
        }
        this.g = c.coerceAtLeast(this.g - v2, 0);
        if(v2 > 0) {
            if(z) {
                this.b = this.getPlaceholdersBefore() + v2;
                pagedStorage$Callback0.onPagesSwappedToPlaceholder(this.getPlaceholdersBefore(), v2);
                return v2 > 0;
            }
            this.d += v2;
            pagedStorage$Callback0.onPagesRemoved(this.getPlaceholdersBefore(), v2);
        }
        return v2 > 0;
    }
}

