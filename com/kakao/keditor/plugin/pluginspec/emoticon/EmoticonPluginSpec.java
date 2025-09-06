package com.kakao.keditor.plugin.pluginspec.emoticon;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.room.a;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.string;
import com.kakao.keditor.plugin.KeditorPluginType;
import com.kakao.keditor.plugin.attrs.Alignment.Center;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.emoticon.EmoticonItem;
import com.kakao.keditor.plugin.itemspec.emoticon.KakaoEmoticonProvider;
import com.kakao.keditor.plugin.itemspec.emoticon.KeditorEmoticonProvider;
import com.kakao.keditor.plugin.pluginspec.PluginSpec.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.ApplyOverlayCategory;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import com.kakao.keditor.util.eventbus.ToolbarRequest.ShowSoftInputOverlay;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.widget.KeditorEditText;
import com.kakao.kemoticon.Emoticon;
import com.kakao.kemoticon.EmoticonKeyboard;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorPluginType(type = "emoticon")
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010:\u001A\u00020;2\u0006\u0010<\u001A\u00020=2\u0006\u0010.\u001A\u00020/H\u0016J\u0010\u0010>\u001A\u00020;2\u0006\u0010?\u001A\u00020@H\u0016J\b\u0010A\u001A\u00020;H\u0016R\"\u0010\u0003\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001E\u0010\n\u001A\u0004\u0018\u00010\u000BX\u0096\u000E¢\u0006\u0010\n\u0002\u0010\u0010\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001C\u0010\u0011\u001A\u0004\u0018\u00010\u0012X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001E\u0010\u0017\u001A\u0004\u0018\u00010\u000BX\u0096\u000E¢\u0006\u0010\n\u0002\u0010\u0010\u001A\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000FR\u001A\u0010\u001A\u001A\u00020\u000BX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\u001A\u0010\u001F\u001A\u00020 X\u0086.¢\u0006\u000E\n\u0000\u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001A\u0010%\u001A\u00020&X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u001C\u0010.\u001A\u0004\u0018\u00010/X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b0\u00101\"\u0004\b2\u00103R\u001C\u00104\u001A\u0004\u0018\u000105X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006B"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/emoticon/EmoticonPluginSpec;", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "()V", "activeEmoticons", "", "", "getActiveEmoticons", "()Ljava/util/List;", "setActiveEmoticons", "(Ljava/util/List;)V", "contextMenuDescription", "", "getContextMenuDescription", "()Ljava/lang/Integer;", "setContextMenuDescription", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "contextMenuIcon", "Landroid/view/View;", "getContextMenuIcon", "()Landroid/view/View;", "setContextMenuIcon", "(Landroid/view/View;)V", "contextMenuResource", "getContextMenuResource", "setContextMenuResource", "editorId", "getEditorId", "()I", "setEditorId", "(I)V", "emoticonKeyboard", "Lcom/kakao/kemoticon/EmoticonKeyboard;", "getEmoticonKeyboard", "()Lcom/kakao/kemoticon/EmoticonKeyboard;", "setEmoticonKeyboard", "(Lcom/kakao/kemoticon/EmoticonKeyboard;)V", "emoticonProvider", "Lcom/kakao/keditor/plugin/itemspec/emoticon/KeditorEmoticonProvider;", "getEmoticonProvider", "()Lcom/kakao/keditor/plugin/itemspec/emoticon/KeditorEmoticonProvider;", "setEmoticonProvider", "(Lcom/kakao/keditor/plugin/itemspec/emoticon/KeditorEmoticonProvider;)V", "itemSpecKeys", "getItemSpecKeys", "setItemSpecKeys", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "setItemSpecs", "(Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;)V", "toolbarOverlayMenuItem", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getToolbarOverlayMenuItem", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "setToolbarOverlayMenuItem", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;)V", "initPluginSpec", "", "context", "Landroid/content/Context;", "onRequest", "request", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "runIconClick", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEmoticonPluginSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmoticonPluginSpec.kt\ncom/kakao/keditor/plugin/pluginspec/emoticon/EmoticonPluginSpec\n+ 2 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,73:1\n136#2,12:74\n*S KotlinDebug\n*F\n+ 1 EmoticonPluginSpec.kt\ncom/kakao/keditor/plugin/pluginspec/emoticon/EmoticonPluginSpec\n*L\n36#1:74,12\n*E\n"})
public final class EmoticonPluginSpec implements PluginSpec {
    @Nullable
    private List activeEmoticons;
    @Nullable
    private Integer contextMenuDescription;
    @Nullable
    private View contextMenuIcon;
    @Nullable
    private Integer contextMenuResource;
    private int editorId;
    public EmoticonKeyboard emoticonKeyboard;
    @NotNull
    private KeditorEmoticonProvider emoticonProvider;
    @Nullable
    private List itemSpecKeys;
    @Nullable
    private ItemSpecs itemSpecs;
    @Nullable
    private ToolbarOverlayMenuItem toolbarOverlayMenuItem;

