package com.kakao.tistory.presentation.main;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.utils.Logger;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.AutoSaveRepository;
import com.kakao.tistory.domain.repository.NotificationRepository;
import com.kakao.tistory.domain.usecase.CheckLatestEditEntryUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.ActivityCommand.ShowDialogCommand;
import com.kakao.tistory.presentation.common.ActivityCommand.ShowToastCommand;
import com.kakao.tistory.presentation.common.ActivityCommand;
import com.kakao.tistory.presentation.common.TistoryMVIViewmodel;
import com.kakao.tistory.presentation.main.contract.MainEvent.ChangeMainDestination;
import com.kakao.tistory.presentation.main.contract.MainEvent.FinishApp;
import com.kakao.tistory.presentation.main.contract.MainEvent.GoEditor;
import com.kakao.tistory.presentation.main.contract.MainEvent.ShowDialog;
import com.kakao.tistory.presentation.main.contract.MainEvent.ShowToast;
import com.kakao.tistory.presentation.main.contract.MainEvent.ShowWelcomeDialog;
import com.kakao.tistory.presentation.main.contract.MainIntent.BackPressedInHome;
import com.kakao.tistory.presentation.main.contract.MainIntent.ChangeCurrentBlog;
import com.kakao.tistory.presentation.main.contract.MainIntent.NavigateToEditor;
import com.kakao.tistory.presentation.main.contract.MainIntent.RedirectUrl;
import com.kakao.tistory.presentation.main.contract.MainIntent.UpdateNotificationCount;
import com.kakao.tistory.presentation.main.contract.MainIntent.WaitingTimeForFinishEnds;
import com.kakao.tistory.presentation.main.contract.MainIntent;
import com.kakao.tistory.presentation.main.contract.MainUiState;
import com.kakao.tistory.presentation.main.navigation.MainCommand.GoMy;
import com.kakao.tistory.presentation.main.navigation.MainCommand.GoNotification;
import com.kakao.tistory.presentation.main.navigation.MainCommand.ShowWelcomDialog;
import com.kakao.tistory.presentation.main.navigation.MainCommand;
import com.kakao.tistory.presentation.main.navigation.MainDestination;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"RestrictedApi"})
@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0007\u0018\u0000 \u00172\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0017B1\b\u0007\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\n\u001A\u00020\t\u0012\u0006\u0010\f\u001A\u00020\u000B\u0012\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001A\u00020\u00042\u0006\u0010\u0013\u001A\u00020\u00042\u0006\u0010\u0014\u001A\u00020\u0002H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/kakao/tistory/presentation/main/MainAppViewModel;", "Lcom/kakao/tistory/presentation/common/TistoryMVIViewmodel;", "Lcom/kakao/tistory/presentation/main/contract/MainIntent;", "Lcom/kakao/tistory/presentation/main/contract/MainEvent;", "Lcom/kakao/tistory/presentation/main/contract/MainUiState;", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/repository/NotificationRepository;", "notificationRepository", "Lcom/kakao/tistory/domain/usecase/CheckLatestEditEntryUseCase;", "checkLatestEditEntryUseCase", "Lcom/kakao/tistory/domain/repository/AutoSaveRepository;", "autoSaveRepository", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/repository/NotificationRepository;Lcom/kakao/tistory/domain/usecase/CheckLatestEditEntryUseCase;Lcom/kakao/tistory/domain/repository/AutoSaveRepository;)V", "createInitState", "()Lcom/kakao/tistory/presentation/main/contract/MainUiState;", "current", "intent", "handleIntent", "(Lcom/kakao/tistory/presentation/main/contract/MainUiState;Lcom/kakao/tistory/presentation/main/contract/MainIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMainAppViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAppViewModel.kt\ncom/kakao/tistory/presentation/main/MainAppViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
public final class MainAppViewModel extends TistoryMVIViewmodel {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/main/MainAppViewModel$Companion;", "", "", "FINISH_DELAY", "J", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AccountRepository f;
    public final NotificationRepository g;
    public final CheckLatestEditEntryUseCase h;
    public final AutoSaveRepository i;

    static {
        MainAppViewModel.Companion = new Companion(null);
        MainAppViewModel.$stable = 8;
    }

    @Inject
    public MainAppViewModel(@NotNull SavedStateHandle savedStateHandle0, @NotNull AccountRepository accountRepository0, @NotNull NotificationRepository notificationRepository0, @NotNull CheckLatestEditEntryUseCase checkLatestEditEntryUseCase0, @NotNull AutoSaveRepository autoSaveRepository0) {
        Intrinsics.checkNotNullParameter(savedStateHandle0, "savedStateHandle");
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(notificationRepository0, "notificationRepository");
        Intrinsics.checkNotNullParameter(checkLatestEditEntryUseCase0, "checkLatestEditEntryUseCase");
        Intrinsics.checkNotNullParameter(autoSaveRepository0, "autoSaveRepository");
        super();
        this.f = accountRepository0;
        this.g = notificationRepository0;
        this.h = checkLatestEditEntryUseCase0;
        this.i = autoSaveRepository0;
        Bundle bundle0 = savedStateHandle0.savedStateProvider().saveState();
        Logger.INSTANCE.log("MainAppViewModel init " + bundle0);
        String s = (String)savedStateHandle0.remove("EXTRA_REDIRECT_URL");
        if(s != null) {
            this.sendIntent(new RedirectUrl(s));
        }
        ActivityCommand activityCommand0 = (ActivityCommand)savedStateHandle0.remove("EXTRA_ACTIVITY_COMMAND");
        if(activityCommand0 != null) {
            this.a(activityCommand0);
        }
        MainCommand mainCommand0 = (MainCommand)savedStateHandle0.remove("EXTRA_MAIN_COMMAND");
        if(mainCommand0 != null) {
            if(Intrinsics.areEqual(mainCommand0, GoNotification.INSTANCE)) {
                this.sendEvent(new ChangeMainDestination(MainDestination.NOTIFICATION));
            }
            else if(Intrinsics.areEqual(mainCommand0, GoMy.INSTANCE)) {
                this.sendEvent(new ChangeMainDestination(MainDestination.MY));
            }
            else if(mainCommand0 instanceof ShowWelcomDialog) {
                this.sendEvent(new ShowWelcomeDialog(((ShowWelcomDialog)mainCommand0).getName()));
            }
        }
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f0(this, null), 3, null);
    }

    public final Unit a(ActivityCommand activityCommand0) {
        if(activityCommand0 instanceof ShowDialogCommand) {
            if(((ShowDialogCommand)activityCommand0).getTitle() == null) {
                return null;
            }
            this.sendEvent(new ShowDialog(((ShowDialogCommand)activityCommand0).getTitle(), ((ShowDialogCommand)activityCommand0).getMessage()));
            return Unit.INSTANCE;
        }
        if(!(activityCommand0 instanceof ShowToastCommand)) {
            throw new NoWhenBranchMatchedException();
        }
        if(((ShowToastCommand)activityCommand0).getMessage() != null) {
            this.sendEvent(new ShowToast(((ShowToastCommand)activityCommand0).getMessage(), null, 2, null));
            return Unit.INSTANCE;
        }
        return null;
    }

    public static final void access$handleMainCommand(MainAppViewModel mainAppViewModel0, MainCommand mainCommand0) {
        mainAppViewModel0.getClass();
        if(Intrinsics.areEqual(mainCommand0, GoNotification.INSTANCE)) {
            mainAppViewModel0.sendEvent(new ChangeMainDestination(MainDestination.NOTIFICATION));
            return;
        }
        if(Intrinsics.areEqual(mainCommand0, GoMy.INSTANCE)) {
            mainAppViewModel0.sendEvent(new ChangeMainDestination(MainDestination.MY));
            return;
        }
        if(mainCommand0 instanceof ShowWelcomDialog) {
            mainAppViewModel0.sendEvent(new ShowWelcomeDialog(((ShowWelcomDialog)mainCommand0).getName()));
        }
    }

    public static final void access$handleRedirectUrl(MainAppViewModel mainAppViewModel0, String s) {
        mainAppViewModel0.getClass();
        mainAppViewModel0.sendIntent(new RedirectUrl(s));
    }

    @NotNull
    public MainUiState createInitState() {
        return new MainUiState(null, 0L, false, false, new h0(this), new i0(this), new j0(this), 15, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object createInitState() {
        return this.createInitState();
    }

    @Nullable
    public Object handleIntent(@NotNull MainUiState mainUiState0, @NotNull MainIntent mainIntent0, @NotNull Continuation continuation0) {
        Logger.INSTANCE.log("MainAppViewModel handleIntent: " + mainIntent0);
        if(mainIntent0 instanceof ChangeCurrentBlog) {
            if(!mainUiState0.getHasRedirection()) {
                Blog blog0 = ((ChangeCurrentBlog)mainIntent0).getBlog();
                String s = blog0 == null ? null : blog0.getName();
                if(s != null) {
                    BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g0(this, s, null), 3, null);
                }
            }
            return MainUiState.copy$default(mainUiState0, ((ChangeCurrentBlog)mainIntent0).getBlog(), 0L, false, false, null, null, null, 0x7E, null);
        }
        if(Intrinsics.areEqual(mainIntent0, BackPressedInHome.INSTANCE)) {
            if(mainUiState0.getShowBackPressedSnackBar()) {
                this.sendEvent(FinishApp.INSTANCE);
                return mainUiState0;
            }
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new k0(this, null), 3, null);
            return MainUiState.copy$default(mainUiState0, null, 0L, true, false, null, null, null, 0x7B, null);
        }
        if(Intrinsics.areEqual(mainIntent0, WaitingTimeForFinishEnds.INSTANCE)) {
            return MainUiState.copy$default(mainUiState0, null, 0L, false, false, null, null, null, 0x7B, null);
        }
        if(mainIntent0 instanceof RedirectUrl) {
            this.sendEvent(new com.kakao.tistory.presentation.main.contract.MainEvent.RedirectUrl(((RedirectUrl)mainIntent0).getUrl()));
            return MainUiState.copy$default(mainUiState0, null, 0L, false, true, null, null, null, 0x77, null);
        }
        if(Intrinsics.areEqual(mainIntent0, NavigateToEditor.INSTANCE)) {
            if(mainUiState0.isBlogLess()) {
                this.sendEvent(new ShowToast(null, Boxing.boxInt(string.label_exception_blog_less_editor), 1, null));
                return mainUiState0;
            }
            if(mainUiState0.isBlogRestricted()) {
                this.sendEvent(new ShowToast(null, Boxing.boxInt(string.label_exception_blog_restricted_editor), 1, null));
                return mainUiState0;
            }
            this.sendEvent(new GoEditor(false, 1, null));
            return mainUiState0;
        }
        if(!(mainIntent0 instanceof UpdateNotificationCount)) {
            throw new NoWhenBranchMatchedException();
        }
        return MainUiState.copy$default(mainUiState0, null, ((UpdateNotificationCount)mainIntent0).getCount(), false, false, null, null, null, 0x7D, null);
    }

    @Override  // com.kakao.tistory.presentation.common.TistoryMVIViewmodel
    public Object handleIntent(Object object0, Object object1, Continuation continuation0) {
        return this.handleIntent(((MainUiState)object0), ((MainIntent)object1), continuation0);
    }
}

