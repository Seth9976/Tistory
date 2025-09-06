package com.kakao.keditor.plugin.itemspec.textlist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.StringRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import com.kakao.keditor.BR;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import com.kakao.keditor.R.id;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.R.string;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.databinding.KeItemListBinding;
import com.kakao.keditor.databinding.KeItemListContentBinding;
import com.kakao.keditor.databinding.KeToolbarListMenuBinding;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.KeditorItemType;
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
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItem.Companion;
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
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshPosition;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveItem;
import com.kakao.keditor.util.eventbus.ViewRequest.ReplaceItems;
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
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "list")
@Metadata(d1 = {"\u0000\u00D6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J2\u0010*\u001A\u0004\u0018\u00010+2\u0006\u0010,\u001A\u00020\u000B2\u0006\u0010-\u001A\u00020\u00022\u0006\u0010.\u001A\u00020/2\u0006\u00100\u001A\u00020\u00112\u0006\u00101\u001A\u00020\u0011H\u0002J\u001C\u00102\u001A\u0002032\b\u0010-\u001A\u0004\u0018\u0001042\b\u0010,\u001A\u0004\u0018\u00010\u000BH\u0016J\u0010\u00105\u001A\u0002032\u0006\u00106\u001A\u000207H\u0016J\b\u00108\u001A\u00020\u0002H\u0016J$\u00109\u001A\u0002032\u0006\u0010:\u001A\u00020;2\u0012\u0010<\u001A\u000E\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u0002030=H\u0002J\b\u0010>\u001A\u00020?H\u0016J\u0018\u0010@\u001A\u00020A2\u0006\u0010B\u001A\u00020C2\u0006\u0010D\u001A\u00020\u0011H\u0002J\u0010\u0010E\u001A\u00020A2\u0006\u0010B\u001A\u00020CH\u0002J\b\u0010F\u001A\u00020GH\u0016J\u0010\u0010H\u001A\u0002032\u0006\u0010I\u001A\u00020JH\u0002J(\u0010K\u001A\u0002032\u0006\u0010,\u001A\u00020\u000B2\u0006\u0010-\u001A\u0002042\u0006\u00101\u001A\u00020\u00112\u0006\u0010L\u001A\u00020MH\u0016J\u001A\u0010N\u001A\u0002032\b\u0010O\u001A\u0004\u0018\u00010\u000B2\u0006\u0010P\u001A\u00020QH\u0016J\u0018\u0010R\u001A\u00020\u000B2\u0006\u0010S\u001A\u00020T2\u0006\u0010U\u001A\u00020VH\u0016J \u0010W\u001A\u0002032\u0006\u0010,\u001A\u00020\u000B2\u0006\u0010-\u001A\u00020\u00022\u0006\u00100\u001A\u00020\u0011H\u0002J\u0010\u0010X\u001A\u00020Y2\u0006\u0010-\u001A\u00020\u0002H\u0014J,\u0010Z\u001A\u00020\u00022\u0006\u00106\u001A\u0002072\u0006\u0010-\u001A\u00020Y2\u0012\u0010[\u001A\u000E\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020]0\\H\u0014J\u0018\u0010^\u001A\u0002032\u0006\u0010,\u001A\u00020\u000B2\u0006\u0010-\u001A\u00020\u0002H\u0002J\"\u0010_\u001A\u0004\u0018\u0001H`\"\u0006\b\u0000\u0010`\u0018\u0001*\b\u0012\u0004\u0012\u00020b0aH\u0082\b\u00A2\u0006\u0002\u0010cJ\u0019\u0010d\u001A\u00020A*\u0006\u0012\u0002\b\u00030a2\u0006\u0010e\u001A\u00020\u0011H\u0082\u0004R\u001A\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\u00020\u000BX\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0016\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R&\u0010\u0019\u001A\u0014\u0012\u0004\u0012\u00020\u001B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0\u00060\u001AX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u001DR\u001A\u0010\u001E\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010\u0013\"\u0004\b \u0010\u0015R\u001A\u0010!\u001A\u00020\"X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001E\u0010\'\u001A\u00020\u00118\u0006@\u0006X\u0087\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015\u00A8\u0006f"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/textlist/TextListItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/textlist/TextListItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "childValidators", "", "Lcom/kakao/keditor/plugin/itemspec/ItemValidator;", "getChildValidators", "()Ljava/util/Set;", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarListMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarListMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarListMenuBinding;)V", "placeholderRes", "getPlaceholderRes", "setPlaceholderRes", "addItemView", "Lcom/kakao/keditor/widget/KeditorEditText;", "view", "item", "itemText", "Lcom/kakao/keditor/plugin/itemspec/textlist/TextListItemContent;", "index", "position", "bind", "", "Lcom/kakao/keditor/KeditorItem;", "createContextMenu", "context", "Landroid/content/Context;", "createKeditorItem", "findItemContent", "listLayout", "Landroid/widget/LinearLayout;", "itemContent", "Lkotlin/Function1;", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "isInputEnter", "", "text", "", "start", "isInputEnterWithBlank", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "menuBindingSelectionChange", "selectionChanged", "Lcom/kakao/keditor/util/eventbus/ItemSpecRequest$TextSelectionChanged;", "onItemBound", "editorState", "Lcom/kakao/keditor/KeditorState;", "onRenderingRequest", "itemView", "request", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "removeItemView", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "updateItemViewIndices", "find", "T", "", "Landroid/text/style/CharacterStyle;", "(Ljava/util/List;)Ljava/lang/Object;", "isLastIndex", "i", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTextListItemSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextListItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/textlist/TextListItemSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 Keditor.kt\ncom/kakao/keditor/Keditor\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,539:1\n493#1:592\n493#1:594\n493#1:596\n1855#2,2:540\n1549#2:542\n1620#2,3:543\n1747#2,3:577\n1747#2,3:580\n1747#2,3:583\n1747#2,3:586\n1747#2,3:589\n65#3,16:546\n93#3,3:562\n136#4,12:565\n1#5:593\n1#5:595\n1#5:597\n1#5:598\n*S KotlinDebug\n*F\n+ 1 TextListItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/textlist/TextListItemSpec\n*L\n482#1:592\n485#1:594\n488#1:596\n92#1:540,2\n103#1:542\n103#1:543,3\n477#1:577,3\n478#1:580,3\n479#1:583,3\n480#1:586,3\n481#1:589,3\n182#1:546,16\n182#1:562,3\n267#1:565,12\n482#1:593\n485#1:595\n488#1:597\n*E\n"})
public final class TextListItemSpec extends RootItemSpec implements HasItemDecoration {
    @NotNull
    private final Set childValidators;
    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    @NotNull
    private final Map knownEnumValues;
    private int layout;
    public KeToolbarListMenuBinding menuBinding;
    @StringRes
    private int placeholderRes;

