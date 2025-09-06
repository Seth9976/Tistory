package com.kakao.keditor.plugin.pluginspec.html.editor.view;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.res.ResourcesCompat;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.id;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001:B%\b\u0007\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u00A2\u0006\u0002\u0010\bJ\b\u00100\u001A\u000201H\u0002J\b\u00102\u001A\u000201H\u0002J\u0010\u00103\u001A\u0002012\u0006\u00104\u001A\u000205H\u0014J\u0012\u00106\u001A\u0002072\b\u00108\u001A\u0004\u0018\u000109H\u0016R\u000E\u0010\t\u001A\u00020\nX\u0082.\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\fX\u0082.\u00A2\u0006\u0002\n\u0000R\u0011\u0010\r\u001A\u00020\u000E8F\u00A2\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u000E\u0010\u0011\u001A\u00020\u0012X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u0013\u001A\u00020\u0014X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001A\u001A\u00020\u00072\u0006\u0010\u0019\u001A\u00020\u0007@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER$\u0010\u001F\u001A\u00020\u00072\u0006\u0010\u0019\u001A\u00020\u0007@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b \u0010\u001C\"\u0004\b!\u0010\u001ER$\u0010\"\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u0014@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u000E\u0010%\u001A\u00020&X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\'\u001A\u00020(X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010)\u001A\u00020\u0007X\u0082\u000E\u00A2\u0006\u0002\n\u0000R$\u0010*\u001A\u00020\u00072\u0006\u0010\u0019\u001A\u00020\u0007@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b+\u0010\u001C\"\u0004\b,\u0010\u001ER$\u0010-\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u0014@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b.\u0010\u0016\"\u0004\b/\u0010\u0018\u00A8\u0006;"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/html/editor/view/HtmlEditScrollView;", "Landroid/widget/ScrollView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "_codeEditText", "Lcom/kakao/keditor/plugin/pluginspec/html/editor/view/HtmlEditScrollView$HtmlEditText;", "_horizontalScrollView", "Landroid/widget/HorizontalScrollView;", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "lineBoundRect", "Landroid/graphics/Rect;", "lineNumberOpacity", "", "getLineNumberOpacity", "()F", "setLineNumberOpacity", "(F)V", "value", "lineNumberPaddingLeft", "getLineNumberPaddingLeft", "()I", "setLineNumberPaddingLeft", "(I)V", "lineNumberPaddingRight", "getLineNumberPaddingRight", "setLineNumberPaddingRight", "lineSpacingExtra", "getLineSpacingExtra", "setLineSpacingExtra", "paint", "Landroid/graphics/Paint;", "startSpaceRegex", "Lkotlin/text/Regex;", "tempScrollY", "textColor", "getTextColor", "setTextColor", "textSize", "getTextSize", "setTextSize", "addChildViews", "", "createChildViews", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "HtmlEditText", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HtmlEditScrollView extends ScrollView {
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\b\u001A\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\tH\u0016J\u0012\u0010\u000E\u001A\u00020\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\u0010H\u0002¨\u0006\u0011"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/html/editor/view/HtmlEditScrollView$HtmlEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onTextContextMenuItem", "", "id", "paste", "editable", "Landroid/text/Editable;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    static final class HtmlEditText extends AppCompatEditText {
        public HtmlEditText(@NotNull Context context0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            super(context0);
        }

        public HtmlEditText(@NotNull Context context0, @NotNull AttributeSet attributeSet0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
            super(context0, attributeSet0);
        }

        public HtmlEditText(@NotNull Context context0, @NotNull AttributeSet attributeSet0, int v) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
            super(context0, attributeSet0, v);
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
                editable0.replace(v3, v, charSequence0);
                return true;
            }
            return false;
        }
    }

    private HtmlEditText _codeEditText;
    private HorizontalScrollView _horizontalScrollView;
    @NotNull
    private final Rect lineBoundRect;
    private float lineNumberOpacity;
    private int lineNumberPaddingLeft;
    private int lineNumberPaddingRight;
    private float lineSpacingExtra;
    @NotNull
    private final Paint paint;
    @NotNull
    private final Regex startSpaceRegex;
    private int tempScrollY;
    private int textColor;
    private float textSize;

    @JvmOverloads
    public HtmlEditScrollView(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @JvmOverloads
    public HtmlEditScrollView(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @JvmOverloads
    public HtmlEditScrollView(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        this.lineNumberOpacity = 0.3f;
        this.textColor = 0xFF000000;
        this.textSize = 14.0f;
        this.paint = new Paint();
        this.lineBoundRect = new Rect();
        this.startSpaceRegex = new Regex("^(\\s+)");
        this.createChildViews();
        this.addChildViews();
        this.setFillViewport(true);
    }

    public HtmlEditScrollView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void addChildViews() {
        HorizontalScrollView horizontalScrollView0 = this._horizontalScrollView;
        HtmlEditText htmlEditScrollView$HtmlEditText0 = null;
        if(horizontalScrollView0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_horizontalScrollView");
            horizontalScrollView0 = null;
        }
        this.addView(horizontalScrollView0);
        HorizontalScrollView horizontalScrollView1 = this._horizontalScrollView;
        if(horizontalScrollView1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_horizontalScrollView");
            horizontalScrollView1 = null;
        }
        HtmlEditText htmlEditScrollView$HtmlEditText1 = this._codeEditText;
        if(htmlEditScrollView$HtmlEditText1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
        }
        else {
            htmlEditScrollView$HtmlEditText0 = htmlEditScrollView$HtmlEditText1;
        }
        horizontalScrollView1.addView(htmlEditScrollView$HtmlEditText0);
    }

    private final void createChildViews() {
        Context context0 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        HtmlEditText htmlEditScrollView$HtmlEditText0 = new HtmlEditText(context0);
        htmlEditScrollView$HtmlEditText0.setId(id.text);
        htmlEditScrollView$HtmlEditText0.setTypeface(Typeface.MONOSPACE);
        htmlEditScrollView$HtmlEditText0.setIncludeFontPadding(false);
        htmlEditScrollView$HtmlEditText0.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        htmlEditScrollView$HtmlEditText0.setGravity(0x30);
        htmlEditScrollView$HtmlEditText0.setMinEms(1);
        htmlEditScrollView$HtmlEditText0.setBackground(null);
        htmlEditScrollView$HtmlEditText0.setTextSize(this.textSize);
        htmlEditScrollView$HtmlEditText0.setPadding(0, htmlEditScrollView$HtmlEditText0.getPaddingBottom(), htmlEditScrollView$HtmlEditText0.getPaddingRight(), htmlEditScrollView$HtmlEditText0.getPaddingTop());
        htmlEditScrollView$HtmlEditText0.setTextColor(this.textColor);
        htmlEditScrollView$HtmlEditText0.setLineSpacing(this.lineSpacingExtra, 1.0f);
        htmlEditScrollView$HtmlEditText0.addTextChangedListener(new TextWatcher() {
            private int addIndent;
            private int lineNumDiff;
            @NotNull
            private String originalString;
            private int removeIndent;

            {
                HtmlEditScrollView htmlEditScrollView0 = htmlEditScrollView$HtmlEditText0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.originalString = "";
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable0) {
                int v5;
                this.originalString = "";
                int v = this.lineNumDiff;
                int v1 = this.addIndent;
                int v2 = this.removeIndent;
                int v3 = 0;
                this.lineNumDiff = 0;
                this.addIndent = 0;
                this.removeIndent = 0;
                if(v != 0) {
                    if(v > 0) {
                        int v4 = this.$it.getSelectionStart();
                        if(editable0 == null) {
                            v5 = 0;
                        }
                        else {
                            String s = editable0.subSequence(0, v4).toString();
                            v5 = s == null ? 0 : StringsKt__StringsKt.lastIndexOf$default(s, '\n', 0, false, 6, null);
                        }
                        if(v5 >= 0) {
                            v3 = v5;
                        }
                        Editable editable1 = this.$it.getText();
                        if(editable1 != null) {
                            editable1.delete(v4, v2 + v4);
                        }
                        Editable editable2 = this.$it.getText();
                        if(editable2 != null) {
                            editable2.insert(v3 + 1, p.repeat(" ", v1));
                        }
                    }
                    htmlEditScrollView$HtmlEditText0.invalidate();
                }
                htmlEditScrollView$HtmlEditText0.getEditText().setHint("");
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence charSequence0, int v, int v1, int v2) {
                int v6;
                Intrinsics.checkNotNullParameter(charSequence0, "s");
                this.originalString = charSequence0.toString();
                if(v1 < v2) {
                    int v3 = 0;
                    int v4 = StringsKt__StringsKt.lastIndexOf$default(charSequence0.subSequence(0, v).toString(), '\n', 0, false, 6, null);
                    int v5 = StringsKt__StringsKt.indexOf$default(charSequence0, '\n', v, false, 4, null);
                    if(v5 < 0) {
                        v5 = charSequence0.length();
                    }
                    String s = charSequence0.subSequence((v4 >= 0 ? v4 + 1 : 0), v).toString();
                    String s1 = charSequence0.subSequence(v, v5).toString();
                    MatchResult matchResult0 = Regex.find$default(htmlEditScrollView$HtmlEditText0.startSpaceRegex, s, 0, 2, null);
                    if(matchResult0 == null) {
                        v6 = 0;
                    }
                    else {
                        String s2 = matchResult0.getValue();
                        v6 = s2 == null ? 0 : s2.length();
                    }
                    this.addIndent = v6;
                    MatchResult matchResult1 = Regex.find$default(htmlEditScrollView$HtmlEditText0.startSpaceRegex, s1, 0, 2, null);
                    if(matchResult1 != null) {
                        String s3 = matchResult1.getValue();
                        if(s3 != null) {
                            v3 = s3.length();
                        }
                    }
                    this.removeIndent = v3;
                }
            }

            public final int getAddIndent() {
                return this.addIndent;
            }

            public final int getLineNumDiff() {
                return this.lineNumDiff;
            }

            @NotNull
            public final String getOriginalString() {
                return this.originalString;
            }

            public final int getRemoveIndent() {
                return this.removeIndent;
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence charSequence0, int v, int v1, int v2) {
                String s;
                Intrinsics.checkNotNullParameter(charSequence0, "s");
                if(v2 > v1) {
                    s = charSequence0.subSequence(v, v2 - v1 + v).toString();
                }
                else {
                    s = this.originalString.substring(v, v1 - v2 + v);
                    Intrinsics.checkNotNullExpressionValue(s, "substring(...)");
                }
                int v4 = 0;
                for(int v3 = 0; v3 < s.length(); ++v3) {
                    if(s.charAt(v3) == 10) {
                        ++v4;
                    }
                }
                if(v2 <= v1) {
                    v4 = -v4;
                }
                this.lineNumDiff = v4;
            }

            public final void setAddIndent(int v) {
                this.addIndent = v;
            }

            public final void setLineNumDiff(int v) {
                this.lineNumDiff = v;
            }

            public final void setOriginalString(@NotNull String s) {
                Intrinsics.checkNotNullParameter(s, "<set-?>");
                this.originalString = s;
            }

            public final void setRemoveIndent(int v) {
                this.removeIndent = v;
            }
        });
        this._codeEditText = htmlEditScrollView$HtmlEditText0;
        HorizontalScrollView horizontalScrollView0 = new HorizontalScrollView(this.getContext());
        horizontalScrollView0.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        this._horizontalScrollView = horizontalScrollView0;
    }

    @NotNull
    public final EditText getEditText() {
        EditText editText0 = this._codeEditText;
        if(editText0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
            return null;
        }
        return editText0;
    }

    public final float getLineNumberOpacity() {
        return this.lineNumberOpacity;
    }

    public final int getLineNumberPaddingLeft() {
        return this.lineNumberPaddingLeft;
    }

    public final int getLineNumberPaddingRight() {
        return this.lineNumberPaddingRight;
    }

    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    @Override  // android.view.View
    public void onDraw(@NotNull Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Paint paint0 = this.paint;
        HtmlEditText htmlEditScrollView$HtmlEditText0 = this._codeEditText;
        if(htmlEditScrollView$HtmlEditText0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
            htmlEditScrollView$HtmlEditText0 = null;
        }
        paint0.setTextSize(htmlEditScrollView$HtmlEditText0.getTextSize());
        Paint paint1 = this.paint;
        HtmlEditText htmlEditScrollView$HtmlEditText1 = this._codeEditText;
        if(htmlEditScrollView$HtmlEditText1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
            htmlEditScrollView$HtmlEditText1 = null;
        }
        paint1.setTypeface(htmlEditScrollView$HtmlEditText1.getTypeface());
        int v = ResourcesCompat.getColor(this.getResources(), color.ke_color_text_code_line_number, this.getContext().getTheme());
        this.paint.setColor(v);
        Paint paint2 = this.paint;
        HtmlEditText htmlEditScrollView$HtmlEditText2 = this._codeEditText;
        if(htmlEditScrollView$HtmlEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
            htmlEditScrollView$HtmlEditText2 = null;
        }
        float f = paint2.measureText(String.valueOf(htmlEditScrollView$HtmlEditText2.getLineCount()));
        float f1 = ((float)this.lineNumberPaddingLeft) + f;
        this.setPadding(((int)(((float)this.lineNumberPaddingRight) + f1)), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        float f2 = this.paint.measureText("1");
        HtmlEditText htmlEditScrollView$HtmlEditText3 = this._codeEditText;
        if(htmlEditScrollView$HtmlEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
            htmlEditScrollView$HtmlEditText3 = null;
        }
        float f3 = ((float)htmlEditScrollView$HtmlEditText3.getBaseline()) + ((float)this.getPaddingTop());
        canvas0.drawText("1", f1 - f2, f3, this.paint);
        int v1 = 1;
        while(true) {
            HtmlEditText htmlEditScrollView$HtmlEditText4 = this._codeEditText;
            if(htmlEditScrollView$HtmlEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
                htmlEditScrollView$HtmlEditText4 = null;
            }
            if(v1 >= htmlEditScrollView$HtmlEditText4.getLineCount()) {
                break;
            }
            HtmlEditText htmlEditScrollView$HtmlEditText5 = this._codeEditText;
            if(htmlEditScrollView$HtmlEditText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
                htmlEditScrollView$HtmlEditText5 = null;
            }
            htmlEditScrollView$HtmlEditText5.getLineBounds(v1, this.lineBoundRect);
            f3 += (float)this.lineBoundRect.height();
            HtmlEditText htmlEditScrollView$HtmlEditText6 = this._codeEditText;
            if(htmlEditScrollView$HtmlEditText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
                htmlEditScrollView$HtmlEditText6 = null;
            }
            if(v1 == htmlEditScrollView$HtmlEditText6.getLineCount() - 1) {
                HtmlEditText htmlEditScrollView$HtmlEditText7 = this._codeEditText;
                if(htmlEditScrollView$HtmlEditText7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
                    htmlEditScrollView$HtmlEditText7 = null;
                }
                f3 = htmlEditScrollView$HtmlEditText7.getLineSpacingExtra() + f3;
            }
            ++v1;
            canvas0.drawText(String.valueOf(v1), f1 - this.paint.measureText(String.valueOf(v1)), f3, this.paint);
        }
        super.onDraw(canvas0);
    }

    @Override  // android.widget.ScrollView
    public boolean onTouchEvent(@Nullable MotionEvent motionEvent0) {
        HtmlEditText htmlEditScrollView$HtmlEditText0 = null;
        Integer integer0 = motionEvent0 == null ? null : motionEvent0.getAction();
        if(integer0 != null && ((int)integer0) == 0) {
            this.tempScrollY = this.getScrollY();
            return super.onTouchEvent(motionEvent0);
        }
        if(integer0 != null && ((int)integer0) == 1 && this.getScrollY() == this.tempScrollY) {
            HtmlEditText htmlEditScrollView$HtmlEditText1 = this._codeEditText;
            if(htmlEditScrollView$HtmlEditText1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
            }
            else {
                htmlEditScrollView$HtmlEditText0 = htmlEditScrollView$HtmlEditText1;
            }
            motionEvent0.setLocation(c.coerceAtLeast(motionEvent0.getX() - ((float)this.getPaddingLeft()), 0.0f), c.coerceAtLeast(motionEvent0.getY() + ((float)this.getScrollY()), 0.0f));
            htmlEditScrollView$HtmlEditText0.onTouchEvent(motionEvent0);
        }
        return super.onTouchEvent(motionEvent0);
    }

    public final void setLineNumberOpacity(float f) {
        this.lineNumberOpacity = f;
    }

    public final void setLineNumberPaddingLeft(int v) {
        this.lineNumberPaddingLeft = v;
        this.invalidate();
    }

    public final void setLineNumberPaddingRight(int v) {
        this.lineNumberPaddingRight = v;
        this.invalidate();
    }

    public final void setLineSpacingExtra(float f) {
        this.lineSpacingExtra = f;
        HtmlEditText htmlEditScrollView$HtmlEditText0 = this._codeEditText;
        if(htmlEditScrollView$HtmlEditText0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
            htmlEditScrollView$HtmlEditText0 = null;
        }
        htmlEditScrollView$HtmlEditText0.setLineSpacing(f, 1.0f);
    }

    public final void setTextColor(int v) {
        this.textColor = v;
        HtmlEditText htmlEditScrollView$HtmlEditText0 = this._codeEditText;
        if(htmlEditScrollView$HtmlEditText0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
            htmlEditScrollView$HtmlEditText0 = null;
        }
        htmlEditScrollView$HtmlEditText0.setTextColor(v);
    }

    public final void setTextSize(float f) {
        this.textSize = f;
        HtmlEditText htmlEditScrollView$HtmlEditText0 = this._codeEditText;
        if(htmlEditScrollView$HtmlEditText0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("_codeEditText");
            htmlEditScrollView$HtmlEditText0 = null;
        }
        htmlEditScrollView$HtmlEditText0.setTextSize(f);
    }
}

