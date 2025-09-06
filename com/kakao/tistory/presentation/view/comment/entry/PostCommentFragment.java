package com.kakao.tistory.presentation.view.comment.entry;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.IllegalFilmType;
import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import com.kakao.tistory.presentation.view.comment.CommentModifyViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001B\u0010\t\u001A\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001A\u0004\b\u0007\u0010\bR\u001B\u0010\u000E\u001A\u00020\n8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000B\u0010\u0006\u001A\u0004\b\f\u0010\rR\u001A\u0010\u0014\u001A\u00020\u000F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R\u001A\u0010\u001A\u001A\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001D\u001A\u00020\u000F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u0011\u001A\u0004\b\u001C\u0010\u0013R\u001A\u0010 \u001A\u00020\u000F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001E\u0010\u0011\u001A\u0004\b\u001F\u0010\u0013¨\u0006\""}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentFragment;", "Lcom/kakao/tistory/presentation/view/comment/CommentFragment;", "<init>", "()V", "Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentViewModel;", "n", "Lkotlin/Lazy;", "getCommentListViewModel", "()Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentViewModel;", "commentListViewModel", "Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentModifyViewModel;", "o", "getCommentModifyViewModel", "()Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentModifyViewModel;", "commentModifyViewModel", "", "p", "I", "getTopViewTitleRes", "()I", "topViewTitleRes", "Lcom/kakao/tistory/presentation/common/IllegalFilmType;", "q", "Lcom/kakao/tistory/presentation/common/IllegalFilmType;", "getIllegalFilmType", "()Lcom/kakao/tistory/presentation/common/IllegalFilmType;", "illegalFilmType", "r", "getCommentEmptyTitleRes", "commentEmptyTitleRes", "s", "getCommentEmptyMessageRes", "commentEmptyMessageRes", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPostCommentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostCommentFragment.kt\ncom/kakao/tistory/presentation/view/comment/entry/PostCommentFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,26:1\n21#2,4:27\n21#2,4:41\n1#3:31\n1#3:45\n172#4,9:32\n172#4,9:46\n*S KotlinDebug\n*F\n+ 1 PostCommentFragment.kt\ncom/kakao/tistory/presentation/view/comment/entry/PostCommentFragment\n*L\n19#1:27,4\n20#1:41,4\n19#1:31\n20#1:45\n19#1:32,9\n20#1:46,9\n*E\n"})
public class PostCommentFragment extends Hilt_PostCommentFragment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentFragment$Companion;", "", "Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentFragment;", "newInstance", "()Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentFragment;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PostCommentFragment newInstance() {
            return new PostCommentFragment();
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final BaseViewModelLazy n;
    public final BaseViewModelLazy o;
    public final int p;
    public final IllegalFilmType q;
    public final int r;
    public final int s;

    static {
        PostCommentFragment.Companion = new Companion(null);
        PostCommentFragment.$stable = 8;
    }

    public PostCommentFragment() {
        this.n = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PostCommentViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(this)));
        this.o = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PostCommentModifyViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(this)));
        this.p = string.label_comment;
        this.q = IllegalFilmType.COMMENT;
        this.r = string.label_comment_empty_title;
        this.s = string.label_comment_empty_message;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentFragment
    public int getCommentEmptyMessageRes() {
        return this.s;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentFragment
    public int getCommentEmptyTitleRes() {
        return this.r;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentFragment
    public CommentListViewModel getCommentListViewModel() {
        return this.getCommentListViewModel();
    }

    @NotNull
    public PostCommentViewModel getCommentListViewModel() {
        return (PostCommentViewModel)this.n.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentFragment
    public CommentModifyViewModel getCommentModifyViewModel() {
        return this.getCommentModifyViewModel();
    }

    @NotNull
    public PostCommentModifyViewModel getCommentModifyViewModel() {
        return (PostCommentModifyViewModel)this.o.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentFragment
    @NotNull
    public IllegalFilmType getIllegalFilmType() {
        return this.q;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentFragment
    public int getTopViewTitleRes() {
        return this.p;
    }
}

