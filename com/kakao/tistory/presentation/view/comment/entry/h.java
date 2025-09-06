package com.kakao.tistory.presentation.view.comment.entry;

import com.kakao.tistory.data.datasource.comment.PostCommentDataSource;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class h extends Lambda implements Function0 {
    public final PostCommentViewModel a;

    public h(PostCommentViewModel postCommentViewModel0) {
        this.a = postCommentViewModel0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PostCommentDataSource postCommentDataSource0 = new PostCommentDataSource(this.a.G, this.a.getQuery());
        this.a.setDataSource(postCommentDataSource0);
        return postCommentDataSource0;
    }
}

