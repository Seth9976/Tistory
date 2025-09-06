package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import b2.i;
import g.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u001A\'\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00002\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A?\u0010\u0010\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\u00002\u0006\u0010\t\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u00002\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u000EH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "oldSize", "newSize", "Landroidx/compose/ui/node/DiffCallback;", "callback", "", "executeDiff", "(IILandroidx/compose/ui/node/DiffCallback;)V", "startX", "startY", "endX", "endY", "", "reverse", "", "data", "fillSnake", "(IIIIZ[I)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class MyersDiffKt {
    public static final void access$swap(int[] arr_v, int v, int v1) {
        int v2 = arr_v[v];
        arr_v[v] = arr_v[v1];
        arr_v[v1] = v2;
    }

    public static final void executeDiff(int v, int v1, @NotNull DiffCallback diffCallback0) {
        int v43;
        int v36;
        int v32;
        int v31;
        int v26;
        int v25;
        int v24;
        int v23;
        int v28;
        int v27;
        int v18;
        int v17;
        int v2 = (v + v1 + 1) / 2;
        i i0 = new i(v2 * 3);
        i i1 = new i(v2 * 4);
        i1.b(0, v, 0, v1);
        int v3 = v2 * 2 + 1;
        int[] arr_v = new int[v3];
        int[] arr_v1 = new int[v3];
        int[] arr_v2 = new int[5];
        int v4;
        while((v4 = i1.a) != 0) {
            int[] arr_v3 = (int[])i1.b;
            i1.a = v4 - 1;
            int v5 = arr_v3[v4 - 1];
            i1.a = v4 - 2;
            int v6 = arr_v3[v4 - 2];
            i1.a = v4 - 3;
            int v7 = arr_v3[v4 - 3];
            i1.a = v4 - 4;
            int v8 = arr_v3[v4 - 4];
            int v9 = v7 - v8;
            int v10 = v5 - v6;
            if(v9 >= 1 && v10 >= 1) {
                int v11 = (v9 + v10 + 1) / 2;
                int v12 = v3 / 2 + 1;
                arr_v[v12] = v8;
                arr_v1[v12] = v7;
                int v13 = 0;
                while(v13 < v11) {
                    int v14 = v9 - v10;
                    boolean z = Math.abs(v14) % 2 == 1;
                    int v15 = -v13;
                    int v16 = v15;
                    while(v16 <= v13) {
                        if(v16 == v15 || v16 != v13 && arr_v[v16 + 1 + v3 / 2] > arr_v[v16 - 1 + v3 / 2]) {
                            v18 = arr_v[v16 + 1 + v3 / 2];
                            v17 = v18;
                        }
                        else {
                            v17 = arr_v[v16 - 1 + v3 / 2];
                            v18 = v17 + 1;
                        }
                        int v19 = v18 - v8 + v6 - v16;
                        int v20 = v13 == 0 || v18 != v17 ? v19 : v19 - 1;
                        int v21;
                        for(v21 = v19; v18 < v7 && v21 < v5 && diffCallback0.areItemsTheSame(v18, v21); ++v21) {
                            ++v18;
                        }
                        arr_v[v3 / 2 + v16] = v18;
                        if(z) {
                            int v22 = v14 - v16;
                            if(v22 < v15 + 1 || v22 > v13 - 1 || arr_v1[v3 / 2 + v22] > v18) {
                                v27 = v5;
                                v28 = v8;
                                goto label_61;
                            }
                            else {
                                v23 = v8;
                                MyersDiffKt.fillSnake(v17, v20, v18, v21, false, arr_v2);
                                v24 = v5;
                                v25 = v6;
                                v26 = v7;
                                goto label_102;
                            }
                            goto label_59;
                        }
                        else {
                        label_59:
                            v28 = v8;
                            v27 = v5;
                        }
                    label_61:
                        v16 += 2;
                        v8 = v28;
                        v5 = v27;
                    }
                    v23 = v8;
                    int v29 = v5;
                    boolean z1 = v14 % 2 == 0;
                    int v30 = v15;
                label_69:
                    if(v30 > v13) {
                        v5 = v29;
                        ++v13;
                        v8 = v23;
                        continue;
                    }
                    else {
                        if(v30 == v15 || v30 != v13 && arr_v1[v30 + 1 + v3 / 2] < arr_v1[v30 - 1 + v3 / 2]) {
                            v32 = arr_v1[v30 + 1 + v3 / 2];
                            v31 = v32;
                        }
                        else {
                            v31 = arr_v1[v30 - 1 + v3 / 2];
                            v32 = v31 - 1;
                        }
                        int v33 = v29 - (v7 - v32 - v30);
                        int v34 = v13 == 0 || v32 != v31 ? v33 : v33 + 1;
                        v24 = v29;
                        int v35 = v33;
                        while(true) {
                            if(v32 > v23 && v35 > v6) {
                                v36 = v6;
                                v26 = v7;
                                if(diffCallback0.areItemsTheSame(v32 - 1, v35 - 1)) {
                                    --v32;
                                    --v35;
                                    v6 = v36;
                                    v7 = v26;
                                    continue;
                                }
                                else {
                                    break;
                                }
                            }
                            v26 = v7;
                            v36 = v6;
                            break;
                        }
                        arr_v1[v3 / 2 + v30] = v32;
                        if(z1) {
                            int v37 = v14 - v30;
                            if(v37 >= v15 && v37 <= v13 && arr_v[v3 / 2 + v37] >= v32) {
                                v25 = v36;
                                MyersDiffKt.fillSnake(v32, v35, v31, v34, true, arr_v2);
                            label_102:
                                if(b.m(arr_v2) > 0) {
                                    int v38 = arr_v2[1];
                                    int v39 = arr_v2[3] - v38;
                                    int v40 = arr_v2[0];
                                    int v41 = arr_v2[2] - v40;
                                    if(v39 == v41) {
                                        i0.a(v40, v38, v41);
                                    }
                                    else if(arr_v2[4] != 0) {
                                        i0.a(v40, v38, b.m(arr_v2));
                                    }
                                    else if(v39 > v41) {
                                        i0.a(v40, v38 + 1, b.m(arr_v2));
                                    }
                                    else {
                                        i0.a(v40 + 1, v38, b.m(arr_v2));
                                    }
                                }
                                i1.b(v23, arr_v2[0], v25, arr_v2[1]);
                                i1.b(arr_v2[2], v26, arr_v2[3], v24);
                                break;
                            }
                        }
                        v30 += 2;
                        v29 = v24;
                        v7 = v26;
                        v6 = v36;
                        goto label_69;
                    }
                    break;
                }
            }
        }
        int v42 = i0.a;
        if(v42 % 3 != 0) {
            InlineClassHelperKt.throwIllegalStateException("Array size not a multiple of 3");
        }
        if(v42 > 3) {
            v43 = 0;
            i0.c(0, v42 - 3);
        }
        else {
            v43 = 0;
        }
        i0.a(v, v1, 0);
        int v44 = 0;
        int v45 = 0;
        while(v45 < i0.a) {
            int[] arr_v4 = (int[])i0.b;
            int v46 = arr_v4[v45];
            int v47 = arr_v4[v45 + 2];
            int v48 = v46 - v47;
            int v49 = arr_v4[v45 + 1] - v47;
            v45 += 3;
            while(v43 < v48) {
                diffCallback0.remove(v44, v43);
                ++v43;
            }
            while(v44 < v49) {
                diffCallback0.insert(v44);
                ++v44;
            }
            while(v47 > 0) {
                diffCallback0.same(v43, v44);
                ++v43;
                ++v44;
                --v47;
            }
        }
    }

    public static final void fillSnake(int v, int v1, int v2, int v3, boolean z, @NotNull int[] arr_v) {
        arr_v[0] = v;
        arr_v[1] = v1;
        arr_v[2] = v2;
        arr_v[3] = v3;
        arr_v[4] = z;
    }
}

