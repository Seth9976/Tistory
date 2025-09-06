package com.kakao.tistory.presentation.screen.blog.setting.util;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.utils.PermissionUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0002\u0010$\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A*\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005\u001AX\u0010\u0007\u001A%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\n\u0012\t\u0012\u00070\f¢\u0006\u0002\b\r0\u000B0\b2\u0006\u0010\u0002\u001A\u00020\u00032\u000E\b\u0002\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u00052\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u000E¨\u0006\u000F"}, d2 = {"galleryPermissionCheck", "", "context", "Landroid/content/Context;", "onSuccess", "Lkotlin/Function0;", "onFail", "rememberGalleryPermissionLauncher", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/activity/compose/ManagedActivityResultLauncher;", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class GalleryPermissionLauncherKt {
    public static final void galleryPermissionCheck(@NotNull Context context0, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(function00, "onSuccess");
        Intrinsics.checkNotNullParameter(function01, "onFail");
        if(PermissionUtils.INSTANCE.hasGalleryPermission(context0)) {
            Logger.INSTANCE.log("onRequestPermissionsResult granted");
            function00.invoke();
            return;
        }
        Logger.INSTANCE.log("onRequestPermissionsResult not granted");
        function01.invoke();
    }

    @Composable
    @NotNull
    public static final ManagedActivityResultLauncher rememberGalleryPermissionLauncher(@NotNull Context context0, @Nullable Function0 function00, @Nullable Function0 function01, @Nullable Composer composer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(context0, "context");
        composer0.startReplaceGroup(0xB2FC3A87);
        if((v1 & 2) != 0) {
            function00 = a.a;
        }
        if((v1 & 4) != 0) {
            function01 = b.a;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0xB2FC3A87, v, -1, "com.kakao.tistory.presentation.screen.blog.setting.util.rememberGalleryPermissionLauncher (GalleryPermissionLauncher.kt:14)");
        }
        ManagedActivityResultLauncher managedActivityResultLauncher0 = ActivityResultRegistryKt.rememberLauncherForActivityResult(new RequestMultiplePermissions(), new c(context0, function00, function01), composer0, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return managedActivityResultLauncher0;
    }
}

