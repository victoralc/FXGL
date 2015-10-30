/*
 * The MIT License (MIT)
 *
 * FXGL - JavaFX Game Library
 *
 * Copyright (c) 2015 AlmasB (almaslvl@gmail.com)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.almasb.fxgl.util;

import java.util.logging.Logger;

/**
 * Holds FXGL version in x.y.z format, where x - major, y - minor, z - patch versions
 *
 * @author Almas Baimagambetov (AlmasB) (almaslvl@gmail.com)
 */
public final class Version {

    private static final Logger log = FXGLLogger.getLogger("FXGL.Version");

    public static int getMajor() {
        return 0;
    }

    public static int getMinor() {
        return 1;
    }

    public static int getPatch() {
        return 7;
    }

    public static void print() {
        log.info("FXGL-" + getAsString());
        log.info("Source code and latest builds at: https://github.com/AlmasB/FXGL");
    }

    /**
     * @return compile time version of FXGL
     */
    public static String getAsString() {
        return getMajor() + "." + getMinor() + "." + getPatch();
    }

    /**
     * @return compile time version of JavaFX
     */
    public static String getJavaFXAsString() {
        return "8.0.60";
    }

    /**
     * @return compile time version of JBox2D
     */
    public static String getJBox2DAsString() {
        return "2.2.1.1";
    }
}
