package com.kakao.tistory.presentation.viewmodel;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.sdk.auth.LoginClient.Companion;
import com.kakao.sdk.auth.LoginClient;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.tistory.data.usecase.LoginByTokenUseCase;
import com.kakao.tistory.domain.entity.common.RegulationErrorModel;
import com.kakao.tistory.domain.entity.common.RegulationLink;
import com.kakao.tistory.domain.entity.common.Result.Fail;
import com.kakao.tistory.domain.entity.common.Result.Success;
import com.kakao.tistory.domain.entity.common.Result;
import com.kakao.tistory.domain.repository.AccountRepository;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.common.utils.CrashlyticsUtils;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001AB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\b\u00A2\u0006\u0004\b\u000B\u0010\fJ\u001F\u0010\u0011\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\n\u00A2\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001A\u00020\n\u00A2\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001A\u00020\n\u00A2\u0006\u0004\b\u0016\u0010\u0014J\r\u0010\u0017\u001A\u00020\n\u00A2\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u0018\u001A\u00020\n\u00A2\u0006\u0004\b\u0018\u0010\u0014R\u001F\u0010\u001F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001A0\u00198\u0006\u00A2\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\"\u0010&\u001A\u00020\u000F8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b \u0010!\u001A\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010(\u001A\u00020\u000F8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\'\u0010!\u001A\u0004\b(\u0010#\"\u0004\b)\u0010%R\u0017\u0010,\u001A\b\u0012\u0004\u0012\u00020*0\u00198F\u00A2\u0006\u0006\u001A\u0004\b+\u0010\u001ER\u0017\u0010/\u001A\b\u0012\u0004\u0012\u00020-0\u00198F\u00A2\u0006\u0006\u001A\u0004\b.\u0010\u001ER\u001D\u00102\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n000\u00198F\u00A2\u0006\u0006\u001A\u0004\b1\u0010\u001ER\u001D\u00104\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n000\u00198F\u00A2\u0006\u0006\u001A\u0004\b3\u0010\u001ER\u001D\u00107\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u000205000\u00198F\u00A2\u0006\u0006\u001A\u0004\b6\u0010\u001ER\u001D\u00109\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n000\u00198F\u00A2\u0006\u0006\u001A\u0004\b8\u0010\u001ER\u001D\u0010;\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n000\u00198F\u00A2\u0006\u0006\u001A\u0004\b:\u0010\u001ER\u0017\u0010=\u001A\b\u0012\u0004\u0012\u00020\u001A0\u00198F\u00A2\u0006\u0006\u001A\u0004\b<\u0010\u001ER\u001D\u0010@\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020>000\u00198F\u00A2\u0006\u0006\u001A\u0004\b?\u0010\u001E\u00A8\u0006B"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/MigrationViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/AccountRepository;", "accountRepository", "Lcom/kakao/tistory/data/usecase/LoginByTokenUseCase;", "loginByTokenUseCase", "<init>", "(Lcom/kakao/tistory/domain/repository/AccountRepository;Lcom/kakao/tistory/data/usecase/LoginByTokenUseCase;)V", "Landroid/os/Bundle;", "bundle", "", "initBundle", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "", "isAccountLogin", "onClickKakaoLogin", "(Landroid/content/Context;Z)V", "onClickMigration", "()V", "onClickGoHome", "onClickConfirmDetailLink", "onClickUsedEmailDetailLink", "onBackPressed", "Landroidx/lifecycle/LiveData;", "", "q", "Landroidx/lifecycle/LiveData;", "getTistoryEmail", "()Landroidx/lifecycle/LiveData;", "tistoryEmail", "t", "Z", "getNeedRemoveAppSessionWhenClose", "()Z", "setNeedRemoveAppSessionWhenClose", "(Z)V", "needRemoveAppSessionWhenClose", "u", "isSendTiaraStartPage", "setSendTiaraStartPage", "Lcom/kakao/tistory/presentation/viewmodel/MigrationViewModel$MigrationState;", "getState", "state", "", "getAppbarTitleRes", "appbarTitleRes", "Lcom/kakao/tistory/presentation/common/extension/Event;", "getGoToDetail", "goToDetail", "getShowDialog", "showDialog", "Lcom/kakao/tistory/domain/entity/common/EmptyModel;", "getShowCompleteDialog", "showCompleteDialog", "getGoToLogin", "goToLogin", "getFinishActivity", "finishActivity", "getKakaoEmail", "kakaoEmail", "Lcom/kakao/tistory/domain/entity/common/RegulationLink;", "getShowRegulationErrorEvent", "showRegulationErrorEvent", "MigrationState", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMigrationViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MigrationViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/MigrationViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Result.kt\ncom/kakao/tistory/domain/entity/common/ResultKt\n*L\n1#1,245:1\n1#2:246\n15#3,5:247\n*S KotlinDebug\n*F\n+ 1 MigrationViewModel.kt\ncom/kakao/tistory/presentation/viewmodel/MigrationViewModel\n*L\n190#1:247,5\n*E\n"})
public final class MigrationViewModel extends TistoryViewModel {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/MigrationViewModel$MigrationState;", "", "", "a", "Ljava/lang/Integer;", "getTitleStringId", "()Ljava/lang/Integer;", "titleStringId", "LOGIN", "MIGRATION", "USED_ACCOUNT", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum MigrationState {
        LOGIN(string.label_kakao_migration_login_title),
        MIGRATION(string.label_kakao_migration_title),
        USED_ACCOUNT(string.label_kakao_migration_already_used_title);

