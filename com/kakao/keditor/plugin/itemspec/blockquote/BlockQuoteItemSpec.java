package com.kakao.keditor.plugin.itemspec.blockquote;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.StringRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.room.a;
import com.kakao.keditor.BR;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.R.string;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.databinding.KeItemBlockQuoteBinding;
import com.kakao.keditor.databinding.KeToolbarBlockquoteMenuBinding;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment.Left;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.text.CharacterSize;
import com.kakao.keditor.plugin.attrs.text.ColorType;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.attrs.text.ParagraphStyle;
import com.kakao.keditor.plugin.attrs.text.spans.KeBackgroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeBoldSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeForegroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeItalicSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeStrikethroughSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeTypefaceSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeURLSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeUnderlineSpan;
import com.kakao.keditor.plugin.attrs.text.spans.Selection;
import com.kakao.keditor.plugin.attrs.text.spans.SpanUtil;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.grammarcheck.ClearGrammarError;
import com.kakao.keditor.plugin.itemspec.grammarcheck.HighlightGrammarError;
import com.kakao.keditor.plugin.itemspec.grammarcheck.ReplaceText;
import com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener.DefaultImpls;
import com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener;
import com.kakao.keditor.plugin.itemspec.paragraph.CommonTextStyle.Bold;
import com.kakao.keditor.plugin.itemspec.paragraph.CommonTextStyle.Italic;
import com.kakao.keditor.plugin.itemspec.paragraph.CommonTextStyle.Strikethrough;
import com.kakao.keditor.plugin.itemspec.paragraph.CommonTextStyle.Underline;
import com.kakao.keditor.plugin.itemspec.paragraph.GrammarCheckTextItem;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItem;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphPluginExtKt;
import com.kakao.keditor.plugin.itemspec.paragraph.TextItem;
import com.kakao.keditor.plugin.itemspec.paragraph.overlay.ColorPickerOverlayMenu;
import com.kakao.keditor.plugin.itemspec.paragraph.overlay.FontStyleOverlayMenu;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetFont;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetStyle;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextBackgroundColor;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextColor;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextLink;
import com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableParser;
import com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM;
import com.kakao.keditor.standard.EditTextStandardKt;
import com.kakao.keditor.standard.IntStandardKt;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.kakao.keditor.toolbar.category.OverlayCategory.MorePlugin;
import com.kakao.keditor.toolbar.category.OverlayCategory.TextBackgroundColor;
import com.kakao.keditor.toolbar.category.OverlayCategory.TextForegroundColor;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener;
import com.kakao.keditor.util.eventbus.ItemSpecRequest.TextSelectionChanged;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ToolbarRequest.HideSoftInputOverlay;
import com.kakao.keditor.util.eventbus.ToolbarRequest.ShowSoftInputOverlay;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshPosition;
import com.kakao.keditor.util.eventbus.ViewRequest.ReplaceItems;
import com.kakao.keditor.util.eventbus.ViewRequest.ScrollToSpecificTextIndex;
import com.kakao.keditor.util.eventbus.ViewRequest;
import com.kakao.keditor.widget.KeditorEditText.SelectionChangeListener;
import com.kakao.keditor.widget.KeditorEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "blockquote")
@Metadata(d1 = {"\u0000\u00B4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u001C\u0010+\u001A\u00020,2\b\u0010-\u001A\u0004\u0018\u00010.2\b\u0010/\u001A\u0004\u0018\u00010\u000BH\u0016J\u0010\u00100\u001A\u00020,2\u0006\u00101\u001A\u000202H\u0016J\b\u00103\u001A\u00020.H\u0016J\b\u00104\u001A\u000205H\u0002J\b\u00106\u001A\u000205H\u0002J\b\u00107\u001A\u000208H\u0016J\b\u00109\u001A\u00020:H\u0016J\u0010\u0010;\u001A\u00020,2\u0006\u0010<\u001A\u00020=H\u0002J(\u0010>\u001A\u00020,2\u0006\u0010/\u001A\u00020\u000B2\u0006\u0010-\u001A\u00020.2\u0006\u0010?\u001A\u00020\u00112\u0006\u0010@\u001A\u00020AH\u0016J\u001A\u0010B\u001A\u00020,2\b\u0010C\u001A\u0004\u0018\u00010\u000B2\u0006\u0010D\u001A\u00020EH\u0016J\u0018\u0010F\u001A\u00020\u000B2\u0006\u0010G\u001A\u00020H2\u0006\u0010I\u001A\u00020JH\u0016J\u0010\u0010K\u001A\u00020L2\u0006\u0010-\u001A\u00020\u0002H\u0014J,\u0010M\u001A\u00020\u00022\u0006\u00101\u001A\u0002022\u0006\u0010-\u001A\u00020L2\u0012\u0010N\u001A\u000E\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020P0OH\u0014J\"\u0010Q\u001A\u0004\u0018\u0001HR\"\u0006\b\u0000\u0010R\u0018\u0001*\b\u0012\u0004\u0012\u00020T0SH\u0082\b\u00A2\u0006\u0002\u0010UR\u001A\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\u00020\u000BX\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0016\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R&\u0010\u0019\u001A\u0014\u0012\u0004\u0012\u00020\u001B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0\u00060\u001AX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u001DR\u001A\u0010\u001E\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010\u0013\"\u0004\b \u0010\u0015R\u001A\u0010!\u001A\u00020\"X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001E\u0010\'\u001A\u00020\u00118\u0006@\u0006X\u0087\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u000E\u0010*\u001A\u00020\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000\u00A8\u0006V"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "childValidators", "", "Lcom/kakao/keditor/plugin/itemspec/ItemValidator;", "getChildValidators", "()Ljava/util/Set;", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarBlockquoteMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarBlockquoteMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarBlockquoteMenuBinding;)V", "placeholderRes", "getPlaceholderRes", "setPlaceholderRes", "policy", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "createContextMenu", "context", "Landroid/content/Context;", "createKeditorItem", "fontSizeDefault", "", "fontSizeStyle1", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "menuBindingSelectionChange", "selectionChanged", "Lcom/kakao/keditor/util/eventbus/ItemSpecRequest$TextSelectionChanged;", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onRenderingRequest", "itemView", "request", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "find", "T", "", "Landroid/text/style/CharacterStyle;", "(Ljava/util/List;)Ljava/lang/Object;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlockQuoteItemSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockQuoteItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteItemSpec\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 Keditor.kt\ncom/kakao/keditor/Keditor\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n329#1:410\n329#1:412\n329#1:414\n1#2:363\n1#2:411\n1#2:413\n1#2:415\n65#3,16:364\n93#3,3:380\n136#4,12:383\n1747#5,3:395\n1747#5,3:398\n1747#5,3:401\n1747#5,3:404\n1747#5,3:407\n*S KotlinDebug\n*F\n+ 1 BlockQuoteItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteItemSpec\n*L\n318#1:410\n321#1:412\n324#1:414\n318#1:411\n321#1:413\n324#1:415\n141#1:364,16\n141#1:380,3\n146#1:383,12\n313#1:395,3\n314#1:398,3\n315#1:401,3\n316#1:404,3\n317#1:407,3\n*E\n"})
public final class BlockQuoteItemSpec extends RootItemSpec implements HasItemDecoration {
    @NotNull
    private final Set childValidators;
    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    @NotNull
    private final Map knownEnumValues;
    private int layout;
    public KeToolbarBlockquoteMenuBinding menuBinding;
    @StringRes
    private int placeholderRes;
    private int policy;

