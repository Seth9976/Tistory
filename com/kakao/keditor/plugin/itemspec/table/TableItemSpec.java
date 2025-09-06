package com.kakao.keditor.plugin.itemspec.table;

import android.content.Context;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.GridLayout.LayoutParams;
import android.widget.GridLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.room.a;
import com.google.android.material.datepicker.t;
import com.kakao.common.view.ScreenKt;
import com.kakao.common.view.SoftInputKt;
import com.kakao.keditor.BR;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.dimen;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.cdm.ImageAttribute;
import com.kakao.keditor.databinding.KeItemTableBinding;
import com.kakao.keditor.databinding.KeItemTableCellBinding;
import com.kakao.keditor.databinding.KeToolbarTableMenuBinding;
import com.kakao.keditor.delegate.ImageLoader;
import com.kakao.keditor.exception.NotMatchedModelException;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment.Left;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.AlignmentType.Others;
import com.kakao.keditor.plugin.attrs.text.CharacterSize;
import com.kakao.keditor.plugin.attrs.text.ColorType;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.attrs.text.ParagraphStyle;
import com.kakao.keditor.plugin.attrs.text.spans.KeBackgroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeBoldSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeForegroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeImageSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeItalicSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeStrikethroughSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeTypefaceSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeURLSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeUnderlineSpan;
import com.kakao.keditor.plugin.attrs.text.spans.Selection;
import com.kakao.keditor.plugin.attrs.text.spans.SpanUtil;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener.DefaultImpls;
import com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener;
import com.kakao.keditor.plugin.itemspec.paragraph.CommonTextStyle.Bold;
import com.kakao.keditor.plugin.itemspec.paragraph.CommonTextStyle.Italic;
import com.kakao.keditor.plugin.itemspec.paragraph.CommonTextStyle.Strikethrough;
import com.kakao.keditor.plugin.itemspec.paragraph.CommonTextStyle.Underline;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphPluginExtKt;
import com.kakao.keditor.plugin.itemspec.paragraph.overlay.ColorPickerOverlayMenu;
import com.kakao.keditor.plugin.itemspec.paragraph.overlay.FontStyleOverlayMenu;
import com.kakao.keditor.plugin.itemspec.paragraph.request.NextAlignment;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetFont;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetStyle;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextBackgroundColor;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextColor;
import com.kakao.keditor.plugin.itemspec.paragraph.request.SetTextLink;
import com.kakao.keditor.plugin.itemspec.table.overlay.TableStyleOverlayMenu;
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
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveFocusItem;
import com.kakao.keditor.util.eventbus.ViewRequest.UpdateRepresentState;
import com.kakao.keditor.util.eventbus.ViewRequest;
import com.kakao.keditor.widget.KeditorEditText.SelectionChangeListener;
import com.kakao.keditor.widget.KeditorEditText;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "table")
@Metadata(d1 = {"\u0000\u00DC\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u001C\u0010\'\u001A\u00020(2\b\u0010)\u001A\u0004\u0018\u00010*2\b\u0010+\u001A\u0004\u0018\u00010\u000BH\u0016J \u0010,\u001A\u00020\u00112\u0006\u0010-\u001A\u00020.2\u0006\u0010/\u001A\u00020\u00112\u0006\u00100\u001A\u00020\u0011H\u0002J\u0010\u00101\u001A\u00020(2\u0006\u00102\u001A\u000203H\u0016J$\u00104\u001A\u00020(2\u0006\u00105\u001A\u0002062\u0012\u00107\u001A\u000E\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020(08H\u0002J\b\u0010:\u001A\u00020;H\u0016J\u0012\u0010<\u001A\u0004\u0018\u00010=2\u0006\u0010>\u001A\u00020?H\u0002J\b\u0010@\u001A\u00020AH\u0016J\u0018\u0010B\u001A\u00020(2\u0006\u0010C\u001A\u00020D2\u0006\u0010E\u001A\u00020FH\u0002J(\u0010G\u001A\u00020(2\u0006\u0010+\u001A\u00020\u000B2\u0006\u0010)\u001A\u00020*2\u0006\u0010H\u001A\u00020\u00112\u0006\u0010I\u001A\u00020JH\u0016J\u001A\u0010K\u001A\u00020(2\b\u0010L\u001A\u0004\u0018\u00010\u000B2\u0006\u0010M\u001A\u00020NH\u0016J\u0018\u0010O\u001A\u00020\u000B2\u0006\u0010P\u001A\u00020Q2\u0006\u0010R\u001A\u00020SH\u0016J\u0010\u0010T\u001A\u00020U2\u0006\u0010)\u001A\u00020\u0002H\u0014J,\u0010V\u001A\u00020\u00022\u0006\u00102\u001A\u0002032\u0006\u0010)\u001A\u00020U2\u0012\u0010W\u001A\u000E\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020Y0XH\u0014J\"\u0010Z\u001A\u0004\u0018\u0001H[\"\u0006\b\u0000\u0010[\u0018\u0001*\b\u0012\u0004\u0012\u00020]0\\H\u0082\b\u00A2\u0006\u0002\u0010^J\u0014\u0010_\u001A\u00020(*\u00020=2\u0006\u0010`\u001A\u00020aH\u0002R\u001A\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\u00020\u000BX\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0016\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R&\u0010\u0019\u001A\u0014\u0012\u0004\u0012\u00020\u001B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0\u00060\u001AX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u001DR\u001A\u0010\u001E\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010\u0013\"\u0004\b \u0010\u0015R\u001A\u0010!\u001A\u00020\"X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&\u00A8\u0006b"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/table/TableItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/table/TableItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "childValidators", "", "Lcom/kakao/keditor/plugin/itemspec/ItemValidator;", "getChildValidators", "()Ljava/util/Set;", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarTableMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarTableMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarTableMenuBinding;)V", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "calculateInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "createContextMenu", "context", "Landroid/content/Context;", "findFocusedTableCell", "tableItems", "Landroid/widget/GridLayout;", "itemContent", "Lkotlin/Function1;", "Lcom/kakao/keditor/widget/KeditorEditText;", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "getDrawableFromFile", "Landroid/graphics/drawable/Drawable;", "file", "Ljava/io/File;", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "menuBindingSelectionChange", "cell", "Lcom/kakao/keditor/plugin/itemspec/table/TableCellItem;", "selectionChanged", "Lcom/kakao/keditor/util/eventbus/ItemSpecRequest$TextSelectionChanged;", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onRenderingRequest", "itemView", "request", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "find", "T", "", "Landroid/text/style/CharacterStyle;", "(Ljava/util/List;)Ljava/lang/Object;", "stretchWidthTo", "width", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTableItemSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/table/TableItemSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 5 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,583:1\n566#1:642\n566#1:644\n566#1:646\n1855#2,2:584\n1549#2:586\n1620#2,3:587\n2989#2,5:591\n1855#2:596\n350#2,7:597\n1855#2:604\n1856#2:625\n1856#2:626\n1747#2,3:627\n1747#2,3:630\n1747#2,3:633\n1747#2,3:636\n1747#2,3:639\n1#3:590\n1#3:643\n1#3:645\n1#3:647\n65#4:605\n77#4,4:606\n93#4,3:610\n136#5,12:613\n*S KotlinDebug\n*F\n+ 1 TableItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/table/TableItemSpec\n*L\n554#1:642\n557#1:644\n560#1:646\n98#1:584,2\n117#1:586\n117#1:587,3\n159#1:591,5\n163#1:596\n164#1:597,7\n168#1:604\n168#1:625\n163#1:626\n549#1:627,3\n550#1:630,3\n551#1:633,3\n552#1:636,3\n553#1:639,3\n554#1:643\n557#1:645\n560#1:647\n252#1:605\n252#1:606,4\n252#1:610,3\n281#1:613,12\n*E\n"})
public final class TableItemSpec extends RootItemSpec implements HasItemDecoration {
    @NotNull
    private final Set childValidators;
    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    @NotNull
    private final Map knownEnumValues;
    private int layout;
    public KeToolbarTableMenuBinding menuBinding;

