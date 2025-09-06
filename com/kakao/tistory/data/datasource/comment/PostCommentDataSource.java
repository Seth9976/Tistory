package com.kakao.tistory.data.datasource.comment;

import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.usecase.GetCommentsUseCase;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J2\u0010\u000E\u001A\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\b2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/tistory/data/datasource/comment/PostCommentDataSource;", "Lcom/kakao/tistory/data/datasource/comment/CommentDataSource;", "Lcom/kakao/tistory/domain/usecase/GetCommentsUseCase;", "getCommentsUseCase", "Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Query;", "query", "<init>", "(Lcom/kakao/tistory/domain/usecase/GetCommentsUseCase;Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Query;)V", "Lcom/kakao/tistory/data/datasource/comment/ListMode;", "listMode", "", "commentId", "Lcom/kakao/tistory/domain/entity/common/Result;", "Lcom/kakao/tistory/domain/entity/common/CommentItemListModel;", "getCommentList", "(Lcom/kakao/tistory/data/datasource/comment/CommentDataSource$Query;Lcom/kakao/tistory/data/datasource/comment/ListMode;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PostCommentDataSource extends CommentDataSource {
    public final GetCommentsUseCase e;

    public PostCommentDataSource(@NotNull GetCommentsUseCase getCommentsUseCase0, @Nullable Query commentDataSource$Query0) {
        Intrinsics.checkNotNullParameter(getCommentsUseCase0, "getCommentsUseCase");
        super(commentDataSource$Query0);
        this.e = getCommentsUseCase0;
    }

    @Override  // com.kakao.tistory.data.datasource.comment.CommentDataSource
    @Nullable
    public Object getCommentList(@NotNull Query commentDataSource$Query0, @NotNull ListMode listMode0, @Nullable Long long0, @NotNull Continuation continuation0) {
        Long long1 = commentDataSource$Query0.getEntryId();
        if(long1 != null) {
            Object object0 = this.e.invoke(commentDataSource$Query0.getBlogName(), long1.longValue(), commentDataSource$Query0.getPassword(), listMode0.getValue(), long0, 20, continuation0);
            return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : ((Result)object0);
        }
        return null;
    }
}

