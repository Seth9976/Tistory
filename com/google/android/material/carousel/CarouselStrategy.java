package com.google.android.material.carousel;

import android.view.View;

public abstract class CarouselStrategy {
    public static int[] a(int[] arr_v) {
        int[] arr_v1 = new int[arr_v.length];
        for(int v = 0; v < arr_v.length; ++v) {
            arr_v1[v] = arr_v[v] * 2;
        }
        return arr_v1;
    }

    public static float b(float f, float f1, float f2) [...] // Inlined contents

    public abstract l c(CarouselLayoutManager arg1, View arg2);

    public boolean d(CarouselLayoutManager carouselLayoutManager0, int v) {
        return false;
    }
}

