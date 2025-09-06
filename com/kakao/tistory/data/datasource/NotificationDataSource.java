package com.kakao.tistory.data.datasource;

import androidx.paging.PagingSource.LoadParams;
import androidx.paging.PagingSource.LoadResult.Error;
import androidx.paging.PagingSource.LoadResult.Page;
import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import com.kakao.tistory.domain.ErrorModelThrowable;
import com.kakao.tistory.domain.entity.NotificationItem.Banner;
import com.kakao.tistory.domain.entity.NotificationItem.Empty;
import com.kakao.tistory.domain.entity.NotificationItem.Notification;
import com.kakao.tistory.domain.entity.common.NotificationItemListModel;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.NotificationRepository.DefaultImpls;
import com.kakao.tistory.domain.repository.NotificationRepository;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001A\u00020\u00022\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\nH\u0016¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00102\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00020\u000EH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/kakao/tistory/data/datasource/NotificationDataSource;", "Landroidx/paging/PagingSource;", "", "Lcom/kakao/tistory/domain/entity/NotificationItem;", "Lcom/kakao/tistory/domain/repository/NotificationRepository;", "notificationRepository", "", "sortType", "<init>", "(Lcom/kakao/tistory/domain/repository/NotificationRepository;Ljava/lang/String;)V", "Landroidx/paging/PagingState;", "state", "getRefreshKey", "(Landroidx/paging/PagingState;)Ljava/lang/Integer;", "Landroidx/paging/PagingSource$LoadParams;", "params", "Landroidx/paging/PagingSource$LoadResult;", "load", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNotificationDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDataSource.kt\ncom/kakao/tistory/data/datasource/NotificationDataSource\n+ 2 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n15#2,2:57\n17#2,3:87\n819#3:59\n847#3,2:60\n800#3,11:63\n1603#3,9:74\n1855#3:83\n1856#3:85\n1612#3:86\n1#4:62\n1#4:84\n*S KotlinDebug\n*F\n+ 1 NotificationDataSource.kt\ncom/kakao/tistory/data/datasource/NotificationDataSource\n*L\n29#1:57,2\n29#1:87,3\n32#1:59\n32#1:60,2\n48#1:63,11\n48#1:74,9\n48#1:83\n48#1:85\n48#1:86\n48#1:84\n*E\n"})
public final class NotificationDataSource extends PagingSource {
    public final NotificationRepository a;
    public final String b;
    public final LinkedHashSet c;

    public NotificationDataSource(@NotNull NotificationRepository notificationRepository0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(notificationRepository0, "notificationRepository");
        Intrinsics.checkNotNullParameter(s, "sortType");
        super();
        this.a = notificationRepository0;
        this.b = s;
        this.c = new LinkedHashSet();
    }

    @NotNull
    public Integer getRefreshKey(@NotNull PagingState pagingState0) {
        Intrinsics.checkNotNullParameter(pagingState0, "state");
        this.c.clear();
        return 1;
    }

    @Override  // androidx.paging.PagingSource
    public Object getRefreshKey(PagingState pagingState0) {
        return this.getRefreshKey(pagingState0);
    }

    @Override  // androidx.paging.PagingSource
    @Nullable
    public Object load(@NotNull LoadParams pagingSource$LoadParams0, @NotNull Continuation continuation0) {
        NotificationDataSource notificationDataSource0;
        int v2;
        h h0;
        if(continuation0 instanceof h) {
            h0 = (h)continuation0;
            int v = h0.e;
            if((v & 0x80000000) == 0) {
                h0 = new h(this, continuation0);
            }
            else {
                h0.e = v ^ 0x80000000;
            }
        }
        else {
            h0 = new h(this, continuation0);
        }
        Object object0 = h0.c;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(h0.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Integer integer0 = (Integer)pagingSource$LoadParams0.getKey();
                int v1 = integer0 == null ? 1 : ((int)integer0);
                v2 = v1 == 1 ? 1 : 0;
                h0.a = this;
                h0.b = v2;
                h0.e = 1;
                object0 = DefaultImpls.getNotifications$default(this.a, v1, 0, this.b, h0, 2, null);
                if(object0 == object1) {
                    return object1;
                }
                notificationDataSource0 = this;
                break;
            }
            case 1: {
                v2 = h0.b;
                notificationDataSource0 = h0.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            NotificationItemListModel notificationItemListModel0 = (NotificationItemListModel)((Success)(((Result)object0))).getData();
            ArrayList arrayList0 = new ArrayList();
            List list0 = notificationItemListModel0.getItems();
            if(list0 != null) {
                ArrayList arrayList1 = new ArrayList();
                for(Object object2: list0) {
                    Long long0 = ((Notification)object2).getId();
                    if(!notificationDataSource0.c.contains(Boxing.boxLong((long0 == null ? 0L : ((long)long0))))) {
                        arrayList1.add(object2);
                    }
                }
                arrayList0.addAll(arrayList1);
            }
            if(v2 != 0) {
                int v3 = arrayList0.size();
                if(arrayList0.isEmpty()) {
                    arrayList0.add(new Empty());
                }
                List list1 = notificationItemListModel0.getBanners();
                if(list1 != null) {
                    for(Object object3: CollectionsKt___CollectionsKt.reversed(list1)) {
                        Banner notificationItem$Banner0 = (Banner)object3;
                        if(v3 > notificationItem$Banner0.getPosition() - 1) {
                            arrayList0.add(notificationItem$Banner0.getPosition() - 1, notificationItem$Banner0);
                        }
                        else {
                            arrayList0.add(notificationItem$Banner0);
                        }
                    }
                }
            }
            LinkedHashSet linkedHashSet0 = notificationDataSource0.c;
            ArrayList arrayList2 = new ArrayList();
            for(Object object4: arrayList0) {
                if(object4 instanceof Notification) {
                    arrayList2.add(object4);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for(Object object5: arrayList2) {
                Long long1 = ((Notification)object5).getId();
                if(long1 != null) {
                    arrayList3.add(long1);
                }
            }
            linkedHashSet0.addAll(arrayList3);
            return new Page(arrayList0, null, notificationItemListModel0.getNextPage());
        }
        return ((Result)object0) instanceof Fail ? new Error(new ErrorModelThrowable(((Fail)(((Result)object0))).getErrorModel())) : new Error(new Throwable());
    }
}

