package com.kakao.keditor.plugin.itemspec.paragraph;

import android.content.Context;
import android.text.Spannable;
import android.view.View;
import com.kakao.keditor.plugin.attrs.text.spans.KeGrammarErrorSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001E\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\rJ\u000E\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00110\u0010H&JQ\u0010\u0012\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0013\u001A\u00020\u00032!\u0010\u0014\u001A\u001D\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u001A\u001A\u00020\u001BR\u001A\u0010\u0002\u001A\u00020\u0003X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u001C"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem;", "Lcom/kakao/keditor/plugin/itemspec/paragraph/TextItem;", "hasPendingFocus", "", "(Z)V", "getHasPendingFocus", "()Z", "setHasPendingFocus", "clearKeGrammarSpansIn", "", "spannable", "Landroid/text/Spannable;", "start", "", "length", "parseGrammarCheckTexts", "", "", "setKeGrammarSpan", "isFocused", "onClickAction", "Lkotlin/Function1;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "context", "Landroid/content/Context;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGrammarCheckTextItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrammarCheckTextItem.kt\ncom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,24:1\n13309#2,2:25\n*S KotlinDebug\n*F\n+ 1 GrammarCheckTextItem.kt\ncom/kakao/keditor/plugin/itemspec/paragraph/GrammarCheckTextItem\n*L\n20#1:25,2\n*E\n"})
public abstract class GrammarCheckTextItem extends TextItem {
    private boolean hasPendingFocus;

    public GrammarCheckTextItem(boolean z) {
        super(false, 1, null);
        this.hasPendingFocus = z;
    }

    public final void clearKeGrammarSpansIn(@NotNull Spannable spannable0, int v, int v1) {
        Intrinsics.checkNotNullParameter(spannable0, "spannable");
        Object[] arr_object = spannable0.getSpans(v, v1 + v, KeGrammarErrorSpan.class);
        Intrinsics.checkNotNullExpressionValue(arr_object, "getSpans(...)");
        for(int v2 = 0; v2 < arr_object.length; ++v2) {
            spannable0.removeSpan(((KeGrammarErrorSpan)arr_object[v2]));
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public boolean getHasPendingFocus() {
        return this.hasPendingFocus;
    }

    @NotNull
    public abstract List parseGrammarCheckTexts();

    @Override  // com.kakao.keditor.plugin.itemspec.paragraph.TextItem
    public void setHasPendingFocus(boolean z) {
        this.hasPendingFocus = z;
    }

    public final void setKeGrammarSpan(@NotNull Spannable spannable0, int v, int v1, boolean z, @NotNull Function1 function10, @NotNull Context context0) {
        Intrinsics.checkNotNullParameter(spannable0, "spannable");
        Intrinsics.checkNotNullParameter(function10, "onClickAction");
        Intrinsics.checkNotNullParameter(context0, "context");
        this.clearKeGrammarSpansIn(spannable0, v, v1);
        spannable0.setSpan(new KeGrammarErrorSpan(context0, z, new Function1() {
            final Function1 $onClickAction;

            {
                this.$onClickAction = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((View)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull View view0) {
                Intrinsics.checkNotNullParameter(view0, "view");
                this.$onClickAction.invoke(view0);
            }
        }), v, v1 + v, 33);
    }
}

