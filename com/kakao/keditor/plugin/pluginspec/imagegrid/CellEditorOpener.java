package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridCellItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener;", "", "()V", "IntentLauncher", "Requester", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener$IntentLauncher;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener$Requester;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class CellEditorOpener {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001C\u0010\n\u001A\u0004\u0018\u00010\u00052\u0006\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EH&R\"\u0010\u0003\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000F"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener$IntentLauncher;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener;", "()V", "cellEditorResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getCellEditorResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setCellEditorResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "getCellEditorIntent", "imageGridEditorActivity", "Landroidx/appcompat/app/AppCompatActivity;", "cellItem", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class IntentLauncher extends CellEditorOpener {
        @Nullable
        private ActivityResultLauncher cellEditorResultLauncher;

        public IntentLauncher() {
            super(null);
        }

        @Nullable
        public abstract Intent getCellEditorIntent(@NotNull AppCompatActivity arg1, @Nullable ImageGridCellItem arg2);

        @Nullable
        public ActivityResultLauncher getCellEditorResultLauncher() {
            return this.cellEditorResultLauncher;
        }

        public void setCellEditorResultLauncher(@Nullable ActivityResultLauncher activityResultLauncher0) {
            this.cellEditorResultLauncher = activityResultLauncher0;
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001A\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener$Requester;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener;", "()V", "openCellEditor", "", "imageGridEditorActivity", "Landroid/app/Activity;", "cellItem", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static abstract class Requester extends CellEditorOpener {
        public Requester() {
            super(null);
        }

        public abstract void openCellEditor(@NotNull Activity arg1, @Nullable ImageGridCellItem arg2);
    }

    private CellEditorOpener() {
    }

    public CellEditorOpener(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

