package com.kakao.keditor.plugin.attrs.text.spans;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.kakao.keditor.R.color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B:\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0006\u0012!\u0010\u0007\u001A\u001D\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¢\u0006\u0002\u0010\u000EJ\u0010\u0010\u0014\u001A\u00020\r2\u0006\u0010\u0015\u001A\u00020\tH\u0016J\u0010\u0010\u0016\u001A\u00020\r2\u0006\u0010\u0017\u001A\u00020\u0018H\u0016R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0005\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0011R,\u0010\u0007\u001A\u001D\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\b¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/spans/KeGrammarErrorSpan;", "Landroid/text/style/ClickableSpan;", "Lcom/kakao/keditor/plugin/attrs/text/spans/KeSpan;", "context", "Landroid/content/Context;", "isFocused", "", "onCLickAction", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "", "(Landroid/content/Context;ZLkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "()Z", "getOnCLickAction", "()Lkotlin/jvm/functions/Function1;", "onClick", "widget", "updateDrawState", "textPaint", "Landroid/text/TextPaint;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KeGrammarErrorSpan extends ClickableSpan implements KeSpan {
    @NotNull
    private final Context context;
    private final boolean isFocused;
    @NotNull
    private final Function1 onCLickAction;

    public KeGrammarErrorSpan(@NotNull Context context0, boolean z, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(function10, "onCLickAction");
        super();
        this.context = context0;
        this.isFocused = z;
        this.onCLickAction = function10;
    }

    public KeGrammarErrorSpan(Context context0, boolean z, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(context0, z, function10);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Function1 getOnCLickAction() {
        return this.onCLickAction;
    }

    public final boolean isFocused() {
        return this.isFocused;
    }

    @Override  // android.text.style.ClickableSpan
    public void onClick(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "widget");
        this.onCLickAction.invoke(view0);
    }

    @Override  // android.text.style.ClickableSpan
    public void updateDrawState(@NotNull TextPaint textPaint0) {
        int v1;
        int v;
        Intrinsics.checkNotNullParameter(textPaint0, "textPaint");
        if(this.isFocused) {
            try {
                v = -1;
                v = ContextCompat.getColor(this.context, color.ke_color_text_invert);
            }
            catch(Exception unused_ex) {
            }
            textPaint0.setColor(v);
        }
        try {
            v1 = 0xFF888888;
            v1 = ContextCompat.getColor(this.context, (this.isFocused ? color.ke_grammar_span_color_focused : color.ke_grammar_span_color_not_focused));
        }
        catch(Exception unused_ex) {
        }
        textPaint0.bgColor = v1;
    }
}

