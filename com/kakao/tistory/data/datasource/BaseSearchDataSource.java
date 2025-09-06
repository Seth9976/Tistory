package com.kakao.tistory.data.datasource;

import androidx.paging.PagingSource.LoadParams;
import androidx.paging.PagingSource.LoadResult.Error;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.SearchResultItem.BlogItem;
import com.kakao.tistory.domain.entity.SearchResultItem.Empty;
import com.kakao.tistory.domain.entity.SearchResultItem.Post;
import com.kakao.tistory.domain.entity.SearchResultItem.Top;
import com.kakao.tistory.domain.entity.common.ItemListModel;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 &2\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002&\'B\u0013\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J^\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\b\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\u00022 \u0010\u000F\u001A\u001C\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u000E0\f2\u0012\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000E0\u0010H¤@¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00172\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001C\u001A\u00020\u00022\u0012\u0010\u001B\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001AH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ)\u0010\"\u001A\b\u0012\u0004\u0012\u00020\u00030!2\f\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001F0\u001E2\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\"\u0010#J)\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00030!2\f\u0010 \u001A\b\u0012\u0004\u0012\u00020$0\u001E2\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b%\u0010#¨\u0006("}, d2 = {"Lcom/kakao/tistory/data/datasource/BaseSearchDataSource;", "Landroidx/paging/PagingSource;", "", "Lcom/kakao/tistory/domain/entity/SearchResultItem;", "", "blogName", "<init>", "(Ljava/lang/String;)V", "key", "", "isInit", "loadSize", "Lkotlin/Function2;", "", "", "onSuccess", "Lkotlin/Function1;", "Lcom/kakao/android/base/model/ErrorModel;", "onError", "loadItems", "(IZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/domain/entity/entry/EntryItem;", "items", "", "convertEntryItems", "(Lcom/kakao/tistory/domain/entity/common/ItemListModel;Z)Ljava/util/List;", "Lcom/kakao/tistory/domain/entity/Blog;", "convertBlogItems", "Companion", "DataType", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBaseSearchDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseSearchDataSource.kt\ncom/kakao/tistory/data/datasource/BaseSearchDataSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1549#2:91\n1620#2,3:92\n1549#2:96\n1620#2,3:97\n1#3:95\n*S KotlinDebug\n*F\n+ 1 BaseSearchDataSource.kt\ncom/kakao/tistory/data/datasource/BaseSearchDataSource\n*L\n68#1:91\n68#1:92,3\n86#1:96\n86#1:97,3\n*E\n"})
public abstract class BaseSearchDataSource extends PagingSource {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/data/datasource/BaseSearchDataSource$Companion;", "", "", "DEFAULT_SORT_TYPE", "Ljava/lang/String;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/data/datasource/BaseSearchDataSource$DataType;", "", "POST", "TAG", "BLOG", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum DataType {
        POST,
        TAG,
        BLOG;

        public static final DataType[] a;
        public static final EnumEntries b;

