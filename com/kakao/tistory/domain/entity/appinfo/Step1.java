package com.kakao.tistory.domain.entity.appinfo;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\u0010\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u000B\u0010\u0011\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J5\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00032\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0005HÖ\u0001R\u0016\u0010\u0007\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0018\u0010\u0004\u001A\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/kakao/tistory/domain/entity/appinfo/Step1;", "", "showOldAccountDeprecatedAlert", "", "oldAccountDeprecatedAlertTitle", "", "oldAccountDeprecatedAlertMessage", "hideOldAccountLoginButton", "(ZLjava/lang/String;Ljava/lang/String;Z)V", "getHideOldAccountLoginButton", "()Z", "getOldAccountDeprecatedAlertMessage", "()Ljava/lang/String;", "getOldAccountDeprecatedAlertTitle", "getShowOldAccountDeprecatedAlert", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Step1 {
    @SerializedName("hide_old_account_login_button")
    private final boolean hideOldAccountLoginButton;
    @SerializedName("old_account_deprecated_alert_message")
    @Nullable
    private final String oldAccountDeprecatedAlertMessage;
    @SerializedName("old_account_deprecated_alert_title")
    @Nullable
    private final String oldAccountDeprecatedAlertTitle;
    @SerializedName("show_old_account_deprecated_alert")
    private final boolean showOldAccountDeprecatedAlert;

    public Step1(boolean z, @Nullable String s, @Nullable String s1, boolean z1) {
        this.showOldAccountDeprecatedAlert = z;
        this.oldAccountDeprecatedAlertTitle = s;
        this.oldAccountDeprecatedAlertMessage = s1;
        this.hideOldAccountLoginButton = z1;
    }

    public final boolean component1() {
        return this.showOldAccountDeprecatedAlert;
    }

    @Nullable
    public final String component2() {
        return this.oldAccountDeprecatedAlertTitle;
    }

    @Nullable
    public final String component3() {
        return this.oldAccountDeprecatedAlertMessage;
    }

    public final boolean component4() {
        return this.hideOldAccountLoginButton;
    }

    @NotNull
    public final Step1 copy(boolean z, @Nullable String s, @Nullable String s1, boolean z1) {
        return new Step1(z, s, s1, z1);
    }

    public static Step1 copy$default(Step1 step10, boolean z, String s, String s1, boolean z1, int v, Object object0) {
        if((v & 1) != 0) {
            z = step10.showOldAccountDeprecatedAlert;
        }
        if((v & 2) != 0) {
            s = step10.oldAccountDeprecatedAlertTitle;
        }
        if((v & 4) != 0) {
            s1 = step10.oldAccountDeprecatedAlertMessage;
        }
        if((v & 8) != 0) {
            z1 = step10.hideOldAccountLoginButton;
        }
        return step10.copy(z, s, s1, z1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Step1)) {
            return false;
        }
        if(this.showOldAccountDeprecatedAlert != ((Step1)object0).showOldAccountDeprecatedAlert) {
            return false;
        }
        if(!Intrinsics.areEqual(this.oldAccountDeprecatedAlertTitle, ((Step1)object0).oldAccountDeprecatedAlertTitle)) {
            return false;
        }
        return Intrinsics.areEqual(this.oldAccountDeprecatedAlertMessage, ((Step1)object0).oldAccountDeprecatedAlertMessage) ? this.hideOldAccountLoginButton == ((Step1)object0).hideOldAccountLoginButton : false;
    }

    public final boolean getHideOldAccountLoginButton() {
        return this.hideOldAccountLoginButton;
    }

    @Nullable
    public final String getOldAccountDeprecatedAlertMessage() {
        return this.oldAccountDeprecatedAlertMessage;
    }

    @Nullable
    public final String getOldAccountDeprecatedAlertTitle() {
        return this.oldAccountDeprecatedAlertTitle;
    }

    public final boolean getShowOldAccountDeprecatedAlert() {
        return this.showOldAccountDeprecatedAlert;
    }

    @Override
    public int hashCode() {
        int v = Boolean.hashCode(this.showOldAccountDeprecatedAlert);
        int v1 = 0;
        int v2 = this.oldAccountDeprecatedAlertTitle == null ? 0 : this.oldAccountDeprecatedAlertTitle.hashCode();
        String s = this.oldAccountDeprecatedAlertMessage;
        if(s != null) {
            v1 = s.hashCode();
        }
        return Boolean.hashCode(this.hideOldAccountLoginButton) + ((v * 0x1F + v2) * 0x1F + v1) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "Step1(showOldAccountDeprecatedAlert=" + this.showOldAccountDeprecatedAlert + ", oldAccountDeprecatedAlertTitle=" + this.oldAccountDeprecatedAlertTitle + ", oldAccountDeprecatedAlertMessage=" + this.oldAccountDeprecatedAlertMessage + ", hideOldAccountLoginButton=" + this.hideOldAccountLoginButton + ")";
    }
}

