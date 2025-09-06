package androidx.core.os;

import android.os.Build.VERSION;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001B\u001CJ\u001F\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\b\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000F\u0010\n\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\tJ\u000F\u0010\u000B\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u000B\u0010\tJ\u000F\u0010\f\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\f\u0010\tJ\u000F\u0010\r\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\r\u0010\tJ\u000F\u0010\u000E\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u000E\u0010\tJ\u000F\u0010\u000F\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u000F\u0010\tJ\u000F\u0010\u0010\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\tJ\u000F\u0010\u0011\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\tJ\u000F\u0010\u0012\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\tJ\u000F\u0010\u0013\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u0013\u0010\tJ\u000F\u0010\u0014\u001A\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\tR\u0014\u0010\u0016\u001A\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001A\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001A\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001A\u001A\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001A\u0010\u0017¨\u0006\u001D"}, d2 = {"Landroidx/core/os/BuildCompat;", "", "", "codename", "buildCodename", "", "isAtLeastPreReleaseCodename", "(Ljava/lang/String;Ljava/lang/String;)Z", "isAtLeastN", "()Z", "isAtLeastNMR1", "isAtLeastO", "isAtLeastOMR1", "isAtLeastP", "isAtLeastQ", "isAtLeastR", "isAtLeastS", "isAtLeastSv2", "isAtLeastT", "isAtLeastU", "isAtLeastV", "", "R_EXTENSION_INT", "I", "S_EXTENSION_INT", "T_EXTENSION_INT", "AD_SERVICES_EXTENSION_INT", "androidx/core/os/a", "PrereleaseSdkCheck", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class BuildCompat {
    @Retention(RetentionPolicy.CLASS)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @RequiresOptIn
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface PrereleaseSdkCheck {
    }

    @ChecksSdkIntAtLeast(extension = 1000000)
    @JvmField
    public static final int AD_SERVICES_EXTENSION_INT;
    @NotNull
    public static final BuildCompat INSTANCE;
    @ChecksSdkIntAtLeast(extension = 30)
    @JvmField
    public static final int R_EXTENSION_INT;
    @ChecksSdkIntAtLeast(extension = 0x1F)
    @JvmField
    public static final int S_EXTENSION_INT;
    @ChecksSdkIntAtLeast(extension = 33)
    @JvmField
    public static final int T_EXTENSION_INT;

    static {
        BuildCompat.INSTANCE = new BuildCompat();  // 初始化器: Ljava/lang/Object;-><init>()V
        int v = Build.VERSION.SDK_INT;
        int v1 = 0;
        a a0 = a.a;
        BuildCompat.R_EXTENSION_INT = v < 30 ? 0 : a0.a(30);
        BuildCompat.S_EXTENSION_INT = v < 30 ? 0 : a0.a(0x1F);
        BuildCompat.T_EXTENSION_INT = v < 30 ? 0 : a0.a(33);
        if(v >= 30) {
            v1 = a0.a(1000000);
        }
        BuildCompat.AD_SERVICES_EXTENSION_INT = v1;
    }

    @ChecksSdkIntAtLeast(api = 24)
    @Deprecated(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastN() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 25)
    @Deprecated(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastNMR1() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 26)
    @Deprecated(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastO() {
        return true;
    }

    @ChecksSdkIntAtLeast(api = 27)
    @Deprecated(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @ChecksSdkIntAtLeast(api = 28)
    @Deprecated(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @RestrictTo({Scope.LIBRARY})
    @VisibleForTesting
    @JvmStatic
    public static final boolean isAtLeastPreReleaseCodename(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "codename");
        Intrinsics.checkNotNullParameter(s1, "buildCodename");
        if(Intrinsics.areEqual("REL", s1)) {
            return false;
        }
        Locale locale0 = Locale.ROOT;
        String s2 = s1.toUpperCase(locale0);
        Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String s3 = s.toUpperCase(locale0);
        Intrinsics.checkNotNullExpressionValue(s3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return s2.compareTo(s3) >= 0;
    }

    @ChecksSdkIntAtLeast(api = 29)
    @Deprecated(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @ChecksSdkIntAtLeast(api = 30)
    @Deprecated(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @ChecksSdkIntAtLeast(api = 0x1F, codename = "S")
    @Deprecated(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastS() {
        int v = Build.VERSION.SDK_INT;
        if(v < 0x1F) {
            if(v >= 30) {
                String s = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(s, "CODENAME");
                return BuildCompat.isAtLeastPreReleaseCodename("S", s);
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 0x20, codename = "Sv2")
    @Deprecated(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastSv2() {
        int v = Build.VERSION.SDK_INT;
        if(v < 0x20) {
            if(v >= 0x1F) {
                String s = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(s, "CODENAME");
                return BuildCompat.isAtLeastPreReleaseCodename("Sv2", s);
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    @Deprecated(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastT() {
        int v = Build.VERSION.SDK_INT;
        if(v < 33) {
            if(v >= 0x20) {
                String s = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(s, "CODENAME");
                return BuildCompat.isAtLeastPreReleaseCodename("Tiramisu", s);
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(api = 34, codename = "UpsideDownCake")
    @Deprecated(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @JvmStatic
    public static final boolean isAtLeastU() {
        int v = Build.VERSION.SDK_INT;
        if(v < 34) {
            if(v >= 33) {
                String s = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(s, "CODENAME");
                return BuildCompat.isAtLeastPreReleaseCodename("UpsideDownCake", s);
            }
            return false;
        }
        return true;
    }

    @ChecksSdkIntAtLeast(codename = "VanillaIceCream")
    @PrereleaseSdkCheck
    @JvmStatic
    public static final boolean isAtLeastV() {
        if(Build.VERSION.SDK_INT >= 34) {
            String s = Build.VERSION.CODENAME;
            Intrinsics.checkNotNullExpressionValue(s, "CODENAME");
            return BuildCompat.isAtLeastPreReleaseCodename("VanillaIceCream", s);
        }
        return false;
    }
}

