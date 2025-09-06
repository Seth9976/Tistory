package com.kakao.keditor.plugin.pluginspec.blockquote;

import android.app.Activity;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.drawable;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.string;
import com.kakao.keditor.plugin.KeditorPluginType;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteItem;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItem;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemKt;
import com.kakao.keditor.plugin.pluginspec.PluginSpec.DefaultImpls;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.CreateBlockQuoteItem;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.util.eventbus.ViewRequest.ReplaceItems;
import com.kakao.keditor.widget.KeditorEditText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorPluginType(type = "blockquote")
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010+\u001A\b\u0012\u0004\u0012\u00020,0\u00192\u0006\u0010-\u001A\u00020\u0004H\u0016J\u0010\u0010.\u001A\u00020/2\u0006\u00100\u001A\u000201H\u0016J\b\u00102\u001A\u00020/H\u0016R\u001E\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0096\u000E¢\u0006\u0010\n\u0002\u0010\t\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001C\u0010\n\u001A\u0004\u0018\u00010\u000BX\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001E\u0010\u0010\u001A\u0004\u0018\u00010\u0004X\u0096\u000E¢\u0006\u0010\n\u0002\u0010\t\u001A\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001A\u0010\u0013\u001A\u00020\u0004X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001A\n\u0012\u0004\u0012\u00020\u001A\u0018\u00010\u0019X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\u001C\u0010\u001F\u001A\u0004\u0018\u00010 X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001C\u0010%\u001A\u0004\u0018\u00010&X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*¨\u00063"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/blockquote/BlockQuotePluginSpec;", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "()V", "contextMenuDescription", "", "getContextMenuDescription", "()Ljava/lang/Integer;", "setContextMenuDescription", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "contextMenuIcon", "Landroid/view/View;", "getContextMenuIcon", "()Landroid/view/View;", "setContextMenuIcon", "(Landroid/view/View;)V", "contextMenuResource", "getContextMenuResource", "setContextMenuResource", "editorId", "getEditorId", "()I", "setEditorId", "(I)V", "itemSpecKeys", "", "", "getItemSpecKeys", "()Ljava/util/List;", "setItemSpecKeys", "(Ljava/util/List;)V", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "getItemSpecs", "()Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "setItemSpecs", "(Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;)V", "toolbarOverlayMenuItem", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "getToolbarOverlayMenuItem", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;", "setToolbarOverlayMenuItem", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuItem;)V", "createKeditorItems", "Lcom/kakao/keditor/KeditorItem;", "focusPosition", "onRequest", "", "request", "Lcom/kakao/keditor/util/eventbus/PluginSpecRequest;", "runIconClick", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BlockQuotePluginSpec implements PluginSpec {
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
    private ToolbarOverlayMenuItem toolbarOverlayMenuItem;

    public BlockQuotePluginSpec() {
        this.itemSpecKeys = k.listOf("blockquote");
        this.toolbarOverlayMenuItem = new ToolbarOverlayMenuItem(id.ke_overlay_blockquote, drawable.ke_toolbar_btn_menu_item_block_quote, string.cd_add_quote, string.plugin_more_quote, null, 16, null);
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
        List list0 = new ArrayList();
        ItemSpecs itemSpecs0 = this.getItemSpecs();
        if(itemSpecs0 != null) {
            RootItemSpec rootItemSpec0 = itemSpecs0.byType("blockquote");
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

    @Override  // com.kakao.keditor.plugin.pluginspec.RequestHandler
    public void onRequest(@NotNull PluginSpecRequest pluginSpecRequest0) {
        Intrinsics.checkNotNullParameter(pluginSpecRequest0, "request");
        if(pluginSpecRequest0 instanceof CreateBlockQuoteItem) {
            if(((CreateBlockQuoteItem)pluginSpecRequest0).getItem() != null) {
                ParagraphItem paragraphItem0 = ((CreateBlockQuoteItem)pluginSpecRequest0).getItem();
                Intrinsics.checkNotNull(paragraphItem0);
                int v = pluginSpecRequest0.getFocusedPosition();
                Triple triple0 = ParagraphItemKt.splitText(paragraphItem0);
                ArrayList arrayList0 = new ArrayList();
                if(((SpannableStringBuilder)triple0.getFirst()) != null) {
                    Object object0 = triple0.getFirst();
                    Intrinsics.checkNotNull(object0);
                    ParagraphItem paragraphItem1 = new ParagraphItem(((Spannable)object0), false, false, 6, null);
                    paragraphItem1.setAlignment(paragraphItem0.getAlignment());
                    paragraphItem1.setParagraphStyle(paragraphItem0.getParagraphStyle());
                    arrayList0.add(paragraphItem1);
                    ++v;
                }
                BlockQuoteItem blockQuoteItem0 = new BlockQuoteItem(true);
                blockQuoteItem0.setText(((SpannableStringBuilder)triple0.getSecond()));
                blockQuoteItem0.setUseDefaultStyle(true);
                blockQuoteItem0.setSelectionStart(((SpannableStringBuilder)triple0.getSecond()).length());
                blockQuoteItem0.setSelectionEnd(blockQuoteItem0.getSelectionStart());
                arrayList0.add(blockQuoteItem0);
                SpannableStringBuilder spannableStringBuilder0 = (SpannableStringBuilder)triple0.getThird();
                if(spannableStringBuilder0 == null) {
                    spannableStringBuilder0 = new SpannableStringBuilder("");
                }
                ParagraphItem paragraphItem2 = new ParagraphItem(spannableStringBuilder0, false, false, 6, null);
                paragraphItem2.setAlignment(paragraphItem0.getAlignment());
                paragraphItem2.setParagraphStyle(paragraphItem0.getParagraphStyle());
                arrayList0.add(paragraphItem2);
                ReplaceItems viewRequest$ReplaceItems0 = new ReplaceItems(pluginSpecRequest0.getFocusedPosition(), arrayList0, v, false, 8, null);
                KeEvent.INSTANCE.postInScope(viewRequest$ReplaceItems0);
                return;
            }
            AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(k.listOf(new BlockQuoteItem(true)), 0, false, false, 10, null);
            KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
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
        AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(DefaultImpls.createKeditorItems$default(this, 0, 1, null), 0, false, true, 2, null);
        KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
        Keditor.clickEvent$default(Keditor.INSTANCE, "moremenu", "blockquote", null, 4, null);
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

