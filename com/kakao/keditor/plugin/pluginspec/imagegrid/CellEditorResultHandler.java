package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.app.Activity;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\b\u0010\n\u001A\u0004\u0018\u00010\u000B2\b\u0010\f\u001A\u0004\u0018\u00010\tH&¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorResultHandler;", "", "onCellEditorResult", "", "imageGridEditorActivity", "Landroid/app/Activity;", "imageGridAdapter", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter;", "resultCode", "", "data", "Landroid/content/Intent;", "focusedCellIndex", "(Landroid/app/Activity;Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter;ILandroid/content/Intent;Ljava/lang/Integer;)V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface CellEditorResultHandler {
    void onCellEditorResult(@NotNull Activity arg1, @NotNull ImageGridAdapter arg2, int arg3, @Nullable Intent arg4, @Nullable Integer arg5);
}

