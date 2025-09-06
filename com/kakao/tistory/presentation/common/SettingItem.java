package com.kakao.tistory.presentation.common;

import com.kakao.tistory.presentation.R.string;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0007\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001A\u00020\u000B8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000FR$\u0010\u0018\u001A\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001B\u001A\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001A\u0004\b\u001A\u0010\u0015j\u0002\b\u001Cj\u0002\b\u001Dj\u0002\b\u001Ej\u0002\b\u001Fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(¨\u0006)"}, d2 = {"Lcom/kakao/tistory/presentation/common/SettingItem;", "", "", "a", "I", "getViewType", "()I", "viewType", "b", "getTitleStringId", "titleStringId", "", "c", "Z", "getHasDivider", "()Z", "hasDivider", "", "d", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "url", "e", "getTiaraPageType", "tiaraPageType", "DEFAULT_BLOG", "PUSH", "NOTICE", "APP_INFO", "TERMS_AND_CONDITIONS", "PRIVACY_POLICY", "OPEN_SOURCE_LICENSE", "HELP", "OPERATION_POLICY", "QUESTION", "LOGOUT", "LEAVE", "SECRET_LAB", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public enum SettingItem {
    DEFAULT_BLOG(0, string.label_setting_default_blog, false, null, null, 28),
    PUSH(1, string.label_setting_push, true, null, null, 24),
    NOTICE(2, string.label_setting_notice, true, null, null, 24),
    APP_INFO(3, string.label_setting_app_info, false, null, null, 28),
    TERMS_AND_CONDITIONS(4, string.label_setting_terms_and_conditions, false, "https://www.kakao.com/policy/terms?type=ts&lang=ko", "이용약관", 4),
    PRIVACY_POLICY(5, string.label_setting_privacy_policy, false, "https://www.kakao.com/policy/privacy?lang=ko", "개인정보처리방침", 4),
    OPEN_SOURCE_LICENSE(6, string.label_setting_open_source_license, false, "https://t1.daumcdn.net/osa/notice/33/1ugz0rQyI8/NOTICE.html", "오픈소스라이선스", 4),
    HELP(7, string.label_setting_help, true, "https://cs.kakao.com/helps?service=175", "도움말"),
    OPERATION_POLICY(8, string.label_setting_operation_policy, false, "https://www.tistory.com/m/info/policy", "운영정책", 4),
    QUESTION(9, string.label_setting_question, false, "https://cs.kakao.com/requests?service=175&locale=ko", "문의하기", 4),
    LOGOUT(10, string.label_setting_logout, false, null, null, 28),
    LEAVE(11, string.label_setting_leave, false, null, null, 28),
    SECRET_LAB(12, string.label_setting_secret_lab, false, null, null, 28);

    public final int a;
    public final int b;
    public final boolean c;
    public String d;
    public final String e;
    public static final SettingItem[] f;
    public static final EnumEntries g;

    static {
        SettingItem.f = arr_settingItem;
        Intrinsics.checkNotNullParameter(arr_settingItem, "entries");
        SettingItem.g = new a(arr_settingItem);
    }

    public SettingItem(int v1, int v2, boolean z, String s1, String s2) {
        this.a = v1;
        this.b = v2;
        this.c = z;
        this.d = s1;
        this.e = s2;
    }

    public SettingItem(int v1, int v2, boolean z, String s1, String s2, int v3) {
        this(v1, v2, ((v3 & 4) == 0 ? z : false), ((v3 & 8) == 0 ? s1 : null), ((v3 & 16) == 0 ? s2 : null));
    }

    @NotNull
    public static EnumEntries getEntries() {
        return SettingItem.g;
    }

    public final boolean getHasDivider() {
        return this.c;
    }

    @Nullable
    public final String getTiaraPageType() {
        return this.e;
    }

    public final int getTitleStringId() {
        return this.b;
    }

    @Nullable
    public final String getUrl() {
        return this.d;
    }

    public final int getViewType() {
        return this.a;
    }

    public final void setUrl(@Nullable String s) {
        this.d = s;
    }
}

