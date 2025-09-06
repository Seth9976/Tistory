package com.kakao.tistory.presentation.view.comment;

import com.kakao.tistory.presentation.common.eventbus.BlogTopBlockEvent;
import com.kakao.tistory.presentation.common.eventbus.TistoryEventBus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001A\u0002H\u0002H\u008A@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "Lcom/kakao/tistory/presentation/common/eventbus/TistoryEventBus;", "it", "emit", "(Lcom/kakao/tistory/presentation/common/eventbus/TistoryEventBus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com/kakao/tistory/presentation/common/eventbus/ChannelBus$subscribe$2"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nChannelBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelBus.kt\ncom/kakao/tistory/presentation/common/eventbus/ChannelBus$subscribe$2\n+ 2 CommentListViewModel.kt\ncom/kakao/tistory/presentation/view/comment/CommentListViewModel$subscribeChannelBus$1\n*L\n1#1,39:1\n181#2,2:40\n*E\n"})
public final class CommentListViewModel.subscribeChannelBus.1.invokeSuspend..inlined.subscribe.2 implements FlowCollector {
    public final CommentListViewModel a;

    public CommentListViewModel.subscribeChannelBus.1.invokeSuspend..inlined.subscribe.2(CommentListViewModel commentListViewModel0) {
        this.a = commentListViewModel0;
        super();
    }

    @Nullable
    public final Object emit(@NotNull TistoryEventBus tistoryEventBus0, @NotNull Continuation continuation0) {
        BlogTopBlockEvent blogTopBlockEvent0 = (BlogTopBlockEvent)tistoryEventBus0;
        Long long0 = CommentListViewModel.access$getSelectedCommentId$p(this.a);
        CommentListViewModel.invalidate$default(this.a, null, long0, false, 5, null);
        return Unit.INSTANCE;
    }

    @Override  // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object object0, Continuation continuation0) {
        return this.emit(((TistoryEventBus)object0), continuation0);
    }
}

