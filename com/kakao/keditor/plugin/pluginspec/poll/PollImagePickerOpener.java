package com.kakao.keditor.plugin.pluginspec.poll;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener;", "", "()V", "IntentLauncher", "Requester", "Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener$IntentLauncher;", "Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener$Requester;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class PollImagePickerOpener {
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\n\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u000B\u001A\u00020\f2\u000E\u0010\r\u001A\n\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u000E2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00110\u000EH&R\"\u0010\u0003\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener$IntentLauncher;", "Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener;", "()V", "pollImagePickerResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getPollImagePickerResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setPollImagePickerResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "getPollImagePickerIntent", "pollCreatorActivity", "Landroidx/appcompat/app/AppCompatActivity;", "otherImages", "", "Lcom/kakao/keditor/plugin/attrs/item/ImageUploadable;", "currentPollImages", "Lcom/kakao/keditor/plugin/itemspec/poll/PollSubItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class IntentLauncher extends PollImagePickerOpener {
        @Nullable
        private ActivityResultLauncher pollImagePickerResultLauncher;

        public IntentLauncher() {
            super(null);
        }

        @Nullable
        public abstract Intent getPollImagePickerIntent(@NotNull AppCompatActivity arg1, @Nullable List arg2, @NotNull List arg3);

        @Nullable
        public ActivityResultLauncher getPollImagePickerResultLauncher() {
            return this.pollImagePickerResultLauncher;
        }

        public void setPollImagePickerResultLauncher(@Nullable ActivityResultLauncher activityResultLauncher0) {
            this.pollImagePickerResultLauncher = activityResultLauncher0;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u000B0\bH&¨\u0006\f"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener$Requester;", "Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener;", "()V", "openPollImagePicker", "", "pollCreatorActivity", "Landroid/app/Activity;", "otherImages", "", "Lcom/kakao/keditor/plugin/attrs/item/ImageUploadable;", "currentPollImages", "Lcom/kakao/keditor/plugin/itemspec/poll/PollSubItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class Requester extends PollImagePickerOpener {
        public Requester() {
            super(null);
        }

        public abstract void openPollImagePicker(@NotNull Activity arg1, @Nullable List arg2, @NotNull List arg3);
    }

    private PollImagePickerOpener() {
    }

    public PollImagePickerOpener(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

