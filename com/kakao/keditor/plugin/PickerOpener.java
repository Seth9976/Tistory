package com.kakao.keditor.plugin;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import com.kakao.keditor.event.EventFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/PickerOpener;", "", "()V", "IntentLauncher", "Requester", "Lcom/kakao/keditor/plugin/PickerOpener$IntentLauncher;", "Lcom/kakao/keditor/plugin/PickerOpener$Requester;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class PickerOpener {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u000B\u001A\u00020\fH&R\"\u0010\u0003\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/plugin/PickerOpener$IntentLauncher;", "Lcom/kakao/keditor/plugin/PickerOpener;", "()V", "pickerResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getPickerResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setPickerResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "getPickerIntent", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class IntentLauncher extends PickerOpener {
        @Nullable
        private ActivityResultLauncher pickerResultLauncher;

        public IntentLauncher() {
            super(null);
        }

        @Nullable
        public abstract Intent getPickerIntent(@NotNull AppCompatActivity arg1);

        @Nullable
        public ActivityResultLauncher getPickerResultLauncher() {
            return this.pickerResultLauncher;
        }

        public void setPickerResultLauncher(@Nullable ActivityResultLauncher activityResultLauncher0) {
            this.pickerResultLauncher = activityResultLauncher0;
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001A\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/plugin/PickerOpener$Requester;", "Lcom/kakao/keditor/plugin/PickerOpener;", "()V", "openPicker", "", "activity", "Landroid/app/Activity;", "flow", "Lcom/kakao/keditor/event/EventFlow;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class Requester extends PickerOpener {
        public Requester() {
            super(null);
        }

        public abstract void openPicker(@NotNull Activity arg1, @Nullable EventFlow arg2);
    }

    private PickerOpener() {
    }

    public PickerOpener(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

