package com.kakao.tistory.presentation.common.utils;

import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.kakao.android.base.BaseKt;
import com.kakao.android.base.utils.Logger;
import com.kakao.tistory.presentation.common.DeviceDirection;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u001A\r\u0010\u0001\u001A\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001A\r\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001A\r\u0010\u0006\u001A\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0005\u001A\r\u0010\u0007\u001A\u00020\u0003¢\u0006\u0004\b\u0007\u0010\u0005\u001A\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\n\u001A\r\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\f\u0010\r\u001A\r\u0010\u000E\u001A\u00020\u000B¢\u0006\u0004\b\u000E\u0010\r\u001A\r\u0010\u000F\u001A\u00020\u000B¢\u0006\u0004\b\u000F\u0010\r\u001A\r\u0010\u0010\u001A\u00020\u000B¢\u0006\u0004\b\u0010\u0010\r\u001A\r\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u001A:\u0010\u001B\u001A\u00020\u00192\b\u0010\u0014\u001A\u0004\u0018\u00010\u00112!\u0010\u001A\u001A\u001D\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00190\u0015¢\u0006\u0004\b\u001B\u0010\u001C\u001A\r\u0010\u001D\u001A\u00020\u0011¢\u0006\u0004\b\u001D\u0010\u0013\u001A\r\u0010\u001E\u001A\u00020\u000B¢\u0006\u0004\b\u001E\u0010\r\u001A\u000F\u0010\u001F\u001A\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001F\u0010\u0013\"\u0014\u0010 \u001A\u00020\u000B8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"", "getDeviceInch", "()D", "", "isDeviceCompatHeight", "()Z", "isTablet", "isLandscape", "Lcom/kakao/tistory/presentation/common/DeviceDirection;", "getDeviceDirection", "()Lcom/kakao/tistory/presentation/common/DeviceDirection;", "", "getVisibleHomeItemCount", "()I", "getDisplayWidth", "getDisplayHeight", "getStatusBarHeight", "", "getAppVersion", "()Ljava/lang/String;", "deprecatedAppVersion", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isDeprecated", "", "callback", "checkDeprecatedAppVersion", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getLanguage", "getTimeZone", "getDeviceIP", "TABLET_7", "I", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDeviceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceUtils.kt\ncom/kakao/tistory/presentation/common/utils/DeviceUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
public final class DeviceUtilsKt {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[DeviceDirection.values().length];
            try {
                arr_v[DeviceDirection.PHONE_PORT.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[DeviceDirection.PHONE_LAND.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[DeviceDirection.TABLET_PORT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[DeviceDirection.TABLET_LAND.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int TABLET_7 = 7;
    public static String a;

    public static final void checkDeprecatedAppVersion(@Nullable String s, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "callback");
        String s1 = DeviceUtilsKt.getAppVersion();
        Boolean boolean0 = null;
        if(p.isBlank(s1)) {
            s1 = null;
        }
        boolean z = false;
        if(s1 != null) {
            if(s != null) {
                if(p.isBlank(s)) {
                    s = null;
                }
                if(s != null) {
                    Logger.INSTANCE.log("checkDeprecatedAppVersion() : current=" + s1 + ", deprecated=" + s);
                    boolean0 = Boolean.valueOf(s1.compareTo(s) < 0);
                }
            }
            if(boolean0 != null) {
                z = boolean0.booleanValue();
            }
        }
        function10.invoke(Boolean.valueOf(z));
    }

    @NotNull
    public static final String getAppVersion() {
        try {
            String s = BaseKt.getAppContext().getPackageManager().getPackageInfo("net.daum.android.tistoryapp", 0).versionName;
            return s == null ? "1.0.0" : s;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Logger.INSTANCE.log("getAppVersion() : " + packageManager$NameNotFoundException0);
            return "";
        }
        catch(Exception exception0) {
            Logger.INSTANCE.log("getAppVersion() : " + exception0);
            return "";
        }
    }

    // 去混淆评级： 低(20)
    @NotNull
    public static final DeviceDirection getDeviceDirection() {
        if(DeviceUtilsKt.isTablet() && !DeviceUtilsKt.isDeviceCompatHeight()) {
            return DeviceUtilsKt.isLandscape() ? DeviceDirection.TABLET_LAND : DeviceDirection.TABLET_PORT;
        }
        return DeviceUtilsKt.isLandscape() ? DeviceDirection.PHONE_LAND : DeviceDirection.PHONE_PORT;
    }

    @Nullable
    public static final String getDeviceIP() {
        try {
            Enumeration enumeration0 = NetworkInterface.getNetworkInterfaces();
            while(enumeration0.hasMoreElements()) {
                Enumeration enumeration1 = ((NetworkInterface)enumeration0.nextElement()).getInetAddresses();
                while(enumeration1.hasMoreElements()) {
                    InetAddress inetAddress0 = (InetAddress)enumeration1.nextElement();
                    if(!inetAddress0.isLoopbackAddress() && inetAddress0 instanceof Inet4Address) {
                        return inetAddress0.getHostAddress().toString();
                    }
                    if(false) {
                        break;
                    }
                }
                if(false) {
                    break;
                }
            }
        }
        catch(Exception exception0) {
            Logger.INSTANCE.error("getDeviceIP error: " + exception0);
        }
        return null;
    }

    public static final double getDeviceInch() {
        int v = Resources.getSystem().getConfiguration().orientation;
        DisplayMetrics displayMetrics0 = Resources.getSystem().getDisplayMetrics();
        Pair pair0 = v == 1 ? new Pair(((double)(((double)displayMetrics0.widthPixels) / ((double)displayMetrics0.xdpi))), ((double)(((double)displayMetrics0.heightPixels) / ((double)displayMetrics0.ydpi)))) : new Pair(((double)(((double)displayMetrics0.heightPixels) / ((double)displayMetrics0.xdpi))), ((double)(((double)displayMetrics0.widthPixels) / ((double)displayMetrics0.ydpi))));
        double f = ((Number)pair0.component1()).doubleValue();
        double f1 = ((Number)pair0.component2()).doubleValue();
        return Math.sqrt(f1 * f1 + f * f);
    }

    public static final int getDisplayHeight() {
        return BaseKt.getAppContext().getResources().getDisplayMetrics().heightPixels;
    }

    public static final int getDisplayWidth() {
        return BaseKt.getAppContext().getResources().getDisplayMetrics().widthPixels;
    }

    @NotNull
    public static final String getLanguage() {
        if(DeviceUtilsKt.a == null) {
            DeviceUtilsKt.a = Locale.getDefault().toLanguageTag();
        }
        return "";
    }

    public static final int getStatusBarHeight() {
        int v = BaseKt.getAppContext().getResources().getIdentifier("status_bar_height", "dimen", "android");
        Integer integer0 = v > 0 ? v : null;
        return integer0 == null ? 0 : BaseKt.getAppContext().getResources().getDimensionPixelSize(integer0.intValue());
    }

    public static final int getTimeZone() {
        return TimeZone.getDefault().getRawOffset();
    }

    public static final int getVisibleHomeItemCount() {
        int v = WhenMappings.$EnumSwitchMapping$0[DeviceUtilsKt.getDeviceDirection().ordinal()];
        if(v != 1 && v != 2) {
            switch(v) {
                case 3: {
                    return 6;
                }
                case 4: {
                    return 8;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return 2;
    }

    public static final boolean isDeviceCompatHeight() {
        return Resources.getSystem().getConfiguration().orientation == 1 ? ((float)Resources.getSystem().getDisplayMetrics().widthPixels) / Resources.getSystem().getDisplayMetrics().density < 600.0f : ((float)Resources.getSystem().getDisplayMetrics().heightPixels) / Resources.getSystem().getDisplayMetrics().density < 600.0f;
    }

    public static final boolean isLandscape() {
        Configuration configuration0 = Resources.getSystem().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration0, "getConfiguration(...)");
        return configuration0.orientation == 2;
    }

    public static final boolean isTablet() {
        return DeviceUtilsKt.getDeviceInch() >= 7.0;
    }
}

