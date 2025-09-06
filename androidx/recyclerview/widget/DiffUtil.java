package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class DiffUtil {
    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int arg1, int arg2);

        public abstract boolean areItemsTheSame(int arg1, int arg2);

        @Nullable
        public Object getChangePayload(int v, int v1) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    public static class DiffResult {
        public static final int NO_POSITION = -1;
        public final ArrayList a;
        public final int[] b;
        public final int[] c;
        public final Callback d;
        public final int e;
        public final int f;
        public final boolean g;

        public DiffResult(Callback diffUtil$Callback0, ArrayList arrayList0, int[] arr_v, int[] arr_v1, boolean z) {
            int v9;
            Callback diffUtil$Callback1;
            int[] arr_v3;
            int[] arr_v2;
            this.a = arrayList0;
            this.b = arr_v;
            this.c = arr_v1;
            Arrays.fill(arr_v, 0);
            Arrays.fill(arr_v1, 0);
            this.d = diffUtil$Callback0;
            int v = diffUtil$Callback0.getOldListSize();
            this.e = v;
            int v1 = diffUtil$Callback0.getNewListSize();
            this.f = v1;
            this.g = z;
            v v2 = arrayList0.isEmpty() ? null : ((v)arrayList0.get(0));
            if(v2 == null || v2.a != 0 || v2.b != 0) {
                arrayList0.add(0, new v(0, 0, 0));
            }
            arrayList0.add(new v(v, v1, 0));
            Iterator iterator0 = arrayList0.iterator();
            while(true) {
                boolean z1 = iterator0.hasNext();
                arr_v2 = this.c;
                arr_v3 = this.b;
                diffUtil$Callback1 = this.d;
                if(!z1) {
                    break;
                }
                Object object0 = iterator0.next();
                v v3 = (v)object0;
                for(int v4 = 0; v4 < v3.c; ++v4) {
                    int v5 = v3.a + v4;
                    int v6 = v3.b + v4;
                    int v7 = diffUtil$Callback1.areContentsTheSame(v5, v6) ? 1 : 2;
                    arr_v3[v5] = v6 << 4 | v7;
                    arr_v2[v6] = v5 << 4 | v7;
                }
            }
            if(this.g) {
                int v8 = 0;
                for(Object object1: arrayList0) {
                    while(true) {
                        v9 = ((v)object1).a;
                        if(v8 >= v9) {
                            break;
                        }
                        if(arr_v3[v8] == 0) {
                            int v10 = arrayList0.size();
                            int v11 = 0;
                            int v12 = 0;
                        label_45:
                            while(v11 < v10) {
                                v v13 = (v)arrayList0.get(v11);
                                while(true) {
                                    int v14 = v13.b;
                                    if(v12 < v14) {
                                        if(arr_v2[v12] == 0 && diffUtil$Callback1.areItemsTheSame(v8, v12)) {
                                            int v15 = diffUtil$Callback1.areContentsTheSame(v8, v12) ? 8 : 4;
                                            arr_v3[v8] = v12 << 4 | v15;
                                            arr_v2[v12] = v15 | v8 << 4;
                                            break label_45;
                                        }
                                        ++v12;
                                        continue;
                                    }
                                    v12 = v13.c + v14;
                                    ++v11;
                                    continue label_45;
                                }
                            }
                        }
                        ++v8;
                    }
                    v8 = ((v)object1).c + v9;
                }
            }
        }

        public static w a(ArrayDeque arrayDeque0, int v, boolean z) {
            w w0;
            Iterator iterator0 = arrayDeque0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                w0 = (w)object0;
                if(w0.a != v || w0.c != z) {
                    continue;
                }
                iterator0.remove();
                goto label_8;
            }
            w0 = null;
        label_8:
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                w w1 = (w)object1;
                if(z) {
                    --w1.b;
                }
                else {
                    ++w1.b;
                }
            }
            return w0;
        }

        public int convertNewPositionToOld(@IntRange(from = 0L) int v) {
            int v1 = this.f;
            if(v < 0 || v >= v1) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + v + ", new list size = " + v1);
            }
            int v2 = this.c[v];
            return (v2 & 15) == 0 ? -1 : v2 >> 4;
        }

        public int convertOldPositionToNew(@IntRange(from = 0L) int v) {
            int v1 = this.e;
            if(v < 0 || v >= v1) {
                throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + v + ", old list size = " + v1);
            }
            int v2 = this.b[v];
            return (v2 & 15) == 0 ? -1 : v2 >> 4;
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback0) {
            int v10;
            Callback diffUtil$Callback0;
            BatchingListUpdateCallback batchingListUpdateCallback0 = listUpdateCallback0 instanceof BatchingListUpdateCallback ? ((BatchingListUpdateCallback)listUpdateCallback0) : new BatchingListUpdateCallback(listUpdateCallback0);
            ArrayDeque arrayDeque0 = new ArrayDeque();
            ArrayList arrayList0 = this.a;
            int v = arrayList0.size() - 1;
            int v1 = this.e;
            int v2 = this.f;
            int v3 = v1;
            while(v >= 0) {
                v v4 = (v)arrayList0.get(v);
                int v5 = v4.c;
                int v6 = v4.a + v5;
                int v7 = v4.b;
                while(true) {
                    int[] arr_v = this.b;
                    diffUtil$Callback0 = this.d;
                    if(v3 <= v6) {
                        break;
                    }
                    --v3;
                    int v9 = arr_v[v3];
                    if((v9 & 12) == 0) {
                        v10 = v2;
                        batchingListUpdateCallback0.onRemoved(v3, 1);
                        --v1;
                    }
                    else {
                        w w0 = DiffResult.a(arrayDeque0, v9 >> 4, false);
                        if(w0 == null) {
                            v10 = v2;
                            arrayDeque0.add(new w(v3, v1 - v3 - 1, true));
                        }
                        else {
                            v10 = v2;
                            int v11 = v1 - w0.b - 1;
                            batchingListUpdateCallback0.onMoved(v3, v11);
                            if((v9 & 4) != 0) {
                                batchingListUpdateCallback0.onChanged(v11, 1, diffUtil$Callback0.getChangePayload(v3, v9 >> 4));
                            }
                        }
                    }
                    v2 = v10;
                }
                while(v2 > v7 + v5) {
                    --v2;
                    int v12 = this.c[v2];
                    if((v12 & 12) == 0) {
                        batchingListUpdateCallback0.onInserted(v3, 1);
                        ++v1;
                    }
                    else {
                        w w1 = DiffResult.a(arrayDeque0, v12 >> 4, true);
                        if(w1 == null) {
                            arrayDeque0.add(new w(v2, v1 - v3, false));
                        }
                        else {
                            batchingListUpdateCallback0.onMoved(v1 - w1.b - 1, v3);
                            if((v12 & 4) == 0) {
                                continue;
                            }
                            batchingListUpdateCallback0.onChanged(v3, 1, diffUtil$Callback0.getChangePayload(v12 >> 4, v2));
                        }
                    }
                }
                v3 = v4.a;
                int v13 = v3;
                int v14 = v7;
                for(int v8 = 0; v8 < v5; ++v8) {
                    if((arr_v[v13] & 15) == 2) {
                        batchingListUpdateCallback0.onChanged(v13, 1, diffUtil$Callback0.getChangePayload(v13, v14));
                    }
                    ++v13;
                    ++v14;
                }
                --v;
                v2 = v7;
            }
            batchingListUpdateCallback0.dispatchLastEvent();
        }

        public void dispatchUpdatesTo(@NonNull Adapter recyclerView$Adapter0) {
            this.dispatchUpdatesTo(new AdapterListUpdateCallback(recyclerView$Adapter0));
        }
    }

    public static abstract class ItemCallback {
        public abstract boolean areContentsTheSame(@NonNull Object arg1, @NonNull Object arg2);

        public abstract boolean areItemsTheSame(@NonNull Object arg1, @NonNull Object arg2);

        @Nullable
        public Object getChangePayload(@NonNull Object object0, @NonNull Object object1) [...] // Inlined contents
    }

    public static final c a;

    static {
        DiffUtil.a = new c(2);
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback diffUtil$Callback0) {
        return DiffUtil.calculateDiff(diffUtil$Callback0, true);
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback diffUtil$Callback0, boolean z) {
        ArrayList arrayList6;
        x x4;
        ArrayList arrayList5;
        x x3;
        v v28;
        x x2;
        y y1;
        y y2;
        int v20;
        int v19;
        int v16;
        y y0;
        ArrayList arrayList4;
        ArrayList arrayList3;
        int v12;
        int v11;
        int v10;
        int v = diffUtil$Callback0.getOldListSize();
        int v1 = diffUtil$Callback0.getNewListSize();
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        x x0 = new x();  // 初始化器: Ljava/lang/Object;-><init>()V
        x0.a = 0;
        x0.b = v;
        x0.c = 0;
        x0.d = v1;
        arrayList1.add(x0);
        int v2 = (v + v1 + 1) / 2 * 2 + 1;
        int[] arr_v = new int[v2];
        int[] arr_v1 = new int[v2];
        ArrayList arrayList2 = new ArrayList();
        while(!arrayList1.isEmpty()) {
            x x1 = (x)arrayList1.remove(arrayList1.size() - 1);
            if(x1.b() < 1 || x1.a() < 1) {
            label_119:
                arrayList4 = arrayList2;
                arrayList3 = arrayList1;
                x2 = x1;
                y1 = null;
            }
            else {
                int v3 = (x1.a() + x1.b() + 1) / 2;
                int v4 = 1 + v2 / 2;
                arr_v[v4] = x1.a;
                arr_v1[v4] = x1.b;
                int v5 = 0;
                while(true) {
                    if(v5 >= v3) {
                        goto label_119;
                    }
                    int v6 = Math.abs(x1.b() - x1.a()) % 2 == 1 ? 1 : 0;
                    int v7 = x1.b() - x1.a();
                    int v8 = -v5;
                    int v9 = v8;
                    while(true) {
                        if(v9 > v5) {
                            arrayList4 = arrayList2;
                            arrayList3 = arrayList1;
                            v12 = v3;
                            y0 = null;
                            break;
                        }
                        if(v9 == v8 || v9 != v5 && arr_v[v9 + 1 + v2 / 2] > arr_v[v9 - 1 + v2 / 2]) {
                            v10 = arr_v[v9 + 1 + v2 / 2];
                            v11 = v10;
                        }
                        else {
                            v10 = arr_v[v9 - 1 + v2 / 2];
                            v11 = v10 + 1;
                        }
                        v12 = v3;
                        arrayList3 = arrayList1;
                        int v13 = v11 - x1.a + x1.c - v9;
                        int v14 = v5 == 0 || v11 != v10 ? v13 : v13 - 1;
                        arrayList4 = arrayList2;
                        while(v11 < x1.b && v13 < x1.d && diffUtil$Callback0.areItemsTheSame(v11, v13)) {
                            ++v11;
                            ++v13;
                        }
                        arr_v[v9 + v2 / 2] = v11;
                        if(v6 == 0) {
                        label_56:
                            v16 = 0;
                        }
                        else {
                            int v15 = v7 - v9;
                            if(v15 >= v8 + 1 && v15 <= v5 - 1 && arr_v1[v15 + v2 / 2] <= v11) {
                                y0 = new y();  // 初始化器: Ljava/lang/Object;-><init>()V
                                y0.a = v10;
                                y0.b = v14;
                                y0.c = v11;
                                y0.d = v13;
                                y0.e = false;
                                break;
                            }
                            else {
                                v16 = v6;
                                goto label_57;
                            }
                            goto label_56;
                        }
                    label_57:
                        v9 += 2;
                        v3 = v12;
                        arrayList1 = arrayList3;
                        arrayList2 = arrayList4;
                        v6 = v16;
                    }
                    if(y0 == null) {
                        boolean z1 = (x1.b() - x1.a()) % 2 == 0;
                        int v17 = x1.b() - x1.a();
                        int v18 = v8;
                        while(true) {
                            if(v18 > v5) {
                                x2 = x1;
                                y2 = null;
                                break;
                            }
                            if(v18 == v8 || v18 != v5 && arr_v1[v18 + 1 + v2 / 2] < arr_v1[v18 - 1 + v2 / 2]) {
                                v19 = arr_v1[v18 + 1 + v2 / 2];
                                v20 = v19;
                            }
                            else {
                                v19 = arr_v1[v18 - 1 + v2 / 2];
                                v20 = v19 - 1;
                            }
                            int v21 = x1.d - (x1.b - v20 - v18);
                            int v22 = v5 == 0 || v20 != v19 ? v21 : v21 + 1;
                            while(true) {
                                if(v20 > x1.a && v21 > x1.c) {
                                    x2 = x1;
                                    if(diffUtil$Callback0.areItemsTheSame(v20 - 1, v21 - 1)) {
                                        --v20;
                                        --v21;
                                        x1 = x2;
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }
                                x2 = x1;
                                break;
                            }
                            arr_v1[v18 + v2 / 2] = v20;
                            if(z1) {
                                int v23 = v17 - v18;
                                if(v23 >= v8 && v23 <= v5 && arr_v[v23 + v2 / 2] >= v20) {
                                    y2 = new y();  // 初始化器: Ljava/lang/Object;-><init>()V
                                    y2.a = v20;
                                    y2.b = v21;
                                    y2.c = v19;
                                    y2.d = v22;
                                    y2.e = true;
                                    break;
                                }
                            }
                            v18 += 2;
                            x1 = x2;
                        }
                        if(y2 == null) {
                            ++v5;
                            v3 = v12;
                            arrayList1 = arrayList3;
                            arrayList2 = arrayList4;
                            x1 = x2;
                            continue;
                        }
                        else {
                            y1 = y2;
                        }
                    }
                    else {
                        y1 = y0;
                        x2 = x1;
                    }
                    break;
                }
            }
            if(y1 == null) {
                arrayList6 = arrayList3;
                arrayList5 = arrayList4;
                arrayList5.add(x2);
            }
            else {
                if(y1.a() > 0) {
                    int v24 = y1.b;
                    int v25 = y1.d - v24;
                    int v26 = y1.a;
                    int v27 = y1.c - v26;
                    if(v25 == v27) {
                        v28 = new v(v26, v24, v27);
                    }
                    else if(y1.e) {
                        v28 = new v(v26, v24, y1.a());
                    }
                    else if(v25 > v27) {
                        v28 = new v(v26, v24 + 1, y1.a());
                    }
                    else {
                        v28 = new v(v26 + 1, v24, y1.a());
                    }
                    arrayList0.add(v28);
                }
                if(arrayList4.isEmpty()) {
                    x3 = new x();  // 初始化器: Ljava/lang/Object;-><init>()V
                    arrayList5 = arrayList4;
                }
                else {
                    arrayList5 = arrayList4;
                    x3 = (x)arrayList5.remove(arrayList4.size() - 1);
                }
                x4 = x2;
                x3.a = x4.a;
                x3.c = x4.c;
                x3.b = y1.a;
                x3.d = y1.b;
                arrayList6 = arrayList3;
                arrayList6.add(x3);
                x4.b = x4.b;
                x4.d = x4.d;
                x4.a = y1.c;
                x4.c = y1.d;
                arrayList6.add(x4);
            }
            arrayList2 = arrayList5;
            arrayList1 = arrayList6;
        }
        Collections.sort(arrayList0, DiffUtil.a);
        return new DiffResult(diffUtil$Callback0, arrayList0, arr_v, arr_v1, z);
    }
}

