package com.kakao.tistory.presentation.view.comment;

import a5.b;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Comment;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Header;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.MoreButton;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Pin;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Reply;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.q;

public final class u extends Lambda implements Function1 {
    public static final u a;

    static {
        u.a = new u();
    }

    public u() {
        super(1);
    }

    public static String a(CommentItemUIModel commentItemUIModel0) {
        Intrinsics.checkNotNullParameter(commentItemUIModel0, "item");
        if(commentItemUIModel0 instanceof Comment) {
            return q.n(((Comment)commentItemUIModel0).getId(), "Comment ");
        }
        if(Intrinsics.areEqual(commentItemUIModel0, Header.INSTANCE)) {
            return "Header";
        }
        if(commentItemUIModel0 instanceof MoreButton) {
            return b.e(commentItemUIModel0.hashCode(), "MoreButton ");
        }
        if(commentItemUIModel0 instanceof Pin) {
            return q.n(((Pin)commentItemUIModel0).getComment().getId(), "Pin ");
        }
        if(!(commentItemUIModel0 instanceof Reply)) {
            throw new NoWhenBranchMatchedException();
        }
        return q.n(((Reply)commentItemUIModel0).getComment().getId(), "Reply ");
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return u.a(((CommentItemUIModel)object0));
    }
}

