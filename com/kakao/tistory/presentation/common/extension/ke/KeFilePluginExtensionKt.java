package com.kakao.tistory.presentation.common.extension.ke;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;
import bc.a;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.plugin.PickerOpener.IntentLauncher;
import com.kakao.keditor.plugin.PickerResultHandler;
import com.kakao.keditor.plugin.itemspec.file.FileItem;
import com.kakao.keditor.plugin.pluginspec.file.FilePluginSpec;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.common.utils.PermissionUtils;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A\u0011\u0010\u0002\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/file/FilePluginSpec;", "", "setFileConfigs", "(Lcom/kakao/keditor/plugin/pluginspec/file/FilePluginSpec;)V", "presentation_prodRelease"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class KeFilePluginExtensionKt {
    public static final void a(Context context0) {
        new Builder(context0).setMessage(context0.getString(string.label_file_permission_message)).setPositiveButton(context0.getString(string.label_file_permission_agree), new a(context0, 0)).setNegativeButton(context0.getString(string.label_file_permission_denied), (DialogInterface dialogInterface0, int v) -> dialogInterface0.dismiss()).show();
    }

    public static final void a(Context context0, DialogInterface dialogInterface0, int v) {
        Intrinsics.checkNotNullParameter(context0, "$context");
        dialogInterface0.dismiss();
        Intent intent0 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent0.setData(Uri.fromParts("package", "net.daum.android.tistoryapp", null));
        context0.startActivity(intent0);
    }

    // 检测为 Lambda 实现
    public static final void a(DialogInterface dialogInterface0, int v) [...]

    public static final void setFileConfigs(@NotNull FilePluginSpec filePluginSpec0) {
        Intrinsics.checkNotNullParameter(filePluginSpec0, "<this>");
        filePluginSpec0.setPickerOpener(new IntentLauncher() {
            @Override  // com.kakao.keditor.plugin.PickerOpener$IntentLauncher
            @Nullable
            public Intent getPickerIntent(@NotNull AppCompatActivity appCompatActivity0) {
                Boolean boolean1;
                Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
                PermissionUtils permissionUtils0 = PermissionUtils.INSTANCE;
                Intent intent0 = null;
                if(!permissionUtils0.hasFilePermission(appCompatActivity0)) {
                    String[] arr_s = permissionUtils0.getFilePermissions(true);
                    int v1 = 0;
                    for(int v = 0; v < arr_s.length; ++v) {
                        if(appCompatActivity0.shouldShowRequestPermissionRationale(arr_s[v])) {
                            ++v1;
                        }
                    }
                    if(v1 > 0) {
                        KeFilePluginExtensionKt.a(appCompatActivity0);
                        return null;
                    }
                    appCompatActivity0.requestPermissions(PermissionUtils.getFilePermissions$default(PermissionUtils.INSTANCE, false, 1, null), 210);
                    return null;
                }
                Intent intent1 = new Intent("android.intent.action.GET_CONTENT");
                intent1.setType("*/*");
                Keditor keditor0 = Keditor.INSTANCE;
                Integer integer0 = filePluginSpec0.getEditorId();
                Boolean boolean0 = Boolean.FALSE;
                if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)androidx.room.a.g(keditor0, integer0)).containsKey("file_multi_select_enabled")) {
                    Object object1 = keditor0.getConfig().get("file_multi_select_enabled");
                    if(object1 instanceof Boolean) {
                        intent0 = object1;
                    }
                }
                else {
                    Object object0 = ((Map)androidx.room.a.g(keditor0, integer0)).get("file_multi_select_enabled");
                    if(object0 instanceof Boolean) {
                        intent0 = object0;
                    }
                }
                boolean1 = (Boolean)intent0;
                if(boolean1 != null) {
                    boolean0 = boolean1;
                }
                if(Intrinsics.areEqual(boolean0, Boolean.TRUE)) {
                    intent1.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                }
                return Intent.createChooser(intent1, keditor0.getContext().getString(com.kakao.keditor.R.string.cd_add_file));
            }
        });
        filePluginSpec0.setPickerResultHandler(new PickerResultHandler() {
            @Override  // com.kakao.keditor.plugin.PickerResultHandler
            public void onPickerResult(int v, @Nullable Intent intent0) {
                if(v != -1) {
                    return;
                }
                if(intent0 == null) {
                    return;
                }
                FileItem fileItem0 = (FileItem)CollectionsKt___CollectionsKt.firstOrNull(filePluginSpec0.getItemsByIntent(intent0));
                if(fileItem0 != null) {
                    FilePluginSpec filePluginSpec0 = filePluginSpec0;
                    if(fileItem0.getSize() > 0x1400000L) {
                        ToastUtils.show$default(ToastUtils.INSTANCE, null, string.label_toast_file_limit_size, 0, 1, 5, null);
                        return;
                    }
                    filePluginSpec0.requestAddFileItems(CollectionsKt__CollectionsKt.mutableListOf(new FileItem[]{fileItem0}));
                }
            }
        });
    }
}

