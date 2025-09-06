package com.kakao.tistory.presentation.view.comment.entry;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.entry.EntryItem;
import com.kakao.tistory.presentation.R.id;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.view.comment.CommentActivityResultType;
import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import com.kakao.tistory.presentation.view.comment.CommentModifyViewModel;
import com.kakao.tistory.presentation.view.comment.contract.CommentListIntent.RefreshCommentList;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000E\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000E\u0010\u000FR\u001B\u0010\u0015\u001A\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014R\u001B\u0010\u001A\u001A\u00020\u00168VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001A\u0004\b\u0018\u0010\u0019R \u0010!\u001A\b\u0012\u0004\u0012\u00020\u001C0\u001B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 ¨\u0006#"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentActivity;", "Lcom/kakao/tistory/presentation/view/comment/CommentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentViewModel;", "k", "Lkotlin/Lazy;", "getCommentViewModel", "()Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentViewModel;", "commentViewModel", "Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentModifyViewModel;", "l", "getCommentModifyViewModel", "()Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentModifyViewModel;", "commentModifyViewModel", "Lkotlin/Function0;", "Lcom/kakao/tistory/presentation/view/comment/CommentFragment;", "m", "Lkotlin/jvm/functions/Function0;", "getNewFragmentInstance", "()Lkotlin/jvm/functions/Function0;", "newFragmentInstance", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPostCommentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostCommentActivity.kt\ncom/kakao/tistory/presentation/view/comment/entry/PostCommentActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,88:1\n10#2,2:89\n10#2,2:105\n1#3:91\n1#3:107\n1#3:121\n75#4,13:92\n75#4,13:108\n*S KotlinDebug\n*F\n+ 1 PostCommentActivity.kt\ncom/kakao/tistory/presentation/view/comment/entry/PostCommentActivity\n*L\n28#1:89,2\n29#1:105,2\n28#1:91\n29#1:107\n28#1:92,13\n29#1:108,13\n*E\n"})
public class PostCommentActivity extends Hilt_PostCommentActivity {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/entry/PostCommentActivity$Companion;", "", "", "COMMENT_UPDATED_REQUEST_CODE", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    public static final int COMMENT_UPDATED_REQUEST_CODE = 10005;
    @NotNull
    public static final Companion Companion;
    public final BaseViewModelLazy k;
    public final BaseViewModelLazy l;
    public final d m;

    static {
        PostCommentActivity.Companion = new Companion(null);
        PostCommentActivity.$stable = 8;
    }

    public PostCommentActivity() {
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.k = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(PostCommentViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$11 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.l = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(PostCommentModifyViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$11, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        this.m = new d(PostCommentFragment.Companion);
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentActivity
    public CommentModifyViewModel getCommentModifyViewModel() {
        return this.getCommentModifyViewModel();
    }

    @NotNull
    public PostCommentModifyViewModel getCommentModifyViewModel() {
        return (PostCommentModifyViewModel)this.l.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentActivity
    public CommentListViewModel getCommentViewModel() {
        return this.getCommentViewModel();
    }

    @NotNull
    public PostCommentViewModel getCommentViewModel() {
        return (PostCommentViewModel)this.k.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentActivity
    @NotNull
    public Function0 getNewFragmentInstance() {
        return this.m;
    }

    @Override  // androidx.fragment.app.FragmentActivity
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v == 10005 && v1 == CommentActivityResultType.Updated.getCode()) {
            this.getCommentViewModel().sendIntent(new RefreshCommentList(null, true, 1, null));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        PostCommentTiara.INSTANCE.trackPage();
        Intent intent0 = this.getIntent();
        Unit unit0 = null;
        if(intent0 != null) {
            Parcelable parcelable0 = intent0.getParcelableExtra("EXTRA_ENTRY_ITEM");
            if(((EntryItem)parcelable0) != null) {
                String s = ((EntryItem)parcelable0).getBlogName();
                if(s == null) {
                    this.finish();
                    return;
                }
                Blog blog0 = ((EntryItem)parcelable0).getBlog();
                if(blog0 != null) {
                    String s1 = blog0.getRole();
                    if(s1 != null) {
                        Long long0 = ((EntryItem)parcelable0).getId();
                        if(long0 != null) {
                            if(long0.longValue() < 0L) {
                                long0 = null;
                            }
                            if(long0 != null) {
                                long v = (long)long0;
                                long v1 = intent0.getLongExtra("EXTRA_COMMENT_ID", -1L);
                                Long long1 = v1;
                                Blog blog1 = ((EntryItem)parcelable0).getBlog();
                                if(blog1 != null) {
                                    unit0 = blog1.getId();
                                }
                                Logger.INSTANCE.log("entryItem " + s + ", " + ((EntryItem)parcelable0).getId() + ", " + ((EntryItem)parcelable0).getPassword());
                                PostCommentViewModel postCommentViewModel0 = this.getCommentViewModel();
                                Intrinsics.checkNotNull(((EntryItem)parcelable0));
                                postCommentViewModel0.init(s, ((Long)unit0), s1, v, (v1 < 0L ? null : long1), ((EntryItem)parcelable0));
                                unit0 = Unit.INSTANCE;
                                goto label_36;
                            }
                        }
                        this.finish();
                        return;
                    }
                }
                this.finish();
                return;
            }
        label_36:
            if(unit0 == null) {
                this.finish();
            }
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            this.finish();
        }
        if(bundle0 == null) {
            Intent intent1 = this.getIntent();
            if(intent1 != null && intent1.getExtras() != null) {
                this.getSupportFragmentManager().beginTransaction().replace(id.fragment_container, ((Fragment)this.getNewFragmentInstance().invoke())).commitNow();
            }
        }
        LiveDataExtensionKt.observeEvent(this.getCommentViewModel().getGoToDetailPinnedComment(), this, new c(this));
    }
}

