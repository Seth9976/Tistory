package com.kakao.tistory.presentation.view.blog;

import androidx.compose.runtime.State;
import com.kakao.tistory.domain.entity.Blog;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class e0 extends Lambda implements Function0 {
    public final Blog a;
    public final State b;

    public e0(Blog blog0, State state0) {
        this.a = blog0;
        this.b = state0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Pair pair0 = BlogFollowingFragment.access$FollowingList$lambda$0(this.b);
        if(Intrinsics.areEqual((pair0 == null ? null : ((Long)pair0.getFirst())), this.a.getId())) {
            Pair pair1 = BlogFollowingFragment.access$FollowingList$lambda$0(this.b);
            return pair1 == null ? false : Boolean.valueOf(((Boolean)pair1.getSecond()).booleanValue());
        }
        return Boolean.valueOf(this.a.isSubscriber());
    }
}