    public TableItemSpec() {
        this.childValidators = e0.setOf(TableRowItemSpec.INSTANCE);
        this.knownEnumValues = x.mapOf(new Pair[]{TuplesKt.to("style", TableStyle.Companion.typeSet()), TuplesKt.to("align", Alignment.Companion.typeSet())});
        this.layout = layout.ke_item_table;
        this.contextMenulayout = layout.ke_toolbar_table_menu;
    }

    public static void a(KeItemTableCellBinding keItemTableCellBinding0, View view0) {
        TableItemSpec.onItemBound$lambda$24$lambda$23$lambda$22$lambda$19(keItemTableCellBinding0, view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        if(keditorItem0 instanceof TableItem && view0 != null) {
            ViewDataBinding viewDataBinding0 = DataBindingUtil.bind(view0);
            Intrinsics.checkNotNull(viewDataBinding0);
            this.getMenuBinding().setTableItem(((TableItem)keditorItem0));
            this.getMenuBinding().setTextMenuListener(new TextMenuClickListener() {
                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onAlignmentClicked(@NotNull Alignment alignment0) {
                    Alignment alignment1;
                    Intrinsics.checkNotNullParameter(alignment0, "alignment");
                    TableCellItem tableCellItem0 = keditorItem0.getMenuBinding().getCell();
                    Intrinsics.checkNotNullExpressionValue(this.$targetView.keTableItems, "keTableItems");
                    com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onAlignmentClicked.1 tableItemSpec$bind$1$onAlignmentClicked$10 = new Function1() {
                        final TableCellItem $targetCell;

                        {
                            this.$targetCell = tableCellItem0;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((KeditorEditText)object0));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull KeditorEditText keditorEditText0) {
                            Intrinsics.checkNotNullParameter(keditorEditText0, "it");
                            NextAlignment nextAlignment0 = new NextAlignment();
                            nextAlignment0.setFocusedItem(this.$targetCell);
                            ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorEditText0, nextAlignment0);
                        }
                    };
                    keditorItem0.findFocusedTableCell(this.$targetView.keTableItems, tableItemSpec$bind$1$onAlignmentClicked$10);
                    keditorItem0.getMenuBinding().setCell(tableCellItem0);
                    KeToolbarTableMenuBinding keToolbarTableMenuBinding0 = keditorItem0.getMenuBinding();
                    if(tableCellItem0 == null) {
                        alignment1 = Left.INSTANCE;
                    }
                    else {
                        alignment1 = tableCellItem0.getAlignment();
                        if(alignment1 == null) {
                            alignment1 = Left.INSTANCE;
                        }
                    }
                    keToolbarTableMenuBinding0.setAlignment(alignment1);
                    Keditor keditor0 = Keditor.INSTANCE;
                    if(tableCellItem0 != null) {
                        boolean z = tableCellItem0.getAlignment() != null;
                    }
                    Keditor.clickEvent$default(keditor0, "table-toolbar", "alignment", null, 4, null);
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
                    Intrinsics.checkNotNullExpressionValue(this.$targetView.keTableItems, "keTableItems");
                    com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onBoldClicked.1 tableItemSpec$bind$1$onBoldClicked$10 = new Function1() {
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
                    keditorItem0.findFocusedTableCell(this.$targetView.keTableItems, tableItemSpec$bind$1$onBoldClicked$10);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "table-toolbar", "bold", null, 4, null);
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
                                int v1 = TableItemSpec.this;
                                if(v1 == 0) {
                                    this.$targetView.getMenuBinding().setTextColor(colorType0);
                                    Intrinsics.checkNotNullExpressionValue(this.$item.keTableItems, "keTableItems");
                                    com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onColorPickerClicked.overlay.1.onOverlayMenuClicked.1 tableItemSpec$bind$1$onColorPickerClicked$overlay$1$onOverlayMenuClicked$10 = new Function1(this.$item) {
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
                                    this.$targetView.findFocusedTableCell(this.$item.keTableItems, tableItemSpec$bind$1$onColorPickerClicked$overlay$1$onOverlayMenuClicked$10);
                                }
                                else if(v1 == 1) {
                                    this.$targetView.getMenuBinding().setTextBackgroundColor(colorType0);
                                    Intrinsics.checkNotNullExpressionValue(this.$item.keTableItems, "keTableItems");
                                    com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onColorPickerClicked.overlay.1.onOverlayMenuClicked.2 tableItemSpec$bind$1$onColorPickerClicked$overlay$1$onOverlayMenuClicked$20 = new Function1(this.$item) {
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
                                    this.$targetView.findFocusedTableCell(this.$item.keTableItems, tableItemSpec$bind$1$onColorPickerClicked$overlay$1$onOverlayMenuClicked$20);
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
                    Keditor.clickEvent$default(Keditor.INSTANCE, "table-toolbar", (v == 0 ? "colorPalette" : "backColorPalette"), null, 4, null);
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
                                Intrinsics.checkNotNullExpressionValue(this.$item.keTableItems, "keTableItems");
                                com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onFontStyleClicked.overlay.1.onOverlayMenuClicked.1 tableItemSpec$bind$1$onFontStyleClicked$overlay$1$onOverlayMenuClicked$10 = new Function1(this.$targetView, this.$item) {
                                    final FontStyle $fontStyle;
                                    final KeditorItem $item;

                                    {
                                        this.$fontStyle = fontStyle0;
                                        TableItemSpec.this = tableItemSpec0;
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
                                        Context context0 = TableItemSpec.this.getMenuBinding().getRoot().getContext();
                                        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                                        Typeface typeface0 = this.$fontStyle.getTypeface(context0);
                                        SetFont setFont0 = new SetFont(this.$fontStyle.getFamilyName(), typeface0);
                                        setFont0.setFocusedItem(this.$item);
                                        ParagraphPluginExtKt.handleCommonTextRenderingRequest(keditorEditText0, setFont0);
                                    }
                                };
                                this.$targetView.findFocusedTableCell(this.$item.keTableItems, tableItemSpec$bind$1$onFontStyleClicked$overlay$1$onOverlayMenuClicked$10);
                                KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                                this.$targetView.getMenuBinding().setActiveOverlayCategory(null);
                                Context context0 = this.$targetView.getMenuBinding().getRoot().getContext();
                                Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                                String s = fontStyle0.getDescription(context0);
                                Keditor.INSTANCE.clickEvent("table-toolbar", "font", s);
                            }

                            @Override  // com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener
                            public void onOverlayMenuClicked(Object object0) {
                                this.onOverlayMenuClicked(((FontStyle)object0));
                            }
                        }, 14, null), overlayCategory$FontStyle0, false, 4, null);
                        KeEvent.INSTANCE.postInScope(toolbarRequest$ShowSoftInputOverlay0);
                        keditorItem0.getMenuBinding().setActiveOverlayCategory(overlayCategory$FontStyle0);
                    }
                    Keditor.clickEvent$default(Keditor.INSTANCE, "table-toolbar", "font", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onItalicClicked() {
                    Intrinsics.checkNotNullExpressionValue(this.$targetView.keTableItems, "keTableItems");
                    com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onItalicClicked.1 tableItemSpec$bind$1$onItalicClicked$10 = new Function1() {
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
                    keditorItem0.findFocusedTableCell(this.$targetView.keTableItems, tableItemSpec$bind$1$onItalicClicked$10);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "table-toolbar", "italic", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onLinkTextClicked() {
                    Intrinsics.checkNotNullExpressionValue(this.$targetView.keTableItems, "keTableItems");
                    keditorItem0.findFocusedTableCell(this.$targetView.keTableItems, com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onLinkTextClicked.1.INSTANCE);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "table-toolbar", "link", null, 4, null);

                    @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/widget/KeditorEditText;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
                    final class com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onLinkTextClicked.1 extends Lambda implements Function1 {
                        public static final com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onLinkTextClicked.1 INSTANCE;

                        static {
                            com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onLinkTextClicked.1.INSTANCE = new com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onLinkTextClicked.1();
                        }

                        public com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onLinkTextClicked.1() {
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
                    DefaultImpls.onListTypeClicked(this, s);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onParagraphSizeClicked(@NotNull ParagraphStyle paragraphStyle0) {
                    DefaultImpls.onParagraphSizeClicked(this, paragraphStyle0);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onRemoveMenuClicked() {
                    KeEvent.INSTANCE.postInScope(RemoveFocusItem.INSTANCE);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "table-toolbar", "remove", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onStrikeClicked() {
                    Intrinsics.checkNotNullExpressionValue(this.$targetView.keTableItems, "keTableItems");
                    com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onStrikeClicked.1 tableItemSpec$bind$1$onStrikeClicked$10 = new Function1() {
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
                    keditorItem0.findFocusedTableCell(this.$targetView.keTableItems, tableItemSpec$bind$1$onStrikeClicked$10);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "table-toolbar", "strikethrough", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onTableStylePickerClicked(@NotNull String s) {
                    Intrinsics.checkNotNullParameter(s, "styleName");
                    TableStyle tableStyle0 = TableStyle.Companion.getByName(s);
                    com.kakao.keditor.toolbar.category.OverlayCategory.TableStyle overlayCategory$TableStyle0 = com.kakao.keditor.toolbar.category.OverlayCategory.TableStyle.INSTANCE;
                    if(Intrinsics.areEqual(keditorItem0.getMenuBinding().getActiveOverlayCategory(), overlayCategory$TableStyle0)) {
                        keditorItem0.getMenuBinding().setActiveOverlayCategory(null);
                        KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                    }
                    else {
                        Context context0 = keditorItem0.getMenuBinding().getRoot().getContext();
                        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                        ShowSoftInputOverlay toolbarRequest$ShowSoftInputOverlay0 = new ShowSoftInputOverlay(new TableStyleOverlayMenu(context0, null, 0, 0, tableStyle0, new ToolbarOverlayMenuClickedListener() {
                            public void onOverlayMenuClicked(@NotNull TableStyle tableStyle0) {
                                Intrinsics.checkNotNullParameter(tableStyle0, "tableStyleItem");
                                ((TableItem)TableItemSpec.this).setStyle(tableStyle0);
                                TableItemSpec.this.getMenuBinding().setTableItem(((TableItem)TableItemSpec.this));
                                RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(TableItemSpec.this.indexOf(TableItemSpec.this));
                                KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
                                KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
                                TableItemSpec.this.getMenuBinding().setActiveOverlayCategory(null);
                                Keditor.INSTANCE.clickEvent("table-toolbar", "tablestyle", tableStyle0.getStyleName());
                            }

                            @Override  // com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener
                            public void onOverlayMenuClicked(Object object0) {
                                this.onOverlayMenuClicked(((TableStyle)object0));
                            }
                        }, 14, null), overlayCategory$TableStyle0, false, 4, null);
                        KeEvent.INSTANCE.postInScope(toolbarRequest$ShowSoftInputOverlay0);
                        keditorItem0.getMenuBinding().setActiveOverlayCategory(overlayCategory$TableStyle0);
                    }
                    Keditor.clickEvent$default(Keditor.INSTANCE, "table-toolbar", "tablestyle", null, 4, null);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onTextSizeClicked(@NotNull CharacterSize characterSize0) {
                    DefaultImpls.onTextSizeClicked(this, characterSize0);
                }

                @Override  // com.kakao.keditor.plugin.itemspec.menulistener.TextMenuClickListener
                public void onUnderlineClicked() {
                    Intrinsics.checkNotNullExpressionValue(this.$targetView.keTableItems, "keTableItems");
                    com.kakao.keditor.plugin.itemspec.table.TableItemSpec.bind.1.onUnderlineClicked.1 tableItemSpec$bind$1$onUnderlineClicked$10 = new Function1() {
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
                    keditorItem0.findFocusedTableCell(this.$targetView.keTableItems, tableItemSpec$bind$1$onUnderlineClicked$10);
                    Keditor.clickEvent$default(Keditor.INSTANCE, "table-toolbar", "underline", null, 4, null);
                }
            });
        }
    }

    private final int calculateInSampleSize(BitmapFactory.Options bitmapFactory$Options0, int v, int v1) {
        Pair pair0 = TuplesKt.to(bitmapFactory$Options0.outHeight, bitmapFactory$Options0.outWidth);
        int v2 = ((Number)pair0.component1()).intValue();
        int v3 = ((Number)pair0.component2()).intValue();
        int v4 = 1;
        if(v2 > v1 || v3 > v) {
            while(v2 / 2 / v4 >= v1 && v3 / 2 / v4 >= v) {
                v4 *= 2;
            }
        }
        return v4;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void createContextMenu(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), this.getContextMenulayout(), null, false);
        ((KeToolbarTableMenuBinding)viewDataBinding0).setActiveOverlayCategory(MorePlugin.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "apply(...)");
        this.setMenuBinding(((KeToolbarTableMenuBinding)viewDataBinding0));
        View view0 = this.getMenuBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setContextMenuLayoutView(view0);
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

    private final void findFocusedTableCell(GridLayout gridLayout0, Function1 function10) {
        int v = gridLayout0.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            KeItemTableCellBinding keItemTableCellBinding0 = (KeItemTableCellBinding)DataBindingUtil.bind(gridLayout0.getChildAt(v1));
            if(keItemTableCellBinding0 != null && (keItemTableCellBinding0.keTableCellContent != null && keItemTableCellBinding0.keTableCellContent.hasFocus())) {
                Intrinsics.checkNotNullExpressionValue(keItemTableCellBinding0.keTableCellContent, "keTableCellContent");
                function10.invoke(keItemTableCellBinding0.keTableCellContent);
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

    private final Drawable getDrawableFromFile(File file0) {
        try {
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file0.getPath(), bitmapFactory$Options0);
            bitmapFactory$Options0.inSampleSize = this.calculateInSampleSize(bitmapFactory$Options0, ScreenKt.getScreenWidth(Keditor.INSTANCE.getContext()), ScreenKt.getScreenHeight(Keditor.INSTANCE.getContext()));
            bitmapFactory$Options0.inJustDecodeBounds = false;
            return new BitmapDrawable(Keditor.INSTANCE.getContext().getResources(), BitmapFactory.decodeFile(file0.getPath(), bitmapFactory$Options0));
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            return null;
        }
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
    public final KeToolbarTableMenuBinding getMenuBinding() {
        KeToolbarTableMenuBinding keToolbarTableMenuBinding0 = this.menuBinding;
        if(keToolbarTableMenuBinding0 != null) {
            return keToolbarTableMenuBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuBinding");
        return null;
    }

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    @NotNull
    public ItemDecoration itemDecoration() {
        return TableItemDecoration.INSTANCE;
    }

    private final void menuBindingSelectionChange(TableCellItem tableCellItem0, TextSelectionChanged itemSpecRequest$TextSelectionChanged0) {
        ColorType colorType1;
        ColorType colorType0;
        FontStyle fontStyle0;
        Object object6;
        if(itemSpecRequest$TextSelectionChanged0.hasLength()) {
            this.getMenuBinding().setVariable(BR.displayMenu, Boolean.TRUE);
        }
        boolean z = false;
        this.getMenuBinding().setCell(tableCellItem0);
        KeToolbarTableMenuBinding keToolbarTableMenuBinding0 = this.getMenuBinding();
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
        keToolbarTableMenuBinding0.setIsActiveBold(z);
        KeToolbarTableMenuBinding keToolbarTableMenuBinding1 = this.getMenuBinding();
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
        keToolbarTableMenuBinding1.setIsActiveItalic(z2);
        KeToolbarTableMenuBinding keToolbarTableMenuBinding2 = this.getMenuBinding();
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
        keToolbarTableMenuBinding2.setIsActiveUnderLine(z3);
        KeToolbarTableMenuBinding keToolbarTableMenuBinding3 = this.getMenuBinding();
        Iterable iterable3 = itemSpecRequest$TextSelectionChanged0.getSpans();
        if(!(iterable3 instanceof Collection) || !((Collection)iterable3).isEmpty()) {
            for(Object object3: iterable3) {
                if(((CharacterStyle)object3) instanceof KeStrikethroughSpan) {
                    z4 = true;
                    break;
                }
            }
        }
        keToolbarTableMenuBinding3.setIsActiveStrike(z4);
        KeToolbarTableMenuBinding keToolbarTableMenuBinding4 = this.getMenuBinding();
        Iterable iterable4 = itemSpecRequest$TextSelectionChanged0.getSpans();
        if(!(iterable4 instanceof Collection) || !((Collection)iterable4).isEmpty()) {
            for(Object object4: iterable4) {
                if(!(((CharacterStyle)object4) instanceof KeURLSpan)) {
                    continue;
                }
                goto label_53;
            }
        }
        z1 = false;
    label_53:
        Object object5 = null;
        keToolbarTableMenuBinding4.setIsActiveLink(z1);
        KeToolbarTableMenuBinding keToolbarTableMenuBinding5 = this.getMenuBinding();
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
        keToolbarTableMenuBinding5.setFontStyle(fontStyle0);
        KeToolbarTableMenuBinding keToolbarTableMenuBinding6 = this.getMenuBinding();
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
        keToolbarTableMenuBinding6.setTextColor(colorType0);
        KeToolbarTableMenuBinding keToolbarTableMenuBinding7 = this.getMenuBinding();
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
        keToolbarTableMenuBinding7.setTextBackgroundColor(colorType1);
        this.getMenuBinding().setAlignment(itemSpecRequest$TextSelectionChanged0.getAlignment());
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        IntRef ref$IntRef1;
        int v30;
        Boolean boolean0;
        int v23;
        int v22;
        int v17;
        double f2;
        double f1;
        int v12;
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemTableBinding keItemTableBinding0 = (KeItemTableBinding)DataBindingUtil.bind(view0);
        if(keItemTableBinding0 == null) {
            keItemTableBinding0 = null;
        }
        else {
            keItemTableBinding0.setStyle(((TableItem)keditorItem0).getStyle());
        }
        int v1 = 0;
        for(Object object0: ((TableItem)keditorItem0).getRows()) {
            int v2 = 0;
            for(Object object1: ((TableRowItem)object0).getCells()) {
                Integer integer0 = ((TableCellItem)object1).getRowSpan();
                Integer integer1 = ((TableCellItem)object1).getColSpan();
                v2 += (integer0 == null ? 1 : ((int)integer0)) * (integer1 == null ? 1 : ((int)integer1));
            }
            v1 += v2;
        }
        int v3 = c.coerceAtLeast(((TableItem)keditorItem0).getColumnCount(), 1);
        int v4 = (int)Math.ceil(((double)v1) / ((double)v3));
        if(keItemTableBinding0 == null) {
            v12 = 0;
        }
        else {
            int v5 = keItemTableBinding0.getRoot().getResources().getDimensionPixelSize(dimen.ke_table_column_default_width);
            if(v3 < 3) {
                KeditorView keditorView0 = this.findKeditorView();
                if(keditorView0 != null) {
                    int v6 = keditorView0.getMeasuredWidth();
                    int v7 = keditorView0.getPaddingStart();
                    int v8 = keditorView0.getPaddingEnd();
                    int v9 = keItemTableBinding0.keTableScrollview.getPaddingEnd();
                    int v10 = keItemTableBinding0.keTableScrollview.getPaddingStart();
                    int v11 = keItemTableBinding0.keTableItems.getPaddingStart();
                    v5 = (v6 - (v8 + v7) - (keItemTableBinding0.keTableItems.getPaddingEnd() + (v11 + (v10 + v9)))) / v3;
                }
            }
            v12 = v5;
        }
        boolean[][] arr2_z = new boolean[v4][];
        for(int v13 = 0; v13 < v4; ++v13) {
            boolean[] arr_z = new boolean[v3];
            for(int v14 = 0; v14 < v3; ++v14) {
                arr_z[v14] = false;
            }
            arr2_z[v13] = arr_z;
        }
        if(keItemTableBinding0 != null) {
            GridLayout gridLayout0 = keItemTableBinding0.keTableItems;
            if(gridLayout0 != null) {
                gridLayout0.removeAllViews();
                gridLayout0.setColumnCount(v3);
                TableRowItem tableRowItem0 = (TableRowItem)CollectionsKt___CollectionsKt.firstOrNull(((TableItem)keditorItem0).getRows());
                if(tableRowItem0 == null) {
                    f2 = 100.0;
                }
                else {
                    List list0 = tableRowItem0.getCells();
                    if(list0 == null) {
                        f2 = 100.0;
                    }
                    else {
                        double f = 0.0;
                        for(Object object2: list0) {
                            TableCellItem tableCellItem0 = (TableCellItem)object2;
                            Double double0 = tableCellItem0.getWidthPercent();
                            if(double0 == null) {
                                Integer integer2 = tableCellItem0.getColSpan();
                                f1 = ((double)(integer2 == null ? 1 : ((int)integer2))) * (100.0 / ((double)v3));
                            }
                            else {
                                f1 = (double)double0;
                            }
                            f += f1;
                        }
                        f2 = f;
                    }
                }
                ArrayList arrayList0 = new ArrayList(v4 + 1);
                for(int v15 = 0; v15 < v4 + 1; ++v15) {
                    arrayList0.add(Boolean.FALSE);
                }
                arrayList0.set(0, Boolean.TRUE);
                for(Object object3: ((TableItem)keditorItem0).getRows()) {
                    int v16 = 0;
                    Iterator iterator4 = arrayList0.iterator();
                    while(true) {
                        v17 = -1;
                        if(iterator4.hasNext()) {
                            Object object4 = iterator4.next();
                            if(((Boolean)object4).booleanValue()) {
                                v17 = v16;
                            }
                            else {
                                ++v16;
                                continue;
                            }
                        }
                        break;
                    }
                    arrayList0.set(v17, Boolean.FALSE);
                    IntRef ref$IntRef0 = new IntRef();
                    for(Object object5: ((TableRowItem)object3).getCells()) {
                        TableCellItem tableCellItem1 = (TableCellItem)object5;
                        Integer integer3 = tableCellItem1.getRowSpan();
                        int v18 = v17 + (integer3 == null ? 1 : ((int)integer3));
                        if(v18 < arrayList0.size()) {
                            arrayList0.set(v18, Boolean.TRUE);
                        }
                        Double double1 = tableCellItem1.getWidthPercent();
                        double f3 = (double1 == null ? 0.0 : ((double)double1)) / f2;
                        if(f3 == 0.0) {
                            Integer integer4 = tableCellItem1.getColSpan();
                            f3 = ((double)(integer4 == null ? 1 : ((int)integer4))) / ((double)v3);
                        }
                        double f4 = f3 * ((double)(v12 * v3));
                        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(view0.getContext()), layout.ke_item_table_cell, gridLayout0, false);
                        Integer integer5 = ((TableItem)keditorItem0).getStyle().getStyleType$keditor_release().getFontColorRes(v17, ref$IntRef0.element);
                        ((KeItemTableCellBinding)viewDataBinding0).setFontColor(ContextCompat.getColor(view0.getContext(), (integer5 == null ? color.ke_color_text : ((int)integer5))));
                        ((KeItemTableCellBinding)viewDataBinding0).setCellWidth(f4);
                        while(true) {
                            int v19 = ref$IntRef0.element;
                            if(!arr2_z[v17][v19]) {
                                break;
                            }
                            ref$IntRef0.element = v19 + 1;
                        }
                        Integer integer6 = tableCellItem1.getRowSpan();
                        int v20 = integer6 == null ? 1 : ((int)integer6);
                        int v21 = 0;
                        while(v21 < v20) {
                            Integer integer7 = tableCellItem1.getColSpan();
                            if(integer7 == null) {
                                v22 = v20;
                                v23 = 1;
                            }
                            else {
                                v22 = v20;
                                v23 = (int)integer7;
                            }
                            for(int v24 = 0; v24 < v23; ++v24) {
                                arr2_z[c.coerceAtMost(v17 + v21, v4 - 1)][c.coerceAtMost(ref$IntRef0.element + v24, v3 - 1)] = true;
                            }
                            ++v21;
                            v20 = v22;
                        }
                        Integer integer8 = tableCellItem1.getRowSpan();
                        int v25 = integer8 == null ? 1 : ((int)integer8);
                        int v26 = v17;
                        while(v25 > 1) {
                            ++v26;
                            arr2_z[v26][ref$IntRef0.element] = true;
                            --v25;
                        }
                        ((KeItemTableCellBinding)viewDataBinding0).keTableCellBackground.setRowStartIdx(v17);
                        ((KeItemTableCellBinding)viewDataBinding0).keTableCellBackground.setColStartIdx(ref$IntRef0.element);
                        Integer integer9 = tableCellItem1.getRowSpan();
                        ((KeItemTableCellBinding)viewDataBinding0).keTableCellBackground.setRowSpan((integer9 == null ? 1 : ((int)integer9)));
                        Integer integer10 = tableCellItem1.getColSpan();
                        ((KeItemTableCellBinding)viewDataBinding0).keTableCellBackground.setColSpan((integer10 == null ? 1 : ((int)integer10)));
                        ((KeItemTableCellBinding)viewDataBinding0).keTableCellBackground.setTotalRow(v4);
                        ((KeItemTableCellBinding)viewDataBinding0).keTableCellBackground.setTotalCol(v3);
                        ((KeItemTableCellBinding)viewDataBinding0).keTableCellBackground.setStyle(((TableItem)keditorItem0).getStyle());
                        ((KeItemTableCellBinding)viewDataBinding0).setText(tableCellItem1.getText());
                        Intrinsics.checkNotNull(((KeItemTableCellBinding)viewDataBinding0).keTableCellContent);
                        tableCellItem1.getAlignment().into(((KeItemTableCellBinding)viewDataBinding0).keTableCellContent);
                        TableCellItem tableCellItem2 = tableCellItem1;
                        KeItemTableCellBinding keItemTableCellBinding0 = (KeItemTableCellBinding)viewDataBinding0;
                        com.kakao.keditor.plugin.itemspec.table.TableItemSpec.onItemBound.2.1.1.1.1 tableItemSpec$onItemBound$2$1$1$1$10 = new SelectionChangeListener() {
                            @Override  // com.kakao.keditor.widget.KeditorEditText$SelectionChangeListener
                            public void selectedChanged(@NotNull KeditorEditText keditorEditText0, int v, int v1) {
                                Intrinsics.checkNotNullParameter(keditorEditText0, "editText");
                                View view0 = tableCellItem1.getRoot();
                                Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                                KeditorItem keditorItem0 = keItemTableBinding0.getItem(view0);
                                Intrinsics.checkNotNull(keditorItem0);
                                if(((TableItem)keditorItem0) != null && !((TableItem)keditorItem0).getHasPendingFocus()) {
                                    ((TableItem)keditorItem0).setSelectionStart(v);
                                    ((TableItem)keditorItem0).setSelectionEnd(v1);
                                }
                                v17.setSelectionStart(v);
                                v17.setSelectionEnd(v1);
                                ((TableItem)keditorItem0).setFocusedCellPosition(new TablePosition(ref$IntRef0, ((KeItemTableCellBinding)viewDataBinding0).keTableCellContent.element));
                                Editable editable0 = keditorEditText0.getText();
                                if(editable0 == null) {
                                    return;
                                }
                                TableItemSpec tableItemSpec0 = keItemTableBinding0;
                                TableCellItem tableCellItem0 = v17;
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
                                Alignment alignment0 = v17 == null ? Left.INSTANCE : v17.getAlignment();
                                tableItemSpec0.menuBindingSelectionChange(tableCellItem0, new TextSelectionChanged(list1, editable0, alignment0, v, v1));
                            }
                        };
                        ((KeItemTableCellBinding)viewDataBinding0).keTableCellContent.setOnSelectionChanged(tableItemSpec$onItemBound$2$1$1$1$10);
                        Intrinsics.checkNotNullExpressionValue(keItemTableCellBinding0.keTableCellContent, "keTableCellContent");
                        com.kakao.keditor.plugin.itemspec.table.TableItemSpec.onItemBound.lambda.24.lambda.23.lambda.22..inlined.addTextChangedListener.default.1 tableItemSpec$onItemBound$lambda$24$lambda$23$lambda$22$$inlined$addTextChangedListener$default$10 = new TextWatcher() {
                            @Override  // android.text.TextWatcher
                            public void afterTextChanged(@Nullable Editable editable0) {
                                if(keItemTableCellBinding0.getTextDeletedFlag() && keItemTableCellBinding0.getEditingImageSpan() != null) {
                                    int v = keItemTableCellBinding0.getText().getSpanStart(keItemTableCellBinding0.getEditingImageSpan());
                                    int v1 = keItemTableCellBinding0.getText().getSpanEnd(keItemTableCellBinding0.getEditingImageSpan());
                                    if(v >= 0) {
                                        keItemTableCellBinding0.getText().removeSpan(keItemTableCellBinding0.getEditingImageSpan());
                                        keItemTableCellBinding0.getText().delete(v, v1);
                                        tableCellItem2.setText(keItemTableCellBinding0.getText());
                                    }
                                }
                                keItemTableCellBinding0.setTextDeletedFlag(false);
                                keItemTableCellBinding0.setEditingImageSpan(null);
                                Intrinsics.checkNotNull(editable0, "null cannot be cast to non-null type android.text.SpannableStringBuilder");
                                keItemTableCellBinding0.setText(((SpannableStringBuilder)editable0));
                            }

                            @Override  // android.text.TextWatcher
                            public void beforeTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
                                TableCellItem tableCellItem0 = this.$cell$inlined$1;
                                KeImageSpan keImageSpan0 = null;
                                Spannable spannable0 = charSequence0 instanceof Spannable ? ((Spannable)charSequence0) : null;
                                Class class0 = KeImageSpan.class;
                                if(spannable0 != null) {
                                    KeImageSpan[] arr_keImageSpan = (KeImageSpan[])spannable0.getSpans(v, v1 + v, class0);
                                    if(arr_keImageSpan != null) {
                                        Intrinsics.checkNotNull(arr_keImageSpan);
                                        keImageSpan0 = (KeImageSpan)ArraysKt___ArraysKt.firstOrNull(arr_keImageSpan);
                                    }
                                }
                                tableCellItem0.setEditingImageSpan(keImageSpan0);
                                if(this.$cell$inlined$1.getTextDeletedFlag() && this.$cell$inlined$1.getEditingImageSpan() != null) {
                                    int v3 = this.$cell$inlined$1.getText().length();
                                    Object[] arr_object = this.$cell$inlined$1.getText().getSpans(0, v3, class0);
                                    Intrinsics.checkNotNullExpressionValue(arr_object, "getSpans(...)");
                                    int v4 = ArraysKt___ArraysKt.indexOf(arr_object, this.$cell$inlined$1.getEditingImageSpan());
                                    if(v4 >= 0) {
                                        this.$cell$inlined$1.removeTableImageAt(v4);
                                    }
                                }
                            }

                            @Override  // android.text.TextWatcher
                            public void onTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
                            }
                        };
                        keItemTableCellBinding0.keTableCellContent.addTextChangedListener(tableItemSpec$onItemBound$lambda$24$lambda$23$lambda$22$$inlined$addTextChangedListener$default$10);
                        Keditor keditor0 = Keditor.INSTANCE;
                        Integer integer11 = this.getEditorId();
                        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer11, null) == null || !((Map)a.g(keditor0, integer11)).containsKey("set_keyboard_suggestion_off")) {
                            Object object7 = keditor0.getConfig().get("set_keyboard_suggestion_off");
                            if(!(object7 instanceof Boolean)) {
                                object7 = null;
                            }
                            boolean0 = (Boolean)object7;
                        }
                        else {
                            Object object6 = ((Map)a.g(keditor0, integer11)).get("set_keyboard_suggestion_off");
                            if(!(object6 instanceof Boolean)) {
                                object6 = null;
                            }
                            boolean0 = (Boolean)object6;
                        }
                        if(boolean0 == null) {
                            boolean0 = null;
                        }
                        if(Intrinsics.areEqual(boolean0, Boolean.TRUE)) {
                            keItemTableCellBinding0.keTableCellContent.setSuggestionOff();
                        }
                        GridLayout.LayoutParams gridLayout$LayoutParams0 = new GridLayout.LayoutParams();
                        Integer integer12 = tableCellItem2.getRowSpan();
                        gridLayout$LayoutParams0.rowSpec = GridLayout.spec(0x80000000, (integer12 == null ? 1 : ((int)integer12)));
                        Integer integer13 = tableCellItem2.getColSpan();
                        gridLayout$LayoutParams0.columnSpec = GridLayout.spec(0x80000000, (integer13 == null ? 1 : ((int)integer13)));
                        gridLayout$LayoutParams0.setGravity(0x77);
                        t t0 = new t(keItemTableCellBinding0, 3);
                        keItemTableCellBinding0.keTableCellBackground.setOnClickListener(t0);
                        gridLayout0.addView(keItemTableCellBinding0.getRoot(), gridLayout$LayoutParams0);
                        Object[] arr_object = tableCellItem2.getText().getSpans(0, tableCellItem2.getText().length(), KeImageSpan.class);
                        Intrinsics.checkNotNullExpressionValue(arr_object, "getSpans(...)");
                        KeImageSpan[] arr_keImageSpan = (KeImageSpan[])arr_object;
                        for(int v27 = 0; v27 < arr_keImageSpan.length; ++v27) {
                            KeImageSpan keImageSpan0 = arr_keImageSpan[v27];
                            ImageAttribute imageAttribute0 = keImageSpan0.getImageAttr();
                            int v28 = tableCellItem2.getText().getSpanStart(keImageSpan0);
                            int v29 = tableCellItem2.getText().getSpanEnd(keImageSpan0);
                            String s = imageAttribute0.getSrc();
                            if(s != null) {
                                ImageLoader imageLoader0 = Keditor.INSTANCE.getImageLoader();
                                if(imageLoader0 != null) {
                                    Context context0 = keItemTableBinding0.getRoot().getContext();
                                    Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
                                    imageLoader0.downloadImage(s, context0, new Function1(imageAttribute0, keItemTableCellBinding0, f4, tableCellItem2, keImageSpan0, v28, v29) {
                                        final ImageAttribute $attr;
                                        final TableCellItem $cell;
                                        final KeItemTableCellBinding $cellBinding;
                                        final double $cellWidth;
                                        final int $end;
                                        final KeImageSpan $span;
                                        final int $start;

                                        {
                                            TableItemSpec.this = tableItemSpec0;
                                            this.$attr = imageAttribute0;
                                            this.$cellBinding = keItemTableCellBinding0;
                                            this.$cellWidth = f;
                                            this.$cell = tableCellItem0;
                                            this.$span = keImageSpan0;
                                            this.$start = v;
                                            this.$end = v1;
                                            super(1);
                                        }

                                        // 检测为 Lambda 实现
                                        public static void a(TableItemSpec tableItemSpec0, Drawable drawable0, double f, KeItemTableCellBinding keItemTableCellBinding0, TableCellItem tableCellItem0, KeImageSpan keImageSpan0, KeImageSpan keImageSpan1, int v, int v1) [...]

                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            this.invoke(((File)object0));
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(@Nullable File file0) {
                                            if(file0 == null) {
                                                return;
                                            }
                                            Drawable drawable0 = TableItemSpec.this.getDrawableFromFile(file0);
                                            if(drawable0 != null) {
                                                KeImageSpan keImageSpan0 = new KeImageSpan(drawable0, this.$attr);
                                                com.kakao.keditor.plugin.itemspec.table.a a0 = () -> com.kakao.keditor.plugin.itemspec.table.TableItemSpec.onItemBound.2.1.1.5.1.invoke$lambda$1$lambda$0(TableItemSpec.this, drawable0, this.$cellWidth, this.$cellBinding, this.$cell, this.$span, keImageSpan0, this.$start, this.$end);
                                                this.$cellBinding.keTableCellContent.post(a0);
                                            }
                                        }

                                        private static final void invoke$lambda$1$lambda$0(TableItemSpec tableItemSpec0, Drawable drawable0, double f, KeItemTableCellBinding keItemTableCellBinding0, TableCellItem tableCellItem0, KeImageSpan keImageSpan0, KeImageSpan keImageSpan1, int v, int v1) {
                                            Intrinsics.checkNotNullParameter(tableItemSpec0, "this$0");
                                            Intrinsics.checkNotNullParameter(drawable0, "$drawable");
                                            Intrinsics.checkNotNullParameter(tableCellItem0, "$cell");
                                            Intrinsics.checkNotNullParameter(keImageSpan1, "$newSpan");
                                            Intrinsics.checkNotNullExpressionValue(keItemTableCellBinding0.keTableCellContent, "keTableCellContent");
                                            ViewGroup.LayoutParams viewGroup$LayoutParams0 = keItemTableCellBinding0.keTableCellContent.getLayoutParams();
                                            int v2 = 0;
                                            int v3 = viewGroup$LayoutParams0 instanceof ViewGroup.MarginLayoutParams ? MarginLayoutParamsCompat.getMarginStart(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0)) : 0;
                                            Intrinsics.checkNotNullExpressionValue(keItemTableCellBinding0.keTableCellContent, "keTableCellContent");
                                            ViewGroup.LayoutParams viewGroup$LayoutParams1 = keItemTableCellBinding0.keTableCellContent.getLayoutParams();
                                            if(viewGroup$LayoutParams1 instanceof ViewGroup.MarginLayoutParams) {
                                                v2 = MarginLayoutParamsCompat.getMarginEnd(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams1));
                                            }
                                            tableItemSpec0.stretchWidthTo(drawable0, f - ((double)v3) - ((double)v2));
                                            tableCellItem0.getText().removeSpan(keImageSpan0);
                                            tableCellItem0.getText().setSpan(keImageSpan1, v, v1, 33);
                                            keItemTableCellBinding0.setText(tableCellItem0.getText());
                                        }
                                    });
                                }
                            }
                        }
                        if(v == keditorState0.getFocusedItemPosition()) {
                            v30 = v17;
                            if(v30 == ((TableItem)keditorItem0).getFocusedCellPosition().getRow()) {
                                ref$IntRef1 = ref$IntRef0;
                                if(ref$IntRef1.element == ((TableItem)keditorItem0).getFocusedCellPosition().getCol() && !IntStandardKt.containsFlag(keditorState0.getState(), 2) && !IntStandardKt.containsFlag(keditorState0.getState(), 4)) {
                                    ((TableItem)keditorItem0).setFocusedCellPosition(new TablePosition(-1, -1));
                                    KeditorEditText keditorEditText0 = keItemTableCellBinding0.keTableCellContent;
                                    Integer integer14 = tableCellItem2.getSelectionStart();
                                    if(integer14 == null) {
                                        SpannableStringBuilder spannableStringBuilder0 = keItemTableCellBinding0.getText();
                                        integer14 = spannableStringBuilder0 == null ? null : spannableStringBuilder0.length();
                                    }
                                    Integer integer15 = tableCellItem2.getSelectionEnd();
                                    if(integer15 == null) {
                                        SpannableStringBuilder spannableStringBuilder1 = keItemTableCellBinding0.getText();
                                        integer15 = spannableStringBuilder1 == null ? null : spannableStringBuilder1.length();
                                    }
                                    keditorEditText0.requestPendingFocusAndSelection((integer14 == null ? 0 : ((int)integer14)), (integer15 == null ? 0 : ((int)integer15)));
                                    tableCellItem2.clearSelection();
                                }
                            }
                            else {
                                ref$IntRef1 = ref$IntRef0;
                            }
                        }
                        else {
                            v30 = v17;
                            ref$IntRef1 = ref$IntRef0;
                        }
                        ++ref$IntRef1.element;
                        ref$IntRef0 = ref$IntRef1;
                        v17 = v30;
                    }
                }
            }
        }
    }

    private static final void onItemBound$lambda$24$lambda$23$lambda$22$lambda$19(KeItemTableCellBinding keItemTableCellBinding0, View view0) {
        KeditorEditText keditorEditText0 = keItemTableCellBinding0.keTableCellContent;
        Editable editable0 = keditorEditText0.getText();
        if(editable0 != null) {
            Intrinsics.checkNotNull(editable0);
            keditorEditText0.requestFocus();
            keditorEditText0.setSelection(editable0.length(), editable0.length());
            Context context0 = keditorEditText0.getContext();
            Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
            SoftInputKt.showSoftInput$default(context0, false, 1, null);
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public void onRenderingRequest(@Nullable View view0, @NotNull ViewRequest viewRequest0) {
        Intrinsics.checkNotNullParameter(viewRequest0, "request");
        if(viewRequest0 instanceof UpdateRepresentState) {
            KeditorItem keditorItem0 = ((UpdateRepresentState)viewRequest0).getItem();
            TableItem tableItem0 = keditorItem0 instanceof TableItem ? ((TableItem)keditorItem0) : null;
            if(tableItem0 != null) {
                if(!((UpdateRepresentState)viewRequest0).isSet()) {
                    tableItem0.clearRepresentationImage();
                }
                RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(((UpdateRepresentState)viewRequest0).getPosition());
                KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        View view0 = ((KeItemTableBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false)).getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        return view0;
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

    public final void setMenuBinding(@NotNull KeToolbarTableMenuBinding keToolbarTableMenuBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarTableMenuBinding0, "<set-?>");
        this.menuBinding = keToolbarTableMenuBinding0;
    }

    private final void stretchWidthTo(Drawable drawable0, double f) {
        if(drawable0.getIntrinsicWidth() > 0 && drawable0.getIntrinsicHeight() > 0) {
            drawable0.setBounds(0, 0, ((int)f), ((int)(((double)drawable0.getIntrinsicHeight()) * f / ((double)drawable0.getIntrinsicWidth()))));
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((TableItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull TableItem tableItem0) {
        Intrinsics.checkNotNullParameter(tableItem0, "item");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("style", tableItem0.getValueOrBypass("style", a.k(Locale.ROOT, "ROOT", tableItem0.getStyle().getStyleName(), Locale.ROOT, "toLowerCase(...)")));
        linkedHashMap0.put("width", (tableItem0.getWidthPercent() == null ? "" : tableItem0.getWidthPercent()));
        linkedHashMap0.put("align", tableItem0.getValueOrBypass("align", "alignAlignment"));
        Item cDM$Item0 = new Item("table", linkedHashMap0, null, 4, null);
        Iterable iterable0 = tableItem0.getRows();
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(TableRowItemSpec.INSTANCE.convertToCdmItem(((TableRowItem)object0)));
        }
        cDM$Item0.setChildren(CollectionsKt___CollectionsKt.toMutableList(arrayList0));
        return cDM$Item0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public TableItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        TableItem tableItem0 = new TableItem();
        List list0 = cDM$Item0.getChildren();
        String s = null;
        if(list0 != null) {
            for(Object object0: list0) {
                KeditorItem keditorItem0 = TableRowItemSpec.INSTANCE.convertToKeditorItem(context0, ((Item)object0));
                TableRowItem tableRowItem0 = keditorItem0 instanceof TableRowItem ? ((TableRowItem)keditorItem0) : null;
                if(tableRowItem0 == null) {
                    throw new NotMatchedModelException();
                }
                tableItem0.getRows().add(tableRowItem0);
            }
        }
        String s1 = com.kakao.keditor.plugin.itemspec.ItemValidator.DefaultImpls.popValueOrDefault$default(this, map0, "style", "style0", false, 8, null);
        tableItem0.setStyle(TableStyle.Companion.getByName(s1));
        Object object1 = ItemValidatorKt.pop(map0, "width", true);
        if(object1 instanceof String) {
            s = (String)object1;
        }
        tableItem0.setWidthPercent(s);
        String s2 = this.popValueOrDefault(map0, "align", "alignCenter", true);
        tableItem0.setAlignment(Alignment.Companion.byNameText(s2, Others.INSTANCE));
        return tableItem0;
    }
}

