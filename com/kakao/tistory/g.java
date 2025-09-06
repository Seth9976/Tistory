package com.kakao.tistory;

import com.kakao.tistory.presentation.view.accountMigration.LoginFragment;
import com.kakao.tistory.presentation.view.accountMigration.MigrationFragment;
import com.kakao.tistory.presentation.view.accountMigration.UsedAccountFragment;
import com.kakao.tistory.presentation.view.blog.BlogFollowerFragment;
import com.kakao.tistory.presentation.view.blog.BlogFollowingFragment;
import com.kakao.tistory.presentation.view.bottomsheet.BlogCategoryDialogFragment;
import com.kakao.tistory.presentation.view.bottomsheet.DaumCategoryDialogFragment;
import com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment;
import com.kakao.tistory.presentation.view.comment.entry.PostCommentFragment;
import com.kakao.tistory.presentation.view.comment.entry.PostPinCommentFragment;
import com.kakao.tistory.presentation.view.comment.guestbook.GuestbookFragment;
import com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookFragment;
import com.kakao.tistory.presentation.view.common.dialog.EntryPasswordDialogFragment;
import com.kakao.tistory.presentation.view.editor.EditorFragment;
import com.kakao.tistory.presentation.view.editor.EditorSettingFragment;
import com.kakao.tistory.presentation.view.editor.EditorTagFragment;
import com.kakao.tistory.presentation.view.statistics.RefererEtcListFragment;
import com.kakao.tistory.presentation.view.statistics.StatisticsFragment;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories.InternalFactoryFactory;

public final class g extends FragmentC {
    public final b a;

    public g(k k0, e e0, b b0) {
        this.a = b0;
    }

    @Override  // dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories$FragmentEntryPoint
    public final InternalFactoryFactory getHiltInternalFactoryFactory() {
        return this.a.getHiltInternalFactoryFactory();
    }

    @Override  // com.kakao.tistory.presentation.view.bottomsheet.BlogCategoryDialogFragment_GeneratedInjector
    public final void injectBlogCategoryDialogFragment(BlogCategoryDialogFragment blogCategoryDialogFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.blog.BlogFollowerFragment_GeneratedInjector
    public final void injectBlogFollowerFragment(BlogFollowerFragment blogFollowerFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.blog.BlogFollowingFragment_GeneratedInjector
    public final void injectBlogFollowingFragment(BlogFollowingFragment blogFollowingFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.bottomsheet.DaumCategoryDialogFragment_GeneratedInjector
    public final void injectDaumCategoryDialogFragment(DaumCategoryDialogFragment daumCategoryDialogFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.editor.EditorFragment_GeneratedInjector
    public final void injectEditorFragment(EditorFragment editorFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.editor.EditorSettingFragment_GeneratedInjector
    public final void injectEditorSettingFragment(EditorSettingFragment editorSettingFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.editor.EditorTagFragment_GeneratedInjector
    public final void injectEditorTagFragment(EditorTagFragment editorTagFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.common.dialog.EntryPasswordDialogFragment_GeneratedInjector
    public final void injectEntryPasswordDialogFragment(EntryPasswordDialogFragment entryPasswordDialogFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.GuestbookFragment_GeneratedInjector
    public final void injectGuestbookFragment(GuestbookFragment guestbookFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.accountMigration.LoginFragment_GeneratedInjector
    public final void injectLoginFragment(LoginFragment loginFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.accountMigration.MigrationFragment_GeneratedInjector
    public final void injectMigrationFragment(MigrationFragment migrationFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.comment.guestbook.PinGuestbookFragment_GeneratedInjector
    public final void injectPinGuestbookFragment(PinGuestbookFragment pinGuestbookFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostCommentFragment_GeneratedInjector
    public final void injectPostCommentFragment(PostCommentFragment postCommentFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.comment.entry.PostPinCommentFragment_GeneratedInjector
    public final void injectPostPinCommentFragment(PostPinCommentFragment postPinCommentFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.statistics.RefererEtcListFragment_GeneratedInjector
    public final void injectRefererEtcListFragment(RefererEtcListFragment refererEtcListFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.bottomsheet.ReportDialogFragment_GeneratedInjector
    public final void injectReportDialogFragment(ReportDialogFragment reportDialogFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.statistics.StatisticsFragment_GeneratedInjector
    public final void injectStatisticsFragment(StatisticsFragment statisticsFragment0) {
    }

    @Override  // com.kakao.tistory.presentation.view.accountMigration.UsedAccountFragment_GeneratedInjector
    public final void injectUsedAccountFragment(UsedAccountFragment usedAccountFragment0) {
    }

    @Override  // dagger.hilt.android.internal.managers.ViewComponentManager$ViewWithFragmentComponentBuilderEntryPoint
    public final ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
        return new q();  // 初始化器: Ljava/lang/Object;-><init>()V
    }
}

