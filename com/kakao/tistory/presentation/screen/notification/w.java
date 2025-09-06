package com.kakao.tistory.presentation.screen.notification;

import com.kakao.tistory.data.datasource.NotificationDataSource;
import com.kakao.tistory.domain.entity.SortItem.NotificationSortItem;
import com.kakao.tistory.domain.repository.NotificationRepository;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class w extends Lambda implements Function0 {
    public final NotificationViewModel a;

    public w(NotificationViewModel notificationViewModel0) {
        this.a = notificationViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String s;
        NotificationRepository notificationRepository0 = this.a.h;
        NotificationSortItem sortItem$NotificationSortItem0 = (NotificationSortItem)this.a.getSelectedSortItem().getValue();
        if(sortItem$NotificationSortItem0 == null) {
            s = "all";
        }
        else {
            s = sortItem$NotificationSortItem0.getGroupType();
            if(s == null) {
                s = "all";
            }
        }
        NotificationDataSource notificationDataSource0 = new NotificationDataSource(notificationRepository0, s);
        this.a.i = notificationDataSource0;
        return notificationDataSource0;
    }
}

