package com.kakao.tistory.presentation.view.accountMigration;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.databinding.ActivityAccountMigrationBinding;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType.BackBlack;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar;
import com.kakao.tistory.presentation.viewmodel.MigrationViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004R\u001A\u0010\u0010\u001A\u00020\u000B8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0012"}, d2 = {"Lcom/kakao/tistory/presentation/view/accountMigration/AccountMigrationActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryActivity;", "Lcom/kakao/tistory/presentation/databinding/ActivityAccountMigrationBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "", "j", "I", "getLayoutResourceId", "()I", "layoutResourceId", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAccountMigrationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountMigrationActivity.kt\ncom/kakao/tistory/presentation/view/accountMigration/AccountMigrationActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,158:1\n10#2,2:159\n1#3:161\n75#4,13:162\n*S KotlinDebug\n*F\n+ 1 AccountMigrationActivity.kt\ncom/kakao/tistory/presentation/view/accountMigration/AccountMigrationActivity\n*L\n34#1:159,2\n34#1:161\n34#1:162,13\n*E\n"})
public final class AccountMigrationActivity extends Hilt_AccountMigrationActivity {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/accountMigration/AccountMigrationActivity$Companion;", "", "", "EXTRA_NEED_REMOVE_APP_SESSION", "Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_NEED_REMOVE_APP_SESSION = "EXTRA_NEED_REMOVE_APP_SESSION";
    public final int j;
    public final BaseViewModelLazy k;

    static {
        AccountMigrationActivity.Companion = new Companion(null);
        AccountMigrationActivity.$stable = 8;
    }

    public AccountMigrationActivity() {
        this.j = layout.activity_account_migration;
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.k = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(MigrationViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
    }

    public static final ActivityAccountMigrationBinding access$getDataBinding(AccountMigrationActivity accountMigrationActivity0) {
        return (ActivityAccountMigrationBinding)accountMigrationActivity0.getDataBinding();
    }

    public static final MigrationViewModel access$getMigrationViewModel(AccountMigrationActivity accountMigrationActivity0) {
        return (MigrationViewModel)accountMigrationActivity0.k.getValue();
    }

    @Override  // com.kakao.android.base.ui.BaseActivity
    public int getLayoutResourceId() {
        return this.j;
    }

    @Override  // androidx.activity.ComponentActivity
    public void onBackPressed() {
        ((MigrationViewModel)this.k.getValue()).onBackPressed();
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        ((ActivityAccountMigrationBinding)this.getDataBinding()).setViewModel(((MigrationViewModel)this.k.getValue()));
        ((MigrationViewModel)this.k.getValue()).initBundle(this.getIntent().getExtras());
        TistoryToolbar tistoryToolbar0 = ((ActivityAccountMigrationBinding)this.getDataBinding()).loginToolbar;
        Intrinsics.checkNotNull(tistoryToolbar0);
        TistoryToolbar.init$default(tistoryToolbar0, this, false, null, 6, null);
        tistoryToolbar0.initAppBarHomeAsUp(BackBlack.INSTANCE);
        tistoryToolbar0.updateAppBarHomeAsUpEnabled(true, new a(this));
        this.setSupportActionBar(tistoryToolbar0);
        MigrationViewModel migrationViewModel0 = (MigrationViewModel)this.k.getValue();
        migrationViewModel0.getState().observe(this, new n(new b(this)));
        LiveDataExtensionKt.observeEvent(migrationViewModel0.getShowRegulationErrorEvent(), this, new d(this));
        LiveDataExtensionKt.observeEvent(migrationViewModel0.getGoToDetail(), this, new e(this));
        LiveDataExtensionKt.observeEvent(migrationViewModel0.getShowDialog(), this, new g(this, migrationViewModel0));
        LiveDataExtensionKt.observeEvent(migrationViewModel0.getShowErrorDialog(), this, new i(this));
        LiveDataExtensionKt.observeEvent(migrationViewModel0.getShowCompleteDialog(), this, new j(this));
        migrationViewModel0.isShowProgress().observe(this, new n(new k(this)));
        LiveDataExtensionKt.observeEvent(migrationViewModel0.getGoToLogin(), this, new l(this));
        LiveDataExtensionKt.observeEvent(migrationViewModel0.getFinishActivity(), this, new m(this));
    }
}

