package com.kakao.tistory.presentation.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.domain.entity.Blog;
import com.kakao.tistory.domain.entity.BuildType;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.domain.repository.PushRepository;
import com.kakao.tistory.domain.usecase.GetAppInfoUseCase;
import com.kakao.tistory.domain.usecase.LogoutUseCase;
import com.kakao.tistory.presentation.common.BlogRoleType;
import com.kakao.tistory.presentation.common.SettingItem;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\u000B\u001A\u00020\n\u0012\u0006\u0010\r\u001A\u00020\f\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0011\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001A\u00020\u0010\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0017\u001A\u00020\u00102\u0006\u0010\u0016\u001A\u00020\u0015\u00A2\u0006\u0004\b\u0017\u0010\u0018R\u001F\u0010\u001F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001A0\u00198\u0006\u00A2\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u001F\u0010#\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00198\u0006\u00A2\u0006\f\n\u0004\b!\u0010\u001C\u001A\u0004\b\"\u0010\u001ER\u001D\u0010\'\u001A\b\u0012\u0004\u0012\u00020$0\u00198\u0006\u00A2\u0006\f\n\u0004\b%\u0010\u001C\u001A\u0004\b&\u0010\u001ER\u001D\u0010.\u001A\b\u0012\u0004\u0012\u00020)0(8\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u0017\u00101\u001A\u00020$8\u0006\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b1\u00102R\u001D\u00105\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0010030\u00198F\u00A2\u0006\u0006\u001A\u0004\b4\u0010\u001ER\u001D\u00107\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0010030\u00198F\u00A2\u0006\u0006\u001A\u0004\b6\u0010\u001ER\u001D\u00109\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0010030\u00198F\u00A2\u0006\u0006\u001A\u0004\b8\u0010\u001ER\u001D\u0010<\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020:030\u00198F\u00A2\u0006\u0006\u001A\u0004\b;\u0010\u001ER\u001D\u0010>\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0010030\u00198F\u00A2\u0006\u0006\u001A\u0004\b=\u0010\u001ER\u001D\u0010@\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0015030\u00198F\u00A2\u0006\u0006\u001A\u0004\b?\u0010\u001ER\u001D\u0010B\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0015030\u00198F\u00A2\u0006\u0006\u001A\u0004\bA\u0010\u001ER\u001D\u0010D\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0010030\u00198F\u00A2\u0006\u0006\u001A\u0004\bC\u0010\u001ER\u001D\u0010F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0010030\u00198F\u00A2\u0006\u0006\u001A\u0004\bE\u0010\u001ER\u001D\u0010H\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0010030\u00198F\u00A2\u0006\u0006\u001A\u0004\bG\u0010\u001ER\u001D\u0010J\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0010030\u00198F\u00A2\u0006\u0006\u001A\u0004\bI\u0010\u001E\u00A8\u0006K"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/SettingViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/domain/usecase/GetAppInfoUseCase;", "getAppInfoUseCase", "Lcom/kakao/tistory/domain/repository/PushRepository;", "pushRepository", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "deviceInfoPreference", "Lcom/kakao/tistory/domain/usecase/LogoutUseCase;", "logoutUseCase", "Lcom/kakao/tistory/domain/entity/BuildType;", "buildType", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/domain/usecase/GetAppInfoUseCase;Lcom/kakao/tistory/domain/repository/PushRepository;Lcom/kakao/tistory/data/preference/DeviceInfoPreference;Lcom/kakao/tistory/domain/usecase/LogoutUseCase;Lcom/kakao/tistory/domain/entity/BuildType;)V", "", "initPushState", "()V", "initAppUpdateState", "logout", "Lcom/kakao/tistory/presentation/common/SettingItem;", "settingItem", "onClickSettingItem", "(Lcom/kakao/tistory/presentation/common/SettingItem;)V", "Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/domain/entity/User;", "l", "Landroidx/lifecycle/LiveData;", "getUser", "()Landroidx/lifecycle/LiveData;", "user", "Lcom/kakao/tistory/domain/entity/Blog;", "m", "getDefaultBlog", "defaultBlog", "", "n", "getPushEnabled", "pushEnabled", "Landroidx/lifecycle/MutableLiveData;", "", "o", "Landroidx/lifecycle/MutableLiveData;", "getAppUpdateState", "()Landroidx/lifecycle/MutableLiveData;", "appUpdateState", "A", "Z", "isDevelop", "()Z", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getGoToSettingDefaultBlogActivity", "goToSettingDefaultBlogActivity", "getShowDefaultBlogDialog", "showDefaultBlogDialog", "getGoToSettingPushActivity", "goToSettingPushActivity", "Lcom/kakao/tistory/presentation/common/BlogRoleType;", "getGoToNoticeListActivity", "goToNoticeListActivity", "getGoToSettingAppInfoActivity", "goToSettingAppInfoActivity", "getGoToWebViewWithAppBar", "goToWebViewWithAppBar", "getGoToWebViewBottomBar", "goToWebViewBottomBar", "getShowLogoutDialog", "showLogoutDialog", "getGoToSplashActivity", "goToSplashActivity", "getGoToLeaveActivity", "goToLeaveActivity", "getGotoSecretLabActivity", "gotoSecretLabActivity", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSettingViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/SettingViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n1#2:295\n*E\n"})
public final class SettingViewModel extends TistoryViewModel {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[SettingItem.values().length];
            try {
                arr_v[SettingItem.DEFAULT_BLOG.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingItem.PUSH.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingItem.NOTICE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingItem.APP_INFO.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingItem.TERMS_AND_CONDITIONS.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingItem.PRIVACY_POLICY.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingItem.OPEN_SOURCE_LICENSE.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingItem.HELP.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingItem.OPERATION_POLICY.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingItem.QUESTION.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingItem.LOGOUT.ordinal()] = 11;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingItem.LEAVE.ordinal()] = 12;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingItem.SECRET_LAB.ordinal()] = 13;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final boolean A;
    public final GetAppInfoUseCase g;
    public final PushRepository h;
    public final DeviceInfoPreference i;
    public final LogoutUseCase j;
    public final LiveData k;
    public final LiveData l;
    public final LiveData m;
    public final LiveData n;
    public final MutableLiveData o;
    public final MutableLiveData p;
    public final MutableLiveData q;
    public final MutableLiveData r;
    public final MutableLiveData s;
    public final MutableLiveData t;
    public final MutableLiveData u;
    public final MutableLiveData v;
    public final MutableLiveData w;
    public final MutableLiveData x;
    public final MutableLiveData y;
    public final MutableLiveData z;

    @Inject
    public SettingViewModel(@NotNull AccountRepository accountRepository0, @NotNull GetAppInfoUseCase getAppInfoUseCase0, @NotNull PushRepository pushRepository0, @NotNull DeviceInfoPreference deviceInfoPreference0, @NotNull LogoutUseCase logoutUseCase0, @NotNull BuildType buildType0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(getAppInfoUseCase0, "getAppInfoUseCase");
        Intrinsics.checkNotNullParameter(pushRepository0, "pushRepository");
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        Intrinsics.checkNotNullParameter(logoutUseCase0, "logoutUseCase");
        Intrinsics.checkNotNullParameter(buildType0, "buildType");
        super();
        this.g = getAppInfoUseCase0;
        this.h = pushRepository0;
        this.i = deviceInfoPreference0;
        this.j = logoutUseCase0;
        this.k = accountRepository0.isKakaoAccount();
        this.l = accountRepository0.getOldUser();
        this.m = accountRepository0.getOldDefaultBlog();
        this.n = pushRepository0.getPushEnabled();
        this.o = new MutableLiveData();
        this.p = new MutableLiveData();
        this.q = new MutableLiveData();
        this.r = new MutableLiveData();
        this.s = new MutableLiveData();
        this.t = new MutableLiveData();
        this.u = new MutableLiveData();
        this.v = new MutableLiveData();
        this.w = new MutableLiveData();
        this.x = new MutableLiveData();
        this.y = new MutableLiveData();
        this.z = new MutableLiveData();
        this.A = buildType0.isDevelop();
    }

    @NotNull
    public final MutableLiveData getAppUpdateState() {
        return this.o;
    }

    @NotNull
    public final LiveData getDefaultBlog() {
        return this.m;
    }

    @NotNull
    public final LiveData getGoToLeaveActivity() {
        return this.y;
    }

    @NotNull
    public final LiveData getGoToNoticeListActivity() {
        return this.s;
    }

    @NotNull
    public final LiveData getGoToSettingAppInfoActivity() {
        return this.t;
    }

    @NotNull
    public final LiveData getGoToSettingDefaultBlogActivity() {
        return this.p;
    }

    @NotNull
    public final LiveData getGoToSettingPushActivity() {
        return this.r;
    }

    @NotNull
    public final LiveData getGoToSplashActivity() {
        return this.x;
    }

    @NotNull
    public final LiveData getGoToWebViewBottomBar() {
        return this.v;
    }

    @NotNull
    public final LiveData getGoToWebViewWithAppBar() {
        return this.u;
    }

    @NotNull
    public final LiveData getGotoSecretLabActivity() {
        return this.z;
    }

    @NotNull
    public final LiveData getPushEnabled() {
        return this.n;
    }

    @NotNull
    public final LiveData getShowDefaultBlogDialog() {
        return this.q;
    }

    @NotNull
    public final LiveData getShowLogoutDialog() {
        return this.w;
    }

    @NotNull
    public final LiveData getUser() {
        return this.l;
    }

    public final void initAppUpdateState() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new p4(this, null), 3, null);
    }

    public final void initPushState() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new q4(this, null), 3, null);
    }

    public final boolean isDevelop() {
        return this.A;
    }

    public final void logout() {
        Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "logout", null, null, null, null, null, null, null, null, null, 0x3FE, null);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), "설정", TiaraActionType.CLICK_SETTING_LOGOUT_CONFIRM, null, click0, null, null, null, 0xE8, null);
        this.isShowProgress().setValue(Boolean.TRUE);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new r4(this, null), 3, null);
    }

    public final void onClickSettingItem(@NotNull SettingItem settingItem0) {
        Intrinsics.checkNotNullParameter(settingItem0, "settingItem");
        Unit unit0 = null;
        switch(WhenMappings.$EnumSwitchMapping$0[settingItem0.ordinal()]) {
            case 1: {
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SETTING_DEFAULT_BLOG, null, null, null, null, null, 0xF8, null);
                if(((Blog)this.m.getValue()) != null) {
                    Event event0 = new Event(Unit.INSTANCE);
                    this.p.setValue(event0);
                    unit0 = Unit.INSTANCE;
                }
                if(unit0 == null) {
                    Event event1 = new Event(Unit.INSTANCE);
                    this.q.setValue(event1);
                }
                return;
            }
            case 2: {
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SETTING_NOTIFICATION, null, null, null, null, null, 0xF8, null);
                Event event2 = new Event(Unit.INSTANCE);
                this.r.setValue(event2);
                return;
            }
            case 3: {
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SETTING_NOTICE, null, null, null, null, null, 0xF8, null);
                Event event3 = new Event(BlogRoleType.USER);
                this.s.setValue(event3);
                return;
            }
            case 4: {
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SETTING_APP_INFO, null, null, null, null, null, 0xF8, null);
                Event event4 = new Event(Unit.INSTANCE);
                this.t.setValue(event4);
                return;
            }
            case 5: {
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SETTING_TERMS_AND_CONDITIONS, null, null, null, null, null, 0xF8, null);
                Event event5 = new Event(SettingItem.TERMS_AND_CONDITIONS);
                this.u.setValue(event5);
                return;
            }
            case 6: {
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SETTING_PRIVACY_POLICY, null, null, null, null, null, 0xF8, null);
                MutableLiveData mutableLiveData0 = this.u;
                SettingItem settingItem1 = SettingItem.PRIVACY_POLICY;
                Boolean boolean0 = (Boolean)this.k.getValue();
                if(boolean0 != null) {
                    Intrinsics.checkNotNull(boolean0);
                    if(!boolean0.booleanValue()) {
                        boolean0 = null;
                    }
                    if(boolean0 != null) {
                        settingItem1.setUrl("https://www.kakao.com/policy/privacy?lang=ko");
                        unit0 = Unit.INSTANCE;
                    }
                }
                if(unit0 == null) {
                    settingItem1.setUrl("https://www.tistory.com/info/privacy");
                }
                mutableLiveData0.setValue(new Event(settingItem1));
                return;
            }
            case 7: {
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SETTING_OPEN_SOURCE_LICENSE, null, null, null, null, null, 0xF8, null);
                Event event6 = new Event(SettingItem.OPEN_SOURCE_LICENSE);
                this.v.setValue(event6);
                return;
            }
            case 8: {
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SETTING_HELP, null, null, null, null, null, 0xF8, null);
                Event event7 = new Event(SettingItem.HELP);
                this.v.setValue(event7);
                return;
            }
            case 9: {
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SETTING_OPERATION_POLICY, null, null, null, null, null, 0xF8, null);
                Event event8 = new Event(SettingItem.OPERATION_POLICY);
                this.u.setValue(event8);
                return;
            }
            case 10: {
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), this.getPage(), TiaraActionType.CLICK_SETTING_QUESTION, null, null, null, null, null, 0xF8, null);
                Event event9 = new Event(SettingItem.QUESTION);
                this.v.setValue(event9);
                return;
            }
            case 11: {
                Click click0 = TiaraUtils.createClick$default(TiaraUtils.INSTANCE, "logout", null, null, null, null, null, null, null, null, null, 0x3FE, null);
                TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), "설정", TiaraActionType.CLICK_SETTING_LOGOUT, null, click0, null, null, null, 0xE8, null);
                Event event10 = new Event(Unit.INSTANCE);
                this.w.setValue(event10);
                return;
            }
            case 12: {
                TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, this.getSection(), "설정", TistoryTiaraActionType.CLICK_SETTING_LEAVE, null, null, null, null, null, 0xF8, null);
                Event event11 = new Event(Unit.INSTANCE);
                this.y.setValue(event11);
                return;
            }
            case 13: {
                Event event12 = new Event(Unit.INSTANCE);
                this.z.setValue(event12);
            }
        }
    }
}

