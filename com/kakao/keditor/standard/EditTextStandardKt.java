package com.kakao.keditor.standard;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.plugin.attrs.text.ParagraphStyle;
import com.kakao.keditor.plugin.attrs.text.SpanRange;
import com.kakao.keditor.plugin.attrs.text.spans.KeURLSpan;
import com.kakao.keditor.plugin.attrs.text.spans.Selection;
import com.kakao.keditor.plugin.attrs.text.spans.SpanUtil;
import com.kakao.keditor.plugin.common.LinkFormDialog.Companion;
import com.kakao.keditor.plugin.common.LinkFormDialog;
import com.kakao.keditor.plugin.itemspec.KeditorBridge;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItem;
import com.kakao.keditor.plugin.itemspec.paragraph.TextItem;
import com.kakao.keditor.util.SimpleTextWatcher;
import com.kakao.keditor.widget.KeditorEditText.SelectionChangeListener;
import com.kakao.keditor.widget.KeditorEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.c;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u009C\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A,\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u0004\u001A\u0012\u0010\t\u001A\u00020\u0001*\u00020\n2\u0006\u0010\u000B\u001A\u00020\f\u001A\u0015\u0010\r\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u000FH\u0086\u0004\u001A\n\u0010\u0010\u001A\u00020\u0001*\u00020\u0011\u001AV\u0010\u0012\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00162:\b\u0002\u0010\u0017\u001A4\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0018\u001A\u0015\u0010\u001B\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u001C\u001A\u00020\u001DH\u0086\u0004\u001A\u0015\u0010\u001E\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u001FH\u0086\u0004\u001A\u0015\u0010 \u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u001FH\u0086\u0004\u001A\u001C\u0010!\u001A\u00020\"*\u00020#2\u0006\u0010$\u001A\u00020\u00042\u0006\u0010%\u001A\u00020\u0004H\u0000\u001A\u001C\u0010&\u001A\u00020\'*\u00020#2\u0006\u0010(\u001A\u00020\"2\u0006\u0010)\u001A\u00020\u0004H\u0000\u001A\u0095\u0001\u0010*\u001A\u00020\u0001*\u00020#2\u0088\u0001\u0010*\u001A\u0083\u0001\u0012\u0013\u0012\u00110\f\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u000B\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(,\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(-\u0012\'\u0012%\u0012\u0013\u0012\u00110/\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020\u0001\u0018\u00010.j\u0004\u0018\u0001`10+j\u0002`2\u001AY\u00103\u001A\u00020\u0001*\u00020#2K\u00104\u001AG\u0012\u0013\u0012\u001106\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(7\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(8\u0012\u0013\u0012\u00110\u0004\u00A2\u0006\f\b\u0019\u0012\b\b\u001A\u0012\u0004\b\b(9\u0012\u0004\u0012\u00020\u000105H\u0000\u001A\u0015\u0010:\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u000E\u001A\u00020\u000FH\u0086\u0004\u00A8\u0006;"}, d2 = {"addUrlSpan", "", "Lcom/kakao/keditor/widget/KeditorEditText;", "start", "", "end", "url", "", "cursorOffset", "appendWithoutExpandingSpans", "Landroid/text/SpannableStringBuilder;", "text", "", "applyAlignment", "item", "Lcom/kakao/keditor/plugin/itemspec/paragraph/TextItem;", "applyCustomFont", "Landroid/widget/TextView;", "applyDefaultOnSelectionChanged", "itemSpec", "Lcom/kakao/keditor/plugin/itemspec/KeditorBridge;", "root", "Landroid/view/View;", "additional", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "applyParagraphStyle", "paragraphStyle", "Lcom/kakao/keditor/plugin/attrs/text/ParagraphStyle;", "applyPendingStyle", "Lcom/kakao/keditor/plugin/itemspec/paragraph/ParagraphItem;", "applyText", "getURLSpan", "Lcom/kakao/keditor/plugin/attrs/text/spans/KeURLSpan;", "Landroid/widget/EditText;", "startIndex", "endIndex", "getURLSpanRange", "Lcom/kakao/keditor/plugin/attrs/text/SpanRange;", "urlSpan", "position", "onTextChanged", "Lkotlin/Function4;", "count", "after", "Lkotlin/Function1;", "Landroid/text/Editable;", "s", "Lcom/kakao/keditor/delegate/AfterTextChanged;", "Lcom/kakao/keditor/delegate/OnTextChanged;", "openLinkDialog", "applyStyle", "Lkotlin/Function3;", "Landroid/text/style/CharacterStyle;", "requestSpan", "linkStartIndex", "linkEndIndex", "restoreFocus", "keditor_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditTextStandard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditTextStandard.kt\ncom/kakao/keditor/standard/EditTextStandardKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,215:1\n1#2:216\n1855#3,2:217\n*S KotlinDebug\n*F\n+ 1 EditTextStandard.kt\ncom/kakao/keditor/standard/EditTextStandardKt\n*L\n206#1:217,2\n*E\n"})
public final class EditTextStandardKt {
    public static final void addUrlSpan(@NotNull KeditorEditText keditorEditText0, int v, int v1, @NotNull String s, int v2) {
        Intrinsics.checkNotNullParameter(keditorEditText0, "<this>");
        Intrinsics.checkNotNullParameter(s, "url");
        int v3 = keditorEditText0.getSelectionEnd();
        keditorEditText0.setSelection(v, v1);
        KeditorEditText.requestSetStyleSpan$default(keditorEditText0, new KeURLSpan(s, null, null, 6, null), null, null, 6, null);
        keditorEditText0.setSelection(v3 + v2);
    }

