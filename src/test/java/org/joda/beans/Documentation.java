/*
 *  Copyright 2001-2010 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.beans;

import org.joda.beans.impl.direct.DirectBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.reflection.ReflectiveMetaBean;

/**
 * Mock JavaBean, used for testing.
 * 
 * @author Stephen Colebourne
 */
public class Documentation<T> extends DirectBean {

    /** The type. */
    @PropertyDefinition
    private String type;
    /** The surname. */
    @PropertyDefinition
    private T content;

    //------------------------- AUTOGENERATED START -------------------------
    /**
     * The meta-property for the {@code type} property.
     */
    private static final MetaProperty<String> TYPE = DirectMetaProperty.ofReadWrite(Documentation.class, "type", String.class);
    /**
     * The meta-property for the {@code content} property.
     */
    @SuppressWarnings("unchecked")
    private static final MetaProperty CONTENT = DirectMetaProperty.ofReadWrite(Documentation.class, "content", Object.class);
    /**
     * The meta-bean for {@code Documentation}.
     */
    private static final MetaBean META = ReflectiveMetaBean.of(Documentation.class);

    //-----------------------------------------------------------------------
    /**
     * The meta-bean for {@code Documentation<T>}.
     */
    public static final MetaBean meta() {
        return META;
    }

    @Override
    public final MetaBean metaBean() {
        return META;
    }

    @Override
    protected Object propertyGet(String propertyName) {
        switch (propertyName.hashCode()) {
            case 3575610:  // type
                return getType();
            case 951530617:  // content
                return getContent();
        }
        return super.propertyGet(propertyName);
    }

    @Override
    @SuppressWarnings("unchecked")
    protected void propertySet(String propertyName, Object newValue) {
        switch (propertyName.hashCode()) {
            case 3575610:  // type
                setType((String) newValue);
                return;
            case 951530617:  // content
                setContent((T) newValue);
                return;
        }
        super.propertySet(propertyName, newValue);
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the type.
     * @return the value of the property
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * @param type  the new value of the property
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the the {@code type} property.
     * @return the property, not null
     */
    public final Property<String> type() {
        return TYPE.createProperty(this);
    }

    /**
     * The meta-property for the {@code type} property.
     */
    public static final MetaProperty<String> typeMeta() {
        return TYPE;
    }

    //-----------------------------------------------------------------------
    /**
     * Gets the surname.
     * @return the value of the property
     */
    public T getContent() {
        return content;
    }

    /**
     * Sets the surname.
     * @param content  the new value of the property
     */
    public void setContent(T content) {
        this.content = content;
    }

    /**
     * Gets the the {@code content} property.
     * @return the property, not null
     */
    public final Property<T> content() {
        return Documentation.<T>contentMeta().createProperty(this);
    }

    /**
     * The meta-property for the {@code content} property.
     */
    @SuppressWarnings("unchecked")
    public static final <R> MetaProperty<R> contentMeta() {
        return (MetaProperty<R>) CONTENT;
    }

    //-------------------------- AUTOGENERATED END --------------------------
}
