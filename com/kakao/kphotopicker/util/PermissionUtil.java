package com.kakao.kphotopicker.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.kakao.kphotopicker.R.string;
import com.kakao.kphotopicker.loader.GalleryType;
import java.util.ArrayList;
import kc.e;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rb.a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u000E\bÆ\u0002\u0018\u00002\u00020\u0001J\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ#\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\t\u001A\u00020\b2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000F\u0010\u0010J3\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0014\u001A\u00020\u00132\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001A\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\u00112\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001A\u00020\u00132\f\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u001A\u0010\u001BJ%\u0010\u000B\u001A\u00020\n2\u000E\u0010\r\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u0006\u0010\u001D\u001A\u00020\u001C¢\u0006\u0004\b\u000B\u0010\u001EJC\u0010\"\u001A\u00020\u00162\u0006\u0010\t\u001A\u00020\b2\b\b\u0001\u0010\u001F\u001A\u00020\u00132\u0010\b\u0002\u0010 \u001A\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0010\b\u0002\u0010!\u001A\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001A\u00020\u00162\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b$\u0010%J\u001F\u0010)\u001A\u00020\u00162\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010&\u001A\u00020\nH\u0000¢\u0006\u0004\b\'\u0010(¨\u0006*"}, d2 = {"Lcom/kakao/kphotopicker/util/PermissionUtil;", "", "Lcom/kakao/kphotopicker/loader/GalleryType;", "galleryType", "", "", "getMediaPermissions", "(Lcom/kakao/kphotopicker/loader/GalleryType;)[Ljava/lang/String;", "Landroid/content/Context;", "context", "Lcom/kakao/kphotopicker/util/MediaPermissionState;", "checkMediaPermissionState", "(Landroid/content/Context;)Lcom/kakao/kphotopicker/util/MediaPermissionState;", "permissions", "", "checkPermission", "(Landroid/content/Context;[Ljava/lang/String;)Z", "Landroid/app/Activity;", "activity", "", "requestCode", "Lkotlin/Function0;", "", "failGuideCallback", "requestMediaPermission", "(Landroid/app/Activity;Lcom/kakao/kphotopicker/loader/GalleryType;ILkotlin/jvm/functions/Function0;)Z", "requestPermission", "(Landroid/app/Activity;[Ljava/lang/String;ILkotlin/jvm/functions/Function0;)Z", "", "grantResults", "([Ljava/lang/String;[I)Lcom/kakao/kphotopicker/util/MediaPermissionState;", "messageRes", "allowCallback", "deniedCallback", "showPermissionDialog", "(Landroid/content/Context;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "goToPermissionSettings", "(Landroid/content/Context;)V", "state", "reRequestMediaPermissionWhenGranted$kphotopicker_release", "(Landroid/app/Activity;Lcom/kakao/kphotopicker/util/MediaPermissionState;)V", "reRequestMediaPermissionWhenGranted", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPermissionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionUtil.kt\ncom/kakao/kphotopicker/util/PermissionUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n13309#2,2:223\n11383#2,9:225\n13309#2:234\n13310#2:236\n11392#2:237\n12313#2,2:240\n23035#2,6:242\n1#3:235\n37#4,2:238\n1726#5,3:248\n*S KotlinDebug\n*F\n+ 1 PermissionUtil.kt\ncom/kakao/kphotopicker/util/PermissionUtil\n*L\n71#1:223,2\n121#1:225,9\n121#1:234\n121#1:236\n121#1:237\n153#1:240,2\n162#1:242,6\n121#1:235\n133#1:238,2\n168#1:248,3\n*E\n"})
public final class PermissionUtil {
    @NotNull
    public static final PermissionUtil INSTANCE;

    static {
        PermissionUtil.INSTANCE = new PermissionUtil();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static boolean a(Context context0, String s) {
        return ContextCompat.checkSelfPermission(context0, s) == 0;
    }

    public static void b(Activity activity0, String[] arr_s, int v, Function0 function00) {
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            String s = arr_s[v1];
            PermissionUtil.INSTANCE.getClass();
            if(PermissionUtil.a(activity0, s)) {
                s = null;
            }
            else if(ActivityCompat.shouldShowRequestPermissionRationale(activity0, s)) {
                s = null;
            }
            if(s != null) {
                arrayList0.add(s);
            }
        }
        if(!arrayList0.isEmpty()) {
            ActivityCompat.requestPermissions(activity0, ((String[])arrayList0.toArray(new String[0])), v);
            return;
        }
        function00.invoke();
    }

    @NotNull
    public final MediaPermissionState checkMediaPermissionState(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        int v = Build.VERSION.SDK_INT;
        if(v >= 33 && (PermissionUtil.a(context0, "android.permission.READ_MEDIA_IMAGES") || PermissionUtil.a(context0, "android.permission.READ_MEDIA_VIDEO"))) {
            return MediaPermissionState.GRANTED;
        }
        if(v >= 34 && PermissionUtil.a(context0, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
            return MediaPermissionState.PARTIALLY_GRANTED;
        }
        if(v >= 29 && PermissionUtil.a(context0, "android.permission.READ_EXTERNAL_STORAGE")) {
            return MediaPermissionState.GRANTED;
        }
        return this.checkPermission(context0, new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}) ? MediaPermissionState.GRANTED : MediaPermissionState.DENIED;
    }

