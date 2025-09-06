package com.kakao.tistory.presentation.view.comment;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.IntSize;
import androidx.paging.ItemSnapshotList;
import androidx.paging.compose.LazyPagingItems;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Comment;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Pin;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel.Reply;
import com.kakao.tistory.presentation.view.comment.contract.CommentItemUIModel;
import com.kakao.tistory.presentation.view.comment.contract.CommentListModel;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsKt;
import qd.a;

public final class g0 extends SuspendLambda implements Function1 {
    public int a;
    public final LazyListState b;
    public final LazyPagingItems c;
    public final CommentListModel d;
    public final CommentFragment e;

    public g0(LazyListState lazyListState0, LazyPagingItems lazyPagingItems0, CommentListModel commentListModel0, CommentFragment commentFragment0, Continuation continuation0) {
        this.b = lazyListState0;
        this.c = lazyPagingItems0;
        this.d = commentListModel0;
        this.e = commentFragment0;
        super(1, continuation0);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation0) {
        return new g0(this.b, this.c, this.d, this.e, continuation0);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        return ((g0)this.create(((Continuation)object0))).invokeSuspend(Unit.INSTANCE);
    }

    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object object0) {
        Object object3;
        long v3;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        boolean z = true;
        switch(this.a) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                int v = this.b.getLayoutInfo().getTotalItemsCount();
                int v1 = this.c.getItemSnapshotList().size();
                ItemSnapshotList itemSnapshotList0 = this.c.getItemSnapshotList();
                CommentListModel commentListModel0 = this.d;
                int v2 = 0;
                Iterator iterator0 = itemSnapshotList0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        v2 = -1;
                        break;
                    }
                    Object object2 = iterator0.next();
                    CommentItemUIModel commentItemUIModel0 = (CommentItemUIModel)object2;
                    if(commentItemUIModel0 instanceof Comment) {
                        v3 = ((Comment)commentItemUIModel0).getId();
                    }
                    else if(commentItemUIModel0 instanceof Pin) {
                        v3 = ((Pin)commentItemUIModel0).getComment().getId();
                    }
                    else {
                        v3 = commentItemUIModel0 instanceof Reply ? ((Reply)commentItemUIModel0).getComment().getId() : 0L;
                    }
                    Long long0 = commentListModel0.getScrollTargetCommentId();
                    if(long0 != null && v3 == ((long)long0)) {
                        break;
                    }
                    ++v2;
                }
                int v4 = v2 + (v - v1);
                if(v4 > 0) {
                    this.a = 1;
                    if(LazyListState.scrollToItem$default(this.b, v4, 0, this, 2, null) == object1) {
                        return object1;
                    }
                label_39:
                    List list0 = this.b.getLayoutInfo().getVisibleItemsInfo();
                    CommentListModel commentListModel1 = this.d;
                    Iterator iterator1 = list0.iterator();
                    while(true) {
                        object3 = null;
                        if(!iterator1.hasNext()) {
                            break;
                        }
                        Object object4 = iterator1.next();
                        Object object5 = ((LazyListItemInfo)object4).getKey();
                        String s = object5 instanceof String ? ((String)object5) : null;
                        if(s == null) {
                            s = "";
                        }
                        if((StringsKt__StringsKt.contains$default(s, "Comment", false, 2, null) || StringsKt__StringsKt.contains$default(s, "Reply", false, 2, null) ? StringsKt__StringsKt.contains$default(s, String.valueOf(commentListModel1.getScrollTargetCommentId()), false, 2, null) : false)) {
                            object3 = object4;
                            break;
                        }
                    }
                    if(((LazyListItemInfo)object3) != null) {
                        int v5 = IntSize.getHeight-impl(this.b.getLayoutInfo().getViewportSize-YbymL2g());
                        int v6 = ((LazyListItemInfo)object3).getOffset();
                        int v7 = ((LazyListItemInfo)object3).getSize();
                        this.a = 2;
                        Object object6 = ScrollExtensionsKt.scrollBy(this.b, -((float)(v5 - v6 - v7)), this);
                        if(object6 == object1) {
                            return object1;
                        }
                        ((Number)object6).floatValue();
                    }
                }
                else if(this.d.getKeepScrollPosition() && this.e.g >= 0) {
                    this.a = 3;
                    if(this.b.scrollToItem(this.e.g, this.e.h, this) == object1) {
                        return object1;
                    }
                }
                else if(this.d.isListStartFromBottom()) {
                    int v8 = Math.max(this.b.getLayoutInfo().getTotalItemsCount() - 1, 0);
                    this.a = 4;
                    if(LazyListState.scrollToItem$default(this.b, v8, 0, this, 2, null) == object1) {
                        return object1;
                    }
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                goto label_39;
            }
            case 2: {
                ResultKt.throwOnFailure(object0);
                ((Number)object0).floatValue();
                break;
            }
            case 3: 
            case 4: {
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        Function1 function10 = this.d.getOnInitLoadComplete();
        if(this.c.getItemCount() != 0 || !this.c.getLoadState().getAppend().getEndOfPaginationReached()) {
            z = false;
        }
        function10.invoke(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }
}

