package com.kakao.tistory.presentation.screen.notification;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.kakao.tistory.presentation.view.common.bottomsheet.CommonBottomDialogFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i extends Lambda implements Function1 {
    public final NotificationViewModel a;
    public final Context b;

    public i(NotificationViewModel notificationViewModel0, Context context0) {
        this.a = notificationViewModel0;
        this.b = context0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Unit)object0), "it");
        List list0 = (List)this.a.getSortItems().getValue();
        if(list0 != null) {
            Context context0 = this.b;
            NotificationViewModel notificationViewModel0 = this.a;
            if((context0 instanceof FragmentActivity ? ((FragmentActivity)context0) : null) != null) {
                CommonBottomDialogFragment commonBottomDialogFragment0 = CommonBottomDialogFragment.Companion.newInstance();
                commonBottomDialogFragment0.setItems(CollectionsKt___CollectionsKt.toMutableList(list0));
                commonBottomDialogFragment0.setOnSelectedItem(new h(notificationViewModel0));
                commonBottomDialogFragment0.show(((FragmentActivity)context0).getSupportFragmentManager(), "CommonBottomDialogFragment");
            }
        }
        return Unit.INSTANCE;
    }
}

