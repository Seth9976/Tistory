package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.h;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.messaging.FirebaseMessaging;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.data.usecase.LoginByTokenUseCase;
import com.kakao.tistory.data.usecase.PushTokenUseCase;
import com.kakao.tistory.domain.entity.appinfo.AppInfo;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.NotificationRepository;
import com.kakao.tistory.domain.usecase.GetAppInfoUseCase;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import sd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001&B9\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u001F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001A0\u00198\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u001D\u0010\u0017\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u001A0\u00198F¢\u0006\u0006\u001A\u0004\b \u0010\u001ER\u001D\u0010\"\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u001A0\u00198F¢\u0006\u0006\u001A\u0004\b!\u0010\u001ER\u001D\u0010%\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001A0\u00198F¢\u0006\u0006\u001A\u0004\b$\u0010\u001E¨\u0006\'"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SplashViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/usecase/GetAppInfoUseCase;", "getAppInfoUseCase", "Lcom/kakao/tistory/data/usecase/LoginByTokenUseCase;", "loginByTokenUseCase", "Lcom/kakao/tistory/data/usecase/PushTokenUseCase;", "pushTokenUseCase", "Lcom/kakao/tistory/domain/repository/NotificationRepository;", "notificationRepository", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "deviceInfoPreference", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "<init>", "(Lcom/kakao/tistory/domain/usecase/GetAppInfoUseCase;Lcom/kakao/tistory/data/usecase/LoginByTokenUseCase;Lcom/kakao/tistory/data/usecase/PushTokenUseCase;Lcom/kakao/tistory/domain/repository/NotificationRepository;Lcom/kakao/tistory/data/preference/DeviceInfoPreference;Lcom/kakao/tistory/domain/repository/AccountRepository;)V", "", "notificationId", "", "init", "(J)V", "Lcom/kakao/tistory/presentation/viewmodel/SplashViewModel$DestinationType;", "destinationType", "goToDestinationActivity", "(Lcom/kakao/tistory/presentation/viewmodel/SplashViewModel$DestinationType;)V", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "p", "Landroidx/lifecycle/LiveData;", "getShowAppInfoLoadFailEvent", "()Landroidx/lifecycle/LiveData;", "showAppInfoLoadFailEvent", "getGoToDestinationActivity", "getGoToUpdateActivity", "goToUpdateActivity", "Lcom/kakao/tistory/domain/entity/common/RegulationLink;", "getShowRegulationErrorEvent", "showRegulationErrorEvent", "DestinationType", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSplashViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SplashViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/SplashViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
public final class SplashViewModel extends TistoryViewModel {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SplashViewModel$DestinationType;", "", "LOGIN", "MAIN", "TRANSFER", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum DestinationType {
        LOGIN,
        MAIN,
        TRANSFER;

        public static final DestinationType[] a;
        public static final EnumEntries b;

        static {
            DestinationType.a = arr_splashViewModel$DestinationType;
            Intrinsics.checkNotNullParameter(arr_splashViewModel$DestinationType, "entries");
            DestinationType.b = new a(arr_splashViewModel$DestinationType);
        }

        @NotNull
        public static EnumEntries getEntries() {
            return DestinationType.b;
        }
    }

    public static final int $stable = 8;
    public final GetAppInfoUseCase g;
    public final LoginByTokenUseCase h;
    public final PushTokenUseCase i;
    public final NotificationRepository j;
    public final DeviceInfoPreference k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public final LiveData p;
    public long q;

    @Inject
    public SplashViewModel(@NotNull GetAppInfoUseCase getAppInfoUseCase0, @NotNull LoginByTokenUseCase loginByTokenUseCase0, @NotNull PushTokenUseCase pushTokenUseCase0, @NotNull NotificationRepository notificationRepository0, @NotNull DeviceInfoPreference deviceInfoPreference0, @NotNull AccountRepository accountRepository0) {
        Intrinsics.checkNotNullParameter(getAppInfoUseCase0, "getAppInfoUseCase");
        Intrinsics.checkNotNullParameter(loginByTokenUseCase0, "loginByTokenUseCase");
        Intrinsics.checkNotNullParameter(pushTokenUseCase0, "pushTokenUseCase");
        Intrinsics.checkNotNullParameter(notificationRepository0, "notificationRepository");
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        super();
        this.g = getAppInfoUseCase0;
        this.h = loginByTokenUseCase0;
        this.i = pushTokenUseCase0;
        this.j = notificationRepository0;
        this.k = deviceInfoPreference0;
        this.l = new MutableLiveData();
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        MutableLiveData mutableLiveData0 = new MutableLiveData();
        this.o = mutableLiveData0;
        this.p = LiveDataExtensionKt.asLiveData(mutableLiveData0);
        this.q = -1L;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new v5(accountRepository0, null), 3, null);
    }

    public static final void a(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        function10.invoke(object0);
    }

    public final void a(Function0 function00) {
        String s = this.k.getFcmToken();
        Logger.INSTANCE.log("checkFcmToken() " + (s == null ? "null" : s));
        if(s == null || ((s.length() <= 0 ? null : s) == null || BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new y5(this, s, function00, null), 3, null) == null)) {
            Intrinsics.checkNotNullExpressionValue(FirebaseMessaging.getInstance().getToken().addOnSuccessListener(new h(new a6(this, function00), 29)), "addOnSuccessListener(...)");
        }
    }

    public static final void access$checkAppSession(SplashViewModel splashViewModel0, AppInfo appInfo0) {
        splashViewModel0.getClass();
        Logger.INSTANCE.log("checkAppSession()");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(splashViewModel0), null, null, new x5(splashViewModel0, null), 3, null);
    }

    public static final void access$putNotificationRead(SplashViewModel splashViewModel0) {
        splashViewModel0.getClass();
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(splashViewModel0), null, null, new d6(splashViewModel0, null), 3, null);
    }

    public static final void access$showAppInfoError(SplashViewModel splashViewModel0, String s) {
        splashViewModel0.getClass();
        Throwable throwable0 = new Throwable(s);
        CrashlyticsUtils.INSTANCE.logException(throwable0);
        LiveDataExtensionKt.postEvent(splashViewModel0.o, Unit.INSTANCE);
    }

    @NotNull
    public final LiveData getGoToDestinationActivity() {
        return this.l;
    }

    @NotNull
    public final LiveData getGoToUpdateActivity() {
        return this.m;
    }

    @NotNull
    public final LiveData getShowAppInfoLoadFailEvent() {
        return this.p;
    }

    @NotNull
    public final LiveData getShowRegulationErrorEvent() {
        return this.n;
    }

    public final void goToDestinationActivity(@NotNull DestinationType splashViewModel$DestinationType0) {
        Intrinsics.checkNotNullParameter(splashViewModel$DestinationType0, "destinationType");
        Event event0 = new Event(splashViewModel$DestinationType0);
        this.l.setValue(event0);
    }

    public final void init(long v) {
        this.q = v;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c6(this, null), 3, null);
    }
}

