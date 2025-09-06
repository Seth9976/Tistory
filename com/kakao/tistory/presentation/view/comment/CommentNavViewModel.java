package com.kakao.tistory.presentation.view.comment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.entity.CommentItemType.CommentItem;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u000F\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\t2\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000F\u0010\u0010R\u001D\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/CommentNavViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "<init>", "()V", "", "targetCommentId", "", "goList", "(Ljava/lang/Long;)V", "", "blogName", "entryId", "guestPassword", "Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;", "commentItem", "goModify", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/kakao/tistory/domain/entity/CommentItemType$CommentItem;)V", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/kakao/tistory/presentation/view/comment/CommentPageType;", "h", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "currentState", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CommentNavViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final MutableStateFlow g;
    public final StateFlow h;

    public CommentNavViewModel() {
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(new List(null, 1, null));
        this.g = mutableStateFlow0;
        this.h = FlowKt.asStateFlow(mutableStateFlow0);
    }

    @NotNull
    public final StateFlow getCurrentState() {
        return this.h;
    }

    public final void goList(@Nullable Long long0) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new e2(this, long0, null), 3, null);
    }

    public static void goList$default(CommentNavViewModel commentNavViewModel0, Long long0, int v, Object object0) {
        if((v & 1) != 0) {
            long0 = null;
        }
        commentNavViewModel0.goList(long0);
    }

    public final void goModify(@NotNull String s, @Nullable Long long0, @Nullable String s1, @NotNull CommentItem commentItemType$CommentItem0) {
        Intrinsics.checkNotNullParameter(s, "blogName");
        Intrinsics.checkNotNullParameter(commentItemType$CommentItem0, "commentItem");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f2(this, s, long0, s1, commentItemType$CommentItem0, null), 3, null);
    }

    public static void goModify$default(CommentNavViewModel commentNavViewModel0, String s, Long long0, String s1, CommentItem commentItemType$CommentItem0, int v, Object object0) {
        if((v & 2) != 0) {
            long0 = null;
        }
        if((v & 4) != 0) {
            s1 = null;
        }
        commentNavViewModel0.goModify(s, long0, s1, commentItemType$CommentItem0);
    }
}

