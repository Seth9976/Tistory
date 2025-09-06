package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridCellItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001A\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0019H\u0016R\u001A\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\tX¦\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u001A\u0010\u000E\u001A\u0004\u0018\u00010\u000FX¦\u000E¢\u0006\f\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001A"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridCellEditorSupporter;", "", "cellEditorOpener", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener;", "getCellEditorOpener", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener;", "setCellEditorOpener", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener;)V", "cellEditorRequestCode", "", "getCellEditorRequestCode", "()I", "setCellEditorRequestCode", "(I)V", "cellEditorResultHandler", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorResultHandler;", "getCellEditorResultHandler", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorResultHandler;", "setCellEditorResultHandler", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorResultHandler;)V", "openCellEditor", "", "activity", "Landroid/app/Activity;", "cellItem", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ImageGridCellEditorSupporter {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void openCellEditor(@NotNull ImageGridCellEditorSupporter imageGridCellEditorSupporter0, @NotNull Activity activity0, @Nullable ImageGridCellItem imageGridCellItem0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            if(imageGridCellEditorSupporter0.getCellEditorOpener() instanceof Requester) {
                CellEditorOpener cellEditorOpener0 = imageGridCellEditorSupporter0.getCellEditorOpener();
                Intrinsics.checkNotNull(cellEditorOpener0, "null cannot be cast to non-null type com.kakao.keditor.plugin.pluginspec.imagegrid.CellEditorOpener.Requester");
                ((Requester)cellEditorOpener0).openCellEditor(activity0, imageGridCellItem0);
                return;
            }
            if(activity0 instanceof AppCompatActivity) {
                CellEditorOpener cellEditorOpener1 = imageGridCellEditorSupporter0.getCellEditorOpener();
                Intrinsics.checkNotNull(cellEditorOpener1, "null cannot be cast to non-null type com.kakao.keditor.plugin.pluginspec.imagegrid.CellEditorOpener.IntentLauncher");
                Intent intent0 = ((IntentLauncher)cellEditorOpener1).getCellEditorIntent(((AppCompatActivity)activity0), imageGridCellItem0);
                if(intent0 != null) {
                    ActivityResultLauncher activityResultLauncher0 = ((IntentLauncher)cellEditorOpener1).getCellEditorResultLauncher();
                    if(activityResultLauncher0 != null) {
                        activityResultLauncher0.launch(intent0);
                    }
                }
            }
        }
    }

    @Nullable
    CellEditorOpener getCellEditorOpener();

    int getCellEditorRequestCode();

    @Nullable
    CellEditorResultHandler getCellEditorResultHandler();

    void openCellEditor(@NotNull Activity arg1, @Nullable ImageGridCellItem arg2);

    void setCellEditorOpener(@Nullable CellEditorOpener arg1);

    void setCellEditorRequestCode(int arg1);

    void setCellEditorResultHandler(@Nullable CellEditorResultHandler arg1);
}

