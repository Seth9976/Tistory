package com.kakao.kandinsky.launcher;

import android.content.ContentResolver;
import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.kakao.kandinsky.bitmap.repository.BitmapRepository;
import com.kakao.kandinsky.bitmap.usecase.GetBitmapUseCase;
import com.kakao.kandinsky.core.filter.repository.FilterRepository;
import com.kakao.kandinsky.core.filter.usecase.GetFilteredBitmapUseCase;
import com.kakao.kandinsky.delegate.BitmapLoader;
import com.kakao.kandinsky.delegate.ImageLibrary;
import com.kakao.kandinsky.history.KPhotoKey;
import d.g;
import d.h;
import dagger.internal.Preconditions;
import e.u;
import f.l;
import ja.b;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import qd.a;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000E\bÇ\u0002\u0018\u00002\u00020\u0001J-\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u008F\u0001\u0010\u001E\u001A\u00020\b2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000B2\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\b\b\u0002\u0010\u0011\u001A\u00020\u00102\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00020\u00130\u00122\u000E\b\u0002\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00150\u00122\u0006\u0010\u0017\u001A\u00020\u00132\b\b\u0002\u0010\u0018\u001A\u00020\u000E2\u0014\b\u0002\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100\u00192\u000E\b\u0002\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u001B0\u00122\b\b\u0002\u0010\u001D\u001A\u00020\u0013¢\u0006\u0004\b\u001E\u0010\u001FJ\u0018\u0010\"\u001A\u00020 2\u0006\u0010!\u001A\u00020 H\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010\"\u001A\u00020$2\u0006\u0010!\u001A\u00020$H\u0086@¢\u0006\u0004\b\"\u0010%R$\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/kakao/kandinsky/launcher/Kandinsky;", "", "Landroid/content/Context;", "context", "Lcom/kakao/kandinsky/delegate/ImageLibrary;", "imageLibrary", "Lcom/kakao/kandinsky/delegate/BitmapLoader;", "bitmapLoader", "", "initialize", "(Landroid/content/Context;Lcom/kakao/kandinsky/delegate/ImageLibrary;Lcom/kakao/kandinsky/delegate/BitmapLoader;)V", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/kakao/kandinsky/launcher/KandinskyInput;", "launcher", "", "isAllowGenerateBitmap", "", "index", "", "", "uris", "Lcom/kakao/kandinsky/history/KPhotoKey;", "editingData", "defaultSignature", "allowSystemFont", "", "fontResources", "Lcom/kakao/kandinsky/launcher/KandinskyMenu;", "menu", "referrer", "open", "(Landroidx/activity/result/ActivityResultLauncher;ZILjava/util/List;Ljava/util/List;Ljava/lang/String;ZLjava/util/Map;Ljava/util/List;Ljava/lang/String;)V", "Lcom/kakao/kandinsky/launcher/KandinskyOutputItem;", "output", "generateBitmap", "(Lcom/kakao/kandinsky/launcher/KandinskyOutputItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kakao/kandinsky/launcher/KandinskyOutput;", "(Lcom/kakao/kandinsky/launcher/KandinskyOutput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/kakao/kandinsky/delegate/BitmapLoader;", "getBitmapLoader$kandinsky_release", "()Lcom/kakao/kandinsky/delegate/BitmapLoader;", "setBitmapLoader$kandinsky_release", "(Lcom/kakao/kandinsky/delegate/BitmapLoader;)V", "b", "Lcom/kakao/kandinsky/delegate/ImageLibrary;", "getImageLibrary$kandinsky_release", "()Lcom/kakao/kandinsky/delegate/ImageLibrary;", "setImageLibrary$kandinsky_release", "(Lcom/kakao/kandinsky/delegate/ImageLibrary;)V", "kandinsky_release"}, k = 1, mv = {1, 9, 0})
public final class Kandinsky {
    public static final int $stable = 8;
    public static final Kandinsky INSTANCE;
    public static BitmapLoader a;
    public static ImageLibrary b;
    public static l c;

    static {
        Kandinsky.INSTANCE = new Kandinsky();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final Object generateBitmap(KandinskyOutput kandinskyOutput0, Continuation continuation0) {
        Map map2;
        Object object2;
        Map map1;
        Iterator iterator0;
        b b0;
        if(continuation0 instanceof b) {
            b0 = (b)continuation0;
            int v = b0.u;
            if((v & 0x80000000) == 0) {
                b0 = new b(this, continuation0);
            }
            else {
                b0.u = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(this, continuation0);
        }
        Object object0 = b0.s;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(b0.u) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Map map0 = kandinskyOutput0.getOutput();
                LinkedHashMap linkedHashMap0 = new LinkedHashMap(w.mapCapacity(map0.size()));
                iterator0 = map0.entrySet().iterator();
                map1 = linkedHashMap0;
                goto label_28;
            }
            case 1: {
                object2 = b0.r;
                map1 = b0.q;
                iterator0 = b0.p;
                map2 = b0.o;
                ResultKt.throwOnFailure(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            Object object3 = object2;
            KandinskyOutputItem kandinskyOutputItem0 = (KandinskyOutputItem)object0;
            while(true) {
                map1.put(object3, kandinskyOutputItem0);
                map1 = map2;
            label_28:
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object4 = iterator0.next();
                object3 = ((Map.Entry)object4).getKey();
                KandinskyOutputItem kandinskyOutputItem1 = (KandinskyOutputItem)((Map.Entry)object4).getValue();
                if(kandinskyOutputItem1 != null) {
                    b0.o = map1;
                    b0.p = iterator0;
                    b0.q = map1;
                    b0.r = object3;
                    b0.u = 1;
                    Object object5 = Kandinsky.INSTANCE.generateBitmap(kandinskyOutputItem1, b0);
                    if(object5 == object1) {
                        return object1;
                    }
                    map2 = map1;
                    object0 = object5;
                    object2 = object3;
                    break;
                }
                kandinskyOutputItem0 = null;
                map2 = map1;
            }
        }
        return new KandinskyOutput(map1);
    }

    public final Object generateBitmap(KandinskyOutputItem kandinskyOutputItem0, Continuation continuation0) {
        KandinskyOutputItem kandinskyOutputItem3;
        KandinskyOutputItem kandinskyOutputItem2;
        KandinskyOutputItem kandinskyOutputItem1;
        String s;
        ja.a a0;
        if(continuation0 instanceof ja.a) {
            a0 = (ja.a)continuation0;
            int v = a0.s;
            if((v & 0x80000000) == 0) {
                a0 = new ja.a(this, continuation0);
            }
            else {
                a0.s = v ^ 0x80000000;
            }
        }
        else {
            a0 = new ja.a(this, continuation0);
        }
        Object object0 = a0.q;
        Object object1 = a.getCOROUTINE_SUSPENDED();
        switch(a0.s) {
            case 0: {
                s = null;
                ResultKt.throwOnFailure(object0);
                try {
                    if(kandinskyOutputItem0.getKey() != null) {
                        l l0 = Kandinsky.c;
                        if(l0 != null) {
                            a0.o = kandinskyOutputItem0;
                            a0.p = kandinskyOutputItem0;
                            a0.s = 1;
                            Object object2 = l0.a(kandinskyOutputItem0.getKey(), a0);
                            if(object2 == object1) {
                                return object1;
                            }
                            s = (String)object2;
                        }
                    }
                    kandinskyOutputItem1 = kandinskyOutputItem0;
                    return KandinskyOutputItem.copy$default(kandinskyOutputItem1, null, s, null, 5, null);
                }
                catch(IllegalArgumentException unused_ex) {
                    break;
                }
            }
            case 1: {
                try {
                    kandinskyOutputItem2 = a0.p;
                    kandinskyOutputItem3 = a0.o;
                    ResultKt.throwOnFailure(object0);
                    kandinskyOutputItem0 = kandinskyOutputItem3;
                }
                catch(IllegalArgumentException unused_ex) {
                    return KandinskyOutputItem.copy$default(kandinskyOutputItem3, null, null, Boxing.boxInt(500), 3, null);
                }
                try {
                    s = (String)object0;
                    kandinskyOutputItem1 = kandinskyOutputItem2;
                    return KandinskyOutputItem.copy$default(kandinskyOutputItem1, null, s, null, 5, null);
                }
                catch(IllegalArgumentException unused_ex) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return KandinskyOutputItem.copy$default(kandinskyOutputItem0, null, null, Boxing.boxInt(500), 3, null);
    }

    public final BitmapLoader getBitmapLoader$kandinsky_release() {
        return Kandinsky.a;
    }

    public final ImageLibrary getImageLibrary$kandinsky_release() {
        return Kandinsky.b;
    }

    public final void initialize(Context context0, ImageLibrary imageLibrary0, BitmapLoader bitmapLoader0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        if(imageLibrary0 == null) {
            throw new Exception("not found ImageLibrary implementation");
        }
        if(bitmapLoader0 == null) {
            throw new Exception("not found BitmapLoader implementation");
        }
        Kandinsky.b = imageLibrary0;
        Kandinsky.a = bitmapLoader0;
        d.b b0 = (d.b)Preconditions.checkNotNull(new d.b(context0));
        d.a a0 = (d.a)Preconditions.checkNotNull(new d.a(Kandinsky.a));
        h h0 = (h)Preconditions.checkNotNull(new h(context0));
        Preconditions.checkBuilderRequirement(b0, d.b.class);
        Preconditions.checkBuilderRequirement(a0, d.a.class);
        Preconditions.checkBuilderRequirement(h0, h.class);
        g g0 = new g(b0, a0, h0);
        Kandinsky.c = new l(((Context)Preconditions.checkNotNullFromProvides(b0.a)), ((ContentResolver)g0.a.get()), ((File)g0.b.get()), new f.b(), new GetBitmapUseCase(new BitmapRepository(((Context)Preconditions.checkNotNullFromProvides(b0.a)), ((ContentResolver)g0.a.get()), a0.a)), new GetFilteredBitmapUseCase(((FilterRepository)g0.c.get())), new u(((e.g)g0.d.get())));
    }

    public static void initialize$default(Kandinsky kandinsky0, Context context0, ImageLibrary imageLibrary0, BitmapLoader bitmapLoader0, int v, Object object0) {
        if((v & 2) != 0) {
            imageLibrary0 = null;
        }
        if((v & 4) != 0) {
            bitmapLoader0 = null;
        }
        kandinsky0.initialize(context0, imageLibrary0, bitmapLoader0);
    }

    public final void open(ActivityResultLauncher activityResultLauncher0, boolean z, int v, List list0, List list1, String s, boolean z1, Map map0, List list2, String s1) {
        Intrinsics.checkNotNullParameter(activityResultLauncher0, "launcher");
        Intrinsics.checkNotNullParameter(list0, "uris");
        Intrinsics.checkNotNullParameter(list1, "editingData");
        Intrinsics.checkNotNullParameter(s, "defaultSignature");
        Intrinsics.checkNotNullParameter(map0, "fontResources");
        Intrinsics.checkNotNullParameter(list2, "menu");
        Intrinsics.checkNotNullParameter(s1, "referrer");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(kotlin.collections.l.collectionSizeOrDefault(list1, 10)), 16));
        for(Object object0: list1) {
            linkedHashMap0.put(((KPhotoKey)object0).getUri(), object0);
        }
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(kotlin.collections.l.collectionSizeOrDefault(list0, 10)), 16));
        for(Object object1: list0) {
            linkedHashMap1.put(object1, ((KPhotoKey)linkedHashMap0.get(((String)object1))));
        }
        activityResultLauncher0.launch(new KandinskyInput(z, v, linkedHashMap1, s, z1, map0, list2, s1));
    }

    public static void open$default(Kandinsky kandinsky0, ActivityResultLauncher activityResultLauncher0, boolean z, int v, List list0, List list1, String s, boolean z1, Map map0, List list2, String s1, int v1, Object object0) {
        kandinsky0.open(activityResultLauncher0, ((v1 & 2) == 0 ? z : true), ((v1 & 4) == 0 ? v : 0), list0, ((v1 & 16) == 0 ? list1 : CollectionsKt__CollectionsKt.emptyList()), s, ((v1 & 0x40) == 0 ? z1 : true), ((v1 & 0x80) == 0 ? map0 : x.emptyMap()), ((v1 & 0x100) == 0 ? list2 : CollectionsKt__CollectionsKt.emptyList()), ((v1 & 0x200) == 0 ? s1 : ""));
    }

    public final void setBitmapLoader$kandinsky_release(BitmapLoader bitmapLoader0) {
        Kandinsky.a = bitmapLoader0;
    }

    public final void setImageLibrary$kandinsky_release(ImageLibrary imageLibrary0) {
        Kandinsky.b = imageLibrary0;
    }
}

