package com.kakao.tistory.presentation.viewmodel;

import android.util.Patterns;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.messaging.FirebaseMessaging;
import com.kakao.android.base.BaseKt;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.usecase.LoginUseCase;
import com.kakao.tistory.data.usecase.PushTokenUseCase;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import sc.b;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\u000F¢\u0006\u0004\b\u0014\u0010\u0012J\r\u0010\u0015\u001A\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\f¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001A\u00020\f¢\u0006\u0004\b\u0018\u0010\u0016R\u001D\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u000F0\u00198\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u001D\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u000F0\u00198\u0006¢\u0006\f\n\u0004\b\u001E\u0010\u001B\u001A\u0004\b\u001F\u0010\u001DR(\u0010\'\u001A\b\u0012\u0004\u0012\u00020\n0 8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010+\u001A\b\u0012\u0004\u0012\u00020\u000F0 8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b(\u0010\"\u001A\u0004\b)\u0010$\"\u0004\b*\u0010&R(\u0010/\u001A\b\u0012\u0004\u0012\u00020\n0 8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b,\u0010\"\u001A\u0004\b-\u0010$\"\u0004\b.\u0010&R\u001D\u00104\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f01008F¢\u0006\u0006\u001A\u0004\b2\u00103R\u001D\u00106\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f01008F¢\u0006\u0006\u001A\u0004\b5\u00103¨\u00067"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/TistoryLoginViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/data/usecase/LoginUseCase;", "loginUseCase", "Lcom/kakao/tistory/data/usecase/PushTokenUseCase;", "pushTokenUseCase", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "deviceInfoPreference", "<init>", "(Lcom/kakao/tistory/data/usecase/LoginUseCase;Lcom/kakao/tistory/data/usecase/PushTokenUseCase;Lcom/kakao/tistory/data/preference/DeviceInfoPreference;)V", "", "forceTransfer", "", "setForceTransfer", "(Z)V", "", "loginId", "onLoginIdChanged", "(Ljava/lang/String;)V", "password", "onPasswordChanged", "onClickNext", "()V", "onClickLogin", "onClickFindAccount", "Lkotlinx/coroutines/flow/StateFlow;", "m", "Lkotlinx/coroutines/flow/StateFlow;", "getLoginId", "()Lkotlinx/coroutines/flow/StateFlow;", "o", "getPassword", "Landroidx/lifecycle/MutableLiveData;", "p", "Landroidx/lifecycle/MutableLiveData;", "getLoginIdInputLayoutErrorEnabled", "()Landroidx/lifecycle/MutableLiveData;", "setLoginIdInputLayoutErrorEnabled", "(Landroidx/lifecycle/MutableLiveData;)V", "loginIdInputLayoutErrorEnabled", "q", "getLoginIdInputLayoutError", "setLoginIdInputLayoutError", "loginIdInputLayoutError", "r", "getLoginButtonEnabled", "setLoginButtonEnabled", "loginButtonEnabled", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getNavigateToMainActivity", "()Landroidx/lifecycle/LiveData;", "navigateToMainActivity", "getNavigateToTransferActivity", "navigateToTransferActivity", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryLoginViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryLoginViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/TistoryLoginViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
public final class TistoryLoginViewModel extends TistoryViewModel {
    public static final int $stable = 8;
    public final LoginUseCase g;
    public final PushTokenUseCase h;
    public final DeviceInfoPreference i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final MutableStateFlow l;
    public final StateFlow m;
    public final MutableStateFlow n;
    public final StateFlow o;
    public MutableLiveData p;
    public MutableLiveData q;
    public MutableLiveData r;
    public boolean s;

    @Inject
    public TistoryLoginViewModel(@NotNull LoginUseCase loginUseCase0, @NotNull PushTokenUseCase pushTokenUseCase0, @NotNull DeviceInfoPreference deviceInfoPreference0) {
        Intrinsics.checkNotNullParameter(loginUseCase0, "loginUseCase");
        Intrinsics.checkNotNullParameter(pushTokenUseCase0, "pushTokenUseCase");
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        super();
        this.g = loginUseCase0;
        this.h = pushTokenUseCase0;
        this.i = deviceInfoPreference0;
        this.j = new MutableLiveData();
        this.k = new MutableLiveData();
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow("");
        this.l = mutableStateFlow0;
        this.m = FlowKt.asStateFlow(mutableStateFlow0);
        MutableStateFlow mutableStateFlow1 = StateFlowKt.MutableStateFlow("");
        this.n = mutableStateFlow1;
        this.o = FlowKt.asStateFlow(mutableStateFlow1);
        this.p = new MutableLiveData();
        this.q = new MutableLiveData();
        this.r = new MutableLiveData();
    }

    public static final void a(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        function10.invoke(object0);
    }

    public final void a(Function0 function00) {
        String s = this.i.getFcmToken();
        Logger.INSTANCE.log("checkFcmToken() " + (s == null ? "null" : s));
        if(s == null || ((s.length() <= 0 ? null : s) == null || BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new d7(this, s, function00, null), 3, null) == null)) {
            Intrinsics.checkNotNullExpressionValue(FirebaseMessaging.getInstance().getToken().addOnSuccessListener(new b(new f7(this, function00), 0)), "addOnSuccessListener(...)");
        }
    }

    public final boolean a() {
        int v;
        Boolean boolean0 = (Boolean)this.p.getValue();
        if(boolean0 == null || boolean0.booleanValue()) {
            v = 0;
        }
        else {
            v = ((CharSequence)this.l.getValue()).length() != 0 && !Patterns.EMAIL_ADDRESS.matcher(((CharSequence)this.l.getValue())).matches() ? 0 : 1;
            this.p.setValue(Boolean.valueOf(((boolean)(v ^ 1))));
            if(v == 0) {
                this.q.setValue(BaseKt.getAppContext().getString(string.label_login_id_error));
                return false;
            }
        }
        return v != 0 && (((CharSequence)this.n.getValue()).length() > 0 && !p.isBlank(((CharSequence)this.n.getValue())));
    }

    public final void b() {
        if(((CharSequence)this.l.getValue()).length() == 0) {
            this.p.setValue(Boolean.FALSE);
            this.r.setValue(Boolean.FALSE);
            return;
        }
        Boolean boolean0 = (Boolean)this.p.getValue();
        boolean z = false;
        int v = boolean0 == null ? 0 : !boolean0.booleanValue();
        if(v != 0 && (((CharSequence)this.n.getValue()).length() > 0 && !p.isBlank(((CharSequence)this.n.getValue())))) {
            z = true;
        }
        this.r.setValue(Boolean.valueOf(z));
    }

    @NotNull
    public final MutableLiveData getLoginButtonEnabled() {
        return this.r;
    }

    @NotNull
    public final StateFlow getLoginId() {
        return this.m;
    }

    @NotNull
    public final MutableLiveData getLoginIdInputLayoutError() {
        return this.q;
    }

    @NotNull
    public final MutableLiveData getLoginIdInputLayoutErrorEnabled() {
        return this.p;
    }

    @NotNull
    public final LiveData getNavigateToMainActivity() {
        return this.j;
    }

    @NotNull
    public final LiveData getNavigateToTransferActivity() {
        return this.k;
    }

    @NotNull
    public final StateFlow getPassword() {
        return this.o;
    }

    public final void onClickFindAccount() {
    }

    public final void onClickLogin() {
        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "login", null, null, null, null, null, null, null, null, null, 0x3FE, null);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_LOGIN_OLD_ACCOUNT, ActionKind.Login, click0, null, null, null, 0xE0, null);
        String s = StringsKt__StringsKt.trim(((String)this.l.getValue())).toString();
        String s1 = StringsKt__StringsKt.trim(((String)this.n.getValue())).toString();
        boolean z = this.a();
        if(z && s.length() > 0 && s1.length() > 0) {
            this.isShowProgress().setValue(Boolean.TRUE);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h7(this, s, s1, null), 3, null);
            return;
        }
        this.r.setValue(Boolean.valueOf(z));
    }

    public final void onClickNext() {
        Boolean boolean0 = Boolean.valueOf(this.a());
        this.r.setValue(boolean0);
    }

    public final void onLoginIdChanged(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "loginId");
        this.l.setValue(s);
        this.p.setValue(Boolean.FALSE);
        this.b();
    }

    public final void onPasswordChanged(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "password");
        this.n.setValue(s);
        this.b();
    }

    public final void setForceTransfer(boolean z) {
        this.s = z;
    }

    public final void setLoginButtonEnabled(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.r = mutableLiveData0;
    }

    public final void setLoginIdInputLayoutError(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.q = mutableLiveData0;
    }

    public final void setLoginIdInputLayoutErrorEnabled(@NotNull MutableLiveData mutableLiveData0) {
        Intrinsics.checkNotNullParameter(mutableLiveData0, "<set-?>");
        this.p = mutableLiveData0;
    }
}

