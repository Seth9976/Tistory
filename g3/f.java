package g3;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.DoNotInline;

public abstract class f {
    @DoNotInline
    public static void a(Location location0) {
        if(!location0.hasBearingAccuracy()) {
            return;
        }
        String s = location0.getProvider();
        long v = location0.getTime();
        long v1 = location0.getElapsedRealtimeNanos();
        double f = location0.getLatitude();
        double f1 = location0.getLongitude();
        boolean z = location0.hasAltitude();
        double f2 = location0.getAltitude();
        boolean z1 = location0.hasSpeed();
        float f3 = location0.getSpeed();
        boolean z2 = location0.hasBearing();
        float f4 = location0.getBearing();
        boolean z3 = location0.hasAccuracy();
        float f5 = location0.getAccuracy();
        boolean z4 = location0.hasVerticalAccuracy();
        float f6 = location0.getVerticalAccuracyMeters();
        boolean z5 = location0.hasSpeedAccuracy();
        float f7 = location0.getSpeedAccuracyMetersPerSecond();
        Bundle bundle0 = location0.getExtras();
        location0.reset();
        location0.setProvider(s);
        location0.setTime(v);
        location0.setElapsedRealtimeNanos(v1);
        location0.setLatitude(f);
        location0.setLongitude(f1);
        if(z) {
            location0.setAltitude(f2);
        }
        if(z1) {
            location0.setSpeed(f3);
        }
        if(z2) {
            location0.setBearing(f4);
        }
        if(z3) {
            location0.setAccuracy(f5);
        }
        if(z4) {
            location0.setVerticalAccuracyMeters(f6);
        }
        if(z5) {
            location0.setBearingAccuracyDegrees(f7);
        }
        if(bundle0 != null) {
            location0.setExtras(bundle0);
        }
    }

    @DoNotInline
    public static void b(Location location0) {
        if(!location0.hasSpeedAccuracy()) {
            return;
        }
        String s = location0.getProvider();
        long v = location0.getTime();
        long v1 = location0.getElapsedRealtimeNanos();
        double f = location0.getLatitude();
        double f1 = location0.getLongitude();
        boolean z = location0.hasAltitude();
        double f2 = location0.getAltitude();
        boolean z1 = location0.hasSpeed();
        float f3 = location0.getSpeed();
        boolean z2 = location0.hasBearing();
        float f4 = location0.getBearing();
        boolean z3 = location0.hasAccuracy();
        float f5 = location0.getAccuracy();
        boolean z4 = location0.hasVerticalAccuracy();
        float f6 = location0.getVerticalAccuracyMeters();
        boolean z5 = location0.hasBearingAccuracy();
        float f7 = location0.getBearingAccuracyDegrees();
        Bundle bundle0 = location0.getExtras();
        location0.reset();
        location0.setProvider(s);
        location0.setTime(v);
        location0.setElapsedRealtimeNanos(v1);
        location0.setLatitude(f);
        location0.setLongitude(f1);
        if(z) {
            location0.setAltitude(f2);
        }
        if(z1) {
            location0.setSpeed(f3);
        }
        if(z2) {
            location0.setBearing(f4);
        }
        if(z3) {
            location0.setAccuracy(f5);
        }
        if(z4) {
            location0.setVerticalAccuracyMeters(f6);
        }
        if(z5) {
            location0.setBearingAccuracyDegrees(f7);
        }
        if(bundle0 != null) {
            location0.setExtras(bundle0);
        }
    }

    @DoNotInline
    public static void c(Location location0) {
        if(!location0.hasVerticalAccuracy()) {
            return;
        }
        String s = location0.getProvider();
        long v = location0.getTime();
        long v1 = location0.getElapsedRealtimeNanos();
        double f = location0.getLatitude();
        double f1 = location0.getLongitude();
        boolean z = location0.hasAltitude();
        double f2 = location0.getAltitude();
        boolean z1 = location0.hasSpeed();
        float f3 = location0.getSpeed();
        boolean z2 = location0.hasBearing();
        float f4 = location0.getBearing();
        boolean z3 = location0.hasAccuracy();
        float f5 = location0.getAccuracy();
        boolean z4 = location0.hasSpeedAccuracy();
        float f6 = location0.getSpeedAccuracyMetersPerSecond();
        boolean z5 = location0.hasBearingAccuracy();
        float f7 = location0.getBearingAccuracyDegrees();
        Bundle bundle0 = location0.getExtras();
        location0.reset();
        location0.setProvider(s);
        location0.setTime(v);
        location0.setElapsedRealtimeNanos(v1);
        location0.setLatitude(f);
        location0.setLongitude(f1);
        if(z) {
            location0.setAltitude(f2);
        }
        if(z1) {
            location0.setSpeed(f3);
        }
        if(z2) {
            location0.setBearing(f4);
        }
        if(z3) {
            location0.setAccuracy(f5);
        }
        if(z4) {
            location0.setSpeedAccuracyMetersPerSecond(f6);
        }
        if(z5) {
            location0.setBearingAccuracyDegrees(f7);
        }
        if(bundle0 != null) {
            location0.setExtras(bundle0);
        }
    }
}