    public static void addUrlSpan$default(KeditorEditText keditorEditText0, int v, int v1, String s, int v2, int v3, Object object0) {
        if((v3 & 8) != 0) {
            v2 = 0;
        }
        EditTextStandardKt.addUrlSpan(keditorEditText0, v, v1, s, v2);
    }

    public static final void appendWithoutExpandingSpans(@NotNull SpannableStringBuilder spannableStringBuilder0, @NotNull CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        Selection selection0 = new Selection(spannableStringBuilder0.length() - 1, spannableStringBuilder0.length());
        for(Object object0: SpanUtil.INSTANCE.getSpans(spannableStringBuilder0, selection0)) {
            CharacterStyle characterStyle0 = SpanUtil.INSTANCE.newSpan(((CharacterStyle)object0));
            int v = spannableStringBuilder0.getSpanStart(((CharacterStyle)object0));
            int v1 = spannableStringBuilder0.getSpanEnd(((CharacterStyle)object0));
            spannableStringBuilder0.removeSpan(((CharacterStyle)object0));
            spannableStringBuilder0.setSpan(characterStyle0, v, v1, 33);
        }
        spannableStringBuilder0.append(charSequence0);
        SpanUtil.INSTANCE.updateRangeFlag(spannableStringBuilder0);
    }

    public static final void applyAlignment(@NotNull KeditorEditText keditorEditText0, @NotNull TextItem textItem0) {
        Intrinsics.checkNotNullParameter(keditorEditText0, "<this>");
        Intrinsics.checkNotNullParameter(textItem0, "item");
        textItem0.getAlignment().into(keditorEditText0);
    }

    public static final void applyCustomFont(@NotNull TextView textView0) {
        Intrinsics.checkNotNullParameter(textView0, "<this>");
        textView0.setTypeface(Keditor.INSTANCE.getCustomFont());
    }

