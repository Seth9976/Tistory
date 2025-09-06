package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.tistory.domain.usecase.LeaveUseCase;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.view.leave.LeaveTiara;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import com.kakao.tistory.presentation.widget.dialog.DialogController;
import com.kakao.tistory.presentation.widget.dialog.DialogEvent;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001FB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001A\u00020\b¢\u0006\u0004\b\r\u0010\u000EJ\r\u0010\u000F\u001A\u00020\b¢\u0006\u0004\b\u000F\u0010\u000ER\u001D\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001A\b\u0012\u0004\u0012\u00020\u00060\u00178F¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019R\u001D\u0010\u001C\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001A0\u00178F¢\u0006\u0006\u001A\u0004\b\u001B\u0010\u0019R\u001D\u0010\u001E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001A0\u00178F¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u0019¨\u0006 "}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/LeaveViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/usecase/LeaveUseCase;", "leaveUseCase", "<init>", "(Lcom/kakao/tistory/domain/usecase/LeaveUseCase;)V", "", "agree", "", "onClickDataRemoveAgree", "(Z)V", "isConfirm", "onClickLeaveConfirm", "onClickDialogLeave", "()V", "onClickLeaveComplete", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kakao/tistory/presentation/viewmodel/LeaveViewModel$LeaveDialogEvent;", "k", "Lkotlinx/coroutines/flow/Flow;", "getDialogEvent", "()Lkotlinx/coroutines/flow/Flow;", "dialogEvent", "Landroidx/lifecycle/LiveData;", "isDataRemoveAgree", "()Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getGoToLeaveCompleteActivity", "goToLeaveCompleteActivity", "getGoToSplashEvent", "goToSplashEvent", "LeaveDialogEvent", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LeaveViewModel extends TistoryViewModel {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/LeaveViewModel$LeaveDialogEvent;", "Lcom/kakao/tistory/presentation/widget/dialog/DialogEvent;", "LeaveConfirm", "Lcom/kakao/tistory/presentation/viewmodel/LeaveViewModel$LeaveDialogEvent$LeaveConfirm;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class LeaveDialogEvent implements DialogEvent {
        @StabilityInferred(parameters = 1)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/LeaveViewModel$LeaveDialogEvent$LeaveConfirm;", "Lcom/kakao/tistory/presentation/viewmodel/LeaveViewModel$LeaveDialogEvent;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public static final class LeaveConfirm extends LeaveDialogEvent {
            public static final int $stable;
            @NotNull
            public static final LeaveConfirm INSTANCE;

            static {
                LeaveConfirm.INSTANCE = new LeaveConfirm();
            }

            public LeaveConfirm() {
                super(null);
            }
        }

        public static final int $stable;

        public LeaveDialogEvent(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 8;
    public final LeaveUseCase g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public final DialogController j;
    public final Flow k;
    public final MutableLiveData l;

    @Inject
    public LeaveViewModel(@NotNull LeaveUseCase leaveUseCase0) {
        Intrinsics.checkNotNullParameter(leaveUseCase0, "leaveUseCase");
        super();
        this.g = leaveUseCase0;
        this.h = new MutableLiveData(Boolean.FALSE);
        this.i = new MutableLiveData();
        DialogController dialogController0 = new DialogController();
        this.j = dialogController0;
        this.k = dialogController0.getEventFlow();
        this.l = new MutableLiveData();
    }

    @NotNull
    public final Flow getDialogEvent() {
        return this.k;
    }

    @NotNull
    public final LiveData getGoToLeaveCompleteActivity() {
        return this.i;
    }

    @NotNull
    public final LiveData getGoToSplashEvent() {
        return this.l;
    }

    @NotNull
    public final LiveData isDataRemoveAgree() {
        return this.h;
    }

    public final void onClickDataRemoveAgree(boolean z) {
        LeaveTiara.INSTANCE.trackClickAgreement();
        this.h.setValue(Boolean.valueOf(z));
    }

    public final void onClickDialogLeave() {
        this.isShowProgress().setValue(Boolean.TRUE);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new r2(this, null), 3, null);
    }

    public final void onClickLeaveComplete() {
        Event event0 = new Event(Unit.INSTANCE);
        this.l.setValue(event0);
    }

    public final void onClickLeaveConfirm(boolean z) {
        if(z) {
            LeaveTiara.INSTANCE.trackClickLeave();
            this.j.sendDialogEvent(LeaveConfirm.INSTANCE);
        }
    }
}

