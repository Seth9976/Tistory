package com.kakao.tistory.presentation.screen.blog;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.data.model.common.EmojiErrorModel.Emoji;
import com.kakao.tistory.data.model.common.EmojiErrorModel;
import com.kakao.tistory.domain.ErrorStatus;
import com.kakao.tistory.domain.ErrorStatusKt;
import com.kakao.tistory.domain.blog.entity.BlogInfo;
import com.kakao.tistory.domain.blog.usecase.GetBlogInfoUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.TistoryMVIViewmodel;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogError;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogEvent.Finish;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogEvent.ShowToast;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogIntent.Init;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogIntent.Refresh;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogIntent.UpdateBlogError;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogIntent.UpdateBlogInfo;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogIntent;
import com.kakao.tistory.presentation.screen.blog.common.contract.BlogUiState;
import com.kakao.tistory.presentation.screen.item.ViewState.Error;
import com.kakao.tistory.presentation.screen.item.ViewState.Loading;
import com.kakao.tistory.presentation.screen.item.ViewState.Success;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blog/BlogViewModel;", "Lcom/kakao/tistory/presentation/common/TistoryMVIViewmodel;", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogIntent;", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogEvent;", "Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogUiState;", "Lcom/kakao/tistory/domain/blog/usecase/GetBlogInfoUseCase;", "getBlogInfoUseCase", "<init>", "(Lcom/kakao/tistory/domain/blog/usecase/GetBlogInfoUseCase;)V", "createInitState", "()Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogUiState;", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogUiState;Lcom/kakao/tistory/presentation/screen/blog/common/contract/BlogIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogViewModel extends TistoryMVIViewmodel {
    public static final int $stable = 8;
    public final GetBlogInfoUseCase f;

    @Inject
    public BlogViewModel(@NotNull GetBlogInfoUseCase getBlogInfoUseCase0) {
        Intrinsics.checkNotNullParameter(getBlogInfoUseCase0, "getBlogInfoUseCase");
        super();
        this.f = getBlogInfoUseCase0;
    }

    @NotNull
    public BlogUiState createInitState() {
        return new BlogUiState(null, new d(this), null, new e(this), false, new f(this), new g(this), 21, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object createInitState() {
        return this.createInitState();
    }

    @Nullable
    public Object handleIntent(@NotNull BlogUiState blogUiState0, @NotNull BlogIntent blogIntent0, @NotNull Continuation continuation0) {
        if(blogIntent0 instanceof Init) {
            String s = ((Init)blogIntent0).getBlogName();
            boolean z = ((Init)blogIntent0).getHasBackstack();
            if(s != null && !p.isBlank(s)) {
                if(Intrinsics.areEqual(s, blogUiState0.getBlogName())) {
                    return blogUiState0;
                }
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h(this, s, null), 3, null);
                return BlogUiState.copy$default(blogUiState0, s, null, Loading.INSTANCE, null, false, null, null, 0x7A, null);
            }
            if(z) {
                this.sendEvent(new ShowToast(null, Boxing.boxInt(string.label_blog_invali_blog_name), 1, null));
                this.sendEvent(Finish.INSTANCE);
            }
            EmojiErrorModel emojiErrorModel0 = new EmojiErrorModel();
            ErrorStatusKt.setErrorStatus(emojiErrorModel0, ErrorStatus.EXCEPTION_BLOG_LESS);
            emojiErrorModel0.setEmoji(Emoji.Persevering);
            return BlogUiState.copy$default(blogUiState0, null, null, new Error(emojiErrorModel0), null, false, null, null, 0x7B, null);
        }
        if(blogIntent0 instanceof Refresh) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h(this, blogUiState0.getBlogName(), null), 3, null);
            return BlogUiState.copy$default(blogUiState0, null, null, null, null, true, null, null, 0x6F, null);
        }
        if(blogIntent0 instanceof UpdateBlogInfo) {
            BlogInfo blogInfo0 = ((UpdateBlogInfo)blogIntent0).getBlogInfo();
            boolean z1 = blogInfo0.getRole().getHasBlogRole();
            if(!Intrinsics.areEqual(blogUiState0.getBlogName(), blogInfo0.getName())) {
                return blogUiState0;
            }
            if(blogInfo0.getStatus().isBlogRestricted()) {
                BlogError blogError0 = new BlogError(z1, blogInfo0.getStatus(), Emoji.Eyes);
                ErrorStatusKt.setErrorStatus(blogError0, ErrorStatus.EXCEPTION_RESTRICTED_BLOG);
                return BlogUiState.copy$default(blogUiState0, null, null, new Error(blogError0), null, false, null, null, 0x7B, null);
            }
            return BlogUiState.copy$default(blogUiState0, null, null, new Success(blogInfo0), null, false, null, null, 107, null);
        }
        if(!(blogIntent0 instanceof UpdateBlogError)) {
            throw new NoWhenBranchMatchedException();
        }
        return BlogUiState.copy$default(blogUiState0, null, null, new Error(((UpdateBlogError)blogIntent0).getErrorModel()), null, false, null, null, 107, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((BlogUiState)object0), ((BlogIntent)object1), continuation0);
    }
}

