package com.kakao.keditor.plugin.pluginspec.poll;

import android.app.Activity;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000BJ\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0007HÆ\u0003J\u000F\u0010\u0017\u001A\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001A\u00020\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001CHÖ\u0003J\t\u0010\u001D\u001A\u00020\u0007HÖ\u0001J\t\u0010\u001E\u001A\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0017\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u001F"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/poll/OpenPollImagePicker;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "type", "", "activity", "Landroid/app/Activity;", "pollItemIndex", "", "pollImages", "", "Lcom/kakao/keditor/plugin/itemspec/poll/PollSubItem;", "(Ljava/lang/String;Landroid/app/Activity;ILjava/util/List;)V", "getActivity", "()Landroid/app/Activity;", "getPollImages", "()Ljava/util/List;", "getPollItemIndex", "()I", "getType", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OpenPollImagePicker extends PluginSpecRequest {
    @NotNull
    private final Activity activity;
    @NotNull
    private final List pollImages;
    private final int pollItemIndex;
    @NotNull
    private final String type;

    public OpenPollImagePicker(@NotNull String s, @NotNull Activity activity0, int v, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "type");
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(list0, "pollImages");
        super(s, 0, 2, null);
        this.type = s;
        this.activity = activity0;
        this.pollItemIndex = v;
        this.pollImages = list0;
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    @NotNull
    public final Activity component2() {
        return this.activity;
    }

    public final int component3() {
        return this.pollItemIndex;
    }

    @NotNull
    public final List component4() {
        return this.pollImages;
    }

    @NotNull
    public final OpenPollImagePicker copy(@NotNull String s, @NotNull Activity activity0, int v, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(s, "type");
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(list0, "pollImages");
        return new OpenPollImagePicker(s, activity0, v, list0);
    }

    public static OpenPollImagePicker copy$default(OpenPollImagePicker openPollImagePicker0, String s, Activity activity0, int v, List list0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            s = openPollImagePicker0.type;
        }
        if((v1 & 2) != 0) {
            activity0 = openPollImagePicker0.activity;
        }
        if((v1 & 4) != 0) {
            v = openPollImagePicker0.pollItemIndex;
        }
        if((v1 & 8) != 0) {
            list0 = openPollImagePicker0.pollImages;
        }
        return openPollImagePicker0.copy(s, activity0, v, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OpenPollImagePicker)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.type, ((OpenPollImagePicker)object0).type)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.activity, ((OpenPollImagePicker)object0).activity)) {
            return false;
        }
        return this.pollItemIndex == ((OpenPollImagePicker)object0).pollItemIndex ? Intrinsics.areEqual(this.pollImages, ((OpenPollImagePicker)object0).pollImages) : false;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final List getPollImages() {
        return this.pollImages;
    }

    public final int getPollItemIndex() {
        return this.pollItemIndex;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        return this.pollImages.hashCode() + a.c(this.pollItemIndex, (this.activity.hashCode() + this.type.hashCode() * 0x1F) * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        return "OpenPollImagePicker(type=" + this.type + ", activity=" + this.activity + ", pollItemIndex=" + this.pollItemIndex + ", pollImages=" + this.pollImages + ")";
    }
}

