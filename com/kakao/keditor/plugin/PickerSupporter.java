package com.kakao.keditor.plugin;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import com.kakao.keditor.event.EventFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u0019H\u0016R\u001A\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\tX¦\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u001A\u0010\u000E\u001A\u0004\u0018\u00010\u000FX¦\u000E¢\u0006\f\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001A"}, d2 = {"Lcom/kakao/keditor/plugin/PickerSupporter;", "", "pickerOpener", "Lcom/kakao/keditor/plugin/PickerOpener;", "getPickerOpener", "()Lcom/kakao/keditor/plugin/PickerOpener;", "setPickerOpener", "(Lcom/kakao/keditor/plugin/PickerOpener;)V", "pickerRequestCode", "", "getPickerRequestCode", "()I", "setPickerRequestCode", "(I)V", "pickerResultHandler", "Lcom/kakao/keditor/plugin/PickerResultHandler;", "getPickerResultHandler", "()Lcom/kakao/keditor/plugin/PickerResultHandler;", "setPickerResultHandler", "(Lcom/kakao/keditor/plugin/PickerResultHandler;)V", "openPicker", "", "activity", "Landroid/app/Activity;", "flow", "Lcom/kakao/keditor/event/EventFlow;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface PickerSupporter {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void openPicker(@NotNull PickerSupporter pickerSupporter0, @NotNull Activity activity0, @Nullable EventFlow eventFlow0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            PickerOpener pickerOpener0 = pickerSupporter0.getPickerOpener();
            if(pickerOpener0 instanceof Requester) {
                ((Requester)pickerOpener0).openPicker(activity0, eventFlow0);
                return;
            }
            if(activity0 instanceof AppCompatActivity && pickerOpener0 instanceof IntentLauncher) {
                Intent intent0 = ((IntentLauncher)pickerOpener0).getPickerIntent(((AppCompatActivity)activity0));
                if(intent0 != null) {
                    ActivityResultLauncher activityResultLauncher0 = ((IntentLauncher)pickerOpener0).getPickerResultLauncher();
                    if(activityResultLauncher0 != null) {
                        activityResultLauncher0.launch(intent0);
                    }
                }
            }
        }

        public static void openPicker$default(PickerSupporter pickerSupporter0, Activity activity0, EventFlow eventFlow0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openPicker");
            }
            if((v & 2) != 0) {
                eventFlow0 = null;
            }
            pickerSupporter0.openPicker(activity0, eventFlow0);
        }
    }

    @Nullable
    PickerOpener getPickerOpener();

    int getPickerRequestCode();

    @Nullable
    PickerResultHandler getPickerResultHandler();

    void openPicker(@NotNull Activity arg1, @Nullable EventFlow arg2);

    void setPickerOpener(@Nullable PickerOpener arg1);

    void setPickerRequestCode(int arg1);

    void setPickerResultHandler(@Nullable PickerResultHandler arg1);
}

