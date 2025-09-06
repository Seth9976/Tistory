package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.app.Activity;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridCellItem;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000B\u001A\u00020\u0003HÆ\u0003J\u000B\u0010\f\u001A\u0004\u0018\u00010\u0005HÆ\u0003J\u001F\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001A\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001A\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/OpenImageGridSpecCellEditor;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "activity", "Landroid/app/Activity;", "item", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "(Landroid/app/Activity;Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;)V", "getActivity", "()Landroid/app/Activity;", "getItem", "()Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OpenImageGridSpecCellEditor extends PluginSpecRequest {
    @NotNull
    private final Activity activity;
    @Nullable
    private final ImageGridCellItem item;

    public OpenImageGridSpecCellEditor(@NotNull Activity activity0, @Nullable ImageGridCellItem imageGridCellItem0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        super("imageGrid", 0, 2, null);
        this.activity = activity0;
        this.item = imageGridCellItem0;
    }

    public OpenImageGridSpecCellEditor(Activity activity0, ImageGridCellItem imageGridCellItem0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            imageGridCellItem0 = null;
        }
        this(activity0, imageGridCellItem0);
    }

    @NotNull
    public final Activity component1() {
        return this.activity;
    }

    @Nullable
    public final ImageGridCellItem component2() {
        return this.item;
    }

    @NotNull
    public final OpenImageGridSpecCellEditor copy(@NotNull Activity activity0, @Nullable ImageGridCellItem imageGridCellItem0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        return new OpenImageGridSpecCellEditor(activity0, imageGridCellItem0);
    }

    public static OpenImageGridSpecCellEditor copy$default(OpenImageGridSpecCellEditor openImageGridSpecCellEditor0, Activity activity0, ImageGridCellItem imageGridCellItem0, int v, Object object0) {
        if((v & 1) != 0) {
            activity0 = openImageGridSpecCellEditor0.activity;
        }
        if((v & 2) != 0) {
            imageGridCellItem0 = openImageGridSpecCellEditor0.item;
        }
        return openImageGridSpecCellEditor0.copy(activity0, imageGridCellItem0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OpenImageGridSpecCellEditor)) {
            return false;
        }
        return Intrinsics.areEqual(this.activity, ((OpenImageGridSpecCellEditor)object0).activity) ? Intrinsics.areEqual(this.item, ((OpenImageGridSpecCellEditor)object0).item) : false;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @Nullable
    public final ImageGridCellItem getItem() {
        return this.item;
    }

    @Override
    public int hashCode() {
        int v = this.activity.hashCode();
        return this.item == null ? v * 0x1F : v * 0x1F + this.item.hashCode();
    }

    @Override
    @NotNull
    public String toString() {
        return "OpenImageGridSpecCellEditor(activity=" + this.activity + ", item=" + this.item + ")";
    }
}

