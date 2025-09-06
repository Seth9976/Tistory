package com.kakao.tistory.presentation.screen.blogswitch;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.presentation.common.TistoryMVIViewmodel;
import com.kakao.tistory.presentation.common.utils.BlogUtils;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchEvent.Dismiss;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchEvent.GoMy;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchIntent.GoSetting;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchIntent.SwitchBlog;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchIntent.UpdateCurrentBlog;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchIntent.UpdateUser;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchIntent;
import com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchState;
import com.kakao.tistory.presentation.screen.blogswitch.navigation.BlogSwitchType;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\t\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\r\u0010\u000ER\"\u0010\u0016\u001A\u00020\u000F8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/kakao/tistory/presentation/screen/blogswitch/BlogSwitchViewModel;", "Lcom/kakao/tistory/presentation/common/TistoryMVIViewmodel;", "Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent;", "Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchEvent;", "Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchState;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;)V", "createInitState", "()Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchState;", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchState;Lcom/kakao/tistory/presentation/screen/blogswitch/contract/BlogSwitchIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/tistory/presentation/screen/blogswitch/navigation/BlogSwitchType;", "g", "Lcom/kakao/tistory/presentation/screen/blogswitch/navigation/BlogSwitchType;", "getType", "()Lcom/kakao/tistory/presentation/screen/blogswitch/navigation/BlogSwitchType;", "setType", "(Lcom/kakao/tistory/presentation/screen/blogswitch/navigation/BlogSwitchType;)V", "type", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlogSwitchViewModel extends TistoryMVIViewmodel {
    public static final int $stable = 8;
    public final AccountRepository f;
    public BlogSwitchType g;

    @Inject
    public BlogSwitchViewModel(@NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        super();
        this.f = accountRepository0;
        this.g = BlogSwitchType.NORMAL;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new o0(this, null), 3, null);
    }

    @NotNull
    public BlogSwitchState createInitState() {
        return new BlogSwitchState(null, null, null, null, new p0(this), new q0(this), new r0(this), 15, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object createInitState() {
        return this.createInitState();
    }

    @NotNull
    public final BlogSwitchType getType() {
        return this.g;
    }

    @Nullable
    public Object handleIntent(@NotNull BlogSwitchState blogSwitchState0, @NotNull BlogSwitchIntent blogSwitchIntent0, @NotNull Continuation continuation0) {
        if(blogSwitchIntent0 instanceof UpdateUser) {
            User user0 = ((UpdateUser)blogSwitchIntent0).getUser();
            if(user0 == null) {
                this.sendEvent(Dismiss.INSTANCE);
                return blogSwitchState0;
            }
            Blog blog0 = user0.getDefaultBlog();
            BlogUtils blogUtils0 = BlogUtils.INSTANCE;
            List list0 = blogUtils0.getSortedOwnerBlogList(user0);
            if(list0 == null) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            List list1 = blogUtils0.getSortedJoinedBlogList(user0);
            if(list1 == null) {
                list1 = CollectionsKt__CollectionsKt.emptyList();
            }
            return BlogSwitchState.copy$default(blogSwitchState0, blog0, null, list0, list1, null, null, null, 0x72, null);
        }
        if(blogSwitchIntent0 instanceof UpdateCurrentBlog) {
            return BlogSwitchState.copy$default(blogSwitchState0, null, ((UpdateCurrentBlog)blogSwitchIntent0).getBlog(), null, null, null, null, null, 0x7D, null);
        }
        if(blogSwitchIntent0 instanceof SwitchBlog) {
            int v = ((SwitchBlog)blogSwitchIntent0).getPosition();
            BlogSwitchTiara.INSTANCE.trackClickBlogSwitch(v, this.g);
            Blog blog1 = blogSwitchState0.getCurrentBlog();
            if(!Intrinsics.areEqual((blog1 == null ? null : blog1.getName()), ((SwitchBlog)blogSwitchIntent0).getBlog().getName())) {
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new s0(this, blogSwitchIntent0, null), 3, null);
            }
            this.sendEvent(Dismiss.INSTANCE);
            this.sendEvent(GoMy.INSTANCE);
            return blogSwitchState0;
        }
        if(!Intrinsics.areEqual(blogSwitchIntent0, GoSetting.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        BlogSwitchTiara.INSTANCE.trackClickSetting();
        this.sendEvent(com.kakao.tistory.presentation.screen.blogswitch.contract.BlogSwitchEvent.GoSetting.INSTANCE);
        this.sendEvent(Dismiss.INSTANCE);
        return blogSwitchState0;
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((BlogSwitchState)object0), ((BlogSwitchIntent)object1), continuation0);
    }

    public final void setType(@NotNull BlogSwitchType blogSwitchType0) {
        Intrinsics.checkNotNullParameter(blogSwitchType0, "<set-?>");
        this.g = blogSwitchType0;
    }
}

