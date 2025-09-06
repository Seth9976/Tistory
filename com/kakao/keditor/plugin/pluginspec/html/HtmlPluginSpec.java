package com.kakao.keditor.plugin.pluginspec.html;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.string;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.plugin.ActivityResultHandler;
import com.kakao.keditor.plugin.EditorOpener.IntentLauncher;
import com.kakao.keditor.plugin.EditorOpener;
import com.kakao.keditor.plugin.EditorResultHandler;
import com.kakao.keditor.plugin.EditorSupporter;
import com.kakao.keditor.plugin.KeditorPluginType;
import com.kakao.keditor.plugin.PickerSupporter;
import com.kakao.keditor.plugin.extension.IntentKt;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.html.HtmlItem;
import com.kakao.keditor.plugin.pluginspec.PluginSpec.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.plugin.pluginspec.html.editor.HtmlEditorActivity;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.EditKeditorItem;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.util.eventbus.ViewRequest.ReplaceItems;
import com.kakao.keditor.widget.KeditorEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorPluginType(type = "html")
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B\u0005\u00A2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001A\u00020\u0007H\u0016J\u0016\u0010C\u001A\b\u0012\u0004\u0012\u00020D012\u0006\u0010E\u001A\u00020\rH\u0016J\u0010\u0010F\u001A\u00020G2\u0006\u0010H\u001A\u00020IH\u0016J\b\u0010J\u001A\u00020GH\u0016R\u001A\u0010\u0006\u001A\u00020\u0007X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u001E\u0010\f\u001A\u0004\u0018\u00010\rX\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0012\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u001C\u0010\u0013\u001A\u0004\u0018\u00010\u0014X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001E\u0010\u0019\u001A\u0004\u0018\u00010\rX\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0012\u001A\u0004\b\u001A\u0010\u000F\"\u0004\b\u001B\u0010\u0011R\u001A\u0010\u001C\u001A\u00020\rX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 R\"\u0010!\u001A\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\"X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001C\u0010\'\u001A\u00020\r8VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010\u001E\"\u0004\b)\u0010 R\u001C\u0010*\u001A\u0004\u0018\u00010+X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001A\n\u0012\u0004\u0012\u000202\u0018\u000101X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b3\u00104\"\u0004\b5\u00106R\u001C\u00107\u001A\u0004\u0018\u000108X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001C\u0010=\u001A\u0004\u0018\u00010>X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b?\u0010@\"\u0004\bA\u0010B\u00A8\u0006K"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/html/HtmlPluginSpec;", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "Lcom/kakao/keditor/plugin/EditorSupporter;", "Lcom/kakao/keditor/plugin/itemspec/html/HtmlItem;", "Lcom/kakao/keditor/plugin/ActivityResultHandler;", "()V", "addToolbarOverlayMenu", "", "getAddToolbarOverlayMenu", "()Z", "setAddToolbarOverlayMenu", "(Z)V", "contextMenuDescription", "", "getContextMenuDescription", "()Ljava/lang/Integer;", "setContextMenuDescription", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "contextMenuIcon", "Landroid/view/View;", "getContextMenuIcon", "()Landroid/view/View;", "setContextMenuIcon", "(Landroid/view/View;)V", "contextMenuResource", "getContextMenuResource", "setContextMenuResource", "editorId", "getEditorId", "()I", "setEditorId", "(I)V", "editorOpener", "Lcom/kakao/keditor/plugin/EditorOpener;", "getEditorOpener", "()Lcom/kakao/keditor/plugin/EditorOpener;", "setEditorOpener", "(Lcom/kakao/keditor/plugin/EditorOpener;)V", "editorRequestCode", "getEditorRequestCode", "setEditorRequestCode", "editorResultHandler", "Lcom/kakao/keditor/plugin/EditorResultHandler;", "getEditorResultHandler", "()Lcom/kakao/keditor/plugin/EditorResultHandler;", "setEditorResultHandler", "(Lcom/kakao/keditor/plugin/EditorResultHandler;)V", "itemSpecKeys", "", "", "getItemSpecKeys", "()Ljava/util/List;", "setItemSpecKeys", "(Ljava/util/List;)V", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "setItemSpecs", "(Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;)V", "toolbarOverlayMenuItem", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getToolbarOverlayMenuItem", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "setToolbarOverlayMenuItem", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;)V", "createKeditorItems", "Lcom/kakao/keditor/KeditorItem;", "focusPosition", "onRequest", "", "request", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "runIconClick", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HtmlPluginSpec implements ActivityResultHandler, EditorSupporter, PluginSpec {
    private boolean addToolbarOverlayMenu;
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
    @Nullable
    private ToolbarOverlayMenuItem toolbarOverlayMenuItem;

    public HtmlPluginSpec() {
        this.itemSpecKeys = k.listOf("html");
        this.toolbarOverlayMenuItem = new ToolbarOverlayMenuItem(id.ke_overlay_html, drawable.ke_toolbar_btn_menu_item_html, string.cd_add_html, string.plugin_more_html, null, 16, null);
        this.addToolbarOverlayMenu = true;
        this.editorRequestCode = -1;
        this.editorOpener = new com.kakao.keditor.plugin.pluginspec.html.HtmlPluginSpec.editorOpener.1();
        this.editorResultHandler = new com.kakao.keditor.plugin.pluginspec.html.HtmlPluginSpec.editorResultHandler.1();

        @Metadata(d1 = {"\u0000\u001D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001A\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"com/kakao/keditor/plugin/pluginspec/html/HtmlPluginSpec$editorOpener$1", "Lcom/kakao/keditor/plugin/EditorOpener$IntentLauncher;", "Lcom/kakao/keditor/plugin/itemspec/html/HtmlItem;", "getEditorIntent", "Landroid/content/Intent;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "item", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public final class com.kakao.keditor.plugin.pluginspec.html.HtmlPluginSpec.editorOpener.1 extends IntentLauncher {
            @Override  // com.kakao.keditor.plugin.EditorOpener$IntentLauncher
            public Intent getEditorIntent(AppCompatActivity appCompatActivity0, KeditorItem keditorItem0) {
                return this.getEditorIntent(appCompatActivity0, ((HtmlItem)keditorItem0));
            }

            @NotNull
            public Intent getEditorIntent(@NotNull AppCompatActivity appCompatActivity0, @Nullable HtmlItem htmlItem0) {
                Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
                Intent intent0 = new Intent(appCompatActivity0, HtmlEditorActivity.class);
                if(htmlItem0 != null) {
                    intent0.putExtra("data", htmlItem0);
                }
                return intent0;
            }
        }


        @Metadata(d1 = {"\u0000\u001D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001A\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/kakao/keditor/plugin/pluginspec/html/HtmlPluginSpec$editorResultHandler$1", "Lcom/kakao/keditor/plugin/EditorResultHandler;", "onEditorResult", "", "resultCode", "", "data", "Landroid/content/Intent;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        public final class com.kakao.keditor.plugin.pluginspec.html.HtmlPluginSpec.editorResultHandler.1 implements EditorResultHandler {
            @Override  // com.kakao.keditor.plugin.EditorResultHandler
            public void onEditorResult(int v, @Nullable Intent intent0) {
                if(v != -1) {
                    return;
                }
                if(intent0 != null) {
                    HtmlItem htmlItem0 = (HtmlItem)IntentKt.getSerializableExtraCompat(intent0, "data", HtmlItem.class);
                    if(htmlItem0 != null) {
                        if(intent0.getBooleanExtra("is_edit_flag", false)) {
                            ReplaceItems viewRequest$ReplaceItems0 = new ReplaceItems(0, k.listOf(htmlItem0), 0, false, 13, null);
                            KeEvent.INSTANCE.postInScope(viewRequest$ReplaceItems0);
                            return;
                        }
                        AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(k.listOf(htmlItem0), 0, false, false, 14, null);
                        KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
                    }
                }
            }
        }

    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public boolean addToolbarOverlayMenu() {
        return this.addToolbarOverlayMenu;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @Nullable
    public View createIconForContextMenu(@NotNull Context context0) {
        return DefaultImpls.createIconForContextMenu(this, context0);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    @NotNull
    public List createKeditorItems(int v) {
        List list0 = new ArrayList();
        ItemSpecs itemSpecs0 = this.getItemSpecs();
        if(itemSpecs0 != null) {
            RootItemSpec rootItemSpec0 = itemSpecs0.byType("html");
            if(rootItemSpec0 != null) {
                KeditorItem keditorItem0 = rootItemSpec0.createKeditorItem();
                if(keditorItem0 != null) {
                    list0.add(keditorItem0);
                }
            }
        }
        return list0;
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

    public final boolean getAddToolbarOverlayMenu() {
        return this.addToolbarOverlayMenu;
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
        return this.editorRequestCode == -1 ? DefaultImpls.pluginId$default(this, 0, 1, null) : this.editorRequestCode;
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
        Intrinsics.checkNotNullParameter(pluginSpecRequest0, "request");
        if(pluginSpecRequest0 instanceof EditKeditorItem) {
            Activity activity0 = this.findActivity();
            if(activity0 != null) {
                KeditorItem keditorItem0 = ((EditKeditorItem)pluginSpecRequest0).getItem();
                Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.html.HtmlItem");
                com.kakao.keditor.plugin.EditorSupporter.DefaultImpls.openEditor$default(this, activity0, null, ((HtmlItem)keditorItem0), 2, null);
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.EditorSupporter
    public void openEditor(Activity activity0, EventFlow eventFlow0, KeditorItem keditorItem0) {
        this.openEditor(activity0, eventFlow0, ((HtmlItem)keditorItem0));
    }

    public void openEditor(@NotNull Activity activity0, @Nullable EventFlow eventFlow0, @Nullable HtmlItem htmlItem0) {
        com.kakao.keditor.plugin.EditorSupporter.DefaultImpls.openEditor(this, activity0, eventFlow0, htmlItem0);
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
        Activity activity0 = this.findActivity();
        if(activity0 != null) {
            com.kakao.keditor.plugin.EditorSupporter.DefaultImpls.openEditor$default(this, activity0, null, null, 2, null);
        }
        Keditor.clickEvent$default(Keditor.INSTANCE, "moremenu", "html", null, 4, null);
    }

    public final void setAddToolbarOverlayMenu(boolean z) {
        this.addToolbarOverlayMenu = z;
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
}

