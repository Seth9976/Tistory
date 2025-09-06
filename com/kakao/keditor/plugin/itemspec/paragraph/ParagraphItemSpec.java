package com.kakao.keditor.plugin.itemspec.paragraph;

import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
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
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.R.string;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.databinding.KeItemParagraphBinding;
import com.kakao.keditor.databinding.KeToolbarTextEditMenuBinding;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment.Left;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.AlignmentType.Text;
import com.kakao.keditor.plugin.attrs.text.CharacterSize;
import com.kakao.keditor.plugin.attrs.text.ColorType;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.attrs.text.ParagraphStyle;
import com.kakao.keditor.plugin.attrs.text.spans.KeBackgroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeBoldSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeFontSizeSpan;
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
import com.kakao.keditor.plugin.itemspec.paragraph.overlay.ColorPickerOverlayMenu;
import com.kakao.keditor.plugin.itemspec.paragraph.overlay.FontStyleOverlayMenu;
import com.kakao.keditor.plugin.itemspec.paragraph.overlay.ParagraphSizeOverlayMenu;
import com.kakao.keditor.plugin.itemspec.paragraph.overlay.TextSizeOverlayMenu;
import com.kakao.keditor.plugin.itemspec.paragraph.request.NextAlignment;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetFont;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetStyle;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextBackgroundColor;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextColor;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextLink;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextSize;
import com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableParser;
import com.kakao.keditor.plugin.itemspec.paragraph.span.SpannableToCDM;
import com.kakao.keditor.standard.EditTextStandardKt;
import com.kakao.keditor.standard.IntStandardKt;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.kakao.keditor.standard.TextStandardKt;
import com.kakao.keditor.toolbar.category.OverlayCategory.MorePlugin;
import com.kakao.keditor.toolbar.category.OverlayCategory.TextBackgroundColor;
import com.kakao.keditor.toolbar.category.OverlayCategory.TextForegroundColor;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener;
import com.kakao.keditor.util.eventbus.ItemSpecRequest.FocusCategory;
import com.kakao.keditor.util.eventbus.ItemSpecRequest.TextSelectionChanged;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.CreateBlockQuoteItem;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.CreateOpenGraphItem;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.CreateTextListItem;
import com.kakao.keditor.util.eventbus.ToolbarRequest.HideSoftInputOverlay;
import com.kakao.keditor.util.eventbus.ToolbarRequest.ShowSoftInputOverlay;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.util.eventbus.ViewRequest.InsertKeditorItem;
import com.kakao.keditor.util.eventbus.ViewRequest.MergeText;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshPosition;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveFocusItem;
import com.kakao.keditor.util.eventbus.ViewRequest.RequestFocus;
import com.kakao.keditor.util.eventbus.ViewRequest.ScrollToSpecificTextIndex;
import com.kakao.keditor.util.eventbus.ViewRequest;
import com.kakao.keditor.widget.KeditorEditText.SelectionChangeListener;
import com.kakao.keditor.widget.KeditorEditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "paragraph")
@Metadata(d1 = {"\u0000\u00C2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u001C\u0010,\u001A\u00020-2\b\u0010.\u001A\u0004\u0018\u00010/2\b\u00100\u001A\u0004\u0018\u00010\u000BH\u0016J \u00101\u001A\u00020-2\u0006\u00100\u001A\u00020\u000B2\u0006\u00102\u001A\u00020\u00112\u0006\u00103\u001A\u000204H\u0002J,\u00105\u001A\u0004\u0018\u0001H6\"\u0006\b\u0000\u00106\u0018\u00012\u0006\u00107\u001A\u00020\u001B2\n\b\u0002\u00108\u001A\u0004\u0018\u0001H6H\u0086\b\u00A2\u0006\u0002\u00109J\u0010\u0010:\u001A\u00020-2\u0006\u0010;\u001A\u00020<H\u0016J\b\u0010=\u001A\u00020/H\u0016J\b\u0010>\u001A\u00020?H\u0016J\b\u0010@\u001A\u00020AH\u0002J\b\u0010B\u001A\u00020CH\u0016J\u0010\u0010D\u001A\u00020-2\u0006\u0010E\u001A\u00020FH\u0002J(\u0010G\u001A\u00020-2\u0006\u00100\u001A\u00020\u000B2\u0006\u0010.\u001A\u00020/2\u0006\u00102\u001A\u00020\u00112\u0006\u00103\u001A\u000204H\u0016J\u001A\u0010H\u001A\u00020-2\b\u0010I\u001A\u0004\u0018\u00010\u000B2\u0006\u0010J\u001A\u00020KH\u0016J\u0018\u0010L\u001A\u00020\u000B2\u0006\u0010M\u001A\u00020N2\u0006\u0010O\u001A\u00020PH\u0016J\u0018\u0010Q\u001A\n S*\u0004\u0018\u00010R0R2\u0006\u00100\u001A\u00020\u000BH\u0002J2\u0010T\u001A\u00020\u00022\b\u0010.\u001A\u0004\u0018\u00010\u00022\u0006\u0010U\u001A\u00020R2\u0006\u00102\u001A\u00020\u00112\u0006\u0010V\u001A\u00020W2\u0006\u0010X\u001A\u00020\u0011H\u0002J\u0010\u0010Y\u001A\u00020Z2\u0006\u0010.\u001A\u00020\u0002H\u0014J,\u0010[\u001A\u00020\u00022\u0006\u0010;\u001A\u00020<2\u0006\u0010.\u001A\u00020Z2\u0012\u0010\\\u001A\u000E\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020^0]H\u0014J\u0010\u0010_\u001A\u00020A2\u0006\u0010`\u001A\u00020\u001BH\u0016J\"\u0010a\u001A\u0004\u0018\u0001H6\"\u0006\b\u0000\u00106\u0018\u0001*\b\u0012\u0004\u0012\u00020c0bH\u0082\b\u00A2\u0006\u0002\u0010dR\u001A\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\u00020\u000BX\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0016\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R&\u0010\u0019\u001A\u0014\u0012\u0004\u0012\u00020\u001B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0\u00060\u001AX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u001DR\u001A\u0010\u001E\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010\u0013\"\u0004\b \u0010\u0015R\u001A\u0010!\u001A\u00020\"X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001E\u0010\'\u001A\u00020\u00118\u0006@\u0006X\u0087\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u0014\u0010*\u001A\u00020\u00118BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b+\u0010\u0013\u00A8\u0006e"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "childValidators", "", "Lcom/kakao/keditor/plugin/itemspec/ItemValidator;", "getChildValidators", "()Ljava/util/Set;", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarTextEditMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarTextEditMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarTextEditMenuBinding;)V", "placeholderRes", "getPlaceholderRes", "setPlaceholderRes", "policy", "getPolicy", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "checkedIsEmptyFirstItem", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "config", "T", "key", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "createContextMenu", "context", "Landroid/content/Context;", "createKeditorItem", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "isEnabledOpenGraph", "", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "menuBindingSelectionChange", "selectionChanged", "Lcom/kakao/keditor/util/eventbus/ItemSpecRequest$TextSelectionChanged;", "onItemBound", "onRenderingRequest", "itemView", "request", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "paragraphEdit", "Lcom/kakao/keditor/widget/KeditorEditText;", "kotlin.jvm.PlatformType", "split", "keditorEditText", "s", "", "splitIndex", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "typeOf", "type", "find", "", "Landroid/text/style/CharacterStyle;", "(Ljava/util/List;)Ljava/lang/Object;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nParagraphItemSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItemSpec\n+ 2 Keditor.kt\ncom/kakao/keditor/Keditor\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,528:1\n191#1:548\n191#1:556\n492#1:580\n492#1:582\n492#1:584\n492#1:586\n136#2,12:529\n141#2,7:541\n141#2,7:549\n141#2,7:557\n1#3:564\n1#3:581\n1#3:583\n1#3:585\n1#3:587\n1747#4,3:565\n1747#4,3:568\n1747#4,3:571\n1747#4,3:574\n1747#4,3:577\n*S KotlinDebug\n*F\n+ 1 ParagraphItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItemSpec\n*L\n196#1:548\n200#1:556\n477#1:580\n480#1:582\n483#1:584\n486#1:586\n186#1:529,12\n191#1:541,7\n196#1:549,7\n200#1:557,7\n477#1:581\n480#1:583\n483#1:585\n486#1:587\n472#1:565,3\n473#1:568,3\n474#1:571,3\n475#1:574,3\n476#1:577,3\n*E\n"})
public final class ParagraphItemSpec extends RootItemSpec implements HasItemDecoration {
    @NotNull
    private final Set childValidators;
    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    @NotNull
    private final Map knownEnumValues;
    private int layout;
    public KeToolbarTextEditMenuBinding menuBinding;
    @StringRes
    private int placeholderRes;

    public ParagraphItemSpec() {
        this.placeholderRes = string.common_input_hint;
        this.childValidators = ItemValidatorKt.getTEXT_ITEMS_VALIDATOR();
        this.knownEnumValues = x.mapOf(new Pair[]{TuplesKt.to("textAlign", Alignment.Companion.textTypeSet()), TuplesKt.to("size", ParagraphStyle.Companion.typeSet())});
        this.layout = layout.ke_item_paragraph;
        this.contextMenulayout = layout.ke_toolbar_text_edit_menu;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        if(keditorItem0 instanceof ParagraphItem && view0 != null) {
            ViewDataBinding viewDataBinding0 = DataBindingUtil.bind(view0);
            Intrinsics.checkNotNull(viewDataBinding0);
            ((KeItemParagraphBinding)viewDataBinding0).keParagraphEdit.setSelection(((ParagraphItem)keditorItem0).getSelectionStart(), ((ParagraphItem)keditorItem0).getSelectionEnd());
            this.getMenuBinding().setParagraphStyle(((ParagraphItem)keditorItem0).getParagraphStyle());
            this.getMenuBinding().setTextMenuListener(new TextMenuClickListener() {
                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onAlignmentClicked(@NotNull Alignment alignment0) {
                    Intrinsics.checkNotNullParameter(alignment0, "alignment");
                    Intrinsics.checkNotNullExpressionValue(keditorItem0.keParagraphEdit, "keParagraphEdit");
                    NextAlignment nextAlignment0 = new NextAlignment();
                    nextAlignment0.setFocusedItem(this.$item);
                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorItem0.keParagraphEdit, nextAlignment0);
                    view0.getMenuBinding().setAlignment(((ParagraphItem)this.$item).getAlignment());
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", "alignment", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onBackMenuClicked() {
                    FocusCategory itemSpecRequest$FocusCategory0 = new FocusCategory(null, null, 3, null);
                    KeEvent.INSTANCE.postInScope(itemSpecRequest$FocusCategory0);
                    KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", "back", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onBlockQuoteClicked() {
                    CreateBlockQuoteItem pluginSpecRequest$CreateBlockQuoteItem0 = new CreateBlockQuoteItem(view0.indexOf(this.$item), ((ParagraphItem)this.$item));
                    KeEvent.INSTANCE.postInScope(pluginSpecRequest$CreateBlockQuoteItem0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", "blockquote", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onBlockQuoteTypeClicked(@NotNull String s) {
                    DefaultImpls.onBlockQuoteTypeClicked(this, s);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onBoldClicked() {
                    Intrinsics.checkNotNullExpressionValue(keditorItem0.keParagraphEdit, "keParagraphEdit");
                    SetStyle setStyle0 = new SetStyle(Bold.INSTANCE);
                    setStyle0.setFocusedItem(this.$item);
                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorItem0.keParagraphEdit, setStyle0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", "bold", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onColorPickerClicked(@Nullable ColorType colorType0, int v) {
                    TextForegroundColor overlayCategory$TextForegroundColor0 = v == 0 ? TextForegroundColor.INSTANCE : TextBackgroundColor.INSTANCE;
                    if(Intrinsics.areEqual(view0.getMenuBinding().getActiveOverlayCategory(), overlayCategory$TextForegroundColor0)) {
                        view0.getMenuBinding().setActiveOverlayCategory(null);
                        KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                    }
                    else {
                        Context context0 = view0.getMenuBinding().getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                        ShowSoftInputOverlay toolbarRequest$ShowSoftInputOverlay0 = new ShowSoftInputOverlay(new ColorPickerOverlayMenu(context0, null, 0, 0, colorType0, new ToolbarOverlayMenuClickedListener() {
                            public void onOverlayMenuClicked(@NotNull ColorType colorType0) {
                                Intrinsics.checkNotNullParameter(colorType0, "colorType");
                                int v = Color.parseColor(colorType0.getColorCode());
                                int v1 = ParagraphItemSpec.this;
                                if(v1 == 0) {
                                    this.$targetView.getMenuBinding().setTextColor(colorType0);
                                    Intrinsics.checkNotNullExpressionValue(this.$item.keParagraphEdit, "keParagraphEdit");
                                    SetTextColor setTextColor0 = new SetTextColor(v);
                                    setTextColor0.setFocusedItem(this.$item);
                                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(this.$item.keParagraphEdit, setTextColor0);
                                }
                                else if(v1 == 1) {
                                    this.$targetView.getMenuBinding().setTextBackgroundColor(colorType0);
                                    Intrinsics.checkNotNullExpressionValue(this.$item.keParagraphEdit, "keParagraphEdit");
                                    SetTextBackgroundColor setTextBackgroundColor0 = new SetTextBackgroundColor(v);
                                    setTextBackgroundColor0.setFocusedItem(this.$item);
                                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(this.$item.keParagraphEdit, setTextBackgroundColor0);
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
                        view0.getMenuBinding().setActiveOverlayCategory(overlayCategory$TextForegroundColor0);
                    }
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", (v == 0 ? "colorPalette" : "backColorPalette"), null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onFontStyleClicked(@NotNull FontStyle fontStyle0) {
                    Intrinsics.checkNotNullParameter(fontStyle0, "fontStyle");
                    com.kakao.keditor.toolbar.category.OverlayCategory.FontStyle overlayCategory$FontStyle0 = com.kakao.keditor.toolbar.category.OverlayCategory.FontStyle.INSTANCE;
                    if(Intrinsics.areEqual(view0.getMenuBinding().getActiveOverlayCategory(), overlayCategory$FontStyle0)) {
                        view0.getMenuBinding().setActiveOverlayCategory(null);
                        KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                    }
                    else {
                        Context context0 = view0.getMenuBinding().getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                        ShowSoftInputOverlay toolbarRequest$ShowSoftInputOverlay0 = new ShowSoftInputOverlay(new FontStyleOverlayMenu(context0, null, 0, 0, fontStyle0, new ToolbarOverlayMenuClickedListener() {
                            public void onOverlayMenuClicked(@NotNull FontStyle fontStyle0) {
                                Intrinsics.checkNotNullParameter(fontStyle0, "fontStyle");
                                this.$targetView.getMenuBinding().setFontStyle(fontStyle0);
                                Intrinsics.checkNotNullExpressionValue(this.$item.keParagraphEdit, "keParagraphEdit");
                                Context context0 = this.$targetView.getMenuBinding().getRoot().getContext();
                                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                                SetFont setFont0 = new SetFont(fontStyle0.getFamilyName(), fontStyle0.getTypeface(context0));
                                setFont0.setFocusedItem(this.$item);
                                ParagraphPluginExtKt.handleCommonTextRenderingRequest(this.$item.keParagraphEdit, setFont0);
                                KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                                this.$targetView.getMenuBinding().setActiveOverlayCategory(null);
                            }

                            @Override  // com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener
                            public void onOverlayMenuClicked(Object object0) {
                                this.onOverlayMenuClicked(((FontStyle)object0));
                            }
                        }, 14, null), overlayCategory$FontStyle0, false, 4, null);
                        KeEvent.INSTANCE.postInScope(toolbarRequest$ShowSoftInputOverlay0);
                        view0.getMenuBinding().setActiveOverlayCategory(overlayCategory$FontStyle0);
                        Context context1 = view0.getMenuBinding().getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
                        String s = fontStyle0.getDescription(context1);
                        Keditor.INSTANCE.clickEvent("paragraph-toolbar", "font", s);
                    }
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", "font", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onItalicClicked() {
                    Intrinsics.checkNotNullExpressionValue(keditorItem0.keParagraphEdit, "keParagraphEdit");
                    SetStyle setStyle0 = new SetStyle(Italic.INSTANCE);
                    setStyle0.setFocusedItem(this.$item);
                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorItem0.keParagraphEdit, setStyle0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", "italic", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onLinkTextClicked() {
                    Intrinsics.checkNotNullExpressionValue(keditorItem0.keParagraphEdit, "keParagraphEdit");
                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorItem0.keParagraphEdit, SetTextLink.INSTANCE);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", "link", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onListClicked() {
                    CreateTextListItem pluginSpecRequest$CreateTextListItem0 = new CreateTextListItem(view0.indexOf(this.$item), ((ParagraphItem)this.$item));
                    KeEvent.INSTANCE.postInScope(pluginSpecRequest$CreateTextListItem0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", "textlist", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onListTypeClicked(@NotNull String s) {
                    DefaultImpls.onListTypeClicked(this, s);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onParagraphSizeClicked(@NotNull ParagraphStyle paragraphStyle0) {
                    Intrinsics.checkNotNullParameter(paragraphStyle0, "inputStyle");
                    com.kakao.keditor.toolbar.category.OverlayCategory.ParagraphStyle overlayCategory$ParagraphStyle0 = com.kakao.keditor.toolbar.category.OverlayCategory.ParagraphStyle.INSTANCE;
                    if(Intrinsics.areEqual(view0.getMenuBinding().getActiveOverlayCategory(), overlayCategory$ParagraphStyle0)) {
                        view0.getMenuBinding().setActiveOverlayCategory(null);
                        KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                    }
                    else {
                        Context context0 = view0.getMenuBinding().getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                        ShowSoftInputOverlay toolbarRequest$ShowSoftInputOverlay0 = new ShowSoftInputOverlay(new ParagraphSizeOverlayMenu(context0, null, 0, 0, paragraphStyle0, new ToolbarOverlayMenuClickedListener() {
                            public void onOverlayMenuClicked(@NotNull ParagraphStyle paragraphStyle0) {
                                Intrinsics.checkNotNullParameter(paragraphStyle0, "toStyle");
                                com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.bind.1.onParagraphSizeClicked.overlay.1.onOverlayMenuClicked.1 paragraphItemSpec$bind$1$onParagraphSizeClicked$overlay$1$onOverlayMenuClicked$10 = new Function1(this.$view, paragraphStyle0) {
                                    final ParagraphStyle $toStyle;
                                    final View $view;

                                    {
                                        ParagraphItemSpec.this = paragraphItemSpec0;
                                        this.$view = view0;
                                        this.$toStyle = paragraphStyle0;
                                        super(1);
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        this.invoke(((Number)object0).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(int v) {
                                        ParagraphItem paragraphItem0 = (ParagraphItem)ParagraphItemSpec.this.getItem(this.$view);
                                        if(paragraphItem0 != null) {
                                            ParagraphItemSpec.this.getMenuBinding().setParagraphStyle(this.$toStyle);
                                            Triple triple0 = ParagraphItemKt.splitText(paragraphItem0);
                                            ParagraphStyle paragraphStyle0 = paragraphItem0.getParagraphStyle();
                                            Alignment alignment0 = paragraphItem0.getAlignment();
                                            paragraphItem0.getText().clearSpans();
                                            paragraphItem0.updateText(((SpannableStringBuilder)triple0.getSecond()));
                                            paragraphItem0.setHeadingType(this.$toStyle.isHead());
                                            paragraphItem0.setParagraphStyle(this.$toStyle);
                                            KeEvent keEvent0 = KeEvent.INSTANCE;
                                            keEvent0.postInScope(new RefreshPosition(v));
                                            Object object0 = triple0.getFirst();
                                            if(((SpannableStringBuilder)object0) != null) {
                                                ParagraphItem paragraphItem1 = new ParagraphItem(((SpannableStringBuilder)object0), false, false, 6, null);
                                                paragraphItem1.setAlignment(alignment0);
                                                paragraphItem1.setParagraphStyle(paragraphStyle0);
                                                paragraphItem1.setHeadingType(paragraphStyle0.isHead());
                                                keEvent0.postInScope(new InsertKeditorItem(paragraphItem1, v, false, 4, null));
                                                ++v;
                                            }
                                            Object object1 = triple0.getThird();
                                            if(((SpannableStringBuilder)object1) != null) {
                                                ParagraphItem paragraphItem2 = new ParagraphItem(((SpannableStringBuilder)object1), false, false, 6, null);
                                                paragraphItem2.setAlignment(alignment0);
                                                paragraphItem2.setParagraphStyle(paragraphStyle0);
                                                paragraphItem2.setHeadingType(paragraphStyle0.isHead());
                                                keEvent0.postInScope(new InsertKeditorItem(paragraphItem2, v + 1, false, 4, null));
                                            }
                                            keEvent0.postInScope(new RequestFocus(v, true));
                                        }
                                    }
                                };
                                this.$view.ifFoundPosition(this.$view, paragraphItemSpec$bind$1$onParagraphSizeClicked$overlay$1$onOverlayMenuClicked$10);
                                KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                                this.$view.getMenuBinding().setActiveOverlayCategory(null);
                                Context context0 = this.$view.getMenuBinding().getRoot().getContext();
                                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                                String s = paragraphStyle0.getDescription(context0);
                                Keditor.INSTANCE.clickEvent("paragraph-toolbar", "style", s);
                            }

                            @Override  // com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener
                            public void onOverlayMenuClicked(Object object0) {
                                this.onOverlayMenuClicked(((ParagraphStyle)object0));
                            }
                        }, 14, null), overlayCategory$ParagraphStyle0, false, 4, null);
                        KeEvent.INSTANCE.postInScope(toolbarRequest$ShowSoftInputOverlay0);
                        view0.getMenuBinding().setActiveOverlayCategory(overlayCategory$ParagraphStyle0);
                    }
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", "style", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onRemoveMenuClicked() {
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onStrikeClicked() {
                    Intrinsics.checkNotNullExpressionValue(keditorItem0.keParagraphEdit, "keParagraphEdit");
                    SetStyle setStyle0 = new SetStyle(Strikethrough.INSTANCE);
                    setStyle0.setFocusedItem(this.$item);
                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorItem0.keParagraphEdit, setStyle0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", "strikethrough", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onTableStylePickerClicked(@NotNull String s) {
                    DefaultImpls.onTableStylePickerClicked(this, s);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onTextSizeClicked(@NotNull CharacterSize characterSize0) {
                    Intrinsics.checkNotNullParameter(characterSize0, "charactorSize");
                    com.kakao.keditor.toolbar.category.OverlayCategory.CharacterSize overlayCategory$CharacterSize0 = com.kakao.keditor.toolbar.category.OverlayCategory.CharacterSize.INSTANCE;
                    if(Intrinsics.areEqual(view0.getMenuBinding().getActiveOverlayCategory(), overlayCategory$CharacterSize0)) {
                        view0.getMenuBinding().setActiveOverlayCategory(null);
                        KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                    }
                    else {
                        Context context0 = view0.getMenuBinding().getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                        ShowSoftInputOverlay toolbarRequest$ShowSoftInputOverlay0 = new ShowSoftInputOverlay(new TextSizeOverlayMenu(context0, null, 0, 0, characterSize0, new ToolbarOverlayMenuClickedListener() {
                            public void onOverlayMenuClicked(@NotNull CharacterSize characterSize0) {
                                Intrinsics.checkNotNullParameter(characterSize0, "characterSize");
                                this.$targetView.getMenuBinding().setTextSize(characterSize0);
                                Intrinsics.checkNotNullExpressionValue(this.$item.keParagraphEdit, "keParagraphEdit");
                                SetTextSize setTextSize0 = new SetTextSize(characterSize0.sp());
                                setTextSize0.setFocusedItem(this.$item);
                                ParagraphPluginExtKt.handleCommonTextRenderingRequest(this.$item.keParagraphEdit, setTextSize0);
                                KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                                this.$targetView.getMenuBinding().setActiveOverlayCategory(null);
                                Context context0 = this.$targetView.getMenuBinding().getRoot().getContext();
                                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                                String s = characterSize0.getDescription(context0);
                                Keditor.INSTANCE.clickEvent("paragraph-toolbar", "size", s);
                            }

                            @Override  // com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener
                            public void onOverlayMenuClicked(Object object0) {
                                this.onOverlayMenuClicked(((CharacterSize)object0));
                            }
                        }, 14, null), overlayCategory$CharacterSize0, false, 4, null);
                        KeEvent.INSTANCE.postInScope(toolbarRequest$ShowSoftInputOverlay0);
                        view0.getMenuBinding().setActiveOverlayCategory(overlayCategory$CharacterSize0);
                    }
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", "size", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onUnderlineClicked() {
                    Intrinsics.checkNotNullExpressionValue(keditorItem0.keParagraphEdit, "keParagraphEdit");
                    SetStyle setStyle0 = new SetStyle(Underline.INSTANCE);
                    setStyle0.setFocusedItem(this.$item);
                    ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorItem0.keParagraphEdit, setStyle0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "paragraph-toolbar", "underline", null, 4, null);
                }
            });
        }
    }

    private final void checkedIsEmptyFirstItem(View view0, int v, KeditorState keditorState0) {
        KeditorEditText keditorEditText0 = this.paragraphEdit(view0);
        if(keditorEditText0.length() == 0 && v == 0 && keditorState0.getItemTotalCount() == 1) {
            keditorEditText0.setHint(this.placeholderRes);
            return;
        }
        keditorEditText0.setHint("");
    }

    public final Object config(String s, Object object0) {
        Object object1;
        Intrinsics.checkNotNullParameter(s, "key");
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = this.getEditorId();
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) != null && ((Map)a.g(keditor0, integer0)).containsKey(s)) {
            object1 = ((Map)a.g(keditor0, integer0)).get(s);
            Intrinsics.reifiedOperationMarker(2, "T");
            return object1 == null ? object0 : object1;
        }
        object1 = keditor0.getConfig().get(s);
        Intrinsics.reifiedOperationMarker(2, "T");
        return object1 == null ? object0 : object1;
    }

    public static Object config$default(ParagraphItemSpec paragraphItemSpec0, String s, Object object0, int v, Object object1) {
        Object object2;
        if((v & 2) != 0) {
            object0 = null;
        }
        Intrinsics.checkNotNullParameter(s, "key");
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = paragraphItemSpec0.getEditorId();
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) != null && ((Map)a.g(keditor0, integer0)).containsKey(s)) {
            object2 = ((Map)a.g(keditor0, integer0)).get(s);
            Intrinsics.reifiedOperationMarker(2, "T");
            return object2 == null ? object0 : object2;
        }
        object2 = keditor0.getConfig().get(s);
        Intrinsics.reifiedOperationMarker(2, "T");
        return object2 == null ? object0 : object2;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void createContextMenu(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), this.getContextMenulayout(), null, false);
        ((KeToolbarTextEditMenuBinding)viewDataBinding0).setActiveOverlayCategory(MorePlugin.INSTANCE);
        ((KeToolbarTextEditMenuBinding)viewDataBinding0).setIsTextSizeParagraphMode(IntStandardKt.containsFlag(this.getPolicy(), 1));
        ((KeToolbarTextEditMenuBinding)viewDataBinding0).setParagraphStyle(ParagraphStyle.ParagraphStyle5);
        ((KeToolbarTextEditMenuBinding)viewDataBinding0).setFontStyle(FontStyle.SYSTEM);
        ((KeToolbarTextEditMenuBinding)viewDataBinding0).setTextSize(CharacterSize.size23);
        ((KeToolbarTextEditMenuBinding)viewDataBinding0).setAlignment(Left.INSTANCE);
        ((KeToolbarTextEditMenuBinding)viewDataBinding0).setHasTextListItemSpec(this.hasItemSpec("list"));
        ((KeToolbarTextEditMenuBinding)viewDataBinding0).setHasBlockQuoteItemSpec(this.hasItemSpec("blockquote"));
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "apply(...)");
        this.setMenuBinding(((KeToolbarTextEditMenuBinding)viewDataBinding0));
        View view0 = this.getMenuBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setContextMenuLayoutView(view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    @NotNull
    public KeditorItem createKeditorItem() {
        return Companion.newInstance$default(ParagraphItem.Companion, false, false, 3, null);
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
    public final KeToolbarTextEditMenuBinding getMenuBinding() {
        KeToolbarTextEditMenuBinding keToolbarTextEditMenuBinding0 = this.menuBinding;
        if(keToolbarTextEditMenuBinding0 != null) {
            return keToolbarTextEditMenuBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuBinding");
        return null;
    }

    public final int getPlaceholderRes() {
        return this.placeholderRes;
    }

    private final int getPolicy() {
        Boolean boolean1;
        String s;
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = this.getEditorId();
        Object object0 = null;
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)a.g(keditor0, integer0)).containsKey("text_size_policy")) {
            Object object2 = keditor0.getConfig().get("text_size_policy");
            if(!(object2 instanceof String)) {
                object2 = null;
            }
            s = (String)object2;
        }
        else {
            Object object1 = ((Map)a.g(keditor0, integer0)).get("text_size_policy");
            if(!(object1 instanceof String)) {
                object1 = null;
            }
            s = (String)object1;
        }
        if(s == null) {
            s = "character";
        }
        int v = Intrinsics.areEqual(s, "character") ? 2 : 1;
        Boolean boolean0 = Boolean.FALSE;
        Integer integer1 = this.getEditorId();
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer1, null) == null || !((Map)a.g(keditor0, integer1)).containsKey("open_graph_enabled")) {
            Object object4 = keditor0.getConfig().get("open_graph_enabled");
            if(object4 instanceof Boolean) {
                object0 = object4;
            }
        }
        else {
            Object object3 = ((Map)a.g(keditor0, integer1)).get("open_graph_enabled");
            if(object3 instanceof Boolean) {
                object0 = object3;
            }
        }
        boolean1 = (Boolean)object0;
        if(boolean1 != null) {
            boolean0 = boolean1;
        }
        return Intrinsics.areEqual(boolean0, Boolean.TRUE) ? v | 4 : v;
    }

    // 去混淆评级： 低(20)
    private final boolean isEnabledOpenGraph() {
        return IntStandardKt.containsFlag(this.getPolicy(), 4) && this.hasItemSpec("opengraph");
    }

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    @NotNull
    public ItemDecoration itemDecoration() {
        return ParagraphItemDecorationPolicy.INSTANCE;
    }

    private final void menuBindingSelectionChange(TextSelectionChanged itemSpecRequest$TextSelectionChanged0) {
        ColorType colorType1;
        ColorType colorType0;
        CharacterSize characterSize0;
        FontStyle fontStyle0;
        Object object6;
        if(itemSpecRequest$TextSelectionChanged0.hasLength()) {
            this.getMenuBinding().setVariable(BR.displayMenu, Boolean.TRUE);
        }
        boolean z = false;
        KeToolbarTextEditMenuBinding keToolbarTextEditMenuBinding0 = this.getMenuBinding();
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
        keToolbarTextEditMenuBinding0.setIsActiveBold(z);
        KeToolbarTextEditMenuBinding keToolbarTextEditMenuBinding1 = this.getMenuBinding();
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
        keToolbarTextEditMenuBinding1.setIsActiveItalic(z2);
        KeToolbarTextEditMenuBinding keToolbarTextEditMenuBinding2 = this.getMenuBinding();
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
        keToolbarTextEditMenuBinding2.setIsActiveUnderLine(z3);
        KeToolbarTextEditMenuBinding keToolbarTextEditMenuBinding3 = this.getMenuBinding();
        Iterable iterable3 = itemSpecRequest$TextSelectionChanged0.getSpans();
        if(!(iterable3 instanceof Collection) || !((Collection)iterable3).isEmpty()) {
            for(Object object3: iterable3) {
                if(((CharacterStyle)object3) instanceof KeStrikethroughSpan) {
                    z4 = true;
                    break;
                }
            }
        }
        keToolbarTextEditMenuBinding3.setIsActiveStrike(z4);
        KeToolbarTextEditMenuBinding keToolbarTextEditMenuBinding4 = this.getMenuBinding();
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
        keToolbarTextEditMenuBinding4.setIsActiveLink(z1);
        KeToolbarTextEditMenuBinding keToolbarTextEditMenuBinding5 = this.getMenuBinding();
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
        keToolbarTextEditMenuBinding5.setFontStyle(fontStyle0);
        KeToolbarTextEditMenuBinding keToolbarTextEditMenuBinding6 = this.getMenuBinding();
        for(Object object9: itemSpecRequest$TextSelectionChanged0.getSpans()) {
            if(((CharacterStyle)object9) instanceof KeFontSizeSpan) {
                object8 = object9;
                break;
            }
        }
        if(!(object8 instanceof KeFontSizeSpan)) {
            object8 = null;
        }
        if(((KeFontSizeSpan)object8) == null) {
            characterSize0 = CharacterSize.size16;
        }
        else {
            int v = ((KeFontSizeSpan)object8).getSize();
            characterSize0 = CharacterSize.Companion.getTypeBySizeDP(v);
            if(characterSize0 == null) {
                characterSize0 = CharacterSize.size16;
            }
        }
        Object object10 = null;
        keToolbarTextEditMenuBinding6.setTextSize(characterSize0);
        KeToolbarTextEditMenuBinding keToolbarTextEditMenuBinding7 = this.getMenuBinding();
        for(Object object11: itemSpecRequest$TextSelectionChanged0.getSpans()) {
            if(((CharacterStyle)object11) instanceof KeForegroundColorSpan) {
                object10 = object11;
                break;
            }
        }
        if(!(object10 instanceof KeForegroundColorSpan)) {
            object10 = null;
        }
        if(((KeForegroundColorSpan)object10) == null) {
            colorType0 = ColorType.CLEAR;
        }
        else {
            int v1 = ((KeForegroundColorSpan)object10).getForegroundColor();
            colorType0 = ColorType.Companion.byLightModeColor(v1);
            if(colorType0 == null) {
                colorType0 = ColorType.CLEAR;
            }
        }
        Object object12 = null;
        keToolbarTextEditMenuBinding7.setTextColor(colorType0);
        KeToolbarTextEditMenuBinding keToolbarTextEditMenuBinding8 = this.getMenuBinding();
        for(Object object13: itemSpecRequest$TextSelectionChanged0.getSpans()) {
            if(((CharacterStyle)object13) instanceof KeBackgroundColorSpan) {
                object12 = object13;
                break;
            }
        }
        if(object12 instanceof KeBackgroundColorSpan) {
            object6 = object12;
        }
        if(((KeBackgroundColorSpan)object6) == null) {
            colorType1 = ColorType.CLEAR;
        }
        else {
            int v2 = ((KeBackgroundColorSpan)object6).getBackgroundColor();
            colorType1 = ColorType.Companion.byLightModeColor(v2);
            if(colorType1 == null) {
                colorType1 = ColorType.CLEAR;
            }
        }
        keToolbarTextEditMenuBinding8.setTextBackgroundColor(colorType1);
        this.getMenuBinding().setAlignment(itemSpecRequest$TextSelectionChanged0.getAlignment());
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.bind(view0);
        Intrinsics.checkNotNull(viewDataBinding0);
        ((ParagraphItem)keditorItem0).setDisableOnTextChanged(true);
        KeditorEditText keditorEditText0 = ((KeItemParagraphBinding)viewDataBinding0).keParagraphEdit;
        Intrinsics.checkNotNull(keditorEditText0);
        EditTextStandardKt.applyText(keditorEditText0, ((ParagraphItem)keditorItem0));
        EditTextStandardKt.applyAlignment(keditorEditText0, ((TextItem)keditorItem0));
        EditTextStandardKt.applyParagraphStyle(keditorEditText0, ((ParagraphItem)keditorItem0).getParagraphStyle());
        this.checkedIsEmptyFirstItem(keditorEditText0, v, keditorState0);
        if(!IntStandardKt.containsFlag(keditorState0.getState(), 2) && !IntStandardKt.containsFlag(keditorState0.getState(), 4)) {
            EditTextStandardKt.restoreFocus(keditorEditText0, ((TextItem)keditorItem0));
        }
        keditorEditText0.setOnKeyListener((View view0, int v, KeyEvent keyEvent0) -> {
            Intrinsics.checkNotNullParameter(keditorEditText0, "$keItemEdit");
            Intrinsics.checkNotNullParameter(this, "this$0");
            Intrinsics.checkNotNullParameter(((KeItemParagraphBinding)viewDataBinding0), "$binding");
            if(keyEvent0.getAction() == 0 && v == 67 && keditorEditText0.getSelectionStart() == 0 && keditorEditText0.getSelectionEnd() == 0) {
                View view1 = ((KeItemParagraphBinding)viewDataBinding0).getRoot();
                Intrinsics.checkNotNullExpressionValue(view1, "getRoot(...)");
                this.ifFoundPosition(view1, new com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onItemBound.1.1.1(keditorEditText0, this));
            }
            return false;
        });
        ((ParagraphItem)keditorItem0).setDisableOnTextChanged(false);

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onItemBound.1.1.1 extends Lambda implements Function1 {
            final KeditorEditText $keItemEdit;

            public com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onItemBound.1.1.1(KeditorEditText keditorEditText0, ParagraphItemSpec paragraphItemSpec0) {
                this.$keItemEdit = keditorEditText0;
                ParagraphItemSpec.this = paragraphItemSpec0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Number)object0).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int v) {
                int v1;
                if(v == 0) {
                    return;
                }
                if(this.$keItemEdit.length() == 0) {
                    KeditorView keditorView0 = ParagraphItemSpec.this.findKeditorView();
                    if(keditorView0 == null) {
                        v1 = 0;
                    }
                    else {
                        List list0 = keditorView0.allItems$keditor_release();
                        v1 = list0 == null ? 0 : list0.size();
                    }
                    if(v1 > 1) {
                        KeEvent.INSTANCE.postInScope(RemoveFocusItem.INSTANCE);
                    }
                }
                else {
                    MergeText viewRequest$MergeText0 = new MergeText(v, String.valueOf(this.$keItemEdit.getText()), v - 1);
                    KeEvent.INSTANCE.postInScope(viewRequest$MergeText0);
                }
            }
        }

    }

    // 检测为 Lambda 实现
    private static final boolean onItemBound$lambda$5$lambda$4(KeditorEditText keditorEditText0, ParagraphItemSpec paragraphItemSpec0, KeItemParagraphBinding keItemParagraphBinding0, View view0, int v, KeyEvent keyEvent0) [...]

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public void onRenderingRequest(@Nullable View view0, @NotNull ViewRequest viewRequest0) {
        Intrinsics.checkNotNullParameter(viewRequest0, "request");
        if(view0 == null) {
            return;
        }
        KeItemParagraphBinding keItemParagraphBinding0 = (KeItemParagraphBinding)DataBindingUtil.bind(view0);
        if(keItemParagraphBinding0 != null) {
            ParagraphItem paragraphItem0 = null;
            KeditorEditText keditorEditText0 = keItemParagraphBinding0.keParagraphEdit;
            if(keditorEditText0 != null) {
                if(viewRequest0 instanceof ScrollToSpecificTextIndex) {
                    this.renderEditTextScrollToOffset(keditorEditText0, ((ScrollToSpecificTextIndex)viewRequest0).getOffset());
                    return;
                }
                if(viewRequest0 instanceof ReplaceText) {
                    GrammarCheckTextItem grammarCheckTextItem0 = ((ReplaceText)viewRequest0).getItem();
                    if(grammarCheckTextItem0 instanceof ParagraphItem) {
                        paragraphItem0 = (ParagraphItem)grammarCheckTextItem0;
                    }
                    if(paragraphItem0 != null) {
                        paragraphItem0.getText().replace(((ReplaceText)viewRequest0).getStart(), ((ReplaceText)viewRequest0).getEnd(), ((ReplaceText)viewRequest0).getChangeText());
                    }
                }
                else if(viewRequest0 instanceof HighlightGrammarError) {
                    GrammarCheckTextItem grammarCheckTextItem1 = ((HighlightGrammarError)viewRequest0).getGrammarError().getItem();
                    if(grammarCheckTextItem1 instanceof ParagraphItem) {
                        paragraphItem0 = (ParagraphItem)grammarCheckTextItem1;
                    }
                    if(paragraphItem0 != null) {
                        paragraphItem0.setKeGrammarSpan(paragraphItem0.getText(), ((HighlightGrammarError)viewRequest0).getGrammarError().getStartIndex(), ((HighlightGrammarError)viewRequest0).getGrammarError().getLength(), ((HighlightGrammarError)viewRequest0).isFocused(), ((HighlightGrammarError)viewRequest0).getOnClickAction(), ((HighlightGrammarError)viewRequest0).getContext());
                        RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(this.indexOf(paragraphItem0));
                        KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
                    }
                }
                else if(viewRequest0 instanceof ClearGrammarError) {
                    GrammarCheckTextItem grammarCheckTextItem2 = ((ClearGrammarError)viewRequest0).getGrammarError().getItem();
                    if(grammarCheckTextItem2 instanceof ParagraphItem) {
                        paragraphItem0 = (ParagraphItem)grammarCheckTextItem2;
                    }
                    if(paragraphItem0 != null) {
                        paragraphItem0.clearKeGrammarSpansIn(paragraphItem0.getText(), ((ClearGrammarError)viewRequest0).getGrammarError().getStartIndex(), ((ClearGrammarError)viewRequest0).getGrammarError().getLength());
                        RefreshPosition viewRequest$RefreshPosition1 = new RefreshPosition(this.indexOf(paragraphItem0));
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
        KeItemParagraphBinding keItemParagraphBinding0 = (KeItemParagraphBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false);
        KeditorEditText keditorEditText0 = keItemParagraphBinding0.keParagraphEdit;
        Intrinsics.checkNotNullExpressionValue(keditorEditText0, "keParagraphEdit");
        View view0 = keItemParagraphBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        Boolean boolean0 = null;
        EditTextStandardKt.applyDefaultOnSelectionChanged$default(keditorEditText0, this, view0, null, 4, null);
        com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.1 paragraphItemSpec$onViewCreated$1$10 = new SelectionChangeListener() {
            @Override  // com.kakao.keditor.widget.KeditorEditText$SelectionChangeListener
            public void selectedChanged(@NotNull KeditorEditText keditorEditText0, int v, int v1) {
                Intrinsics.checkNotNullParameter(keditorEditText0, "editText");
                View view0 = keItemParagraphBinding0.keParagraphEdit.getRoot();
                Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                ParagraphItem paragraphItem0 = (ParagraphItem)keItemParagraphBinding0.getItem(view0);
                if(paragraphItem0 != null && !paragraphItem0.getHasPendingFocus()) {
                    paragraphItem0.setSelectionStart(v);
                    paragraphItem0.setSelectionEnd(v1);
                }
                Editable editable0 = keditorEditText0.getText();
                if(editable0 == null) {
                    return;
                }
                ParagraphItemSpec paragraphItemSpec0 = keItemParagraphBinding0;
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
                Alignment alignment0 = paragraphItem0 == null ? Left.INSTANCE : paragraphItem0.getAlignment();
                paragraphItemSpec0.menuBindingSelectionChange(new TextSelectionChanged(list1, editable0, alignment0, v, v1));
            }
        };
        keItemParagraphBinding0.keParagraphEdit.setOnSelectionChanged(paragraphItemSpec$onViewCreated$1$10);
        Intrinsics.checkNotNull(keItemParagraphBinding0.keParagraphEdit);
        com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2 paragraphItemSpec$onViewCreated$1$20 = new Function4(keItemParagraphBinding0, keItemParagraphBinding0.keParagraphEdit) {
            final KeItemParagraphBinding $binding;
            final KeditorEditText $this_with;

            {
                ParagraphItemSpec.this = paragraphItemSpec0;
                this.$binding = keItemParagraphBinding0;
                this.$this_with = keditorEditText0;
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                return this.invoke(((CharSequence)object0), ((Number)object1).intValue(), ((Number)object2).intValue(), ((Number)object3).intValue());
            }

            @Nullable
            public final Function1 invoke(@NotNull CharSequence charSequence0, int v, int v1, int v2) {
                Intrinsics.checkNotNullParameter(charSequence0, "text");
                BooleanRef ref$BooleanRef0 = new BooleanRef();
                View view0 = this.$binding.getRoot();
                Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.1 paragraphItemSpec$onViewCreated$1$2$10 = new Function1() {
                    final BooleanRef $isOnTextChangedDisabled;

                    {
                        this.$isOnTextChangedDisabled = ref$BooleanRef0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((ParagraphItem)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull ParagraphItem paragraphItem0) {
                        Intrinsics.checkNotNullParameter(paragraphItem0, "item");
                        this.$isOnTextChangedDisabled.element = paragraphItem0.getDisableOnTextChanged();
                    }
                };
                ParagraphItemSpec.this.ifFoundItem(view0, paragraphItemSpec$onViewCreated$1$2$10);
                if(ref$BooleanRef0.element) {
                    return com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.2.INSTANCE;
                }
                if(TextStandardKt.checkLineBreakInput(charSequence0, v, v2)) {
                    URLInfo uRLInfo0 = TextStandardKt.getUrlOrNull(charSequence0, this.$this_with.getSelectionEnd());
                    if(uRLInfo0 == null) {
                        View view1 = this.$binding.getRoot();
                        Intrinsics.checkNotNullExpressionValue(view1, "getRoot(...)");
                        com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.3 paragraphItemSpec$onViewCreated$1$2$30 = new Function1(v, v2, this.$this_with, charSequence0) {
                            final int $after;
                            final int $start;
                            final CharSequence $text;
                            final KeditorEditText $this_with;

                            {
                                ParagraphItemSpec.this = paragraphItemSpec0;
                                this.$start = v;
                                this.$after = v1;
                                this.$this_with = keditorEditText0;
                                this.$text = charSequence0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(((ParagraphItem)object0));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull ParagraphItem paragraphItem0) {
                                Intrinsics.checkNotNullParameter(paragraphItem0, "paragraphItem");
                                if(IntStandardKt.containsFlag(ParagraphItemSpec.this.getPolicy(), 1) && paragraphItem0.getParagraphStyle().isHead()) {
                                    int v = paragraphItem0.getText().length();
                                    if(this.$start + this.$after == v && !paragraphItem0.getDisableOnTextChanged()) {
                                        int v1 = this.$text.length();
                                        this.$this_with.delete(this.$start, v1);
                                        ParagraphItem paragraphItem1 = Companion.newInstance$default(ParagraphItem.Companion, true, false, 2, null);
                                        paragraphItem1.setAlignment(paragraphItem0.getAlignment());
                                        AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(k.listOf(paragraphItem1), 0, false, false, 14, null);
                                        KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
                                    }
                                }
                            }
                        };
                        ParagraphItemSpec.this.ifFoundItem(view1, paragraphItemSpec$onViewCreated$1$2$30);
                        return new Function1(this.$binding) {
                            final KeItemParagraphBinding $binding;

                            {
                                ParagraphItemSpec.this = paragraphItemSpec0;
                                this.$binding = keItemParagraphBinding0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(((Editable)object0));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Editable editable0) {
                                Intrinsics.checkNotNullParameter(editable0, "s");
                                View view0 = this.$binding.getRoot();
                                Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                                com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.6.1 paragraphItemSpec$onViewCreated$1$2$6$10 = new Function1() {
                                    final Editable $s;

                                    {
                                        this.$s = editable0;
                                        super(1);
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        this.invoke(((ParagraphItem)object0));
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull ParagraphItem paragraphItem0) {
                                        Intrinsics.checkNotNullParameter(paragraphItem0, "it");
                                        paragraphItem0.updateText(this.$s);
                                    }
                                };
                                ParagraphItemSpec.this.ifFoundItem(view0, paragraphItemSpec$onViewCreated$1$2$6$10);
                                View view1 = this.$binding.getRoot();
                                Intrinsics.checkNotNullExpressionValue(view1, "getRoot(...)");
                                com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.6.2 paragraphItemSpec$onViewCreated$1$2$6$20 = new Function1(this.$binding) {
                                    final KeItemParagraphBinding $binding;

                                    {
                                        ParagraphItemSpec.this = paragraphItemSpec0;
                                        this.$binding = keItemParagraphBinding0;
                                        super(1);
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        this.invoke(((Number)object0).intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(int v) {
                                        KeditorView keditorView0 = ParagraphItemSpec.this.findKeditorView();
                                        if(keditorView0 != null) {
                                            View view0 = this.$binding.getRoot();
                                            Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                                            KeditorState keditorState0 = keditorView0.getState$keditor_release();
                                            ParagraphItemSpec.this.checkedIsEmptyFirstItem(view0, v, keditorState0);
                                        }
                                    }
                                };
                                ParagraphItemSpec.this.ifFoundPosition(view1, paragraphItemSpec$onViewCreated$1$2$6$20);
                            }
                        };
                    }
                    Intrinsics.checkNotNullExpressionValue(this.$this_with, "$this_with");
                    int v3 = ParagraphItemSpec.this.isEnabledOpenGraph() ? -1 : 0;
                    EditTextStandardKt.addUrlSpan(this.$this_with, v - uRLInfo0.getUrlText().length(), v, uRLInfo0.getLinkUrl(), v3);
                    if(ParagraphItemSpec.this.isEnabledOpenGraph()) {
                        View view2 = this.$binding.getRoot();
                        Intrinsics.checkNotNullExpressionValue(view2, "getRoot(...)");
                        com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.4 paragraphItemSpec$onViewCreated$1$2$40 = new Function1(this.$binding, charSequence0, this.$this_with, uRLInfo0) {
                            final KeItemParagraphBinding $binding;
                            final CharSequence $text;
                            final KeditorEditText $this_with;
                            final URLInfo $urlInfo;

                            {
                                ParagraphItemSpec.this = paragraphItemSpec0;
                                this.$binding = keItemParagraphBinding0;
                                this.$text = charSequence0;
                                this.$this_with = keditorEditText0;
                                this.$urlInfo = uRLInfo0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(((ParagraphItem)object0));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull ParagraphItem paragraphItem0) {
                                Intrinsics.checkNotNullParameter(paragraphItem0, "paragraphItem");
                                if(!paragraphItem0.getDisableOnTextChanged()) {
                                    View view0 = this.$binding.getRoot();
                                    Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                                    com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.4.1 paragraphItemSpec$onViewCreated$1$2$4$10 = new Function1(this.$this_with, ParagraphItemSpec.this, paragraphItem0, this.$urlInfo) {
                                        final ParagraphItem $paragraphItem;
                                        final CharSequence $text;
                                        final KeditorEditText $this_with;
                                        final URLInfo $urlInfo;

                                        {
                                            this.$text = charSequence0;
                                            this.$this_with = keditorEditText0;
                                            ParagraphItemSpec.this = paragraphItemSpec0;
                                            this.$paragraphItem = paragraphItem0;
                                            this.$urlInfo = uRLInfo0;
                                            super(1);
                                        }

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            this.invoke(((Number)object0).intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(int v) {
                                            ParagraphItem paragraphItem0;
                                            int v1 = this.$this_with.getSelectionEnd();
                                            int v2 = StringsKt__StringsKt.lastIndexOf(this.$text, '\n', v1, false);
                                            if(v2 == -1) {
                                                paragraphItem0 = null;
                                            }
                                            else {
                                                Intrinsics.checkNotNullExpressionValue(this.$this_with, "$this_with");
                                                paragraphItem0 = ParagraphItemSpec.this.split(this.$paragraphItem, this.$this_with, v, this.$text, v2);
                                            }
                                            CreateOpenGraphItem pluginSpecRequest$CreateOpenGraphItem0 = new CreateOpenGraphItem(v, this.$urlInfo.getLinkUrl(), paragraphItem0);
                                            KeEvent.INSTANCE.postInScope(pluginSpecRequest$CreateOpenGraphItem0);
                                        }
                                    };
                                    ParagraphItemSpec.this.ifFoundPosition(view0, paragraphItemSpec$onViewCreated$1$2$4$10);
                                }
                            }
                        };
                        ParagraphItemSpec.this.ifFoundItem(view2, paragraphItemSpec$onViewCreated$1$2$40);
                        return new Function1(v, ParagraphItemSpec.this, this.$binding) {
                            final KeItemParagraphBinding $binding;
                            final int $start;
                            final CharSequence $text;

                            {
                                this.$text = charSequence0;
                                this.$start = v;
                                ParagraphItemSpec.this = paragraphItemSpec0;
                                this.$binding = keItemParagraphBinding0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(((Editable)object0));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull Editable editable0) {
                                Intrinsics.checkNotNullParameter(editable0, "s");
                                Character character0 = StringsKt___StringsKt.getOrNull(this.$text, this.$start);
                                if(character0 != null && TextStandardKt.isLineBreak(character0.charValue())) {
                                    editable0.delete(this.$start, this.$start + 1);
                                }
                                View view0 = this.$binding.getRoot();
                                Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                                com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.5.1 paragraphItemSpec$onViewCreated$1$2$5$10 = new Function1() {
                                    final Editable $s;

                                    {
                                        this.$s = editable0;
                                        super(1);
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        this.invoke(((ParagraphItem)object0));
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull ParagraphItem paragraphItem0) {
                                        Intrinsics.checkNotNullParameter(paragraphItem0, "it");
                                        paragraphItem0.updateText(this.$s);
                                    }
                                };
                                ParagraphItemSpec.this.ifFoundItem(view0, paragraphItemSpec$onViewCreated$1$2$5$10);
                            }
                        };
                    }
                }
                return new Function1(this.$binding) {
                    final KeItemParagraphBinding $binding;

                    {
                        ParagraphItemSpec.this = paragraphItemSpec0;
                        this.$binding = keItemParagraphBinding0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((Editable)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Editable editable0) {
                        Intrinsics.checkNotNullParameter(editable0, "s");
                        View view0 = this.$binding.getRoot();
                        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                        com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.6.1 paragraphItemSpec$onViewCreated$1$2$6$10 = new Function1() {
                            final Editable $s;

                            {
                                this.$s = editable0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(((ParagraphItem)object0));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@NotNull ParagraphItem paragraphItem0) {
                                Intrinsics.checkNotNullParameter(paragraphItem0, "it");
                                paragraphItem0.updateText(this.$s);
                            }
                        };
                        ParagraphItemSpec.this.ifFoundItem(view0, paragraphItemSpec$onViewCreated$1$2$6$10);
                        View view1 = this.$binding.getRoot();
                        Intrinsics.checkNotNullExpressionValue(view1, "getRoot(...)");
                        com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.6.2 paragraphItemSpec$onViewCreated$1$2$6$20 = new Function1(this.$binding) {
                            final KeItemParagraphBinding $binding;

                            {
                                ParagraphItemSpec.this = paragraphItemSpec0;
                                this.$binding = keItemParagraphBinding0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(((Number)object0).intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(int v) {
                                KeditorView keditorView0 = ParagraphItemSpec.this.findKeditorView();
                                if(keditorView0 != null) {
                                    View view0 = this.$binding.getRoot();
                                    Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                                    KeditorState keditorState0 = keditorView0.getState$keditor_release();
                                    ParagraphItemSpec.this.checkedIsEmptyFirstItem(view0, v, keditorState0);
                                }
                            }
                        };
                        ParagraphItemSpec.this.ifFoundPosition(view1, paragraphItemSpec$onViewCreated$1$2$6$20);
                    }
                };

                @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/text/Editable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
                final class com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.2 extends Lambda implements Function1 {
                    public static final com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.2 INSTANCE;

                    static {
                        com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.2.INSTANCE = new com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.2();
                    }

                    public com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec.onViewCreated.1.2.2() {
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((Editable)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull Editable editable0) {
                        Intrinsics.checkNotNullParameter(editable0, "it");
                    }
                }

            }
        };
        EditTextStandardKt.onTextChanged(keItemParagraphBinding0.keParagraphEdit, paragraphItemSpec$onViewCreated$1$20);
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = this.getEditorId();
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
            keditorEditText0.setSuggestionOff();
        }
        View view1 = keItemParagraphBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view1, "getRoot(...)");
        return view1;
    }

    private final KeditorEditText paragraphEdit(View view0) {
        return (KeditorEditText)view0.findViewById(id.ke_paragraph_edit);
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

    public final void setMenuBinding(@NotNull KeToolbarTextEditMenuBinding keToolbarTextEditMenuBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarTextEditMenuBinding0, "<set-?>");
        this.menuBinding = keToolbarTextEditMenuBinding0;
    }

    public final void setPlaceholderRes(int v) {
        this.placeholderRes = v;
    }

    private final ParagraphItem split(ParagraphItem paragraphItem0, KeditorEditText keditorEditText0, int v, CharSequence charSequence0, int v1) {
        ParagraphItem paragraphItem1;
        if(v1 + 1 < charSequence0.length()) {
            Spannable spannable0 = keditorEditText0.getTextSubSequence(v1 + 1, charSequence0.length());
            keditorEditText0.delete(v1, charSequence0.length());
            if(spannable0 == null) {
                spannable0 = new SpannableStringBuilder();
            }
            paragraphItem1 = new ParagraphItem(spannable0, false, false, 6, null);
            paragraphItem1.keepFocus();
            if(paragraphItem0 != null) {
                ParagraphStyle paragraphStyle0 = paragraphItem0.getParagraphStyle();
                if(paragraphStyle0 != null) {
                    paragraphItem1.setParagraphStyle(paragraphStyle0);
                }
            }
            if(paragraphItem0 != null) {
                Alignment alignment0 = paragraphItem0.getAlignment();
                if(alignment0 != null) {
                    paragraphItem1.setAlignment(alignment0);
                    return paragraphItem1;
                }
            }
        }
        else {
            paragraphItem1 = new ParagraphItem(new SpannableStringBuilder(), false, false, 6, null);
            paragraphItem1.keepFocus();
        }
        return paragraphItem1;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((ParagraphItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull ParagraphItem paragraphItem0) {
        Intrinsics.checkNotNullParameter(paragraphItem0, "item");
        String s = paragraphItem0.getType();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("size", paragraphItem0.getValueOrBypass("size", "size" + paragraphItem0.getParagraphStyle().getFontSize()));
        linkedHashMap0.put("textAlign", paragraphItem0.getValueOrBypass("textAlign", "alignment"));
        Item cDM$Item0 = new Item(s, linkedHashMap0, null, 4, null);
        return SpannableToCDM.INSTANCE.generate(cDM$Item0, paragraphItem0.getText());
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public ParagraphItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        boolean z = Intrinsics.areEqual(cDM$Item0.getType(), "heading");
        int v = 0;
        ParagraphItem paragraphItem0 = Companion.newInstance$default(ParagraphItem.Companion, false, z, 1, null);
        paragraphItem0.setText(SpannableParser.INSTANCE.parseTextModel(context0, cDM$Item0));
        com.kakao.keditor.plugin.attrs.text.ParagraphStyle.Companion paragraphStyle$Companion0 = ParagraphStyle.Companion;
        Integer integer0 = o.toIntOrNull(StringsKt__StringsKt.removePrefix(this.popValueOrDefault(map0, "size", "", true), "size"));
        if(integer0 != null) {
            v = (int)integer0;
        }
        paragraphItem0.setParagraphStyle(paragraphStyle$Companion0.getTypeBySizeDP(v));
        String s = com.kakao.keditor.plugin.itemspec.ItemValidator.DefaultImpls.popValueOrDefault$default(this, map0, "textAlign", "justify", false, 8, null);
        paragraphItem0.setAlignment(Alignment.Companion.byNameText(s, Text.INSTANCE));
        return paragraphItem0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemSpec
    public boolean typeOf(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "type");
        return Intrinsics.areEqual(s, "paragraph") || Intrinsics.areEqual(s, "heading");
    }
}

