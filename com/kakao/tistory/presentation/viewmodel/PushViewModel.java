package com.kakao.tistory.presentation.viewmodel;

import a5.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kakao.android.base.BaseKt;
import com.kakao.tiara.data.Click;
import com.kakao.tistory.data.preference.DeviceInfoPreference;
import com.kakao.tistory.domain.entity.Etiquette;
import com.kakao.tistory.domain.entity.PushSetting;
import com.kakao.tistory.domain.entity.PushSettingItem;
import com.kakao.tistory.domain.repository.PushRepository;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.extension.Event;
import com.kakao.tistory.presentation.common.tiara.TistoryTiara;
import com.kakao.tistory.presentation.common.tiara.TistoryTiaraActionType;
import com.kakao.tistory.presentation.view.setting.SettingPushItem;
import com.kakao.tistory.presentation.viewmodel.base.TistoryViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.o;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@HiltViewModel
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\f\u0010\rJ\u001D\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u001A\u001A\u00020\u000B2\b\b\u0002\u0010\u0014\u001A\u00020\u00102\b\b\u0002\u0010\u0015\u001A\u00020\u00102\b\b\u0002\u0010\u0016\u001A\u00020\u00102\b\b\u0002\u0010\u0017\u001A\u00020\u00102\b\b\u0002\u0010\u0018\u001A\u00020\u00102\b\b\u0002\u0010\u0019\u001A\u00020\u0010¢\u0006\u0004\b\u001A\u0010\u001BJk\u0010\u001F\u001A\u00020\u000B2\b\b\u0002\u0010\u0014\u001A\u00020\u00102\b\b\u0002\u0010\u0015\u001A\u00020\u00102\b\b\u0002\u0010\u0016\u001A\u00020\u00102\b\b\u0002\u0010\u0017\u001A\u00020\u00102\b\b\u0002\u0010\u0018\u001A\u00020\u00102\b\b\u0002\u0010\u0019\u001A\u00020\u00102\b\b\u0002\u0010\u001C\u001A\u00020\u00102\n\b\u0002\u0010\u001D\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\b¢\u0006\u0004\b\u001F\u0010 J\r\u0010!\u001A\u00020\u000B¢\u0006\u0004\b!\u0010\rR\u001D\u0010\'\u001A\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b\f\u0010&R\u001D\u0010+\u001A\b\u0012\u0004\u0012\u00020\u00100(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b+\u0010,R-\u00100\u001A\u001E\u0012\u001A\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\b0.0-0(8F¢\u0006\u0006\u001A\u0004\b/\u0010,¨\u00061"}, d2 = {"Lcom/kakao/tistory/presentation/viewmodel/PushViewModel;", "Lcom/kakao/tistory/presentation/viewmodel/base/TistoryViewModel;", "Lcom/kakao/tistory/domain/repository/PushRepository;", "pushRepository", "Lcom/kakao/tistory/data/preference/DeviceInfoPreference;", "deviceInfoPreference", "<init>", "(Lcom/kakao/tistory/domain/repository/PushRepository;Lcom/kakao/tistory/data/preference/DeviceInfoPreference;)V", "", "getEtiquetteTime", "()Ljava/lang/String;", "", "getPushSetting", "()V", "Lcom/kakao/tistory/presentation/view/setting/SettingPushItem;", "item", "", "enabled", "onClickPushSetting", "(Lcom/kakao/tistory/presentation/view/setting/SettingPushItem;Z)V", "enable", "comment", "invite", "subscription", "newEntry", "challenge", "checkAndPutPushSetting", "(ZZZZZZ)V", "etiquette", "etiquetteStart", "etiquetteFinish", "putPushSetting", "(ZZZZZZZLjava/lang/String;Ljava/lang/String;)V", "onClickShowTimePicker", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kakao/tistory/domain/entity/PushSetting;", "i", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "pushSetting", "Landroidx/lifecycle/LiveData;", "j", "Landroidx/lifecycle/LiveData;", "isDoNotDisturb", "()Landroidx/lifecycle/LiveData;", "Lcom/kakao/tistory/presentation/common/extension/Event;", "Lkotlin/Pair;", "getShowTimePicker", "showTimePicker", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PushViewModel extends TistoryViewModel {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[SettingPushItem.values().length];
            try {
                arr_v[SettingPushItem.PUSH_NOTIFICATION.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingPushItem.COMMENT_AND_REPLY.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingPushItem.INVITE_AND_ACCEPT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingPushItem.SUBSCRIBE.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingPushItem.NEW_ENTRY.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingPushItem.CHALLENGE.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SettingPushItem.DO_NOT_DISTURB.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable = 8;
    public final PushRepository g;
    public final DeviceInfoPreference h;
    public final MutableLiveData i;
    public final LiveData j;
    public final MutableLiveData k;

    @Inject
    public PushViewModel(@NotNull PushRepository pushRepository0, @NotNull DeviceInfoPreference deviceInfoPreference0) {
        Intrinsics.checkNotNullParameter(pushRepository0, "pushRepository");
        Intrinsics.checkNotNullParameter(deviceInfoPreference0, "deviceInfoPreference");
        super();
        this.g = pushRepository0;
        this.h = deviceInfoPreference0;
        this.i = pushRepository0.getPushSetting();
        this.j = pushRepository0.getEtiquetteEnabled();
        this.k = new MutableLiveData();
    }

    public final void checkAndPutPushSetting(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5) {
        PushSetting pushSetting0 = (PushSetting)this.i.getValue();
        boolean z6 = true;
        boolean z7 = false;
        boolean z8 = pushSetting0 != null && pushSetting0.getEnable() == z;
        if(z1 || z2 || z3 || z4 || z5) {
            z6 = false;
        }
        if(!z8 || !z6) {
            z7 = z;
        }
        if(z7 && z6) {
            PushViewModel.putPushSetting$default(this, z, true, true, true, true, true, false, null, null, 0x1C0, null);
            return;
        }
        PushViewModel.putPushSetting$default(this, z7, z1, z2, z3, z4, z5, false, null, null, 0x1C0, null);
    }

    public static void checkAndPutPushSetting$default(PushViewModel pushViewModel0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, int v, Object object0) {
        boolean z10;
        boolean z9;
        boolean z8;
        boolean z7;
        boolean z6 = false;
        if((v & 1) != 0) {
            PushSetting pushSetting0 = (PushSetting)pushViewModel0.i.getValue();
            z = pushSetting0 == null ? false : pushSetting0.getEnable();
        }
        if((v & 2) == 0) {
            z7 = z1;
        }
        else {
            PushSetting pushSetting1 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting1 == null) {
                z7 = false;
            }
            else {
                PushSettingItem pushSettingItem0 = pushSetting1.getComment();
                z7 = pushSettingItem0 == null ? false : pushSettingItem0.getValue();
            }
        }
        if((v & 4) == 0) {
            z8 = z2;
        }
        else {
            PushSetting pushSetting2 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting2 == null) {
                z8 = false;
            }
            else {
                PushSettingItem pushSettingItem1 = pushSetting2.getInvite();
                z8 = pushSettingItem1 == null ? false : pushSettingItem1.getValue();
            }
        }
        if((v & 8) == 0) {
            z9 = z3;
        }
        else {
            PushSetting pushSetting3 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting3 == null) {
                z9 = false;
            }
            else {
                PushSettingItem pushSettingItem2 = pushSetting3.getSubscription();
                z9 = pushSettingItem2 == null ? false : pushSettingItem2.getValue();
            }
        }
        if((v & 16) == 0) {
            z10 = z4;
        }
        else {
            PushSetting pushSetting4 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting4 == null) {
                z10 = false;
            }
            else {
                PushSettingItem pushSettingItem3 = pushSetting4.getNewEntry();
                z10 = pushSettingItem3 == null ? false : pushSettingItem3.getValue();
            }
        }
        if((v & 0x20) == 0) {
            z6 = z5;
        }
        else {
            PushSetting pushSetting5 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting5 != null) {
                PushSettingItem pushSettingItem4 = pushSetting5.getChallenge();
                if(pushSettingItem4 != null) {
                    z6 = pushSettingItem4.getValue();
                }
            }
        }
        pushViewModel0.checkAndPutPushSetting(z, z7, z8, z9, z10, z6);
    }

    @NotNull
    public final String getEtiquetteTime() {
        String s3;
        String s2;
        Integer integer1;
        PushSetting pushSetting0 = (PushSetting)this.i.getValue();
        Integer integer0 = null;
        if(pushSetting0 == null) {
            integer1 = null;
        }
        else {
            Etiquette etiquette0 = pushSetting0.getEtiquette();
            if(etiquette0 == null) {
                integer1 = null;
            }
            else {
                String s = etiquette0.getStart();
                integer1 = s == null ? null : o.toIntOrNull(s);
            }
        }
        PushSetting pushSetting1 = (PushSetting)this.i.getValue();
        if(pushSetting1 != null) {
            Etiquette etiquette1 = pushSetting1.getEtiquette();
            if(etiquette1 != null) {
                String s1 = etiquette1.getFinish();
                if(s1 != null) {
                    integer0 = o.toIntOrNull(s1);
                }
            }
        }
        int v = 0;
        int v1 = integer1 == null ? 0 : ((int)integer1) / 100;
        int v2 = integer0 == null ? 0 : ((int)integer0) / 100;
        int v3 = integer1 == null ? 0 : ((int)integer1) % 100;
        if(integer0 != null) {
            v = ((int)integer0) % 100;
        }
        if(v1 < 12) {
            s2 = BaseKt.getAppContext().getResources().getString(string.label_time_picker_am);
        }
        else {
            v1 -= 12;
            s2 = BaseKt.getAppContext().getResources().getString(string.label_time_picker_pm);
        }
        Intrinsics.checkNotNull(s2);
        if(v2 < 12) {
            s3 = BaseKt.getAppContext().getResources().getString(string.label_time_picker_am);
        }
        else {
            v2 -= 12;
            s3 = BaseKt.getAppContext().getResources().getString(string.label_time_picker_pm);
        }
        Intrinsics.checkNotNull(s3);
        return b.f(6, "%s %02d:%02d ~ %s %02d:%02d", "format(...)", new Object[]{s2, v1, v3, s3, v2, v});
    }

    @NotNull
    public final MutableLiveData getPushSetting() {
        return this.i;
    }

    public final void getPushSetting() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new f3(this, null), 3, null);
    }

    @NotNull
    public final LiveData getShowTimePicker() {
        return this.k;
    }

    @NotNull
    public final LiveData isDoNotDisturb() {
        return this.j;
    }

    public final void onClickPushSetting(@NotNull SettingPushItem settingPushItem0, boolean z) {
        Intrinsics.checkNotNullParameter(settingPushItem0, "item");
        switch(WhenMappings.$EnumSwitchMapping$0[settingPushItem0.ordinal()]) {
            case 1: {
                PushViewModel.checkAndPutPushSetting$default(this, z, false, false, false, false, false, 62, null);
                break;
            }
            case 2: {
                PushViewModel.checkAndPutPushSetting$default(this, false, z, false, false, false, false, 61, null);
                break;
            }
            case 3: {
                PushViewModel.checkAndPutPushSetting$default(this, false, false, z, false, false, false, 59, null);
                break;
            }
            case 4: {
                PushViewModel.checkAndPutPushSetting$default(this, false, false, false, z, false, false, 55, null);
                break;
            }
            case 5: {
                PushViewModel.checkAndPutPushSetting$default(this, false, false, false, false, z, false, 0x2F, null);
                break;
            }
            case 6: {
                PushViewModel.checkAndPutPushSetting$default(this, false, false, false, false, false, z, 0x1F, null);
                break;
            }
            case 7: {
                PushViewModel.putPushSetting$default(this, false, false, false, false, false, false, z, null, null, 0x1BF, null);
            }
        }
        TistoryTiaraActionType tistoryTiaraActionType0 = settingPushItem0.getTiaraActionType();
        if(tistoryTiaraActionType0 != null) {
            Click click0 = TistoryTiara.createClick$default(TistoryTiara.INSTANCE, "알림 설정", settingPushItem0.getTiaraClickLayer(), null, null, null, null, null, null, null, null, 1020, null);
            TistoryTiara.trackClick$default(TistoryTiara.INSTANCE, this.getSection(), this.getPage(), tistoryTiaraActionType0, null, click0, null, w.mapOf(TuplesKt.to("type", (z ? "on" : "off"))), null, 0xA8, null);
        }
    }

    public final void onClickShowTimePicker() {
        PushSetting pushSetting0 = (PushSetting)this.i.getValue();
        String s = null;
        Etiquette etiquette0 = pushSetting0 == null ? null : pushSetting0.getEtiquette();
        MutableLiveData mutableLiveData0 = this.k;
        String s1 = etiquette0 == null ? null : etiquette0.getStart();
        if(etiquette0 != null) {
            s = etiquette0.getFinish();
        }
        mutableLiveData0.postValue(new Event(new Pair(s1, s)));
    }

    public final void putPushSetting(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @Nullable String s, @Nullable String s1) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g3(this, z, z1, z2, z3, z4, z5, z6, s, s1, null), 3, null);
    }

    public static void putPushSetting$default(PushViewModel pushViewModel0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String s, String s1, int v, Object object0) {
        String s3;
        boolean z13;
        boolean z12;
        boolean z11;
        boolean z10;
        boolean z9;
        boolean z8;
        boolean z7 = false;
        if((v & 1) == 0) {
            z8 = z;
        }
        else {
            PushSetting pushSetting0 = (PushSetting)pushViewModel0.i.getValue();
            z8 = pushSetting0 == null ? false : pushSetting0.getEnable();
        }
        if((v & 2) == 0) {
            z9 = z1;
        }
        else {
            PushSetting pushSetting1 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting1 == null) {
                z9 = false;
            }
            else {
                PushSettingItem pushSettingItem0 = pushSetting1.getComment();
                z9 = pushSettingItem0 == null ? false : pushSettingItem0.getValue();
            }
        }
        if((v & 4) == 0) {
            z10 = z2;
        }
        else {
            PushSetting pushSetting2 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting2 == null) {
                z10 = false;
            }
            else {
                PushSettingItem pushSettingItem1 = pushSetting2.getInvite();
                z10 = pushSettingItem1 == null ? false : pushSettingItem1.getValue();
            }
        }
        if((v & 8) == 0) {
            z11 = z3;
        }
        else {
            PushSetting pushSetting3 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting3 == null) {
                z11 = false;
            }
            else {
                PushSettingItem pushSettingItem2 = pushSetting3.getSubscription();
                z11 = pushSettingItem2 == null ? false : pushSettingItem2.getValue();
            }
        }
        if((v & 16) == 0) {
            z12 = z4;
        }
        else {
            PushSetting pushSetting4 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting4 == null) {
                z12 = false;
            }
            else {
                PushSettingItem pushSettingItem3 = pushSetting4.getNewEntry();
                z12 = pushSettingItem3 == null ? false : pushSettingItem3.getValue();
            }
        }
        if((v & 0x20) == 0) {
            z13 = z5;
        }
        else {
            PushSetting pushSetting5 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting5 == null) {
                z13 = false;
            }
            else {
                PushSettingItem pushSettingItem4 = pushSetting5.getChallenge();
                z13 = pushSettingItem4 == null ? false : pushSettingItem4.getValue();
            }
        }
        if((v & 0x40) == 0) {
            z7 = z6;
        }
        else {
            PushSetting pushSetting6 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting6 != null) {
                Etiquette etiquette0 = pushSetting6.getEtiquette();
                if(etiquette0 != null) {
                    z7 = etiquette0.getEnable();
                }
            }
        }
        String s2 = null;
        if((v & 0x80) == 0) {
            s3 = s;
        }
        else {
            PushSetting pushSetting7 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting7 == null) {
                s3 = null;
            }
            else {
                Etiquette etiquette1 = pushSetting7.getEtiquette();
                s3 = etiquette1 == null ? null : etiquette1.getStart();
            }
        }
        if((v & 0x100) == 0) {
            s2 = s1;
        }
        else {
            PushSetting pushSetting8 = (PushSetting)pushViewModel0.i.getValue();
            if(pushSetting8 != null) {
                Etiquette etiquette2 = pushSetting8.getEtiquette();
                if(etiquette2 != null) {
                    s2 = etiquette2.getFinish();
                }
            }
        }
        pushViewModel0.putPushSetting(z8, z9, z10, z11, z12, z13, z7, s3, s2);
    }
}

