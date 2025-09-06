package com.kakao.tistory.data.datasource.comment;

import androidx.paging.PagingSource.LoadParams;
import androidx.paging.PagingSource.LoadResult.Error;
import androidx.paging.PagingSource.LoadResult.Page;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.kakao.tistory.domain.ErrorModelThrowable;
import com.kakao.tistory.domain.entity.CommentItemType.CommentHeader;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.domain.entity.CommentItemType.CommentReplyItem;
import com.kakao.tistory.domain.entity.CommentItemType.CommentReplyMoreItem;
import com.kakao.tistory.domain.entity.CommentItemType;
import com.kakao.tistory.domain.entity.common.CommentItemListModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\n\b&\u0018\u0000 (2\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001:\u0002()B\u0011\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u00032\b\u0010\u000B\u001A\u0004\u0018\u00010\u0004H¦@¢\u0006\u0004\b\u000E\u0010\u000FJ;\u0010\u0012\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u001E\u0010\u0011\u001A\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0017\u001A\u001A\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u00162\u0018\u0010\u0015\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001F\u001A\u00020\u00048\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\"\u0010\'\u001A\u00020 8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lcom/kakao/tistory/data/datasource/comment/CommentDataSource;", "Landroidx/paging/PagingSource;", "Lkotlin/Pair;", "Lcom/kakao/tistory/data/datasource/comment/ListMode;", "", "Lcom/kakao/tistory/domain/entity/CommentItemType;", "Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Query;", "query", "<init>", "(Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Query;)V", "listMode", "commentId", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/common/CommentItemListModel;", "getCommentList", "(Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Query;Lcom/kakao/tistory/data/datasource/comment/ListMode;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Lkotlin/Pair;", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "J", "getCommentCount", "()J", "setCommentCount", "(J)V", "commentCount", "", "d", "Z", "getShowDeleteCommentToast", "()Z", "setShowDeleteCommentToast", "(Z)V", "showDeleteCommentToast", "Companion", "Query", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCommentDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentDataSource.kt\ncom/kakao/tistory/data/datasource/comment/CommentDataSource\n+ 2 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n15#2,2:195\n17#2,3:203\n288#3:197\n1747#3,3:198\n289#3:201\n1549#3:206\n1620#3,3:207\n1360#3:210\n1446#3,5:211\n288#3,2:216\n533#3,6:218\n819#3:224\n847#3,2:225\n1603#3,9:227\n1855#3:236\n1856#3:238\n1612#3:239\n1#4:202\n1#4:237\n*S KotlinDebug\n*F\n+ 1 CommentDataSource.kt\ncom/kakao/tistory/data/datasource/comment/CommentDataSource\n*L\n67#1:195,2\n67#1:203,3\n71#1:197\n72#1:198,3\n71#1:201\n94#1:206\n94#1:207,3\n137#1:210\n137#1:211,5\n167#1:216,2\n168#1:218,6\n172#1:224\n172#1:225,2\n180#1:227,9\n180#1:236\n180#1:238\n180#1:239\n180#1:237\n*E\n"})
public abstract class CommentDataSource extends PagingSource {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Companion;", "", "", "REPLY_DISPLAY_DEFAULT_SIZE", "I", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\b\u0010\t\u001A\u0004\u0018\u00010\u0004\u0012\u001C\b\u0002\u0010\f\u001A\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u000B\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0012\u0010\u0011\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001A\u0004\u0018\u00010\u0002H\u00C6\u0003\u00A2\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001A\u00020\u0007H\u00C6\u0003\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001A\u0004\u0018\u00010\u0004H\u00C6\u0003\u00A2\u0006\u0004\b\u0016\u0010\u0012J$\u0010\u0017\u001A\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u000BH\u00C6\u0003\u00A2\u0006\u0004\b\u0017\u0010\u0018Jf\u0010\u0019\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00042\u001C\b\u0002\u0010\f\u001A\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u000BH\u00C6\u0001\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0010\u0010\u001B\u001A\u00020\u0002H\u00D6\u0001\u00A2\u0006\u0004\b\u001B\u0010\u0010J\u0010\u0010\u001D\u001A\u00020\u001CH\u00D6\u0001\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u001A\u0010!\u001A\u00020 2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010\u0010R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010\u0012R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b)\u0010$\u001A\u0004\b*\u0010\u0010R\"\u0010\b\u001A\u00020\u00078\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b+\u0010,\u001A\u0004\b-\u0010\u0015\"\u0004\b.\u0010/R$\u0010\t\u001A\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b0\u0010\'\u001A\u0004\b1\u0010\u0012\"\u0004\b2\u00103R+\u0010\f\u001A\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u000B8\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u0010\u0018\u00A8\u00067"}, d2 = {"Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Query;", "", "", "blogName", "", "entryId", "password", "Lcom/kakao/tistory/data/datasource/comment/ListMode;", "listMode", "commentId", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "replyMoreCommentIdSet", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kakao/tistory/data/datasource/comment/ListMode;Ljava/lang/Long;Ljava/util/HashSet;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "component4", "()Lcom/kakao/tistory/data/datasource/comment/ListMode;", "component5", "component6", "()Ljava/util/HashSet;", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kakao/tistory/data/datasource/comment/ListMode;Ljava/lang/Long;Ljava/util/HashSet;)Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Query;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBlogName", "b", "Ljava/lang/Long;", "getEntryId", "c", "getPassword", "d", "Lcom/kakao/tistory/data/datasource/comment/ListMode;", "getListMode", "setListMode", "(Lcom/kakao/tistory/data/datasource/comment/ListMode;)V", "e", "getCommentId", "setCommentId", "(Ljava/lang/Long;)V", "f", "Ljava/util/HashSet;", "getReplyMoreCommentIdSet", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Query {
        public final String a;
        public final Long b;
        public final String c;
        public ListMode d;
        public Long e;
        public final HashSet f;

        public Query(@NotNull String s, @Nullable Long long0, @Nullable String s1, @NotNull ListMode listMode0, @Nullable Long long1, @Nullable HashSet hashSet0) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(listMode0, "listMode");
            super();
            this.a = s;
            this.b = long0;
            this.c = s1;
            this.d = listMode0;
            this.e = long1;
            this.f = hashSet0;
        }

        public Query(String s, Long long0, String s1, ListMode listMode0, Long long1, HashSet hashSet0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 0x20) != 0) {
                hashSet0 = new HashSet();
            }
            this(s, long0, s1, listMode0, long1, hashSet0);
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @Nullable
        public final Long component2() {
            return this.b;
        }

        @Nullable
        public final String component3() {
            return this.c;
        }

        @NotNull
        public final ListMode component4() {
            return this.d;
        }

        @Nullable
        public final Long component5() {
            return this.e;
        }

        @Nullable
        public final HashSet component6() {
            return this.f;
        }

        @NotNull
        public final Query copy(@NotNull String s, @Nullable Long long0, @Nullable String s1, @NotNull ListMode listMode0, @Nullable Long long1, @Nullable HashSet hashSet0) {
            Intrinsics.checkNotNullParameter(s, "blogName");
            Intrinsics.checkNotNullParameter(listMode0, "listMode");
            return new Query(s, long0, s1, listMode0, long1, hashSet0);
        }

        public static Query copy$default(Query commentDataSource$Query0, String s, Long long0, String s1, ListMode listMode0, Long long1, HashSet hashSet0, int v, Object object0) {
            if((v & 1) != 0) {
                s = commentDataSource$Query0.a;
            }
            if((v & 2) != 0) {
                long0 = commentDataSource$Query0.b;
            }
            if((v & 4) != 0) {
                s1 = commentDataSource$Query0.c;
            }
            if((v & 8) != 0) {
                listMode0 = commentDataSource$Query0.d;
            }
            if((v & 16) != 0) {
                long1 = commentDataSource$Query0.e;
            }
            if((v & 0x20) != 0) {
                hashSet0 = commentDataSource$Query0.f;
            }
            return commentDataSource$Query0.copy(s, long0, s1, listMode0, long1, hashSet0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Query)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((Query)object0).a)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.b, ((Query)object0).b)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.c, ((Query)object0).c)) {
                return false;
            }
            if(this.d != ((Query)object0).d) {
                return false;
            }
            return Intrinsics.areEqual(this.e, ((Query)object0).e) ? Intrinsics.areEqual(this.f, ((Query)object0).f) : false;
        }

        @NotNull
        public final String getBlogName() {
            return this.a;
        }

        @Nullable
        public final Long getCommentId() {
            return this.e;
        }

        @Nullable
        public final Long getEntryId() {
            return this.b;
        }

        @NotNull
        public final ListMode getListMode() {
            return this.d;
        }

        @Nullable
        public final String getPassword() {
            return this.c;
        }

        @Nullable
        public final HashSet getReplyMoreCommentIdSet() {
            return this.f;
        }

        @Override
        public int hashCode() {
            int v = this.a.hashCode();
            int v1 = 0;
            int v2 = this.b == null ? 0 : this.b.hashCode();
            int v3 = this.c == null ? 0 : this.c.hashCode();
            int v4 = this.d.hashCode();
            int v5 = this.e == null ? 0 : this.e.hashCode();
            HashSet hashSet0 = this.f;
            if(hashSet0 != null) {
                v1 = hashSet0.hashCode();
            }
            return ((v4 + ((v * 0x1F + v2) * 0x1F + v3) * 0x1F) * 0x1F + v5) * 0x1F + v1;
        }

        public final void setCommentId(@Nullable Long long0) {
            this.e = long0;
        }

        public final void setListMode(@NotNull ListMode listMode0) {
            Intrinsics.checkNotNullParameter(listMode0, "<set-?>");
            this.d = listMode0;
        }

        @Override
        @NotNull
        public String toString() {
            return "Query(blogName=" + this.a + ", entryId=" + this.b + ", password=" + this.c + ", listMode=" + this.d + ", commentId=" + this.e + ", replyMoreCommentIdSet=" + this.f + ")";
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Query a;
    public final LinkedHashSet b;
    public long c;
    public boolean d;

    static {
        CommentDataSource.Companion = new Companion(null);
    }

    public CommentDataSource(@Nullable Query commentDataSource$Query0) {
        this.a = commentDataSource$Query0;
        this.b = new LinkedHashSet();
    }

    public static Object a(CommentDataSource commentDataSource0, LoadParams pagingSource$LoadParams0, Continuation continuation0) {
        Long long8;
        boolean z4;
        long v2;
        Iterator iterator3;
        CommentItemListModel commentItemListModel1;
        ListMode listMode1;
        Object object2;
        Long long0;
        Query commentDataSource$Query0;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.g;
            if((v & 0x80000000) == 0) {
                a0 = new a(commentDataSource0, continuation0);
            }
            else {
                a0.g = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(commentDataSource0, continuation0);
        }
        Object object0 = a0.e;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.g) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                commentDataSource$Query0 = commentDataSource0.a;
                if(commentDataSource$Query0 == null) {
                    return new Error(new Throwable());
                }
                Pair pair0 = (Pair)pagingSource$LoadParams0.getKey();
                if(pair0 == null) {
                    pair0 = new Pair(commentDataSource$Query0.getListMode(), commentDataSource$Query0.getCommentId());
                }
                ListMode listMode0 = (ListMode)pair0.component1();
                long0 = (Long)pair0.component2();
                a0.a = commentDataSource0;
                a0.b = commentDataSource$Query0;
                a0.c = listMode0;
                a0.d = long0;
                a0.g = 1;
                object2 = commentDataSource0.getCommentList(commentDataSource$Query0, listMode0, long0, a0);
                if(object2 == object1) {
                    return object1;
                }
                listMode1 = listMode0;
                break;
            }
            case 1: {
                Long long1 = a0.d;
                listMode1 = a0.c;
                commentDataSource$Query0 = a0.b;
                CommentDataSource commentDataSource1 = a0.a;
                ResultKt.throwOnFailure(object0);
                long0 = long1;
                commentDataSource0 = commentDataSource1;
                object2 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object2) != null) {
            if(((Result)object2) instanceof Success) {
                CommentItemListModel commentItemListModel0 = (CommentItemListModel)((Success)(((Result)object2))).getData();
                List list0 = commentItemListModel0.getItems();
                if(list0 != null) {
                    for(Object object3: list0) {
                        List list1 = ((CommentItem)object3).getChildren();
                        if(list1 == null || list1.isEmpty()) {
                            continue;
                        }
                        Iterator iterator1 = list1.iterator();
                    label_51:
                        if(!iterator1.hasNext()) {
                            continue;
                        }
                        Object object4 = iterator1.next();
                        if(long0 == null || ((CommentItem)object4).getId() != ((long)long0)) {
                            goto label_51;
                        }
                        goto label_56;
                    }
                    object3 = null;
                label_56:
                    if(((CommentItem)object3) != null) {
                        HashSet hashSet0 = commentDataSource$Query0.getReplyMoreCommentIdSet();
                        if(hashSet0 != null) {
                            hashSet0.add(Boxing.boxLong(((CommentItem)object3).getId()));
                        }
                    }
                }
                HashSet hashSet1 = commentDataSource$Query0.getReplyMoreCommentIdSet();
                commentDataSource0.getClass();
                List list2 = commentItemListModel0.getItems();
                if(list2 != null && !list2.isEmpty()) {
                    boolean z = listMode1 == ListMode.INIT || listMode1 == ListMode.COMMENT;
                    boolean z1 = commentItemListModel0.getHasPrev();
                    boolean z2 = commentItemListModel0.getHasNext();
                    Boolean boolean0 = commentItemListModel0.getExistBaseComment();
                    boolean z3 = boolean0 == null ? true : boolean0.booleanValue();
                    ArrayList arrayList0 = new ArrayList();
                    for(Iterator iterator2 = list2.iterator(); iterator2.hasNext(); iterator2 = iterator3) {
                        Object object5 = iterator2.next();
                        CommentItem commentItemType$CommentItem0 = (CommentItem)object5;
                        List list3 = CollectionsKt__CollectionsKt.mutableListOf(new CommentItemType[]{commentItemType$CommentItem0});
                        List list4 = commentItemType$CommentItem0.getChildren();
                        if(list4 == null || list4.isEmpty()) {
                            commentItemListModel1 = commentItemListModel0;
                            iterator3 = iterator2;
                        }
                        else if(list4.size() > 3 && (hashSet1 == null || !hashSet1.contains(commentItemType$CommentItem0.getId()))) {
                            commentItemListModel1 = commentItemListModel0;
                            iterator3 = iterator2;
                            list3.add(new CommentReplyMoreItem(commentItemType$CommentItem0.getId(), ((long)list4.size()) - 1L));
                            list3.add(new CommentReplyItem(commentItemType$CommentItem0, ((CommentItem)CollectionsKt___CollectionsKt.last(list4)), ((CommentItem)CollectionsKt___CollectionsKt.last(list4)).getUserId()));
                        }
                        else {
                            commentItemListModel1 = commentItemListModel0;
                            iterator3 = iterator2;
                            ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(list4, 10));
                            for(Object object6: list4) {
                                arrayList1.add(new CommentReplyItem(commentItemType$CommentItem0, ((CommentItem)object6), commentItemType$CommentItem0.getUserId()));
                            }
                            list3.addAll(arrayList1);
                        }
                        o.addAll(arrayList0, list3);
                        commentItemListModel0 = commentItemListModel1;
                    }
                    List list5 = CollectionsKt___CollectionsKt.toMutableList(arrayList0);
                    if(z) {
                        Long long2 = commentItemListModel0.getTotalCount();
                        commentDataSource0.c = long2 == null ? 0L : ((long)long2);
                        if(!z1) {
                            list5.add(0, CommentHeader.INSTANCE);
                        }
                        if(listMode1 == ListMode.COMMENT && !z3) {
                            commentDataSource0.d = true;
                        }
                    }
                    else {
                        if(listMode1 == ListMode.PREV && !z1) {
                            list5.add(0, CommentHeader.INSTANCE);
                        }
                        commentDataSource0.d = false;
                    }
                    Object object7 = null;
                    for(Object object8: list5) {
                        if(!(((CommentItemType)object8) instanceof CommentHeader)) {
                            object7 = object8;
                            break;
                        }
                    }
                    long v1 = -1L;
                    if(((CommentItemType)object7) instanceof CommentItem) {
                        Long long3 = ((CommentItem)(((CommentItemType)object7))).getParent();
                        v2 = long3 == null ? ((CommentItem)(((CommentItemType)object7))).getId() : ((long)long3);
                    }
                    else if(((CommentItemType)object7) instanceof CommentReplyItem) {
                        Long long4 = ((CommentReplyItem)(((CommentItemType)object7))).getCommentItem().getParent();
                        v2 = long4 == null ? -1L : ((long)long4);
                    }
                    else {
                        v2 = -1L;
                    }
                    Object object9 = null;
                    ListIterator listIterator0 = list5.listIterator(list5.size());
                    while(listIterator0.hasPrevious()) {
                        Object object10 = listIterator0.previous();
                        if(!(((CommentItemType)object10) instanceof CommentHeader)) {
                            object9 = object10;
                            break;
                        }
                    }
                    if(((CommentItemType)object9) instanceof CommentItem) {
                        Long long5 = ((CommentItem)(((CommentItemType)object9))).getParent();
                        v1 = long5 == null ? ((CommentItem)(((CommentItemType)object9))).getId() : ((long)long5);
                    }
                    else if(((CommentItemType)object9) instanceof CommentReplyItem) {
                        Long long6 = ((CommentReplyItem)(((CommentItemType)object9))).getCommentItem().getParent();
                        if(long6 != null) {
                            v1 = (long)long6;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    for(Object object11: list5) {
                        CommentItemType commentItemType0 = (CommentItemType)object11;
                        if(commentItemType0 instanceof CommentItem) {
                            z4 = commentDataSource0.b.contains(((CommentItem)commentItemType0).getId());
                        }
                        else if(commentItemType0 instanceof CommentReplyItem) {
                            Long long7 = ((CommentReplyItem)commentItemType0).getCommentItem().getId();
                            z4 = commentDataSource0.b.contains(long7);
                        }
                        else {
                            z4 = false;
                        }
                        if(!z4) {
                            arrayList3.add(object11);
                        }
                    }
                    arrayList2.addAll(arrayList3);
                    LinkedHashSet linkedHashSet0 = commentDataSource0.b;
                    ArrayList arrayList4 = new ArrayList();
                    for(Object object12: arrayList2) {
                        CommentItemType commentItemType1 = (CommentItemType)object12;
                        if(commentItemType1 instanceof CommentItem) {
                            long8 = ((CommentItem)commentItemType1).getId();
                        }
                        else {
                            long8 = commentItemType1 instanceof CommentReplyItem ? ((CommentReplyItem)commentItemType1).getCommentItem().getId() : null;
                        }
                        if(long8 != null) {
                            arrayList4.add(long8);
                        }
                    }
                    linkedHashSet0.addAll(arrayList4);
                    Pair pair1 = z1 ? new Pair(ListMode.PREV, v2) : null;
                    return z2 ? new Page(arrayList2, pair1, new Pair(ListMode.NEXT, v1)) : new Page(arrayList2, pair1, null);
                }
                return new Page(CollectionsKt__CollectionsKt.emptyList(), null, null);
            }
            if(((Result)object2) instanceof Fail) {
                return new Error(new ErrorModelThrowable(((Fail)(((Result)object2))).getErrorModel()));
            }
        }
        return new Page(CollectionsKt__CollectionsKt.emptyList(), null, null);
    }

    public final long getCommentCount() {
        return this.c;
    }

    @Nullable
    public abstract Object getCommentList(@NotNull Query arg1, @NotNull ListMode arg2, @Nullable Long arg3, @NotNull Continuation arg4);

    @Override  // androidx.paging.PagingSource
    public Object getRefreshKey(PagingState pagingState0) {
        return this.getRefreshKey(pagingState0);
    }

    @NotNull
    public Pair getRefreshKey(@NotNull PagingState pagingState0) {
        long v;
        ListMode listMode0;
        Intrinsics.checkNotNullParameter(pagingState0, "state");
        this.b.clear();
        Query commentDataSource$Query0 = this.a;
        if(commentDataSource$Query0 == null) {
            listMode0 = ListMode.INIT;
        }
        else {
            listMode0 = commentDataSource$Query0.getListMode();
            if(listMode0 == null) {
                listMode0 = ListMode.INIT;
            }
        }
        Query commentDataSource$Query1 = this.a;
        if(commentDataSource$Query1 == null) {
            v = -1L;
        }
        else {
            Long long0 = commentDataSource$Query1.getCommentId();
            v = long0 == null ? -1L : ((long)long0);
        }
        Pair pair0 = new Pair(listMode0, v);
        Query commentDataSource$Query2 = this.a;
        if(commentDataSource$Query2 != null) {
            commentDataSource$Query2.setCommentId(null);
        }
        Query commentDataSource$Query3 = this.a;
        if(commentDataSource$Query3 != null) {
            commentDataSource$Query3.setListMode(ListMode.INIT);
        }
        return pair0;
    }

    public final boolean getShowDeleteCommentToast() {
        return this.d;
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull LoadParams pagingSource$LoadParams0, @NotNull Continuation continuation0) {
        return CommentDataSource.a(this, pagingSource$LoadParams0, continuation0);
    }

    public final void setCommentCount(long v) {
        this.c = v;
    }

    public final void setShowDeleteCommentToast(boolean z) {
        this.d = z;
    }
}

