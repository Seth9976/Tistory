package com.kakao.tistory.presentation.screen.blog.setting.util;

import android.app.PendingIntent;
import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest.Builder;
import androidx.activity.result.contract.ActivityResultContracts.StartIntentSenderForResult;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.kakao.kphotopicker.GalleryPicker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001A?\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0014\b\u0002\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\tH\u0007¢\u0006\u0002\u0010\n\u001A&\u0010\u000B\u001A\u00020\u0007*\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F¨\u0006\u0010"}, d2 = {"rememberImagePickLauncher", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "onSuccess", "Lkotlin/Function1;", "", "", "onFail", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/activity/compose/ManagedActivityResultLauncher;", "launch", "context", "Landroid/content/Context;", "maxCount", "", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImagePickLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePickLauncher.kt\ncom/kakao/tistory/presentation/screen/blog/setting/util/ImagePickLauncherKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,46:1\n1223#2,6:47\n*S KotlinDebug\n*F\n+ 1 ImagePickLauncher.kt\ncom/kakao/tistory/presentation/screen/blog/setting/util/ImagePickLauncherKt\n*L\n19#1:47,6\n*E\n"})
public final class ImagePickLauncherKt {
    public static final void launch(@NotNull ManagedActivityResultLauncher managedActivityResultLauncher0, @NotNull Context context0, int v) {
        Intrinsics.checkNotNullParameter(managedActivityResultLauncher0, "<this>");
        Intrinsics.checkNotNullParameter(context0, "context");
        PendingIntent pendingIntent0 = PendingIntent.getActivity(context0, 0, GalleryPicker.INSTANCE.newIntent(context0, v, d.a), 0xC000000);
        Intrinsics.checkNotNull(pendingIntent0);
        managedActivityResultLauncher0.launch(new Builder(pendingIntent0).build());
    }

    @Composable
    @NotNull
    public static final ManagedActivityResultLauncher rememberImagePickLauncher(@Nullable Function1 function10, @Nullable Function0 function00, @Nullable Composer composer0, int v, int v1) {
        composer0.startReplaceGroup(0x4A3B3905);
        if((v1 & 1) != 0) {
            function10 = e.a;
        }
        if((v1 & 2) != 0) {
            function00 = f.a;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x4A3B3905, v, -1, "com.kakao.tistory.presentation.screen.blog.setting.util.rememberImagePickLauncher (ImagePickLauncher.kt:18)");
        }
        StartIntentSenderForResult activityResultContracts$StartIntentSenderForResult0 = new StartIntentSenderForResult();
        composer0.startReplaceGroup(-655610338);
        int v2 = 0;
        int v3 = ((v & 14 ^ 6) <= 4 || !composer0.changed(function10)) && (v & 6) != 4 ? 0 : 1;
        if((v & 0x70 ^ 0x30) > 0x20 && composer0.changed(function00) || (v & 0x30) == 0x20) {
            v2 = 1;
        }
        g g0 = composer0.rememberedValue();
        if((v3 | v2) != 0 || g0 == Composer.Companion.getEmpty()) {
            g0 = new g(function10, function00);
            composer0.updateRememberedValue(g0);
        }
        composer0.endReplaceGroup();
        ManagedActivityResultLauncher managedActivityResultLauncher0 = ActivityResultRegistryKt.rememberLauncherForActivityResult(activityResultContracts$StartIntentSenderForResult0, g0, composer0, 8);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer0.endReplaceGroup();
        return managedActivityResultLauncher0;
    }
}

