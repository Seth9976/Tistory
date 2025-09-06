package com.kakao.tistory.presentation;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.kandinsky.launcher.KandinskyContract;
import com.kakao.kandinsky.launcher.KandinskyInput;
import com.kakao.kandinsky.launcher.KandinskyMenu;
import com.kakao.kandinsky.launcher.KandinskyOutputItem;
import com.kakao.kphotopicker.PhotoEditor;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001A\u0004\u0018\u00010\f2\u0006\u0010\b\u001A\u00020\u00072\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u000B\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000EJ-\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0010\u001A\u00020\u000F2\b\u0010\u0011\u001A\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/presentation/TistoryPhotoEditor;", "Lcom/kakao/kphotopicker/PhotoEditor;", "Lkotlin/Function0;", "", "getBlogName", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "", "imagePaths", "outDirPath", "Landroid/content/Intent;", "newIntent", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;)Landroid/content/Intent;", "", "resultCode", "data", "", "onActivityResult", "(ILandroid/content/Intent;)Ljava/util/Map;", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKandinskyInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KandinskyInitializer.kt\ncom/kakao/tistory/presentation/TistoryPhotoEditor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,133:1\n1271#2,2:134\n1285#2,4:136\n1238#2,4:142\n453#3:140\n403#3:141\n*S KotlinDebug\n*F\n+ 1 KandinskyInitializer.kt\ncom/kakao/tistory/presentation/TistoryPhotoEditor\n*L\n63#1:134,2\n63#1:136,4\n82#1:142,4\n82#1:140\n82#1:141\n*E\n"})
public final class TistoryPhotoEditor implements PhotoEditor {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/TistoryPhotoEditor$Companion;", "", "", "REQUEST_CODE", "I", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    public static final int REQUEST_CODE = 10423;
    public final Function0 a;
    public final KandinskyContract b;

    static {
        TistoryPhotoEditor.Companion = new Companion(null);
        TistoryPhotoEditor.$stable = 8;
    }

    public TistoryPhotoEditor(@NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "getBlogName");
        super();
        this.a = function00;
        this.b = new KandinskyContract();
    }

    @Override  // com.kakao.kphotopicker.PhotoEditor
    @Nullable
    public Intent newIntent(@NotNull Context context0, @NotNull List list0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(list0, "imagePaths");
        Intrinsics.checkNotNullParameter(s, "outDirPath");
        KandinskyContract kandinskyContract0 = this.b;
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(l.collectionSizeOrDefault(list0, 10)), 16));
        for(Object object0: list0) {
            String s1 = (String)object0;
            linkedHashMap0.put(object0, null);
        }
        List list1 = CollectionsKt__CollectionsKt.listOf(new KandinskyMenu[]{KandinskyMenu.Effect, KandinskyMenu.Resize, KandinskyMenu.Crop, KandinskyMenu.Mosaic, KandinskyMenu.Signature, KandinskyMenu.Sticker, KandinskyMenu.Text, KandinskyMenu.Border});
        Map map0 = w.mapOf(TuplesKt.to("티스토리 폰트", font.font_pretendard_regular));
        String s2 = (String)this.a.invoke();
        if(s2 == null) {
            s2 = "Tistory";
        }
        return kandinskyContract0.createIntent(context0, new KandinskyInput(true, 0, linkedHashMap0, s2, false, map0, list1, null, 0x92, null));
    }

    @Override  // com.kakao.kphotopicker.PhotoEditor
    @NotNull
    public Map onActivityResult(int v, @Nullable Intent intent0) {
        String s1;
        Map map0 = this.b.parseResult(v, intent0).getOutput();
        Map map1 = new LinkedHashMap(w.mapCapacity(map0.size()));
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getKey();
            KandinskyOutputItem kandinskyOutputItem0 = (KandinskyOutputItem)map$Entry0.getValue();
            if(kandinskyOutputItem0 == null) {
                s1 = (String)map$Entry0.getKey();
            }
            else {
                String s = kandinskyOutputItem0.getResultBitmap();
                if(s != null) {
                    s1 = s;
                }
            }
            map1.put(object1, s1);
        }
        return map1;
    }
}

