package com.bumptech.glide;

import android.widget.ImageView.ScaleType;

public abstract class j {
    public static final int[] a;
    public static final int[] b;

    static {
        int[] arr_v = new int[Priority.values().length];
        j.b = arr_v;
        try {
            arr_v[Priority.LOW.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j.b[Priority.NORMAL.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j.b[Priority.HIGH.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j.b[Priority.IMMEDIATE.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[ImageView.ScaleType.values().length];
        j.a = arr_v1;
        try {
            arr_v1[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j.a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j.a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j.a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j.a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j.a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j.a[ImageView.ScaleType.CENTER.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            j.a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

