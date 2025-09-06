package com.kakao.tistory.domain.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001A\u00020\u0004H¦@¢\u0006\u0002\u0010\u000BJ\u001A\u0010\f\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000E0\r0\bH¦@¢\u0006\u0002\u0010\u000FJ\u0014\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00110\bH¦@¢\u0006\u0002\u0010\u000FJ0\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00130\b2\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u0018H¦@¢\u0006\u0002\u0010\u0019J\u001C\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001A\u00020\u0004H¦@¢\u0006\u0002\u0010\u000BR\u0018\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/domain/repository/NotificationRepository;", "", "newCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "getNewCount", "()Lkotlinx/coroutines/flow/StateFlow;", "deleteNotification", "Lcom/kakao/tistory/domain/entity/common/Result;", "", "notificationId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotificationGroups", "", "Lcom/kakao/tistory/domain/entity/SortItem$NotificationSortItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotificationNewCount", "Lcom/kakao/tistory/domain/entity/common/Count;", "getNotifications", "Lcom/kakao/tistory/domain/entity/common/NotificationItemListModel;", "nextPage", "", "resultSize", "sortType", "", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putNotificationRead", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface NotificationRepository {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getNotifications$default(NotificationRepository notificationRepository0, int v, int v1, String s, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotifications");
            }
            if((v2 & 1) != 0) {
                v = 1;
            }
            if((v2 & 2) != 0) {
                v1 = 20;
            }
            return notificationRepository0.getNotifications(v, v1, s, continuation0);
        }
    }

    @Nullable
    Object deleteNotification(long arg1, @NotNull Continuation arg2);

    @NotNull
    StateFlow getNewCount();

    @Nullable
    Object getNotificationGroups(@NotNull Continuation arg1);

    @Nullable
    Object getNotificationNewCount(@NotNull Continuation arg1);

    @Nullable
    Object getNotifications(int arg1, int arg2, @NotNull String arg3, @NotNull Continuation arg4);

    @Nullable
    Object putNotificationRead(long arg1, @NotNull Continuation arg2);
}

