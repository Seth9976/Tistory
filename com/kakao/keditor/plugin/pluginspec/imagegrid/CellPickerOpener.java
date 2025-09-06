package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener;", "", "()V", "IntentLauncher", "Requester", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener$IntentLauncher;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener$Requester;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CellPickerOpener {
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\n\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u000E\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00130\u0010H&R\"\u0010\u0003\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener$IntentLauncher;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener;", "()V", "cellPickerResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getCellPickerResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setCellPickerResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "getCellPickerIntent", "imageGridEditorActivity", "Landroidx/appcompat/app/AppCompatActivity;", "defaultMaxCount", "", "otherImages", "", "Lcom/kakao/keditor/plugin/attrs/item/ImageUploadable;", "currentCells", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class IntentLauncher extends CellPickerOpener {
        @Nullable
        private ActivityResultLauncher cellPickerResultLauncher;

        public IntentLauncher() {
            super(null);
        }

        @Nullable
        public abstract Intent getCellPickerIntent(@NotNull AppCompatActivity arg1, int arg2, @Nullable List arg3, @NotNull List arg4);

        @Nullable
        public ActivityResultLauncher getCellPickerResultLauncher() {
            return this.cellPickerResultLauncher;
        }

        public void setCellPickerResultLauncher(@Nullable ActivityResultLauncher activityResultLauncher0) {
            this.cellPickerResultLauncher = activityResultLauncher0;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u000E\u0010\t\u001A\n\u0012\u0004\u0012\u00020\u000B\u0018\u00010\n2\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\r0\nH&¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener$Requester;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener;", "()V", "openCellPicker", "", "imageGridEditorActivity", "Landroid/app/Activity;", "defaultMaxCount", "", "otherImages", "", "Lcom/kakao/keditor/plugin/attrs/item/ImageUploadable;", "currentCells", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class Requester extends CellPickerOpener {
        public Requester() {
            super(null);
        }

        public abstract void openCellPicker(@NotNull Activity arg1, int arg2, @Nullable List arg3, @NotNull List arg4);
    }

    private CellPickerOpener() {
    }

    public CellPickerOpener(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

