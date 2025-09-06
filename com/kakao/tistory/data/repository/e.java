package com.kakao.tistory.data.repository;

import androidx.lifecycle.MutableLiveData;
import com.kakao.tistory.domain.entity.Account;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.entity.UserKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class e extends Lambda implements Function1 {
    public final AccountRepositoryImpl a;

    public e(AccountRepositoryImpl accountRepositoryImpl0) {
        this.a = accountRepositoryImpl0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Blog blog0;
        User user0 = null;
        this.a.a((((Account)object0) == null ? null : ((Account)object0).getUser()));
        this.a.isKakaoAccount().postValue(Boolean.valueOf(UserKt.isKakaoAccount((((Account)object0) == null ? null : ((Account)object0).getUser()))));
        MutableLiveData mutableLiveData0 = this.a.getOldDefaultBlog();
        if(((Account)object0) == null) {
            blog0 = null;
        }
        else {
            User user1 = ((Account)object0).getUser();
            blog0 = user1 == null ? null : user1.getDefaultBlog();
        }
        mutableLiveData0.postValue(blog0);
        if(((Account)object0) != null) {
            user0 = ((Account)object0).getUser();
        }
        AccountRepositoryImpl accountRepositoryImpl0 = this.a;
        if(user0 != null) {
            user0.setCurrentBlog(((Blog)accountRepositoryImpl0.getOldCurrentBlog().getValue()));
        }
        return user0;
    }
}

