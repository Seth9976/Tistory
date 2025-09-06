package androidx.compose.ui.text.platform.extensions;

import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.emoji2.text.EmojiSpan;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001A/\u0010\b\u001A\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroid/text/Spannable;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "", "setPlaceholders", "(Landroid/text/Spannable;Ljava/util/List;Landroidx/compose/ui/unit/Density;)V", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n33#2,6:94\n13579#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"})
public final class PlaceholderExtensions_androidKt {
    public static final void setPlaceholders(@NotNull Spannable spannable0, @NotNull List list0, @NotNull Density density0) {
        int v10;
        int v8;
        int v6;
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Range annotatedString$Range0 = (Range)list0.get(v1);
            Placeholder placeholder0 = (Placeholder)annotatedString$Range0.component1();
            int v2 = annotatedString$Range0.component2();
            int v3 = annotatedString$Range0.component3();
            Object[] arr_object = spannable0.getSpans(v2, v3, EmojiSpan.class);
            for(int v4 = 0; v4 < arr_object.length; ++v4) {
                spannable0.removeSpan(((EmojiSpan)arr_object[v4]));
            }
            float f = TextUnit.getValue-impl(placeholder0.getWidth-XSAIIZE());
            long v5 = TextUnit.getType-UIouoOA(placeholder0.getWidth-XSAIIZE());
            if(TextUnitType.equals-impl0(v5, 0x100000000L)) {
                v6 = 0;
            }
            else {
                v6 = TextUnitType.equals-impl0(v5, 0x200000000L) ? 1 : 2;
            }
            float f1 = TextUnit.getValue-impl(placeholder0.getHeight-XSAIIZE());
            long v7 = TextUnit.getType-UIouoOA(placeholder0.getHeight-XSAIIZE());
            if(TextUnitType.equals-impl0(v7, 0x100000000L)) {
                v8 = 0;
            }
            else {
                v8 = TextUnitType.equals-impl0(v7, 0x200000000L) ? 1 : 2;
            }
            float f2 = density0.getFontScale();
            float f3 = density0.getDensity();
            int v9 = placeholder0.getPlaceholderVerticalAlign-J6kI3mc();
            if(PlaceholderVerticalAlign.equals-impl0(v9, 1)) {
                v10 = 0;
            }
            else if(PlaceholderVerticalAlign.equals-impl0(v9, 2)) {
                v10 = 1;
            }
            else if(PlaceholderVerticalAlign.equals-impl0(v9, 3)) {
                v10 = 2;
            }
            else if(PlaceholderVerticalAlign.equals-impl0(v9, 4)) {
                v10 = 3;
            }
            else if(PlaceholderVerticalAlign.equals-impl0(v9, 5)) {
                v10 = 4;
            }
            else if(PlaceholderVerticalAlign.equals-impl0(v9, 6)) {
                v10 = 5;
            }
            else {
                if(!PlaceholderVerticalAlign.equals-impl0(v9, 7)) {
                    throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
                }
                v10 = 6;
            }
            SpannableExtensions_androidKt.setSpan(spannable0, new PlaceholderSpan(f, v6, f1, v8, f2 * f3, v10), v2, v3);
        }
    }
}