        static {
            DataType.a = arr_baseSearchDataSource$DataType;
            Intrinsics.checkNotNullParameter(arr_baseSearchDataSource$DataType, "entries");
            DataType.b = new a(arr_baseSearchDataSource$DataType);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return DataType.b;
        }
    }

    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String DEFAULT_SORT_TYPE = "accuracy";
    public final String a;

    static {
        BaseSearchDataSource.Companion = new Companion(null);
    }

    public BaseSearchDataSource() {
        this(null, 1, null);
    }

    public BaseSearchDataSource(@Nullable String s) {
        this.a = s;
    }

    public BaseSearchDataSource(String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            s = null;
        }
        this(s);
    }

    public static Object a(BaseSearchDataSource baseSearchDataSource0, LoadParams pagingSource$LoadParams0, Continuation continuation0) {
        com.kakao.tistory.data.datasource.a a0;
        if(continuation0 instanceof com.kakao.tistory.data.datasource.a) {
            a0 = (com.kakao.tistory.data.datasource.a)continuation0;
            int v = a0.d;
            if((v & 0x80000000) == 0) {
                a0 = new com.kakao.tistory.data.datasource.a(baseSearchDataSource0, continuation0);
            }
            else {
                a0.d = v ^ 0x80000000;
            }
        }
        else {
            a0 = new com.kakao.tistory.data.datasource.a(baseSearchDataSource0, continuation0);
        }
        Object object0 = a0.b;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.d) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Integer integer0 = (Integer)pagingSource$LoadParams0.getKey();
                int v1 = integer0 == null ? 1 : ((int)integer0);
                ObjectRef ref$ObjectRef0 = new ObjectRef();
                ref$ObjectRef0.element = new Error(new Throwable());
                b b0 = new b(ref$ObjectRef0);
                c c0 = new c(ref$ObjectRef0);
                a0.a = ref$ObjectRef0;
                a0.d = 1;
                return baseSearchDataSource0.loadItems(v1, v1 == 1, pagingSource$LoadParams0.getLoadSize(), b0, c0, a0) == object1 ? object1 : ref$ObjectRef0.element;
            }
            case 1: {
                ObjectRef ref$ObjectRef1 = a0.a;
                ResultKt.throwOnFailure(object0);
                return ref$ObjectRef1.element;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @NotNull
    public final List convertBlogItems(@NotNull ItemListModel itemListModel0, boolean z) {
        List list1;
        Intrinsics.checkNotNullParameter(itemListModel0, "items");
        List list0 = itemListModel0.getItems();
        if(list0 == null || list0.isEmpty()) {
            list1 = new ArrayList();
            if(z) {
                ((ArrayList)list1).add(new Empty());
            }
        }
        else {
            list1 = new ArrayList();
            if(z) {
                Long long0 = itemListModel0.getTotalCount();
                ((ArrayList)list1).add(new Top((long0 == null ? 0L : ((long)long0)), null, false, 6, null));
            }
            List list2 = itemListModel0.getItems();
            if(list2 != null) {
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list2, 10));
                for(Object object0: list2) {
                    arrayList0.add(new BlogItem(((Blog)object0)));
                }
                ((ArrayList)list1).addAll(arrayList0);
                return list1;
            }
        }
        return list1;
    }

    @NotNull
    public final List convertEntryItems(@NotNull ItemListModel itemListModel0, boolean z) {
        String s;
        List list1;
        Intrinsics.checkNotNullParameter(itemListModel0, "items");
        List list0 = itemListModel0.getItems();
        if(list0 == null || list0.isEmpty()) {
            list1 = new ArrayList();
            if(z) {
                ((ArrayList)list1).add(new Empty());
            }
        }
        else {
            list1 = new ArrayList();
            if(z) {
                boolean z1 = this.a == null || p.isBlank(this.a);
                if(z1) {
                    s = null;
                }
                else {
                    List list2 = itemListModel0.getItems();
                    if(list2 == null) {
                        s = null;
                    }
                    else {
                        EntryItem entryItem0 = (EntryItem)CollectionsKt___CollectionsKt.getOrNull(list2, 0);
                        s = entryItem0 == null ? null : entryItem0.getBlogTitle();
                    }
                }
                Long long0 = itemListModel0.getTotalCount();
                ((ArrayList)list1).add(new Top((long0 == null ? 0L : ((long)long0)), s, z1));
            }
            List list3 = itemListModel0.getItems();
            if(list3 != null) {
                ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(list3, 10));
                for(Object object0: list3) {
                    arrayList0.add(new Post(((EntryItem)object0)));
                }
                ((ArrayList)list1).addAll(arrayList0);
                return list1;
            }
        }
        return list1;
    }

    @NotNull
    public Integer getRefreshKey(@NotNull PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(pagingState0, "state");
        return 1;
    }

    @Override  // androidx.paging.PagingSource
    public Object getRefreshKey(PagingState pagingState0) {
        return this.getRefreshKey(pagingState0);
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull LoadParams pagingSource$LoadParams0, @NotNull Continuation continuation0) {
        return BaseSearchDataSource.a(this, pagingSource$LoadParams0, continuation0);
    }

    @Nullable
    public abstract Object loadItems(int arg1, boolean arg2, int arg3, @NotNull Function2 arg4, @NotNull Function1 arg5, @NotNull Continuation arg6);
}

