package com.kakao.keditor.plugin.pluginspec.poll;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J.\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\u000E\u0010\u0018\u001A\n\u0012\u0004\u0012\u00020\u001A\u0018\u00010\u00192\f\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u001C0\u0019H\u0016R\u001A\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\tX¦\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u001A\u0010\u000E\u001A\u0004\u0018\u00010\u000FX¦\u000E¢\u0006\f\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001D"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerSupporter;", "", "pollImagePickerOpener", "Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener;", "getPollImagePickerOpener", "()Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener;", "setPollImagePickerOpener", "(Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerOpener;)V", "pollImagePickerRequestCode", "", "getPollImagePickerRequestCode", "()I", "setPollImagePickerRequestCode", "(I)V", "pollImagePickerResultHandler", "Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerResultHandler;", "getPollImagePickerResultHandler", "()Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerResultHandler;", "setPollImagePickerResultHandler", "(Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerResultHandler;)V", "openPollImagePicker", "", "pollCreatorActivity", "Landroid/app/Activity;", "otherImages", "", "Lcom/kakao/keditor/plugin/attrs/item/ImageUploadable;", "currentPollImages", "Lcom/kakao/keditor/plugin/itemspec/poll/PollSubItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface PollImagePickerSupporter {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void openPollImagePicker(@NotNull PollImagePickerSupporter pollImagePickerSupporter0, @NotNull Activity activity0, @Nullable List list0, @NotNull List list1) {
            Intrinsics.checkNotNullParameter(activity0, "pollCreatorActivity");
            Intrinsics.checkNotNullParameter(list1, "currentPollImages");
            if(pollImagePickerSupporter0.getPollImagePickerOpener() instanceof Requester) {
                PollImagePickerOpener pollImagePickerOpener0 = pollImagePickerSupporter0.getPollImagePickerOpener();
                Intrinsics.checkNotNull(pollImagePickerOpener0, "null cannot be cast to non-null type com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerOpener.Requester");
                ((Requester)pollImagePickerOpener0).openPollImagePicker(activity0, list0, list1);
                return;
            }
            if(activity0 instanceof AppCompatActivity) {
                PollImagePickerOpener pollImagePickerOpener1 = pollImagePickerSupporter0.getPollImagePickerOpener();
                Intrinsics.checkNotNull(pollImagePickerOpener1, "null cannot be cast to non-null type com.kakao.keditor.plugin.pluginspec.poll.PollImagePickerOpener.IntentLauncher");
                Intent intent0 = ((IntentLauncher)pollImagePickerOpener1).getPollImagePickerIntent(((AppCompatActivity)activity0), list0, list1);
                if(intent0 != null) {
                    ActivityResultLauncher activityResultLauncher0 = ((IntentLauncher)pollImagePickerOpener1).getPollImagePickerResultLauncher();
                    if(activityResultLauncher0 != null) {
                        activityResultLauncher0.launch(intent0);
                    }
                }
            }
        }
    }

    @Nullable
    PollImagePickerOpener getPollImagePickerOpener();

    int getPollImagePickerRequestCode();

    @Nullable
    PollImagePickerResultHandler getPollImagePickerResultHandler();

    void openPollImagePicker(@NotNull Activity arg1, @Nullable List arg2, @NotNull List arg3);

    void setPollImagePickerOpener(@Nullable PollImagePickerOpener arg1);

    void setPollImagePickerRequestCode(int arg1);

    void setPollImagePickerResultHandler(@Nullable PollImagePickerResultHandler arg1);
}