    public BlockQuoteItemSpec() {
        this.placeholderRes = string.common_input_hint;
        this.knownEnumValues = w.mapOf(TuplesKt.to("style", BlockQuoteType.Companion.typeSet()));
        this.childValidators = ItemValidatorKt.getTEXT_ITEMS_VALIDATOR();
        this.layout = layout.ke_item_block_quote;
        this.policy = 2;
        this.contextMenulayout = layout.ke_toolbar_blockquote_menu;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        if(keditorItem0 instanceof BlockQuoteItem && view0 != null) {
            ViewDataBinding viewDataBinding0 = DataBindingUtil.bind(view0);
            Intrinsics.checkNotNull(viewDataBinding0);
            ((KeItemBlockQuoteBinding)viewDataBinding0).keItemEdit.setSelection(((BlockQuoteItem)keditorItem0).getSelectionStart(), ((BlockQuoteItem)keditorItem0).getSelectionEnd());
            this.getMenuBinding().setBlockquote(((BlockQuoteItem)keditorItem0));
            this.getMenuBinding().setTextMenuListener(new TextMenuClickListener() {
                private final void blockQuoteToParagraphItem(BlockQuoteItem blockQuoteItem0) {
                    int v = keditorItem0.indexOf(blockQuoteItem0);
                    ParagraphItem paragraphItem0 = new ParagraphItem(blockQuoteItem0.getText(), true, false, 4, null);
                    paragraphItem0.setSelectionStart(blockQuoteItem0.getText().length());
                    paragraphItem0.setSelectionEnd(paragraphItem0.getSelectionStart());
                    paragraphItem0.setParagraphStyle(ParagraphStyle.ParagraphStyle5);
                    ReplaceItems viewRequest$ReplaceItems0 = new ReplaceItems(v, k.listOf(paragraphItem0), v, false, 8, null);
                    KeEvent.INSTANCE.postInScope(viewRequest$ReplaceItems0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "blockquote-toolbar", "remove", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onAlignmentClicked(@NotNull Alignment alignment0) {
                    DefaultImpls.onAlignmentClicked(this, alignment0);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onBackMenuClicked() {
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onBlockQuoteClicked() {
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onBlockQuoteTypeClicked(@NotNull String s) {
                    Intrinsics.checkNotNullParameter(s, "blockQuoteType");
                    BlockQuoteType blockQuoteType0 = BlockQuoteTypeKt.toBlockQuoteType(s);
                    BlockQuoteItem blockQuoteItem0 = keditorItem0.getMenuBinding().getBlockquote();
                    if(blockQuoteType0.equals((blockQuoteItem0 == null ? null : blockQuoteItem0.getStyle()))) {
                        this.blockQuoteToParagraphItem(((BlockQuoteItem)((KeItemBlockQuoteBinding)viewDataBinding0)));
                        return;
                    }
                    ((BlockQuoteItem)((KeItemBlockQuoteBinding)viewDataBinding0)).setStyle(blockQuoteType0.name());
                    ((BlockQuoteItem)((KeItemBlockQuoteBinding)viewDataBinding0)).setHasPendingFocus(true);
                    keditorItem0.getMenuBinding().setBlockquote(((BlockQuoteItem)((KeItemBlockQuoteBinding)viewDataBinding0)));
                    RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(keditorItem0.indexOf(((KeItemBlockQuoteBinding)viewDataBinding0)));
                    KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "blockquote-toolbar", ((BlockQuoteItem)((KeItemBlockQuoteBinding)viewDataBinding0)).getStyle(), null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onBoldClicked() {
                    Intrinsics.checkNotNullExpressionValue(this.$targetView.keItemEdit, "keItemEdit");
                    SetStyle setStyle0 = new SetStyle(Bold.INSTANCE);
                    setStyle0.setFocusedItem(((KeItemBlockQuoteBinding)viewDataBinding0));
                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(this.$targetView.keItemEdit, setStyle0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "blockquote-toolbar", "bold", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onColorPickerClicked(@Nullable ColorType colorType0, int v) {
                    TextForegroundColor overlayCategory$TextForegroundColor0 = v == 0 ? TextForegroundColor.INSTANCE : TextBackgroundColor.INSTANCE;
                    if(Intrinsics.areEqual(keditorItem0.getMenuBinding().getActiveOverlayCategory(), overlayCategory$TextForegroundColor0)) {
                        keditorItem0.getMenuBinding().setActiveOverlayCategory(null);
                        KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                    }
                    else {
                        Context context0 = keditorItem0.getMenuBinding().getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                        ShowSoftInputOverlay toolbarRequest$ShowSoftInputOverlay0 = new ShowSoftInputOverlay(new ColorPickerOverlayMenu(context0, null, 0, 0, colorType0, new ToolbarOverlayMenuClickedListener() {
                            public void onOverlayMenuClicked(@NotNull ColorType colorType0) {
                                Intrinsics.checkNotNullParameter(colorType0, "colorType");
                                int v = Color.parseColor(colorType0.getColorCode());
                                int v1 = BlockQuoteItemSpec.this;
                                if(v1 == 0) {
                                    this.$targetView.getMenuBinding().setTextColor(colorType0);
                                    Intrinsics.checkNotNullExpressionValue(this.$item.keItemEdit, "keItemEdit");
                                    SetTextColor setTextColor0 = new SetTextColor(v);
                                    setTextColor0.setFocusedItem(this.$item);
                                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(this.$item.keItemEdit, setTextColor0);
                                }
                                else if(v1 == 1) {
                                    this.$targetView.getMenuBinding().setTextBackgroundColor(colorType0);
                                    Intrinsics.checkNotNullExpressionValue(this.$item.keItemEdit, "keItemEdit");
                                    SetTextBackgroundColor setTextBackgroundColor0 = new SetTextBackgroundColor(v);
                                    setTextBackgroundColor0.setFocusedItem(this.$item);
                                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(this.$item.keItemEdit, setTextBackgroundColor0);
                                }
                                KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                                this.$targetView.getMenuBinding().setActiveOverlayCategory(null);
                            }

                            @Override  // com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener
                            public void onOverlayMenuClicked(Object object0) {
                                this.onOverlayMenuClicked(((ColorType)object0));
                            }
                        }, 14, null), overlayCategory$TextForegroundColor0, false, 4, null);
                        KeEvent.INSTANCE.postInScope(toolbarRequest$ShowSoftInputOverlay0);
                        keditorItem0.getMenuBinding().setActiveOverlayCategory(overlayCategory$TextForegroundColor0);
                    }
                    Keditor.clickEvent$default(Keditor.INSTANCE, "blockquote-toolbar", (v == 0 ? "colorPalette" : "backColorPalette"), null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onFontStyleClicked(@NotNull FontStyle fontStyle0) {
                    Intrinsics.checkNotNullParameter(fontStyle0, "fontStyle");
                    com.kakao.keditor.toolbar.category.OverlayCategory.FontStyle overlayCategory$FontStyle0 = com.kakao.keditor.toolbar.category.OverlayCategory.FontStyle.INSTANCE;
                    if(Intrinsics.areEqual(keditorItem0.getMenuBinding().getActiveOverlayCategory(), overlayCategory$FontStyle0)) {
                        keditorItem0.getMenuBinding().setActiveOverlayCategory(null);
                        KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                    }
                    else {
                        Context context0 = keditorItem0.getMenuBinding().getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                        ShowSoftInputOverlay toolbarRequest$ShowSoftInputOverlay0 = new ShowSoftInputOverlay(new FontStyleOverlayMenu(context0, null, 0, 0, fontStyle0, new ToolbarOverlayMenuClickedListener() {
                            public void onOverlayMenuClicked(@NotNull FontStyle fontStyle0) {
                                Intrinsics.checkNotNullParameter(fontStyle0, "fontStyle");
                                this.$targetView.getMenuBinding().setFontStyle(fontStyle0);
                                Intrinsics.checkNotNullExpressionValue(this.$item.keItemEdit, "keItemEdit");
                                Context context0 = this.$targetView.getMenuBinding().getRoot().getContext();
                                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                                SetFont setFont0 = new SetFont(fontStyle0.getFamilyName(), fontStyle0.getTypeface(context0));
                                setFont0.setFocusedItem(this.$item);
                                ParagraphPluginExtKt.handleCommonTextRenderingRequest(this.$item.keItemEdit, setFont0);
                                KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                                this.$targetView.getMenuBinding().setActiveOverlayCategory(null);
                                Context context1 = this.$targetView.getMenuBinding().getRoot().getContext();
                                Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
                                String s = fontStyle0.getDescription(context1);
                                Keditor.INSTANCE.clickEvent("blockquote-toolbar", "font", s);
                            }

                            @Override  // com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener
                            public void onOverlayMenuClicked(Object object0) {
                                this.onOverlayMenuClicked(((FontStyle)object0));
                            }
                        }, 14, null), overlayCategory$FontStyle0, false, 4, null);
                        KeEvent.INSTANCE.postInScope(toolbarRequest$ShowSoftInputOverlay0);
                        keditorItem0.getMenuBinding().setActiveOverlayCategory(overlayCategory$FontStyle0);
                    }
                    Keditor.clickEvent$default(Keditor.INSTANCE, "blockquote-toolbar", "font", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onItalicClicked() {
                    Intrinsics.checkNotNullExpressionValue(this.$targetView.keItemEdit, "keItemEdit");
                    SetStyle setStyle0 = new SetStyle(Italic.INSTANCE);
                    setStyle0.setFocusedItem(((KeItemBlockQuoteBinding)viewDataBinding0));
                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(this.$targetView.keItemEdit, setStyle0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "blockquote-toolbar", "italic", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onLinkTextClicked() {
                    Intrinsics.checkNotNullExpressionValue(this.$targetView.keItemEdit, "keItemEdit");
                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(this.$targetView.keItemEdit, SetTextLink.INSTANCE);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "blockquote-toolbar", "link", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onListClicked() {
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onListTypeClicked(@NotNull String s) {
                    DefaultImpls.onListTypeClicked(this, s);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onParagraphSizeClicked(@NotNull ParagraphStyle paragraphStyle0) {
                    DefaultImpls.onParagraphSizeClicked(this, paragraphStyle0);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onRemoveMenuClicked() {
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onStrikeClicked() {
                    Intrinsics.checkNotNullExpressionValue(this.$targetView.keItemEdit, "keItemEdit");
                    SetStyle setStyle0 = new SetStyle(Strikethrough.INSTANCE);
                    setStyle0.setFocusedItem(((KeItemBlockQuoteBinding)viewDataBinding0));
                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(this.$targetView.keItemEdit, setStyle0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "blockquote-toolbar", "strikethrough", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onTableStylePickerClicked(@NotNull String s) {
                    DefaultImpls.onTableStylePickerClicked(this, s);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onTextSizeClicked(@NotNull CharacterSize characterSize0) {
                    DefaultImpls.onTextSizeClicked(this, characterSize0);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onUnderlineClicked() {
                    Intrinsics.checkNotNullExpressionValue(this.$targetView.keItemEdit, "keItemEdit");
                    SetStyle setStyle0 = new SetStyle(Underline.INSTANCE);
                    setStyle0.setFocusedItem(((KeItemBlockQuoteBinding)viewDataBinding0));
                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(this.$targetView.keItemEdit, setStyle0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "blockquote-toolbar", "underline", null, 4, null);
                }
            });
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void createContextMenu(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), this.getContextMenulayout(), null, false);
        ((KeToolbarBlockquoteMenuBinding)viewDataBinding0).setActiveOverlayCategory(MorePlugin.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "apply(...)");
        this.setMenuBinding(((KeToolbarBlockquoteMenuBinding)viewDataBinding0));
        View view0 = this.getMenuBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setContextMenuLayoutView(view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    @NotNull
    public KeditorItem createKeditorItem() {
        KeditorItem keditorItem0 = new BlockQuoteItem(false, 1, null);
        ((BlockQuoteItem)keditorItem0).setHasPendingFocus(true);
        return keditorItem0;
    }

    private final Object find(List list0) {
        for(Object object0: list0) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if(((CharacterStyle)object0) == null) {
                continue;
            }
            Intrinsics.reifiedOperationMarker(2, "T");
            return object0;
        }
        Intrinsics.reifiedOperationMarker(2, "T");
        return null;
    }

    // 去混淆评级： 低(30)
    private final float fontSizeDefault() {
        return IntStandardKt.containsFlag(this.policy, 2) ? ((float)CharacterSize.size16.getFontSize()) : ((float)ParagraphStyle.ParagraphStyle5.getFontSize());
    }

    // 去混淆评级： 低(30)
    private final float fontSizeStyle1() {
        return IntStandardKt.containsFlag(this.policy, 2) ? ((float)CharacterSize.size18.getFontSize()) : ((float)ParagraphStyle.ParagraphStyle4.getFontSize());
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemSpec
    @NotNull
    public Set getChildValidators() {
        return this.childValidators;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    @NotNull
    public ViewDataBinding getContextMenuBinding() {
        return this.getMenuBinding();
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    @NotNull
    public View getContextMenuLayoutView() {
        View view0 = this.contextMenuLayoutView;
        if(view0 != null) {
            return view0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contextMenuLayoutView");
        return null;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public int getContextMenulayout() {
        return this.contextMenulayout;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public int getEditorId() {
        return this.editorId;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemSpec
    @NotNull
    public Map getKnownEnumValues() {
        return this.knownEnumValues;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public int getLayout() {
        return this.layout;
    }

    @NotNull
    public final KeToolbarBlockquoteMenuBinding getMenuBinding() {
        KeToolbarBlockquoteMenuBinding keToolbarBlockquoteMenuBinding0 = this.menuBinding;
        if(keToolbarBlockquoteMenuBinding0 != null) {
            return keToolbarBlockquoteMenuBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuBinding");
        return null;
    }

    public final int getPlaceholderRes() {
        return this.placeholderRes;
    }

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    @NotNull
    public ItemDecoration itemDecoration() {
        return BlockQuoteItemDecoration.INSTANCE;
    }

    private final void menuBindingSelectionChange(TextSelectionChanged itemSpecRequest$TextSelectionChanged0) {
        ColorType colorType1;
        ColorType colorType0;
        FontStyle fontStyle0;
        Object object6;
        if(itemSpecRequest$TextSelectionChanged0.hasLength()) {
            this.getMenuBinding().setVariable(BR.displayMenu, Boolean.TRUE);
        }
        boolean z = false;
        KeToolbarBlockquoteMenuBinding keToolbarBlockquoteMenuBinding0 = this.getMenuBinding();
        Iterable iterable0 = itemSpecRequest$TextSelectionChanged0.getSpans();
        boolean z1 = true;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object0: iterable0) {
                if(((CharacterStyle)object0) instanceof KeBoldSpan) {
                    z = true;
                    break;
                }
            }
        }
        boolean z2 = false;
        keToolbarBlockquoteMenuBinding0.setIsActiveBold(z);
        KeToolbarBlockquoteMenuBinding keToolbarBlockquoteMenuBinding1 = this.getMenuBinding();
        Iterable iterable1 = itemSpecRequest$TextSelectionChanged0.getSpans();
        if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
            for(Object object1: iterable1) {
                if(((CharacterStyle)object1) instanceof KeItalicSpan) {
                    z2 = true;
                    break;
                }
            }
        }
        boolean z3 = false;
        keToolbarBlockquoteMenuBinding1.setIsActiveItalic(z2);
        KeToolbarBlockquoteMenuBinding keToolbarBlockquoteMenuBinding2 = this.getMenuBinding();
        Iterable iterable2 = itemSpecRequest$TextSelectionChanged0.getSpans();
        if(!(iterable2 instanceof Collection) || !((Collection)iterable2).isEmpty()) {
            for(Object object2: iterable2) {
                if(((CharacterStyle)object2) instanceof KeUnderlineSpan) {
                    z3 = true;
                    break;
                }
            }
        }
        boolean z4 = false;
        keToolbarBlockquoteMenuBinding2.setIsActiveUnderLine(z3);
        KeToolbarBlockquoteMenuBinding keToolbarBlockquoteMenuBinding3 = this.getMenuBinding();
        Iterable iterable3 = itemSpecRequest$TextSelectionChanged0.getSpans();
        if(!(iterable3 instanceof Collection) || !((Collection)iterable3).isEmpty()) {
            for(Object object3: iterable3) {
                if(((CharacterStyle)object3) instanceof KeStrikethroughSpan) {
                    z4 = true;
                    break;
                }
            }
        }
        keToolbarBlockquoteMenuBinding3.setIsActiveStrike(z4);
        KeToolbarBlockquoteMenuBinding keToolbarBlockquoteMenuBinding4 = this.getMenuBinding();
        Iterable iterable4 = itemSpecRequest$TextSelectionChanged0.getSpans();
        if(!(iterable4 instanceof Collection) || !((Collection)iterable4).isEmpty()) {
            for(Object object4: iterable4) {
                if(!(((CharacterStyle)object4) instanceof KeURLSpan)) {
                    continue;
                }
                goto label_52;
            }
        }
        z1 = false;
    label_52:
        Object object5 = null;
        keToolbarBlockquoteMenuBinding4.setIsActiveLink(z1);
        KeToolbarBlockquoteMenuBinding keToolbarBlockquoteMenuBinding5 = this.getMenuBinding();
        Iterator iterator5 = itemSpecRequest$TextSelectionChanged0.getSpans().iterator();
        while(true) {
            object6 = null;
            if(!iterator5.hasNext()) {
                break;
            }
            Object object7 = iterator5.next();
            if(((CharacterStyle)object7) instanceof KeTypefaceSpan) {
                object5 = object7;
                break;
            }
        }
        if(!(object5 instanceof KeTypefaceSpan)) {
            object5 = null;
        }
        if(((KeTypefaceSpan)object5) == null) {
            fontStyle0 = FontStyle.SYSTEM;
        }
        else {
            String s = ((KeTypefaceSpan)object5).getFamily();
            if(s == null) {
                fontStyle0 = FontStyle.SYSTEM;
            }
            else {
                fontStyle0 = FontStyle.Companion.getResIdByName(s);
                if(fontStyle0 == null) {
                    fontStyle0 = FontStyle.SYSTEM;
                }
            }
        }
        Object object8 = null;
        keToolbarBlockquoteMenuBinding5.setFontStyle(fontStyle0);
        KeToolbarBlockquoteMenuBinding keToolbarBlockquoteMenuBinding6 = this.getMenuBinding();
        for(Object object9: itemSpecRequest$TextSelectionChanged0.getSpans()) {
            if(((CharacterStyle)object9) instanceof KeForegroundColorSpan) {
                object8 = object9;
                break;
            }
        }
        if(!(object8 instanceof KeForegroundColorSpan)) {
            object8 = null;
        }
        if(((KeForegroundColorSpan)object8) == null) {
            colorType0 = ColorType.CLEAR;
        }
        else {
            int v = ((KeForegroundColorSpan)object8).getForegroundColor();
            colorType0 = ColorType.Companion.byLightModeColor(v);
            if(colorType0 == null) {
                colorType0 = ColorType.CLEAR;
            }
        }
        Object object10 = null;
        keToolbarBlockquoteMenuBinding6.setTextColor(colorType0);
        KeToolbarBlockquoteMenuBinding keToolbarBlockquoteMenuBinding7 = this.getMenuBinding();
        for(Object object11: itemSpecRequest$TextSelectionChanged0.getSpans()) {
            if(((CharacterStyle)object11) instanceof KeBackgroundColorSpan) {
                object10 = object11;
                break;
            }
        }
        if(object10 instanceof KeBackgroundColorSpan) {
            object6 = object10;
        }
        if(((KeBackgroundColorSpan)object6) == null) {
            colorType1 = ColorType.CLEAR;
        }
        else {
            int v1 = ((KeBackgroundColorSpan)object6).getBackgroundColor();
            colorType1 = ColorType.Companion.byLightModeColor(v1);
            if(colorType1 == null) {
                colorType1 = ColorType.CLEAR;
            }
        }
        keToolbarBlockquoteMenuBinding7.setTextBackgroundColor(colorType1);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemBlockQuoteBinding keItemBlockQuoteBinding0 = (KeItemBlockQuoteBinding)DataBindingUtil.bind(view0);
        if(keItemBlockQuoteBinding0 != null) {
            KeditorEditText keditorEditText0 = keItemBlockQuoteBinding0.keItemEdit;
            if(keditorEditText0 != null) {
                keditorEditText0.setText(((BlockQuoteItem)keditorItem0).getText());
                BlockQuoteType blockQuoteType0 = BlockQuoteTypeKt.toBlockQuoteType(((BlockQuoteItem)keditorItem0).getStyle());
                keditorEditText0.setTypeface(blockQuoteType0.getDefaultFontStyle().getTypeface(Keditor.INSTANCE.getContext()));
                blockQuoteType0.applyQuoteType(keditorEditText0, keItemBlockQuoteBinding0.quoteImage);
                keditorEditText0.setTextSize(2, (Intrinsics.areEqual(((BlockQuoteItem)keditorItem0).getStyle(), "style1") ? this.fontSizeStyle1() : this.fontSizeDefault()));
                if(!IntStandardKt.containsFlag(keditorState0.getState(), 2) && !IntStandardKt.containsFlag(keditorState0.getState(), 4)) {
                    EditTextStandardKt.restoreFocus(keditorEditText0, ((TextItem)keditorItem0));
                }
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public void onRenderingRequest(@Nullable View view0, @NotNull ViewRequest viewRequest0) {
        Intrinsics.checkNotNullParameter(viewRequest0, "request");
        if(view0 == null) {
            return;
        }
        KeItemBlockQuoteBinding keItemBlockQuoteBinding0 = (KeItemBlockQuoteBinding)DataBindingUtil.bind(view0);
        if(keItemBlockQuoteBinding0 != null) {
            BlockQuoteItem blockQuoteItem0 = null;
            KeditorEditText keditorEditText0 = keItemBlockQuoteBinding0.keItemEdit;
            if(keditorEditText0 != null) {
                if(viewRequest0 instanceof ScrollToSpecificTextIndex) {
                    this.renderEditTextScrollToOffset(keditorEditText0, ((ScrollToSpecificTextIndex)viewRequest0).getOffset());
                    return;
                }
                if(viewRequest0 instanceof ReplaceText) {
                    GrammarCheckTextItem grammarCheckTextItem0 = ((ReplaceText)viewRequest0).getItem();
                    if(grammarCheckTextItem0 instanceof BlockQuoteItem) {
                        blockQuoteItem0 = (BlockQuoteItem)grammarCheckTextItem0;
                    }
                    if(blockQuoteItem0 != null) {
                        blockQuoteItem0.getText().replace(((ReplaceText)viewRequest0).getStart(), ((ReplaceText)viewRequest0).getEnd(), ((ReplaceText)viewRequest0).getChangeText());
                    }
                }
                else if(viewRequest0 instanceof HighlightGrammarError) {
                    GrammarCheckTextItem grammarCheckTextItem1 = ((HighlightGrammarError)viewRequest0).getGrammarError().getItem();
                    if(grammarCheckTextItem1 instanceof BlockQuoteItem) {
                        blockQuoteItem0 = (BlockQuoteItem)grammarCheckTextItem1;
                    }
                    if(blockQuoteItem0 != null) {
                        blockQuoteItem0.setKeGrammarSpan(blockQuoteItem0.getText(), ((HighlightGrammarError)viewRequest0).getGrammarError().getStartIndex(), ((HighlightGrammarError)viewRequest0).getGrammarError().getLength(), ((HighlightGrammarError)viewRequest0).isFocused(), ((HighlightGrammarError)viewRequest0).getOnClickAction(), Keditor.INSTANCE.getContext());
                        RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(this.indexOf(blockQuoteItem0));
                        KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
                    }
                }
                else if(viewRequest0 instanceof ClearGrammarError) {
                    GrammarCheckTextItem grammarCheckTextItem2 = ((ClearGrammarError)viewRequest0).getGrammarError().getItem();
                    if(grammarCheckTextItem2 instanceof BlockQuoteItem) {
                        blockQuoteItem0 = (BlockQuoteItem)grammarCheckTextItem2;
                    }
                    if(blockQuoteItem0 != null) {
                        blockQuoteItem0.clearKeGrammarSpansIn(blockQuoteItem0.getText(), ((ClearGrammarError)viewRequest0).getGrammarError().getStartIndex(), ((ClearGrammarError)viewRequest0).getGrammarError().getLength());
                        RefreshPosition viewRequest$RefreshPosition1 = new RefreshPosition(this.indexOf(blockQuoteItem0));
                        KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition1);
                    }
                }
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Boolean boolean1;
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        KeItemBlockQuoteBinding keItemBlockQuoteBinding0 = (KeItemBlockQuoteBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false);
        keItemBlockQuoteBinding0.keItemEdit.setHint(this.placeholderRes);
        com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteItemSpec.onViewCreated.1.1 blockQuoteItemSpec$onViewCreated$1$10 = new SelectionChangeListener() {
            @Override  // com.kakao.keditor.widget.KeditorEditText$SelectionChangeListener
            public void selectedChanged(@NotNull KeditorEditText keditorEditText0, int v, int v1) {
                Intrinsics.checkNotNullParameter(keditorEditText0, "editText");
                View view0 = keItemBlockQuoteBinding0.keItemEdit.getRoot();
                Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                BlockQuoteItem blockQuoteItem0 = (BlockQuoteItem)keItemBlockQuoteBinding0.getItem(view0);
                if(blockQuoteItem0 != null && !blockQuoteItem0.getHasPendingFocus()) {
                    blockQuoteItem0.setSelectionStart(v);
                    blockQuoteItem0.setSelectionEnd(v1);
                }
                Editable editable0 = keditorEditText0.getText();
                if(editable0 == null) {
                    return;
                }
                BlockQuoteItemSpec blockQuoteItemSpec0 = keItemBlockQuoteBinding0;
                Selection selection0 = new Selection(v, v1);
                Iterable iterable0 = SpanUtil.INSTANCE.getSpans(editable0, selection0);
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    int v2 = editable0.getSpanStart(((CharacterStyle)object0));
                    if(v2 <= v && (v2 != v || v != v1 || v == 0)) {
                        arrayList0.add(object0);
                    }
                }
                List list0 = CollectionsKt___CollectionsKt.toMutableList(arrayList0);
                this.$this_with.updateSpanListWith(list0, this.$this_with.getPendingRequestSpans());
                List list1 = CollectionsKt___CollectionsKt.toList(list0);
                Alignment alignment0 = blockQuoteItem0 == null ? Left.INSTANCE : blockQuoteItem0.getAlignment();
                blockQuoteItemSpec0.menuBindingSelectionChange(new TextSelectionChanged(list1, editable0, alignment0, v, v1));
            }
        };
        keItemBlockQuoteBinding0.keItemEdit.setOnSelectionChanged(blockQuoteItemSpec$onViewCreated$1$10);
        Intrinsics.checkNotNullExpressionValue(keItemBlockQuoteBinding0.keItemEdit, "keItemEdit");
        com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteItemSpec.onViewCreated..inlined.addTextChangedListener.default.1 blockQuoteItemSpec$onViewCreated$$inlined$addTextChangedListener$default$10 = new TextWatcher() {
            @Override  // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable0) {
                View view0 = this.$binding$inlined.getRoot();
                Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteItemSpec.onViewCreated.2.1 blockQuoteItemSpec$onViewCreated$2$10 = new com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteItemSpec.onViewCreated.2.1(editable0);
                keItemBlockQuoteBinding0.ifFoundItem(view0, blockQuoteItemSpec$onViewCreated$2$10);
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
            }
        };
        keItemBlockQuoteBinding0.keItemEdit.addTextChangedListener(blockQuoteItemSpec$onViewCreated$$inlined$addTextChangedListener$default$10);
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = this.getEditorId();
        Boolean boolean0 = null;
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)a.g(keditor0, integer0)).containsKey("set_keyboard_suggestion_off")) {
            Object object1 = keditor0.getConfig().get("set_keyboard_suggestion_off");
            if(!(object1 instanceof Boolean)) {
                object1 = null;
            }
            boolean1 = (Boolean)object1;
        }
        else {
            Object object0 = ((Map)a.g(keditor0, integer0)).get("set_keyboard_suggestion_off");
            if(!(object0 instanceof Boolean)) {
                object0 = null;
            }
            boolean1 = (Boolean)object0;
        }
        if(boolean1 != null) {
            boolean0 = boolean1;
        }
        if(Intrinsics.areEqual(boolean0, Boolean.TRUE)) {
            keItemBlockQuoteBinding0.keItemEdit.setSuggestionOff();
        }
        View view0 = keItemBlockQuoteBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        return view0;

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/plugin/itemspec/blockquote/BlockQuoteItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteItemSpec.onViewCreated.2.1 extends Lambda implements Function1 {
            final Editable $text;

            public com.kakao.keditor.plugin.itemspec.blockquote.BlockQuoteItemSpec.onViewCreated.2.1(Editable editable0) {
                this.$text = editable0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((BlockQuoteItem)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull BlockQuoteItem blockQuoteItem0) {
                Intrinsics.checkNotNullParameter(blockQuoteItem0, "it");
                Intrinsics.checkNotNull(this.$text, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                blockQuoteItem0.setText(((SpannableStringBuilder)this.$text));
            }
        }

    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public void setContextMenuLayoutView(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<set-?>");
        this.contextMenuLayoutView = view0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public void setContextMenulayout(int v) {
        this.contextMenulayout = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public void setEditorId(int v) {
        this.editorId = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public void setLayout(int v) {
        this.layout = v;
    }

    public final void setMenuBinding(@NotNull KeToolbarBlockquoteMenuBinding keToolbarBlockquoteMenuBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarBlockquoteMenuBinding0, "<set-?>");
        this.menuBinding = keToolbarBlockquoteMenuBinding0;
    }

    public final void setPlaceholderRes(int v) {
        this.placeholderRes = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((BlockQuoteItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull BlockQuoteItem blockQuoteItem0) {
        Intrinsics.checkNotNullParameter(blockQuoteItem0, "item");
        Item cDM$Item0 = new Item("blockquote", x.mutableMapOf(new Pair[]{TuplesKt.to("style", blockQuoteItem0.getValueOrBypass("style", blockQuoteItem0.getStyle()))}), null, 4, null);
        return SpannableToCDM.INSTANCE.generate(cDM$Item0, blockQuoteItem0.getText());
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public BlockQuoteItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        BlockQuoteItem blockQuoteItem0 = new BlockQuoteItem(false, 1, null);
        blockQuoteItem0.setText(SpannableParser.INSTANCE.parseTextModel(context0, cDM$Item0));
        blockQuoteItem0.setStyle(this.popValueOrDefault(map0, "style", "blockquotetype$style1", true));
        return blockQuoteItem0;
    }
}

