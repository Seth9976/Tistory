package com.kakao.keditor.plugin.pluginspec.poll;

import android.app.Activity;
import android.content.Intent;
import com.kakao.keditor.plugin.pluginspec.poll.creator.PollCreatorAdapter;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\t\u0012\b\u0010\n\u001A\u0004\u0018\u00010\u000B¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0007HÆ\u0003J\t\u0010\u001A\u001A\u00020\tHÆ\u0003J\u000B\u0010\u001B\u001A\u0004\u0018\u00010\u000BHÆ\u0003J=\u0010\u001C\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\u000BHÆ\u0001J\u0013\u0010\u001D\u001A\u00020\u001E2\b\u0010\u001F\u001A\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001A\u00020\tHÖ\u0001J\t\u0010\"\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\n\u001A\u0004\u0018\u00010\u000B¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/OnPollImagePickerResult;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "type", "", "activity", "Landroid/app/Activity;", "pollAdapter", "Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorAdapter;", "resultCode", "", "intent", "Landroid/content/Intent;", "(Ljava/lang/String;Landroid/app/Activity;Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorAdapter;ILandroid/content/Intent;)V", "getActivity", "()Landroid/app/Activity;", "getIntent", "()Landroid/content/Intent;", "getPollAdapter", "()Lcom/kakao/keditor/plugin/pluginspec/poll/creator/PollCreatorAdapter;", "getResultCode", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OnPollImagePickerResult extends PluginSpecRequest {
    @NotNull
    private final Activity activity;
    @Nullable
    private final Intent intent;
    @NotNull
    private final PollCreatorAdapter pollAdapter;
    private final int resultCode;
    @NotNull
    private final String type;

    public OnPollImagePickerResult(@NotNull String s, @NotNull Activity activity0, @NotNull PollCreatorAdapter pollCreatorAdapter0, int v, @Nullable Intent intent0) {
        Intrinsics.checkNotNullParameter(s, "type");
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(pollCreatorAdapter0, "pollAdapter");
        super(s, 0, 2, null);
        this.type = s;
        this.activity = activity0;
        this.pollAdapter = pollCreatorAdapter0;
        this.resultCode = v;
        this.intent = intent0;
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    @NotNull
    public final Activity component2() {
        return this.activity;
    }

    @NotNull
    public final PollCreatorAdapter component3() {
        return this.pollAdapter;
    }

    public final int component4() {
        return this.resultCode;
    }

    @Nullable
    public final Intent component5() {
        return this.intent;
    }

    @NotNull
    public final OnPollImagePickerResult copy(@NotNull String s, @NotNull Activity activity0, @NotNull PollCreatorAdapter pollCreatorAdapter0, int v, @Nullable Intent intent0) {
        Intrinsics.checkNotNullParameter(s, "type");
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(pollCreatorAdapter0, "pollAdapter");
        return new OnPollImagePickerResult(s, activity0, pollCreatorAdapter0, v, intent0);
    }

    public static OnPollImagePickerResult copy$default(OnPollImagePickerResult onPollImagePickerResult0, String s, Activity activity0, PollCreatorAdapter pollCreatorAdapter0, int v, Intent intent0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = onPollImagePickerResult0.type;
        }
        if((v1 & 2) != 0) {
            activity0 = onPollImagePickerResult0.activity;
        }
        if((v1 & 4) != 0) {
            pollCreatorAdapter0 = onPollImagePickerResult0.pollAdapter;
        }
        if((v1 & 8) != 0) {
            v = onPollImagePickerResult0.resultCode;
        }
        if((v1 & 16) != 0) {
            intent0 = onPollImagePickerResult0.intent;
        }
        return onPollImagePickerResult0.copy(s, activity0, pollCreatorAdapter0, v, intent0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OnPollImagePickerResult)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.type, ((OnPollImagePickerResult)object0).type)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.activity, ((OnPollImagePickerResult)object0).activity)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.pollAdapter, ((OnPollImagePickerResult)object0).pollAdapter)) {
            return false;
        }
        return this.resultCode == ((OnPollImagePickerResult)object0).resultCode ? Intrinsics.areEqual(this.intent, ((OnPollImagePickerResult)object0).intent) : false;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @Nullable
    public final Intent getIntent() {
        return this.intent;
    }

    @NotNull
    public final PollCreatorAdapter getPollAdapter() {
        return this.pollAdapter;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = a.c(this.resultCode, (this.pollAdapter.hashCode() + (this.activity.hashCode() + this.type.hashCode() * 0x1F) * 0x1F) * 0x1F, 0x1F);
        return this.intent == null ? v : v + this.intent.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "OnPollImagePickerResult(type=" + this.type + ", activity=" + this.activity + ", pollAdapter=" + this.pollAdapter + ", resultCode=" + this.resultCode + ", intent=" + this.intent + ")";
    }
}

