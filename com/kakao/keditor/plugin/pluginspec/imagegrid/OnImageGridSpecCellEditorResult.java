package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.app.Activity;
import android.content.Intent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0007HÆ\u0003J\u000B\u0010\u0016\u001A\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u001BHÖ\u0003J\t\u0010\u001C\u001A\u00020\u0007HÖ\u0001J\t\u0010\u001D\u001A\u00020\u001EHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012¨\u0006\u001F"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/OnImageGridSpecCellEditorResult;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "activity", "Landroid/app/Activity;", "imageGridAdapter", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter;", "resultCode", "", "intent", "Landroid/content/Intent;", "(Landroid/app/Activity;Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter;ILandroid/content/Intent;)V", "getActivity", "()Landroid/app/Activity;", "getImageGridAdapter", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter;", "getIntent", "()Landroid/content/Intent;", "getResultCode", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OnImageGridSpecCellEditorResult extends PluginSpecRequest {
    @NotNull
    private final Activity activity;
    @NotNull
    private final ImageGridAdapter imageGridAdapter;
    @Nullable
    private final Intent intent;
    private final int resultCode;

    public OnImageGridSpecCellEditorResult(@NotNull Activity activity0, @NotNull ImageGridAdapter imageGridAdapter0, int v, @Nullable Intent intent0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(imageGridAdapter0, "imageGridAdapter");
        super("imageGrid", 0, 2, null);
        this.activity = activity0;
        this.imageGridAdapter = imageGridAdapter0;
        this.resultCode = v;
        this.intent = intent0;
    }

    @NotNull
    public final Activity component1() {
        return this.activity;
    }

    @NotNull
    public final ImageGridAdapter component2() {
        return this.imageGridAdapter;
    }

    public final int component3() {
        return this.resultCode;
    }

    @Nullable
    public final Intent component4() {
        return this.intent;
    }

    @NotNull
    public final OnImageGridSpecCellEditorResult copy(@NotNull Activity activity0, @NotNull ImageGridAdapter imageGridAdapter0, int v, @Nullable Intent intent0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(imageGridAdapter0, "imageGridAdapter");
        return new OnImageGridSpecCellEditorResult(activity0, imageGridAdapter0, v, intent0);
    }

    public static OnImageGridSpecCellEditorResult copy$default(OnImageGridSpecCellEditorResult onImageGridSpecCellEditorResult0, Activity activity0, ImageGridAdapter imageGridAdapter0, int v, Intent intent0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            activity0 = onImageGridSpecCellEditorResult0.activity;
        }
        if((v1 & 2) != 0) {
            imageGridAdapter0 = onImageGridSpecCellEditorResult0.imageGridAdapter;
        }
        if((v1 & 4) != 0) {
            v = onImageGridSpecCellEditorResult0.resultCode;
        }
        if((v1 & 8) != 0) {
            intent0 = onImageGridSpecCellEditorResult0.intent;
        }
        return onImageGridSpecCellEditorResult0.copy(activity0, imageGridAdapter0, v, intent0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OnImageGridSpecCellEditorResult)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.activity, ((OnImageGridSpecCellEditorResult)object0).activity)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.imageGridAdapter, ((OnImageGridSpecCellEditorResult)object0).imageGridAdapter)) {
            return false;
        }
        return this.resultCode == ((OnImageGridSpecCellEditorResult)object0).resultCode ? Intrinsics.areEqual(this.intent, ((OnImageGridSpecCellEditorResult)object0).intent) : false;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final ImageGridAdapter getImageGridAdapter() {
        return this.imageGridAdapter;
    }

    @Nullable
    public final Intent getIntent() {
        return this.intent;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    @Override
    public int hashCode() {
        int v = a.c(this.resultCode, (this.imageGridAdapter.hashCode() + this.activity.hashCode() * 0x1F) * 0x1F, 0x1F);
        return this.intent == null ? v : v + this.intent.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "OnImageGridSpecCellEditorResult(activity=" + this.activity + ", imageGridAdapter=" + this.imageGridAdapter + ", resultCode=" + this.resultCode + ", intent=" + this.intent + ")";
    }
}

