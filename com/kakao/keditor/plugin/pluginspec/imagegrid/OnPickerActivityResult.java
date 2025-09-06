package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.content.Intent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u001F\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/OnPickerActivityResult;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "type", "", "data", "Landroid/content/Intent;", "(Ljava/lang/String;Landroid/content/Intent;)V", "getData", "()Landroid/content/Intent;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OnPickerActivityResult extends PluginSpecRequest {
    @Nullable
    private final Intent data;
    @NotNull
    private final String type;

    public OnPickerActivityResult(@NotNull String s, @Nullable Intent intent0) {
        Intrinsics.checkNotNullParameter(s, "type");
        super(s, 0, 2, null);
        this.type = s;
        this.data = intent0;
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    @Nullable
    public final Intent component2() {
        return this.data;
    }

    @NotNull
    public final OnPickerActivityResult copy(@NotNull String s, @Nullable Intent intent0) {
        Intrinsics.checkNotNullParameter(s, "type");
        return new OnPickerActivityResult(s, intent0);
    }

    public static OnPickerActivityResult copy$default(OnPickerActivityResult onPickerActivityResult0, String s, Intent intent0, int v, Object object0) {
        if((v & 1) != 0) {
            s = onPickerActivityResult0.type;
        }
        if((v & 2) != 0) {
            intent0 = onPickerActivityResult0.data;
        }
        return onPickerActivityResult0.copy(s, intent0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OnPickerActivityResult)) {
            return false;
        }
        return Intrinsics.areEqual(this.type, ((OnPickerActivityResult)object0).type) ? Intrinsics.areEqual(this.data, ((OnPickerActivityResult)object0).data) : false;
    }

    @Nullable
    public final Intent getData() {
        return this.data;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Override
    public int hashCode() {
        int v = this.type.hashCode();
        return this.data == null ? v * 0x1F : v * 0x1F + this.data.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "OnPickerActivityResult(type=" + this.type + ", data=" + this.data + ")";
    }
}

