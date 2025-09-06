package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0011\u0010\u0002\u001A\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001A\u0011\u0010\u0006\u001A\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001A\u0017\u0010\n\u001A\u0004\u0018\u00010\t*\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000B\u001A\u0013\u0010\f\u001A\u00020\b*\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r*\n\u0010\u000F\"\u00020\u000E2\u00020\u000E¨\u0006\u0010"}, d2 = {"Landroid/content/ClipData;", "Landroidx/compose/ui/platform/ClipEntry;", "toClipEntry", "(Landroid/content/ClipData;)Landroidx/compose/ui/platform/ClipEntry;", "Landroid/content/ClipDescription;", "Landroidx/compose/ui/platform/ClipMetadata;", "toClipMetadata", "(Landroid/content/ClipDescription;)Landroidx/compose/ui/platform/ClipMetadata;", "", "Landroidx/compose/ui/text/AnnotatedString;", "convertToAnnotatedString", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString;", "convertToCharSequence", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/CharSequence;", "Landroid/content/ClipboardManager;", "NativeClipboard", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidClipboardManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,609:1\n33#2,6:610\n*S KotlinDebug\n*F\n+ 1 AndroidClipboardManager.android.kt\nandroidx/compose/ui/platform/AndroidClipboardManager_androidKt\n*L\n168#1:610,6\n*E\n"})
public final class AndroidClipboardManager_androidKt {
    @Nullable
    public static final AnnotatedString convertToAnnotatedString(@Nullable CharSequence charSequence0) {
        if(charSequence0 == null) {
            return null;
        }
        if(!(charSequence0 instanceof Spanned)) {
            return new AnnotatedString(charSequence0.toString(), null, null, 6, null);
        }
        Annotation[] arr_annotation = (Annotation[])((Spanned)charSequence0).getSpans(0, charSequence0.length(), Annotation.class);
        ArrayList arrayList0 = new ArrayList();
        int v1 = ArraysKt___ArraysKt.getLastIndex(arr_annotation);
        if(v1 >= 0) {
            for(int v = 0; true; ++v) {
                Annotation annotation0 = arr_annotation[v];
                if(Intrinsics.areEqual(annotation0.getKey(), "androidx.compose.text.SpanStyle")) {
                    int v2 = ((Spanned)charSequence0).getSpanStart(annotation0);
                    int v3 = ((Spanned)charSequence0).getSpanEnd(annotation0);
                    arrayList0.add(new Range(new DecodeHelper(annotation0.getValue()).decodeSpanStyle(), v2, v3));
                }
                if(v == v1) {
                    break;
                }
            }
        }
        return new AnnotatedString(charSequence0.toString(), arrayList0, null, 4, null);
    }

    @NotNull
    public static final CharSequence convertToCharSequence(@NotNull AnnotatedString annotatedString0) {
        if(annotatedString0.getSpanStyles().isEmpty()) {
            return annotatedString0.getText();
        }
        CharSequence charSequence0 = new SpannableString(annotatedString0.getText());
        EncodeHelper encodeHelper0 = new EncodeHelper();
        List list0 = annotatedString0.getSpanStyles();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Range annotatedString$Range0 = (Range)list0.get(v1);
            encodeHelper0.reset();
            encodeHelper0.encode(((SpanStyle)annotatedString$Range0.component1()));
            ((SpannableString)charSequence0).setSpan(new Annotation("androidx.compose.text.SpanStyle", encodeHelper0.encodedString()), annotatedString$Range0.component2(), annotatedString$Range0.component3(), 33);
        }
        return charSequence0;
    }

    @NotNull
    public static final ClipEntry toClipEntry(@NotNull ClipData clipData0) {
        return new ClipEntry(clipData0);
    }

    @NotNull
    public static final ClipMetadata toClipMetadata(@NotNull ClipDescription clipDescription0) {
        return new ClipMetadata(clipDescription0);
    }
}

