package com.kakao.tistory.domain.entity.common;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003R\u0019\u0010\u0004\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/domain/entity/common/NotificationItemListModel;", "Lcom/kakao/tistory/domain/entity/common/ItemListModel;", "Lcom/kakao/tistory/domain/entity/NotificationItem$Notification;", "()V", "banners", "", "Lcom/kakao/tistory/domain/entity/NotificationItem$Banner;", "getBanners", "()Ljava/util/List;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class NotificationItemListModel extends ItemListModel {
    @Nullable
    private final List banners;

    @Nullable
    public final List getBanners() {
        return this.banners;
    }
}