    public TextListItemSpec() {
        this.placeholderRes = string.common_input_hint;
        this.knownEnumValues = w.mapOf(TuplesKt.to("style", ListType.Companion.typeSet()));
        this.childValidators = e0.setOf(TextListItemContentSpec.INSTANCE);
        this.layout = layout.ke_item_list;
        this.contextMenulayout = layout.ke_toolbar_list_menu;
    }

    private final KeditorEditText addItemView(View view0, TextListItem textListItem0, TextListItemContent textListItemContent0, int v, int v1) {
        Boolean boolean0;
        KeItemListBinding keItemListBinding0 = (KeItemListBinding)DataBindingUtil.bind(view0);
        if(keItemListBinding0 != null) {
            LinearLayout linearLayout0 = keItemListBinding0.keListItems;
            if(linearLayout0 != null) {
                ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(view0.getContext()), layout.ke_item_list_content, linearLayout0, false);
                ((KeItemListContentBinding)viewDataBinding0).setText(textListItemContent0.getText());
                ((KeItemListContentBinding)viewDataBinding0).setType(ListType.Companion.getByName(textListItem0.getStyle()));
                ((KeItemListContentBinding)viewDataBinding0).setIndex(v);
                com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.addItemView.1.1.1 textListItemSpec$addItemView$1$1$10 = new SelectionChangeListener() {
                    @Override  // com.kakao.keditor.widget.KeditorEditText$SelectionChangeListener
                    public void selectedChanged(@NotNull KeditorEditText keditorEditText0, int v, int v1) {
                        Intrinsics.checkNotNullParameter(keditorEditText0, "editText");
                        View view0 = textListItemContent0.getRoot();
                        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                        TextListItem textListItem0 = (TextListItem)keItemListBinding0.getItem(view0);
                        if(textListItem0 == null) {
                            return;
                        }
                        if(!textListItem0.getHasPendingFocus()) {
                            textListItem0.setSelectionStart(v);
                            textListItem0.setSelectionEnd(v1);
                        }
                        if(textListItem0.isDead()) {
                            return;
                        }
                        ((KeItemListContentBinding)viewDataBinding0).keListItemContent.setSelectionStart(v);
                        ((KeItemListContentBinding)viewDataBinding0).keListItemContent.setSelectionEnd(v1);
                        TextListItemContent textListItemContent0 = ((KeItemListContentBinding)viewDataBinding0).keListItemContent;
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object0: textListItem0.getItems()) {
                            if(!Intrinsics.areEqual(((TextListItemContent)object0), textListItemContent0)) {
                                arrayList0.add(object0);
                            }
                        }
                        for(Object object1: arrayList0) {
                            ((TextListItemContent)object1).setSelectionEnd(-1);
                            ((TextListItemContent)object1).setSelectionStart(-1);
                        }
                        Editable editable0 = keditorEditText0.getText();
                        if(editable0 == null) {
                            return;
                        }
                        TextListItemSpec textListItemSpec0 = keItemListBinding0;
                        Selection selection0 = new Selection(v, v1);
                        Iterable iterable0 = SpanUtil.INSTANCE.getSpans(editable0, selection0);
                        ArrayList arrayList1 = new ArrayList();
                        for(Object object2: iterable0) {
                            int v2 = editable0.getSpanStart(((CharacterStyle)object2));
                            if(v2 <= v && (v2 != v || v != v1 || v == 0)) {
                                arrayList1.add(object2);
                            }
                        }
                        List list0 = CollectionsKt___CollectionsKt.toMutableList(arrayList1);
                        this.$this_with.updateSpanListWith(list0, this.$this_with.getPendingRequestSpans());
                        textListItemSpec0.menuBindingSelectionChange(new TextSelectionChanged(CollectionsKt___CollectionsKt.toList(list0), editable0, textListItem0.getAlignment(), v, v1));
                    }
                };
                ((KeItemListContentBinding)viewDataBinding0).keListItemContent.setOnSelectionChanged(textListItemSpec$addItemView$1$1$10);
                Intrinsics.checkNotNull(((KeItemListContentBinding)viewDataBinding0).keListItemContent);
                com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.addItemView.lambda.15.lambda.14..inlined.addTextChangedListener.default.1 textListItemSpec$addItemView$lambda$15$lambda$14$$inlined$addTextChangedListener$default$10 = new TextWatcher() {
                    @Override  // android.text.TextWatcher
                    public void afterTextChanged(@Nullable Editable editable0) {
                        if(!((KeItemListContentBinding)viewDataBinding0).isDead() && !((KeItemListContentBinding)viewDataBinding0).getItems().isEmpty() && ((KeItemListContentBinding)viewDataBinding0).getItems().size() > textListItem0.getIndex()) {
                            TextListItemContent textListItemContent0 = (TextListItemContent)((KeItemListContentBinding)viewDataBinding0).getItems().get(textListItem0.getIndex());
                            Intrinsics.checkNotNull(editable0, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                            textListItemContent0.setText(((SpannableStringBuilder)editable0));
                        }
                    }

                    @Override  // android.text.TextWatcher
                    public void beforeTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
                    }

                    @Override  // android.text.TextWatcher
                    public void onTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
                        if(!((KeItemListContentBinding)viewDataBinding0).isDead()) {
                            Object object0 = this.keListItemContent.getTag(id.ke_internal_stop_watching_me);
                            if(!Intrinsics.areEqual((object0 instanceof Boolean ? ((Boolean)object0) : null), Boolean.TRUE) && charSequence0 != null && v1.isInputEnter(charSequence0, v)) {
                                if(!v1.isLastIndex(((KeItemListContentBinding)viewDataBinding0).getItems(), this.getIndex()) || !v1.isInputEnterWithBlank(charSequence0)) {
                                    KeditorEditText keditorEditText0 = this.keListItemContent;
                                    int v3 = StringsKt__StringsKt.indexOf$default(keditorEditText0.text(), "\n", 0, false, 6, null);
                                    if(v3 >= 0) {
                                        keditorEditText0.setTag(id.ke_internal_stop_watching_me, Boolean.TRUE);
                                        keditorEditText0.addSpace(v3 + 1);
                                        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(keditorEditText0.getText(), v3 + 1, keditorEditText0.textLength());
                                        keditorEditText0.delete(v3, keditorEditText0.textLength());
                                        ((KeItemListContentBinding)viewDataBinding0).setFocused(this.getIndex() + 1);
                                        TextListItemContent textListItemContent0 = new TextListItemContent(spannableStringBuilder0, 0, 0);
                                        ((KeItemListContentBinding)viewDataBinding0).getItems().add(this.getIndex() + 1, textListItemContent0);
                                        KeditorEditText keditorEditText1 = v1.addItemView(v, ((KeItemListContentBinding)viewDataBinding0), textListItemContent0, this.getIndex() + 1, view0);
                                        if(keditorEditText1 != null) {
                                            keditorEditText1.post(new com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.addItemView.1.1.2.1.1.1(((KeItemListContentBinding)viewDataBinding0), textListItemContent0, this.$itemText$inlined, keditorEditText1));
                                        }
                                        keditorEditText0.setTag(id.ke_internal_stop_watching_me, Boolean.FALSE);
                                    }
                                }
                                else {
                                    KeEvent keEvent0 = KeEvent.INSTANCE;
                                    keEvent0.postInScope(new AddKeditorItems(k.listOf(Companion.newInstance$default(ParagraphItem.Companion, true, false, 2, null)), view0, false, false, 12, null));
                                    ((KeItemListContentBinding)viewDataBinding0).getItems().remove(this.getIndex());
                                    v1.removeItemView(v, ((KeItemListContentBinding)viewDataBinding0), this.getIndex());
                                    if(((KeItemListContentBinding)viewDataBinding0).getItems().size() == 0) {
                                        keEvent0.postInScope(new RemoveItem(view0, false, 2, null));
                                    }
                                }
                            }
                        }
                    }
                };
                ((KeItemListContentBinding)viewDataBinding0).keListItemContent.addTextChangedListener(textListItemSpec$addItemView$lambda$15$lambda$14$$inlined$addTextChangedListener$default$10);
                a a0 = (View view1, int v, KeyEvent keyEvent0) -> {
                    Intrinsics.checkNotNullParameter(textListItem0, "$item");
                    Intrinsics.checkNotNullParameter(linearLayout0, "$it");
                    Intrinsics.checkNotNullParameter(this, "this$0");
                    Intrinsics.checkNotNullParameter(view0, "$view");
                    if(keyEvent0.getAction() == 0 && v == 67) {
                        int v1 = ((KeItemListContentBinding)viewDataBinding0).keListItemContent.getSelectionStart();
                        if(v1 == ((KeItemListContentBinding)viewDataBinding0).keListItemContent.getSelectionEnd() && v1 == 0 && ((KeItemListContentBinding)viewDataBinding0).getIndex() > 0) {
                            TextListItemContent textListItemContent0 = (TextListItemContent)textListItem0.getItems().get(((KeItemListContentBinding)viewDataBinding0).getIndex() - 1);
                            int v2 = textListItemContent0.getText().length();
                            SpannableStringBuilder spannableStringBuilder0 = textListItemContent0.getText().append(((KeItemListContentBinding)viewDataBinding0).keListItemContent.getText());
                            Intrinsics.checkNotNullExpressionValue(spannableStringBuilder0, "append(...)");
                            textListItemContent0.setText(spannableStringBuilder0);
                            textListItemContent0.setSelectionStart(v2);
                            textListItemContent0.setSelectionEnd(v2);
                            textListItem0.getItems().remove(((KeItemListContentBinding)viewDataBinding0).getIndex());
                            if(((KeItemListContentBinding)viewDataBinding0).getIndex() > 0) {
                                int v3 = ((KeItemListContentBinding)viewDataBinding0).keListItemContent.textLength();
                                textListItem0.setFocused(((KeItemListContentBinding)viewDataBinding0).getIndex() - 1);
                                KeItemListContentBinding keItemListContentBinding1 = (KeItemListContentBinding)DataBindingUtil.bind(linearLayout0.getChildAt(textListItem0.getFocused()));
                                if(keItemListContentBinding1 != null) {
                                    KeditorEditText keditorEditText0 = keItemListContentBinding1.keListItemContent;
                                    if(keditorEditText0 != null) {
                                        keditorEditText0.setText(textListItemContent0.getText());
                                        keditorEditText0.setSelection(Math.max(keditorEditText0.textLength() - v3, 0), Math.max(keditorEditText0.textLength() - v3, 0));
                                        keditorEditText0.requestFocus();
                                    }
                                }
                            }
                            this.removeItemView(view0, textListItem0, ((KeItemListContentBinding)viewDataBinding0).getIndex());
                        }
                    }
                    return false;
                };
                ((KeItemListContentBinding)viewDataBinding0).keListItemContent.setOnKeyListener(a0);
                Keditor keditor0 = Keditor.INSTANCE;
                Integer integer0 = this.getEditorId();
                if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)androidx.room.a.g(keditor0, integer0)).containsKey("set_keyboard_suggestion_off")) {
                    Object object1 = keditor0.getConfig().get("set_keyboard_suggestion_off");
                    if(!(object1 instanceof Boolean)) {
                        object1 = null;
                    }
                    boolean0 = (Boolean)object1;
                }
                else {
                    Object object0 = ((Map)androidx.room.a.g(keditor0, integer0)).get("set_keyboard_suggestion_off");
                    if(!(object0 instanceof Boolean)) {
                        object0 = null;
                    }
                    boolean0 = (Boolean)object0;
                }
                if(Intrinsics.areEqual((boolean0 == null ? null : boolean0), Boolean.TRUE)) {
                    ((KeItemListContentBinding)viewDataBinding0).keListItemContent.setSuggestionOff();
                }
                linearLayout0.addView(((KeItemListContentBinding)viewDataBinding0).getRoot(), v);
                this.updateItemViewIndices(view0, textListItem0);
                return ((KeItemListContentBinding)viewDataBinding0).keListItemContent;
            }
        }
        return null;

        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.addItemView.1.1.2.1.1.1 implements Runnable {
            public com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.addItemView.1.1.2.1.1.1(TextListItem textListItem0, int v, TextListItemContent textListItemContent0, KeditorEditText keditorEditText0) {
            }

            @Override
            public final void run() {
                this.$item.setFocused(this.$index);
                this.$itemText.clearSelection();
                this.$newItemView.setSelection(0, 1);
                this.$newItemView.requestFocus();
            }
        }

    }

    // 检测为 Lambda 实现
    private static final boolean addItemView$lambda$15$lambda$14$lambda$13(KeItemListContentBinding keItemListContentBinding0, TextListItem textListItem0, LinearLayout linearLayout0, TextListItemSpec textListItemSpec0, View view0, View view1, int v, KeyEvent keyEvent0) [...]

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        if(keditorItem0 instanceof TextListItem && view0 != null) {
            ViewDataBinding viewDataBinding0 = DataBindingUtil.bind(view0);
            Intrinsics.checkNotNull(viewDataBinding0);
            Intrinsics.checkNotNullExpressionValue(((KeItemListBinding)viewDataBinding0).keListItems, "keListItems");
            this.getMenuBinding().setListItem(((TextListItem)keditorItem0));
            this.getMenuBinding().setTextMenuListener(new TextMenuClickListener() {
                private final void listToParagraphItem(TextListItem textListItem0) {
                    int v = keditorItem0.indexOf(textListItem0);
                    SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder();
                    textListItem0.die();
                    int v1 = 0;
                    for(Object object0: textListItem0.getItems()) {
                        if(v1 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        if(v1 != 0) {
                            spannableStringBuilder0.append("\n");
                            int v2 = spannableStringBuilder0.length();
                            SpanUtil.INSTANCE.clearSpan(spannableStringBuilder0, v2 - 1, 1);
                        }
                        spannableStringBuilder0.append(((TextListItemContent)object0).getText());
                        ++v1;
                    }
                    ParagraphItem paragraphItem0 = new ParagraphItem(spannableStringBuilder0, true, false, 4, null);
                    paragraphItem0.setSelectionStart(spannableStringBuilder0.length());
                    paragraphItem0.setSelectionEnd(paragraphItem0.getSelectionStart());
                    paragraphItem0.setParagraphStyle(ParagraphStyle.ParagraphStyle5);
                    ReplaceItems viewRequest$ReplaceItems0 = new ReplaceItems(v, k.listOf(paragraphItem0), v, false, 8, null);
                    KeEvent.INSTANCE.postInScope(viewRequest$ReplaceItems0);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "textlist-toolbar", "remove", null, 4, null);
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
                    DefaultImpls.onBlockQuoteTypeClicked(this, s);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onBoldClicked() {
                    com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onBoldClicked.1 textListItemSpec$bind$1$onBoldClicked$10 = new Function1() {
                        final KeditorItem $item;

                        {
                            this.$item = keditorItem0;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((KeditorEditText)object0));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                            Intrinsics.checkNotNullParameter(keditorEditText0, "it");
                            SetStyle setStyle0 = new SetStyle(Bold.INSTANCE);
                            setStyle0.setFocusedItem(this.$item);
                            ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorEditText0, setStyle0);
                        }
                    };
                    keditorItem0.findItemContent(this.$listLayout, textListItemSpec$bind$1$onBoldClicked$10);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "textlist-toolbar", "bold", null, 4, null);
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
                                int v1 = TextListItemSpec.this;
                                if(v1 == 0) {
                                    this.$listLayout.getMenuBinding().setTextColor(colorType0);
                                    com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onColorPickerClicked.overlay.1.onOverlayMenuClicked.1 textListItemSpec$bind$1$onColorPickerClicked$overlay$1$onOverlayMenuClicked$10 = new Function1(this.$item) {
                                        final int $colorCode;
                                        final KeditorItem $item;

                                        {
                                            this.$colorCode = v;
                                            this.$item = keditorItem0;
                                            super(1);
                                        }

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            this.invoke(((KeditorEditText)object0));
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                                            Intrinsics.checkNotNullParameter(keditorEditText0, "it");
                                            SetTextColor setTextColor0 = new SetTextColor(this.$colorCode);
                                            setTextColor0.setFocusedItem(this.$item);
                                            ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorEditText0, setTextColor0);
                                        }
                                    };
                                    this.$listLayout.findItemContent(this.$item, textListItemSpec$bind$1$onColorPickerClicked$overlay$1$onOverlayMenuClicked$10);
                                }
                                else if(v1 == 1) {
                                    this.$listLayout.getMenuBinding().setTextBackgroundColor(colorType0);
                                    com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onColorPickerClicked.overlay.1.onOverlayMenuClicked.2 textListItemSpec$bind$1$onColorPickerClicked$overlay$1$onOverlayMenuClicked$20 = new Function1(this.$item) {
                                        final int $colorCode;
                                        final KeditorItem $item;

                                        {
                                            this.$colorCode = v;
                                            this.$item = keditorItem0;
                                            super(1);
                                        }

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            this.invoke(((KeditorEditText)object0));
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                                            Intrinsics.checkNotNullParameter(keditorEditText0, "it");
                                            SetTextBackgroundColor setTextBackgroundColor0 = new SetTextBackgroundColor(this.$colorCode);
                                            setTextBackgroundColor0.setFocusedItem(this.$item);
                                            ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorEditText0, setTextBackgroundColor0);
                                        }
                                    };
                                    this.$listLayout.findItemContent(this.$item, textListItemSpec$bind$1$onColorPickerClicked$overlay$1$onOverlayMenuClicked$20);
                                }
                                KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                                this.$listLayout.getMenuBinding().setActiveOverlayCategory(null);
                            }

                            @Override  // com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener
                            public void onOverlayMenuClicked(Object object0) {
                                this.onOverlayMenuClicked(((ColorType)object0));
                            }
                        }, 14, null), overlayCategory$TextForegroundColor0, false, 4, null);
                        KeEvent.INSTANCE.postInScope(toolbarRequest$ShowSoftInputOverlay0);
                        keditorItem0.getMenuBinding().setActiveOverlayCategory(overlayCategory$TextForegroundColor0);
                    }
                    Keditor.clickEvent$default(Keditor.INSTANCE, "textlist-toolbar", (v == 0 ? "colorPalette" : "backColorPalette"), null, 4, null);
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
                                this.$listLayout.getMenuBinding().setFontStyle(fontStyle0);
                                com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onFontStyleClicked.overlay.1.onOverlayMenuClicked.1 textListItemSpec$bind$1$onFontStyleClicked$overlay$1$onOverlayMenuClicked$10 = new Function1(this.$listLayout, this.$item) {
                                    final FontStyle $fontStyle;
                                    final KeditorItem $item;

                                    {
                                        this.$fontStyle = fontStyle0;
                                        TextListItemSpec.this = textListItemSpec0;
                                        this.$item = keditorItem0;
                                        super(1);
                                    }

                                    @Override  // kotlin.jvm.functions.Function1
                                    public Object invoke(Object object0) {
                                        this.invoke(((KeditorEditText)object0));
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                                        Intrinsics.checkNotNullParameter(keditorEditText0, "it");
                                        Context context0 = TextListItemSpec.this.getMenuBinding().getRoot().getContext();
                                        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                                        Typeface typeface0 = this.$fontStyle.getTypeface(context0);
                                        SetFont setFont0 = new SetFont(this.$fontStyle.getFamilyName(), typeface0);
                                        setFont0.setFocusedItem(this.$item);
                                        ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorEditText0, setFont0);
                                    }
                                };
                                this.$listLayout.findItemContent(this.$item, textListItemSpec$bind$1$onFontStyleClicked$overlay$1$onOverlayMenuClicked$10);
                                KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                                this.$listLayout.getMenuBinding().setActiveOverlayCategory(null);
                                Context context0 = this.$listLayout.getMenuBinding().getRoot().getContext();
                                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                                String s = fontStyle0.getDescription(context0);
                                Keditor.INSTANCE.clickEvent("textlist-toolbar", "font", s);
                            }

                            @Override  // com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener
                            public void onOverlayMenuClicked(Object object0) {
                                this.onOverlayMenuClicked(((FontStyle)object0));
                            }
                        }, 14, null), overlayCategory$FontStyle0, false, 4, null);
                        KeEvent.INSTANCE.postInScope(toolbarRequest$ShowSoftInputOverlay0);
                        keditorItem0.getMenuBinding().setActiveOverlayCategory(overlayCategory$FontStyle0);
                    }
                    Keditor.clickEvent$default(Keditor.INSTANCE, "textlist-toolbar", "font", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onItalicClicked() {
                    com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onItalicClicked.1 textListItemSpec$bind$1$onItalicClicked$10 = new Function1() {
                        final KeditorItem $item;

                        {
                            this.$item = keditorItem0;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((KeditorEditText)object0));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                            Intrinsics.checkNotNullParameter(keditorEditText0, "it");
                            SetStyle setStyle0 = new SetStyle(Italic.INSTANCE);
                            setStyle0.setFocusedItem(this.$item);
                            ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorEditText0, setStyle0);
                        }
                    };
                    keditorItem0.findItemContent(this.$listLayout, textListItemSpec$bind$1$onItalicClicked$10);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "textlist-toolbar", "italic", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onLinkTextClicked() {
                    keditorItem0.findItemContent(this.$listLayout, com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onLinkTextClicked.1.INSTANCE);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "textlist-toolbar", "link", null, 4, null);

                    @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/widget/KeditorEditText;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
                    final class com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onLinkTextClicked.1 extends Lambda implements Function1 {
                        public static final com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onLinkTextClicked.1 INSTANCE;

                        static {
                            com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onLinkTextClicked.1.INSTANCE = new com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onLinkTextClicked.1();
                        }

                        public com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onLinkTextClicked.1() {
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((KeditorEditText)object0));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                            Intrinsics.checkNotNullParameter(keditorEditText0, "it");
                            ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorEditText0, SetTextLink.INSTANCE);
                        }
                    }

                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onListClicked() {
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onListTypeClicked(@NotNull String s) {
                    Intrinsics.checkNotNullParameter(s, "listType");
                    ListType listType0 = ListType.Companion.getByName(s);
                    TextListItem textListItem0 = keditorItem0.getMenuBinding().getListItem();
                    if(Intrinsics.areEqual(listType0.getStyle(), (textListItem0 == null ? null : textListItem0.getStyle()))) {
                        this.listToParagraphItem(((TextListItem)((KeItemListBinding)viewDataBinding0).keListItems));
                        return;
                    }
                    int v = this.$listLayout.getChildCount();
                    for(int v1 = 0; v1 < v; ++v1) {
                        KeItemListContentBinding keItemListContentBinding0 = (KeItemListContentBinding)DataBindingUtil.bind(this.$listLayout.getChildAt(v1));
                        if(keItemListContentBinding0 != null) {
                            keItemListContentBinding0.setType(listType0);
                        }
                        if(v1 == this.$listLayout.getChildCount() - 1) {
                            ((TextListItem)((KeItemListBinding)viewDataBinding0).keListItems).setStyle(listType0.getStyle());
                            keditorItem0.getMenuBinding().setListItem(((TextListItem)((KeItemListBinding)viewDataBinding0).keListItems));
                        }
                    }
                    Keditor.INSTANCE.clickEvent("textlist-toolbar", "style", s);
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
                    com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onStrikeClicked.1 textListItemSpec$bind$1$onStrikeClicked$10 = new Function1() {
                        final KeditorItem $item;

                        {
                            this.$item = keditorItem0;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((KeditorEditText)object0));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                            Intrinsics.checkNotNullParameter(keditorEditText0, "it");
                            SetStyle setStyle0 = new SetStyle(Strikethrough.INSTANCE);
                            setStyle0.setFocusedItem(this.$item);
                            ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorEditText0, setStyle0);
                        }
                    };
                    keditorItem0.findItemContent(this.$listLayout, textListItemSpec$bind$1$onStrikeClicked$10);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "textlist-toolbar", "strikethrough", null, 4, null);
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
                    com.kakao.keditor.plugin.itemspec.textlist.TextListItemSpec.bind.1.onUnderlineClicked.1 textListItemSpec$bind$1$onUnderlineClicked$10 = new Function1() {
                        final KeditorItem $item;

                        {
                            this.$item = keditorItem0;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((KeditorEditText)object0));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                            Intrinsics.checkNotNullParameter(keditorEditText0, "it");
                            SetStyle setStyle0 = new SetStyle(Underline.INSTANCE);
                            setStyle0.setFocusedItem(this.$item);
                            ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorEditText0, setStyle0);
                        }
                    };
                    keditorItem0.findItemContent(this.$listLayout, textListItemSpec$bind$1$onUnderlineClicked$10);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "textlist-toolbar", "underline", null, 4, null);
                }
            });
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void createContextMenu(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), this.getContextMenulayout(), null, false);
        ((KeToolbarListMenuBinding)viewDataBinding0).setActiveOverlayCategory(MorePlugin.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "apply(...)");
        this.setMenuBinding(((KeToolbarListMenuBinding)viewDataBinding0));
        View view0 = this.getMenuBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setContextMenuLayoutView(view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem createKeditorItem() {
        return this.createKeditorItem();
    }

    @NotNull
    public TextListItem createKeditorItem() {
        return TextListItem.Companion.newInstance(true);
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

    private final void findItemContent(LinearLayout linearLayout0, Function1 function10) {
        int v = linearLayout0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            KeItemListContentBinding keItemListContentBinding0 = (KeItemListContentBinding)DataBindingUtil.bind(linearLayout0.getChildAt(v1));
            if(keItemListContentBinding0 != null && (keItemListContentBinding0.keListItemContent != null && keItemListContentBinding0.keListItemContent.hasFocus())) {
                Intrinsics.checkNotNullExpressionValue(keItemListContentBinding0.keListItemContent, "keListItemContent");
                function10.invoke(keItemListContentBinding0.keListItemContent);
            }
        }
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
    public final KeToolbarListMenuBinding getMenuBinding() {
        KeToolbarListMenuBinding keToolbarListMenuBinding0 = this.menuBinding;
        if(keToolbarListMenuBinding0 != null) {
            return keToolbarListMenuBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuBinding");
        return null;
    }

    public final int getPlaceholderRes() {
        return this.placeholderRes;
    }

    private final boolean isInputEnter(CharSequence charSequence0, int v) {
        return StringsKt__StringsKt.contains$default(charSequence0, "\n", false, 2, null);
    }

    private final boolean isInputEnterWithBlank(CharSequence charSequence0) {
        return p.isBlank(new Regex("\n").replace(charSequence0, ""));
    }

    private final boolean isLastIndex(List list0, int v) {
        return v == CollectionsKt__CollectionsKt.getLastIndex(list0);
    }

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    @NotNull
    public ItemDecoration itemDecoration() {
        return TextListItemDecoration.INSTANCE;
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
        KeToolbarListMenuBinding keToolbarListMenuBinding0 = this.getMenuBinding();
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
        keToolbarListMenuBinding0.setIsActiveBold(z);
        KeToolbarListMenuBinding keToolbarListMenuBinding1 = this.getMenuBinding();
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
        keToolbarListMenuBinding1.setIsActiveItalic(z2);
        KeToolbarListMenuBinding keToolbarListMenuBinding2 = this.getMenuBinding();
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
        keToolbarListMenuBinding2.setIsActiveUnderLine(z3);
        KeToolbarListMenuBinding keToolbarListMenuBinding3 = this.getMenuBinding();
        Iterable iterable3 = itemSpecRequest$TextSelectionChanged0.getSpans();
        if(!(iterable3 instanceof Collection) || !((Collection)iterable3).isEmpty()) {
            for(Object object3: iterable3) {
                if(((CharacterStyle)object3) instanceof KeStrikethroughSpan) {
                    z4 = true;
                    break;
                }
            }
        }
        keToolbarListMenuBinding3.setIsActiveStrike(z4);
        KeToolbarListMenuBinding keToolbarListMenuBinding4 = this.getMenuBinding();
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
        keToolbarListMenuBinding4.setIsActiveLink(z1);
        KeToolbarListMenuBinding keToolbarListMenuBinding5 = this.getMenuBinding();
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
        keToolbarListMenuBinding5.setFontStyle(fontStyle0);
        KeToolbarListMenuBinding keToolbarListMenuBinding6 = this.getMenuBinding();
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
        keToolbarListMenuBinding6.setTextColor(colorType0);
        KeToolbarListMenuBinding keToolbarListMenuBinding7 = this.getMenuBinding();
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
        keToolbarListMenuBinding7.setTextBackgroundColor(colorType1);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemListBinding keItemListBinding0 = (KeItemListBinding)DataBindingUtil.bind(view0);
        if(keItemListBinding0 != null) {
            LinearLayout linearLayout0 = keItemListBinding0.keListItems;
            if(linearLayout0 != null) {
                linearLayout0.removeAllViews();
                int v1 = ((TextListItem)keditorItem0).getItems().size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    KeditorEditText keditorEditText0 = this.addItemView(view0, ((TextListItem)keditorItem0), ((TextListItemContent)((TextListItem)keditorItem0).getItems().get(v2)), v2, v);
                    if(keditorEditText0 != null && ((TextListItem)keditorItem0).getFocused() == v2 && !IntStandardKt.containsFlag(keditorState0.getState(), 2) && !IntStandardKt.containsFlag(keditorState0.getState(), 4)) {
                        keditorEditText0.setSelection(keditorEditText0.textLength(), keditorEditText0.textLength());
                        EditTextStandardKt.restoreFocus(keditorEditText0, ((TextItem)keditorItem0));
                    }
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
        KeItemListBinding keItemListBinding0 = (KeItemListBinding)DataBindingUtil.bind(view0);
        if(keItemListBinding0 != null) {
            TextListItem textListItem0 = null;
            LinearLayout linearLayout0 = keItemListBinding0.keListItems;
            if(linearLayout0 != null) {
                if(viewRequest0 instanceof ScrollToSpecificTextIndex) {
                    KeItemListContentBinding keItemListContentBinding0 = (KeItemListContentBinding)DataBindingUtil.bind(linearLayout0.getChildAt(((ScrollToSpecificTextIndex)viewRequest0).getInnerItemIndex()));
                    if(keItemListContentBinding0 != null) {
                        KeditorEditText keditorEditText0 = keItemListContentBinding0.keListItemContent;
                        if(keditorEditText0 != null) {
                            Intrinsics.checkNotNull(keditorEditText0);
                            this.renderEditTextScrollToOffset(keditorEditText0, ((ScrollToSpecificTextIndex)viewRequest0).getOffset());
                        }
                    }
                }
                else if(viewRequest0 instanceof ReplaceText) {
                    GrammarCheckTextItem grammarCheckTextItem0 = ((ReplaceText)viewRequest0).getItem();
                    if(grammarCheckTextItem0 instanceof TextListItem) {
                        textListItem0 = (TextListItem)grammarCheckTextItem0;
                    }
                    if(textListItem0 != null) {
                        TextListItemContent textListItemContent0 = (TextListItemContent)CollectionsKt___CollectionsKt.getOrNull(textListItem0.getItems(), ((ReplaceText)viewRequest0).getInnerIndex());
                        if(textListItemContent0 != null) {
                            SpannableStringBuilder spannableStringBuilder0 = textListItemContent0.getText();
                            if(spannableStringBuilder0 != null) {
                                spannableStringBuilder0.replace(((ReplaceText)viewRequest0).getStart(), ((ReplaceText)viewRequest0).getEnd(), ((ReplaceText)viewRequest0).getChangeText());
                            }
                        }
                    }
                }
                else if(viewRequest0 instanceof HighlightGrammarError) {
                    GrammarCheckTextItem grammarCheckTextItem1 = ((HighlightGrammarError)viewRequest0).getGrammarError().getItem();
                    if(grammarCheckTextItem1 instanceof TextListItem) {
                        textListItem0 = (TextListItem)grammarCheckTextItem1;
                    }
                    if(textListItem0 != null) {
                        TextListItemContent textListItemContent1 = (TextListItemContent)CollectionsKt___CollectionsKt.getOrNull(textListItem0.getItems(), ((HighlightGrammarError)viewRequest0).getGrammarError().getItemInnerIndex());
                        if(textListItemContent1 != null) {
                            textListItem0.setKeGrammarSpan(textListItemContent1.getText(), ((HighlightGrammarError)viewRequest0).getGrammarError().getStartIndex(), ((HighlightGrammarError)viewRequest0).getGrammarError().getLength(), ((HighlightGrammarError)viewRequest0).isFocused(), ((HighlightGrammarError)viewRequest0).getOnClickAction(), Keditor.INSTANCE.getContext());
                            RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(this.indexOf(textListItem0));
                            KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
                        }
                    }
                }
                else if(viewRequest0 instanceof ClearGrammarError) {
                    GrammarCheckTextItem grammarCheckTextItem2 = ((ClearGrammarError)viewRequest0).getGrammarError().getItem();
                    if(grammarCheckTextItem2 instanceof TextListItem) {
                        textListItem0 = (TextListItem)grammarCheckTextItem2;
                    }
                    if(textListItem0 != null) {
                        TextListItemContent textListItemContent2 = (TextListItemContent)CollectionsKt___CollectionsKt.getOrNull(textListItem0.getItems(), ((ClearGrammarError)viewRequest0).getGrammarError().getItemInnerIndex());
                        if(textListItemContent2 != null) {
                            textListItem0.clearKeGrammarSpansIn(textListItemContent2.getText(), ((ClearGrammarError)viewRequest0).getGrammarError().getStartIndex(), ((ClearGrammarError)viewRequest0).getGrammarError().getLength());
                            RefreshPosition viewRequest$RefreshPosition1 = new RefreshPosition(this.indexOf(textListItem0));
                            KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition1);
                        }
                    }
                }
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        View view0 = ((KeItemListBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false)).getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        return view0;
    }

    private final void removeItemView(View view0, TextListItem textListItem0, int v) {
        KeItemListBinding keItemListBinding0 = (KeItemListBinding)DataBindingUtil.bind(view0);
        LinearLayout linearLayout0 = keItemListBinding0 == null ? null : keItemListBinding0.keListItems;
        if(linearLayout0 != null) {
            linearLayout0.removeViewAt(v);
            this.updateItemViewIndices(view0, textListItem0);
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

    public final void setMenuBinding(@NotNull KeToolbarListMenuBinding keToolbarListMenuBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarListMenuBinding0, "<set-?>");
        this.menuBinding = keToolbarListMenuBinding0;
    }

    public final void setPlaceholderRes(int v) {
        this.placeholderRes = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((TextListItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull TextListItem textListItem0) {
        Intrinsics.checkNotNullParameter(textListItem0, "item");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("style", textListItem0.getValueOrBypass("style", textListItem0.getStyle()));
        Item cDM$Item0 = new Item("list", linkedHashMap0, null, 4, null);
        Iterable iterable0 = textListItem0.getItems();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(TextListItemContentSpec.INSTANCE.convertToCdmItem(((TextListItemContent)object0)));
        }
        cDM$Item0.setChildren(CollectionsKt___CollectionsKt.toMutableList(arrayList0));
        return cDM$Item0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public TextListItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        TextListItem textListItem0 = new TextListItem(false);
        textListItem0.setStyle(this.popValueOrDefault(map0, "style", "decimal", true));
        List list0 = cDM$Item0.getChildren();
        if(list0 != null) {
            for(Object object0: list0) {
                textListItem0.getItems().add(TextListItemContentSpec.INSTANCE.convertToKeditorItem(context0, ((Item)object0)));
            }
        }
        return textListItem0;
    }

    private final void updateItemViewIndices(View view0, TextListItem textListItem0) {
        KeItemListBinding keItemListBinding0 = (KeItemListBinding)DataBindingUtil.bind(view0);
        LinearLayout linearLayout0 = keItemListBinding0 == null ? null : keItemListBinding0.keListItems;
        if(linearLayout0 != null) {
            int v = textListItem0.getItems().size();
            for(int v1 = 0; v1 < v && linearLayout0.getChildAt(v1) != null; ++v1) {
                KeItemListContentBinding keItemListContentBinding0 = (KeItemListContentBinding)DataBindingUtil.bind(linearLayout0.getChildAt(v1));
                if(keItemListContentBinding0 != null) {
                    keItemListContentBinding0.setIndex(v1);
                }
                if(v1 == 0 && keItemListContentBinding0 != null) {
                    KeditorEditText keditorEditText0 = keItemListContentBinding0.keListItemContent;
                    if(keditorEditText0 != null) {
                        keditorEditText0.setHint(this.placeholderRes);
                    }
                }
            }
        }
    }
}

