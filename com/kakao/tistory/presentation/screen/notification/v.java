package com.kakao.tistory.presentation.screen.notification;

import com.kakao.android.base.BaseKt;
import com.kakao.tistory.domain.entity.SortItem.NotificationSortItem;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import qd.a;

public final class v extends SuspendLambda implements Function2 {
    public int a;
    public final NotificationViewModel b;

    public v(NotificationViewModel notificationViewModel0, Continuation continuation0) {
        this.b = notificationViewModel0;
        super(2, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object object0, Continuation continuation0) {
        return new v(this.b, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        CoroutineScope coroutineScope0 = (CoroutineScope)object0;
        return new v(this.b, ((Continuation)object1)).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                this.a = 1;
                object0 = this.b.h.getNotificationGroups(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        NotificationViewModel notificationViewModel0 = this.b;
        if(((Result)object0) instanceof Success) {
            NotificationViewModel.access$updateSortItems(notificationViewModel0, ((List)((Success)(((Result)object0))).getData()));
            return Unit.INSTANCE;
        }
        if(((Result)object0) instanceof Fail) {
            EnumEntries enumEntries0 = NotificationSortType.getEntries();
            ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(enumEntries0, 10));
            for(Object object2: enumEntries0) {
                String s = BaseKt.getAppContext().getString(((NotificationSortType)object2).getTitleResourceId());
                Intrinsics.checkNotNullExpressionValue(s, "getString(...)");
                arrayList0.add(new NotificationSortItem(((NotificationSortType)object2).getGroupType(), s));
            }
            NotificationViewModel.access$updateSortItems(notificationViewModel0, arrayList0);
        }
        return Unit.INSTANCE;
    }
}

