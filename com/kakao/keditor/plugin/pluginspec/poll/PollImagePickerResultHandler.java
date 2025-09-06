package com.kakao.keditor.plugin.pluginspec.poll;

import android.app.Activity;
import android.content.Intent;
import com.kakao.keditor.plugin.pluginspec.poll.creator.PollCreatorAdapter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\b\u0010\n\u001A\u0004\u0018\u00010\u000BH&¨\u0006\f"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/PollImagePickerResultHandler;", "", "onPollImagePickerResult", "", "pollCreatorActivity", "Landroid/app/Activity;", "pollAdapter", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorAdapter;", "resultCode", "", "data", "Landroid/content/Intent;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface PollImagePickerResultHandler {
    void onPollImagePickerResult(@NotNull Activity arg1, @NotNull PollCreatorAdapter arg2, int arg3, @Nullable Intent arg4);
}

