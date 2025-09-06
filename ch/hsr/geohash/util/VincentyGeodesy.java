package ch.hsr.geohash.util;

import ch.hsr.geohash.WGS84Point;

public class VincentyGeodesy {
    public static final double EPSILON = 1.000000E-12;
    public static final double degToRad = 0.017453;

    public static double distanceInMeters(WGS84Point wGS84Point0, WGS84Point wGS84Point1) {
        double f22;
        double f20;
        double f18;
        double f17;
        double f15;
        double f14;
        double f12;
        double f = (wGS84Point1.getLongitude() - wGS84Point0.getLongitude()) * 0.017453;
        double f1 = Math.atan(Math.tan(wGS84Point0.getLatitude() * 0.017453) * 0.996647);
        double f2 = Math.atan(Math.tan(wGS84Point1.getLatitude() * 0.017453) * 0.996647);
        double f3 = Math.sin(f1);
        double f4 = Math.cos(f1);
        double f5 = Math.sin(f2);
        double f6 = Math.cos(f2);
        double f7 = 20.0;
        for(double f8 = f; true; f8 = f21) {
            double f9 = Math.sin(f8);
            double f10 = Math.cos(f8);
            double f11 = f4 * f5 - f3 * f6 * f10;
            f12 = Math.sqrt(f11 * f11 + f6 * f9 * (f6 * f9));
            if(f12 == 0.0) {
                return 0.0;
            }
            double f13 = f4 * f6;
            f14 = f10 * f13 + f3 * f5;
            f15 = Math.atan2(f12, f14);
            double f16 = f13 * f9 / f12;
            f17 = 1.0 - f16 * f16;
            f18 = f14 - f3 * 2.0 * f5 / f17;
            if(Double.isNaN(f18)) {
                f18 = 0.0;
            }
            double f19 = ((4.0 - 3.0 * f17) * 0.003353 + 4.0) * (0.00021 * f17);
            f20 = 2.0 * f18 * f18 - 1.0;
            double f21 = ((f19 * f14 * f20 + f18) * (f19 * f12) + f15) * ((1.0 - f19) * 0.003353 * f16) + f;
            if(Math.abs(f21 - f8) <= 1.000000E-12) {
                f22 = f7;
                break;
            }
            f22 = f7 - 1.0;
            if(f22 <= 0.0) {
                break;
            }
            f7 = f22;
        }
        if(f22 == 0.0) {
            return NaN;
        }
        double f23 = f17 * 272331606681.9453 / 40408299984087.055;
        double f24 = (((74.0 - 47.0 * f23) * f23 - 128.0) * f23 + 256.0) * (f23 / 1024.0);
        return (f15 - ((f14 * f20 - (4.0 * f18 * f18 - 3.0) * ((f12 * 4.0 * f12 - 3.0) * (f24 / 6.0 * f18))) * (f24 / 4.0) + f18) * (f24 * f12)) * (6356752.3142 * ((((320.0 - 175.0 * f23) * f23 - 768.0) * f23 + 4096.0) * (f23 / 16384.0) + 1.0));
    }

    public static WGS84Point moveInDirection(WGS84Point wGS84Point0, double f, double f1) {
        double f2 = 0.0;
        if(f < 0.0 || f > 360.0) {
            throw new IllegalArgumentException("direction must be in (0,360)");
        }
        double f3 = Math.sin(f * 0.017453);
        double f4 = Math.cos(f * 0.017453);
        double f5 = Math.tan(wGS84Point0.getLatitude() * 0.017453);
        double f6 = Math.sqrt(f5 * 0.996647 * (f5 * 0.996647) + 1.0);
        double f7 = f5 * 0.996647 * (1.0 / f6);
        double f8 = Math.atan2(f5 * 0.996647, f4);
        double f9 = 1.0 / f6 * f3;
        double f10 = f9 * f9;
        double f11 = 272331606681.9453 * (1.0 - f10) / 40408299984087.055;
        double f12 = (((74.0 - 47.0 * f11) * f11 - 128.0) * f11 + 256.0) * (f11 / 1024.0);
        double f13 = f1 / (((((320.0 - 175.0 * f11) * f11 - 768.0) * f11 + 4096.0) * (f11 / 16384.0) + 1.0) * 6356752.3142);
        double f14 = 0.0;
        double f15 = f13;
        double f16 = 6.283185;
        double f17 = 0.0;
        while(Double.compare(Math.abs(f15 - f16), 1.000000E-12) > 0) {
            f14 = Math.cos(f8 * 2.0 + f15);
            f2 = Math.sin(f15);
            f17 = Math.cos(f15);
            f16 = f15;
            f15 = (((2.0 * f14 * f14 - 1.0) * f17 - (4.0 * f14 * f14 - 3.0) * ((f2 * 4.0 * f2 - 3.0) * (f12 / 6.0 * f14))) * (f12 / 4.0) + f14) * (f12 * f2) + f13;
        }
        double f18 = f7 * f2;
        double f19 = 1.0 / f6 * f17;
        double f20 = f18 - f19 * f4;
        double f21 = Math.atan2(1.0 / f6 * f2 * f4 + f7 * f17, 0.996647 * Math.sqrt(f20 * f20 + f10));
        double f22 = ((4.0 - (1.0 - f10) * 3.0) * 0.003353 + 4.0) * (0.00021 * (1.0 - f10));
        double f23 = (Math.atan2(f3 * f2, f19 - f18 * f4) - (((2.0 * f14 * f14 - 1.0) * (f22 * f17) + f14) * (f2 * f22) + f15) * ((1.0 - f22) * 0.003353 * f9)) / 0.017453 + wGS84Point0.getLongitude();
        f23 = f23 > 180.0 ? 360.0 - f23 : (Math.atan2(f3 * f2, f19 - f18 * f4) - (((2.0 * f14 * f14 - 1.0) * (f22 * f17) + f14) * (f2 * f22) + f15) * ((1.0 - f22) * 0.003353 * f9)) / 0.017453 + wGS84Point0.getLongitude();
        if(f23 < -180.0) {
            f23 += 360.0;
        }
        return new WGS84Point(f21 / 0.017453, f23);
    }
}

