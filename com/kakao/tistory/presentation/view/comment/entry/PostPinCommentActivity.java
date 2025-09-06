package com.kakao.tistory.presentation.view.comment.entry;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import com.kakao.tistory.presentation.view.comment.CommentModifyViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001B\u0010\u000E\u001A\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\rR\u001B\u0010\u0013\u001A\u00020\u000F8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000B\u001A\u0004\b\u0011\u0010\u0012R \u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00150\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/entry/PostPinCommentActivity;", "Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/kakao/tistory/presentation/view/comment/entry/PostPinCommentViewModel;", "o", "Lkotlin/Lazy;", "getCommentViewModel", "()Lcom/kakao/tistory/presentation/view/comment/entry/PostPinCommentViewModel;", "commentViewModel", "Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentModifyViewModel;", "p", "getCommentModifyViewModel", "()Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentModifyViewModel;", "commentModifyViewModel", "Lkotlin/Function0;", "Lcom/kakao/tistory/presentation/view/comment/CommentFragment;", "q", "Lkotlin/jvm/functions/Function0;", "getNewFragmentInstance", "()Lkotlin/jvm/functions/Function0;", "newFragmentInstance", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPostPinCommentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostPinCommentActivity.kt\ncom/kakao/tistory/presentation/view/comment/entry/PostPinCommentActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,29:1\n10#2,2:30\n10#2,2:46\n1#3:32\n1#3:48\n75#4,13:33\n75#4,13:49\n*S KotlinDebug\n*F\n+ 1 PostPinCommentActivity.kt\ncom/kakao/tistory/presentation/view/comment/entry/PostPinCommentActivity\n*L\n15#1:30,2\n16#1:46,2\n15#1:32\n16#1:48\n15#1:33,13\n16#1:49,13\n*E\n"})
public final class PostPinCommentActivity extends Hilt_PostPinCommentActivity {
    public static final int $stable = 8;
    public final BaseViewModelLazy o;
    public final BaseViewModelLazy p;
    public final n q;

    public PostPinCommentActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.o = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(PostPinCommentViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$11 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.p = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(PostCommentModifyViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$11, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        this.q = new n(PostPinCommentFragment.Companion);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentActivity
    public CommentModifyViewModel getCommentModifyViewModel() {
        return this.getCommentModifyViewModel();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentActivity
    @NotNull
    public PostCommentModifyViewModel getCommentModifyViewModel() {
        return (PostCommentModifyViewModel)this.p.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentActivity
    public CommentListViewModel getCommentViewModel() {
        return this.getCommentViewModel();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentActivity
    public PostCommentViewModel getCommentViewModel() {
        return this.getCommentViewModel();
    }

    @NotNull
    public PostPinCommentViewModel getCommentViewModel() {
        return (PostPinCommentViewModel)this.o.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentActivity
    @NotNull
    public Function0 getNewFragmentInstance() {
        return this.q;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        PostPinCommentTiara.INSTANCE.trackPage();
    }
}

