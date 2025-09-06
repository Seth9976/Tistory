package com.kakao.tistory.presentation.common.utils;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.PermissionChecker;
import com.kakao.tistory.presentation.common.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000B\bÇ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\tH\u0007¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\r\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000E\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\u000E\u0010\fJ1\u0010\u0010\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\n\u001A\u00020\t2\u0012\u0010\u000F\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\u001A\u0010\u0013\u001A\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0017\u001A\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001A\u0004\b\u0018\u0010\u0016R\u001A\u0010\u0019\u001A\u00020\u00058\u0006X\u0087D¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/common/utils/PermissionUtils;", "", "", "isChecker", "", "", "getFilePermissions", "(Z)[Ljava/lang/String;", "getGalleryPermissions", "Landroid/content/Context;", "context", "hasNotificationPermission", "(Landroid/content/Context;)Z", "hasGalleryPermission", "hasFilePermission", "permissions", "getNotGrantedPermissions", "(Landroid/content/Context;[Ljava/lang/String;)[Ljava/lang/String;", "", "FILE_REQUEST_CODE", "I", "getFILE_REQUEST_CODE", "()I", "NOTIFICATION_REQUEST_CODE", "getNOTIFICATION_REQUEST_CODE", "NOTIFICATION_PERMISSION", "Ljava/lang/String;", "getNOTIFICATION_PERMISSION", "()Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPermissionUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionUtils.kt\ncom/kakao/tistory/presentation/common/utils/PermissionUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,145:1\n37#2,2:146\n*S KotlinDebug\n*F\n+ 1 PermissionUtils.kt\ncom/kakao/tistory/presentation/common/utils/PermissionUtils\n*L\n140#1:146,2\n*E\n"})
public final class PermissionUtils {
    public static final int $stable;
    @NotNull
    public static final PermissionUtils INSTANCE;

    static {
        PermissionUtils.INSTANCE = new PermissionUtils();
    }

    public static boolean a(Context context0, String[] arr_s) {
        int v = 0;
        while(v < arr_s.length) {
            String s = arr_s[v];
            int v1 = PermissionChecker.checkSelfPermission(context0, s);
            if(v1 != -2) {
                switch(v1) {
                    case -1: {
                        Intrinsics.checkNotNullExpressionValue("PermissionUtils", "TAG");
                        Logger.INSTANCE.log("PermissionUtils", "- PERMISSION_DENIED : " + s);
                        return false;
                    }
                    case 0: {
                        Intrinsics.checkNotNullExpressionValue("PermissionUtils", "TAG");
                        Logger.INSTANCE.log("PermissionUtils", "- PERMISSION_GRANTED : " + s);
                    }
                }
                ++v;
                continue;
            }
            Intrinsics.checkNotNullExpressionValue("PermissionUtils", "TAG");
            Logger.INSTANCE.log("PermissionUtils", "- PERMISSION_DENIED_APP_OP : " + s);
            return false;
        }
        return true;
    }

    public final int getFILE_REQUEST_CODE() [...] // Inlined contents

    @NotNull
    public final String[] getFilePermissions(boolean z) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 34) {
            return z ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        }
        return v < 33 ? new String[]{"android.permission.READ_EXTERNAL_STORAGE"} : new String[]{"android.permission.READ_MEDIA_IMAGES"};
    }

    public static String[] getFilePermissions$default(PermissionUtils permissionUtils0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return permissionUtils0.getFilePermissions(z);
    }

    @NotNull
    public final String[] getGalleryPermissions(boolean z) {
        int v = Build.VERSION.SDK_INT;
        if(v >= 34) {
            return z ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        }
        if(v >= 33) {
            return new String[]{"android.permission.READ_MEDIA_IMAGES"};
        }
        return v < 29 ? new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }

    public static String[] getGalleryPermissions$default(PermissionUtils permissionUtils0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return permissionUtils0.getGalleryPermissions(z);
    }

    @NotNull
    public final String getNOTIFICATION_PERMISSION() [...] // Inlined contents

    public final int getNOTIFICATION_REQUEST_CODE() [...] // Inlined contents

    @Nullable
    public final String[] getNotGrantedPermissions(@NotNull Context context0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(arr_s, "permissions");
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(!PermissionUtils.a(context0, new String[]{s})) {
                arrayList0.add(s);
            }
        }
        return arrayList0.size() <= 0 ? null : ((String[])arrayList0.toArray(new String[0]));
    }

    public final boolean hasFilePermission(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        String[] arr_s = this.getFilePermissions(true);
        return PermissionUtils.a(context0, ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    public final boolean hasGalleryPermission(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        String[] arr_s = this.getGalleryPermissions(true);
        return PermissionUtils.a(context0, ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    @RequiresApi(33)
    public final boolean hasNotificationPermission(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        return PermissionUtils.a(context0, new String[]{"android.permission.POST_NOTIFICATIONS"});
    }
}

