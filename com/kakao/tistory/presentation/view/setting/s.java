package com.kakao.tistory.presentation.view.setting;

import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.presentation.viewmodel.DefaultBlogViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class s extends FunctionReferenceImpl implements Function1 {
    public s(DefaultBlogViewModel defaultBlogViewModel0) {
        super(1, defaultBlogViewModel0, DefaultBlogViewModel.class, "onClickBlog", "onClickBlog(Lcom/kakao/tistory/domain/entity/Blog;)V", 0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        Intrinsics.checkNotNullParameter(((Blog)object0), "p0");
        ((DefaultBlogViewModel)this.receiver).onClickBlog(((Blog)object0));
        return Unit.INSTANCE;
    }
}

