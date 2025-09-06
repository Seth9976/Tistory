package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.app.Activity;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001A\u00020\u0005HÆ\u0003J\u000F\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001B"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/OpenImageGridSpecCellPicker;", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "activity", "Landroid/app/Activity;", "imageGridItemIndex", "", "imageGridCells", "", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "(Landroid/app/Activity;ILjava/util/List;)V", "getActivity", "()Landroid/app/Activity;", "getImageGridCells", "()Ljava/util/List;", "getImageGridItemIndex", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OpenImageGridSpecCellPicker extends PluginSpecRequest {
    @NotNull
    private final Activity activity;
    @NotNull
    private final List imageGridCells;
    private final int imageGridItemIndex;

    public OpenImageGridSpecCellPicker(@NotNull Activity activity0, int v, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(list0, "imageGridCells");
        super("imageGrid", 0, 2, null);
        this.activity = activity0;
        this.imageGridItemIndex = v;
        this.imageGridCells = list0;
    }

    @NotNull
    public final Activity component1() {
        return this.activity;
    }

    public final int component2() {
        return this.imageGridItemIndex;
    }

    @NotNull
    public final List component3() {
        return this.imageGridCells;
    }

    @NotNull
    public final OpenImageGridSpecCellPicker copy(@NotNull Activity activity0, int v, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(list0, "imageGridCells");
        return new OpenImageGridSpecCellPicker(activity0, v, list0);
    }

    public static OpenImageGridSpecCellPicker copy$default(OpenImageGridSpecCellPicker openImageGridSpecCellPicker0, Activity activity0, int v, List list0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            activity0 = openImageGridSpecCellPicker0.activity;
        }
        if((v1 & 2) != 0) {
            v = openImageGridSpecCellPicker0.imageGridItemIndex;
        }
        if((v1 & 4) != 0) {
            list0 = openImageGridSpecCellPicker0.imageGridCells;
        }
        return openImageGridSpecCellPicker0.copy(activity0, v, list0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof OpenImageGridSpecCellPicker)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.activity, ((OpenImageGridSpecCellPicker)object0).activity)) {
            return false;
        }
        return this.imageGridItemIndex == ((OpenImageGridSpecCellPicker)object0).imageGridItemIndex ? Intrinsics.areEqual(this.imageGridCells, ((OpenImageGridSpecCellPicker)object0).imageGridCells) : false;
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final List getImageGridCells() {
        return this.imageGridCells;
    }

    public final int getImageGridItemIndex() {
        return this.imageGridItemIndex;
    }

    @Override
    public int hashCode() {
        return this.imageGridCells.hashCode() + a.c(this.imageGridItemIndex, this.activity.hashCode() * 0x1F, 0x1F);
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OpenImageGridSpecCellPicker(activity=");
        stringBuilder0.append(this.activity);
        stringBuilder0.append(", imageGridItemIndex=");
        stringBuilder0.append(this.imageGridItemIndex);
        stringBuilder0.append(", imageGridCells=");
        return wb.a.e(stringBuilder0, this.imageGridCells, ")");
    }
}

