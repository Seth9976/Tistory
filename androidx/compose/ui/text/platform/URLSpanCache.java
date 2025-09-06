package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.LinkAnnotation.Url;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import java.util.WeakHashMap;
import k2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({Scope.LIBRARY_GROUP})
@StabilityInferred(parameters = 0)
@InternalTextApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001B\u0010\u0007\u001A\u00020\u00062\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0007\u0010\fJ\u001D\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/platform/URLSpanCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "Landroid/text/style/URLSpan;", "toURLSpan", "(Landroidx/compose/ui/text/UrlAnnotation;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "urlRange", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/LinkAnnotation;", "linkRange", "Landroid/text/style/ClickableSpan;", "toClickableSpan", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroid/text/style/ClickableSpan;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nURLSpanCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URLSpanCache.android.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,82:1\n361#2,7:83\n361#2,7:90\n361#2,7:97\n*S KotlinDebug\n*F\n+ 1 URLSpanCache.android.kt\nandroidx/compose/ui/text/platform/URLSpanCache\n*L\n59#1:83,7\n63#1:90,7\n72#1:97,7\n*E\n"})
public final class URLSpanCache {
    public static final int $stable = 8;
    public final WeakHashMap a;
    public final WeakHashMap b;
    public final WeakHashMap c;

    public URLSpanCache() {
        this.a = new WeakHashMap();
        this.b = new WeakHashMap();
        this.c = new WeakHashMap();
    }

    @Nullable
    public final ClickableSpan toClickableSpan(@NotNull Range annotatedString$Range0) {
        WeakHashMap weakHashMap0 = this.c;
        d d0 = weakHashMap0.get(annotatedString$Range0);
        if(d0 == null) {
            d0 = new d(((LinkAnnotation)annotatedString$Range0.getItem()));
            weakHashMap0.put(annotatedString$Range0, d0);
        }
        return d0;
    }

    @NotNull
    public final URLSpan toURLSpan(@NotNull Range annotatedString$Range0) {
        WeakHashMap weakHashMap0 = this.b;
        URLSpan uRLSpan0 = weakHashMap0.get(annotatedString$Range0);
        if(uRLSpan0 == null) {
            uRLSpan0 = new URLSpan(((Url)annotatedString$Range0.getItem()).getUrl());
            weakHashMap0.put(annotatedString$Range0, uRLSpan0);
        }
        return uRLSpan0;
    }

    @NotNull
    public final URLSpan toURLSpan(@NotNull UrlAnnotation urlAnnotation0) {
        WeakHashMap weakHashMap0 = this.a;
        URLSpan uRLSpan0 = weakHashMap0.get(urlAnnotation0);
        if(uRLSpan0 == null) {
            uRLSpan0 = new URLSpan(urlAnnotation0.getUrl());
            weakHashMap0.put(urlAnnotation0, uRLSpan0);
        }
        return uRLSpan0;
    }
}

