package com.kakao.kandinsky;

import a.a2;
import a.b2;
import a.c2;
import a.d2;
import a.e2;
import a.f2;
import a.g2;
import a.h2;
import a.j2;
import a.k2;
import a.r1;
import a.s1;
import a.u1;
import a.v1;
import a.w1;
import a.x1;
import a.y1;
import a.z1;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.lifecycle.ViewModelKt;
import b.a;
import b.b0;
import b.d;
import b.e;
import b.f;
import b.g;
import b.h;
import b.i;
import b.j;
import b.k;
import b.m;
import b.n;
import b.o;
import b.p;
import b.s;
import com.kakao.kandinsky.base.KDMviViewModel;
import com.kakao.kandinsky.base.contract.DialogUiState;
import com.kakao.kandinsky.bitmap.usecase.GetBitmapSizeUseCase;
import com.kakao.kandinsky.core.kdphoto.KDPhoto;
import com.kakao.kandinsky.designsystem.util.SizeExtensionKt;
import com.kakao.kandinsky.history.KPhotoKey;
import com.kakao.kandinsky.home.contract.HomeMenu;
import com.kakao.kandinsky.launcher.KandinskyMenu;
import e.u;
import f.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlinx.coroutines.BuildersKt;

public final class b extends KDMviViewModel {
    public final l a;
    public final GetBitmapSizeUseCase b;
    public final u c;
    public static final int d;