        public final Integer a;
        public static final MigrationState[] b;
        public static final EnumEntries c;

        static {
            MigrationState.b = arr_migrationViewModel$MigrationState;
            Intrinsics.checkNotNullParameter(arr_migrationViewModel$MigrationState, "entries");
            MigrationState.c = new a(arr_migrationViewModel$MigrationState);
        }

        public MigrationState(Integer integer0) {
            this.a = integer0;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return MigrationState.c;
        }

        @Nullable
        public final Integer getTitleStringId() {
            return this.a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[MigrationState.values().length];
            try {
                arr_v[MigrationState.LOGIN.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MigrationState.MIGRATION.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MigrationState.USED_ACCOUNT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final AccountRepository g;
    public final LoginByTokenUseCase h;
    public final MutableLiveData i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public OAuthToken p;
    public final LiveData q;
    public final MutableLiveData r;
    public final MutableLiveData s;
    public boolean t;
    public boolean u;

    @Inject
    public MigrationViewModel(@NotNull AccountRepository accountRepository0, @NotNull LoginByTokenUseCase loginByTokenUseCase0) {
        Intrinsics.checkNotNullParameter(accountRepository0, "accountRepository");
        Intrinsics.checkNotNullParameter(loginByTokenUseCase0, "loginByTokenUseCase");
        super();
        this.g = accountRepository0;
        this.h = loginByTokenUseCase0;
        this.i = new MutableLiveData();
        this.j = new MutableLiveData(MigrationState.LOGIN.getTitleStringId());
        this.k = new MutableLiveData();
        this.l = new MutableLiveData();
        this.m = new MutableLiveData();
        this.n = new MutableLiveData();
        this.o = new MutableLiveData();
        this.q = Transformations.map(accountRepository0.getOldUser(), a3.a);
        this.r = new MutableLiveData();
        this.s = new MutableLiveData();
    }

    public static final Object access$login(MigrationViewModel migrationViewModel0, Function0 function00, Continuation continuation0) {
        v2 v20;
        migrationViewModel0.getClass();
        if(continuation0 instanceof v2) {
            v20 = (v2)continuation0;
            int v = v20.e;
            if((v & 0x80000000) == 0) {
                v20 = new v2(migrationViewModel0, continuation0);
            }
            else {
                v20.e = v ^ 0x80000000;
            }
        }
        else {
            v20 = new v2(migrationViewModel0, continuation0);
        }
        Object object0 = v20.c;
        Unit unit0 = qd.a.getCOROUTINE_SUSPENDED();
        switch(v20.e) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                migrationViewModel0.isShowProgress().postValue(Boxing.boxBoolean(true));
                v20.a = migrationViewModel0;
                v20.b = function00;
                v20.e = 1;
                object0 = migrationViewModel0.h.invoke(v20);
                if(object0 == unit0) {
                    return unit0;
                }
                break;
            }
            case 1: {
                function00 = v20.b;
                migrationViewModel0 = v20.a;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((Result)object0) instanceof Success) {
            function00.invoke();
        }
        else if(((Result)object0) instanceof Fail) {
            if(Intrinsics.areEqual("EXCEPTION_UNKNOWN_STATUS", "CAN_NOT_AUTHENTICATE")) {
                ErrorModel errorModel0 = ((Fail)(((Result)object0))).getErrorModel();
                Unit unit1 = null;
                RegulationErrorModel regulationErrorModel0 = errorModel0 instanceof RegulationErrorModel ? ((RegulationErrorModel)errorModel0) : null;
                if(regulationErrorModel0 != null) {
                    RegulationLink regulationLink0 = regulationErrorModel0.getData();
                    if(regulationLink0 != null) {
                        Event event0 = new Event(regulationLink0);
                        migrationViewModel0.s.setValue(event0);
                        unit1 = Unit.INSTANCE;
                    }
                }
                if(unit1 == null) {
                    migrationViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
                }
            }
            else {
                migrationViewModel0.showErrorDialog(((Fail)(((Result)object0))).getErrorModel());
            }
        }
        migrationViewModel0.isShowProgress().postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }

    public static final void access$moveState(MigrationViewModel migrationViewModel0, MigrationState migrationViewModel$MigrationState0) {
        migrationViewModel0.i.postValue(migrationViewModel$MigrationState0);
        migrationViewModel0.j.postValue(migrationViewModel$MigrationState0.getTitleStringId());
    }

    public static final void access$onFinishLogin(MigrationViewModel migrationViewModel0, OAuthToken oAuthToken0, Throwable throwable0) {
        migrationViewModel0.isShowProgress().postValue(Boolean.FALSE);
        if(oAuthToken0 != null) {
            migrationViewModel0.isShowProgress().postValue(Boolean.TRUE);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(migrationViewModel0), null, null, new u2(migrationViewModel0, oAuthToken0, null), 3, null);
            return;
        }
        if(throwable0 != null) {
            CrashlyticsUtils.INSTANCE.logException(throwable0);
        }
    }

    @NotNull
    public final LiveData getAppbarTitleRes() {
        return this.j;
    }

    @NotNull
    public final LiveData getFinishActivity() {
        return this.o;
    }

    @NotNull
    public final LiveData getGoToDetail() {
        return this.k;
    }

    @NotNull
    public final LiveData getGoToLogin() {
        return this.n;
    }

    @NotNull
    public final LiveData getKakaoEmail() {
        return this.r;
    }

    public final boolean getNeedRemoveAppSessionWhenClose() {
        return this.t;
    }

    @NotNull
    public final LiveData getShowCompleteDialog() {
        return this.m;
    }

    @NotNull
    public final LiveData getShowDialog() {
        return this.l;
    }

    @NotNull
    public final LiveData getShowRegulationErrorEvent() {
        return this.s;
    }

    @NotNull
    public final LiveData getState() {
        return this.i;
    }

    @NotNull
    public final LiveData getTistoryEmail() {
        return this.q;
    }

    public final void initBundle(@Nullable Bundle bundle0) {
        this.t = bundle0 == null ? false : bundle0.getBoolean("EXTRA_NEED_REMOVE_APP_SESSION");
    }

    public final boolean isSendTiaraStartPage() {
        return this.u;
    }

    public final void onBackPressed() {
        MigrationState migrationViewModel$MigrationState0 = (MigrationState)this.getState().getValue();
        switch((migrationViewModel$MigrationState0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[migrationViewModel$MigrationState0.ordinal()])) {
            case -1: 
            case 1: {
                if(this.t) {
                    this.g.clearAppSession();
                    Event event0 = new Event(Unit.INSTANCE);
                    this.n.postValue(event0);
                    return;
                }
                Event event1 = new Event(Unit.INSTANCE);
                this.o.postValue(event1);
                return;
            }
            case 2: {
                Event event2 = new Event(Unit.INSTANCE);
                this.l.postValue(event2);
                return;
            }
            case 3: {
                this.i.postValue(MigrationState.LOGIN);
                this.j.postValue(MigrationState.LOGIN.getTitleStringId());
            }
        }
    }

    public final void onClickConfirmDetailLink() {
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), "최종확인", TiaraActionType.CLICK_SEE_DETAIL, null, null, null, null, null, 0xF8, null);
        Event event0 = new Event(Unit.INSTANCE);
        this.k.postValue(event0);
    }

    public final void onClickGoHome() {
        this.i.postValue(MigrationState.LOGIN);
        this.j.postValue(MigrationState.LOGIN.getTitleStringId());
    }

    public final void onClickKakaoLogin(@NotNull Context context0, boolean z) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this.p = null;
        this.r.postValue(null);
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), "시작안내", (z ? TiaraActionType.CLICK_LOGIN_KAKAO_DIRECTLY : TiaraActionType.CLICK_LOGIN_KAKAO), null, null, null, null, null, 0xF8, null);
        this.isShowProgress().postValue(Boolean.TRUE);
        if(!z) {
            Companion loginClient$Companion0 = LoginClient.Companion;
            if(loginClient$Companion0.getInstance().isKakaoTalkLoginAvailable(context0)) {
                LoginClient.loginWithKakaoTalk$default(loginClient$Companion0.getInstance(), context0, 0, null, null, new w2(this), 14, null);
                return;
            }
        }
        LoginClient.loginWithKakaoAccount$default(LoginClient.Companion.getInstance(), context0, null, null, null, new x2(this), 14, null);
    }

    public static void onClickKakaoLogin$default(MigrationViewModel migrationViewModel0, Context context0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        migrationViewModel0.onClickKakaoLogin(context0, z);
    }

    public final void onClickMigration() {
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), "최종확인", TiaraActionType.CLICK_TRANSFER, null, null, null, null, null, 0xF8, null);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new z2(this, null), 3, null);
    }

    public final void onClickUsedEmailDetailLink() {
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, this.getSection(), "전환불가", TiaraActionType.CLICK_SEE_DETAIL, null, null, null, null, null, 0xF8, null);
        Event event0 = new Event(Unit.INSTANCE);
        this.k.postValue(event0);
    }

    public final void setNeedRemoveAppSessionWhenClose(boolean z) {
        this.t = z;
    }

    public final void setSendTiaraStartPage(boolean z) {
        this.u = z;
    }
}