    public EmoticonPluginSpec() {
        List list1;
        this.itemSpecKeys = k.listOf("emoticon");
        this.contextMenuResource = drawable.ke_toolbar_btn_emoticon_menu_item;
        this.contextMenuDescription = string.cd_add_emoticon;
        this.emoticonProvider = KakaoEmoticonProvider.INSTANCE;
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = this.getEditorId();
        List list0 = null;
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)a.g(keditor0, integer0)).containsKey("emoticon_set")) {
            Object object1 = keditor0.getConfig().get("emoticon_set");
            if(!(object1 instanceof List)) {
                object1 = null;
            }
            list1 = (List)object1;
        }
        else {
            Object object0 = ((Map)a.g(keditor0, integer0)).get("emoticon_set");
            if(!(object0 instanceof List)) {
                object0 = null;
            }
            list1 = (List)object0;
        }
        if(list1 != null) {
            list0 = list1;
        }
        this.activeEmoticons = list0;
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

    @Nullable
    public final List getActiveEmoticons() {
        return this.activeEmoticons;
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

    @NotNull
    public final EmoticonKeyboard getEmoticonKeyboard() {
        EmoticonKeyboard emoticonKeyboard0 = this.emoticonKeyboard;
        if(emoticonKeyboard0 != null) {
            return emoticonKeyboard0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("emoticonKeyboard");
        return null;
    }

    @NotNull
    public final KeditorEmoticonProvider getEmoticonProvider() {
        return this.emoticonProvider;
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
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(itemSpecs0, "itemSpecs");
        DefaultImpls.initPluginSpec(this, context0, itemSpecs0);
        EmoticonKeyboard emoticonKeyboard0 = new EmoticonKeyboard(context0, new Function5() {
            {
                EmoticonPluginSpec.this = emoticonPluginSpec0;
                super(5);
            }

            @Override  // kotlin.jvm.functions.Function5
            public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4) {
                return this.invoke(((String)object0), ((String)object1), ((Number)object2).intValue(), ((String)object3), ((Boolean)object4).booleanValue());
            }

            @NotNull
            public final String invoke(@NotNull String s, @NotNull String s1, int v, @NotNull String s2, boolean z) {
                Intrinsics.checkNotNullParameter(s, "packId");
                Intrinsics.checkNotNullParameter(s1, "id");
                Intrinsics.checkNotNullParameter(s2, "ext");
                return EmoticonPluginSpec.this.getEmoticonProvider().getEmoticonUri(s, s1, v, Intrinsics.areEqual(s2, "gif"), z);
            }
        }, new Function2() {
            {
                EmoticonPluginSpec.this = emoticonPluginSpec0;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((String)object0), ((Boolean)object1).booleanValue());
            }

            @NotNull
            public final String invoke(@NotNull String s, boolean z) {
                Intrinsics.checkNotNullParameter(s, "packId");
                return EmoticonPluginSpec.this.getEmoticonProvider().getEmoticonTabIconUri(s, z);
            }
        }, this.activeEmoticons, null, 0, 0x30, null);
        emoticonKeyboard0.setEmoticonClickListener(com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec.initPluginSpec.3.1.INSTANCE);
        emoticonKeyboard0.setToolbarClickListener(com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec.initPluginSpec.3.2.INSTANCE);
        this.setEmoticonKeyboard(emoticonKeyboard0);

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "keyboard", "Lcom/kakao/kemoticon/EmoticonKeyboard;", "emoticon", "Lcom/kakao/kemoticon/Emoticon;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec.initPluginSpec.3.1 extends Lambda implements Function2 {
            public static final com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec.initPluginSpec.3.1 INSTANCE;

            static {
                com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec.initPluginSpec.3.1.INSTANCE = new com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec.initPluginSpec.3.1();
            }

            public com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec.initPluginSpec.3.1() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((EmoticonKeyboard)object0), ((Emoticon)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull EmoticonKeyboard emoticonKeyboard0, @NotNull Emoticon emoticon0) {
                Intrinsics.checkNotNullParameter(emoticonKeyboard0, "keyboard");
                Intrinsics.checkNotNullParameter(emoticon0, "emoticon");
                AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(k.listOf(new EmoticonItem(emoticon0.getPackId(), emoticon0.getId(), emoticon0.getSrc(), Center.INSTANCE)), 0, false, false, 14, null);
                KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
                emoticonKeyboard0.pushToHistory(emoticon0);
            }
        }


        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "index", "", "setId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec.initPluginSpec.3.2 extends Lambda implements Function2 {
            public static final com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec.initPluginSpec.3.2 INSTANCE;

            static {
                com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec.initPluginSpec.3.2.INSTANCE = new com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec.initPluginSpec.3.2();
            }

            public com.kakao.keditor.plugin.pluginspec.emoticon.EmoticonPluginSpec.initPluginSpec.3.2() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((Number)object0).intValue(), ((String)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(int v, @NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "setId");
                if(v == 0) {
                    s = "history";
                }
                Keditor.clickEvent$default(Keditor.INSTANCE, "emoticon-toolbar", s, null, 4, null);
            }
        }

    }

    @Override  // com.kakao.keditor.plugin.pluginspec.RequestHandler
    public void onRequest(@NotNull PluginSpecRequest pluginSpecRequest0) {
        Intrinsics.checkNotNullParameter(pluginSpecRequest0, "request");
        if(pluginSpecRequest0 instanceof ApplyOverlayCategory) {
            View view0 = this.getContextMenuIcon();
            if(view0 != null) {
                view0.setSelected(Intrinsics.areEqual(((ApplyOverlayCategory)pluginSpecRequest0).getOverlayCategory(), com.kakao.keditor.toolbar.category.OverlayCategory.Emoticon.INSTANCE));
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public int pluginId(int v) {
        return DefaultImpls.pluginId(this, v);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public void renderEditTextScrollToOffset(@NotNull KeditorEditText keditorEditText0, int v) {
        DefaultImpls.renderEditTextScrollToOffset(this, keditorEditText0, v);
    }

    @Override  // com.kakao.keditor.plugin.pluginspec.PluginSpec
    public void runIconClick() {
        ShowSoftInputOverlay toolbarRequest$ShowSoftInputOverlay0 = new ShowSoftInputOverlay(this.getEmoticonKeyboard(), com.kakao.keditor.toolbar.category.OverlayCategory.Emoticon.INSTANCE, true);
        KeEvent.INSTANCE.postInScope(toolbarRequest$ShowSoftInputOverlay0);
        Keditor.clickEvent$default(Keditor.INSTANCE, "toolbar", "emoticon", null, 4, null);
    }

    public final void setActiveEmoticons(@Nullable List list0) {
        this.activeEmoticons = list0;
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

    public final void setEmoticonKeyboard(@NotNull EmoticonKeyboard emoticonKeyboard0) {
        Intrinsics.checkNotNullParameter(emoticonKeyboard0, "<set-?>");
        this.emoticonKeyboard = emoticonKeyboard0;
    }

    public final void setEmoticonProvider(@NotNull KeditorEmoticonProvider keditorEmoticonProvider0) {
        Intrinsics.checkNotNullParameter(keditorEmoticonProvider0, "<set-?>");
        this.emoticonProvider = keditorEmoticonProvider0;
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