    public b(l l0, GetBitmapSizeUseCase getBitmapSizeUseCase0, u u0) {
        Intrinsics.checkNotNullParameter(l0, "saveImageUseCase");
        Intrinsics.checkNotNullParameter(getBitmapSizeUseCase0, "getBitmapSizeUseCase");
        Intrinsics.checkNotNullParameter(u0, "historyRepository");
        super(new b0());
        this.a = l0;
        this.b = getBitmapSizeUseCase0;
        this.c = u0;
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new r1(this, null), 3, null);
    }

    @Override  // com.kakao.kandinsky.base.KDMviViewModel
    public final Object handleIntent(Object object0, Object object1) {
        boolean z2;
        boolean z1;
        long v4;
        List list1;
        b0 b00 = (b0)object0;
        p p0 = (p)object1;
        Intrinsics.checkNotNullParameter(b00, "current");
        Intrinsics.checkNotNullParameter(p0, "intent");
        if(p0 instanceof h) {
            boolean z = ((h)p0).a.getAllowGenerateBitmap();
            Map map0 = ((h)p0).a.getSelectedItems();
            int v = ((h)p0).a.getIndex();
            int v1 = map0.size();
            List list0 = ((h)p0).a.getMenu();
            if(list0.isEmpty()) {
                list1 = s1.a;
            }
            else {
                ArrayList arrayList0 = new ArrayList(kotlin.collections.l.collectionSizeOrDefault(list0, 10));
                for(Object object2: list0) {
                    arrayList0.add(HomeMenu.valueOf(((KandinskyMenu)object2).name()));
                }
                list1 = CollectionsKt___CollectionsKt.plus(arrayList0, HomeMenu.Reset);
            }
            if(((h)p0).b) {
                z2 = z;
            }
            else {
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object3: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object3;
                    if(((KPhotoKey)map$Entry0.getValue()) == null) {
                        linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                    }
                }
                List list2 = CollectionsKt___CollectionsKt.toList(linkedHashMap0.keySet());
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new v1(this, list2, null), 3, null);
                ArrayList arrayList1 = new ArrayList(map0.size());
                for(Object object4: map0.entrySet()) {
                    Object object5 = ((Map.Entry)object4).getKey();
                    KPhotoKey kPhotoKey0 = (KPhotoKey)((Map.Entry)object4).getValue();
                    long v2 = SizeExtensionKt.toComposeIntSize(this.b.invoke(((String)object5)));
                    long v3 = SizeExtensionKt.correctionMax-viCIZxY(v2, 3000);
                    if(kPhotoKey0 == null) {
                        z1 = z;
                        long v5 = this.c.b;
                        this.c.b = v5 + 1L;
                        v4 = v5;
                    }
                    else {
                        Long long0 = kPhotoKey0.getId();
                        if(long0 != null) {
                            v4 = (long)long0;
                            z1 = z;
                        }
                    }
                    arrayList1.add(new KDPhoto(v4, 0, ((String)object5), v3, !IntSize.equals-impl0(v2, v3), 0, null, IntSizeKt.toSize-ozmzZPI(v3), null, 0.0f, null, null, null, null, 0x3F62, null));
                    z = z1;
                }
                z2 = z;
                BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new h2(this, arrayList1, null), 3, null);
            }
            y1 y10 = new y1(this);
            z1 z10 = new z1(this);
            a2 a20 = new a2(this);
            b2 b20 = new b2(this);
            c2 c20 = new c2(this);
            d2 d20 = new d2(this);
            e2 e20 = new e2(this, z2);
            f2 f20 = new f2(this);
            return b0.a(b00, s.d, list1, null, y10, false, null, v % v1, z10, a20, b20, c20, d20, e20, f20, 52);
        }
        if(p0 instanceof j) {
            return b0.a(b00, ((j)p0).a, null, null, null, false, null, ((j)p0).b, null, null, null, null, null, null, null, 0x3FBE);
        }
        if(p0 instanceof g) {
            return b0.a(b00, null, null, null, null, false, ((g)p0).a, 0, null, null, null, null, null, null, null, 0x3FDF);
        }
        if(p0 instanceof d) {
            return b0.a(b00, ((d)p0).a, null, null, null, false, null, 0, null, null, null, null, null, null, null, 0x3FFE);
        }
        if(p0 instanceof m) {
            return b0.a(b00, null, null, ((m)p0).a, null, false, null, 0, null, null, null, null, null, null, null, 0x3FFB);
        }
        if(p0 instanceof b.l) {
            return b0.a(b00, null, null, null, null, false, null, ((b.l)p0).a, null, null, null, null, null, null, null, 0x3FBF);
        }
        if(p0 instanceof o) {
            int v6 = 0;
            Iterator iterator3 = b00.f.iterator();
            while(true) {
                if(!iterator3.hasNext()) {
                    v6 = -1;
                    break;
                }
                Object object6 = iterator3.next();
                if(Intrinsics.areEqual(((KDPhoto)object6).getOriginalUri(), ((o)p0).a.getOriginalUri())) {
                    break;
                }
                ++v6;
            }
            if(v6 == -1 || Intrinsics.areEqual(CollectionsKt___CollectionsKt.getOrNull(b00.f, v6), ((o)p0).a)) {
                return b00;
            }
            KDPhoto kDPhoto0 = KDPhoto.copy-2Ycw6ww$default(((o)p0).a, null, ((o)p0).a.getStep() + 1, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, null, 0x3FFD, null);
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new g2(this, kDPhoto0, null), 3, null);
            List list3 = CollectionsKt___CollectionsKt.toMutableList(b00.f);
            list3.set(v6, kDPhoto0);
            return b0.a(b00, null, null, null, null, false, list3, 0, null, null, null, null, null, null, null, 0x3FDF);
        }
        if(p0 instanceof n) {
            LinkedHashMap linkedHashMap1 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(kotlin.collections.l.collectionSizeOrDefault(b00.f, 10)), 16));
            for(Object object7: b00.f) {
                linkedHashMap1.put(((KDPhoto)object7).getOriginalUri(), object7);
            }
            ArrayList arrayList2 = new ArrayList(kotlin.collections.l.collectionSizeOrDefault(((n)p0).a, 10));
            for(Object object8: ((n)p0).a) {
                KDPhoto kDPhoto1 = (KDPhoto)object8;
                if(!Intrinsics.areEqual(linkedHashMap1.get(kDPhoto1.getOriginalUri()), kDPhoto1)) {
                    kDPhoto1 = KDPhoto.copy-2Ycw6ww$default(kDPhoto1, null, kDPhoto1.getStep() + 1, null, 0L, false, 0, null, 0L, null, 0.0f, null, null, null, null, 0x3FFD, null);
                }
                arrayList2.add(kDPhoto1);
            }
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new k2(this, arrayList2, null), 3, null);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(c.coerceAtLeast(w.mapCapacity(kotlin.collections.l.collectionSizeOrDefault(arrayList2, 10)), 16));
            for(Object object9: arrayList2) {
                linkedHashMap2.put(((KDPhoto)object9).getOriginalUri(), object9);
            }
            ArrayList arrayList3 = new ArrayList(kotlin.collections.l.collectionSizeOrDefault(b00.f, 10));
            for(Object object10: b00.f) {
                KDPhoto kDPhoto2 = (KDPhoto)object10;
                KDPhoto kDPhoto3 = (KDPhoto)linkedHashMap2.get(kDPhoto2.getOriginalUri());
                if(kDPhoto3 != null) {
                    kDPhoto2 = kDPhoto3;
                }
                arrayList3.add(kDPhoto2);
            }
            return b0.a(b00, null, null, null, null, false, arrayList3, 0, null, null, null, null, null, null, null, 0x3FDF);
        }
        if(p0 instanceof i) {
            if(b00.o.isEdited()) {
                w1 w10 = new w1(this, b00);
                this.sendEvent(new b.b(new DialogUiState(string.reset_dialog_title, string.reset_dialog_message, w10)));
                return b00;
            }
            return b00;
        }
        if(p0 instanceof e) {
            List list4 = b00.f;
            if(!(list4 instanceof Collection) || !list4.isEmpty()) {
                for(Object object11: list4) {
                    if(((KDPhoto)object11).isEdited()) {
                        this.sendEvent(new b.b(new DialogUiState(0, 0, new x1(this, b00), 3, null)));
                        return b00;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new u1(this, b00.f, null), 3, null);
            this.sendEvent(new a(null));
            return b00;
        }
        if(p0 instanceof k) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new j2(b00.f, this, ((k)p0).a, null), 3, null);
            return b0.a(b00, null, null, null, null, true, null, 0, null, null, null, null, null, null, null, 0x3FEF);
        }
        if(!(p0 instanceof f)) {
            throw new NoWhenBranchMatchedException();
        }
        this.sendEvent(new a(((f)p0).a));
        return b0.a(b00, null, null, null, null, false, null, 0, null, null, null, null, null, null, null, 0x3FEF);
    }
}

