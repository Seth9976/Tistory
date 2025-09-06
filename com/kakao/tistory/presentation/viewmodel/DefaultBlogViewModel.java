package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000B\u0010\fJ\r\u0010\r\u001A\u00020\u0006¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000E\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000E\u0010\fR\u001F\u0010\u0014\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000F8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\u0013R(\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\t0\u00158\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR(\u0010 \u001A\b\u0012\u0004\u0012\u00020\t0\u00158\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u0017\u001A\u0004\b\u001E\u0010\u0019\"\u0004\b\u001F\u0010\u001BR\u0019\u0010\"\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000F8F¢\u0006\u0006\u001A\u0004\b!\u0010\u0013R\u001D\u0010%\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060#0\u000F8F¢\u0006\u0006\u001A\u0004\b$\u0010\u0013¨\u0006&"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/DefaultBlogViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;)V", "", "getBlogs", "()V", "Lcom/kakao/tistory/domain/entity/Blog;", "blog", "onClickBlog", "(Lcom/kakao/tistory/domain/entity/Blog;)V", "dismissDialog", "onClickChange", "Landroidx/lifecycle/LiveData;", "j", "Landroidx/lifecycle/LiveData;", "getDefaultBlog", "()Landroidx/lifecycle/LiveData;", "defaultBlog", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "k", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getOwnerBlogs", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "setOwnerBlogs", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "ownerBlogs", "l", "getJoinedBlogs", "setJoinedBlogs", "joinedBlogs", "getSelectedBlog", "selectedBlog", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getGoToSettingListActivity", "goToSettingListActivity", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDefaultBlogViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultBlogViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/DefaultBlogViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1054#2:87\n*S KotlinDebug\n*F\n+ 1 DefaultBlogViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/DefaultBlogViewModel\n*L\n59#1:87\n*E\n"})
public final class DefaultBlogViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final AccountRepository g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public final LiveData j;
    public SnapshotStateList k;
    public SnapshotStateList l;

    @Inject
    public DefaultBlogViewModel(@NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        super();
        this.g = accountRepository0;
        this.h = new MutableLiveData();
        this.i = new MutableLiveData();
        this.j = accountRepository0.getOldDefaultBlog();
        this.k = SnapshotStateKt.mutableStateListOf();
        this.l = SnapshotStateKt.mutableStateListOf();
    }

    public static final List access$getSortedOwnerBlogList(DefaultBlogViewModel defaultBlogViewModel0, User user0) {
        defaultBlogViewModel0.getClass();
        Blog blog0 = user0.getDefaultBlog();
        String s = blog0 == null ? null : blog0.getName();
        if(s != null && !p.isBlank(s)) {
            List list0 = user0.getOwnerBlogs();
            return list0 == null ? null : CollectionsKt___CollectionsKt.sortedWith(list0, new DefaultBlogViewModel.special..inlined.sortedByDescending.1(s));
        }
        return user0.getOwnerBlogs();
    }

    public final void dismissDialog() {
        this.h.postValue(null);
    }

    public final void getBlogs() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new w(this, null), 3, null);
    }

    @NotNull
    public final LiveData getDefaultBlog() {
        return this.j;
    }

    @NotNull
    public final LiveData getGoToSettingListActivity() {
        return this.i;
    }

    @NotNull
    public final SnapshotStateList getJoinedBlogs() {
        return this.l;
    }

    @NotNull
    public final SnapshotStateList getOwnerBlogs() {
        return this.k;
    }

    @NotNull
    public final LiveData getSelectedBlog() {
        return this.h;
    }

    public final void onClickBlog(@NotNull Blog blog0) {
        Intrinsics.checkNotNullParameter(blog0, "blog");
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_BLOG, null, null, null, null, null, 0xF8, null);
        this.h.postValue(blog0);
    }

    public final void onClickChange(@NotNull Blog blog0) {
        Intrinsics.checkNotNullParameter(blog0, "blog");
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_CHANGE, null, null, null, null, null, 0xF8, null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new x(blog0, this, null), 3, null);
    }

    public final void setJoinedBlogs(@NotNull SnapshotStateList snapshotStateList0) {
        Intrinsics.checkNotNullParameter(snapshotStateList0, "<set-?>");
        this.l = snapshotStateList0;
    }

    public final void setOwnerBlogs(@NotNull SnapshotStateList snapshotStateList0) {
        Intrinsics.checkNotNullParameter(snapshotStateList0, "<set-?>");
        this.k = snapshotStateList0;
    }
}

