/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.ide.common.rendering.api;

/**
 * A class containing all the resources needed to do a rendering.
 * <p/>
 * This contains both the project specific resources and the framework resources, and provide
 * convenience methods to resolve resource and theme references.
 */
public class RenderResources {

    public final static String RES_ANIMATOR = "animator";
    public final static String RES_STYLE = "style";
    public final static String RES_ATTR = "attr";
    public final static String RES_DIMEN = "dimen";
    public final static String RES_DRAWABLE = "drawable";
    public final static String RES_COLOR = "color";
    public final static String RES_LAYOUT = "layout";
    public final static String RES_STRING = "string";
    public final static String RES_ID = "id";

    public final static String REFERENCE_NULL = "@null";


    public static class FrameworkResourceIdProvider {
        public Integer getId(String resType, String resName) {
            return null;
        }
    }

    public void setFrameworkResourceIdProvider(FrameworkResourceIdProvider provider) {
    }

    public void setLogger(LayoutLog logger) {
    }

    /**
     * Return the {@link StyleResourceValue} representing the current theme.
     * @return the theme or null if there is no theme.
     */
    public StyleResourceValue getTheme() {
        return null;
    }

    /**
     * Returns a framework resource by type and name. The returned resource is resolved.
     * @param resourceType the type of the resource
     * @param resourceName the name of the resource
     */
    public ResourceValue getFrameworkResource(String resourceType, String resourceName) {
        return null;
    }

    /**
     * Returns a project resource by type and name. The returned resource is resolved.
     * @param resourceType the type of the resource
     * @param resourceName the name of the resource
     */
    public ResourceValue getProjectResource(String resourceType, String resourceName) {
        return null;
    }

    /**
     * Returns the {@link ResourceValue} matching a given name in the current theme. If the
     * item is not directly available in the theme, the method looks in its parent theme.
     *
     * @param itemName the name of the item to search for.
     * @return the {@link ResourceValue} object or <code>null</code>
     */
    public ResourceValue findItemInTheme(String itemName) {
        if (getTheme() != null) {
            return findItemInStyle(getTheme(), itemName);
        }

        return null;
    }

    /**
     * Returns the {@link ResourceValue} matching a given name in a given style. If the
     * item is not directly available in the style, the method looks in its parent style.
     *
     * @param style the style to search in
     * @param itemName the name of the item to search for.
     * @return the {@link ResourceValue} object or <code>null</code>
     */
    public ResourceValue findItemInStyle(StyleResourceValue style, String itemName) {
        return null;
    }

    /**
     * Searches for, and returns a {@link ResourceValue} by its reference.
     * <p/>
     * The reference format can be:
     * <pre>@resType/resName</pre>
     * <pre>@android:resType/resName</pre>
     * <pre>@resType/android:resName</pre>
     * <pre>?resType/resName</pre>
     * <pre>?android:resType/resName</pre>
     * <pre>?resType/android:resName</pre>
     * Any other string format will return <code>null</code>.
     * <p/>
     * The actual format of a reference is <pre>@[namespace:]resType/resName</pre> but this method
     * only support the android namespace.
     *
     * @param reference the resource reference to search for.
     * @param forceFrameworkOnly if true all references are considered to be toward framework
     *      resource even if the reference does not include the android: prefix.
     * @return a {@link ResourceValue} or <code>null</code>.
     */
    public ResourceValue findResValue(String reference, boolean forceFrameworkOnly) {
        return null;
    }

    /**
     * Resolves the value of a resource, if the value references a theme or resource value.
     * <p/>
     * This method ensures that it returns a {@link ResourceValue} object that does not
     * reference another resource.
     * If the resource cannot be resolved, it returns <code>null</code>.
     * <p/>
     * If a value that does not need to be resolved is given, the method will return a new
     * instance of {@link ResourceValue} that contains the input value.
     *
     * @param type the type of the resource
     * @param name the name of the attribute containing this value.
     * @param value the resource value, or reference to resolve
     * @param isFrameworkValue whether the value is a framework value.
     *
     * @return the resolved resource value or <code>null</code> if it failed to resolve it.
     */
    public ResourceValue resolveValue(String type, String name, String value,
            boolean isFrameworkValue) {
        return null;
    }

    /**
     * Returns the {@link ResourceValue} referenced by the value of <var>value</var>.
     * <p/>
     * This method ensures that it returns a {@link ResourceValue} object that does not
     * reference another resource.
     * If the resource cannot be resolved, it returns <code>null</code>.
     * <p/>
     * If a value that does not need to be resolved is given, the method will return the input
     * value.
     *
     * @param value the value containing the reference to resolve.
     * @return a {@link ResourceValue} object or <code>null</code>
     */
    public ResourceValue resolveResValue(ResourceValue value) {
        return null;
    }
}