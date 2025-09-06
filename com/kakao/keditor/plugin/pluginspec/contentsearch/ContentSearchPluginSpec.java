package com.kakao.keditor.plugin.pluginspec.contentsearch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.string;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.delegate.JsonConverterKt;
import com.kakao.keditor.event.EventFlow;
import com.kakao.keditor.exception.MissingJsonConverterException;
import com.kakao.keditor.plugin.ActivityResultHandler;
import com.kakao.keditor.plugin.EditorSupporter;
import com.kakao.keditor.plugin.KeditorPluginType;
import com.kakao.keditor.plugin.PickerOpener.IntentLauncher;
import com.kakao.keditor.plugin.PickerOpener;
import com.kakao.keditor.plugin.PickerResultHandler;
import com.kakao.keditor.plugin.PickerSupporter;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.AlignmentType.Others;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.contentsearch.ContentSearchItem;
import com.kakao.keditor.plugin.itemspec.contentsearch.ContentSearchType;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind.Companion;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind;
import com.kakao.keditor.plugin.itemspec.unsupport.UnSupportedItem;
import com.kakao.keditor.plugin.pluginspec.PluginSpec.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.ConvertContentSearchToVideo;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.widget.KeditorEditText;
import com.squareup.moshi.Moshi.Builder;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorPluginType(type = "contentSearch")
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\b\u0010M\u001A\u00020NH\u0016J$\u0010O\u001A\u00020P2\u0012\u0010Q\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020S0R2\u0006\u0010T\u001A\u00020UH\u0002R\u0014\u0010\u0005\u001A\u00020\u00068BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0007\u0010\bR \u0010\t\u001A\b\u0012\u0004\u0012\u00020\u000B0\nX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001E\u0010\u0010\u001A\u0004\u0018\u00010\u0011X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0016\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001C\u0010\u0017\u001A\u0004\u0018\u00010\u0018X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001CR\u001E\u0010\u001D\u001A\u0004\u0018\u00010\u0011X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0016\u001A\u0004\b\u001E\u0010\u0013\"\u0004\b\u001F\u0010\u0015R\u001A\u0010 \u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010%\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b&\u0010\r\"\u0004\b\'\u0010\u000FR\u001C\u0010(\u001A\u0004\u0018\u00010)X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001A\u0010.\u001A\u00020/X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b0\u00101\"\u0004\b2\u00103R\u001C\u00104\u001A\u0004\u0018\u000105X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b6\u00107\"\u0004\b8\u00109R\u001C\u0010:\u001A\u00020\u00118VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b;\u0010\"\"\u0004\b<\u0010$R\u001C\u0010=\u001A\u0004\u0018\u00010>X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001A\u0010C\u001A\u00020\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bD\u0010\b\"\u0004\bE\u0010FR\u001C\u0010G\u001A\u0004\u0018\u00010HX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bI\u0010J\"\u0004\bK\u0010L\u00A8\u0006V"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchPluginSpec;", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "Lcom/kakao/keditor/plugin/PickerSupporter;", "Lcom/kakao/keditor/plugin/ActivityResultHandler;", "()V", "contentType", "", "getContentType", "()Ljava/lang/String;", "contentTypeList", "", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/ContentSearchType;", "getContentTypeList", "()Ljava/util/List;", "setContentTypeList", "(Ljava/util/List;)V", "contextMenuDescription", "", "getContextMenuDescription", "()Ljava/lang/Integer;", "setContextMenuDescription", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "contextMenuIcon", "Landroid/view/View;", "getContextMenuIcon", "()Landroid/view/View;", "setContextMenuIcon", "(Landroid/view/View;)V", "contextMenuResource", "getContextMenuResource", "setContextMenuResource", "editorId", "getEditorId", "()I", "setEditorId", "(I)V", "itemSpecKeys", "getItemSpecKeys", "setItemSpecKeys", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "setItemSpecs", "(Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;)V", "phase", "Lcom/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchPhase;", "getPhase", "()Lcom/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchPhase;", "setPhase", "(Lcom/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchPhase;)V", "pickerOpener", "Lcom/kakao/keditor/plugin/PickerOpener;", "getPickerOpener", "()Lcom/kakao/keditor/plugin/PickerOpener;", "setPickerOpener", "(Lcom/kakao/keditor/plugin/PickerOpener;)V", "pickerRequestCode", "getPickerRequestCode", "setPickerRequestCode", "pickerResultHandler", "Lcom/kakao/keditor/plugin/PickerResultHandler;", "getPickerResultHandler", "()Lcom/kakao/keditor/plugin/PickerResultHandler;", "setPickerResultHandler", "(Lcom/kakao/keditor/plugin/PickerResultHandler;)V", "serviceType", "getServiceType", "setServiceType", "(Ljava/lang/String;)V", "toolbarOverlayMenuItem", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getToolbarOverlayMenuItem", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "setToolbarOverlayMenuItem", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;)V", "runIconClick", "", "toContentSearchItem", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/ContentSearchItem;", "attribute", "", "", "kind", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/attrs/Kind;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nContentSearchPluginSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentSearchPluginSpec.kt\ncom/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchPluginSpec\n+ 2 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,140:1\n136#2,12:141\n*S KotlinDebug\n*F\n+ 1 ContentSearchPluginSpec.kt\ncom/kakao/keditor/plugin/pluginspec/contentsearch/ContentSearchPluginSpec\n*L\n75#1:141,12\n*E\n"})
public final class ContentSearchPluginSpec implements ActivityResultHandler, PickerSupporter, PluginSpec {
    @NotNull
    private List contentTypeList;
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
    @NotNull
    private ContentSearchPhase phase;
    @Nullable
    private PickerOpener pickerOpener;
    private int pickerRequestCode;
    @Nullable
    private PickerResultHandler pickerResultHandler;
    @NotNull
    private String serviceType;
    @Nullable
    private ToolbarOverlayMenuItem toolbarOverlayMenuItem;

