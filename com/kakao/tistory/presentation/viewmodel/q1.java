package com.kakao.tistory.presentation.viewmodel;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class q1 extends Lambda implements Function1 {
    public static final q1 a;

    static {
        q1.a = new q1();
    }

    public q1() {
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Blog blog0 = ((EntryItem)object0).getBlog();
        if(blog0 != null) {
            User user0 = blog0.getOwnerUser();
            if(user0 != null) {
                User user1 = User.copy$default(user0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0x7FFF, null);
                if(user1 != null) {
                    user1.setCurrentBlog(((EntryItem)object0).getBlog());
                    return user1;
                }
            }
        }
        return null;
    }
}

