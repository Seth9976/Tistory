package com.kakao.keditor.plugin;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.annotation.CallSuper;
import androidx.appcompat.app.AppCompatActivity;
import hb.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0017J\u0010\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u000BH\u0017J)\u0010\f\u001A\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u000EJ%\u0010\u000F\u001A\u0004\u0018\u00010\u0003*\u00020\u00102\u0006\u0010\u0006\u001A\u00020\u00052\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/kakao/keditor/plugin/ActivityResultHandler;", "", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "registerForActivityResult", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "onEditorActivityResult", "Lcom/kakao/keditor/plugin/EditorSupporter;", "(Lcom/kakao/keditor/plugin/EditorSupporter;ILandroid/content/Intent;)Lkotlin/Unit;", "onPickerActivityResult", "Lcom/kakao/keditor/plugin/PickerSupporter;", "(Lcom/kakao/keditor/plugin/PickerSupporter;ILandroid/content/Intent;)Lkotlin/Unit;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ActivityResultHandler {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @CallSuper
        public static void onActivityResult(@NotNull ActivityResultHandler activityResultHandler0, int v, int v1, @Nullable Intent intent0) {
            if(activityResultHandler0 instanceof PickerSupporter && ((PickerSupporter)activityResultHandler0).getPickerOpener() instanceof Requester && v == ((PickerSupporter)activityResultHandler0).getPickerRequestCode()) {
                activityResultHandler0.onPickerActivityResult(((PickerSupporter)activityResultHandler0), v1, intent0);
            }
            if(activityResultHandler0 instanceof EditorSupporter && ((EditorSupporter)activityResultHandler0).getEditorOpener() instanceof com.kakao.keditor.plugin.EditorOpener.Requester && v == ((EditorSupporter)activityResultHandler0).getEditorRequestCode()) {
                activityResultHandler0.onEditorActivityResult(((EditorSupporter)activityResultHandler0), v1, intent0);
            }
        }

        @Nullable
        public static Unit onEditorActivityResult(@NotNull ActivityResultHandler activityResultHandler0, @NotNull EditorSupporter editorSupporter0, int v, @Nullable Intent intent0) {
            Intrinsics.checkNotNullParameter(editorSupporter0, "$receiver");
            EditorResultHandler editorResultHandler0 = editorSupporter0.getEditorResultHandler();
            if(editorResultHandler0 != null) {
                editorResultHandler0.onEditorResult(v, intent0);
                return Unit.INSTANCE;
            }
            return null;
        }

        @Nullable
        public static Unit onPickerActivityResult(@NotNull ActivityResultHandler activityResultHandler0, @NotNull PickerSupporter pickerSupporter0, int v, @Nullable Intent intent0) {
            Intrinsics.checkNotNullParameter(pickerSupporter0, "$receiver");
            PickerResultHandler pickerResultHandler0 = pickerSupporter0.getPickerResultHandler();
            if(pickerResultHandler0 != null) {
                pickerResultHandler0.onPickerResult(v, intent0);
                return Unit.INSTANCE;
            }
            return null;
        }

        @CallSuper
        public static void registerForActivityResult(@NotNull ActivityResultHandler activityResultHandler0, @NotNull AppCompatActivity appCompatActivity0) {
            Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
            IntentLauncher editorOpener$IntentLauncher0 = null;
            if(activityResultHandler0 instanceof PickerSupporter) {
                PickerOpener pickerOpener0 = ((PickerSupporter)activityResultHandler0).getPickerOpener();
                com.kakao.keditor.plugin.PickerOpener.IntentLauncher pickerOpener$IntentLauncher0 = pickerOpener0 instanceof com.kakao.keditor.plugin.PickerOpener.IntentLauncher ? ((com.kakao.keditor.plugin.PickerOpener.IntentLauncher)pickerOpener0) : null;
                if(pickerOpener$IntentLauncher0 != null) {
                    pickerOpener$IntentLauncher0.setPickerResultLauncher(appCompatActivity0.registerForActivityResult(new StartActivityForResult(), new a(activityResultHandler0, 0)));
                }
            }
            if(activityResultHandler0 instanceof EditorSupporter) {
                EditorOpener editorOpener0 = ((EditorSupporter)activityResultHandler0).getEditorOpener();
                if(editorOpener0 instanceof IntentLauncher) {
                    editorOpener$IntentLauncher0 = (IntentLauncher)editorOpener0;
                }
                if(editorOpener$IntentLauncher0 != null) {
                    editorOpener$IntentLauncher0.setEditorResultLauncher(appCompatActivity0.registerForActivityResult(new StartActivityForResult(), new a(activityResultHandler0, 1)));
                }
            }
        }

        private static void registerForActivityResult$lambda$0(ActivityResultHandler activityResultHandler0, ActivityResult activityResult0) {
            Intrinsics.checkNotNullParameter(activityResultHandler0, "this$0");
            activityResultHandler0.onPickerActivityResult(((PickerSupporter)activityResultHandler0), activityResult0.getResultCode(), activityResult0.getData());
        }

        private static void registerForActivityResult$lambda$1(ActivityResultHandler activityResultHandler0, ActivityResult activityResult0) {
            Intrinsics.checkNotNullParameter(activityResultHandler0, "this$0");
            activityResultHandler0.onEditorActivityResult(((EditorSupporter)activityResultHandler0), activityResult0.getResultCode(), activityResult0.getData());
        }
    }

    @CallSuper
    void onActivityResult(int arg1, int arg2, @Nullable Intent arg3);

    @Nullable
    Unit onEditorActivityResult(@NotNull EditorSupporter arg1, int arg2, @Nullable Intent arg3);

    @Nullable
    Unit onPickerActivityResult(@NotNull PickerSupporter arg1, int arg2, @Nullable Intent arg3);

    @CallSuper
    void registerForActivityResult(@NotNull AppCompatActivity arg1);
}

