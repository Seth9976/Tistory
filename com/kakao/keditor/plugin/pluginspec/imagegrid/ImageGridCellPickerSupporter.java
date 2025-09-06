package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.app.Activity;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\t2\u000E\u0010\u0019\u001A\n\u0012\u0004\u0012\u00020\u001B\u0018\u00010\u001A2\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001D0\u001AH\u0016R\u001A\u0010\u0002\u001A\u0004\u0018\u00010\u0003X¦\u000E¢\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001A\u00020\tX¦\u000E¢\u0006\f\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u001A\u0010\u000E\u001A\u0004\u0018\u00010\u000FX¦\u000E¢\u0006\f\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001E"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridCellPickerSupporter;", "", "cellPickerOpener", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener;", "getCellPickerOpener", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener;", "setCellPickerOpener", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener;)V", "cellPickerRequestCode", "", "getCellPickerRequestCode", "()I", "setCellPickerRequestCode", "(I)V", "cellPickerResultHandler", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerResultHandler;", "getCellPickerResultHandler", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerResultHandler;", "setCellPickerResultHandler", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerResultHandler;)V", "openCellPicker", "", "imageGridEditorActivity", "Landroid/app/Activity;", "defaultMaxCount", "otherImages", "", "Lcom/kakao/keditor/plugin/attrs/item/ImageUploadable;", "currentCells", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ImageGridCellPickerSupporter {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void openCellPicker(@NotNull ImageGridCellPickerSupporter imageGridCellPickerSupporter0, @NotNull Activity activity0, int v, @Nullable List list0, @NotNull List list1) {
            Intrinsics.checkNotNullParameter(activity0, "imageGridEditorActivity");
            Intrinsics.checkNotNullParameter(list1, "currentCells");
            if(imageGridCellPickerSupporter0.getCellPickerOpener() instanceof Requester) {
                CellPickerOpener cellPickerOpener0 = imageGridCellPickerSupporter0.getCellPickerOpener();
                Intrinsics.checkNotNull(cellPickerOpener0, "null cannot be cast to non-null type com.kakao.keditor.plugin.pluginspec.imagegrid.CellPickerOpener.Requester");
                ((Requester)cellPickerOpener0).openCellPicker(activity0, v, list0, list1);
                return;
            }
            if(activity0 instanceof AppCompatActivity) {
                CellPickerOpener cellPickerOpener1 = imageGridCellPickerSupporter0.getCellPickerOpener();
                Intrinsics.checkNotNull(cellPickerOpener1, "null cannot be cast to non-null type com.kakao.keditor.plugin.pluginspec.imagegrid.CellPickerOpener.IntentLauncher");
                Intent intent0 = ((IntentLauncher)cellPickerOpener1).getCellPickerIntent(((AppCompatActivity)activity0), v, list0, list1);
                if(intent0 != null) {
                    ActivityResultLauncher activityResultLauncher0 = ((IntentLauncher)cellPickerOpener1).getCellPickerResultLauncher();
                    if(activityResultLauncher0 != null) {
                        activityResultLauncher0.launch(intent0);
                    }
                }
            }
        }
    }

    @Nullable
    CellPickerOpener getCellPickerOpener();

    int getCellPickerRequestCode();

    @Nullable
    CellPickerResultHandler getCellPickerResultHandler();

    void openCellPicker(@NotNull Activity arg1, int arg2, @Nullable List arg3, @NotNull List arg4);

    void setCellPickerOpener(@Nullable CellPickerOpener arg1);

    void setCellPickerRequestCode(int arg1);

    void setCellPickerResultHandler(@Nullable CellPickerResultHandler arg1);
}