    public static final void applyDefaultOnSelectionChanged(@NotNull KeditorEditText keditorEditText0, @NotNull KeditorBridge keditorBridge0, @NotNull View view0, @Nullable Function2 function20) {
        Intrinsics.checkNotNullParameter(keditorEditText0, "<this>");
        Intrinsics.checkNotNullParameter(keditorBridge0, "itemSpec");
        Intrinsics.checkNotNullParameter(view0, "root");
        keditorEditText0.setOnSelectionChanged(new SelectionChangeListener() {
            @Override  // com.kakao.keditor.widget.KeditorEditText$SelectionChangeListener
            public void selectedChanged(@NotNull KeditorEditText keditorEditText0, int v, int v1) {
                Intrinsics.checkNotNullParameter(keditorEditText0, "editText");
                com.kakao.keditor.standard.EditTextStandardKt.applyDefaultOnSelectionChanged.1.selectedChanged.1 editTextStandardKt$applyDefaultOnSelectionChanged$1$selectedChanged$10 = new Function1(v1) {
                    final int $end;
                    final int $start;

                    {
                        this.$start = v;
                        this.$end = v1;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((TextItem)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull TextItem textItem0) {
                        Intrinsics.checkNotNullParameter(textItem0, "it");
                        if(!textItem0.getHasPendingFocus()) {
                            textItem0.setSelectionStart(this.$start);
                            textItem0.setSelectionEnd(this.$end);
                        }
                    }
                };
                keditorBridge0.ifFoundItem(view0, editTextStandardKt$applyDefaultOnSelectionChanged$1$selectedChanged$10);
                Function2 function20 = function20;
                if(function20 != null) {
                    function20.invoke(v, v1);
                }
            }
        });
    }

    public static void applyDefaultOnSelectionChanged$default(KeditorEditText keditorEditText0, KeditorBridge keditorBridge0, View view0, Function2 function20, int v, Object object0) {
        if((v & 4) != 0) {
            function20 = null;
        }
        EditTextStandardKt.applyDefaultOnSelectionChanged(keditorEditText0, keditorBridge0, view0, function20);
    }

    public static final void applyParagraphStyle(@NotNull KeditorEditText keditorEditText0, @NotNull ParagraphStyle paragraphStyle0) {
        Intrinsics.checkNotNullParameter(keditorEditText0, "<this>");
        Intrinsics.checkNotNullParameter(paragraphStyle0, "paragraphStyle");
        keditorEditText0.setTextSize(2, ((float)paragraphStyle0.getFontSize()));
        keditorEditText0.setLineSpacing(paragraphStyle0.getLineHeight(), 1.0f);
    }

    public static final void applyPendingStyle(@NotNull KeditorEditText keditorEditText0, @NotNull ParagraphItem paragraphItem0) {
        Intrinsics.checkNotNullParameter(keditorEditText0, "<this>");
        Intrinsics.checkNotNullParameter(paragraphItem0, "item");
        CharacterStyle characterStyle0 = paragraphItem0.getPendingStyle();
        if(characterStyle0 != null) {
            KeditorEditText.requestSetStyleSpan$default(keditorEditText0, characterStyle0, null, null, 6, null);
            paragraphItem0.consumePendingStyle();
        }
    }

    public static final void applyText(@NotNull KeditorEditText keditorEditText0, @NotNull ParagraphItem paragraphItem0) {
        Intrinsics.checkNotNullParameter(keditorEditText0, "<this>");
        Intrinsics.checkNotNullParameter(paragraphItem0, "item");
        keditorEditText0.setText(paragraphItem0.getText());
        keditorEditText0.setSelection(c.coerceIn(paragraphItem0.getSelectionStart(), 0, paragraphItem0.getText().length()), c.coerceIn(paragraphItem0.getSelectionEnd(), 0, paragraphItem0.getText().length()));
    }

    @NotNull
    public static final KeURLSpan getURLSpan(@NotNull EditText editText0, int v, int v1) {
        Intrinsics.checkNotNullParameter(editText0, "<this>");
        Editable editable0 = editText0.getText();
        Intrinsics.checkNotNullExpressionValue(editable0, "getText(...)");
        Selection selection0 = new Selection(v, v1);
        for(Object object0: SpanUtil.INSTANCE.getSpans(editable0, selection0)) {
            if(((CharacterStyle)object0) instanceof KeURLSpan) {
                return ((CharacterStyle)object0) == null ? new KeURLSpan("", null, null, 6, null) : ((KeURLSpan)(((CharacterStyle)object0)));
            }
            if(false) {
                break;
            }
        }
        return new KeURLSpan("", null, null, 6, null);
    }

    @NotNull
    public static final SpanRange getURLSpanRange(@NotNull EditText editText0, @NotNull KeURLSpan keURLSpan0, int v) {
        Intrinsics.checkNotNullParameter(editText0, "<this>");
        Intrinsics.checkNotNullParameter(keURLSpan0, "urlSpan");
        int v1 = v;
        if(v >= 0) {
            int v2 = v1;
            while(true) {
                if(!Intrinsics.areEqual(EditTextStandardKt.getURLSpan(editText0, v1, v1).getUrl(), keURLSpan0.getUrl())) {
                    v1 = v2;
                    break;
                }
                if(v1 - 1 < 0) {
                    break;
                }
                v2 = v1;
                --v1;
            }
        }
        IntProgression intProgression0 = c.step(c.until(v, editText0.length() + 1), 1);
        int v3 = intProgression0.getFirst();
        int v4 = intProgression0.getLast();
        int v5 = intProgression0.getStep();
        if(v5 > 0 && v3 <= v4 || v5 < 0 && v4 <= v3) {
            while(true) {
                int v6 = v;
                v = v3;
                if(!Intrinsics.areEqual(EditTextStandardKt.getURLSpan(editText0, v, v).getUrl(), keURLSpan0.getUrl())) {
                    v = v6;
                    break;
                }
                if(v == v4) {
                    break;
                }
                v3 = v + v5;
            }
        }
        return new SpanRange(v1, v);
    }

    public static final void onTextChanged(@NotNull EditText editText0, @NotNull Function4 function40) {
        Intrinsics.checkNotNullParameter(editText0, "<this>");
        Intrinsics.checkNotNullParameter(function40, "onTextChanged");
        editText0.addTextChangedListener(new SimpleTextWatcher() {
            @Nullable
            private Function1 pendingAfterTextChanged;

            @Override  // com.kakao.keditor.util.SimpleTextWatcher
            public void afterTextChanged(@NotNull Editable editable0) {
                Intrinsics.checkNotNullParameter(editable0, "s");
                Function1 function10 = this.pendingAfterTextChanged;
                if(function10 != null) {
                    function10.invoke(editable0);
                    this.pendingAfterTextChanged = null;
                }
            }

            @Nullable
            public final Function1 getPendingAfterTextChanged() {
                return this.pendingAfterTextChanged;
            }

            @Override  // com.kakao.keditor.util.SimpleTextWatcher
            public void onTextChanged(@NotNull CharSequence charSequence0, int v, int v1, int v2) {
                Intrinsics.checkNotNullParameter(charSequence0, "text");
                this.pendingAfterTextChanged = (Function1)function40.invoke(charSequence0, v, v1, v2);
            }

            public final void setPendingAfterTextChanged(@Nullable Function1 function10) {
                this.pendingAfterTextChanged = function10;
            }
        });
    }

    public static final void openLinkDialog(@NotNull EditText editText0, @NotNull Function3 function30) {
        Intrinsics.checkNotNullParameter(editText0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "applyStyle");
        if(!(editText0.getContext() instanceof AppCompatActivity)) {
            return;
        }
        IntRef ref$IntRef0 = new IntRef();
        ref$IntRef0.element = editText0.getSelectionStart();
        IntRef ref$IntRef1 = new IntRef();
        int v = editText0.getSelectionEnd();
        ref$IntRef1.element = v;
        int v1 = ref$IntRef0.element;
        if(v1 > v) {
            ref$IntRef1.element = v1;
            ref$IntRef0.element = v;
        }
        KeURLSpan keURLSpan0 = EditTextStandardKt.getURLSpan(editText0, ref$IntRef0.element, ref$IntRef1.element);
        Editable editable0 = editText0.getText();
        Intrinsics.checkNotNullExpressionValue(editable0, "getText(...)");
        String s = editable0.subSequence(ref$IntRef0.element, ref$IntRef1.element).toString();
        if(keURLSpan0.getUrl().length() > 0) {
            int v2 = ref$IntRef0.element;
            if(v2 == ref$IntRef1.element) {
                SpanRange spanRange0 = EditTextStandardKt.getURLSpanRange(editText0, keURLSpan0, v2);
                Editable editable1 = editText0.getText();
                Intrinsics.checkNotNullExpressionValue(editable1, "getText(...)");
                s = editable1.subSequence(spanRange0.getStartIndex(), spanRange0.getEndIndex()).toString();
            }
        }
        String s1 = StringsKt__StringsKt.trim(s).toString();
        com.kakao.keditor.standard.EditTextStandardKt.openLinkDialog.2 editTextStandardKt$openLinkDialog$20 = new Function2(editText0, ref$IntRef0, ref$IntRef1, keURLSpan0, function30) {
            final Function3 $applyStyle;
            final IntRef $endIndex;
            final IntRef $startIndex;
            final EditText $this_openLinkDialog;
            final KeURLSpan $urlSpan;

            {
                this.$this_openLinkDialog = editText0;
                this.$startIndex = ref$IntRef0;
                this.$endIndex = ref$IntRef1;
                this.$urlSpan = keURLSpan0;
                this.$applyStyle = function30;
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                this.invoke(((String)object0), ((String)object1));
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable String s, @NotNull String s1) {
                KeURLSpan keURLSpan0;
                Intrinsics.checkNotNullParameter(s1, "linkTitle");
                this.$this_openLinkDialog.requestFocus();
                if(this.$startIndex.element != this.$endIndex.element) {
                    this.$this_openLinkDialog.getText().replace(this.$startIndex.element, this.$endIndex.element, s1);
                    int v1 = this.$startIndex.element;
                    this.$this_openLinkDialog.setSelection(v1, s1.length() + v1);
                }
                else if(this.$urlSpan.getUrl().length() > 0) {
                    SpanRange spanRange0 = EditTextStandardKt.getURLSpanRange(this.$this_openLinkDialog, this.$urlSpan, this.$startIndex.element);
                    this.$this_openLinkDialog.getText().replace(spanRange0.getStartIndex(), s1.length() + spanRange0.getStartIndex(), s1);
                    this.$this_openLinkDialog.setSelection(spanRange0.getStartIndex(), spanRange0.getEndIndex());
                }
                else {
                    this.$this_openLinkDialog.getText().replace(this.$startIndex.element, this.$endIndex.element, s1);
                    int v = this.$startIndex.element;
                    this.$this_openLinkDialog.setSelection(v, s1.length() + v);
                }
                if(s == null) {
                    keURLSpan0 = new KeURLSpan(null, null, null, 6, null);
                }
                else {
                    keURLSpan0 = s.length() != 0 || this.$urlSpan.getUrl().length() <= 0 ? new KeURLSpan(s, this.$urlSpan.isLinkNewWindow(), this.$urlSpan.getLinkTitle()) : this.$urlSpan;
                }
                Integer integer0 = this.$this_openLinkDialog.getSelectionStart();
                Integer integer1 = this.$this_openLinkDialog.getSelectionEnd();
                this.$applyStyle.invoke(keURLSpan0, integer0, integer1);
            }
        };
        LinkFormDialog linkFormDialog0 = Companion.newInstance$default(LinkFormDialog.Companion, s1, keURLSpan0.getUrl(), false, editTextStandardKt$openLinkDialog$20, 4, null);
        Context context0 = editText0.getContext();
        Intrinsics.checkNotNull(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        linkFormDialog0.show(((AppCompatActivity)context0).getSupportFragmentManager(), "LinkFormDialog");
    }

    public static final void restoreFocus(@NotNull KeditorEditText keditorEditText0, @NotNull TextItem textItem0) {
        Intrinsics.checkNotNullParameter(keditorEditText0, "<this>");
        Intrinsics.checkNotNullParameter(textItem0, "item");
        if(textItem0.getHasPendingFocus()) {
            keditorEditText0.requestPendingFocusAndSelection(textItem0.getSelectionStart(), textItem0.getSelectionEnd());
            textItem0.consumeFocus();
            return;
        }
        keditorEditText0.setSelection(textItem0.getSelectionStart(), textItem0.getSelectionEnd());
    }
}