    public ContentSearchPluginSpec() {
        this.itemSpecKeys = k.listOf("contentSearch");
        this.toolbarOverlayMenuItem = new ToolbarOverlayMenuItem(id.ke_overlay_content_search, drawable.ke_toolbar_btn_menu_item_content_search, string.cd_add_content_search, string.plugin_more_content_search, null, 16, null);
        this.phase = ContentSearchPhase.PRODUCTION;
        Object object0 = Keditor.INSTANCE.getConfig().get("kakao_tv_service_name");
        String s = null;
        if(!(object0 instanceof String)) {
            object0 = null;
        }
        if(((String)object0) != null) {
            s = (String)object0;
        }
        if(s == null) {
            s = "";
        }
        this.serviceType = s;
        this.contentTypeList = ContentSearchType.Companion.all();
        this.pickerRequestCode = -1;
        this.pickerOpener = new IntentLauncher() {
            @Override  // com.kakao.keditor.plugin.PickerOpener$IntentLauncher
            @NotNull
            public Intent getPickerIntent(@NotNull AppCompatActivity appCompatActivity0) {
                Intrinsics.checkNotNullParameter(appCompatActivity0, "activity");
                Intent intent0 = new Intent(appCompatActivity0, ContentSearchActivity.class);
                intent0.putExtra("phase", ContentSearchPluginSpec.this.getPhase());
                intent0.putExtra("serviceType", ContentSearchPluginSpec.this.getServiceType());
                intent0.putExtra("contentType", ContentSearchPluginSpec.this.getContentType());
                return intent0;
            }
        };
        this.pickerResultHandler = new PickerResultHandler() {
            @Override  // com.kakao.keditor.plugin.PickerResultHandler
            public void onPickerResult(int v, @Nullable Intent intent0) {
                Object object0;
                if(v != -1) {
                    return;
                }
                if(intent0 != null) {
                    String s = intent0.getStringExtra("cdmItemJson");
                    if(s != null) {
                        Class class0 = JsonConverterKt.jsonConverterClass();
                        boolean z = Intrinsics.areEqual(class0, Moshi.class);
                        Class class1 = Item.class;
                        if(z) {
                            object0 = new Builder().add(new KotlinJsonAdapterFactory()).build().adapter(class1).fromJson(s);
                        }
                        else {
                            if(!Intrinsics.areEqual(class0, Gson.class)) {
                                throw new MissingJsonConverterException();
                            }
                            object0 = new GsonBuilder().create().fromJson(s, class1);
                        }
                        if(((Item)object0) != null) {
                            ContentSearchPluginSpec contentSearchPluginSpec0 = ContentSearchPluginSpec.this;
                            Map map0 = ((Item)object0).getAttribute();
                            Intrinsics.checkNotNull(map0);
                            if(Intrinsics.areEqual(((Item)object0).getType(), "contentSearch")) {
                                Companion kind$Companion0 = Kind.Companion;
                                Object object1 = map0.get("kind");
                                Intrinsics.checkNotNull(object1);
                                if(kind$Companion0.byNameText(object1.toString()) != null) {
                                    Object object2 = map0.get("kind");
                                    Intrinsics.checkNotNull(object2);
                                    Kind kind0 = kind$Companion0.byNameText(object2.toString());
                                    Intrinsics.checkNotNull(kind0);
                                    AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(k.listOf(contentSearchPluginSpec0.toContentSearchItem(map0, kind0)), 0, false, false, 14, null);
                                    KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
                                    return;
                                }
                            }
                            if(Intrinsics.areEqual(((Item)object0).getType(), "video") && contentSearchPluginSpec0.hasItemSpec("video")) {
                                ConvertContentSearchToVideo pluginSpecRequest$ConvertContentSearchToVideo0 = new ConvertContentSearchToVideo(0, map0, 1, null);
                                KeEvent.INSTANCE.postInScope(pluginSpecRequest$ConvertContentSearchToVideo0);
                                return;
                            }
                            AddKeditorItems viewRequest$AddKeditorItems1 = new AddKeditorItems(k.listOf(new UnSupportedItem(((Item)object0))), 0, false, false, 14, null);
                            KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems1);
                        }
                    }
                }
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

    private final String getContentType() {
        List list0 = CollectionsKt___CollectionsKt.toMutableList(this.contentTypeList);
        if(list0.isEmpty()) {
            list0.addAll(ContentSearchType.Companion.all());
        }
        ContentSearchType contentSearchType0 = ContentSearchType.VIDEO;
        if((list0.contains(contentSearchType0) & (!this.hasItemSpec("video") | (this.serviceType.length() == 0 ? 1 : 0))) != 0) {
            list0.remove(contentSearchType0);
        }
        return CollectionsKt___CollectionsKt.joinToString$default(list0, ",", null, null, 0, null, com.kakao.keditor.plugin.pluginspec.contentsearch.ContentSearchPluginSpec.contentType.2.INSTANCE, 30, null);

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/ContentSearchType;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.pluginspec.contentsearch.ContentSearchPluginSpec.contentType.2 extends Lambda implements Function1 {
            public static final com.kakao.keditor.plugin.pluginspec.contentsearch.ContentSearchPluginSpec.contentType.2 INSTANCE;

            static {
                com.kakao.keditor.plugin.pluginspec.contentsearch.ContentSearchPluginSpec.contentType.2.INSTANCE = new com.kakao.keditor.plugin.pluginspec.contentsearch.ContentSearchPluginSpec.contentType.2();
            }

            public com.kakao.keditor.plugin.pluginspec.contentsearch.ContentSearchPluginSpec.contentType.2() {
                super(1);
            }

            @NotNull
            public final CharSequence invoke(@NotNull ContentSearchType contentSearchType0) {
                Intrinsics.checkNotNullParameter(contentSearchType0, "it");
                return contentSearchType0.getValue();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((ContentSearchType)object0));
            }
        }

    }

    @NotNull
    public final List getContentTypeList() {
        return this.contentTypeList;
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
    public final ContentSearchPhase getPhase() {
        return this.phase;
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

    @NotNull
    public final String getServiceType() {
        return this.serviceType;
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

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void runIconClick() {
        Activity activity0 = this.findActivity();
        if(activity0 != null) {
            com.kakao.keditor.plugin.PickerSupporter.DefaultImpls.openPicker$default(this, activity0, null, 2, null);
        }
        Keditor.clickEvent$default(Keditor.INSTANCE, "moremenu", "contentSearch", null, 4, null);
    }

    public final void setContentTypeList(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        this.contentTypeList = list0;
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

    public final void setPhase(@NotNull ContentSearchPhase contentSearchPhase0) {
        Intrinsics.checkNotNullParameter(contentSearchPhase0, "<set-?>");
        this.phase = contentSearchPhase0;
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

    public final void setServiceType(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.serviceType = s;
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void setToolbarOverlayMenuItem(@Nullable ToolbarOverlayMenuItem toolbarOverlayMenuItem0) {
        this.toolbarOverlayMenuItem = toolbarOverlayMenuItem0;
    }

    private final ContentSearchItem toContentSearchItem(Map map0, Kind kind0) {
        Object object0 = map0.get("align");
        Intrinsics.checkNotNull(object0);
        Alignment alignment0 = Alignment.Companion.byNameText(object0.toString(), Others.INSTANCE);
        Object object1 = map0.get("data");
        Intrinsics.checkNotNull(object1);
        return new ContentSearchItem(kind0, alignment0, ((Map)object1));
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

