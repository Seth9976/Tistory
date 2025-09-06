package com.kakao.tistory.presentation.view.comment.guestbook;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.color;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.view.comment.CommentListViewModel;
import com.kakao.tistory.presentation.view.comment.CommentModifyViewModel;
import com.kakao.tistory.presentation.widget.ExcludeFontPaddingTextKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0005\u001A\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006R\u001B\u0010\f\u001A\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001B\u0010\u0011\u001A\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000E\u0010\t\u001A\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0017\u001A\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookFragment;", "Lcom/kakao/tistory/presentation/view/comment/guestbook/GuestbookFragment;", "<init>", "()V", "", "CommentEmptyView", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookViewModel;", "w", "Lkotlin/Lazy;", "getCommentListViewModel", "()Lcom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookViewModel;", "commentListViewModel", "Lcom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookModifyViewModel;", "x", "getCommentModifyViewModel", "()Lcom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookModifyViewModel;", "commentModifyViewModel", "", "y", "I", "getTopViewTitleRes", "()I", "topViewTitleRes", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPinGuestbookFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PinGuestbookFragment.kt\ncom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,40:1\n21#2,4:41\n21#2,4:55\n1#3:45\n1#3:59\n172#4,9:46\n172#4,9:60\n148#5:69\n*S KotlinDebug\n*F\n+ 1 PinGuestbookFragment.kt\ncom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookFragment\n*L\n26#1:41,4\n27#1:55,4\n26#1:45\n27#1:59\n26#1:46,9\n27#1:60,9\n34#1:69\n*E\n"})
public final class PinGuestbookFragment extends Hilt_PinGuestbookFragment {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookFragment$Companion;", "", "Lcom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookFragment;", "newInstance", "()Lcom/kakao/tistory/presentation/view/comment/guestbook/PinGuestbookFragment;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final PinGuestbookFragment newInstance() {
            return new PinGuestbookFragment();
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final BaseViewModelLazy w;
    public final BaseViewModelLazy x;
    public final int y;

    static {
        PinGuestbookFragment.Companion = new Companion(null);
        PinGuestbookFragment.$stable = 8;
    }

    public PinGuestbookFragment() {
        this.w = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PinGuestbookViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(this)));
        this.x = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PinGuestbookModifyViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(this)));
        this.y = string.label_comment_pin_title;
    }

    @Override  // com.kakao.tistory.presentation.view.comment.CommentFragment
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public void CommentEmptyView(@Nullable Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0xF308138);
        if((v & 1) != 0 || !composer1.getSkipping()) {
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xF308138, v, -1, "com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookFragment.CommentEmptyView (PinGuestbookFragment.kt:31)");
            }
            Modifier modifier0 = PaddingKt.padding-qDBjuR0$default(Modifier.Companion, 20.0f, 18.0f, 0.0f, 0.0f, 12, null);
            ExcludeFontPaddingTextKt.Text-IbK3jfQ(StringResources_androidKt.stringResource(string.label_comment_empty, composer1, 0), modifier0, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, false, 0, 0, null, TextStyle.copy-p1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer1, MaterialTheme.$stable).getH5(), ColorResources_androidKt.colorResource(color.gray9, composer1, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 0xFFFFFE, null), composer1, 0x30, 0xC00, 0x1DFFC);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        else {
            composer1.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new q(this, v));
        }
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.GuestbookFragment
    public CommentListViewModel getCommentListViewModel() {
        return this.getCommentListViewModel();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.GuestbookFragment
    public GuestbookViewModel getCommentListViewModel() {
        return this.getCommentListViewModel();
    }

    @NotNull
    public PinGuestbookViewModel getCommentListViewModel() {
        return (PinGuestbookViewModel)this.w.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.GuestbookFragment
    public CommentModifyViewModel getCommentModifyViewModel() {
        return this.getCommentModifyViewModel();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.GuestbookFragment
    public GuestbookModifyViewModel getCommentModifyViewModel() {
        return this.getCommentModifyViewModel();
    }

    @NotNull
    public PinGuestbookModifyViewModel getCommentModifyViewModel() {
        return (PinGuestbookModifyViewModel)this.x.getValue();
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.GuestbookFragment
    public int getTopViewTitleRes() {
        return this.y;
    }
}

