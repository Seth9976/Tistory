package com.kakao.tistory.presentation.view.comment;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.view.common.base.TistoryActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001A\u00020\u00072\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rR\u001A\u0010\u0013\u001A\u00020\u000E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001A\u00020\u00148&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001B\u001A\u00020\u00188&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u001A\u0010 \u001A\b\u0012\u0004\u0012\u00020\u001D0\u001C8&X¦\u0004¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u001F¨\u0006\""}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/CommentActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryActivity;", "Lcom/kakao/tistory/presentation/databinding/ActivityFragmentContainerBinding;", "<init>", "()V", "Lcom/kakao/android/base/tiara/TiaraListener;", "tiaraListener", "", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "g", "I", "getLayoutResourceId", "()I", "layoutResourceId", "Lcom/kakao/tistory/presentation/view/comment/CommentListViewModel;", "getCommentViewModel", "()Lcom/kakao/tistory/presentation/view/comment/CommentListViewModel;", "commentViewModel", "Lcom/kakao/tistory/presentation/view/comment/CommentModifyViewModel;", "getCommentModifyViewModel", "()Lcom/kakao/tistory/presentation/view/comment/CommentModifyViewModel;", "commentModifyViewModel", "Lkotlin/Function0;", "Lcom/kakao/tistory/presentation/view/comment/CommentFragment;", "getNewFragmentInstance", "()Lkotlin/jvm/functions/Function0;", "newFragmentInstance", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CommentActivity extends TistoryActivity {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/CommentActivity$Companion;", "", "", "EXTRA_COMMENT_ID", "Ljava/lang/String;", "EXTRA_ENTRY_ITEM", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_COMMENT_ID = "EXTRA_COMMENT_ID";
    @NotNull
    public static final String EXTRA_ENTRY_ITEM = "EXTRA_ENTRY_ITEM";
    public final int g;

    static {
        CommentActivity.Companion = new Companion(null);
    }

    public CommentActivity() {
        this.g = layout.activity_fragment_container;
    }

    @NotNull
    public abstract CommentModifyViewModel getCommentModifyViewModel();

    @NotNull
    public abstract CommentListViewModel getCommentViewModel();

    @Override  // com.kakao.android.base.ui.BaseActivity
    public int getLayoutResourceId() {
        return this.g;
    }

    @NotNull
    public abstract Function0 getNewFragmentInstance();

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        CommentListViewModel commentListViewModel0 = this.getCommentViewModel();
        LiveDataExtensionKt.observeEvent(commentListViewModel0.getShowCanNotFindPostDialog(), this, new b(this));
        LiveDataExtensionKt.observeEvent(commentListViewModel0.getShowCanNotFindCommentDialog(), this, new d(this, commentListViewModel0));
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
    }
}