    @NotNull
    public final MediaPermissionState checkMediaPermissionState(@NotNull String[] arr_s, @NotNull int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_s, "permissions");
        Intrinsics.checkNotNullParameter(arr_v, "grantResults");
        int v = 0;
        if(Build.VERSION.SDK_INT >= 34 && ArraysKt___ArraysKt.contains(arr_s, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
            Integer[] arr_integer = ArraysKt___ArraysJvmKt.toTypedArray(arr_v);
            int v1 = Math.min(arr_s.length, arr_integer.length);
            ArrayList arrayList0 = new ArrayList(v1);
            for(int v2 = 0; v2 < v1; ++v2) {
                String s = arr_s[v2];
                int v3 = arr_integer[v2].intValue();
                boolean z = true;
                if(!Intrinsics.areEqual(s, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
                    if(v3 != -1) {
                        z = false;
                    }
                }
                else if(v3 != 0) {
                    z = false;
                }
                arrayList0.add(Boolean.valueOf(z));
            }
            if(!arrayList0.isEmpty()) {
                for(Object object0: arrayList0) {
                    if(((Boolean)object0).booleanValue()) {
                        continue;
                    }
                    goto label_28;
                }
            }
            return MediaPermissionState.PARTIALLY_GRANTED;
        }
    label_28:
        while(v < arr_v.length) {
            if(arr_v[v] == 0) {
                ++v;
                continue;
            }
            return MediaPermissionState.DENIED;
        }
        return MediaPermissionState.GRANTED;
    }

    public final boolean checkPermission(@NotNull Context context0, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(arr_s, "permissions");
        boolean z = true;
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(z) {
                PermissionUtil.INSTANCE.getClass();
                if(PermissionUtil.a(context0, s)) {
                    z = true;
                }
            }
            else {
                z = false;
            }
        }
        return z;
    }

    @NotNull
    public final String[] getMediaPermissions(@NotNull GalleryType galleryType0) {
        Intrinsics.checkNotNullParameter(galleryType0, "galleryType");
        int v = Build.VERSION.SDK_INT;
        if(v >= 34) {
            return (String[])ArraysKt___ArraysJvmKt.plus(galleryType0.getMediaPermissions$kphotopicker_release(), "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
        }
        if(v >= 33) {
            return new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        }
        return v < 29 ? new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
    }

    public static String[] getMediaPermissions$default(PermissionUtil permissionUtil0, GalleryType galleryType0, int v, Object object0) {
        if((v & 1) != 0) {
            galleryType0 = GalleryType.AllMedia;
        }
        return permissionUtil0.getMediaPermissions(galleryType0);
    }

    public final void goToPermissionSettings(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intent intent0 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent0.setData(Uri.fromParts("package", "net.daum.android.tistoryapp", null));
        context0.startActivity(intent0);
    }

    public final void reRequestMediaPermissionWhenGranted$kphotopicker_release(@NotNull Activity activity0, @NotNull MediaPermissionState mediaPermissionState0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(mediaPermissionState0, "state");
        if(mediaPermissionState0 == MediaPermissionState.GRANTED) {
            ActivityCompat.requestPermissions(activity0, PermissionUtil.getMediaPermissions$default(this, null, 1, null), 0);
        }
    }

    public final boolean requestMediaPermission(@NotNull Activity activity0, @NotNull GalleryType galleryType0, int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(galleryType0, "galleryType");
        Intrinsics.checkNotNullParameter(function00, "failGuideCallback");
        if(this.checkMediaPermissionState(activity0).isGranted()) {
            return true;
        }
        PermissionUtil.b(activity0, this.getMediaPermissions(galleryType0), v, function00);
        return false;
    }

    public final boolean requestPermission(@NotNull Activity activity0, @NotNull String[] arr_s, int v, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(arr_s, "permissions");
        Intrinsics.checkNotNullParameter(function00, "failGuideCallback");
        if(this.checkPermission(activity0, arr_s)) {
            return true;
        }
        PermissionUtil.b(activity0, arr_s, v, function00);
        return false;
    }

    public final void showPermissionDialog(@NotNull Context context0, @StringRes int v, @Nullable Function0 function00, @Nullable Function0 function01) {
        Intrinsics.checkNotNullParameter(context0, "context");
        new Builder(context0).setMessage(v).setPositiveButton(string.kphotopicker_positive, new a(context0, function00)).setNegativeButton(string.kphotopicker_negative, new bc.a(function01, 1)).setOnCancelListener(new e(function01, 1)).show();
    }

    public static void showPermissionDialog$default(PermissionUtil permissionUtil0, Context context0, int v, Function0 function00, Function0 function01, int v1, Object object0) {
        if((v1 & 4) != 0) {
            function00 = null;
        }
        if((v1 & 8) != 0) {
            function01 = null;
        }
        permissionUtil0.showPermissionDialog(context0, v, function00, function01);
    }
}

