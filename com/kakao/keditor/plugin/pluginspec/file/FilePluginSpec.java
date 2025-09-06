package com.kakao.keditor.plugin.pluginspec.file;

import android.app.Activity;
import android.content.ClipData;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.net.Uri;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.CallSuper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.room.a;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.string;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.plugin.ActivityResultHandler;
import com.kakao.keditor.plugin.EditorSupporter;
import com.kakao.keditor.plugin.KeditorPluginType;
import com.kakao.keditor.plugin.PickerOpener.IntentLauncher;
import com.kakao.keditor.plugin.PickerOpener;
import com.kakao.keditor.plugin.PickerResultHandler;
import com.kakao.keditor.plugin.PickerSupporter;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.file.FileItem;
import com.kakao.keditor.plugin.pluginspec.PluginSpec.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.widget.KeditorEditText;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorPluginType(type = "file")
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u0012\u0010<\u001A\u0004\u0018\u00010=2\u0006\u0010>\u001A\u00020?H\u0002J\u0014\u0010@\u001A\b\u0012\u0004\u0012\u00020=0A2\u0006\u0010B\u001A\u00020CJ\u0014\u0010D\u001A\u00020E2\f\u0010F\u001A\b\u0012\u0004\u0012\u00020=0\u001BJ\b\u0010G\u001A\u00020EH\u0016J \u0010H\u001A\u00020E2\u0018\u0010I\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020=0\u001B\u0012\u0004\u0012\u00020E0JR\u001E\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u000B\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001C\u0010\f\u001A\u0004\u0018\u00010\rX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u001E\u0010\u0012\u001A\u0004\u0018\u00010\u0006X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u000B\u001A\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\u001A\u0010\u0015\u001A\u00020\u0006X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001A\u001A\n\u0012\u0004\u0012\u00020\u001C\u0018\u00010\u001BX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R\u001C\u0010!\u001A\u0004\u0018\u00010\"X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001C\u0010\'\u001A\u0004\u0018\u00010(X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001C\u0010-\u001A\u00020\u00068VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u001C\u00100\u001A\u0004\u0018\u000101X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b2\u00103\"\u0004\b4\u00105R\u001C\u00106\u001A\u0004\u0018\u000107X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b8\u00109\"\u0004\b:\u0010;\u00A8\u0006K"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/file/FilePluginSpec;", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "Lcom/kakao/keditor/plugin/PickerSupporter;", "Lcom/kakao/keditor/plugin/ActivityResultHandler;", "()V", "contextMenuDescription", "", "getContextMenuDescription", "()Ljava/lang/Integer;", "setContextMenuDescription", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "contextMenuIcon", "Landroid/view/View;", "getContextMenuIcon", "()Landroid/view/View;", "setContextMenuIcon", "(Landroid/view/View;)V", "contextMenuResource", "getContextMenuResource", "setContextMenuResource", "editorId", "getEditorId", "()I", "setEditorId", "(I)V", "itemSpecKeys", "", "", "getItemSpecKeys", "()Ljava/util/List;", "setItemSpecKeys", "(Ljava/util/List;)V", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "setItemSpecs", "(Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;)V", "pickerOpener", "Lcom/kakao/keditor/plugin/PickerOpener;", "getPickerOpener", "()Lcom/kakao/keditor/plugin/PickerOpener;", "setPickerOpener", "(Lcom/kakao/keditor/plugin/PickerOpener;)V", "pickerRequestCode", "getPickerRequestCode", "setPickerRequestCode", "pickerResultHandler", "Lcom/kakao/keditor/plugin/PickerResultHandler;", "getPickerResultHandler", "()Lcom/kakao/keditor/plugin/PickerResultHandler;", "setPickerResultHandler", "(Lcom/kakao/keditor/plugin/PickerResultHandler;)V", "toolbarOverlayMenuItem", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getToolbarOverlayMenuItem", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "setToolbarOverlayMenuItem", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;)V", "getFile", "Lcom/kakao/keditor/plugin/itemspec/file/FileItem;", "uri", "Landroid/net/Uri;", "getItemsByIntent", "", "intent", "Landroid/content/Intent;", "requestAddFileItems", "", "items", "runIconClick", "withAttachedFiles", "callback", "Lkotlin/Function1;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FilePluginSpec implements ActivityResultHandler, PickerSupporter, PluginSpec {
    @Nullable
    private Integer contextMenuDescription;
    @Nullable
    private View contextMenuIcon;
    @Nullable
    private Integer contextMenuResource;
    private int editorId;
    @Nullable
    private List itemSpecKeys;
    @Nullable
    private ItemSpecs itemSpecs;
    @Nullable
    private PickerOpener pickerOpener;
    private int pickerRequestCode;
    @Nullable
    private PickerResultHandler pickerResultHandler;
    @Nullable
    private ToolbarOverlayMenuItem toolbarOverlayMenuItem;

    public FilePluginSpec() {
        this.itemSpecKeys = k.listOf("file");
        this.toolbarOverlayMenuItem = new ToolbarOverlayMenuItem(id.ke_overlay_file, drawable.ke_toolbar_btn_menu_item_file, string.cd_add_file, string.plugin_more_attach_file, null, 16, null);
        this.pickerRequestCode = -1;
        this.pickerOpener = new IntentLauncher() {
            @Override  // com.kakao.keditor.plugin.PickerOpener$IntentLauncher
            @NotNull
            public Intent getPickerIntent(@NotNull AppCompatActivity appCompatActivity0) {
                Boolean boolean1;
                Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
                Intent intent0 = new Intent("android.intent.action.GET_CONTENT");
                intent0.setType("*/*");
                Keditor keditor0 = Keditor.INSTANCE;
                Integer integer0 = FilePluginSpec.this.getEditorId();
                Boolean boolean0 = Boolean.FALSE;
                Object object0 = null;
                if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)a.g(keditor0, integer0)).containsKey("file_multi_select_enabled")) {
                    Object object2 = keditor0.getConfig().get("file_multi_select_enabled");
                    if(object2 instanceof Boolean) {
                        object0 = object2;
                    }
                }
                else {
                    Object object1 = ((Map)a.g(keditor0, integer0)).get("file_multi_select_enabled");
                    if(object1 instanceof Boolean) {
                        object0 = object1;
                    }
                }
                boolean1 = (Boolean)object0;
                if(boolean1 != null) {
                    boolean0 = boolean1;
                }
                if(Intrinsics.areEqual(boolean0, Boolean.TRUE)) {
                    intent0.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                }
                Intent intent1 = Intent.createChooser(intent0, keditor0.getContext().getString(string.cd_add_file));
                Intrinsics.checkNotNullExpressionValue(intent1, "createChooser(...)");
                return intent1;
            }
        };
        this.pickerResultHandler = new PickerResultHandler() {
            @Override  // com.kakao.keditor.plugin.PickerResultHandler
            public void onPickerResult(int v, @Nullable Intent intent0) {
                if(v != -1) {
                    return;
                }
                if(intent0 == null) {
                    return;
                }
                AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(FilePluginSpec.this.getItemsByIntent(intent0), 0, false, false, 14, null);
                KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
            }
        };
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

    private final FileItem getFile(Uri uri0) {
        FileItem fileItem0;
        Cursor cursor0;
        try {
            cursor0 = Keditor.INSTANCE.getContext().getContentResolver().query(uri0, new String[]{"_display_name", "_size", "mime_type"}, null, null, null);
            if(cursor0 != null) {
                goto label_2;
            }
        }
        catch(Exception unused_ex) {
        }
        return null;
        try {
        label_2:
            cursor0.moveToFirst();
            ContentValues contentValues0 = new ContentValues();
            DatabaseUtils.cursorRowToContentValues(cursor0, contentValues0);
            fileItem0 = new FileItem();
            String s = uri0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
            fileItem0.setSrc(s);
            String s1 = contentValues0.getAsString("_display_name");
            Intrinsics.checkNotNullExpressionValue(s1, "getAsString(...)");
            fileItem0.setName(s1);
            Long long0 = contentValues0.getAsLong("_size");
            Intrinsics.checkNotNullExpressionValue(long0, "getAsLong(...)");
            fileItem0.setSize(long0.longValue());
            String s2 = contentValues0.getAsString("mime_type");
            if(s2 == null) {
                s2 = "";
            }
            fileItem0.setMimeType(s2);
            goto label_25;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable1) {
            try {
                CloseableKt.closeFinally(cursor0, throwable0);
                throw throwable1;
            label_25:
                CloseableKt.closeFinally(cursor0, null);
                return fileItem0;
            }
            catch(Exception unused_ex) {
            }
        }
        return null;
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

    @NotNull
    public final List getItemsByIntent(@NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(intent0, "intent");
        List list0 = new ArrayList();
        Uri uri0 = intent0.getData();
        ClipData clipData0 = intent0.getClipData();
        if(clipData0 != null) {
            int v = clipData0.getItemCount();
            for(int v1 = 0; v1 < v; ++v1) {
                Uri uri1 = clipData0.getItemAt(v1).getUri();
                if(uri1 != null) {
                    FileItem fileItem0 = this.getFile(uri1);
                    if(fileItem0 != null) {
                        list0.add(fileItem0);
                    }
                }
            }
            return list0;
        }
        if(uri0 != null) {
            FileItem fileItem1 = this.getFile(uri0);
            if(fileItem1 != null) {
                list0.add(fileItem1);
            }
        }
        return list0;
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
        DefaultImpls.onRequest(this, pluginSpecRequest0);
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

    public final void requestAddFileItems(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "items");
        AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(list0, 0, false, false, 14, null);
        KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void runIconClick() {
        Activity activity0 = this.findActivity();
        if(activity0 instanceof AppCompatActivity && this.getPickerOpener() instanceof IntentLauncher) {
            PickerOpener pickerOpener0 = this.getPickerOpener();
            Intrinsics.checkNotNull(pickerOpener0, "null cannot be cast to non-null type com.kakao.keditor.plugin.PickerOpener.IntentLauncher");
            Intent intent0 = ((IntentLauncher)pickerOpener0).getPickerIntent(((AppCompatActivity)activity0));
            if(intent0 != null) {
                ActivityResultLauncher activityResultLauncher0 = ((IntentLauncher)pickerOpener0).getPickerResultLauncher();
                if(activityResultLauncher0 != null) {
                    activityResultLauncher0.launch(intent0);
                }
            }
        }
        Keditor.clickEvent$default(Keditor.INSTANCE, "moremenu", "file", null, 4, null);
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

    public final void withAttachedFiles(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "callback");
        KeditorView keditorView0 = this.findKeditorView();
        if(keditorView0 != null) {
            keditorView0.getItems(new Function1() {
                final Function1 $callback;

                {
                    this.$callback = function10;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(((List)object0));
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull List list0) {
                    Intrinsics.checkNotNullParameter(list0, "it");
                    Function1 function10 = this.$callback;
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object0: list0) {
                        if(object0 instanceof FileItem) {
                            arrayList0.add(object0);
                        }
                    }
                    function10.invoke(arrayList0);
                }
            });
        }
    }
}

