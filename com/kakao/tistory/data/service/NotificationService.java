package com.kakao.tistory.data.service;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001E\u0010\u0002\u001A\u00020\u00032\u000E\b\u0001\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0002\u0010\u0007J\u001A\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\tH§@¢\u0006\u0002\u0010\u000BJ\u0014\u0010\f\u001A\b\u0012\u0004\u0012\u00020\r0\tH§@¢\u0006\u0002\u0010\u000BJ2\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u000F0\t2\b\b\u0001\u0010\u0010\u001A\u00020\u00112\b\b\u0003\u0010\u0012\u001A\u00020\u00112\b\b\u0001\u0010\u0013\u001A\u00020\u0014H§@¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001A\u00020\u00032\b\b\u0001\u0010\u0017\u001A\u00020\u0006H§@¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/data/service/NotificationService;", "", "deleteNotification", "", "ids", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotificationGroups", "Lcom/kakao/tistory/domain/entity/common/ItemModel;", "Lcom/kakao/tistory/domain/entity/SortItem$NotificationSortItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNotificationNewCount", "Lcom/kakao/tistory/domain/entity/common/Count;", "getNotifications", "Lcom/kakao/tistory/domain/entity/common/NotificationItemListModel;", "nextPage", "", "resultSize", "groupType", "", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putNotificationRead", "notificationId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface NotificationService {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object getNotifications$default(NotificationService notificationService0, int v, int v1, String s, Continuation continuation0, int v2, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotifications");
            }
            if((v2 & 2) != 0) {
                v1 = 20;
            }
            return notificationService0.getNotifications(v, v1, s, continuation0);
        }
    }

    @Nullable
    @FormUrlEncoded
    @HTTP(hasBody = true, method = "DELETE", path = "/app/v3/user/notification")
    Object deleteNotification(@NotNull @Field("ids") List arg1, @NotNull Continuation arg2);

    @Nullable
    @GET("/app/v3/user/notification/groups")
    Object getNotificationGroups(@NotNull Continuation arg1);

    @Nullable
    @GET("/app/v3/user/notification/newCount")
    Object getNotificationNewCount(@NotNull Continuation arg1);

    @Nullable
    @GET("/app/v3/user/notification")
    Object getNotifications(@Query("page") int arg1, @Query("resultSize") int arg2, @NotNull @Query("groupType") String arg3, @NotNull Continuation arg4);

    @Nullable
    @PUT("/app/v3/user/notification/{notificationId}/read")
    Object putNotificationRead(@Path("notificationId") long arg1, @NotNull Continuation arg2);
}

