package com.kakao.tistory.presentation.view.blog;

import com.kakao.tistory.domain.entity.SortItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class k0 extends Lambda implements Function1 {
    public final BlogFollowingFragment a;

    public k0(BlogFollowingFragment blogFollowingFragment0) {
        this.a = blogFollowingFragment0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        if(((SortItem)object0) != null) {
            BlogFollowingFragment.access$getBlogFollowViewModel(this.a).updateBlogFollowingSortType(((SortItem)object0));
        }
        return Unit.INSTANCE;
    }
}

