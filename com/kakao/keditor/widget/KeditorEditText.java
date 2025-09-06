package com.kakao.keditor.widget;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.provider.Settings.Secure;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.h;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import androidx.room.a;
import com.kakao.common.view.SoftInputKt;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.id;
import com.kakao.keditor.plugin.attrs.text.FontStyle;
import com.kakao.keditor.plugin.attrs.text.spans.KeBackgroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeForegroundColorSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeToggleSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeTypefaceSpan;
import com.kakao.keditor.plugin.attrs.text.spans.KeURLSpan;
import com.kakao.keditor.plugin.attrs.text.spans.Selection;
import com.kakao.keditor.plugin.attrs.text.spans.SpanUtil;
import com.kakao.keditor.util.SimpleTextWatcher;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.c;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u001D\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 F2\u00020\u0001:\u0002FGB\u000F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\u0002\u0010\u0007B\u001F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\t\u00A2\u0006\u0002\u0010\nJ\u0015\u0010\u0012\u001A\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001A\u00020\t\u00A2\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u0017H\u0002J(\u0010\u0019\u001A\u00020\u00132\u0006\u0010\u001A\u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\u001C2\u0006\u0010\u001D\u001A\u00020\t2\u0006\u0010\u001E\u001A\u00020\tH\u0002J\u0006\u0010\u001F\u001A\u00020\u0013J\u0018\u0010 \u001A\u0004\u0018\u00010\u001C2\u0006\u0010\u0014\u001A\u00020\t2\u0006\u0010!\u001A\u00020\tJ\u0006\u0010\"\u001A\u00020\u0013J\u0018\u0010#\u001A\u0004\u0018\u00010$2\u0006\u0010\u0014\u001A\u00020\t2\u0006\u0010%\u001A\u00020\tJ\u0010\u0010&\u001A\u00020\'2\u0006\u0010\u001A\u001A\u00020\rH\u0002J\u0010\u0010(\u001A\u00020\'2\u0006\u0010\u001A\u001A\u00020\rH\u0002J\u0010\u0010)\u001A\u00020\'2\u0006\u0010\u001A\u001A\u00020\rH\u0002J\u0010\u0010*\u001A\u00020\'2\u0006\u0010\u001A\u001A\u00020\rH\u0002J\u0018\u0010+\u001A\u00020\'2\u0006\u0010,\u001A\u00020\r2\u0006\u0010\u001A\u001A\u00020\rH\u0002J\b\u0010-\u001A\u00020\'H\u0002J\u0010\u0010.\u001A\u00020\'2\u0006\u0010\u001A\u001A\u00020\rH\u0002J\u0018\u0010/\u001A\u00020\u00132\u0006\u00100\u001A\u00020\t2\u0006\u00101\u001A\u00020\tH\u0002J\u0018\u00102\u001A\u00020\u00132\u0006\u00100\u001A\u00020\t2\u0006\u00101\u001A\u00020\tH\u0016J\u0010\u00103\u001A\u00020\'2\u0006\u00104\u001A\u00020\tH\u0016J\u0012\u0010\u0018\u001A\u00020\'2\b\u00105\u001A\u0004\u0018\u00010\u001CH\u0002J\u0018\u00106\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\t2\u0006\u0010%\u001A\u00020\tH\u0002J#\u00107\u001A\u00020\u00132\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0002\u00108J\u001A\u00109\u001A\u00020\u00132\b\b\u0002\u0010\u0014\u001A\u00020\t2\b\b\u0002\u0010%\u001A\u00020\tJ+\u0010:\u001A\u00020\u00132\u0006\u0010\u001A\u001A\u00020\r2\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0002\u0010;J\u000E\u0010<\u001A\u00020\u00132\u0006\u0010=\u001A\u00020\u0011J\u0018\u0010>\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\t2\u0006\u0010%\u001A\u00020\tH\u0016J-\u0010?\u001A\u00020\u00132\u0006\u0010\u001A\u001A\u00020\r2\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001A\u0004\u0018\u00010\tH\u0002\u00A2\u0006\u0002\u0010;J\u0006\u0010@\u001A\u00020\u0013J\u0006\u0010A\u001A\u00020\u0017J\u0006\u0010B\u001A\u00020\tJ!\u0010C\u001A\u00020\u0013*\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010D\u001A\b\u0012\u0004\u0012\u00020\r0EH\u0086\u0004R\u0017\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\r0\f\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000\u00A8\u0006H"}, d2 = {"Lcom/kakao/keditor/widget/KeditorEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pendingRequestSpans", "", "Landroid/text/style/CharacterStyle;", "getPendingRequestSpans", "()Ljava/util/List;", "selectionChangeListener", "Lcom/kakao/keditor/widget/KeditorEditText$SelectionChangeListener;", "addSpace", "", "start", "(I)Lkotlin/Unit;", "appendURLSpanIfNecessary", "", "paste", "applyRequestSpan", "requestSpan", "str", "Landroid/text/Editable;", "selectionStart", "selectionEnd", "clearOnSelectionChanged", "delete", "length", "enableClickableSpans", "getTextSubSequence", "Landroid/text/Spannable;", "end", "isClearFontStyle", "", "isClearTextBgColor", "isClearTextColor", "isClearUrl", "isSameSpan", "it", "isSamsungKeyboard", "isToggleStyle", "notifySelectionChanged", "selStart", "selEnd", "onSelectionChanged", "onTextContextMenuItem", "id", "editable", "refreshSelection", "removeColorSpanFromSelectedRange", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "requestPendingFocusAndSelection", "requestSetStyleSpan", "(Landroid/text/style/CharacterStyle;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setOnSelectionChanged", "listener", "setSelection", "setStyleSpan", "setSuggestionOff", "text", "textLength", "updateSpanListWith", "pendingSpans", "", "Companion", "SelectionChangeListener", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeditorEditText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeditorEditText.kt\ncom/kakao/keditor/widget/KeditorEditText\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,556:1\n766#2:557\n857#2,2:558\n766#2:560\n857#2,2:561\n1855#2,2:563\n1#3:565\n*S KotlinDebug\n*F\n+ 1 KeditorEditText.kt\ncom/kakao/keditor/widget/KeditorEditText\n*L\n388#1:557\n388#1:558,2\n393#1:560\n393#1:561,2\n395#1:563,2\n*E\n"})
public final class KeditorEditText extends AppCompatEditText {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001A\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/widget/KeditorEditText$Companion;", "", "()V", "LINK_MOVEMENT_METHOD", "Landroid/text/method/MovementMethod;", "kotlin.jvm.PlatformType", "SAMSUNG", "", "SPACE", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/kakao/keditor/widget/KeditorEditText$SelectionChangeListener;", "", "selectedChanged", "", "editText", "Lcom/kakao/keditor/widget/KeditorEditText;", "start", "", "end", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public interface SelectionChangeListener {
        void selectedChanged(@NotNull KeditorEditText arg1, int arg2, int arg3);
    }

    @NotNull
    public static final Companion Companion = null;
    private static final MovementMethod LINK_MOVEMENT_METHOD = null;
    @NotNull
    private static final String SAMSUNG = "samsung";
    @NotNull
    private static final String SPACE = " ";
    @NotNull
    private final List pendingRequestSpans;
    @Nullable
    private SelectionChangeListener selectionChangeListener;

    static {
        KeditorEditText.Companion = new Companion(null);
        KeditorEditText.LINK_MOVEMENT_METHOD = LinkMovementMethod.getInstance();
    }

    public KeditorEditText(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.pendingRequestSpans = new ArrayList();
        this.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewAttachedToWindow(@NotNull View view0) {
                Intrinsics.checkNotNullParameter(view0, "v");
                KeditorEditText.this.setCursorVisible(false);
                KeditorEditText.this.setCursorVisible(true);
            }

            @Override  // android.view.View$OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@NotNull View view0) {
                Intrinsics.checkNotNullParameter(view0, "v");
                KeditorEditText.this.setCursorVisible(false);
            }
        });
        Context context1 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
        this.setTypeface(FontStyle.SYSTEM.getTypeface(context1));
        this.setIncludeFontPadding(false);
        this.setPadding(0, 0, 0, 0);
        this.setLinkTextColor(ContextCompat.getColor(this.getContext(), color.ke_color_text_link));
        this.addTextChangedListener(new SimpleTextWatcher() {
            @Nullable
            private Integer added;
            @Nullable
            private Integer cursorPosition;
            @Nullable
            private Integer deleted;
            @Nullable
            private CharSequence originalText;

            @Override  // com.kakao.keditor.util.SimpleTextWatcher
            public void afterTextChanged(@NotNull Editable editable0) {
                ArrayList arrayList1;
                ArrayList arrayList0;
                Intrinsics.checkNotNullParameter(editable0, "s");
                if(!KeditorEditText.this.isFocused()) {
                    return;
                }
                if(this.deleted != null && this.added != null) {
                    Integer integer0 = this.cursorPosition;
                    if(integer0 != null) {
                        Intrinsics.checkNotNull(integer0);
                        Integer integer1 = this.deleted;
                        Intrinsics.checkNotNull(integer1);
                        int v = ((int)integer1) + ((int)integer0);
                        Integer integer2 = this.cursorPosition;
                        Intrinsics.checkNotNull(integer2);
                        Integer integer3 = this.added;
                        Intrinsics.checkNotNull(integer3);
                        int v1 = ((int)integer3) + ((int)integer2);
                        if(KeditorEditText.this.getInputType() != 0x80000 && KeditorEditText.this.isSamsungKeyboard() && KeditorEditText.this.isFocused()) {
                            int v2 = v1 - v;
                            Spannable spannable0 = this.originalText instanceof Spannable ? ((Spannable)this.originalText) : null;
                            if(spannable0 != null) {
                                KeditorEditText keditorEditText0 = KeditorEditText.this;
                                TextUtils.copySpansFrom(spannable0, 0, Math.min(v, Math.min(v1, editable0.length())), CharacterStyle.class, editable0, 0);
                                if(v == 0 || v1 == 0) {
                                    SpanUtil.INSTANCE.updateRangeFlag(editable0);
                                }
                                int v3 = Math.min(v, v1);
                                int v4 = Math.max(v, v1);
                                Class class0 = CharacterStyle.class;
                                Object[] arr_object = spannable0.getSpans(v3, v3, class0);
                                Intrinsics.checkNotNullExpressionValue(arr_object, "getSpans(...)");
                                for(int v5 = 0; v5 < arr_object.length; ++v5) {
                                    CharacterStyle characterStyle0 = (CharacterStyle)arr_object[v5];
                                    int v6 = spannable0.getSpanStart(characterStyle0);
                                    int v7 = spannable0.getSpanEnd(characterStyle0);
                                    int v8 = spannable0.getSpanFlags(characterStyle0);
                                    if((v6 != v3 || v8 != 34 && v8 != 33) && v7 != v3) {
                                        int v9 = c.coerceAtMost(v6, editable0.length());
                                        int v10 = c.coerceIn(v7 + v2, 0, editable0.length());
                                        if(v10 > v9) {
                                            editable0.removeSpan(characterStyle0);
                                            Intrinsics.checkNotNull(characterStyle0);
                                            keditorEditText0.requestSetStyleSpan(characterStyle0, v9, v10);
                                        }
                                    }
                                }
                                Integer integer4 = this.deleted;
                                Intrinsics.checkNotNull(integer4);
                                Integer integer5 = this.added;
                                Intrinsics.checkNotNull(integer5);
                                if(((int)integer4) < ((int)integer5)) {
                                    KeSpan[] arr_keSpan = (KeSpan[])editable0.getSpans(v3, v4, KeSpan.class);
                                    if(arr_keSpan == null) {
                                        arrayList0 = null;
                                    }
                                    else {
                                        Intrinsics.checkNotNull(arr_keSpan);
                                        arrayList0 = new ArrayList();
                                        for(int v11 = 0; v11 < arr_keSpan.length; ++v11) {
                                            KeSpan keSpan0 = arr_keSpan[v11];
                                            int v12 = editable0.getSpanFlags(keSpan0);
                                            boolean z = editable0.getSpanStart(keSpan0) == v4;
                                            if(editable0.getSpanStart(keSpan0) >= v3 && editable0.getSpanEnd(keSpan0) <= v4 && (!z || v12 != 34 && v12 != 33)) {
                                                arrayList0.add(keSpan0);
                                            }
                                        }
                                    }
                                    if(arrayList0 == null || arrayList0.isEmpty()) {
                                        CharacterStyle[] arr_characterStyle = (CharacterStyle[])spannable0.getSpans(v, v, class0);
                                        if(arr_characterStyle == null) {
                                            arrayList1 = null;
                                        }
                                        else {
                                            Intrinsics.checkNotNull(arr_characterStyle);
                                            arrayList1 = new ArrayList();
                                            for(int v13 = 0; v13 < arr_characterStyle.length; ++v13) {
                                                CharacterStyle characterStyle1 = arr_characterStyle[v13];
                                                int v14 = spannable0.getSpanFlags(characterStyle1);
                                                Editable editable1 = keditorEditText0.getText();
                                                boolean z1 = editable1 != null && editable1.getSpanStart(characterStyle1) == v1;
                                                Editable editable2 = keditorEditText0.getText();
                                                if((!z1 || v14 != 34 && v14 != 33) && (editable2 == null || editable2.getSpanEnd(characterStyle1) != v || v14 != 17 && v14 != 33)) {
                                                    arrayList1.add(characterStyle1);
                                                }
                                            }
                                        }
                                        if(arrayList1 != null) {
                                            for(Object object0: arrayList1) {
                                                int v15 = spannable0.getSpanStart(((CharacterStyle)object0));
                                                int v16 = spannable0.getSpanEnd(((CharacterStyle)object0));
                                                editable0.removeSpan(((CharacterStyle)object0));
                                                Intrinsics.checkNotNull(((CharacterStyle)object0));
                                                Editable editable3 = keditorEditText0.getText();
                                                keditorEditText0.requestSetStyleSpan(((CharacterStyle)object0), v15, c.coerceIn(v16 + v2, v15, (editable3 == null ? v15 : editable3.length())));
                                            }
                                        }
                                    }
                                }
                            }
                            KeditorEditText.this.refreshSelection(v1, v1);
                        }
                        Integer integer6 = this.added;
                        Intrinsics.checkNotNull(integer6);
                        if(((int)integer6) > 0) {
                            KeditorEditText keditorEditText1 = KeditorEditText.this;
                            for(Object object1: KeditorEditText.this.getPendingRequestSpans()) {
                                Integer integer7 = this.cursorPosition;
                                Intrinsics.checkNotNull(integer7);
                                Integer integer8 = this.deleted;
                                Intrinsics.checkNotNull(integer8);
                                Integer integer9 = this.cursorPosition;
                                Intrinsics.checkNotNull(integer9);
                                Integer integer10 = this.added;
                                Intrinsics.checkNotNull(integer10);
                                keditorEditText1.requestSetStyleSpan(((CharacterStyle)object1), ((int)(((int)integer8) + ((int)integer7))), ((int)(((int)integer10) + ((int)integer9))));
                            }
                            KeditorEditText.this.getPendingRequestSpans().clear();
                        }
                        if(this.cursorPosition != null && ((int)this.cursorPosition) == 0 && (this.deleted == null ? 0 : ((int)this.deleted)) > 0) {
                            SpanUtil.INSTANCE.updateFirstCharacterFlags(editable0);
                        }
                        Integer integer11 = this.cursorPosition;
                        if(integer11 != null) {
                            this.removeInvalidCharacterStyle(integer11.intValue() + (this.added == null ? 0 : ((int)this.added)));
                        }
                    }
                }
                this.originalText = null;
                this.cursorPosition = null;
                this.added = null;
                this.deleted = null;
            }

            @Override  // com.kakao.keditor.util.SimpleTextWatcher
            public void beforeTextChanged(@NotNull CharSequence charSequence0, int v, int v1, int v2) {
                Intrinsics.checkNotNullParameter(charSequence0, "s");
                super.beforeTextChanged(charSequence0, v, v1, v2);
                this.originalText = KeditorEditText.this.text().subSequence(0, KeditorEditText.this.textLength());
            }

            @Nullable
            public final Integer getAdded() {
                return this.added;
            }

            @Nullable
            public final Integer getCursorPosition() {
                return this.cursorPosition;
            }

            @Nullable
            public final Integer getDeleted() {
                return this.deleted;
            }

            @Nullable
            public final CharSequence getOriginalText() {
                return this.originalText;
            }

            private final boolean isCanNotUseStyle(CharacterStyle characterStyle0) {
                Editable editable0 = KeditorEditText.this.getText();
                if(editable0 != null) {
                    return characterStyle0 instanceof KeURLSpan ? editable0.getSpanStart(characterStyle0) == editable0.getSpanEnd(characterStyle0) || p.isBlank(editable0.subSequence(editable0.getSpanStart(characterStyle0), editable0.getSpanEnd(characterStyle0)).toString()) : editable0.getSpanStart(characterStyle0) == editable0.getSpanEnd(characterStyle0) && editable0.getSpanStart(characterStyle0) != 0;
                }
                return false;
            }

            @Override  // com.kakao.keditor.util.SimpleTextWatcher
            public void onTextChanged(@NotNull CharSequence charSequence0, int v, int v1, int v2) {
                Intrinsics.checkNotNullParameter(charSequence0, "s");
                this.cursorPosition = v;
                this.deleted = v1;
                this.added = v2;
            }

            private final Unit removeInvalidCharacterStyle(int v) {
                Editable editable0 = KeditorEditText.this.getText();
                if(editable0 != null) {
                    CharacterStyle[] arr_characterStyle = (CharacterStyle[])editable0.getSpans(v, v, CharacterStyle.class);
                    Intrinsics.checkNotNull(arr_characterStyle);
                    for(int v1 = 0; v1 < arr_characterStyle.length; ++v1) {
                        CharacterStyle characterStyle0 = arr_characterStyle[v1];
                        Intrinsics.checkNotNull(characterStyle0);
                        if(!SpanUtil.INSTANCE.isKEStyle(characterStyle0) || this.isCanNotUseStyle(characterStyle0)) {
                            editable0.removeSpan(characterStyle0);
                        }
                    }
                    return Unit.INSTANCE;
                }
                return null;
            }

            public final void setAdded(@Nullable Integer integer0) {
                this.added = integer0;
            }

            public final void setCursorPosition(@Nullable Integer integer0) {
                this.cursorPosition = integer0;
            }

            public final void setDeleted(@Nullable Integer integer0) {
                this.deleted = integer0;
            }

            public final void setOriginalText(@Nullable CharSequence charSequence0) {
                this.originalText = charSequence0;
            }
        });
        this.setImeOptions(0x10000000);
    }

    public KeditorEditText(@NotNull Context context0, @NotNull AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        super(context0, attributeSet0);
        this.pendingRequestSpans = new ArrayList();
        this.addOnAttachStateChangeListener(new com.kakao.keditor.widget.KeditorEditText.1(this));
        Context context1 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
        this.setTypeface(FontStyle.SYSTEM.getTypeface(context1));
        this.setIncludeFontPadding(false);
        this.setPadding(0, 0, 0, 0);
        this.setLinkTextColor(ContextCompat.getColor(this.getContext(), color.ke_color_text_link));
        this.addTextChangedListener(new com.kakao.keditor.widget.KeditorEditText.2(this));
        this.setImeOptions(0x10000000);
    }

    public KeditorEditText(@NotNull Context context0, @NotNull AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        super(context0, attributeSet0, v);
        this.pendingRequestSpans = new ArrayList();
        this.addOnAttachStateChangeListener(new com.kakao.keditor.widget.KeditorEditText.1(this));
        Context context1 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(context1, "getContext(...)");
        this.setTypeface(FontStyle.SYSTEM.getTypeface(context1));
        this.setIncludeFontPadding(false);
        this.setPadding(0, 0, 0, 0);
        this.setLinkTextColor(ContextCompat.getColor(this.getContext(), color.ke_color_text_link));
        this.addTextChangedListener(new com.kakao.keditor.widget.KeditorEditText.2(this));
        this.setImeOptions(0x10000000);
    }

    @Nullable
    public final Unit addSpace(int v) {
        Editable editable0 = this.getText();
        if(editable0 != null) {
            editable0.insert(v, " ");
            if(v == 0) {
                SpanUtil.INSTANCE.updateRangeFlag(editable0);
            }
            return Unit.INSTANCE;
        }
        return null;
    }

    private final CharSequence appendURLSpanIfNecessary(CharSequence charSequence0) {
        Matcher matcher0 = Pattern.compile("(\\s|^)((www\\.)|(m\\.)|(http://)|(https://))[-a-zA-Z0-9가-힣@:%._+~#=]{1,256}\\.[a-z]{2,6}\\b[-a-zA-Z0-9가-힣@:%_+.~#?&/=()\\[\\]!$\'*,;]*").matcher(charSequence0);
        CharSequence charSequence1 = new SpannableStringBuilder(charSequence0);
        while(matcher0.find()) {
            ((SpannableStringBuilder)charSequence1).setSpan(new KeURLSpan(matcher0.group(0), null, null, 6, null), matcher0.start(), matcher0.end(), 33);
        }
        return charSequence1;
    }

    private final void applyRequestSpan(CharacterStyle characterStyle0, Editable editable0, int v, int v1) {
        if(!this.isClearTextColor(characterStyle0) && !this.isClearTextBgColor(characterStyle0) && !this.isClearFontStyle(characterStyle0)) {
            if(!(characterStyle0 instanceof KeURLSpan)) {
                editable0.setSpan(characterStyle0, v, v1, SpanUtil.INSTANCE.getInEx(characterStyle0, v));
            }
            else if(((KeURLSpan)characterStyle0).getUrl().length() > 0) {
                editable0.setSpan(characterStyle0, c.coerceIn(v, 0, editable0.length()), c.coerceIn(v1, 0, editable0.length()), 33);
            }
        }
    }

    // 检测为 Lambda 实现
    public static void b(KeditorEditText keditorEditText0, int v, int v1) [...]

    public final void clearOnSelectionChanged() {
        this.selectionChangeListener = null;
    }

    @Nullable
    public final Editable delete(int v, int v1) {
        Editable editable0 = this.getText();
        return editable0 == null ? null : editable0.delete(v, c.coerceAtMost(v1, editable0.length()));
    }

    public final void enableClickableSpans() {
        this.setMovementMethod(KeditorEditText.LINK_MOVEMENT_METHOD);
    }

    @NotNull
    public final List getPendingRequestSpans() {
        return this.pendingRequestSpans;
    }

    @Nullable
    public final Spannable getTextSubSequence(int v, int v1) {
        Editable editable0 = this.getText();
        CharSequence charSequence0 = editable0 == null ? null : editable0.subSequence(v, c.coerceAtMost(v1, this.length()));
        return charSequence0 instanceof Spannable ? ((Spannable)charSequence0) : null;
    }

    private final boolean isClearFontStyle(CharacterStyle characterStyle0) {
        if(characterStyle0 instanceof KeTypefaceSpan) {
            Typeface typeface0 = ((KeTypefaceSpan)characterStyle0).getType();
            Context context0 = this.getContext();
            Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
            return Intrinsics.areEqual(typeface0, FontStyle.SYSTEM.getTypeface(context0));
        }
        return false;
    }

    private final boolean isClearTextBgColor(CharacterStyle characterStyle0) {
        return characterStyle0 instanceof KeBackgroundColorSpan && ((KeBackgroundColorSpan)characterStyle0).getBackgroundColor() == 0;
    }

    private final boolean isClearTextColor(CharacterStyle characterStyle0) {
        return characterStyle0 instanceof KeForegroundColorSpan && ((KeForegroundColorSpan)characterStyle0).getForegroundColor() == 0;
    }

    private final boolean isClearUrl(CharacterStyle characterStyle0) {
        return characterStyle0 instanceof KeURLSpan && ((KeURLSpan)characterStyle0).getUrl() == null;
    }

    // 去混淆评级： 低(30)
    private final boolean isSameSpan(CharacterStyle characterStyle0, CharacterStyle characterStyle1) {
        return Intrinsics.areEqual(characterStyle0.getClass(), characterStyle1.getClass()) && (!(characterStyle0 instanceof StyleSpan) || !(characterStyle1 instanceof StyleSpan) || ((StyleSpan)characterStyle0).getStyle() == ((StyleSpan)characterStyle1).getStyle());
    }

    private final boolean isSamsungKeyboard() {
        Object object0 = this.getContext().getSystemService("input_method");
        if((object0 instanceof InputMethodManager ? ((InputMethodManager)object0) : null) != null && Intrinsics.areEqual(Build.MANUFACTURER, "samsung")) {
            String s = Settings.Secure.getString(this.getContext().getContentResolver(), "default_input_method");
            if(s != null) {
                String s1 = a.k(Locale.ROOT, "ROOT", s, Locale.ROOT, "toLowerCase(...)");
                return s1 == null ? false : StringsKt__StringsKt.contains$default(s1, "samsung", false, 2, null);
            }
        }
        return false;
    }

    private final boolean isToggleStyle(CharacterStyle characterStyle0) {
        return characterStyle0 instanceof KeToggleSpan;
    }

    private final void notifySelectionChanged(int v, int v1) {
        if(!this.isFocused()) {
            return;
        }
        SelectionChangeListener keditorEditText$SelectionChangeListener0 = this.selectionChangeListener;
        if(keditorEditText$SelectionChangeListener0 != null) {
            keditorEditText$SelectionChangeListener0.selectedChanged(this, v, v1);
        }
    }

    @Override  // android.widget.TextView
    public void onSelectionChanged(int v, int v1) {
        super.onSelectionChanged(v, v1);
        this.notifySelectionChanged(v, v1);
        if(Intrinsics.areEqual(this.getTag(id.edit_text_clear_pending_spans_on_selection_changed), Boolean.TRUE)) {
            this.pendingRequestSpans.clear();
        }
    }

    @Override  // androidx.appcompat.widget.AppCompatEditText
    public boolean onTextContextMenuItem(int v) {
        return v != 0x1020022 || !this.paste(this.getText()) ? super.onTextContextMenuItem(v) : true;
    }

    private final boolean paste(Editable editable0) {
        int v3;
        if(editable0 == null) {
            return false;
        }
        Object object0 = this.getContext().getSystemService("clipboard");
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.content.ClipboardManager");
        int v = editable0.length();
        if(this.isFocused()) {
            int v1 = this.getSelectionStart();
            int v2 = this.getSelectionEnd();
            v3 = Math.max(0, Math.min(v1, v2));
            v = Math.max(0, Math.max(v1, v2));
        }
        else {
            v3 = 0;
        }
        ClipData clipData0 = ((ClipboardManager)object0).getPrimaryClip();
        if(clipData0 != null && clipData0.getItemCount() > 0) {
            CharSequence charSequence0 = clipData0.getItemAt(0).coerceToText(this.getContext());
            Spanned spanned0 = charSequence0 instanceof Spanned ? ((Spanned)charSequence0) : null;
            if(spanned0 == null) {
                Intrinsics.checkNotNull(charSequence0);
            }
            else {
                String s = spanned0.toString();
                if(s == null) {
                    Intrinsics.checkNotNull(charSequence0);
                }
                else {
                    charSequence0 = s;
                }
            }
            editable0.replace(v3, v, this.appendURLSpanIfNecessary(charSequence0));
            return true;
        }
        return false;
    }

    private final void refreshSelection(int v, int v1) {
        this.setTag(id.edit_text_clear_pending_spans_on_selection_changed, Boolean.FALSE);
        this.setSelection(0, 0);
        this.setSelection(v, v1);
        if(v == 0 && v1 == 0) {
            this.onSelectionChanged(0, 0);
        }
        this.setTag(id.edit_text_clear_pending_spans_on_selection_changed, Boolean.TRUE);
    }

    public final void removeColorSpanFromSelectedRange(@Nullable Integer integer0, @Nullable Integer integer1) {
        Editable editable0 = this.getText();
        if(editable0 == null) {
            return;
        }
        int v = integer0 == null ? this.getSelectionStart() : ((int)integer0);
        int v1 = integer1 == null ? this.getSelectionEnd() : ((int)integer1);
        if(v > v1) {
            return;
        }
        KeForegroundColorSpan[] arr_keForegroundColorSpan = (KeForegroundColorSpan[])editable0.getSpans(v, v1, KeForegroundColorSpan.class);
        Intrinsics.checkNotNull(arr_keForegroundColorSpan);
        for(int v2 = 0; v2 < arr_keForegroundColorSpan.length; ++v2) {
            KeForegroundColorSpan keForegroundColorSpan0 = arr_keForegroundColorSpan[v2];
            int v3 = editable0.getSpanStart(keForegroundColorSpan0);
            int v4 = editable0.getSpanEnd(keForegroundColorSpan0);
            int v5 = editable0.getSpanFlags(keForegroundColorSpan0);
            editable0.removeSpan(keForegroundColorSpan0);
            Intrinsics.checkNotNull(keForegroundColorSpan0);
            CharacterStyle characterStyle0 = SpanUtil.INSTANCE.newSpan(keForegroundColorSpan0);
            if(v3 < v) {
                editable0.setSpan(keForegroundColorSpan0, v3, v, v5);
            }
            if(v4 > v1) {
                editable0.setSpan(characterStyle0, v1, v4, v5);
            }
        }
    }

    public static void removeColorSpanFromSelectedRange$default(KeditorEditText keditorEditText0, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 1) != 0) {
            integer0 = null;
        }
        if((v & 2) != 0) {
            integer1 = null;
        }
        keditorEditText0.removeColorSpanFromSelectedRange(integer0, integer1);
    }

    public final void requestPendingFocusAndSelection(int v, int v1) {
        this.post(() -> KeditorEditText.requestPendingFocusAndSelection$lambda$0(this, v, v1));
        this.postDelayed(new h(this, 17), 200L);
    }

    public static void requestPendingFocusAndSelection$default(KeditorEditText keditorEditText0, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = -1;
        }
        if((v2 & 2) != 0) {
            v1 = -1;
        }
        keditorEditText0.requestPendingFocusAndSelection(v, v1);
    }

    private static final void requestPendingFocusAndSelection$lambda$0(KeditorEditText keditorEditText0, int v, int v1) {
        Intrinsics.checkNotNullParameter(keditorEditText0, "this$0");
        keditorEditText0.requestFocus();
        if(v >= 0 && v1 >= 0) {
            keditorEditText0.setSelection(v, v1);
        }
    }

    private static final void requestPendingFocusAndSelection$lambda$1(KeditorEditText keditorEditText0) {
        Intrinsics.checkNotNullParameter(keditorEditText0, "this$0");
        Context context0 = keditorEditText0.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        SoftInputKt.showSoftInput$default(context0, false, 1, null);
    }

    public final void requestSetStyleSpan(@NotNull CharacterStyle characterStyle0, @Nullable Integer integer0, @Nullable Integer integer1) {
        Intrinsics.checkNotNullParameter(characterStyle0, "requestSpan");
        if(this.getText() == null) {
            return;
        }
        int v = integer0 == null ? this.getSelectionStart() : ((int)integer0);
        int v1 = integer1 == null ? this.getSelectionEnd() : ((int)integer1);
        if(v > v1) {
            return;
        }
        if(v == v1) {
            List list0 = k.listOf(characterStyle0);
            this.updateSpanListWith(this.pendingRequestSpans, list0);
            this.refreshSelection(v, v1);
            return;
        }
        this.setStyleSpan(characterStyle0, integer0, integer1);
    }

    public static void requestSetStyleSpan$default(KeditorEditText keditorEditText0, CharacterStyle characterStyle0, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 2) != 0) {
            integer0 = null;
        }
        if((v & 4) != 0) {
            integer1 = null;
        }
        keditorEditText0.requestSetStyleSpan(characterStyle0, integer0, integer1);
    }

    public final void setOnSelectionChanged(@NotNull SelectionChangeListener keditorEditText$SelectionChangeListener0) {
        Intrinsics.checkNotNullParameter(keditorEditText$SelectionChangeListener0, "listener");
        this.selectionChangeListener = keditorEditText$SelectionChangeListener0;
    }

    @Override  // android.widget.EditText
    public void setSelection(int v, int v1) {
        int v4;
        int v3;
        Editable editable0 = this.getText();
        if(editable0 == null) {
            return;
        }
        int v2 = editable0.length();
        if(v1 < v) {
            v3 = v;
            v4 = v1;
        }
        else {
            v4 = v;
            v3 = v1;
        }
        if(v > v2) {
            v4 = v2;
        }
        if(v1 <= v2) {
            v2 = v3;
        }
        if(v < 0) {
            v4 = 0;
        }
        if(v1 < 0) {
            v2 = 0;
        }
        super.setSelection(v4, v2);
    }

    private final void setStyleSpan(CharacterStyle characterStyle0, Integer integer0, Integer integer1) {
        Editable editable0 = this.getText();
        if(editable0 == null) {
            return;
        }
        int v = integer0 == null ? this.getSelectionStart() : ((int)integer0);
        int v1 = integer1 == null ? this.getSelectionEnd() : ((int)integer1);
        if(v >= v1) {
            return;
        }
        Selection selection0 = new Selection(v, v1);
        Class class0 = characterStyle0.getClass();
        List list0 = SpanUtil.INSTANCE.getSpans(editable0, selection0, class0);
        if(characterStyle0 instanceof StyleSpan) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                Intrinsics.checkNotNull(((CharacterStyle)object0), "null cannot be cast to non-null type android.text.style.StyleSpan");
                if(((StyleSpan)(((CharacterStyle)object0))).getStyle() == ((StyleSpan)characterStyle0).getStyle()) {
                    arrayList0.add(object0);
                }
            }
            list0 = TypeIntrinsics.asMutableList(arrayList0);
        }
        if(list0.isEmpty()) {
            this.applyRequestSpan(characterStyle0, editable0, selection0.getStart(), selection0.getEnd());
        }
        else {
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: list0) {
                if(this.isSameSpan(((CharacterStyle)object1), characterStyle0)) {
                    arrayList1.add(object1);
                }
            }
            boolean z = false;
            for(Object object2: arrayList1) {
                CharacterStyle characterStyle1 = (CharacterStyle)object2;
                int v2 = editable0.getSpanStart(characterStyle1);
                int v3 = editable0.getSpanEnd(characterStyle1);
                editable0.removeSpan(characterStyle1);
                if(v2 != v3) {
                    if(v2 < selection0.getStart()) {
                        editable0.setSpan(SpanUtil.INSTANCE.newSpan(characterStyle1), v2, selection0.getStart(), SpanUtil.INSTANCE.getInEx(characterStyle1, v2));
                    }
                    if(v3 > selection0.getEnd()) {
                        editable0.setSpan(SpanUtil.INSTANCE.newSpan(characterStyle1), selection0.getEnd(), v3, SpanUtil.INSTANCE.getInEx(characterStyle1, v2));
                    }
                }
                if(this.isToggleStyle(characterStyle0)) {
                    int v4 = this.getSelectionStart();
                    if(v2 <= v4 && v4 <= v3) {
                        z = true;
                    }
                }
            }
            if(!z) {
                this.applyRequestSpan(characterStyle0, editable0, selection0.getStart(), selection0.getEnd());
            }
        }
        if(this.pendingRequestSpans.isEmpty()) {
            this.notifySelectionChanged(selection0.getStart(), selection0.getEnd());
        }
    }

    public static void setStyleSpan$default(KeditorEditText keditorEditText0, CharacterStyle characterStyle0, Integer integer0, Integer integer1, int v, Object object0) {
        if((v & 2) != 0) {
            integer0 = null;
        }
        if((v & 4) != 0) {
            integer1 = null;
        }
        keditorEditText0.setStyleSpan(characterStyle0, integer0, integer1);
    }

    public final void setSuggestionOff() {
        this.setInputType(0x80000);
        this.setSingleLine(false);
    }

    @NotNull
    public final CharSequence text() {
        CharSequence charSequence0 = this.getText();
        return charSequence0 == null ? "" : charSequence0;
    }

    public final int textLength() {
        Editable editable0 = this.getText();
        return editable0 == null ? 0 : editable0.length();
    }

    public final void updateSpanListWith(@NotNull List list0, @NotNull List list1) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(list1, "pendingSpans");
        for(Object object0: list1) {
            CharacterStyle characterStyle0 = (CharacterStyle)object0;
            for(Object object1: list0) {
                if(!Intrinsics.areEqual(((CharacterStyle)object1).getClass(), characterStyle0.getClass())) {
                    continue;
                }
                goto label_12;
            }
            object1 = null;
        label_12:
            if(((CharacterStyle)object1) != null) {
                list0.remove(((CharacterStyle)object1));
                if(((CharacterStyle)object1) instanceof KeToggleSpan) {
                    continue;
                }
            }
            list0.add(characterStyle0);
        }
    }
}

