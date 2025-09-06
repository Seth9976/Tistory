package com.kakao.keditor.plugin.pluginspec.imagegrid;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.plugin.ActivityResultHandler;
import com.kakao.keditor.plugin.EditorOpener.IntentLauncher;
import com.kakao.keditor.plugin.EditorOpener;
import com.kakao.keditor.plugin.EditorResultHandler;
import com.kakao.keditor.plugin.EditorSupporter;
import com.kakao.keditor.plugin.KeditorPluginType;
import com.kakao.keditor.plugin.PickerOpener;
import com.kakao.keditor.plugin.PickerResultHandler;
import com.kakao.keditor.plugin.PickerSupporter;
import com.kakao.keditor.plugin.extension.IntentKt;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridCellItem;
import com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem;
import com.kakao.keditor.plugin.pluginspec.PluginSpec.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.plugin.pluginspec.RequestHandler;
import com.kakao.keditor.plugin.pluginspec.imagegrid.editor.ImageGridEditorActivity;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.EditKeditorItem;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.util.eventbus.ViewRequest.ReplaceItems;
import com.kakao.keditor.util.eventbus.ViewRequest.UpdateRepresentState;
import com.kakao.keditor.widget.KeditorEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorPluginType(type = "imageGrid")
@Metadata(d1 = {"\u0000\u00B2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\b\u0012\u0004\u0012\u00020\u00060\u00052\u00020\u00072\u00020\bB\u0005\u00A2\u0006\u0002\u0010\tJ+\u0010o\u001A\u00020p2\u0006\u0010q\u001A\u00020r2\b\u0010s\u001A\u0004\u0018\u00010\u00112\f\u0010t\u001A\b\u0012\u0004\u0012\u00020u0M\u00A2\u0006\u0002\u0010vJ\u0010\u0010w\u001A\u00020p2\u0006\u0010x\u001A\u00020yH\u0016J%\u0010z\u001A\u00020p2\u0006\u0010q\u001A\u00020r2\b\u0010s\u001A\u0004\u0018\u00010\u00112\u0006\u0010{\u001A\u00020u\u00A2\u0006\u0002\u0010|R\u001C\u0010\n\u001A\u0004\u0018\u00010\u000BX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001C\u0010\u0016\u001A\u0004\u0018\u00010\u0017X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001BR\u001C\u0010\u001C\u001A\u0004\u0018\u00010\u001DX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R\u001A\u0010\"\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001C\u0010%\u001A\u0004\u0018\u00010&X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001E\u0010+\u001A\u0004\u0018\u00010\u0011X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u00100\u001A\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001C\u00101\u001A\u0004\u0018\u000102X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b3\u00104\"\u0004\b5\u00106R\u001E\u00107\u001A\u0004\u0018\u00010\u0011X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u00100\u001A\u0004\b8\u0010-\"\u0004\b9\u0010/R\u001A\u0010:\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b;\u0010\u0013\"\u0004\b<\u0010\u0015R\"\u0010=\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010>X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001C\u0010C\u001A\u00020\u00118VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bD\u0010\u0013\"\u0004\bE\u0010\u0015R\u001C\u0010F\u001A\u0004\u0018\u00010GX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bH\u0010I\"\u0004\bJ\u0010KR\"\u0010L\u001A\n\u0012\u0004\u0012\u00020N\u0018\u00010MX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001C\u0010S\u001A\u0004\u0018\u00010TX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bU\u0010V\"\u0004\bW\u0010XR\u000E\u0010Y\u001A\u00020\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001C\u0010Z\u001A\u0004\u0018\u00010[X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001C\u0010`\u001A\u00020\u00118VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\ba\u0010\u0013\"\u0004\bb\u0010\u0015R\u001C\u0010c\u001A\u0004\u0018\u00010dX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\be\u0010f\"\u0004\bg\u0010hR\u001C\u0010i\u001A\u0004\u0018\u00010jX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bk\u0010l\"\u0004\bm\u0010n\u00A8\u0006}"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridPluginSpec;", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "Lcom/kakao/keditor/plugin/pluginspec/RequestHandler;", "Lcom/kakao/keditor/plugin/ActivityResultHandler;", "Lcom/kakao/keditor/plugin/PickerSupporter;", "Lcom/kakao/keditor/plugin/EditorSupporter;", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItem;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridCellEditorSupporter;", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridCellPickerSupporter;", "()V", "cellEditorOpener", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener;", "getCellEditorOpener", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener;", "setCellEditorOpener", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorOpener;)V", "cellEditorRequestCode", "", "getCellEditorRequestCode", "()I", "setCellEditorRequestCode", "(I)V", "cellEditorResultHandler", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorResultHandler;", "getCellEditorResultHandler", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorResultHandler;", "setCellEditorResultHandler", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellEditorResultHandler;)V", "cellPickerOpener", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener;", "getCellPickerOpener", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener;", "setCellPickerOpener", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerOpener;)V", "cellPickerRequestCode", "getCellPickerRequestCode", "setCellPickerRequestCode", "cellPickerResultHandler", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerResultHandler;", "getCellPickerResultHandler", "()Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerResultHandler;", "setCellPickerResultHandler", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/CellPickerResultHandler;)V", "contextMenuDescription", "getContextMenuDescription", "()Ljava/lang/Integer;", "setContextMenuDescription", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "contextMenuIcon", "Landroid/view/View;", "getContextMenuIcon", "()Landroid/view/View;", "setContextMenuIcon", "(Landroid/view/View;)V", "contextMenuResource", "getContextMenuResource", "setContextMenuResource", "editorId", "getEditorId", "setEditorId", "editorOpener", "Lcom/kakao/keditor/plugin/EditorOpener;", "getEditorOpener", "()Lcom/kakao/keditor/plugin/EditorOpener;", "setEditorOpener", "(Lcom/kakao/keditor/plugin/EditorOpener;)V", "editorRequestCode", "getEditorRequestCode", "setEditorRequestCode", "editorResultHandler", "Lcom/kakao/keditor/plugin/EditorResultHandler;", "getEditorResultHandler", "()Lcom/kakao/keditor/plugin/EditorResultHandler;", "setEditorResultHandler", "(Lcom/kakao/keditor/plugin/EditorResultHandler;)V", "itemSpecKeys", "", "", "getItemSpecKeys", "()Ljava/util/List;", "setItemSpecKeys", "(Ljava/util/List;)V", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "setItemSpecs", "(Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;)V", "maxImageCount", "pickerOpener", "Lcom/kakao/keditor/plugin/PickerOpener;", "getPickerOpener", "()Lcom/kakao/keditor/plugin/PickerOpener;", "setPickerOpener", "(Lcom/kakao/keditor/plugin/PickerOpener;)V", "pickerRequestCode", "getPickerRequestCode", "setPickerRequestCode", "pickerResultHandler", "Lcom/kakao/keditor/plugin/PickerResultHandler;", "getPickerResultHandler", "()Lcom/kakao/keditor/plugin/PickerResultHandler;", "setPickerResultHandler", "(Lcom/kakao/keditor/plugin/PickerResultHandler;)V", "toolbarOverlayMenuItem", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getToolbarOverlayMenuItem", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "setToolbarOverlayMenuItem", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;)V", "addImageCellItems", "", "imageGridAdapter", "Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter;", "targetCellIndex", "cellItems", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter;Ljava/lang/Integer;Ljava/util/List;)V", "onRequest", "request", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "updateImageCellItem", "newItem", "(Lcom/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridAdapter;Ljava/lang/Integer;Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;)V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ImageGridPluginSpec implements ActivityResultHandler, EditorSupporter, PickerSupporter, PluginSpec, RequestHandler, ImageGridCellEditorSupporter, ImageGridCellPickerSupporter {
    @Nullable
    private CellEditorOpener cellEditorOpener;
    private int cellEditorRequestCode;
    @Nullable
    private CellEditorResultHandler cellEditorResultHandler;
    @Nullable
    private CellPickerOpener cellPickerOpener;
    private int cellPickerRequestCode;
    @Nullable
    private CellPickerResultHandler cellPickerResultHandler;
    @Nullable
    private Integer contextMenuDescription;
    @Nullable
    private View contextMenuIcon;
    @Nullable
    private Integer contextMenuResource;
    private int editorId;
    @Nullable
    private EditorOpener editorOpener;
    private int editorRequestCode;
    @Nullable
    private EditorResultHandler editorResultHandler;
    @Nullable
    private List itemSpecKeys;
    @Nullable
    private ItemSpecs itemSpecs;
    private int maxImageCount;
    @Nullable
    private PickerOpener pickerOpener;
    private int pickerRequestCode;
    @Nullable
    private PickerResultHandler pickerResultHandler;
    @Nullable
    private ToolbarOverlayMenuItem toolbarOverlayMenuItem;

    public ImageGridPluginSpec() {
        this.itemSpecKeys = CollectionsKt__CollectionsKt.listOf(new String[]{"image", "imageGrid"});
        this.pickerRequestCode = -1;
        this.pickerResultHandler = new PickerResultHandler() {
            @Override  // com.kakao.keditor.plugin.PickerResultHandler
            public void onPickerResult(int v, @Nullable Intent intent0) {
                if(v != -1) {
                    return;
                }
                if(intent0 != null) {
                    ClipData clipData0 = intent0.getClipData();
                    if(clipData0 != null) {
                        ImageGridItem imageGridItem0 = new ImageGridItem(null, null, null, 7, null);
                        ImageGridPluginSpec imageGridPluginSpec0 = ImageGridPluginSpec.this;
                        List list0 = imageGridItem0.getImages();
                        ArrayList arrayList0 = new ArrayList();
                        int v1 = clipData0.getItemCount();
                        for(int v2 = 0; v2 < v1; ++v2) {
                            Uri uri0 = clipData0.getItemAt(v2).getUri();
                            if(uri0 != null) {
                                Intrinsics.checkNotNull(uri0);
                                arrayList0.add(ImageGridPluginSpecKt.pathToItem(uri0, imageGridPluginSpec0.findActivity()));
                            }
                        }
                        list0.addAll(arrayList0);
                        AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(k.listOf(imageGridItem0), 0, false, false, 14, null);
                        KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
                    }
                }
            }
        };
        this.editorRequestCode = -1;
        this.editorOpener = new IntentLauncher() {
            @Override  // com.kakao.keditor.plugin.EditorOpener$IntentLauncher
            public Intent getEditorIntent(AppCompatActivity appCompatActivity0, KeditorItem keditorItem0) {
                return this.getEditorIntent(appCompatActivity0, ((ImageGridItem)keditorItem0));
            }

            @NotNull
            public Intent getEditorIntent(@NotNull AppCompatActivity appCompatActivity0, @Nullable ImageGridItem imageGridItem0) {
                Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
                Intent intent0 = new Intent(appCompatActivity0, ImageGridEditorActivity.class);
                ImageGridPluginSpec imageGridPluginSpec0 = ImageGridPluginSpec.this;
                if(imageGridItem0 != null) {
                    intent0.putExtra("data", imageGridItem0);
                    intent0.putExtra("keditor_item_index", imageGridPluginSpec0.indexOf(imageGridItem0));
                    intent0.putExtra("image_picker_request_code", imageGridPluginSpec0.getCellPickerRequestCode());
                    intent0.putExtra("image_editor_request_code", imageGridPluginSpec0.getCellEditorRequestCode());
                    intent0.putExtra("cell_picker_is_intent_launcher", !(imageGridPluginSpec0.getCellPickerOpener() instanceof Requester));
                    intent0.putExtra("cell_editor_is_intent_launcher", !(imageGridPluginSpec0.getCellEditorOpener() instanceof com.kakao.keditor.plugin.pluginspec.imagegrid.CellEditorOpener.Requester));
                }
                intent0.putExtra("editor_id", imageGridPluginSpec0.getEditorId());
                return intent0;
            }
        };
        this.editorResultHandler = new com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridPluginSpec.editorResultHandler.1();
        this.cellEditorRequestCode = 1000;
        this.cellEditorResultHandler = new CellEditorResultHandler() {
            @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.CellEditorResultHandler
            public void onCellEditorResult(@NotNull Activity activity0, @NotNull ImageGridAdapter imageGridAdapter0, int v, @Nullable Intent intent0, @Nullable Integer integer0) {
                Intrinsics.checkNotNullParameter(activity0, "imageGridEditorActivity");
                Intrinsics.checkNotNullParameter(imageGridAdapter0, "imageGridAdapter");
                if(v != -1) {
                    return;
                }
                if(intent0 == null) {
                    return;
                }
                Uri uri0 = intent0.getData();
                ClipData clipData0 = intent0.getClipData();
                if(clipData0 != null && clipData0.getItemCount() > 0) {
                    Uri uri1 = clipData0.getItemAt(0).getUri();
                    if(uri1 != null) {
                        ImageGridCellItem imageGridCellItem0 = ImageGridPluginSpecKt.pathToItem(uri1, activity0);
                        if(imageGridCellItem0 != null) {
                            ImageGridPluginSpec.this.updateImageCellItem(imageGridAdapter0, integer0, imageGridCellItem0);
                        }
                    }
                }
                else if(uri0 != null) {
                    ImageGridCellItem imageGridCellItem1 = ImageGridPluginSpecKt.pathToItem(uri0, activity0);
                    ImageGridPluginSpec.this.updateImageCellItem(imageGridAdapter0, integer0, imageGridCellItem1);
                }
            }
        };
        this.maxImageCount = 14;
        this.cellPickerRequestCode = 2000;
        this.cellPickerResultHandler = new CellPickerResultHandler() {
            @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.CellPickerResultHandler
            public void onCellPickerResult(@NotNull Activity activity0, @NotNull ImageGridAdapter imageGridAdapter0, int v, @Nullable Intent intent0, @Nullable Integer integer0) {
                Intrinsics.checkNotNullParameter(activity0, "activity");
                Intrinsics.checkNotNullParameter(imageGridAdapter0, "imageGridAdapter");
                if(v != -1) {
                    return;
                }
                if(intent0 == null) {
                    return;
                }
                Uri uri0 = intent0.getData();
                ClipData clipData0 = intent0.getClipData();
                ArrayList arrayList0 = new ArrayList();
                if(clipData0 != null) {
                    int v1 = clipData0.getItemCount();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        Uri uri1 = clipData0.getItemAt(v2).getUri();
                        if(uri1 != null) {
                            arrayList0.add(ImageGridPluginSpecKt.pathToItem(uri1, activity0));
                        }
                    }
                }
                else if(uri0 != null) {
                    arrayList0.add(ImageGridPluginSpecKt.pathToItem(uri0, activity0));
                }
                ImageGridPluginSpec.this.addImageCellItems(imageGridAdapter0, integer0, arrayList0);
            }
        };

        @Metadata(d1 = {"\u0000\u001D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001A\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/kakao/keditor/plugin/pluginspec/imagegrid/ImageGridPluginSpec$editorResultHandler$1", "Lcom/kakao/keditor/plugin/EditorResultHandler;", "onEditorResult", "", "resultCode", "", "data", "Landroid/content/Intent;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public final class com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridPluginSpec.editorResultHandler.1 implements EditorResultHandler {
            @Override  // com.kakao.keditor.plugin.EditorResultHandler
            public void onEditorResult(int v, @Nullable Intent intent0) {
                int v1 = -1;
                if(v != -1) {
                    return;
                }
                if(intent0 != null) {
                    v1 = intent0.getIntExtra("keditor_item_index", -1);
                }
                if(intent0 != null) {
                    ImageGridItem imageGridItem0 = (ImageGridItem)IntentKt.getSerializableExtraCompat(intent0, "data", ImageGridItem.class);
                    if(imageGridItem0 != null) {
                        if(imageGridItem0.getRepresentativeImageIndex() >= 0) {
                            UpdateRepresentState viewRequest$UpdateRepresentState0 = new UpdateRepresentState(v1, imageGridItem0.containsRepresentativeImage(), null, 4, null);
                            KeEvent.INSTANCE.postInScope(viewRequest$UpdateRepresentState0);
                        }
                        ReplaceItems viewRequest$ReplaceItems0 = new ReplaceItems(0, k.listOf(imageGridItem0), 0, false, 13, null);
                        KeEvent.INSTANCE.postInScope(viewRequest$ReplaceItems0);
                    }
                }
            }
        }

    }

    public final void addImageCellItems(@NotNull ImageGridAdapter imageGridAdapter0, @Nullable Integer integer0, @NotNull List list0) {
        Intrinsics.checkNotNullParameter(imageGridAdapter0, "imageGridAdapter");
        Intrinsics.checkNotNullParameter(list0, "cellItems");
        int v = integer0 == null ? -1 : ((int)integer0);
        if(v < -1) {
            v = CollectionsKt__CollectionsKt.getLastIndex(imageGridAdapter0.getItems());
        }
        ImageGridItem imageGridItem0 = imageGridAdapter0.getImageGridItem();
        if(imageGridItem0 != null) {
            imageGridItem0.addImagesAndFocusLastAdded(list0, this.maxImageCount);
        }
        imageGridAdapter0.notifyItemRangeInserted(v + 1, list0.size());
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public boolean addToolbarOverlayMenu() {
        return true;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public View createIconForContextMenu(@NotNull Context context0) {
        return DefaultImpls.createIconForContextMenu(this, context0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @NotNull
    public List createKeditorItems(int v) {
        return DefaultImpls.createKeditorItems(this, v);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public Activity findActivity() {
        return DefaultImpls.findActivity(this);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public KeditorView findKeditorView() {
        return DefaultImpls.findKeditorView(this);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    @Nullable
    public CellEditorOpener getCellEditorOpener() {
        return this.cellEditorOpener;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    public int getCellEditorRequestCode() {
        return this.cellEditorRequestCode;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    @Nullable
    public CellEditorResultHandler getCellEditorResultHandler() {
        return this.cellEditorResultHandler;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    @Nullable
    public CellPickerOpener getCellPickerOpener() {
        return this.cellPickerOpener;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    public int getCellPickerRequestCode() {
        return this.cellPickerRequestCode;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    @Nullable
    public CellPickerResultHandler getCellPickerResultHandler() {
        return this.cellPickerResultHandler;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public Integer getContextMenuDescription() {
        return this.contextMenuDescription;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public View getContextMenuIcon() {
        return this.contextMenuIcon;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public Integer getContextMenuResource() {
        return this.contextMenuResource;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public int getEditorId() {
        return this.editorId;
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    @Nullable
    public EditorOpener getEditorOpener() {
        return this.editorOpener;
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    public int getEditorRequestCode() {
        int v = this.editorRequestCode;
        if(v == -1) {
            int v1 = this.getPickerRequestCode();
            KeditorView keditorView0 = this.findKeditorView();
            if(keditorView0 != null) {
                List list0 = keditorView0.activeAllPluginTypes();
                return list0 == null ? v1 + 1 : v1 + list0.size();
            }
            return v1 + 1;
        }
        return v;
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    @Nullable
    public EditorResultHandler getEditorResultHandler() {
        return this.editorResultHandler;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public ViewHolder getHolder(@NotNull View view0) {
        return DefaultImpls.getHolder(this, view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public KeditorItem getItem(int v) {
        return DefaultImpls.getItem(this, v);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public KeditorItem getItem(@NotNull View view0) {
        return DefaultImpls.getItem(this, view0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public List getItemSpecKeys() {
        return this.itemSpecKeys;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public ItemSpecs getItemSpecs() {
        return this.itemSpecs;
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    @Nullable
    public PickerOpener getPickerOpener() {
        return this.pickerOpener;
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    public int getPickerRequestCode() {
        return this.pickerRequestCode == -1 ? DefaultImpls.pluginId$default(this, 0, 1, null) : this.pickerRequestCode;
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    @Nullable
    public PickerResultHandler getPickerResultHandler() {
        return this.pickerResultHandler;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public Integer getPosition(@NotNull View view0) {
        return DefaultImpls.getPosition(this, view0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public ToolbarOverlayMenuItem getToolbarOverlayMenuItem() {
        return this.toolbarOverlayMenuItem;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public boolean hasItemSpec(@NotNull String s) {
        return DefaultImpls.hasItemSpec(this, s);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public Unit ifFoundItem(@NotNull View view0, @NotNull Function1 function10) {
        return DefaultImpls.ifFoundItem(this, view0, function10);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    @Nullable
    public Unit ifFoundPosition(@NotNull View view0, @NotNull Function1 function10) {
        return DefaultImpls.ifFoundPosition(this, view0, function10);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public int indexOf(@NotNull KeditorItem keditorItem0) {
        return DefaultImpls.indexOf(this, keditorItem0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void initPluginSpec(@NotNull Context context0, @NotNull ItemSpecs itemSpecs0) {
        DefaultImpls.initPluginSpec(this, context0, itemSpecs0);
    }

    @Override  // com.kakao.keditor.plugin.ActivityResultHandler
    @CallSuper
    public void onActivityResult(int v, int v1, @Nullable Intent intent0) {
        com.kakao.keditor.plugin.ActivityResultHandler.DefaultImpls.onActivityResult(this, v, v1, intent0);
    }

    @Override  // com.kakao.keditor.plugin.ActivityResultHandler
    @Nullable
    public Unit onEditorActivityResult(@NotNull EditorSupporter editorSupporter0, int v, @Nullable Intent intent0) {
        return com.kakao.keditor.plugin.ActivityResultHandler.DefaultImpls.onEditorActivityResult(this, editorSupporter0, v, intent0);
    }

    @Override  // com.kakao.keditor.plugin.ActivityResultHandler
    @Nullable
    public Unit onPickerActivityResult(@NotNull PickerSupporter pickerSupporter0, int v, @Nullable Intent intent0) {
        return com.kakao.keditor.plugin.ActivityResultHandler.DefaultImpls.onPickerActivityResult(this, pickerSupporter0, v, intent0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.RequestHandler
    public void onRequest(@NotNull PluginSpecRequest pluginSpecRequest0) {
        String s = null;
        Intrinsics.checkNotNullParameter(pluginSpecRequest0, "request");
        if(pluginSpecRequest0 instanceof EditKeditorItem) {
            Activity activity0 = this.findActivity();
            if(activity0 != null) {
                KeditorItem keditorItem0 = ((EditKeditorItem)pluginSpecRequest0).getItem();
                Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem");
                com.kakao.keditor.plugin.EditorSupporter.DefaultImpls.openEditor$default(this, activity0, null, ((ImageGridItem)keditorItem0), 2, null);
            }
        }
        else {
            if(pluginSpecRequest0 instanceof OnPickerActivityResult) {
                Intent intent0 = ((OnPickerActivityResult)pluginSpecRequest0).getData();
                if(intent0 != null) {
                    ClipData clipData0 = intent0.getClipData();
                    if(clipData0 != null) {
                        ImageGridItem imageGridItem0 = new ImageGridItem(null, null, null, 7, null);
                        List list0 = imageGridItem0.getImages();
                        ArrayList arrayList0 = new ArrayList();
                        int v = clipData0.getItemCount();
                        for(int v1 = 0; v1 < v; ++v1) {
                            Uri uri0 = clipData0.getItemAt(v1).getUri();
                            if(uri0 != null) {
                                Intrinsics.checkNotNull(uri0);
                                arrayList0.add(ImageGridPluginSpecKt.pathToItem(uri0, this.findActivity()));
                            }
                        }
                        list0.addAll(arrayList0);
                        AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(k.listOf(imageGridItem0), 0, false, false, 14, null);
                        KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
                        return;
                    }
                }
                return;
            }
            if(pluginSpecRequest0 instanceof OpenImageGridSpecCellPicker) {
                this.openCellPicker(((OpenImageGridSpecCellPicker)pluginSpecRequest0).getActivity(), this.maxImageCount, null, ((OpenImageGridSpecCellPicker)pluginSpecRequest0).getImageGridCells());
                return;
            }
            if(pluginSpecRequest0 instanceof OnImageGridSpecCellPickerResult) {
                CellPickerResultHandler cellPickerResultHandler0 = this.getCellPickerResultHandler();
                if(cellPickerResultHandler0 != null) {
                    cellPickerResultHandler0.onCellPickerResult(((OnImageGridSpecCellPickerResult)pluginSpecRequest0).getActivity(), ((OnImageGridSpecCellPickerResult)pluginSpecRequest0).getImageGridAdapter(), ((OnImageGridSpecCellPickerResult)pluginSpecRequest0).getResultCode(), ((OnImageGridSpecCellPickerResult)pluginSpecRequest0).getIntent(), null);
                }
            }
            else if(pluginSpecRequest0 instanceof OpenImageGridSpecCellEditor) {
                if(((OpenImageGridSpecCellEditor)pluginSpecRequest0).getItem() != null) {
                    s = "";
                }
                if(s != null && s.length() != 0) {
                    this.openCellEditor(((OpenImageGridSpecCellEditor)pluginSpecRequest0).getActivity(), ((OpenImageGridSpecCellEditor)pluginSpecRequest0).getItem());
                }
            }
            else if(pluginSpecRequest0 instanceof OnImageGridSpecCellEditorResult) {
                CellEditorResultHandler cellEditorResultHandler0 = this.getCellEditorResultHandler();
                if(cellEditorResultHandler0 != null) {
                    cellEditorResultHandler0.onCellEditorResult(((OnImageGridSpecCellEditorResult)pluginSpecRequest0).getActivity(), ((OnImageGridSpecCellEditorResult)pluginSpecRequest0).getImageGridAdapter(), ((OnImageGridSpecCellEditorResult)pluginSpecRequest0).getResultCode(), ((OnImageGridSpecCellEditorResult)pluginSpecRequest0).getIntent(), null);
                }
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    public void openCellEditor(@NotNull Activity activity0, @Nullable ImageGridCellItem imageGridCellItem0) {
        com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter.DefaultImpls.openCellEditor(this, activity0, imageGridCellItem0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    public void openCellPicker(@NotNull Activity activity0, int v, @Nullable List list0, @NotNull List list1) {
        com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter.DefaultImpls.openCellPicker(this, activity0, v, list0, list1);
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    public void openEditor(Activity activity0, EventFlow eventFlow0, KeditorItem keditorItem0) {
        this.openEditor(activity0, eventFlow0, ((ImageGridItem)keditorItem0));
    }

    public void openEditor(@NotNull Activity activity0, @Nullable EventFlow eventFlow0, @Nullable ImageGridItem imageGridItem0) {
        com.kakao.keditor.plugin.EditorSupporter.DefaultImpls.openEditor(this, activity0, eventFlow0, imageGridItem0);
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    public void openPicker(@NotNull Activity activity0, @Nullable EventFlow eventFlow0) {
        com.kakao.keditor.plugin.PickerSupporter.DefaultImpls.openPicker(this, activity0, eventFlow0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public int pluginId(int v) {
        return DefaultImpls.pluginId(this, v);
    }

    @Override  // com.kakao.keditor.plugin.ActivityResultHandler
    @CallSuper
    public void registerForActivityResult(@NotNull AppCompatActivity appCompatActivity0) {
        com.kakao.keditor.plugin.ActivityResultHandler.DefaultImpls.registerForActivityResult(this, appCompatActivity0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public void renderEditTextScrollToOffset(@NotNull KeditorEditText keditorEditText0, int v) {
        DefaultImpls.renderEditTextScrollToOffset(this, keditorEditText0, v);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void runIconClick() {
        DefaultImpls.runIconClick(this);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    public void setCellEditorOpener(@Nullable CellEditorOpener cellEditorOpener0) {
        this.cellEditorOpener = cellEditorOpener0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    public void setCellEditorRequestCode(int v) {
        this.cellEditorRequestCode = v;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellEditorSupporter
    public void setCellEditorResultHandler(@Nullable CellEditorResultHandler cellEditorResultHandler0) {
        this.cellEditorResultHandler = cellEditorResultHandler0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    public void setCellPickerOpener(@Nullable CellPickerOpener cellPickerOpener0) {
        this.cellPickerOpener = cellPickerOpener0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    public void setCellPickerRequestCode(int v) {
        this.cellPickerRequestCode = v;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridCellPickerSupporter
    public void setCellPickerResultHandler(@Nullable CellPickerResultHandler cellPickerResultHandler0) {
        this.cellPickerResultHandler = cellPickerResultHandler0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setContextMenuDescription(@Nullable Integer integer0) {
        this.contextMenuDescription = integer0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setContextMenuIcon(@Nullable View view0) {
        this.contextMenuIcon = view0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setContextMenuResource(@Nullable Integer integer0) {
        this.contextMenuResource = integer0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public void setEditorId(int v) {
        this.editorId = v;
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    public void setEditorOpener(@Nullable EditorOpener editorOpener0) {
        this.editorOpener = editorOpener0;
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    public void setEditorRequestCode(int v) {
        this.editorRequestCode = v;
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    public void setEditorResultHandler(@Nullable EditorResultHandler editorResultHandler0) {
        this.editorResultHandler = editorResultHandler0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setItemSpecKeys(@Nullable List list0) {
        this.itemSpecKeys = list0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setItemSpecs(@Nullable ItemSpecs itemSpecs0) {
        this.itemSpecs = itemSpecs0;
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    public void setPickerOpener(@Nullable PickerOpener pickerOpener0) {
        this.pickerOpener = pickerOpener0;
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    public void setPickerRequestCode(int v) {
        this.pickerRequestCode = v;
    }

    @Override  // com.kakao.keditor.plugin.PickerSupporter
    public void setPickerResultHandler(@Nullable PickerResultHandler pickerResultHandler0) {
        this.pickerResultHandler = pickerResultHandler0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setToolbarOverlayMenuItem(@Nullable ToolbarOverlayMenuItem toolbarOverlayMenuItem0) {
        this.toolbarOverlayMenuItem = toolbarOverlayMenuItem0;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @NotNull
    public String type() {
        return DefaultImpls.type(this);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public boolean typeOf(@NotNull String s) {
        return DefaultImpls.typeOf(this, s);
    }

    public final void updateImageCellItem(@NotNull ImageGridAdapter imageGridAdapter0, @Nullable Integer integer0, @NotNull ImageGridCellItem imageGridCellItem0) {
        Intrinsics.checkNotNullParameter(imageGridAdapter0, "imageGridAdapter");
        Intrinsics.checkNotNullParameter(imageGridCellItem0, "newItem");
        ImageGridItem imageGridItem0 = imageGridAdapter0.getImageGridItem();
        if(imageGridItem0 != null) {
            int v = integer0 == null || ((int)integer0) <= -1 ? imageGridItem0.getFocusedImageIndex() : ((int)integer0);
            imageGridItem0.updateImage(imageGridCellItem0);
            imageGridAdapter0.notifyItemChanged(v);
        }
        Keditor.clickEventWithVersion$default(Keditor.INSTANCE, "photos-android-0.0.0", "photoeditor", "photo_edit_success", null, 8, null);
    }
}

