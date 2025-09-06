package com.kakao.tistory.presentation.screen.blogswitch;

import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchIntent.UpdateUser;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

public final class k0 implements FlowCollector {
    public final BlogSwitchViewModel a;

    public k0(BlogSwitchViewModel blogSwitchViewModel0) {
        this.a = blogSwitchViewModel0;
        super();
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object object0, Continuation continuation0) {
        UpdateUser blogSwitchIntent$UpdateUser0 = new UpdateUser(((User)object0));
        this.a.sendIntent(blogSwitchIntent$UpdateUser0);
        return Unit.INSTANCE;
    }
}

