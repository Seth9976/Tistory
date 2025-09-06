package com.kakao.tistory.presentation.view.setting;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/SettingConfig;", "", "Ljava/util/Locale;", "locale", "", "getNoticeBlogName", "(Ljava/util/Locale;)Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SettingConfig {
    public static final int $stable;
    @NotNull
    public static final SettingConfig INSTANCE;

    static {
        SettingConfig.INSTANCE = new SettingConfig();
    }

    @NotNull
    public final String getNoticeBlogName(@NotNull Locale locale0) {
        Intrinsics.checkNotNullParameter(locale0, "locale");
        locale0.getLanguage();
        return "notice";
    }

    public static String getNoticeBlogName$default(SettingConfig settingConfig0, Locale locale0, int v, Object object0) [...] // 潜在的解密器
}

