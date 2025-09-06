package com.kakao.tistory.presentation.main.navigation;

import android.content.Context;
import android.content.Intent;
import com.kakao.tistory.presentation.TistoryMainActivity.Companion;
import com.kakao.tistory.presentation.TistoryMainActivity;
import com.kakao.tistory.presentation.common.ActivityCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A6\u0010\u0004\u001A\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\u00012\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000B2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\r\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000E"}, d2 = {"EXTRA_ACTIVITY_COMMAND", "", "EXTRA_MAIN_COMMAND", "EXTRA_REDIRECT_URL", "createIntent", "Landroid/content/Intent;", "Lcom/kakao/tistory/presentation/TistoryMainActivity$Companion;", "context", "Landroid/content/Context;", "redirectUrl", "activityCommand", "Lcom/kakao/tistory/presentation/common/ActivityCommand;", "mainCommand", "Lcom/kakao/tistory/presentation/main/navigation/MainCommand;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class MainNavigationKt {
    @NotNull
    public static final String EXTRA_ACTIVITY_COMMAND = "EXTRA_ACTIVITY_COMMAND";
    @NotNull
    public static final String EXTRA_MAIN_COMMAND = "EXTRA_MAIN_COMMAND";
    @NotNull
    public static final String EXTRA_REDIRECT_URL = "EXTRA_REDIRECT_URL";

    @NotNull
    public static final Intent createIntent(@NotNull Companion tistoryMainActivity$Companion0, @NotNull Context context0, @Nullable String s, @Nullable ActivityCommand activityCommand0, @Nullable MainCommand mainCommand0) {
        Intrinsics.checkNotNullParameter(tistoryMainActivity$Companion0, "<this>");
        Intrinsics.checkNotNullParameter(context0, "context");
        Intent intent0 = new Intent(context0, TistoryMainActivity.class);
        intent0.putExtra("EXTRA_REDIRECT_URL", s);
        intent0.putExtra("EXTRA_ACTIVITY_COMMAND", activityCommand0);
        intent0.putExtra("EXTRA_MAIN_COMMAND", mainCommand0);
        return intent0;
    }

    public static Intent createIntent$default(Companion tistoryMainActivity$Companion0, Context context0, String s, ActivityCommand activityCommand0, MainCommand mainCommand0, int v, Object object0) {
        if((v & 2) != 0) {
            s = null;
        }
        if((v & 4) != 0) {
            activityCommand0 = null;
        }
        if((v & 8) != 0) {
            mainCommand0 = null;
        }
        return MainNavigationKt.createIntent(tistoryMainActivity$Companion0, context0, s, activityCommand0, mainCommand0);
    }
}

